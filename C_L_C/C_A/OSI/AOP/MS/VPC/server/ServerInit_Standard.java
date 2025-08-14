package C_A.OSI.AOP.MS.VPC.server;

import M_V.MS.VPC.PP.Time_P;
import M_V.MS.VPC.SH.Sleeper_H;
import S_A.SVQ.stable.S_Web;

import java.io.IOException;
import java.net.ServerSocket;

//VPCS标准函数, 准备之后所有服务器 走继承这个文件。
//罗瑶光 20200811
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ServerInit_Standard {
    private ServerSocket server;
    private int port;

    public void IV_Service(String frontendTxt, String serverName) {
        try {
            //port= Integer.parseInt(properties.getProperty(S_Data.TCP_PORT));
            port = Integer.valueOf(frontendTxt);
            //port= Config.detaVPCSDBPort;
            server = new ServerSocket(port);
            //20230106-System.out.println("----德塔VPCS"+ serverName+ "端口启动:" + port);
            //20230106-System.out.println("----德塔VPCS"+ serverName+ "DMA确认:成功！");
            RequestFilter_C.IV_BlockList();
            //20230106-System.out.println("----德塔VPCS"+ serverName+ "IP过滤服务启动:成功！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void haoHiYooFaker(Sleeper_H sleeper_H) {
        sleeper_H.callSkivvy();
    }

    public void IV_Server(String frontendTxt, String serverName) {
        //20230106-System.out.println("----DETA VPCS--3.0");
        //20230106-System.out.println("----Author: 罗瑶光");
        //20230106-System.out.println("----浏阳德塔软件开发有限公司开源项目");
        Time_P time_P = new Time_P();
        time_P.begin();
        Sleeper_H sleeper_H = new Sleeper_H();
        IV_Service(frontendTxt, serverName);
        time_P.end();
        //20230106-System.out.println("----德塔VPCS"+ serverName+ "启动一切正常-总耗时:"
        //		+ time_P.duration()+ "毫秒");
        while (true) {
            if (sleeper_H.getThreadsCount() < S_Web.SLEEPERS_RANGE) {
                VPCSRequest vPCSRequest = new VPCSRequest();
                VPCSResponse vPCSResponse = new VPCSResponse();
                ServerSleeper_Standard sleeper
                    = new ServerSleeper_Standard(frontendTxt, vPCSRequest, vPCSResponse);
                try {
                    sleeper.hugPillow(sleeper_H, server.accept()
                            , sleeper.hashCode());
                    sleeper.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                haoHiYooFaker(sleeper_H);
            }
        }
    }
}
