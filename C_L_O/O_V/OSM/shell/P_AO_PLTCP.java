package O_V.OSM.shell;

import M_V.MSU.sessionValidation.X_sessionInitByTokenPDICertsDNA;
import M_V.MSU.sessionValidation.X_sessionTokenCertsInitWithHumanWordsByDNA;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.SVQ.stable.S_ShellETL;
import S_A.SVQ.stable.S_Token;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.dna.Token;
import U_A.PEU.P.dna.TokenCerts;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_stringToURIencode;
import U_V.ESU.string.String_ESU_X_uRIencodeToURIdecode;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings({"unused"})
//这个文件主要用来设计关于web的rest, server, http 请求
//+ "PLTCP:病症|进行WEB请求|接口为|localhost|端口为|8000|操作为|分词;" (正在设计）
//+ "PLTCP:病症|进行WEB请求|接口为|localhost|端口为|8000|操作为|DNN;" (正在设计）
//+ "PLTCP:病症|进行WEB请求|接口为|localhost|端口为|8000|操作为|POS;" (正在设计）
//罗瑶光 20211014
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class P_AO_PLTCP {
    @SuppressWarnings("unchecked")
    public static void P_PltcpLimitMap(String[] sets, List<IMV_SIQ> output
            , IMV_SIQ object) {
        try {
            List<IMV_SIQ> outputTemp = new ArrayList<>();
            if (sets[1].equalsIgnoreCase("进行WEB请求")) {
                //主循环
                List<IMV_SIQ> primaryInLoop = (List<IMV_SIQ>) object.get("obj");
                Iterator<IMV_SIQ> outputTempIterator = primaryInLoop.iterator();
                while (outputTempIterator.hasNext()) {
                    IMV_SIQ rowOutputTempIterator = outputTempIterator.next();
                    IMV_SIQ rowValueRowOutputTempIterator
                            = (IMV_SIQ) rowOutputTempIterator.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                    //先固定好主谓宾格式, 以后再来设计宾补的格式, 目前先按定语来。
                    String server = sets[3];//稍后设计 安全检测。
                    String port = sets[5];
                    if (sets[7].contains("分词")) {
                        String setOfi = rowValueRowOutputTempIterator.get(sets[0]).toString();
                        String string = String_ESU_X_charsetSwap._E(setOfi, "UTF8", "UTF8");
                        String encode = String_ESU_X_stringToURIencode._E(string, "UTF8");
                        //String response= RestCall_X_backEndRequest._E(encode);

                        //模拟加个测试账号: 313699483@QQ.COM, 密码: fengyue1985
                        String id = "313699483@QQ.COM";
                        String idString = String_ESU_X_charsetSwap._E(id, "UTF8", "UTF8");
                        String idEncoder = String_ESU_X_stringToURIencode._E(idString, "UTF8");
                        String password = "Fengyue1985!";
                        String lock = "AISD>_<111111111111111>_<111111111111111111111111111111111111111111111111111111111"
                                + "11111111111111111111111111111111111111111111111111"
                                + ">_<1111111111111111>_<10111011101101101110110110110110111011011011101110110110"
                                + "1101101101101101110110110111011011011011011011011101101101101101101110110111011101";
                        String[] MD5dice_DNA = lock.split(S_Token.ETL_SYMBOL_SMILL);
                        //DNA元基加密
                        TokenCerts tokenCerts = X_sessionTokenCertsInitWithHumanWordsByDNA._E(password, true, MD5dice_DNA[0]);
                        Token token = X_sessionInitByTokenPDICertsDNA._E(tokenCerts);
                        String passwordString = String_ESU_X_charsetSwap._E(token.getmPassword(), "UTF8", "UTF8");
                        String passwordEncoder = String_ESU_X_stringToURIencode._E(passwordString, "UTF8");
                        //20230106-System.out.println("pds--1>"+tokenCerts.getPds());
                        //这里的数据下面没有标识, 准备写个tag来描述下先
                        //java 从没有url的长度限制, 如果出问题就会不报错, 欺骗方式下滑。
                        //所以准备写个tag。
                        //localhost 我会做个表来描述。
                        //罗瑶光 20210731
                        URL url = new URL("http://" + server + ":" + port + "/dataWS?message=" + encode +
                                "&id=" + idEncoder +
                                "&password=" + password +
                                "&de=" + MD5dice_DNA[1] +
                                "&ds=" + MD5dice_DNA[2] +
                                "&ie=" + MD5dice_DNA[3] +
                                "&is=" + MD5dice_DNA[4] +
                                "&lock=" + MD5dice_DNA[0]);
                        HttpURLConnection conn = null;

                        conn = (HttpURLConnection) url.openConnection();

                        //这里是url 的httpconnection, 只能服务器网卡链接情况下使用, 如果要本机断网调试, 请查阅网卡相关函数.
                        //与程序功能无关, 以后讨论.
                        //HttpConnection conn= (HttpURLConnection) url.openConnection();
                        conn.setRequestMethod("POST");
                        conn.setRequestProperty("Accept", "application/json");
                        if (conn.getResponseCode() != 200) {
                            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
                        }
                        DetaBufferedReader br = new DetaBufferedReader(DetaInputStreamReader.E((conn.getInputStream()), "UTF8"));
                        String out = "";
                        String out1;
                        while ((out1 = br.readDetaLine()) != null) {
                            out += out1;
                        }
                        conn.disconnect();
                        //
                        String[] strings = out.split("\"");
                        out = strings.length > 3 ? strings[3] : "";
                        out = String_ESU_X_uRIencodeToURIdecode._E(out, "UTF8");

                        //输出存储替换
                        rowValueRowOutputTempIterator.put(sets[0], out);
                        rowOutputTempIterator.put(S_ShellETL.SHELL_ETL_ROWVALUE, rowValueRowOutputTempIterator);
                        outputTemp.add(rowOutputTempIterator);
                    }
                    if (sets[7].contains("DNN")) {
                        String setOfi = rowValueRowOutputTempIterator.get(sets[0]).toString();
                        String string = String_ESU_X_charsetSwap._E(setOfi, "UTF8", "UTF8");
                        String encode = String_ESU_X_stringToURIencode._E(string, "UTF8");
                        //String response= RestCall_X_backEndRequest._E(encode);

                        //模拟加个测试账号: 313699483@QQ.COM, 密码: fengyue1985
                        String id = "313699483@QQ.COM";
                        String idString = String_ESU_X_charsetSwap._E(id, "UTF8", "UTF8");
                        String idEncoder = String_ESU_X_stringToURIencode._E(idString, "UTF8");
                        String password = "Fengyue1985!";
                        String lock = "AISD>_<111111111111111>_<11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
                                + ">_<1111111111111111>_<10111011101101101110110110110110111011011011101110110110"
                                + "1101101101101101110110110111011011011011011011011101101101101101101110110111011101";
                        String[] MD5dice_DNA = lock.split(S_Token.ETL_SYMBOL_SMILL);
                        //DNA元基加密
                        TokenCerts tokenCerts = X_sessionTokenCertsInitWithHumanWordsByDNA._E(password, true, MD5dice_DNA[0]);
                        Token token = X_sessionInitByTokenPDICertsDNA._E(tokenCerts);
                        String passwordString = String_ESU_X_charsetSwap._E(token.getmPassword(), "UTF8", "UTF8");
                        String passwordEncoder = String_ESU_X_stringToURIencode._E(passwordString, "UTF8");
                        //20230106-System.out.println("pds--1>"+tokenCerts.getPds());
                        //这里的数据下面没有标识, 准备写个tag来描述下先
                        //java 从没有url的长度限制, 如果出问题就会不报错, 欺骗方式下滑。
                        //所以准备写个tag。
                        //localhost 我会做个表来描述。
                        //罗瑶光 20210731
                        URL url = new URL("http://" + server + ":" + port + "/dataCG?message=" + encode +
                                "&id=" + idEncoder +
                                "&password=" + password +
                                "&de=" + MD5dice_DNA[1] +
                                "&ds=" + MD5dice_DNA[2] +
                                "&ie=" + MD5dice_DNA[3] +
                                "&is=" + MD5dice_DNA[4] +
                                "&lock=" + MD5dice_DNA[0]);
                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        //这里是url 的httpconnection, 只能服务器网卡链接情况下使用, 如果要本机断网调试, 请查阅网卡相关函数.
                        //与程序功能无关, 以后讨论.
                        //HttpConnection conn= (HttpURLConnection) url.openConnection();
                        conn.setRequestMethod("POST");
                        conn.setRequestProperty("Accept", "application/json");
                        if (conn.getResponseCode() != 200) {
                            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
                        }
                        DetaBufferedReader br = new DetaBufferedReader(DetaInputStreamReader.E((conn.getInputStream()), "UTF8"));
                        String out = "";
                        String out1;
                        while ((out1 = br.readDetaLine()) != null) {
                            out += out1;
                        }
                        conn.disconnect();
                        //
                        String[] strings = out.split("\"");
                        out = strings.length > 3 ? strings[3] : "";
                        out = String_ESU_X_uRIencodeToURIdecode._E(out, "UTF8");

                        //输出存储替换
                        rowValueRowOutputTempIterator.put(sets[0], out);
                        rowOutputTempIterator.put(S_ShellETL.SHELL_ETL_ROWVALUE, rowValueRowOutputTempIterator);
                        outputTemp.add(rowOutputTempIterator);
                    }
                    if (sets[7].contains("POS")) {
                        String setOfi = rowValueRowOutputTempIterator.get(sets[0]).toString();
                        String string = String_ESU_X_charsetSwap._E(setOfi, "UTF8", "UTF8");
                        String encode = String_ESU_X_stringToURIencode._E(string, "UTF8");
                        //String response= RestCall_X_backEndRequest._E(encode);

                        //模拟加个测试账号: 313699483@QQ.COM, 密码: fengyue1985
                        String id = "313699483@QQ.COM";
                        String idString = String_ESU_X_charsetSwap._E(id, "UTF8", "UTF8");
                        String idEncoder = String_ESU_X_stringToURIencode._E(idString, "UTF8");
                        String password = "Fengyue1985!";
                        String lock = "AISD>_<111111111111111>_<11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
                                + ">_<1111111111111111>_<10111011101101101110110110110110111011011011101110110110"
                                + "1101101101101101110110110111011011011011011011011101101101101101101110110111011101";
                        String[] MD5dice_DNA = lock.split(S_Token.ETL_SYMBOL_SMILL);
                        //DNA元基加密
                        TokenCerts tokenCerts = X_sessionTokenCertsInitWithHumanWordsByDNA._E(password, true, MD5dice_DNA[0]);
                        Token token = X_sessionInitByTokenPDICertsDNA._E(tokenCerts);
                        String passwordString = String_ESU_X_charsetSwap._E(token.getmPassword(), "UTF8", "UTF8");
                        String passwordEncoder = String_ESU_X_stringToURIencode._E(passwordString, "UTF8");
                        //20230106-System.out.println("pds--1>"+tokenCerts.getPds());
                        //这里的数据下面没有标识, 准备写个tag来描述下先
                        //java 从没有url的长度限制, 如果出问题就会不报错, 欺骗方式下滑。
                        //所以准备写个tag。
                        //localhost 我会做个表来描述。
                        //罗瑶光 20210731
                        URL url = new URL("http://" + server + ":" + port + "/dataCX?message=" + encode +
                                "&id=" + idEncoder +
                                "&password=" + password +
                                "&de=" + MD5dice_DNA[1] +
                                "&ds=" + MD5dice_DNA[2] +
                                "&ie=" + MD5dice_DNA[3] +
                                "&is=" + MD5dice_DNA[4] +
                                "&lock=" + MD5dice_DNA[0]);
                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                        //这里是url 的httpconnection, 只能服务器网卡链接情况下使用, 如果要本机断网调试, 请查阅网卡相关函数.
                        //与程序功能无关, 以后讨论.
                        //HttpConnection conn= (HttpURLConnection) url.openConnection();
                        conn.setRequestMethod("POST");
                        conn.setRequestProperty("Accept", "application/json");
                        if (conn.getResponseCode() != 200) {
                            throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
                        }
                        DetaBufferedReader br = new DetaBufferedReader(DetaInputStreamReader.E((conn.getInputStream()), "UTF8"));
                        String out = "";
                        String out1;
                        while ((out1 = br.readDetaLine()) != null) {
                            out += out1;
                        }
                        conn.disconnect();
                        //
                        String[] strings = out.split("\"");
                        out = strings.length > 3 ? strings[3] : "";
                        out = String_ESU_X_uRIencodeToURIdecode._E(out, "UTF8");

                        //输出存储替换
                        rowValueRowOutputTempIterator.put(sets[0], out);
                        rowOutputTempIterator.put(S_ShellETL.SHELL_ETL_ROWVALUE, rowValueRowOutputTempIterator);
                        outputTemp.add(rowOutputTempIterator);
                    }
                }
            }
            output.clear();
            output.addAll(outputTemp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
