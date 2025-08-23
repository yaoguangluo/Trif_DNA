package DetaSrc.org.deta.boot.sets;

import java.util.Map;

import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings("unused")
public class Request_S {
	private String requestIp;
	private String requestName;
	private String requestLink;
	protected boolean requestIsRest;
	private String requestFilePath;
	private String requestFileCode;
	private String requestForwardType;
	protected String requestPort = "";
	private String requestIpFix;
	private String requestNameFix;
	private String requestLinkFix;
	// private Map<String, String> requestValue;
	private IMV_SIQ requestValue;
	public boolean waitingForShake = true;

	public String getRequestIp() {
		return requestIp;
	}

	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public String getRequestLink() {
		return requestLink;
	}

	public void setRequestLink(String requestLink) {
		this.requestLink = requestLink;
	}

	public String getRequestIpFix() {
		return requestIpFix;
	}

	public void setRequestIpFix(String requestIpFix) {
		this.requestIpFix = requestIpFix;
	}

	public String getRequestNameFix() {
		return requestNameFix;
	}

	public void setRequestNameFix(String requestNameFix) {
		this.requestNameFix = requestNameFix;
	}

	public String getRequestLinkFix() {
		return requestLinkFix;
	}

	public void setRequestLinkFix(String requestLinkFix) {
		this.requestLinkFix = requestLinkFix;
	}

	public IMV_SIQ getRequestValue() {
		return requestValue;
	}

	public void setRequestValue(IMV_SIQ requestValue) {
		this.requestValue = requestValue;
	}

	public String getRequestForwardType() {
		return requestForwardType;
	}

	public void setRequestForwardType(String requestForwardType) {
		this.requestForwardType = requestForwardType;
	}

	public String getRequestFilePath() {
		return requestFilePath;
	}

	public void setRequestFilePath(String requestFilePath) {
		this.requestFilePath = requestFilePath;
	}

	public String getRequestFileCode() {
		return requestFileCode;
	}

	public void setRequestFileCode(String requestFileCode) {
		this.requestFileCode = requestFileCode;
	}

}