package C_A.OSI.AOP.MS.VPC.server;
import exception.thread.DetaThread;
import M_V.MS.OP.SM.AOP.MEC.SIQ.cache.DetaCache_M;
import O_V.OSI.AOP.VPC.rest.VPC;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileInputStream;
import exception.file.O.DetaInputStreamReader;
import S_A.SVQ.stable.S_Pos;
import S_A.SVQ.stable.S_Web;
import U_A.PEU.P.zip.GzipUtil;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//这里出现了VPC的标识, 让走四方看清楚, 我有很多方法来继承, 我就不用走四方的那种
//. VPCS 的STABLE就可以解决
//是不是我写的.（详细描述下, 走四方当年php 多线程卡到爆, 戴海燕总被我念的头皮发麻
//最后用了java, 我overload了接口）
//去app 函数标识, 准备继承 用standard来区分。（当时是php 之前员工已经写好了
//, 我只是java翻译而已, 所以没用我的思维写,
//下面代码我的习惯是如下, 我喜欢类c的小片段继承。从不用overload）
// 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ServerRestMap_Standard {
    public static void main(String[] args) {
    }

    public static void IQ_Response(Socket socket) {
    }

    public static void returnResponse(Socket socket) {
    }

    public static void IQ_Response(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
    }

    public static void returnResponse(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
        vPCSResponse.getSleeper_H().D_ThreadById(vPCSResponse.getHashCode());
    }

    public static void P_Rest(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
        //VPC属于子继承, 如果不用 overrider 来分配, 也有很多方法, 如osgi
        //, 当然, 我现在用最快map标识, 更爽.
        //indexVPCMapPillows.get(vPCSRequest.gettag())...;
        //现在仅仅deta的网站处理服务器有web页, 养疗经app还没有涉及
        //, 因此 pillow tag 区分VPC 函数的rest map 设计优先级稍后
        try {
            String output = VPC.forward(vPCSRequest.getRequestLink()
                    , vPCSRequest.getRequestValue());
            output = output.length() > 0 ? output : " ";
            PrintWriter printWriter = null;

            printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
                vPCSResponse.getSocket().getOutputStream(), S_Web.CHARSET_UTF_8))
                , true);

            printWriter.println(S_Web.HEADER_HTTP_200_OK_DOUBLE_ENTER);
            output = output.charAt(S_Pos.INT_ZERO) == '"' ? output.substring(S_Pos.INT_ONE
                    , output.length()) : output;
            output = output.charAt(output.length() - S_Pos.INT_ONE) == '"' ? output
                .substring(S_Pos.INT_ZERO, output.length() - S_Pos.INT_ONE) : output;
            printWriter.println(output.replace("\\\"", "\""));
            //20230106-System.out.println("db:"+4);
            printWriter.flush();
            printWriter.close();
            vPCSResponse.getSleeper_H().D_ThreadById(vPCSResponse.getSocket().hashCode());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void P_View(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {

    }

    public static void P_Bytes(VPCSRequest vPCSRequest
            , VPCSResponse vPCSResponse) {
        List<byte[]> list;
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(
                    vPCSResponse.getSocket().getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (null != DetaCache_M.getCacheOfBytesList(vPCSRequest.getRequestFilePath())) {
            list = DetaCache_M.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
        } else {
            FileInputStream fileInputStream = DetaFileInputStream.E(
                    new File(vPCSRequest.getRequestFilePath()));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] byteArray = new byte[S_Web.BUFFER_RANGE_MAX];
            int lengthOfFile = S_Pos.INT_ZERO;
            list = new ArrayList<>();
            //这段while函数思想来自 这篇文章：
            //https://blog.csdn.net/top_code/article/details/41042413
            //非常轻松处理len的长度溢出。谢谢。
            while ((lengthOfFile = DetaFileInputStream.I(fileInputStream, byteArray
                    , S_Pos.INT_ZERO, S_Web.BUFFER_RANGE_MAX)) != S_Pos.INT_ERROR) {
                byteArrayOutputStream.write(byteArray, S_Pos.INT_ZERO, lengthOfFile);
            }
            DetaFileInputStream.D(fileInputStream);
            byte[] sniper = GzipUtil.compress(byteArrayOutputStream.toByteArray());
            try {
                list.add(0, vPCSResponse.getResponseContentType().getBytes(S_Web.CHARSET_UTF8));
                list.add(0, (S_Web.HEADER_CONTENT_LENGTH + sniper.length
                    + S_Web.STRING_SPACE_ENTER).getBytes(S_Web.CHARSET_UTF8));
                list.add(0, S_Web.HEADER_CACHE_CONTROL.getBytes(S_Web.CHARSET_UTF8));
                list.add(0, S_Web.HEADER_CONTENT_ENCODING_GZIP.getBytes(S_Web.CHARSET_UTF8));
                list.add(0, S_Web.HEADER_ACCEPT_RANGES_BYTES.getBytes(S_Web.CHARSET_UTF8));
                list.add(0, S_Web.HEADER_HOST.getBytes(S_Web.CHARSET_UTF8));
                list.add(0, S_Web.HEADER_HTTP_200_OK.getBytes(S_Web.CHARSET_UTF8));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
            if (null != sniper && sniper.length > S_Pos.INT_ZERO) {
                list.add(sniper);
            }
            DetaCache_M.putCacheOfBytesList(vPCSRequest.getRequestFilePath(), list);
        }
        try {
            Iterator<byte[]> iterator = list.iterator();
            while (iterator.hasNext()) {
                dataOutputStream.write(iterator.next());
            }
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void P_Buffer(VPCSRequest vPCSRequest
            , VPCSResponse vPCSResponse) {
        String builderToString;
        if (null != DetaCache_M.getCacheOfString(vPCSRequest.getRequestFilePath())) {
            builderToString = DetaCache_M.getCacheOfString(vPCSRequest.getRequestFilePath());
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(S_Web.HEADER_HTTP_200_OK);
            stringBuilder.append(S_Web.HEADER_HOST);
            stringBuilder.append(S_Web.HEADER_CACHE_CONTROL);
            stringBuilder.append(vPCSResponse.getResponseContentType());
            FileInputStream fileInputStream = DetaFileInputStream.E(new File(vPCSRequest.getRequestFilePath()));
            InputStreamReader inputStreamReader = DetaInputStreamReader.E(fileInputStream
                    , vPCSRequest.getRequestFileCode());
            DetaBufferedReader DetaBufferedReader = new DetaBufferedReader(inputStreamReader);
            String line = null;
            while ((line = DetaBufferedReader.readDetaLine()) != null) {
                stringBuilder.append(line);
            }
            DetaBufferedReader.closeDeta();
            builderToString = stringBuilder.toString();
            DetaCache_M.putCacheOfString(vPCSRequest.getRequestFilePath(), builderToString);
        }
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(vPCSResponse
                .getSocket().getOutputStream(), vPCSRequest.getRequestFileCode()));
            bufferedWriter.write(builderToString);
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void P_BufferBytes(VPCSRequest vPCSRequest
            , VPCSResponse vPCSResponse) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(S_Web.HEADER_HTTP_200_OK);
        stringBuilder.append(S_Web.HEADER_HOST);
        stringBuilder.append(S_Web.HEADER_CACHE_CONTROL);
        stringBuilder.append(S_Web.HEADER_CONTENT_ENCODING_GZIP);
        stringBuilder.append(vPCSResponse.getResponseContentType());
        String builderToString = stringBuilder.toString();
        String contentBuilderToString;
        try {
            if (null != DetaCache_M.getCacheOfString(vPCSRequest.getRequestFilePath())) {
                contentBuilderToString = DetaCache_M.getCacheOfString(vPCSRequest
                    .getRequestFilePath());
            } else {
                StringBuilder contentBuilder = new StringBuilder();
                FileInputStream fileInputStream = DetaFileInputStream.E(new File(vPCSRequest
                        .getRequestFilePath()));
                int lengthOfFile = S_Pos.INT_ZERO;
                byte[] byteArray = new byte[S_Web.BUFFER_RANGE_MAX];
                while ((lengthOfFile = DetaFileInputStream.I(fileInputStream, byteArray))
                    != S_Pos.INT_ERROR) {
                    contentBuilder.append(new String(byteArray, S_Pos.INT_ZERO, lengthOfFile
                            , S_Web.CHARSET_UTF_8));
                }
                fileInputStream.close();
                contentBuilderToString = contentBuilder.toString();
                DetaCache_M.putCacheOfString(vPCSRequest.getRequestFilePath()
                        , contentBuilderToString);
            }
            DataOutputStream dataOutputStream
                    = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
            dataOutputStream.write(builderToString.getBytes(S_Web.CHARSET_UTF8));
            dataOutputStream.write(GzipUtil.compress(contentBuilderToString.getBytes(
                    S_Web.CHARSET_UTF8)));
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void P_BytesWithoutZip(VPCSRequest vPCSRequest
            , VPCSResponse vPCSResponse) {
        List<byte[]> list;
        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(vPCSResponse.getSocket().getOutputStream());
            if (DetaCache_M.getCacheOfBytesList(vPCSRequest.getRequestFilePath()) != null) {
                list = DetaCache_M.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
            } else {
                FileInputStream fileInputStream
                        = new FileInputStream(new File(vPCSRequest.getRequestFilePath()));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] byteArray = new byte[1024];
                int len = 0;
                list = new ArrayList<>();
                //下面三行while函数思想来自
                //这篇文章：https://blog.csdn.net/top_code/article/details/41042413
                //非常轻松处理len的长度溢出。谢谢。
                while ((len = fileInputStream.read(byteArray, 0, 1024)) != -1) {
                    byteArrayOutputStream.write(byteArray, 0, len);
                }
                fileInputStream.close();
                byte[] sniper = byteArrayOutputStream.toByteArray();
                list.add(0, vPCSResponse.getResponseContentType().getBytes(S_Web.CHARSET_UTF8));
                list.add(0, (S_Web.HEADER_CONTENT_LENGTH + sniper.length
                        + " \n").getBytes(S_Web.CHARSET_UTF8));
                list.add(0, (S_Web.HEADER_CACHE_CONTROL).getBytes(S_Web.CHARSET_UTF8));
                list.add(0, S_Web.HEADER_ACCEPT_RANGES_BYTES.getBytes(S_Web.CHARSET_UTF8));
                list.add(0, S_Web.HEADER_HOST.getBytes(S_Web.CHARSET_UTF8));
                list.add(0, S_Web.HEADER_HTTP_200_OK.getBytes(S_Web.CHARSET_UTF8));
                list.add(sniper);
                DetaCache_M.putCacheOfBytesList(vPCSRequest.getRequestFilePath(), list);
            }
            Iterator<byte[]> iterator = list.iterator();
            while (iterator.hasNext()) {
                byte[] bytes = null;
                int i = 0;
                try {
                    bytes = iterator.next();
                    if (bytes.length > 10000) {
                        int last = bytes.length % 10000;
                        for (i = 0; i < bytes.length - 10000; i += 10000) {
                            byte[] serparBytes = new byte[10000];
                            for (int j = 0; j < 10000; j++) {
                                serparBytes[j] = bytes[i + j];
                            }
                            DetaThread.sleepDeta(250);
                            dataOutputStream.write(serparBytes);
                            dataOutputStream.flush();
                        }
                        byte[] serparBytes = new byte[last];
                        //					i-=10000;
                        for (int j = 0; j < last; j++) {
                            serparBytes[j] = bytes[i + j];
                        }
                        dataOutputStream.write(serparBytes);
                    } else {
                        dataOutputStream.write(bytes);
                    }
                } catch (Exception e) {
                    //20230106-System.out.print(i);
                    //20230106-System.out.print(bytes.length);
                    //20230106-System.out.print(vPCSRequest.getRequestLink());
                    //20230106-System.out.print(vPCSRequest.getRequestFilePath());
                    e.printStackTrace();
                }
            }
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
