package S_A.SEM.bloom;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public interface StaticFunctionMapC_AOPM_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    //BootVPCSBackEnd extends Thread
    public void BootVPCSBackEndWithValues(App NE);
    public void BootVPCSBackEnd(App NE);

    // 因为首页已经init了, 我之后会改成_A带入就是了. 罗瑶光20210420
    //	public void IV_() ;
    //	public void bootBackEnd() ;
    //
    //	//RequestFilter_C {
    //	public void main(String[] args);
    public void requestIpFilter(App NE);

    public void requestLinkFilter(App NE);

    public void requestIpFilterVPCS(App NE);//

    public void requestLinkFilterVPCS(App NE);

    public void IV_BlockList(App NE);

    //RequestFix_C {
  //  public void requestIpFix();

   // public void requestLinkFix();

    public void requestIpFix(App NE);

    public void requestLinkFix(App NE);

    //RequestRecord_C {
    public void requestIpRecoder(App NE);

    public void requestLinkRecoder(App NE);
            ;

    //ServerForward_Standard {
   // public void IQ_ForwardType(App NE);

   // public void forwardToRestMap();

    public void IQ_ForwardType(App NE);

    public void forwardToRestMap(App NE);

    //ServerInit_C_VPCSFrontEnd {// 稍后命名区分下
    public void IV_ServerInit_C_VPCSFrontEnd(App NE);

    public void IV_ServerVPCSFrontEnd(App NE);

    //ServerInit_C {
   // public void IV_Service();

    public void IV_ServerServerInit_C(App NE);

    //ServerInit_Standard {
    public void IV_Service(App NE);

    public void IV_Server(App NE);

    //ServerRestMap_Standard {
   // public void IQ_Response();

   // public void returnResponse();

    public void IQ_Response(App NE);

    public void returnResponse(App NE);

    public void P_Rest(App NE);

    public void P_View(App NE);

    public void P_Bytes(App NE);

    public void P_Buffer(App NE);

    public void P_BufferBytes(App NE);

    public void P_BytesWithoutZip(App NE);

    // ServerSleeper_Standard extends Thread implements Runnable{
    public void hugPillow(App NE);

    //ServerVPC_Standard {
    public String forward(App NE);

    public String getCode(App NE);

    public String getFilePath(App NE);
    //小接口略
}
