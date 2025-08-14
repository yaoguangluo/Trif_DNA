package C_A.OSI.AOP.MS.VPC.server;

import M_V.MS.VPC.SH.Sleeper_H;

import java.io.PrintWriter;
import java.net.Socket;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class VPCSResponse {
    public Socket getSocket() {
        return socket;
    }

    public void I_Socket(Socket socket) {
        this.socket = socket;
    }

    public Sleeper_H getSleeper_H() {
        return sleeper_H;
    }

    public void I_Sleeper_H(Sleeper_H sleeper_H) {
        this.sleeper_H = sleeper_H;
    }

    public Integer getHashCode() {
        return hashCode;
    }

    public void I_HashCode(Integer hashCode) {
        this.hashCode = hashCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void I_ErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getResponseContentType() {
        return ResponseContentType;
    }

    public void I_ResponseContentType(String responseContentType) {
        ResponseContentType = responseContentType;
    }

    private Socket socket;
    private Sleeper_H sleeper_H;
    private Integer hashCode;
    private int errorCode;
    private String ResponseContentType;

    public void return404() {
        try {
            if (socket.isClosed()) {
                this.sleeper_H.D_ThreadById(this.hashCode);
                return;
            }
            PrintWriter pw = new PrintWriter(this.socket.getOutputStream(), true);
            pw.println("HTTP/1.1 404 OK\n\n");
            pw.flush();
            pw.close();
            socket.close();
            this.sleeper_H.D_ThreadById(this.hashCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void returnErrorCode(Integer errorCode) {
        try {
            if (socket.isClosed()) {
                this.sleeper_H.D_ThreadById(this.hashCode);
                return;
            }
            PrintWriter pw = new PrintWriter(this.socket.getOutputStream(), true);
            pw.println("HTTP/1.1 " + errorCode + " OK\n\n");
            pw.flush();
            pw.close();
            socket.close();
            this.sleeper_H.D_ThreadById(this.hashCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
