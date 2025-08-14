package U_A.PEU.P.zip;

import U_A.PEU.P.cache.Cache_M;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * uncheck and untest
 *
 * @author https://wenda.so.com/q/1512966734215123 gets
 * @author aczjc refer
 * @fix yaoguangluo 2019-1-31
 */
/*
 * 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class BootBackup {
    private BootBackup() {
    }
    public static void bootBackupByUsingGzip(String zipPath) {
        String sourceFilePath = Cache_M.getCacheInfo("DBPath").getValue().toString();
        String zipFilePath = zipPath;
        long time = System.currentTimeMillis();
        String fileName = "zip_" + time;
        boolean flag = BootBackup.fileToZip(sourceFilePath, zipFilePath, fileName);
        if (flag) {
            //20230106-System.out.println("文件打包成功!");
        } else {
            //20230106-System.out.println("文件打包失败!");
        }
        //delete all binlog file;
    }
    //sourceFilePath is a root category of 待压缩的文件目录
    //zipFilePath is a zip category of 压缩的文件目录到
    //fileName is a zip file name
    public static boolean fileToZip(String sourceFilePath, String zipFilePath
            , String fileName) {
        boolean flag = false;
        File sourceFile = new File(sourceFilePath);
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        FileOutputStream fileOutputStream = null;
        ZipOutputStream zipOutputStream = null;
        if (!sourceFile.exists()) {
            //20230106-System.out.println("待压缩的文件目录："+ sourceFilePath+ "不存在.");
        } else {
            try {
                File zipFile = new File(zipFilePath + "/" + fileName + ".zip");
                if (zipFile.exists()) {
                    //20230106-System.out.println(zipFilePath+ "目录下存在名字为:"+ fileName+ ".zip"
                    //+ "打包文件.");
                } else {
                    File[] sourceFiles = sourceFile.listFiles();
                    if (null == sourceFiles || sourceFiles.length < 1) {
                        //20230106-System.out.println("待压缩的文件目录：" + sourceFilePath
                        //		+ "里面不存在文件, 无需压缩.");
                    } else {
                        File zipFileCate = new File(zipFilePath);
                        zipFileCate.mkdirs();
                        fileOutputStream = new FileOutputStream(zipFile);
                        zipOutputStream
                                = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
                        //ZipEntry zipEntry= new ZipEntry(sourceFiles);
                        //zipOutputStream.putNextEntry(zipEntry);
                        byte[] bufs = new byte[1024 * 10];
                        for (int i = 0; i < sourceFiles.length; i++) {
                            //创建ZIP实体, 并添加进压缩包
                            //读取待压缩的文件并写进压缩包里
                            if (sourceFiles[i].isDirectory()) {
                                ZipEntry zipEntry = new ZipEntry(sourceFiles[i].getPath());
                                zipOutputStream.putNextEntry(zipEntry);
                                nestFile(sourceFiles[i], zipOutputStream);
                            } else if (sourceFiles[i].isFile()) {
                                ZipEntry zipEntry = new ZipEntry(sourceFiles[i].getPath());
                                zipOutputStream.putNextEntry(zipEntry);
                                fileInputStream = new FileInputStream(sourceFiles[i]);
                                bufferedInputStream
                                        = new BufferedInputStream(fileInputStream, 1024 * 10);
                                int read = 0;
                                while ((read = bufferedInputStream.read(bufs, 0, 1024 * 10)) != -1) {
                                    zipOutputStream.write(bufs, 0, read);
                                }
                            }
                        }
                        flag = true;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            } finally {
                try {
                    if (null != bufferedInputStream) bufferedInputStream.close();
                    if (null != zipOutputStream) zipOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            }
        }
        return flag;
    }

    private static void nestFile(File sourceFiles, ZipOutputStream zipOutputStream) {
        try {
            File[] listFiles = sourceFiles.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                //			ZipEntry zipEntry= new ZipEntry(listFiles[i].getName());
                //			zipOutputStream.putNextEntry(zipEntry);
                //读取待压缩的文件并写进压缩包里
                if (listFiles[i].isDirectory()) {
                    ZipEntry zipEntry = new ZipEntry(listFiles[i].getPath());
                    zipOutputStream.putNextEntry(zipEntry);
                    nestFile(listFiles[i], zipOutputStream);
                } else if (listFiles[i].isFile()) {
                    ZipEntry zipEntry = new ZipEntry(listFiles[i].getPath());
                    zipOutputStream.putNextEntry(zipEntry);
                    FileInputStream fileInputStream = new FileInputStream(listFiles[i]);
                    BufferedInputStream bufferedInputStream
                            = new BufferedInputStream(fileInputStream, 1024 * 10);
                    int read = 0;
                    byte[] bufs = new byte[1024 * 10];
                    while ((read = bufferedInputStream.read(bufs, 0, 1024 * 10)) != -1) {
                        zipOutputStream.write(bufs, 0, read);
                    }
                    bufferedInputStream.close();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
