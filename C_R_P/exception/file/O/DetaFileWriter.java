package exception.file.O;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaFileWriter {
    public static FileWriter E(File file, boolean type) {
        try {
            return new FileWriter(file, type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void I(FileWriter fileWriter, String string) {
        try {
            fileWriter.write(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void UQ(FileWriter fileWriter) {
        try {
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void D(FileWriter fileWriter) {
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}