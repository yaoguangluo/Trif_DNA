package P_V.PCS.OEC.SIU.test;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestPressTest {
    @SuppressWarnings({"deprecation", "unused"})
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            URL url = null;
            try {
                url = new URL("http://localhost:8080/"
                    + URLEncoder.encode("313%$#@&\n\n\thfr398hf38rhf39r8hf3r98hf3r9" +
                    "8fh3r98hf398rfh398rfh893rhf83r9fh3r98fh3r89fh3r8hf3r8hffbvufevu3rfh"));
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Accept", "application/json");
                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
                }
                DetaBufferedReader br = new DetaBufferedReader(
                    DetaInputStreamReader.E((conn.getInputStream()), "UTF-8"));
                String out1;
                while ((out1 = br.readDetaLine()) != null) {
                }
                conn.disconnect();
            } catch (MalformedURLException | ProtocolException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
