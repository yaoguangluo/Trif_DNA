package DetaSrc.org.deta.boot.vpc.vision;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import src.java.org.lyg.cache.DetaCacheManager;
import DetaSrc.org.deta.boot.sets.StableBlob;
import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;
//����Ȩ�ˣ����ߣ�������
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class RestMapVision_XP_buffer extends RestMapVision {

	 public static void processBuffer(VPCSRequest vPCSRequest
			 , VPCSResponse vPCSResponse) {
		 try {
			 if(null==vPCSRequest.getRequestFilePath()
					 ||null==vPCSRequest.getRequestLink()) {
				 return;
			 }

			 String builderToString;
			 if(DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath()) != null){
				 builderToString = DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath());
			 }else{
				 StringBuilder stringBuilder = new StringBuilder();
				 stringBuilder.append("HTTP/1.1 200 OK").append("\n");
				 stringBuilder.append("Host:deta software  \n");
				 stringBuilder.append("Cache-control: max-age=315360000 \n");
				 stringBuilder.append(vPCSResponse.getResponseContentType());
				 File file= new File(vPCSRequest.getRequestFilePath());
				 vPCSResponse.fileInputStream = new FileInputStream(file); 
				 vPCSResponse.inputStreamReader 
				 = new InputStreamReader(vPCSResponse.fileInputStream
						 , vPCSRequest.getRequestFileCode());
				 vPCSResponse.bufferedReader = new BufferedReader(vPCSResponse.inputStreamReader); 
				 String line = null; 
				 while ((line = vPCSResponse.bufferedReader.readLine()) != null) { 
					 stringBuilder.append(line); 
				 }
				 builderToString = stringBuilder.toString();
				 DetaCacheManager.putCacheOfString(vPCSRequest.getRequestFilePath()
						 , builderToString);
				 vPCSResponse.bufferedReader.close();
			 }
			 if(null!= vPCSResponse.socket) {
				 if(!vPCSResponse.socket.isClosed()) {
					 OutputStream outputStream= vPCSResponse.socket.getOutputStream();
					 OutputStreamWriter  outputStreamWriter=new OutputStreamWriter(
							 outputStream, vPCSRequest.getRequestFileCode());
					 vPCSResponse.bufferedWriter = new BufferedWriter(outputStreamWriter);
					 int j=builderToString.length();
					 vPCSResponse.bufferedWriter.flush();
					 vPCSResponse.bufferedWriter.write(builderToString, 0, j);
					 vPCSResponse.bufferedWriter.close();
				 }
			 }
			 System.out.flush();System.out.println(vPCSResponse.getHashCode() + "-f");
		 }catch(Exception e) {
			 System.out.flush();System.out.println(e.getMessage());
			 System.out.flush();System.out.println(vPCSResponse.getHashCode()
					 + "-processBuffer bufferedWriter err");
			 System.out.flush();System.out.println(vPCSRequest.getRequestLink());
			 System.out.flush();System.out.println(vPCSRequest.getRequestFilePath());
			 StableBlob.addException();
			 return;	
		 }
	 }
 }