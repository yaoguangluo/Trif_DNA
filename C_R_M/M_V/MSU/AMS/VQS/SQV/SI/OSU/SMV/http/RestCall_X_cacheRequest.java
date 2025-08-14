//package M_V.MSU.AMS.VQS.SQV.SI.OSU.SMV.http;
//
//import exception.file.O.DetaBufferedReader;
//import exception.file.O.DetaInputStreamReader;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.ProtocolException;
//import java.net.URL;
//
/*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
// * */
//public class RestCall_X_cacheRequest {
//    public static String _E(String request) {
//        URL url = null;
//        String out;
//        try {
//            url = new URL("http://localhost:6379/" + request);
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("POST");
//            conn.setRequestProperty("Accept", "application/json;charset=utf-8");
//            conn.setRequestProperty("Content-Type", "application/json;charset=utf-8");
//            if (conn.getResponseCode() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : "
//						+ conn.getResponseCode());
//            }
//            DetaBufferedReader br = new DetaBufferedReader(
//					DetaInputStreamReader.E((conn.getInputStream()), "UTF-8"));
//            out = "";
//            String out1;
//            while ((out1 = br.readDetaLine()) != null) {
//                out += out1;
//            }
//            conn.disconnect();
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        } catch (ProtocolException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return out;
//    }
//}
