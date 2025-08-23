package DetaSrc.org.deta.boot.vpc.sleeper;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Sleeper_O extends Sleeper implements Runnable {

	public boolean needReturn(String string) {// ��Դapi sonar lint ��д�Ż�
		if (null == pillows.vPCSResponse.socket) {// fix later..
			pillows.vPCSResponse.closeAllBeforeGC();
			setWaitingForShake(false, pillows.vPCSResponse.getHashCode(),
					"-check " + string + " null err");
			return true;
		}
		if (204 == pillows.vPCSResponse.errorCode) {// fix later..
			pillows.vPCSResponse.returnCode(pillows.vPCSResponse.errorCode);
			setWaitingForShake(false, pillows.vPCSResponse.getHashCode(),
					"-check " + string + " 404 err");
			return true;
		}
		return false;
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
