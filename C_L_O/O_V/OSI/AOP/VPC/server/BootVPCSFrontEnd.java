package O_V.OSI.AOP.VPC.server;
import ME.VPC.S.ne.App_S;
import C_A.OSI.AOP.MS.VPC.server.ServerInit_C_VPCSFrontEnd;

//VPCS整合后修正, 稍后优化.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class BootVPCSFrontEnd extends Thread {
    private App_S app;

    public BootVPCSFrontEnd(App_S app) {
        this.app = app;
    }

    public static void main(String[] args) {
        new BootVPCSFrontEnd(null).bootFrontEnd();
    }

    public void bootFrontEnd() {
        new ServerInit_C_VPCSFrontEnd().IV_Server(this.app);
    }

    public void run() {
        new ServerInit_C_VPCSFrontEnd().IV_Server(this.app);
    }
}
