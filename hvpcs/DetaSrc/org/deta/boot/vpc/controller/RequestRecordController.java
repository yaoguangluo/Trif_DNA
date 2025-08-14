package DetaSrc.org.deta.boot.vpc.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;

/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public class RequestRecordController {
	 public static void requestIpRecoder(VPCSRequest vPCSRequest
			 , VPCSResponse vPCSResponse) {
		 vPCSRequest.setRequestIp(vPCSResponse.socket
				 .getInetAddress().getHostAddress());
		 vPCSRequest.setRequestName(vPCSResponse.socket
				 .getInetAddress().getHostName());
	 }

	 public static void requestLinkRecoder(VPCSRequest vPCSRequest
			 , VPCSResponse vPCSResponse){
		 int length = 0;
		 byte[] rbytes= new byte[1600];
		 //�Ժ��޸�����Ϊform����
		 try {
			 vPCSResponse.inputStream = vPCSResponse.socket.getInputStream();
			 length = vPCSResponse.inputStream.read(rbytes);
		 } catch (IOException e) {
			 e.printStackTrace();
		 }	
		 if(length < 1){
			 System.out.flush();
			 System.out.println(vPCSResponse.getHashCode()+"-check");
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 byte[] bytes = new byte[length];
		 for(int i = 0; i < length; i++) {
			 bytes[i]= rbytes[i];
		 }
		 String stringInput= new String(bytes);
		 rbytes = null;
		 String temp= stringInput.substring(0, length> 60? 60: length);
		 System.out.flush();
		 System.out.println(vPCSResponse.getHashCode() + "->" + temp);
		 String[] stringInputs= stringInput.split("\r\n");
		 String mess= stringInputs[0];
		 if(null== mess){
			 System.out.flush();
			 System.out.println(vPCSResponse.getHashCode()+"-check mess");
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 if(mess.length()> 3000) {
			 System.out.flush();
			 System.out.println(vPCSResponse.getHashCode()+"-check length");
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 if(mess.equalsIgnoreCase("") || !mess.contains("HTTP")){
			 System.out.flush();
			 System.out.println(vPCSResponse.getHashCode()+"-check contains");
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 String temp_mess= mess.toLowerCase();
		 if(temp_mess.contains(".php")||temp_mess.contains(".jsp")
				 ||temp_mess.contains(".wav")||temp_mess.contains(".jar")
				 ||temp_mess.contains(".rar")||temp_mess.contains(".zip")
				 ||temp_mess.contains("phtun")||temp_mess.contains("who")
				 ||temp_mess.contains("xht")||temp_mess.contains("del")
				 ||temp_mess.contains("dir")||temp_mess.contains("net")
				 ||temp_mess.contains("def")||temp_mess.contains("0x")
				 ||temp_mess.contains("/?")||temp_mess.contains("ash")
				 ||temp_mess.contains("std")||temp_mess.contains("pid")
				 ||temp_mess.contains("upd")||temp_mess.contains("loa")
				 ||temp_mess.contains("file")
				 ||temp_mess.contains("#if")||temp_mess.contains("#el")){
			 System.out.flush();
			 System.out.println(vPCSResponse.getHashCode()+"-check tails");
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 String[] type= mess.split(" ");
		 if(type.length< 3){
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 if(type[1].contains("::")){
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 String[] content= type[1].split("\\?");
		 vPCSRequest.setRequestIsRest(false);	
		 if(content.length== 2) {
			 if(content[0].contains(".woff")|| content[0].contains(".ttf")) {
				 vPCSResponse.setErrorCode(204);
				 return;//zhengque baohan + //cuowubao baohan
			 }
			 if(content[1]== null ||content[1].equals("")
					 ||!content[1].contains("=")){
				 vPCSResponse.setErrorCode(204);
				 return;//cuowubao baohan
			 }	
			 vPCSRequest.setRequestIsRest(true);	
			 if(content[0].equalsIgnoreCase("/") 
					 || content[0].contains(".ash")
					 || content[0].contains(".txt")
					 || content[0].contains(".js")
					 || content[0].contains(".css")
					 || content[0].contains(".html")){
				 vPCSRequest.setRequestIsRest(false);	
			 }
		 }
		 vPCSRequest.setRequestLink(content[0]);
		 if(!vPCSRequest.getRequestIsRest()){
			 if(content[0].equals("/")) {
				 vPCSRequest.setRequestLink(content[0]+ "index.html");	
			 }
			 System.out.flush();
			 System.out.println(vPCSResponse.getHashCode()
					 +"-check"+ vPCSRequest.getRequestLink()); 
			 return;
		 }
		 String[] column= content[1].split("&");
		 Map<String, String> data= new ConcurrentHashMap<>();
		 for(String cell:column){
			 String[] cells= cell.split("=");
			 if(cells.length> 1) {
				 String string = null;
				 try {
					 string = URLDecoder.decode(cells[1], "UTF-8");
				 } catch (UnsupportedEncodingException e) {
					 System.out.flush();
					 System.out.println(vPCSResponse.getHashCode()
							 + "-check decoding");
					 vPCSResponse.setErrorCode(204);
					 return;
				 }
				 if(null==string) {
					 System.out.flush();
					 System.out.println(vPCSResponse.getHashCode()
							 + "-check rest");
					 vPCSResponse.setErrorCode(204);
					 return;
				 } 
				 if(string.length()> 800) {//fix later
					 string= string.substring(0, 800);
				 }
				 data.put(cells[0], string);
			 }
		 }
		 //load
		 vPCSRequest.setRequestValue(data);	
	 }
 }