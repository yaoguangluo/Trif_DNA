package exception.file.O;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaFileInputStream {

    public static FileInputStream E(String String) {
        try {
            return new FileInputStream(String);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static FileInputStream E(File file) {
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void D(InputStream inputStream) {
        try {
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int I(FileInputStream fileInputStream, byte[] byteArray
            , int INT_ZERO, int BUFFER_RANGE_MAX) {
        try {
            return fileInputStream.read(byteArray, INT_ZERO, BUFFER_RANGE_MAX);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int I(FileInputStream fileInputStream, byte[] byteArray) {
        try {
            return fileInputStream.read(byteArray);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}