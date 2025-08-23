package DVIAQVIMIV;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//import PEU.P.image.ReadWritePng;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class DoDesiphline_17 {
    public String outputFilePath;

    public void setOutputFilePath(String outputPath) {
        outputFilePath = outputPath;
    }

    public void imageDesiphline(String indexFileCategoryPath) {
        //1 输入文件夹字符串
        File file = new File(indexFileCategoryPath);
        doInerFiles(file);
        //2 遍历文件夹下所有图片
        //3 每个图片进行训练取值
        //4 训练值进行记录
    }

    public void doInerFiles(File file) {
        try {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File currentFile : files) {
                    doInerFiles(currentFile);
                }
            } else {
                if (file.isFile() && null != file.getPath()) {
                    String filePath = file.getPath();
                    if (filePath.contains(".jpg") || filePath.contains(".jpeg")
                            || filePath.contains(".png")) {
                        //if(filePath.contains(".png")) {
                        //3 每个图片进行训练取值
                        int[][][] getSkinBy = new GetSkinBy().getSkinBy(filePath);
                        int[][][] doPDEofSkin = new DoPDEofSkin().doPDEofSkin_IDUQ(getSkinBy, 5);
                        //new	ReadWritePng().writePNG("C:/Users/yaogu
                        ///Desktop/project/开源门户/deciphering/F_DB.jpg", doPDEofSkin);
                        double[]  getStatisticCount = new GetStatisticCount()
                                .getStatisticCount(doPDEofSkin, 10, 5, 8);
                        double[]  getStatisticRatio = new GetStatisticRatio()
                                .getStatisticRatio(getStatisticCount);
                        //4 训练值进行记录
                        File fileOut = new File(outputFilePath);
                        //我不建议用数据库, 建议用txt 行操作即可.
                        //以后训练数据比较完善准确了, 再用德塔数据库.
                        FileWriter fileWriter = null;
                        fileWriter = new FileWriter(fileOut, true);
                        fileWriter.write("f>" + file.getName());
                        for (int i = 0; i < getStatisticRatio.length; i++) {
                            fileWriter.write(">d>" + getStatisticRatio[i] * 10000);
                        }
                        fileWriter.write("\r\n");
                        fileWriter.close();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        DoDesiphline_17 doDeciphering = new DoDesiphline_17();
        doDeciphering.setOutputFilePath("C:/Users/yaogu"
                + "/Desktop/project/开源门户/deciphering/F_DB6_17_.txt");
        doDeciphering.imageDesiphline("D:/bu20210606"
                + "/搜索图片/搜索图片/pgSearch");
    }
}
