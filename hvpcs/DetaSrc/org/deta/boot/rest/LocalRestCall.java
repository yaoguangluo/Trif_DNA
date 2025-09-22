package DetaSrc.org.deta.boot.rest;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.Map;

import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;
import DetaSrc.org.html5.upload.FileUploaderSimple;
import DetaSrc.org.html5.upload.FileUploaderSimpleDNA;
import DetaSrc.org.html5.upload.FileUploaderSimpleSocket;
import DetaSrc.org.html5.upload.FileUploaderSimpleSocketPDE;
import DetaSrc.org.html5.upload.FileUploaderSimpleSocketSound;
import DetaSrc.org.html5.upload.FileUploaderSimpleSocketSoundImage;

//import org.html5.upload.FileUploaderSimpleSocketSoundImageMpeg;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class LocalRestCall {
    public static void doDataSB(String[] stringInputs
        , VPCSResponse vPCSResponse, VPCSRequest vPCSRequest
        , String stringInput, String mess, InputStream inputStream
        , byte[] bytes) throws IOException, InterruptedException {
        for (String contentLength : stringInputs) {
            if (contentLength.contains("Content-Length")) {
                String[] strings = contentLength.split(":");
                if (Long.valueOf(strings[1].replace(" ", "")) > 9999999) {
                    vPCSResponse.returnCode(200);
                    return;
                }
            }
        }//checkstatus
        System.out.flush();
        System.out.println("mess-" + mess);
        if (stringInput.contains(".png") || stringInput.contains(".jpeg")
            || stringInput.contains("JFIF") || stringInput.contains(".jpg")) {
            System.out.flush();
            System.out.println(2);
            //Thread.sleep(15);
            FileUploaderSimpleSocket.processForm(inputStream, bytes
                , ".jpg", vPCSRequest, vPCSResponse, stringInput);
        } else {
            vPCSResponse.returnCode(200);
            inputStream.close();
            return;
        }
        inputStream.close();
    }

    public static void doDataYL(String[] stringInputs
        , VPCSResponse vPCSResponse, VPCSRequest vPCSRequest
        , String stringInput, String mess, InputStream inputStream
        , byte[] bytes, int length, Map<String, String> data)
        throws IOException, InterruptedException {
        byte[] bytesNext = new byte[1600];
        if (length == 1600) {
            length = inputStream.read(bytesNext);
            String stringInputNext = new String(bytesNext);
            String[] stringInputsFull = (stringInput + stringInputNext).split("\r\n");
            for (String string : stringInputsFull) {
                if (string.contains("email=") && string.contains("token=")) {
                    String[] stringsEmail = string.split("email=");
                    String[] stringsEmailStop = stringsEmail[1].split(";");
                    data.put("email", URLDecoder.decode(stringsEmailStop[0], "UTF-8"));
                    String[] stringsToken = string.split("token=");
                    data.put("token", URLDecoder.decode(stringsToken[1], "UTF-8"));
                }
            }
        } else {
            String[] stringInputsFull = (stringInput).split("\r\n");
            for (String string : stringInputsFull) {
                if (string.contains("email=") && string.contains("token=")) {
                    String[] stringsEmail = string.split("email=");
                    String[] stringsEmailStop = stringsEmail[1].split(";");
                    data.put("email", URLDecoder.decode(stringsEmailStop[0], "UTF-8"));
                    String[] stringsToken = string.split("token=");
                    data.put("token", URLDecoder.decode(stringsToken[1], "UTF-8"));
                }
            }
        }
    }

    public static void doDataZT(String[] stringInputs
        , VPCSResponse vPCSResponse, VPCSRequest vPCSRequest
        , String stringInput, String mess, InputStream inputStream
        , byte[] bytes) throws IOException, InterruptedException {
        //ͨ�� �ʹ洢�ļ��Ͳ��� //�Ժ�ȥ��
        for (String contentLength : stringInputs) {
            if (contentLength.contains("Content-Length")) {
                String[] strings = contentLength.split(":");
                if (Long.valueOf(strings[1].replace(" ", "")) > 9999999) {
                    vPCSResponse.returnCode(200);
                    return;
                }
            }
        }
        System.out.flush();
        System.out.println("mess1-" + mess);
        if (stringInput.contains(".wav")) {
            System.out.flush();
            System.out.println(2);
            //Thread.sleep(15);
            FileUploaderSimpleSocketSoundImage.processForm(inputStream
                , bytes, ".wav", vPCSRequest, vPCSResponse, stringInput);
            return;
        } else if (stringInput.contains(".mp3")) {
            System.out.flush();
            System.out.println(2);
            //Thread.sleep(15);//later
            //FileUploaderSimpleSocketSoundImageMpeg.processForm(inputStream
            //		, bytes, ".mp3", vPCSRequest, vPCSResponse, stringInput);
            return;
        } else {
            vPCSResponse.returnCode(200);
            return;
        }
    }

    public static void doDataPDE(String[] stringInputs
        , VPCSResponse vPCSResponse, VPCSRequest vPCSRequest
        , String stringInput, String mess, InputStream inputStream
        , byte[] bytes) throws IOException, InterruptedException {
        //ͨ�� �ʹ洢�ļ��Ͳ���
        //�Ժ�ȥ��
        for (String contentLength : stringInputs) {
            if (contentLength.contains("Content-Length")) {
                String[] strings = contentLength.split(":");
                if (Long.valueOf(strings[1].replace(" ", "")) > 9999999) {
                    vPCSResponse.returnCode(200);
                    return;
                }
            }
        }
        //checkstatus
        System.out.flush();
        System.out.println("mess-2" + mess);
        if (stringInput.contains(".png") || stringInput.contains(".jpeg")
            || stringInput.contains("JFIF") || stringInput.contains(".jpg")) {
            System.out.flush();
            System.out.println(2);
            //Thread.sleep(15);
            FileUploaderSimpleSocketPDE.processForm(inputStream, bytes
                , ".jpg", vPCSRequest, vPCSResponse, stringInput);
            inputStream.close();
            return;
        } else {
            vPCSResponse.returnCode(200);
            inputStream.close();
            return;
        }
    }

    public static void doDataTC(String[] stringInputs
        , VPCSResponse vPCSResponse, VPCSRequest vPCSRequest
        , String stringInput, String mess, InputStream inputStream
        , byte[] bytes) throws IOException, InterruptedException {
        //ͨ�� �ʹ洢�ļ��Ͳ���
        //�Ժ�ȥ��
        for (String contentLength : stringInputs) {
            if (contentLength.contains("Content-Length")) {
                String[] strings = contentLength.split(":");
                if (Long.valueOf(strings[1].replace(" ", "")) > 9999999) {
                    vPCSResponse.returnCode(200);
                    return;
                }
            }
        }
        System.out.flush();
        System.out.println("mess-3" + mess);
        if (stringInput.contains(".png") || stringInput.contains(".jpeg")
            || stringInput.contains("JFIF") || stringInput.contains(".jpg")) {
            System.out.flush();
            System.out.println(2);
            //Thread.sleep(15);
            FileUploaderSimple.processForm(inputStream, bytes
                , ".jpg", vPCSRequest, vPCSResponse);
        } else {
            vPCSResponse.returnCode(200);
            return;
        }
    }

    public static void doDataSC(String[] stringInputs
        , VPCSResponse vPCSResponse, VPCSRequest vPCSRequest
        , String stringInput, String mess, InputStream inputStream
        , byte[] bytes) throws IOException, InterruptedException {
        //ͨ�� �ʹ洢�ļ��Ͳ��� //�Ժ�ȥ��
        for (String contentLength : stringInputs) {
            if (contentLength.contains("Content-Length")) {
                String[] strings = contentLength.split(":");
                if (Long.valueOf(strings[1].replace(" ", "")) > 9999999) {
                    vPCSResponse.returnCode(200);
                    return;
                }
            }
        }
        System.out.flush();
        System.out.println("mess-4" + mess);
        if (stringInput.contains(".png") || stringInput.contains(".jpeg")
            || stringInput.contains("JFIF") || stringInput.contains(".jpg")) {
            System.out.flush();
            System.out.println(2);
            //Thread.sleep(15);
            FileUploaderSimpleDNA.processForm(inputStream, bytes
                , ".jpg", vPCSRequest, vPCSResponse);
            return;
        } else {
            vPCSResponse.returnCode(200);
            return;
        }
    }

    public static void doDataSY(String[] stringInputs
        , VPCSResponse vPCSResponse, VPCSRequest vPCSRequest
        , String stringInput, String mess, InputStream inputStream
        , byte[] bytes) throws IOException, InterruptedException {
        //ͨ�� �ʹ洢�ļ��Ͳ��� //�Ժ�ȥ��
        for (String contentLength : stringInputs) {
            if (contentLength.contains("Content-Length")) {
                String[] strings = contentLength.split(":");
                if (Long.valueOf(strings[1].replace(" ", "")) > 9999999) {
                    vPCSResponse.returnCode(200);
                    return;
                }
            }
        }
        System.out.flush();
        System.out.println("mess-5" + mess);
        if (stringInput.contains(".wav")) {
            System.out.flush();
            System.out.println(2);
            //Thread.sleep(15);
            FileUploaderSimpleSocketSound.processForm(inputStream, bytes
                , ".wav", vPCSRequest, vPCSResponse, stringInput);
            return;
        } else {
            vPCSResponse.returnCode(200);
            return;
        }
    }
}
