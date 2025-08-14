package DetaSrc.org.deta.boot.vpc.sleeper;

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
 * */public class Sleeper_X extends Sleeper_O implements Runnable{
	 public Sleeper_X(){
		 Sleeper_S hugPillows= new Sleeper_S();
		 hugPillows.vPCSRequest = new VPCSRequest();
		 hugPillows.vPCSResponse = new VPCSResponse();
		 hugPillows.vPCSResponse.setHashCode(this.hashCode());
		 pillows= hugPillows;
	 }

	 public void run(){
		 DetaSrc.org.deta.boot.vpc.controller.RequestRecordController
		 .requestIpRecoder(pillows.vPCSRequest, pillows.vPCSResponse);
		 if(null == pillows.vPCSResponse.socket) {//fix later..
			 setWaitingForShake(false, pillows.vPCSResponse.getHashCode()
					 , "-check requestIpRecoder null err");
			 return;
		 }
		 DetaSrc.org.deta.boot.vpc.controller.RequestRecordController
		 .requestLinkRecoder(pillows.vPCSRequest, pillows.vPCSResponse);
		 if(needReturn("requestLinkRecoder")) {
			 return;
		 }
		 DetaSrc.org.deta.boot.vpc.vision.ForwardVision
		 .getForwardType(pillows.vPCSRequest, pillows.vPCSResponse);
		 if(needReturn("getForwardType")) {
			 return;
		 }
		 DetaSrc.org.deta.boot.vpc.vision.ForwardVision
		 .forwardToRestMap(pillows.vPCSRequest, pillows.vPCSResponse);
		 if(needReturn("forwardToRestMap")) {
			 return;
		 }
		 DetaSrc.org.deta.boot.vpc.vision.RestMapVision
		 .returnResponse(this); 
		 pillows.vPCSResponse.closeAllBeforeGC();
		 System.out.flush();System.out.println(pillows.vPCSResponse.getHashCode()
				 +"-check returnResponse waiting for skivvy");
	 }

 }

//DetaSrc.org.deta.boot.vpc.controller.RequestFilterController
 //.requestIpFilter(vPCSRequest, vPCSResponse);

 //DetaSrc.org.deta.boot.vpc.controller.RequestFilterController
 //.requestLinkFilter(vPCSRequest, vPCSResponse);

 //DetaSrc.org.deta.boot.vpc.controller.RequestFixController
 //.requestIpFix(vPCSRequest, vPCSResponse);

 //DetaSrc.org.deta.boot.vpc.controller.RequestFixController
 //.requestLinkFix(vPCSRequest, vPCSResponse);
