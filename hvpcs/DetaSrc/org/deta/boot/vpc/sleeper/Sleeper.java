package DetaSrc.org.deta.boot.vpc.sleeper;
import java.io.IOException;

import DetaSrc.org.deta.boot.sets.Sleeper_S;
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
 * */public class Sleeper extends Thread{
	 public Sleeper_S pillows;
	 public void setWaitingForShake(boolean isWaitingForShake
			 , Integer integer, String string) {
		 pillows.vPCSRequest.setWaitingForShake(isWaitingForShake);
		 System.out.flush();System.out.println(integer
				 +"- set WaitingForShake(false)");
		 System.out.flush();System.out.println( pillows.vPCSResponse.getHashCode()
				 + string);
	 }


	 public void closeInputStream() throws IOException {
		 if(null!= this.pillows.vPCSResponse) {
			 this.pillows.vPCSResponse.closeInputStream();
		 }
	 }

	 public void closeOutputStream() throws IOException {
		 if(null!= this.pillows.vPCSResponse) {
			 this.pillows.vPCSResponse.closeOutputStream();
		 }
	 }

	 public void closeAllBeforeGC() throws IOException
	 , InterruptedException {
		 if(null!= this.pillows.vPCSRequest) {
			 this.pillows.vPCSRequest.closeAllBeforeGC();
		 }
		 if(null!= this.pillows.vPCSResponse) { 
			 pillows.vPCSResponse.closeAllBeforeGC();
		 }
	 }

	 public void feedAndCloseAllBeforeGC() throws IOException
	 , InterruptedException {
		 if(null!= this.pillows.vPCSResponse) {
			 pillows.vPCSResponse.returnCode(204);
		 }
	 }

	 public void closePrintWriter() throws IOException {
		 if(null!= this.pillows.vPCSResponse) {
			 this.pillows.vPCSResponse.closePrintWriter();
		 }
	 }

	 public void closeSocket() throws IOException {
		 if(null!= this.pillows.vPCSResponse) {
			 this.pillows.vPCSResponse.closeSocket();
		 }
	 }

	 public VPCSRequest getVPCSRequest() {
		 return this.pillows.vPCSRequest;
	 }

	 public Sleeper(){
		 pillows= new Sleeper_S();
		 pillows.vPCSRequest = new VPCSRequest();
		 pillows.vPCSResponse = new VPCSResponse();
		 pillows.vPCSResponse.setHashCode(this.hashCode());
	 }

	 public boolean getWaitingForShake() {
		 return pillows.vPCSRequest.getWaitingForShake();
	 }
 }

// public void run(){
// DetaSrc.org.deta.boot.vpc.controller.RequestRecordController
// .requestIpRecoder(vPCSRequest, vPCSResponse);
// if(null == vPCSResponse.socket) {//fix later..
//	 setWaitingForShake(false);
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"- set WaitingForShake(false)");
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"-check requestIpRecoder null err");
//	 return;
// }
// DetaSrc.org.deta.boot.vpc.controller.RequestRecordController
// .requestLinkRecoder(vPCSRequest, vPCSResponse);
// if(null == vPCSResponse.socket) {//fix later..
//	 setWaitingForShake(false);
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"- set WaitingForShake(false)");
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"-check requestLinkRecoder null err");
//	 return;
// }
// //DetaSrc.org.deta.boot.vpc.controller.RequestFilterController
// //.requestIpFilter(vPCSRequest, vPCSResponse);
//
// //DetaSrc.org.deta.boot.vpc.controller.RequestFilterController
// //.requestLinkFilter(vPCSRequest, vPCSResponse);
//
// //DetaSrc.org.deta.boot.vpc.controller.RequestFixController
// //.requestIpFix(vPCSRequest, vPCSResponse);
//
// //DetaSrc.org.deta.boot.vpc.controller.RequestFixController
// //.requestLinkFix(vPCSRequest, vPCSResponse);
//
// if(204 == vPCSResponse.errorCode) {//fix later..
//	 vPCSResponse.returnCode(vPCSResponse.errorCode);
//	 setWaitingForShake(false);
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"- set WaitingForShake(false)");
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"-check requestLinkRecoder 204 err");
//	 return;
// }
// DetaSrc.org.deta.boot.vpc.vision.ForwardVision
// .getForwardType(vPCSRequest, vPCSResponse);
// if(null == vPCSResponse.socket) {//fix later..
//	 vPCSResponse.closeAllBeforeGC();
//	 setWaitingForShake(false);
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"- set WaitingForShake(false)");
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"-check getForwardType null err");
//	 return;
// }
// if(204 == vPCSResponse.errorCode) {//fix later..
//	 vPCSResponse.returnCode(vPCSResponse.errorCode);
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"- set WaitingForShake(false)");
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"-check getForwardType 204 err");
//	 setWaitingForShake(false);
//	 return;
// }
// DetaSrc.org.deta.boot.vpc.vision.ForwardVision
// .forwardToRestMap(vPCSRequest, vPCSResponse);
// if(null == vPCSResponse.socket) {//fix later.. 
//	 vPCSResponse.closeAllBeforeGC();
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"- set WaitingForShake(false)");
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"-check forwardToRestMap null err");
//	 setWaitingForShake(false);
//	 return;
// }
// if(204 == vPCSResponse.errorCode) {//fix later..
//	 vPCSResponse.returnCode(vPCSResponse.errorCode);
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"- set WaitingForShake(false)");
//	 System.out.flush();System.out.println(vPCSResponse.getHashCode()
//			 +"-check forwardToRestMap 404 err");
//	 setWaitingForShake(false);
//	 return;
// }
// DetaSrc.org.deta.boot.vpc.vision.RestMapVision
// .returnResponse(this); 
// vPCSResponse.closeAllBeforeGC();
// System.out.flush();System.out.println(vPCSResponse.getHashCode()
//		 +"-check returnResponse waiting for skivvy");
//}