package VPC.DetaFrontEnd;

import S_A.SVQ.stable.S_HTTP;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;

import java.io.IOException;
import java.net.HttpURLConnection;
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
public class DetaFrontEndUtil_X_backEndRequest {
    public static String _E(String request) {
        URL url;
        StringBuilder out;
        try {
            url = new URL("http://localhost:" + S_HTTP.PORT_BACKEND + "/"
                + request);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
            }
            DetaBufferedReader br
                = new DetaBufferedReader(DetaInputStreamReader.E((conn.getInputStream())
                , "UTF-8"));
            out = new StringBuilder();
            String out1;
            while ((out1 = br.readDetaLine()) != null) {
                out.append(out1);
            }
            conn.disconnect();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return out.toString();
    }
}
