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
import C_A.OSI.AOP.MS.VPC.server.ServerRestMap_Standard;
import C_A.OSI.AOP.MS.VPC.server.VPCSRequest;
import C_A.OSI.AOP.MS.VPC.server.VPCSResponse;
import O_V.OSI.AOP.VPC.rest.VPC;
import S_A.SVQ.stable.S_Pos;
import S_A.SVQ.stable.S_Web;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

//这里出现了VPC的标识, 让走四方看清楚, 我有很多方法来继承, 我就不用走四方的那种. VPCS 的STABLE就可以解决
//是不是我写的.
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestMap_V extends ServerRestMap_Standard {
    public static void P_Rest(App_S app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
        //VPC属于子继承, 如果不用 overrider 来分配, 也有很多方法, 如osgi, 当然, 我现在用最快map标识, 更爽.
        //indexVPCMapPillows.get(vPCSRequest.gettag())...;
        //现在仅仅deta的网站处理服务器有web页, 养疗经app还没有涉及, 因此 pillow tag
        //区分VPC 函数的rest map 设计优先级稍后
        String output = VPC.forward(app, vPCSRequest.getRequestLink()
            , vPCSRequest.getRequestValue());
        output = output.length() > 0 ? output : " ";
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(new BufferedWriter(
                new OutputStreamWriter(vPCSResponse.getSocket()
                    .getOutputStream(), StandardCharsets.UTF_8)), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        printWriter.println(S_Web.HEADER_HTTP_200_OK_DOUBLE_ENTER);
        output = output.charAt(S_Pos.INT_ZERO) == '"' ? output.substring(S_Pos.INT_ONE
        ) : output;
        output = output.charAt(output.length() - S_Pos.INT_ONE) == '"'
            ? output.substring(S_Pos.INT_ZERO, output.length() - S_Pos.INT_ONE) : output;
        printWriter.println(output.replace("\\\"", "\""));
        //20230106-System.out.println("db:"+4);
        printWriter.flush();
        printWriter.close();
        vPCSResponse.getSleeper_H().D_ThreadById(vPCSResponse.getSocket().hashCode());
    }

    public static void P_RestDB(App_S app, VPCSRequest vPCSRequest, VPCSResponse vPCSResponse) {
        //VPC属于子继承, 如果不用 overrider 来分配, 也有很多方法, 如osgi, 当然, 我现在用最快map标识, 更爽.
        //indexVPCMapPillows.get(vPCSRequest.gettag())...;
        //现在仅仅deta的网站处理服务器有web页, 养疗经app还没有涉及, 因此 pillow tag
        //区分VPC 函数的rest map 设计优先级稍后
        String output = VPC.forwardDB(app, vPCSRequest.getRequestLink().replace("//", "/")
            , vPCSRequest.getRequestValue());
        output = output.length() > 0 ? output : " ";
        PrintWriter printWriter;
        try {
            printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(vPCSResponse.getSocket()
                .getOutputStream(), StandardCharsets.UTF_8)), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        printWriter.println(S_Web.HEADER_HTTP_200_OK_DOUBLE_ENTER);
        output = output.charAt(S_Pos.INT_ZERO) == '"' ? output.substring(S_Pos.INT_ONE)
            : output;
        output = output.charAt(output.length() - S_Pos.INT_ONE) == '"' ? output.substring(S_Pos.INT_ZERO
            , output.length() - S_Pos.INT_ONE) : output;
        printWriter.println(output.replace("\\\"", "\""));
        //20230106-System.out.println("db:"+4);
        printWriter.flush();
        printWriter.close();
        vPCSResponse.getSleeper_H().D_ThreadById(vPCSResponse.getSocket().hashCode());
    }
}
