package C_A.OSI.AOP.MS.VPC.server;

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
public class VPCSRequest {
    private String requestIp;
    private String requestName;
    private String requestLink;
    private boolean requestIsRest;
    private String requestFilePath;
    private String requestFileCode;
    private String requestForwardType;
    //避免循环嵌套, 加个port标识。稍后看要不要做继承分类。20210730
    private String requestPort = "";
    private String requestIpFix;
    private String requestNameFix;
    private String requestLinkFix;
    private IMV_SIQ requestValue;

    public String getRequestPort() {
        return requestPort;
    }

    public void I_RequestPort(String requestPort) {
        this.requestPort = requestPort;
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void I_RequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    public String getRequestName() {
        return requestName;
    }

    public void I_RequestName(String requestName) {
        this.requestName = requestName;
    }

    public String getRequestLink() {
        return requestLink;
    }

    public void I_RequestLink(String requestLink) {
        this.requestLink = requestLink;
    }

    public String getRequestIpFix() {
        return requestIpFix;
    }

    public void I_RequestIpFix(String requestIpFix) {
        this.requestIpFix = requestIpFix;
    }

    public String getRequestNameFix() {
        return requestNameFix;
    }

    public void I_RequestNameFix(String requestNameFix) {
        this.requestNameFix = requestNameFix;
    }

    public String getRequestLinkFix() {
        return requestLinkFix;
    }

    public void I_RequestLinkFix(String requestLinkFix) {
        this.requestLinkFix = requestLinkFix;
    }

    public IMV_SIQ getRequestValue() {
        return requestValue;
    }

    public void I_RequestValue(IMV_SIQ requestValue) {
        this.requestValue = requestValue;
    }

    public boolean getRequestIsRest() {
        return requestIsRest;
    }

    public void I_RequestIsRest(boolean requestIsRest) {
        this.requestIsRest = requestIsRest;
    }

    public String getRequestForwardType() {
        return requestForwardType;
    }

    public void I_RequestForwardType(String requestForwardType) {
        this.requestForwardType = requestForwardType;
    }

    public String getRequestFilePath() {
        return requestFilePath;
    }

    public void I_RequestFilePath(String requestFilePath) {
        this.requestFilePath = requestFilePath;
    }

    public String getRequestFileCode() {
        return requestFileCode;
    }

    public void I_RequestFileCode(String requestFileCode) {
        this.requestFileCode = requestFileCode;
    }
}
