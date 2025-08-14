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
 * */public class RequestRecordControllerBUp {
	 public static void requestIpRecoder(VPCSRequest vPCSRequest
			 , VPCSResponse vPCSResponse) {
		 vPCSRequest.setRequestIp(vPCSResponse.socket
				 .getInetAddress().getHostAddress());
		 vPCSRequest.setRequestName(vPCSResponse.socket
				 .getInetAddress().getHostName());
	 }
	 //׼���������������ʶ�����Ƽ�wapҳ��
	 public static void requestLinkRecoder(VPCSRequest vPCSRequest
			 , VPCSResponse vPCSResponse){
		 //�Ժ��޸�����Ϊform����
		 try {
			 vPCSResponse.inputStream = vPCSResponse.socket.getInputStream();
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
		 byte[] rbytes= new byte[1600];
		 int length = 0;
		 try {
			 length = vPCSResponse.inputStream.read(rbytes);
		 } catch (IOException e) {
			 // TODO Auto-generated catch block
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
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 if(mess.length()> 3000) {
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 if(mess.equalsIgnoreCase("") || !mess.contains("HTTP")){
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 if(mess.contains(".php")||mess.contains(".jsp")
				 ||mess.contains(".wav")||mess.contains(".jar")
				 ||mess.contains(".rar")
				 ||mess.contains(".zip")||mess.contains("phtun") 
				 ){
			 vPCSResponse.setErrorCode(204);
			 return;
		 }
		 String[] type= mess.split(" ");
		 if(type.length< 3){
			 return;
		 }
		 if(type[1].contains("::")){
			 return;
		 }
		 String[] content= type[1].split("\\?");
		 if(content.length== 2) {
			 if(content[0].contains(".woff")|| content[0].contains(".ttf")) {
				 vPCSRequest.setRequestIsRest(false);
				 return;
			 }else if(content[0].equalsIgnoreCase("/")
					 || content[0].contains(".js")|| content[0].contains(".css")
					 || content[0].contains(".html")){
				 vPCSRequest.setRequestIsRest(false);	
			 }else {
				 vPCSRequest.setRequestIsRest(true);
				 if(content[1]== null ||content[1].equals("")
						 ||!content[1].contains("=")){
					 return;
				 }	
			 }
		 }else {
			 vPCSRequest.setRequestIsRest(false);
		 }
		 if(vPCSRequest.getRequestIsRest()){
			 String[] column= content[1].split("&");
			 Map<String, String> data= new ConcurrentHashMap<>();
			 for(String cell:column){
				 String[] cells= cell.split("=");
				 if(cells.length> 1) {
					 String string = null;
					 try {
						 string = URLDecoder.decode(cells[1], "UTF-8");
					 } catch (UnsupportedEncodingException e) {
						 // TODO Auto-generated catch block
						 e.printStackTrace();
					 }
					 if(null==string) {
						 vPCSResponse.setErrorCode(204);
						 return;
					 } 
					 if(string.length()> 800) {
						 string= string.substring(0, 800);
					 }
					 data.put(cells[0], string);
				 }
			 }
			 //load
			 vPCSRequest.setRequestValue(data);	
		 }
		 if(content[0].equals("/")) {
			 vPCSRequest.setRequestLink(content[0]+ "index.html");	
		 }else {
			 vPCSRequest.setRequestLink(content[0]);	
		 }
	 }
 }

// if(mess.contains("dataYL")) {
//	 LocalRestCall.doDataYL(stringInputs, vPCSResponse
//			 , vPCSRequest, stringInput, mess, br, bytes
//			 , length, data);
// }
 
// //cell phone check
// if(mess.contains("dataSY")) {
//	 vPCSResponse.returnCode(404);
//	 return;
//	// LocalRestCall.doDataSY(stringInputs, vPCSResponse, vPCSRequest
//	//		 , stringInput, mess, br, bytes);
//	// return;
// }
// if(mess.contains("dataSC")) {
//	 vPCSResponse.returnCode(404);
//	 return;
//	// LocalRestCall.doDataSC(stringInputs, vPCSResponse, vPCSRequest
//	//		 , stringInput, mess, br, bytes);
//	// return;
// }
// if(mess.contains("dataTC")) {	
//	 vPCSResponse.returnCode(404);
//	 return;
//	// LocalRestCall.doDataTC(stringInputs, vPCSResponse, vPCSRequest
//	//		 , stringInput, mess, br, bytes);
//	// return;
// }
// if(mess.contains("dataSB")) {	
//	 vPCSResponse.returnCode(404);
//	 return;
//	// LocalRestCall.doDataSB(stringInputs, vPCSResponse
//	//		 , vPCSRequest, stringInput, mess, br, bytes);
//	// return;
// }
// if(mess.contains("dataPDE")|| mess.contains("object%20HTMLInputElement")) {	
//	 vPCSResponse.returnCode(404);
//	 return;
//	 // LocalRestCall.doDataPDE(stringInputs, vPCSResponse
//	//		 , vPCSRequest, stringInput, mess, br, bytes);
//	// return;
// }
// if(mess.contains("dataZT")) {
//	 vPCSResponse.returnCode(404);
//	 return;
//	 // LocalRestCall.doDataZT(stringInputs, vPCSResponse
//	//		 , vPCSRequest, stringInput, mess, br, bytes);
//	// return;
// }
 
 
 
// 
// System.out.flush();System.out.println(vPCSResponse.getHashCode()+"-bytes null");
// StableBlob.addException();
// vPCSResponse.returnCode(204);
// return;