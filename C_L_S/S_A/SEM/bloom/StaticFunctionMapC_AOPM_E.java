package S_A.SEM.bloom;

import C_A.OSI.AOP.MS.VPC.server.RequestFilter_C;
import C_A.OSI.AOP.MS.VPC.server.RequestFix_C;
import C_A.OSI.AOP.MS.VPC.server.RequestRecord_C;
import C_A.OSI.AOP.MS.VPC.server.ServerForward_Standard;
import C_A.OSI.AOP.MS.VPC.server.ServerInit_C;
import C_A.OSI.AOP.MS.VPC.server.ServerInit_C_VPCSFrontEnd;
import C_A.OSI.AOP.MS.VPC.server.ServerInit_Standard;
import C_A.OSI.AOP.MS.VPC.server.ServerRestMap_Standard;
import C_A.OSI.AOP.MS.VPC.server.ServerSleeper_Standard;
import C_A.OSI.AOP.MS.VPC.server.ServerVPC_Standard;
import C_A.OSI.AOP.MS.VPC.server.VPCSRequest;
import C_A.OSI.AOP.MS.VPC.server.VPCSResponse;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.M.app.App;
import M_V.MS.VPC.SH.Sleeper_H;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;

import javax.swing.JTextPane;
import java.net.Socket;
//神一样的思绪不应该表达出来。因为这是2025年的东西。
//著作权人+ 作者= 罗瑶光
//vpcs 服务器的 STANDARD 标准示例
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticFunctionMapC_AOPM_E implements StaticFunctionMapC_AOPM_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    //BootVPCSBackEnd extends Thread
    public void BootVPCSBackEndWithValues(App NE) {
        App app= NE._I_U.app;
        EmotionMap_E emotionMap_E= NE._I_U.emotionMap_E;//later..
        NERO_C_OneTime_E nERO_C_OneTime_E= NE._I_U.nERO_C_OneTime_E;
        Nlp_CE_X_S nlp_CE_X_S= NE._I_U.nlp_CE_X_S;
        Pos_X_P pos_X_P= NE._I_U.pos_X_P;
        SensingTest sensingTest= NE._I_U.sensingTest;
        FMHMMListOneTime_E fMHMMListOneTime_E= NE._I_U.fMHMMListOneTime_E;
        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E= NE._I_U.quick6DLuoYaoguangSort3DMap_E;
        new C_A.OSI.AOP.MS.VPC.server.BootVPCSBackEnd(app.app_S, NE);
    }

    public void BootVPCSBackEnd(App NE) {
        new C_A.OSI.AOP.MS.VPC.server.BootVPCSBackEnd();
    }
    //	//	// 因为首页已经init了, 我之后会改成_A带入就是了. 罗瑶光20210420 可自适应稍后vpcs细化接口
    //	//	public void IV_(){
    //	//	}
    //	public void bootBackEnd() {
    //
    //	}

    //RequestFilter_C {
    //	public void main(String[] args){
    //
    //	}
    public void requestIpFilter(App NE) {
        Socket socket= NE._I_U.socket;
        RequestFilter_C.requestIpFilter(socket);
    }

    public void requestLinkFilter(App NE) {
        Socket socket= NE._I_U.socket;
        RequestFilter_C.requestLinkFilter(socket);
    }

    public void requestIpFilterVPCS(App NE) {
        VPCSRequest vPCSRequest= NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse= NE._I_U.vPCSResponse;
        RequestFilter_C.requestIpFilter(vPCSRequest, vPCSResponse);
    }

    public void requestLinkFilterVPCS(App NE) {
        VPCSRequest vPCSRequest= NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse= NE._I_U.vPCSResponse;
        RequestFilter_C.requestLinkFilter(vPCSRequest, vPCSResponse);
    }

    public void IV_BlockList(App NE) {
        RequestFilter_C.IV_BlockList();
    }

    //RequestFix_C {
    public void requestIpFix(App NE) {
        Socket socket= NE._I_U.socket;
        RequestFix_C.requestIpFix(socket);
    }

    public void requestLinkFix(App NE) {
        Socket socket= NE._I_U.socket;
        RequestFix_C.requestLinkFix(socket);
    }

    public void requestIpFixVPCS(App NE) {
        VPCSRequest vPCSRequest= NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse= NE._I_U.vPCSResponse;
        RequestFix_C.requestIpFix(vPCSRequest, vPCSResponse);
    }

    public void requestLinkFixVPCS(App NE) {
        VPCSRequest vPCSRequest= NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse= NE._I_U.vPCSResponse;
        RequestFix_C.requestLinkFix(vPCSRequest, vPCSResponse);
    }

    //RequestRecord_C {
    public void requestIpRecoder(App NE) {
        VPCSRequest vPCSRequest= NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse= NE._I_U.vPCSResponse;
        RequestRecord_C.requestIpRecoder(vPCSRequest, vPCSResponse);
    }

    public void requestLinkRecoder(App NE) {
        VPCSRequest vPCSRequest= NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse= NE._I_U.vPCSResponse;
        RequestRecord_C.requestLinkRecoder(vPCSRequest, vPCSResponse);
    }

    //ServerForward_Standard {
    public void IQ_ForwardType(App NE) {
        Socket socket= NE._I_U.socket;
        ServerForward_Standard.IQ_ForwardType(socket);
    }

    public void forwardToRestMap(App NE) {
        Socket socket= NE._I_U.socket;
        ServerForward_Standard.forwardToRestMap(socket);
    }

    public void IQ_ForwardTypeVPCS(App NE) {
        VPCSRequest vPCSRequest= NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse= NE._I_U.vPCSResponse;
        ServerForward_Standard.IQ_ForwardType(vPCSRequest, vPCSResponse);
    }

    public void forwardToRestMapVPCS(App NE) {
        VPCSRequest vPCSRequest= NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse= NE._I_U.vPCSResponse;
        ServerForward_Standard.forwardToRestMap(vPCSRequest, vPCSResponse);
    }

    //ServerInit_C_VPCSFrontEnd {// 稍后命名区分下 改成 return
    public void IV_ServerInit_C_VPCSFrontEnd(App NE) {
        new ServerInit_C_VPCSFrontEnd();
    }

    public void IV_ServerVPCSFrontEnd(App NE) {
        App app= NE._I_U.app;//地址而已，
        new ServerInit_C_VPCSFrontEnd().IV_Server(app.app_S);
    }

    //ServerInit_C {
    public void IV_ServiceNeedsPane(App NE) {
        JTextPane jTextPane= NE._I_U.jTextPane;
        AES_QMS_XSD_TIH frontendTxt= NE._I_U.frontendTxt;
        new ServerInit_C().IV_Service(jTextPane, frontendTxt._S_);
    }

    public void IV_ServerServerInit_C(App NE) {
        App app= NE._I_U.app;
        new ServerInit_C().IV_Server(app);
    }

    //ServerInit_Standard {
    public void IV_Service(App NE) {
        AES_QMS_XSD_TIH serverName= NE._I_U.serverName;
        AES_QMS_XSD_TIH frontendTxt=NE._I_U.frontendTxt;
        new ServerInit_Standard().IV_Service(frontendTxt._S_, serverName._S_);
    }

    public void IV_Server(App NE) {
        AES_QMS_XSD_TIH serverName= NE._I_U.serverName;
        AES_QMS_XSD_TIH frontendTxt=NE._I_U.frontendTxt;
        new ServerInit_Standard().IV_Server(frontendTxt._S_, serverName._S_);
    }

    //ServerRestMap_Standard {
    public void IQ_Response(App NE) {
        Socket socket=NE._I_U.socket;
        ServerRestMap_Standard.IQ_Response(socket);
    }

    public void returnResponse(App NE) {
        Socket socket=NE._I_U.socket;
        ServerRestMap_Standard.returnResponse(socket);
    }

    public void IQ_ResponseVPCS(App NE) {
        VPCSRequest vPCSRequest=NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse=NE._I_U.vPCSResponse;
        ServerRestMap_Standard.IQ_Response(vPCSRequest, vPCSResponse);
    }

    public void returnResponseVPCS(App NE) {
        VPCSRequest vPCSRequest=NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse=NE._I_U.vPCSResponse;
        ServerRestMap_Standard.returnResponse(vPCSRequest, vPCSResponse);
    }

    public void P_Rest(App NE) {
        VPCSRequest vPCSRequest=NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse=NE._I_U.vPCSResponse;
        ServerRestMap_Standard.P_Rest(vPCSRequest, vPCSResponse);
    }

    public void P_View(App NE) {
        VPCSRequest vPCSRequest=NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse=NE._I_U.vPCSResponse;
        ServerRestMap_Standard.P_View(vPCSRequest, vPCSResponse);
    }

    public void P_Bytes(App NE) {
        VPCSRequest vPCSRequest=NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse=NE._I_U.vPCSResponse;
        ServerRestMap_Standard.P_Bytes(vPCSRequest, vPCSResponse);
    }

    public void P_Buffer(App NE) {
        VPCSRequest vPCSRequest=NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse=NE._I_U.vPCSResponse;
        ServerRestMap_Standard.P_Buffer(vPCSRequest, vPCSResponse);
    }

    public void P_BufferBytes(App NE) {
        VPCSRequest vPCSRequest=NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse=NE._I_U.vPCSResponse;
        ServerRestMap_Standard.P_BufferBytes(vPCSRequest, vPCSResponse);
    }

    public void P_BytesWithoutZip(App NE) {
        VPCSRequest vPCSRequest=NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse=NE._I_U.vPCSResponse;
        ServerRestMap_Standard.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
    }

    // ServerSleeper_Standard extends Thread implements Runnable{
    public void hugPillow(App NE) {
        Sleeper_H sleeper_H=NE._I_U.sleeper_H;
        Socket accept=NE._I_U.accept;
        int hashCode=NE._I_U.hashCode;
        VPCSRequest vPCSRequest=NE._I_U.vPCSRequest;
        VPCSResponse vPCSResponse=NE._I_U.vPCSResponse;
        new ServerSleeper_Standard(vPCSRequest, vPCSResponse).hugPillow(sleeper_H
                , accept, hashCode);
    }

    //ServerVPC_Standard {
    public String forward(App NE) {
        AES_QMS_XSD_TIH string=NE._I_U.string;
        IMV_SIQ data=NE._I_U.dataMap;
        return ServerVPC_Standard.forward(string._S_, data);
    }

    public String getCode(App NE) {
        AES_QMS_XSD_TIH filePath=NE._I_U.FilePath;
        return ServerVPC_Standard.getCode(filePath._S_);
    }

    public String getFilePath(App NE) {
        AES_QMS_XSD_TIH string=NE._I_U.string;
        return ServerVPC_Standard.getFilePath(string._S_);
    }
    //小接口略
}
