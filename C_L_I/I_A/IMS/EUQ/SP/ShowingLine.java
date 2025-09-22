package I_A.IMS.EUQ.SP;

import ME.VPC.M.app.App;

import java.util.concurrent.CopyOnWriteArrayList;

/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class ShowingLine extends Thread implements Runnable {
    public SoundWave soundWave;
    App NE;

    public ShowingLine(App app_NE) {
        NE = app_NE;
        if (null != NE.app_S.line2025) {
            this.soundWave = NE.app_S.line2025;
        }
    }

    public CopyOnWriteArrayList<byte[]> temps;
    public int maxPipeSize = 1024;

    public void run() {
        while (NE.app_S.reg == 1) {
            //显示波振幅
            return;
        }
    }
}