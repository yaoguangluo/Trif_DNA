package A_V.ATIPDAXQDTIV;
import ME.VPC.S.ne.App_S;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import I_A.IMO.EVU.bi_P.CoAuthorForWord;
import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Container;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class TaskMakeCoWorker extends Thread {
    public App_S u;
    public CogsBinaryForest_AE _A;
    public Container jpanelFirstu;
    public IMV_SIQ pos;
    App NE;

    public TaskMakeCoWorker(App_S u, Container jpanelFirstu, CogsBinaryForest_AE _A
        , IMV_SIQ pos, App app_NE) {
        NE = app_NE;
        this.u = u;
        this.jpanelFirstu = jpanelFirstu;
        this._A = _A;
        this.pos = pos;
    }

    @Override
    public void run() {
        u.coAuthorForWord = new CoAuthorForWord(NE);
        u.coAuthorForWord.setBackground(Color.white);
        JScrollPane jsp_bagua = new JScrollPane(u.coAuthorForWord);//3d外框
        jsp_bagua.setBounds(695, 270, 750 - 130, 440 - 50);
        jpanelFirstu.add(jsp_bagua);
        jpanelFirstu.validate();
    }
}
