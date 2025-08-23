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

import C_A.OSI.AOP.MS.VPC.server.ServerForward_Standard;
import ME.VPC.M.app.App;
import O_V.OSI.AOP.VPC.rest.VPCBackEnd;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestMap extends ServerForward_Standard {
    public static void P(String[] type, Socket socket, App NE) {
        String[] column = type[1].split("&");
        IMV_SIQ data = new IMV_SIQ();
        for (String cell : column) {
            String[] cells = cell.split(S_ShellETL.SHELL_ETL_SIMPLE_EUQALS);
            try {
                data.put(cells[0], URLDecoder.decode(cells[1], "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        String output = "";
        try {
            output = VPCBackEnd.forward(type[0], data, NE);
//			//20230106-System.out.println(output);
            PrintWriter pw = new PrintWriter(new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()
                            , StandardCharsets.UTF_8)), true);
            pw.println("HTTP/1.1 200 OK\n\n");
            output = output.charAt(0) == '"'
                    ? output.substring(1) : output;
            output = output.charAt(output.length() - 1) == '"' ? output.substring(0
                    , output.length() - 1) : output;
            pw.println(output.replace("\\\"", "\""));
            pw.flush();
            pw.close();
        } catch (Exception e) {
            PrintWriter printWriter;
            try {
                printWriter = new PrintWriter(socket.getOutputStream(), true);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            printWriter.format("UTF-8", printWriter);
            printWriter.println("HTTP/1.1 500 OK\n\n");
            printWriter.println(output);
            printWriter.flush();
            printWriter.close();
        }
    }
}
