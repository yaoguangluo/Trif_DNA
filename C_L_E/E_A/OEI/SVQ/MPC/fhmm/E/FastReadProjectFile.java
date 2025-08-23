package E_A.OEI.SVQ.MPC.fhmm.E;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import YLJ_HRJ.ME.VPC.S.books.BookIndex;

import javax.swing.ImageIcon;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class FastReadProjectFile {

    public static URL getDetaURLReader(String string, String afterProjectMiddlePath) {
        try {
            File file = new File(string);
            String stringPath = file.getCanonicalPath().replace(file.getPath()
                , afterProjectMiddlePath + file.getPath());
            return new URL(stringPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ImageIcon getDetaImageIconReader(String string
        , String afterProjectMiddlePath) {
        try {
            File file = new File(string);
            String stringPath = file.getCanonicalPath().replace(file.getPath()
                , afterProjectMiddlePath + file.getPath());
            return new ImageIcon(stringPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static DetaBufferedReader getDetaBufferedReader(String string
        , String afterProjectMiddlePath, String charset) {
        File file = new File(string);
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file.getCanonicalPath().replace(
                file.getPath(), afterProjectMiddlePath + file.getPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        DetaBufferedReader cReader = null;
        cReader = new DetaBufferedReader(DetaInputStreamReader.E(inputStream
            , charset));
        return cReader;
    }

    public static DetaBufferedReader getDetaBufferedReader(File file
        , String afterProjectMiddlePath, String charset) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file.getCanonicalPath().replace(
                file.getPath(), afterProjectMiddlePath + file.getPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        DetaBufferedReader cReader = null;
        cReader = new DetaBufferedReader(DetaInputStreamReader.E(inputStream, charset));
        return cReader;
    }

    public static DetaBufferedReader getDetaBookDetaBufferedReader(String booktxt
        , String charset) {
        InputStream in = new BookIndex().BookIndex(booktxt);
        DetaBufferedReader cReader = null;
        cReader = new DetaBufferedReader(DetaInputStreamReader.E(in, charset));
        return cReader;
    }

    public static void close() {
        //shaohou sikao static is zenme close
    }
}