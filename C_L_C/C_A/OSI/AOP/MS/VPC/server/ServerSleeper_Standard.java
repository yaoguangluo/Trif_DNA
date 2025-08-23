package C_A.OSI.AOP.MS.VPC.server;

import java.net.Socket;

import DetaSrc.org.deta.boot.sets.VPCSRequest;
import DetaSrc.org.deta.boot.sets.VPCSResponse;
import DetaSrc.org.deta.boot.vpc.sleeper.SleeperHall;
import DetaSrc.org.deta.boot.vpc.sleeper.Sleeper_X;

//这是标准的sleepr函数, 我稍后会设计 frontend sleeper,  backend sleeper
//, cache sleeper, database sleeper 继承它, 避免循环嵌套。
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */

public class ServerSleeper_Standard extends Thread implements Runnable {
	public VPCSRequest vPCSRequest;
	public VPCSResponse vPCSResponse;

	public ServerSleeper_Standard() {
	}

	public ServerSleeper_Standard(String port, VPCSRequest vPCSRequest,
			VPCSResponse vPCSResponse) {
		this.vPCSRequest = vPCSRequest;
		vPCSRequest.I_RequestPort(port);
		this.vPCSResponse = vPCSResponse;
		vPCSResponse.setHashCode(this.hashCode());
	}

	// 合并
	public ServerSleeper_Standard(VPCSRequest vPCSRequest,
			VPCSResponse vPCSResponse) {
		this.vPCSRequest = vPCSRequest;
		this.vPCSResponse = vPCSResponse;
		vPCSResponse.setHashCode(this.hashCode());
	}

//	public void run() {
//		RequestRecord_C.requestIpRecoder(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//		RequestRecord_C.requestLinkRecoder(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//		RequestFilter_C.requestIpFilter(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//		RequestFilter_C.requestLinkFilter(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//		RequestFix_C.requestIpFix(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//		RequestFix_C.requestLinkFix(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//		ServerForward_Standard.IQ_ForwardType(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//		ServerForward_Standard.forwardToRestMap(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//		ServerRestMap_Standard.IQ_Response(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//		ServerRestMap_Standard.returnResponse(vPCSRequest, vPCSResponse);
//		if (vPCSResponse.getSocket().isClosed()) {
//			return;
//		}
//	}

	public void hugPillow(SleeperHall sleeper_H, Socket accept, int hashCode) {
		Sleeper_X sleeper_X = (Sleeper_X) this;
		sleeper_H.addExecSleeper(hashCode, sleeper_X);
		vPCSResponse.setSocket(accept);
		vPCSResponse.setSleeperHall(sleeper_H);
	}
}
