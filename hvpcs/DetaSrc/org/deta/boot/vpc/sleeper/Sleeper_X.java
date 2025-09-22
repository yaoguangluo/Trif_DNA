package DetaSrc.org.deta.boot.vpc.sleeper;

import C_A.OSI.AOP.MS.VPC.server.ServerForward_Standard;
import DetaSrc.org.deta.boot.sets.Sleeper_S;
import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Sleeper_X extends Sleeper_O implements Runnable {
	public Sleeper_X() {
		Sleeper_S hugPillows = new Sleeper_S();
		hugPillows.vPCSRequest = new VPCSRequest();
		hugPillows.vPCSResponse = new VPCSResponse();
		hugPillows.vPCSResponse.setHashCode(this.hashCode());
		pillows = hugPillows;
	}

	public void run() {
		// later trif
		DetaSrc.org.deta.boot.vpc.controller.RequestRecordController
				.requestIpRecoder(pillows.vPCSRequest, pillows.vPCSResponse);
		if (null == pillows.vPCSResponse.socket) {// fix later..
			setWaitingForShake(false, pillows.vPCSResponse.getHashCode(),
					"-check requestIpRecoder null err");
			return;
		}
		DetaSrc.org.deta.boot.vpc.controller.RequestRecordController
				.requestLinkRecoder(pillows.vPCSRequest, pillows.vPCSResponse);
		if (needReturn("requestLinkRecoder")) {
			return;
		}
//		DetaSrc.org.deta.boot.vpc.vision.ForwardVision
//				.getForwardType(pillows.vPCSRequest, pillows.vPCSResponse);
//		if (needReturn("getForwardType")) {
//			return;
//		}
//		DetaSrc.org.deta.boot.vpc.vision.ForwardVision
//				.forwardToRestMap(pillows.vPCSRequest, pillows.vPCSResponse);
//		if (needReturn("forwardToRestMap")) {
//			return;
//		}

		ServerForward_Standard.IQ_ForwardType(pillows.vPCSRequest, pillows.vPCSResponse);
		if (needReturn("getForwardType")) {
			return;
		}
		ServerForward_Standard.forwardToRestMap(pillows.vPCSRequest, pillows.vPCSResponse);
		if (needReturn("forwardToRestMap")) {
			return;
		}

//		ServerForward_Standard.IQ_ForwardType(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//		ServerForward_Standard.forwardToRestMap(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}

		DetaSrc.org.deta.boot.vpc.vision.RestMapVision.returnResponse(this);
		pillows.vPCSResponse.closeAllBeforeGC();
		System.out.flush();
		System.out.println(pillows.vPCSResponse.getHashCode()
				+ "-check returnResponse waiting for skivvy");
	}

}

//DetaSrc.org.deta.boot.vpc.controller.RequestFilterController
// .requestIpFilter(vPCSRequest, vPCSResponse);

// DetaSrc.org.deta.boot.vpc.controller.RequestFilterController
// .requestLinkFilter(vPCSRequest, vPCSResponse);

// DetaSrc.org.deta.boot.vpc.controller.RequestFixController
// .requestIpFix(vPCSRequest, vPCSResponse);

// DetaSrc.org.deta.boot.vpc.controller.RequestFixController
// .requestLinkFix(vPCSRequest, vPCSResponse);
