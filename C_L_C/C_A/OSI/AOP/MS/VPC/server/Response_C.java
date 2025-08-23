package C_A.OSI.AOP.MS.VPC.server;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import DetaSrc.org.deta.boot.vpc.sleeper.SleeperHall;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Response_C {
    public static void main(String[] args) {

    }

    @SuppressWarnings("unused")
    private static void error404(Socket socket, SleeperHall sleeper_H, Integer sId) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        pw.println("HTTP/1.1 404 OK\n\n");
        pw.flush();
        pw.close();
        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sleeper_H.removeThreadById(sId);
        return;
    }

    @SuppressWarnings("unused")
    private static void error500(Socket socket, SleeperHall sleeper_H, Integer sId) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        pw.println("HTTP/1.1 500 OK\n\n");
        pw.flush();
        pw.close();
        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sleeper_H.removeThreadById(sId);
        return;
    }
}
