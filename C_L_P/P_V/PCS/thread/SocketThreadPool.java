package P_V.PCS.thread;

import S_A.pheromone.IMV_SIQ;

import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class SocketThreadPool {
    private Map<String, SocketThread> poolMap;

    public SocketThreadPool() {
        poolMap = new IMV_SIQ();
    }

    public int getThreadsCount() {
        return poolMap.size();
    }

    public void I_E_Socket(String sid, SocketThread clientSocket) {
        poolMap.put(sid, clientSocket);
    }

    public void D_ThreadById(String sid) {
        if (poolMap.containsKey(sid)) {
            poolMap.remove(sid);
        }
    }
}
