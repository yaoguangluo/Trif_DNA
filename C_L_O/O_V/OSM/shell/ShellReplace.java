package O_V.OSM.shell;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileInputStream;
import exception.file.O.DetaFileWriter;
import exception.file.O.DetaInputStreamReader;
import S_A.pheromone.IMV_SIQ;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.Iterator;

/*
 * 准备开始设计命令形式 , 再想想就开始设计了。
 *     设:路径:等于:"http://.......";
 *     设:原字符串:等于:"..";
 *     设:替换字符串:等于:"...";
 *     设:日志路径:等于:"...";
 *     确定文件夹:路径:进行搜索
 *     确定日志:路径;  //稍后我会改成shell命令记录, 最后移出去到etl档案保存里去。
 *     将:字符串:替换为:替换;
 *     条件为:文件类型|包含|java;
 *     条件为:文件大小KB|小于|200;
 *     条件为:文件名|包含|哈哈;
 *     条件为:替换|5|行间至|10;
 *    ============================================
 *     我在思考, 设中的变量如果要区分 用\ 那么将有\：\; \| \\ 四种符号区分。
 *     但是我的冯若依曼逻辑流是先区分： 再做slash区分。于是出现问题。怎么解决这个问题。
 *     我想到一种方式, 之后会写一个split 函数 用正则来区分： 和 \：
 *     
 *     作者：罗瑶光
 *     2021/11/22 
 *     最近示例
设:路径:为:C\:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample;
设:变量:为:tin.royal;
确定文件夹:路径:进行搜索;
匹配条件:文件类型:包含:txt;
匹配条件:文件大小KB:小于:200;
匹配条件:文件名:包含:ha;
匹配条件:替换:15:行间至:25;
将:变量:替换为:tin神;

 * */
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */

public class ShellReplace {
    //稍后开始
    //文件替换
    //罗瑶光
    public String searchString;
    public String needReplaceString;
    public String fileType;
    public String fileName;
    public String fileDirectroyPath;
    private String replaceLogPath;
    public long fileSize_KB;
    public long fileLinesBegin;
    public long fileLinesEnd;

    public void replaceString(String fileDirectroyPath, String searchString
            , String needReplaceString) {
        //1 确定文件夹
        //2 文件夹文件遍历,
        //3 全文搜索替换
        this.searchString = searchString;
        this.needReplaceString = needReplaceString;
        this.fileDirectroyPath = fileDirectroyPath;
        start();
    }

    private void doInnerFilesReplace(File file, String searchString
            , String needReplaceString) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File currentFile : files) {
                doInnerFilesReplace(currentFile, searchString, needReplaceString);
            }
        } else {
            if (file.isFile()) {
                if (null != file.getPath()) {
                    //稍后设计文件类型过滤
                    String filePath = file.getPath();
                    String currentFileName = file.getName();
                    if (null != this.fileName && !this.fileName.isEmpty()) {
                        if (!currentFileName.contains(this.fileName)) {
                            return;
                        }
                    }
                    if (null != this.fileType && !this.fileType.isEmpty()) {
                        if (!currentFileName.contains(this.fileType)) {
                            return;
                        }
                    }
                    if (0 != this.fileSize_KB) {
                        //...
                        long currentFileSize = file.length() / 1024;//....
                        if (currentFileSize > this.fileSize_KB) {
                            return;
                        }
                    }
                    if (currentFileName.contains("Backup")) {
                        return;
                    }
                    //开始替换 等会看下是否有 /符号 丢失的问题。
                    File fileOut = new File(filePath + "_replaced");
                    File fileOutBackup = new File(filePath + "_replaceBackup");

                    FileWriter fileWriter = DetaFileWriter.E(fileOut, true);
                    FileWriter fileWriterBackup = DetaFileWriter.E(fileOutBackup, true);

                    InputStream inputStreamb = DetaFileInputStream.E(file);
                    //这里设计读取文件的编码问题, 稍后要设计编码的识别。
                    DetaBufferedReader cReaderb = new DetaBufferedReader(
                            DetaInputStreamReader.E(inputStreamb, "UTF8"));
                    String cInputStringb;
                    //index
                    long beginLines = this.fileLinesBegin;
                    long endLines = this.fileLinesEnd;
                    long count = 0;
                    while ((cInputStringb = cReaderb.readDetaLine()) != null) {
                        if (count >= beginLines) {
                            if (0 == endLines || count <= endLines) {
                                //备份。稍后回滚直接替换回去就可以了, 没必要搞成数据的logbin 那么麻烦。
                                DetaFileWriter.I(fileWriterBackup, cInputStringb);
                                DetaFileWriter.I(fileWriterBackup, "\r\n");
                                DetaFileWriter.UQ(fileWriterBackup);
                                //稍后设计行长度设计。, 这里会出现一种问题, 就是行的边
                                //和下一行起始为一个 searchString, 造成替换逃逸。
                                cInputStringb = cInputStringb.replace(searchString, needReplaceString);
                                DetaFileWriter.I(fileWriter, cInputStringb);
                                DetaFileWriter.I(fileWriter, "\r\n");
                                DetaFileWriter.UQ(fileWriter);
                            } else {
                                //非替换部分进行复制
                                DetaFileWriter.I(fileWriter, cInputStringb);
                                DetaFileWriter.I(fileWriter, "\r\n");
                                DetaFileWriter.UQ(fileWriter);
                            }
                        } else {
                            //非替换部分进行复制
                            DetaFileWriter.I(fileWriter, cInputStringb);
                            DetaFileWriter.I(fileWriter, "\r\n");
                            DetaFileWriter.UQ(fileWriter);
                        }
                        count++;
                    }
                    DetaFileWriter.D(fileWriterBackup);
                    DetaFileWriter.D(fileWriter);
                    cReaderb.closeDeta();
                    DetaFileInputStream.D(inputStreamb);
                    //等会测试后成功就替换掉之前需要搜索替换的文件
                    //...file.delete();
                    file.delete();
                    if (!file.exists()) {
                        if (fileOut.renameTo(new File(filePath))) {
                            //20230106-System.out.println("succcess");
                        } else {
                            //20230106-System.out.println("unsucccess");
                        }
                    }
                    //...fileOut.changeFileName(filePath+ file.getName());
                    //然后记录操作。成为日志文件

                    //...replaceLog(...);
                    //我在思考记录这些操作的日志文件储存在哪。
                }
            }
        }
    }

    //稍后设计成map来存储这些String条件变量。
    public void replaceStringWithFileName(String fileDirectroyPath, String searchString
            , IMV_SIQ conditions) {
        this.fileType = conditions.getString("fileType");
        this.fileName = conditions.getString("fileName");
        this.fileSize_KB = Long.valueOf(conditions.getString("filesize_KB"));
        this.fileLinesBegin = Long.valueOf(conditions.getString("beginLine"));
        this.fileLinesEnd = Long.valueOf(conditions.getString("endLine"));
        this.searchString = conditions.getString("searchString");
        this.needReplaceString = conditions.getString("needReplaceString");
        this.fileDirectroyPath = conditions.getString("fileDirectroyPath");
        //稍后对下面去重。
        start();
    }

    //稍后变线程
    public void start() {
        File file = new File(fileDirectroyPath);
        if (file.isFile()) {
            fileDirectroyPath = file.getPath();
        }
        File fileDirectroy = new File(fileDirectroyPath);
        if (fileDirectroy.isDirectory()) {
            File[] files = file.listFiles();
            for (File currentFile : files) {
                doInnerFilesReplace(currentFile, searchString, needReplaceString);
            }
        }
    }

    //文件名对应筛选
    public void replaceStringWithFileName(String fileDirectroyPath, String searchString
            , String needReplaceString, String fileName) {
        //1 确定文件夹
        //2 文件夹文件遍历, 相关文件名
        //3 全文搜索替换
        this.fileName = fileName;
        this.searchString = searchString;
        this.needReplaceString = needReplaceString;
        this.fileDirectroyPath = fileDirectroyPath;
        start();
    }

    //文件后缀筛选
    public void replaceStringWithFileType(String fileDirectroyPath, String searchString
            , String needReplaceString, String fileType) {
        //1 确定文件夹
        //2 文件夹文件遍历, 相关文件类型后缀对应
        //3 全文搜索替换
        this.fileType = fileType;
        this.searchString = searchString;
        this.needReplaceString = needReplaceString;
        this.fileDirectroyPath = fileDirectroyPath;
        start();
    }

    //文件大小筛选
    public void replaceStringWithFileSize(String fileDirectroyPath, String searchString
            , String needReplaceString, long filesize_KB) {
        //1 确定文件夹
        //2 文件夹文件遍历, 相关文件大小
        //3 全文搜索替换
        this.fileSize_KB = filesize_KB;
        this.searchString = searchString;
        this.needReplaceString = needReplaceString;
        this.fileDirectroyPath = fileDirectroyPath;
        start();
    }

    //文件大小筛选
    public void replaceStringWithFileLines(String fileDirectroyPath, String searchString
            , String needReplaceString, long beginLine, long endLine) {
        //1 确定文件夹
        //2 文件夹文件遍历, 搜索对应的行间
        //3 全文搜索替换
        this.fileLinesBegin = beginLine;
        this.fileLinesEnd = endLine;
        this.searchString = searchString;
        this.needReplaceString = needReplaceString;
        this.fileDirectroyPath = fileDirectroyPath;
        start();
    }

    public static void main(String[] argv) {
        //new ShellReplace().replaceString("C:\\Users\\Lenovo\\Desktop
        //\\DNA_RNA\\2021\\repalceSample", ">_<", "..>_<..");
        IMV_SIQ conditions = new IMV_SIQ();
        conditions.put("fileType", "");
        conditions.put("fileName", "");
        conditions.put("filesize_KB", "");
        conditions.put("beginLine", "");
        conditions.put("endLine", "");
        conditions.put("searchString", "socnsocn");
        conditions.put("needReplaceString", "xixi。");
        conditions.put("fileDirectroyPath"
                , "C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample");
        conditions.put("replaceLogPath"
                , "C:\\Users\\Lenovo\\Desktop\\DNA_RNA\\2021\\repalceSample\\replace_Log.lyg");
        ShellReplace shellReplace = new ShellReplace();
        shellReplace.replaceStringWithLogRecording(conditions);

        //稍后写rollback
        //思考了下改成最简单的策略。
        //替换回来非常轻松了。直接将backup文件替换即可。
        shellReplace.rollbackWithRecordingLog(conditions);
    }

    private void rollbackWithRecordingLog(IMV_SIQ conditions) {
        File file = new File(fileDirectroyPath);
        if (file.isFile()) {
            fileDirectroyPath = file.getPath();
        }
        File fileDirectroy = new File(fileDirectroyPath);
        if (fileDirectroy.isDirectory()) {
            File[] files = file.listFiles();
            for (File currentFile : files) {
                doInnerFilesReplaceBackup(currentFile, searchString, needReplaceString);
            }
        }
    }

    private void doInnerFilesReplaceBackup(File file
            , String searchString, String needReplaceString) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File currentFile : files) {
                doInnerFilesReplaceBackup(currentFile, searchString, needReplaceString);
            }
        } else {
            if (file.isFile()) {
                if (null != file.getPath()) {
                    //稍后设计文件类型过滤
                    String filePath = file.getPath();
                    String currentFileName = file.getName();
                    if (null != this.fileName && !this.fileName.isEmpty()) {
                        if (currentFileName.contains(this.fileName)) {
                            return;
                        }
                    }
                    if (null != this.fileType && !this.fileType.isEmpty()) {
                        if (currentFileName.contains(this.fileType)) {
                            return;
                        }
                    }
                    if (0 != this.fileSize_KB) {
                        long currentFileSize = file.length() / 1024;//....
                        if (currentFileSize > this.fileSize_KB) {
                            return;
                        }
                    }
                    if (currentFileName.contains("Backup")) {//文件原备份不参与回滚
                        return;
                    }
                    //开始替换 等会看下是否有 /符号 丢失的问题。
                    File fileOutBackup = new File(filePath + "_replaceBackup");
                    file.delete();
                    if (!file.exists()) {
                        if (fileOutBackup.renameTo(new File(filePath))) {
                            //20230106-System.out.println("succcess");
                        } else {
                            //20230106-System.out.println("unsucccess");
                        }
                    }
                }
            }
        }
    }

    //设计一种简单的log模式先。
    public void replaceStringWithLogRecording(IMV_SIQ conditions) {
        //记录
        //稍后对下面去重。
        this.replaceLogPath = conditions.getString("replaceLogPath");
        File fileOut = new File(this.replaceLogPath);
        FileWriter fileWriter = DetaFileWriter.E(fileOut, true);
        //index
        Iterator<String> iterator = conditions.keySet().iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            String writeString = string + "-->" + conditions.get(string);
            //20230106-System.out.println(writeString);
            DetaFileWriter.I(fileWriter, writeString);
            DetaFileWriter.I(fileWriter, "\r\n");
            DetaFileWriter.UQ(fileWriter);
        }
        DetaFileWriter.D(fileWriter);
        //fileWriter.write("################记录################");
        //没必要这么复杂, 不然还不如做个数据替换binlog。
        //替换
        this.fileType = conditions.getString("fileType");
        this.fileName = conditions.getString("fileName");
        this.fileSize_KB = Long.valueOf(conditions.getString("filesize_KB").isEmpty()
                ? "0" : conditions.getString("filesize_KB"));
        this.fileLinesBegin = Long.valueOf(conditions.getString("beginLine").isEmpty()
                ? "0" : conditions.getString("beginLine"));
        this.fileLinesEnd = Long.valueOf(conditions.getString("endLine").isEmpty()
                ? "0" : conditions.getString("endLine"));
        this.searchString = conditions.getString("searchString");
        this.needReplaceString = conditions.getString("needReplaceString");
        this.fileDirectroyPath = conditions.getString("fileDirectroyPath");
        start();
    }
}
