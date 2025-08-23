package DetaSrc.org.deta.boot.server;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
public class BootVPCSTest {
	 public static void main(String[] args) throws IOException, InterruptedException {
		 BufferedReader bufferedReader = null;
		 long li=0;
		 while(true) {
			 try {
				 Thread.sleep(1000 * 60 * 3);
				 URL url = new URL("http://tinos.qicp.vip/");
				 HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				 connection.setRequestMethod("GET");
				 connection.setRequestProperty("Content-Type", "application/json");
				 connection.setDoOutput(true);
				 connection.setInstanceFollowRedirects(false);
				 String requestBody = "";
				 StringBuilder stringBuilder = new StringBuilder();
				 InputStream inputStream = connection.getInputStream();
				 if (inputStream != null) {
					 bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
					 char[] charBuffer = new char[128];
					 int bytesRead = -1;
					 while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
						 stringBuilder.append(charBuffer, 0, bytesRead);
					 }
				 } else {
					 stringBuilder.append("");
				 }

				 requestBody = stringBuilder.toString();
				 if(null==requestBody||requestBody.isEmpty()){
					 System.out.flush();System.out.println("time out or net error"+ System.currentTimeMillis()); 
				 }else {
					 System.out.flush();System.out.println(li++ + System.currentTimeMillis());  
				 }
				 inputStream.close();
				 bufferedReader.close();
			 } catch (Exception ex) {
				 System.out.flush();System.out.println("time out or net error"); 
				 if (bufferedReader != null) {
					 try {
						 bufferedReader.close();
						 bufferedReader= null;
					 } catch (Exception ex1) {
						 throw ex1;
					 }
				 }
			 }
			// Thread.sleep(30000);
		 }

	 }
 }