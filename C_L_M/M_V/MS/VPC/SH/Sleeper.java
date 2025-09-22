//package M_V.MS.VPC.SH;
//
//import C_A.OSI.AOP.MS.VPC.server.RequestFilter_C;
//import C_A.OSI.AOP.MS.VPC.server.RequestFix_C;
//import C_A.OSI.AOP.MS.VPC.server.RequestRecord_C;
//import C_A.OSI.AOP.MS.VPC.server.ServerSleeper_Standard;
//import ME.VPC.S.ne.App_S;
//import M_V.MS.VPC.V.Forward_V;
//import M_V.MS.VPC.V.RestMap_V;
//
////这是标准的sleepr函数, 我稍后会设计 frontend sleeper, backend sleeper , cache sleeper
////, database sleeper 继承它, 避免循环嵌套。
////开始vpcs 继承, 方便之后新陈代谢元基肽化
////罗瑶光 20210811
///*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
// * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
// * 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
// * */
//public class Sleeper extends ServerSleeper_Standard implements Runnable {
//	private App_S app;
//
//	public Sleeper() {
//	}
//
//	public void sleeping() {
//		this.start();
//	}
//
////    public void goToBedroom(VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
////        this.app = app;
////        goToBedroom(vPCSRequest, vPCSResponse);
////    }
//	public void goToBedroom(DetaSrc.org.deta.boot.sets.VPCSRequest vPCSRequest,
//			DetaSrc.org.deta.boot.sets.VPCSResponse vPCSResponse) {
//		this.vPCSRequest = vPCSRequest;
//		this.vPCSResponse = vPCSResponse;
//		vPCSResponse.setHashCode(this.hashCode());
//	}
//
//	public void goToBedroom(String port,
//			DetaSrc.org.deta.boot.sets.VPCSRequest vPCSRequest,
//			DetaSrc.org.deta.boot.sets.VPCSResponse vPCSResponse) {
//		// this.app = app;
//		vPCSRequest.I_RequestPort(port);
//		goToBedroom(vPCSRequest, vPCSResponse);
//	}
//
//	public void run() {
//		try {
//			RequestRecord_C.requestIpRecoder(vPCSRequest, vPCSResponse);
//			if (vPCSResponse.getSocket().isClosed()) {
//				return;
//			}
//			RequestRecord_C.requestLinkRecoder(vPCSRequest, vPCSResponse);
//			if (vPCSResponse.getSocket().isClosed()) {
//				return;
//			}
//			RequestFilter_C.requestIpFilter(vPCSRequest, vPCSResponse);
//			if (vPCSResponse.getSocket().isClosed()) {
//				return;
//			}
//			RequestFilter_C.requestLinkFilter(vPCSRequest, vPCSResponse);
//			if (vPCSResponse.getSocket().isClosed()) {
//				return;
//			}
//			RequestFix_C.requestIpFix(vPCSRequest, vPCSResponse);
//			if (vPCSResponse.getSocket().isClosed()) {
//				return;
//			}
//			RequestFix_C.requestLinkFix(vPCSRequest, vPCSResponse);
//			if (vPCSResponse.getSocket().isClosed()) {
//				return;
//			}
//			Forward_V.IQ_ForwardType(vPCSRequest, vPCSResponse);
//			if (vPCSResponse.getSocket().isClosed()) {
//				return;
//			}
//			Forward_V.forwardToRestMap(app, vPCSRequest, vPCSResponse);
//			if (vPCSResponse.getSocket().isClosed()) {
//				return;
//			}
//			RestMap_V.IQ_Response(vPCSRequest, vPCSResponse);
//			if (vPCSResponse.getSocket().isClosed()) {
//				return;
//			}
//			RestMap_V.returnResponse(vPCSRequest, vPCSResponse);
//			if (vPCSResponse.getSocket().isClosed()) {
//				return;
//			}
//		} catch (Exception e) {
//			vPCSResponse.returnErrorCode(500);
//			e.printStackTrace();
//		}
//	}
//}
