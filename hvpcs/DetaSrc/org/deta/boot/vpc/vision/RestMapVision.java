package DetaSrc.org.deta.boot.vpc.vision;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.ByteArrayOutputStream;
//import java.io.DataOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.URLDecoder;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import org.lyg.cache.DetaCacheManager;
//import org.lyg.common.utils.GzipUtil;
//
//import DetaSrc.org.deta.boot.rest.VPC;
//import DetaSrc.org.deta.boot.sets.StableBlob;
import java.net.Socket;

import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;
import DetaSrc.org.deta.boot.vpc.sleeper.Sleeper;
//����Ȩ�ˣ����ߣ�������
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class RestMapVision {
	 public static void main(String[] args){

	 }

	 public static void getResponse(Socket socket) {

	 }

	 public static void returnResponse(Sleeper sleeper) {
		 sleeper.setWaitingForShake(false
				 , sleeper.pillows.vPCSResponse.getHashCode()
				 , sleeper.pillows.vPCSResponse.getHashCode()+ "-e");
	 }

	 public static void getResponse(VPCSRequest vPCSRequest
			 , VPCSResponse vPCSResponse) {
		 System.out.flush();
		 System.out.println(vPCSResponse.getHashCode()+"-pe");
		 vPCSResponse.closeAllBeforeGC();
	 }
 }
//	 public static void processRest(VPCSRequest vPCSRequest
//			 , VPCSResponse vPCSResponse) {
//		 String output;
//		 try {
//			 output = VPC.forward(vPCSRequest.getRequestLink()
//					 , vPCSRequest.getRequestValue());
//			 vPCSResponse.printWriter = new PrintWriter(new BufferedWriter(
//					 new OutputStreamWriter(vPCSResponse.socket
//							 .getOutputStream(), "UTF-8")), true);
//		 }catch(Exception e) {
//			 System.out.flush();System.out.println(e.getMessage());
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//					 + "-processRest err");
//			 System.out.flush();System.out.println(vPCSRequest.getRequestLink());
//			 System.out.flush();System.out.println(vPCSRequest.getRequestFilePath());
//			 StableBlob.addException();
//			 return;
//		 }
//		 if(output.length()> 0) {
//			 System.out.flush();System.out.println("success YL");
//			 vPCSResponse.printWriter.flush();
//			 vPCSResponse.printWriter.println("HTTP/1.1 200 OK\n\n"); 
//			 output=output.charAt(0)=='"'?output.substring(1, output.length()):output;
//			 output=output.charAt(output.length()-1)=='"'?output.substring(0
//					 , output.length()-1):output;
//			 vPCSResponse.printWriter.flush();
//			 vPCSResponse.printWriter.println(output.replace("\\\"", "\""));
//			 vPCSResponse.printWriter.close();	
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode() + "-f");
//		 }else {
//			 vPCSResponse.printWriter.flush();
//			 vPCSResponse.printWriter.println("HTTP/1.1 204 OK\n\n"); 
//			 vPCSResponse.printWriter.close();	
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//					 + "-processRest length err");
//			 System.out.flush();System.out.print(vPCSRequest.getRequestLink());
//			 System.out.flush();System.out.print(vPCSRequest.getRequestFilePath());
//			 return;
//		 }	
//	 }
//
//	 public static void processView(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
//
//	 }
//
//	 //119-���while����˼������ ��ƪ���£�https://blog.csdn.net/top_code/article/details/41042413
//	 //�ǳ����ɴ���len�ĳ��������лл��
//	 public static void processBytes(VPCSRequest vPCSRequest
//			 , VPCSResponse vPCSResponse) {
//		 try {
//			 List<byte[]> list;
//			 vPCSResponse.dataOutputStream = new DataOutputStream(vPCSResponse.socket.getOutputStream());
//			 if(DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath()) != null){
//				 list = DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
//			 }else{
//				 String fileString=  URLDecoder.decode(vPCSRequest.getRequestFilePath(), "UTF8");
//				 File file= new File(fileString);
//				 vPCSResponse.fileInputStream = new FileInputStream(file);
//				 vPCSResponse.byteArrayOutputStream = new ByteArrayOutputStream();
//				 byte[] byteArray = new byte[1024];
//				 int len = 0;
//				 list = new ArrayList<>();
//				 vPCSResponse.byteArrayOutputStream.flush();
//				 while((len= vPCSResponse.fileInputStream.read(byteArray, 0, 1024))!=-1){
//					 vPCSResponse.byteArrayOutputStream.write(byteArray, 0, len);
//					 vPCSResponse.byteArrayOutputStream.flush();
//				 }
//				 vPCSResponse.fileInputStream.close();
//				 byte[] sniper = GzipUtil.compress(vPCSResponse.byteArrayOutputStream.toByteArray());
//				 long sniper_length= sniper==null? 0: sniper.length;
//				 list.add(0, vPCSResponse.getResponseContentType().getBytes("UTF8"));
//				 list.add(0, ("Content-Length: " + sniper_length + " \n").getBytes("UTF8"));
//				 list.add(0, ("Cache-control: max-age=315360000 \n").getBytes("UTF8"));
//				 list.add(0, ("Content-Encoding:Gzip \n").getBytes("UTF8"));
//				 list.add(0, "Accept-Ranges: bytes \n".getBytes("UTF8"));
//				 list.add(0, "Host:deta software  \n".getBytes("UTF8"));
//				 list.add(0, "HTTP/1.1 200 OK \n".getBytes("UTF8"));
//				 list.add(sniper);
//				 DetaCacheManager.putCacheOfBytesList(vPCSRequest.getRequestFilePath(), list);
//			 }	
//			 Iterator<byte[]> iterator = list.iterator();
//			 vPCSResponse.dataOutputStream.flush();
//			 while(iterator.hasNext()){
//				 byte[] bytes= null;
//				 int i= 0;
//				 long bytes_length= 0;
//				 bytes= iterator.next();
//				 bytes_length= bytes==null? 0: bytes.length;
//				 if(bytes_length>10000) {
//					 int last= bytes.length% 10000;
//					 for(i= 0; i< bytes.length- 10000; i+= 10000) {
//						 byte[] serparBytes = new byte[10000];
//						 for(int j= 0; j< 10000; j++) {
//							 serparBytes[j]= bytes[i+ j];
//						 }
//						 vPCSResponse.dataOutputStream.write(serparBytes);
//						 vPCSResponse.dataOutputStream.flush();
//					 }
//					 byte[] serparBytes = new byte[last];
//					 for(int j=0; j<last;j++) {
//						 serparBytes[j]= bytes[i+ j];
//					 }
//					 vPCSResponse.dataOutputStream.write(serparBytes);
//					 vPCSResponse.dataOutputStream.flush();
//				 }else if(bytes_length> 0){
//					 vPCSResponse.dataOutputStream.write(bytes);
//					 vPCSResponse.dataOutputStream.flush();
//				 }
//			 }	
//			 vPCSResponse.dataOutputStream.close();
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode() + " -f");	
//		 }catch(Exception e) {
//			 System.out.flush();System.out.println(e.getMessage());
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode()+"-processBytes err");
//			 System.out.flush();System.out.println(vPCSRequest.getRequestLink());
//			 System.out.flush();System.out.println(vPCSRequest.getRequestFilePath());
//			 StableBlob.addException();
//			 return;
//		 }
//	 }
//
//	 public static void processBuffer(VPCSRequest vPCSRequest
//			 , VPCSResponse vPCSResponse) {
//		 try {
//			 if(null==vPCSRequest.getRequestFilePath()
//					 ||null==vPCSRequest.getRequestLink()) {
//				 return;
//			 }
//
//			 String builderToString;
//			 if(DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath()) != null){
//				 builderToString = DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath());
//			 }else{
//				 StringBuilder stringBuilder = new StringBuilder();
//				 stringBuilder.append("HTTP/1.1 200 OK").append("\n");
//				 stringBuilder.append("Host:deta software  \n");
//				 stringBuilder.append("Cache-control: max-age=315360000 \n");
//				 stringBuilder.append(vPCSResponse.getResponseContentType());
//				 File file= new File(vPCSRequest.getRequestFilePath());
//				 vPCSResponse.fileInputStream = new FileInputStream(file); 
//				 vPCSResponse.inputStreamReader 
//				 = new InputStreamReader(vPCSResponse.fileInputStream
//						 , vPCSRequest.getRequestFileCode());
//				 vPCSResponse.bufferedReader = new BufferedReader(vPCSResponse.inputStreamReader); 
//				 String line = null; 
//				 while ((line = vPCSResponse.bufferedReader.readLine()) != null) { 
//					 stringBuilder.append(line); 
//				 }
//				 builderToString = stringBuilder.toString();
//				 DetaCacheManager.putCacheOfString(vPCSRequest.getRequestFilePath()
//						 , builderToString);
//				 vPCSResponse.bufferedReader.close();
//			 }
//			 if(null!= vPCSResponse.socket) {
//				 if(!vPCSResponse.socket.isClosed()) {
//					 OutputStream outputStream= vPCSResponse.socket.getOutputStream();
//					 OutputStreamWriter  outputStreamWriter=new OutputStreamWriter(
//							 outputStream, vPCSRequest.getRequestFileCode());
//					 vPCSResponse.bufferedWriter = new BufferedWriter(outputStreamWriter);
//					 int j=builderToString.length();
//					 vPCSResponse.bufferedWriter.flush();
//					 vPCSResponse.bufferedWriter.write(builderToString, 0, j);
//					 vPCSResponse.bufferedWriter.close();
//				 }
//			 }
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode() + "-f");
//		 }catch(Exception e) {
//			 System.out.flush();System.out.println(e.getMessage());
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//					 + "-processBuffer bufferedWriter err");
//			 System.out.flush();System.out.println(vPCSRequest.getRequestLink());
//			 System.out.flush();System.out.println(vPCSRequest.getRequestFilePath());
//			 StableBlob.addException();
//			 return;	
//		 }
//	 }
//
//	 public static void processBufferBytes(VPCSRequest vPCSRequest
//			 , VPCSResponse vPCSResponse) {
//		 try {
//			 StringBuilder stringBuilder = new StringBuilder();
//			 stringBuilder.append("HTTP/1.1 200 OK").append("\n");
//			 stringBuilder.append("Host:deta software  \n");
//			 stringBuilder.append("Cache-control: max-age=315360000 \n");
//			 stringBuilder.append("Content-Encoding:gzip \n");
//			 stringBuilder.append(vPCSResponse.getResponseContentType());
//			 String builderToString = stringBuilder.toString();
//			 String contentBuilderToString;
//			 if(DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath()) != null){
//				 contentBuilderToString = DetaCacheManager.getCacheOfString(vPCSRequest.getRequestFilePath());
//			 }else{
//				 StringBuilder contentBuilder = new StringBuilder();
//				 File file = new File(vPCSRequest.getRequestFilePath());
//				 vPCSResponse.fileInputStream = new FileInputStream(file);	
//				 int len = 0;
//				 byte[] byteArray = new byte[1024];
//				 while ((len = vPCSResponse.fileInputStream.read(byteArray))!=-1){
//					 contentBuilder.append(new String(byteArray, 0, len, "UTF-8"));
//				 }
//				 vPCSResponse.fileInputStream.close();
//				 Thread.sleep(75);
//				 contentBuilderToString = contentBuilder.toString();
//				 DetaCacheManager.putCacheOfString(vPCSRequest.getRequestFilePath()
//						 , contentBuilderToString);
//			 }	
//			 vPCSResponse.dataOutputStream 
//			 = new DataOutputStream(vPCSResponse.socket.getOutputStream());
//			 vPCSResponse.dataOutputStream.flush();
//			 vPCSResponse.dataOutputStream.write(builderToString.getBytes("UTF8"));
//			 Thread.sleep(75);
//			 byte[] bytes= null;
//			 int i= 0;
//			 long bytes_length= 0;
//			 bytes= GzipUtil.compress(contentBuilderToString.getBytes("UTF8"));
//			 bytes_length= bytes==null? 0: bytes.length;
//			 vPCSResponse.dataOutputStream.flush();
//			 if(bytes_length>10000) {
//				 int last= bytes.length%10000;
//				 for(i= 0; i< bytes.length- 10000; i+= 10000) {
//					 byte[] serparBytes = new byte[10000];
//					 for(int j= 0; j< 10000; j++) {
//						 serparBytes[j]= bytes[i+ j];
//					 }
//					 vPCSResponse.dataOutputStream.write(serparBytes);
//					 vPCSResponse.dataOutputStream.flush();
//				 }
//				 byte[] serparBytes = new byte[last];
//				 for(int j=0; j<last;j++) {
//					 serparBytes[j]= bytes[i+ j];
//				 }
//				 vPCSResponse.dataOutputStream.write(serparBytes);
//				 vPCSResponse.dataOutputStream.flush();
//			 }else if(bytes_length> 0){
//				 vPCSResponse.dataOutputStream.write(bytes);
//				 vPCSResponse.dataOutputStream.flush();
//			 }
//			 vPCSResponse.dataOutputStream.close();
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode() + "-f");
//		 }catch(Exception e) {
//			 System.out.flush();System.out.println(e.getMessage());
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//					 +"-processBufferBytes dataOutputStream err");
//			 System.out.flush();System.out.println(vPCSRequest.getRequestLink());
//			 System.out.flush();System.out.println(vPCSRequest.getRequestFilePath());
//			 StableBlob.addException();
//			 return;
//		 }
//	 }
//	 //327//dataOutputStream.write(GzipUtil.compress(contentBuilderToString.getBytes("UTF8")));
//	 public static void processBytesWithoutZip(VPCSRequest vPCSRequest
//			 , VPCSResponse vPCSResponse) {
//		 try {
//			 List<byte[]> list;
//			 vPCSResponse.dataOutputStream = new DataOutputStream(vPCSResponse.socket.getOutputStream());
//			 if(DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath()) != null){
//				 list = DetaCacheManager.getCacheOfBytesList(vPCSRequest.getRequestFilePath());
//			 }else{
//				 vPCSResponse.fileInputStream = null;
//				 String string= vPCSRequest.getRequestFilePath();
//				 if(string.contains("/dna_pde_rna/")) {
//					 string=  URLDecoder.decode(string, "UTF8");
//					 File file = new File(string);
//					 vPCSResponse.fileInputStream = new FileInputStream(file);
//				 }else {
//					 File file = new File(vPCSRequest.getRequestFilePath());
//					 vPCSResponse.fileInputStream = new FileInputStream(file);	
//				 }
//				 vPCSResponse.byteArrayOutputStream = new ByteArrayOutputStream();
//				 byte[] byteArray = new byte[1024];
//				 int len = 0;
//				 list = new ArrayList<>();
//				 vPCSResponse.byteArrayOutputStream.flush();
//				 while((len = vPCSResponse.fileInputStream.read(byteArray, 0, 1024))!= -1){
//					 vPCSResponse.byteArrayOutputStream.write(byteArray, 0, len);
//					 vPCSResponse.byteArrayOutputStream.flush();
//				 }
//				 vPCSResponse.fileInputStream.close();
//				 byte[] sniper =vPCSResponse.byteArrayOutputStream.toByteArray();
//				 list.add(0, vPCSResponse.getResponseContentType().getBytes("UTF8"));
//				 list.add(0, ("Content-Length: " + sniper.length + " \n").getBytes("UTF8"));
//				 list.add(0, ("Cache-control: max-age=315360000 \n").getBytes("UTF8"));
//				 list.add(0, "Accept-Ranges: bytes \n".getBytes("UTF8"));
//				 list.add(0, "Host:deta software  \n".getBytes("UTF8"));
//				 list.add(0, "HTTP/1.1 200 OK \n".getBytes("UTF8"));
//				 list.add(sniper);
//				 DetaCacheManager.putCacheOfBytesList(vPCSRequest.getRequestFilePath(), list);
//			 }	
//			 Iterator<byte[]> iterator = list.iterator();
//			 vPCSResponse.dataOutputStream.flush();
//			 while(iterator.hasNext()){
//				 byte[] bytes = null;
//				 int i= 0;
//				 long bytes_length= 0;
//				 bytes= iterator.next();
//				 bytes_length= bytes==null? 0: bytes.length;
//				 if(bytes_length>10000) {
//					 int last= bytes.length%10000;
//					 for(i= 0; i< bytes.length- 10000; i+= 10000) {
//						 byte[] serparBytes = new byte[10000];
//						 for(int j= 0; j< 10000; j++) {
//							 serparBytes[j]= bytes[i+ j];
//						 }
//						 vPCSResponse.dataOutputStream.write(serparBytes);
//						 vPCSResponse.dataOutputStream.flush();
//					 }
//					 byte[] serparBytes = new byte[last];
//					 for(int j=0; j<last;j++) {
//						 serparBytes[j]= bytes[i+ j];
//					 }
//					 vPCSResponse.dataOutputStream.write(serparBytes);
//					 vPCSResponse.dataOutputStream.flush();
//				 }else if(bytes_length> 0){
//					 vPCSResponse.dataOutputStream.write(bytes);
//					 vPCSResponse.dataOutputStream.flush();
//				 }
//			 }
//			 vPCSResponse.dataOutputStream.close();
//			 if(null!= vPCSResponse.byteArrayOutputStream) {
//				 vPCSResponse.byteArrayOutputStream.close();	
//			 }	
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode() + "-f");	
//		 }catch(Exception e) {
//			 System.out.flush();System.out.println(e.getMessage());
//			 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//					 +"-processBytesWithoutZip fileInputStream err");
//			 System.out.flush();System.out.println(vPCSRequest.getRequestLink());
//			 System.out.flush();System.out.println(vPCSRequest.getRequestFilePath());	
//			 StableBlob.addException();
//			 return;
//		 }
//	 }
// }