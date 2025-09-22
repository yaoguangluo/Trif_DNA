package M_V.MPI.xls.commonXLS;

import A_V.E.RatioMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.C.skivvy.TableRender;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import M_V.MVQ.tabbedpane.DetabbedPane;
import O_V.OSA.shell.XA_ShellTables;
import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SIQ;
import exception.thread.DetaThread;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.util.List;

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
//非osgi调用方式
public class MakeContainerXLS extends Thread implements Runnable {
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
    public DNNTest dNNTest;
    public ANNTest aNNTest;
    public RNN_IDETest rNN_IDETest;
    public EmotionSample emotionSample;
    public RatioMap_E ratioMap_E;
    public SensingTest sensingTest;
    public String xlsFilePath;
    App NE;

    public MakeContainerXLS(CogsBinaryForest_AE _A, App_S u2
        , DetabbedPane jTabbedpane, List<String> tabNames2
        , IMV_SIQ pos, IMV_SIQ pose, IMV_SIQ etc, IMV_SIQ cte, String fileType
        , EmotionSample emotionSample, RatioMap_E ratioMap_E
        , SensingTest sensingTest, App app_NE) {
        super();
        NE = app_NE;
        //this.jpanelSecond= jpanelSecond;
        this.u = u2;
        this.tabNames = tabNames2;
        this.jTabbedpane = jTabbedpane;
        this._A = _A;
        this.pos = pos;
        this.pose = pose;
        this.etc = etc;
        this.cte = cte;
        this.fileType = fileType.toString();
        this.emotionSample = emotionSample;
        this.ratioMap_E = ratioMap_E;
        this.sensingTest = sensingTest;
    }

    public MakeContainerXLS(CommonXls component, CogsBinaryForest_AE _A, App_S u2
        , DetabbedPane jTabbedpane, List<String> tabNames2
        , IMV_SIQ pos, IMV_SIQ pose
        , IMV_SIQ etc, IMV_SIQ cte, String fileType
        , EmotionSample emotionSample, RatioMap_E ratioMap_E, SensingTest sensingTest
        , App app_NE) {
        super();
        NE = app_NE;
        //this.jpanelSecond= jpanelSecond;
        this.u = u2;
        this.tabNames = tabNames2;
        this.jTabbedpane = jTabbedpane;
        this._A = _A;
        this.pos = pos;
        this.pose = pose;
        this.etc = etc;
        this.cte = cte;
        this.fileType = fileType.toString();
        this.dNNTest = dNNTest;
        this.aNNTest = aNNTest;
        this.rNN_IDETest = rNN_IDETest;
        this.emotionSample = emotionSample;
        this.ratioMap_E = ratioMap_E;
        this.sensingTest = sensingTest;

        jpanelSecond = component;
    }

    @SuppressWarnings("unchecked")
    public void run() {
        try {
            //jTabbedpane.validate();
            DetaThread.sleepDeta(1000 * 3);
            long temp = System.currentTimeMillis();
            String tempName = "临时";
            String pageName;
            if (null == jpanelSecond) {
                pageName = tempName + "XLS" + temp;
                jpanelSecond = new CommonXls(u.text, fileType, pageName, NE);
                jpanelSecond.pageName = pageName;
                jpanelSecond.setName(jpanelSecond.pageName);
                u.appConfig.SectionJPanel.newPages.addItem(jpanelSecond.pageName);
                u.tempPages.put(jpanelSecond.pageName, jpanelSecond);
                u.tableNameMap.put(jpanelSecond.pageName, true);
                u.appConfig.SectionJPanel.pagehookJCheckBoxMap.put(jpanelSecond.pageName, true);
            } else {
                pageName = jpanelSecond.getName();
            }
            if (null == jpanelSecond.pageName || null == tabNames) {
                return;
            }
            tabNames.add(jpanelSecond.pageName);
            //
            for (int i = 0; i < jTabbedpane.getComponentCount(); i++) {
                Component component = jTabbedpane.getComponentAt(i);
                String pageNameString = component.getName();
                if (pageNameString.contains(tempName)) {
                    jTabbedpane.addTab(jpanelSecond.pageName, new ImageIcon()
                        , jpanelSecond, jpanelSecond.pageName);
                }
            }
            XA_ShellTables.addNewSearchShellTable(pageName.replace(tempName, "")
                , jpanelSecond.tableData_old, jpanelSecond.columnTitle, NE);
            Color[] colors = TableRender.getTableCellRender();
            jTabbedpane.setBackgroundAt(jTabbedpane.getComponentCount() - 1
                , colors[jTabbedpane.getComponentCount() % 3]);
            jTabbedpane.validate();
        } catch (Exception e) {
            e.printStackTrace();
            jTabbedpane.validate();
        }
    }

    public void AOP_VEC_SQ(String input) {
        jpanelSecond.key = input.toString();
        jpanelSecond.doSearch();
    }
}
