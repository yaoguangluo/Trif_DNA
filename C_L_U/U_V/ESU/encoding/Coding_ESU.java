package U_V.ESU.encoding;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import exception.thread.DetaThread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//
// 确定一个文件夹子, 循环递归便利将里面的 java文件 进行 utf8 保存
// 稍后并到德塔 data swap 工程 
// 作者 罗瑶光

//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Coding_ESU {
    public static void main(String[] argv) {
        String category = new String("C:/Users/yaogu/Desktop/project/开源门户/HRJ_YLJ_18111");
        String decoding = "UTF8";//解码读档
        String encoding = "UTF8";//新文件编码
        String fileTail = ".java";
        String target = "Swapped";
        //String targetType= "addTail";//addTail, deleteTail
        Coding_ESU codingSwap = new Coding_ESU();
        codingSwap.codingSwap(category, decoding, encoding, fileTail, target, "addTail");
        DetaThread.sleepDeta(1000);
        codingSwap.codingSwap(category, decoding, encoding, fileTail, target, "deleteTail");
    }

    private void codingSwap(String category, String decoding, String encoding
            , String fileTail, String target, String targetType) {
        File file = new File(category);
        if (file.isDirectory()) {
            doInnerSwap(file, decoding, encoding, fileTail, target, targetType);
        }
        if (targetType.contains("addTail")) {
            doCodingSwapAddTail(file, decoding, encoding, fileTail, target, targetType);
        }
        if (targetType.contains("deleteTail")) {
            doCodingSwapDeleteTail(file, decoding, decoding, fileTail, target, targetType);
        }
    }

    private void doCodingSwapDeleteTail(File file, String decoding, String encoding
            , String fileTail, String target, String targetType) {
        String string = file.getAbsolutePath();
        String stringPath = file.getPath();
        if (!string.contains(fileTail)) {
            return;
        }
        if (!string.contains(target)) {
            return;
        }
        //delete original file
        File nameTofile = new File(stringPath.replace(target, ""));
        if (nameTofile.exists()) {
            nameTofile.delete();
            //20230106-System.out.println("deleted:"+ string);
        }
        DetaThread.sleepDeta(2);
        if (!nameTofile.exists()) {
            file.renameTo(nameTofile);
        }
        //delete target file
    }

    private void doCodingSwapAddTail(File file, String decoding, String encoding
            , String fileTail, String target, String targetType) {
        String string = file.getAbsolutePath();
        //20230106-System.out.println(string);
        if (!string.contains(fileTail)) {
            return;
        }
        if (string.contains(target)) {
            return;
        }
        try {
            //read UTF8
            InputStream inputStream = new FileInputStream(file);
            DetaBufferedReader DetaBufferedReader = new DetaBufferedReader(DetaInputStreamReader.E
                    (inputStream, decoding));
            //save as UTF8
            OutputStream outputStream = new FileOutputStream(file.getPath() + target);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter
                    (outputStream, encoding));
            String stringLine;
            while ((stringLine = DetaBufferedReader.readDetaLine()) != null) {
                bufferedWriter.write(stringLine);
                bufferedWriter.write("\r\n");
                DetaThread.sleepDeta(1);
            }
            bufferedWriter.close();
            DetaBufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void doInnerSwap(File file, String decoding, String encoding
            , String fileTail, String target, String targetType) {
        String[] fileStrings = file.list();
        for (String fileString : fileStrings) {
            File fileOfFileString = new File(file.getPath() + "/" + fileString);
            if (fileOfFileString.isDirectory()) {
                doInnerSwap(fileOfFileString, decoding, encoding, fileTail
                        , target, targetType);
            }
            if (targetType.contains("addTail")) {
                doCodingSwapAddTail(fileOfFileString, decoding, encoding, fileTail
                        , target, targetType);
            }
            if (targetType.contains("deleteTail")) {
                doCodingSwapDeleteTail(fileOfFileString, encoding, encoding, fileTail
                        , target, targetType);
            }
        }
    }
}
//
