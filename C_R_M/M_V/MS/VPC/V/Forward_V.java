/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package M_V.MS.VPC.V;

import ME.VPC.S.ne.App_S;
import C_A.OSI.AOP.MS.VPC.server.ServerForward_Standard;
import C_A.OSI.AOP.MS.VPC.server.VPCSRequest;
import C_A.OSI.AOP.MS.VPC.server.VPCSResponse;
import S_A.SVQ.stable.S_HTTP;
import S_A.SVQ.stable.S_Web;

//import OSI.AOP.VPC.PP.port_E.RestLoginPort_E;
//import PEU.P.map.VtoV;
//合并 数据库和 前端的 vison文件
//罗瑶光 20210730
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
public class Forward_V extends ServerForward_Standard {
    public static void forwardToRestMap(App_S app, VPCSRequest vPCSRequest
        , VPCSResponse vPCSResponse) {
        if (null == vPCSRequest || null == vPCSRequest.getRequestForwardType()) {
            vPCSResponse.return404();
            return;
        }
        if (vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_REST)) {
            //与其设计个sleeper继承, 不如在这里设计个condition函数, 然后根据port识别
            //来继承这个condition 就是了。, 罗瑶光 20210730
            if (vPCSRequest.getRequestPort().equals(S_HTTP.PORT_DATABASE)) {
                RestMap_V.P_RestDB(app, vPCSRequest, vPCSResponse);
            } else {
                RestMap_V.P_Rest(app, vPCSRequest, vPCSResponse);
            }
        }
        if (vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BYTES)) {
            RestMap_V.P_Bytes(vPCSRequest, vPCSResponse);
        }
        if (vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BUFFER)) {
            RestMap_V.P_Buffer(vPCSRequest, vPCSResponse);
        }
        if (vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BYTES_BUFFER)) {
            RestMap_V.P_BufferBytes(vPCSRequest, vPCSResponse);
        }
        if (vPCSRequest.getRequestForwardType().equalsIgnoreCase(S_Web.STREAM_BYTES_WITHOUT_ZIP)) {
            RestMap_V.P_BytesWithoutZip(vPCSRequest, vPCSResponse);
        }
    }
}
