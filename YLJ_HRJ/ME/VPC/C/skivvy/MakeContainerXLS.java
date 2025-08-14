package ME.VPC.C.skivvy;
import ME.VPC.S.ne.App_S;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import M_V.MPI.xls.commonXLS.CommonXls;
import M_V.MVQ.tabbedpane.DetabbedPane;
import exception.thread.DetaThread;
import S_A.pheromone.IMV_SIQ;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
//非osgi调用方式
public class MakeContainerXLS extends MakeContainerTemp {
    public CommonXls jpanelSecond;
    public App_S u;
    public DetabbedPane jTabbedpane;
    public List<String> tabNames;
    public CogsBinaryForest_AE _A;
    public IMV_SIQ pos;
    public IMV_SIQ pose;
    public IMV_SIQ etc;
    public IMV_SIQ cte;
    public String fileType;

    public MakeContainerXLS(String fileType, App NE) {
        super(null, NE);
        this.u = app_S;
        //this.jTabbedpane= jTabbedpane;
        if (null == NE.app_S) {
            return;//fatal trif
        }
        this._A = NE.app_S._A;//later..
        app_S.studyVerbaMap.putObject("_A", NE.app_S.pageQ.mainPaint.pageP_M);
        this.pos = NE.app_S.fMHMMListOneTime_E.posCnToCn;
        app_S.studyVerbaMap.putObject("fMHMMListOneTime_E.posCnToCn"
            , NE.app_S.fMHMMListOneTime_E.posCnToCn);
        this.pose = NE.app_S.fMHMMListOneTime_E.posEnToEn;
        app_S.studyVerbaMap.putObject("fMHMMListOneTime_E.posEnToEn"
            , NE.app_S.fMHMMListOneTime_E.posEnToEn);
        this.etc = NE.app_S.fMHMMListOneTime_E.fullEnToCn;
        app_S.studyVerbaMap.putObject("fMHMMListOneTime_E.fullEnToCn"
            , NE.app_S.fMHMMListOneTime_E.fullEnToCn);
        this.cte = NE.app_S.fMHMMListOneTime_E.fullCnToEn;
        app_S.studyVerbaMap.putObject("fMHMMListOneTime_E.fullCnToEn"
            , NE.app_S.fMHMMListOneTime_E.fullCnToEn);
        this.emotionSample = NE.app_S.emotionSample;
        app_S.studyVerbaMap.putObject("emotionSample", NE.app_S.emotionSample);
        this.ratioMap = NE.app_S.ratioMap;
        app_S.studyVerbaMap.putObject("ratioMap", NE.app_S.ratioMap);
        this.sensingTest = NE.app_S.sensingTest;
        app_S.studyVerbaMap.putObject("sensingTest", NE.app_S.sensingTest);
        this.fileType = fileType.toString();
    }

    public void run() {
        try {
            jTabbedpane.validate();
            DetaThread.sleepDeta(1000 * 3);
            long temp = System.currentTimeMillis();
            String pageName = "临时" + "XLS" + temp;
            jpanelSecond = new CommonXls(u.text, fileType, pageName, NE);
            jpanelSecond.pageName = pageName;
            tabNames.add(jpanelSecond.pageName);
            jpanelSecond.setName(jpanelSecond.pageName);
            jTabbedpane.addTab(jpanelSecond.pageName, new ImageIcon()
                , jpanelSecond, jpanelSecond.pageName);//
            Color[] colors = new Color[3];
            colors[0] = new Color(253, 233, 254);//later
            colors[1] = new Color(233, 254, 234);
            colors[2] = new Color(255, 251, 232);
            jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount() - 1
                , colors[jTabbedpane.getTabCount() % 3]);
            jTabbedpane.validate();
        } catch (Exception e) {
            e.printStackTrace();
            if (null == jTabbedpane) {
                return;//fatal trif
            }
            jTabbedpane.validate();
        }
    }

    public void AOP_VEC_SQ(String input) {
        if (null == jpanelSecond) {
            return;//mock trif
        }
        if (null == input) {
            return;//mock trif
        }
        jpanelSecond.key = input.toString();
        jpanelSecond.doSearch();
    }
}
