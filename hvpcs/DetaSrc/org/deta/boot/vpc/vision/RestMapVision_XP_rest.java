package DetaSrc.org.deta.boot.vpc.vision;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import DetaSrc.org.deta.boot.rest.VPC;
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
 * */public class RestMapVision_XP_rest extends RestMapVision {
	 public static void processRest(VPCSRequest vPCSRequest
			 , VPCSResponse vPCSResponse) {
		 String output;
		 try {
			 output = VPC.forward(vPCSRequest.getRequestLink()
					 , vPCSRequest.getRequestValue());
			 vPCSResponse.printWriter = new PrintWriter(new BufferedWriter(
					 new OutputStreamWriter(vPCSResponse.socket
							 .getOutputStream(), "UTF-8")), true);
		 }catch(Exception e) {
			 System.out.flush();System.out.println(e.getMessage());
			 System.out.flush();System.out.println(vPCSResponse.getHashCode()
					 + "-processRest err");
			 System.out.flush();System.out.println(vPCSRequest.getRequestLink());
			 System.out.flush();System.out.println(vPCSRequest.getRequestFilePath());
			 StableBlob.addException();
			 return;
		 }
		 if(output.length()> 0) {
			 System.out.flush();System.out.println("success YL");
			 vPCSResponse.printWriter.flush();
			 vPCSResponse.printWriter.println("HTTP/1.1 200 OK\n\n"); 
			 output=output.charAt(0)=='"'?output.substring(1, output.length()):output;
			 output=output.charAt(output.length()-1)=='"'?output.substring(0
					 , output.length()-1):output;
			 vPCSResponse.printWriter.flush();
			 vPCSResponse.printWriter.println(output.replace("\\\"", "\""));
			 vPCSResponse.printWriter.close();	
			 System.out.flush();System.out.println(vPCSResponse.getHashCode() + "-f");
		 }else {
			 vPCSResponse.printWriter.flush();
			 vPCSResponse.printWriter.println("HTTP/1.1 204 OK\n\n"); 
			 vPCSResponse.printWriter.close();	
			 System.out.flush();System.out.println(vPCSResponse.getHashCode()
					 + "-processRest length err");
			 System.out.flush();System.out.print(vPCSRequest.getRequestLink());
			 System.out.flush();System.out.print(vPCSRequest.getRequestFilePath());
			 return;
		 }	
	 }
 }