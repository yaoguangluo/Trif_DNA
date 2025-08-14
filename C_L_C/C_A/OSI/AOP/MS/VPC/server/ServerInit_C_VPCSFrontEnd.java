package C_A.OSI.AOP.MS.VPC.server;
import ME.VPC.S.ne.App_S;
import M_V.MS.VPC.PP.Time_P;
import M_V.MS.VPC.SH.Sleeper;
import M_V.MS.VPC.SH.Sleeper_H;
import exception.thread.DetaThread;
import utils.DetaUtil;
import YLJ_HRJ.ME.VPC.S.configs.ConfigIndex;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Properties;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ServerInit_C_VPCSFrontEnd {
    private ServerSocket server;
    @SuppressWarnings("unused")
    private Properties properties;
    private App_S app;
    private int port;

    {
        properties = new Properties();
        //20230106-System.out.println("----德塔VPCS前端服务器资源载入:成功！");
    }

    public void IV_() {
        try {
            port = Integer.valueOf(app.frontendTxt);
            //port= Config.detaVPCSFrontEndPort;
            server = new ServerSocket(port);
            //20230106-System.out.println("----德塔VPCS前端服务器端口启动:" + port);
            if (null != app.dbConfigPath && !app.dbConfigPath.isEmpty()) {
                DetaUtil.IV_DB(app.dbConfigPath);//稍后整理下
            } else {
                DetaUtil.IV_DB(ConfigIndex.detaDBPath);
            }
            //20230106-System.out.println("----德塔VPCS前端服务器DMA确认:成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void haoHiYooFaker(Sleeper_H sleeper_H) {
        sleeper_H.callSkivvy();
    }

    public void IV_Server(App_S app) {
        this.app = app;
        //20230106-System.out.println("");
        //20230106-System.out.println("----DETA VPCS--2.0");
        //20230106-System.out.println("----Author: 罗瑶光");
        //20230106-System.out.println("----浏阳德塔软件开发有限公司开源项目");
        Time_P time_P = new Time_P();
        time_P.begin();
        Sleeper_H sleeper_H = new Sleeper_H();
        IV_();
        time_P.end();
        //20230106-System.out.println("----德塔VPCS前端服务器启动一切正常-总耗时:"+ time_P.duration()+ "毫秒");
        while (true) {
            if (sleeper_H.getThreadsCount() < 500) {
                VPCSRequest vPCSRequest = new VPCSRequest();
                VPCSResponse vPCSResponse = new VPCSResponse();
                Sleeper sleeper = new Sleeper();
                sleeper.goToBedroom(vPCSRequest, vPCSResponse);
                try {
                    sleeper.hugPillow(sleeper_H, server.accept(), sleeper.hashCode());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                sleeper.start();
                DetaThread.sleepDeta(30);
            } else {
                haoHiYooFaker(sleeper_H);
            }
        }
    }
}
