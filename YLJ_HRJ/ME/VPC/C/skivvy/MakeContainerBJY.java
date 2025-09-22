package ME.VPC.C.skivvy;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.MakeContainer_X_S_s;
import M_V.ME.APM.VSQ.editPane.EditPane;
import exception.thread.DetaThread;

import javax.swing.ImageIcon;
import java.awt.Color;

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
public class MakeContainerBJY extends MakeContainer_X_S_s {
	public MakeContainerBJY(App app_NE) {
		super(app_NE);
		NE = app_NE;
		if (null == NE.app_S) {
			return;// mock trif
		}
		this._A = NE.app_S._A;
		this.ctj = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToJp;
		this.ctk = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToAb;
		this.ctt = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToTt;
		this.ctr = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToRs;

		this.cko = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToKo;
		this.cfn = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToFn;
		this.csp = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToSp;
		this.cgm = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToGm;

		this.environmentInit = NE.app_S.environmentInit;
		this.emotionMap_E = NE.app_S.emotionMap_E;
		this.ratioMap_E = NE.app_S.ratioMap_E;
		this.ratioMap = this.ratioMap_E;
		this.lenovoInit = NE.app_S.lenovoInit;
		this.emotionSample = NE.app_S.emotionSample;
		this.sensingTest = NE.app_S.sensingTest;
		this.sensingMap_E = NE.app_S.sensingMap_E;
		this.pinyin = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToPy;
	}

	public void run() {
		if (null == jTabbedpane) {
			return;// fatal trif
		}
		jTabbedpane.validate();
		DetaThread.sleepDeta(1000);
		app_S.editPane = new EditPane(app_S.text, NE);
		app_S.editPane.setName("编辑页");
		jTabbedpane.addTab(app_S.editPane.getName(), new ImageIcon(),
				app_S.editPane, app_S.editPane.getName());// 加入第一个页面
		Color[] colors = TableRender.getTableCellRender();
		jTabbedpane.setBackgroundAt(jTabbedpane.getTabCount() - 1,
				colors[jTabbedpane.getTabCount() % 3]);
		jTabbedpane.validate();
	}
}

//            , null, pos, pose, etc, cte, emotionSample
//                , ratioMap_E, sensingTest

//            , Map<String, String> pos, Map<String, String> pose
//            , Map<String, String> etc, Map<String, String> cte
//            , Map<String, String> pinyin, Map<String, String> ctj
//            , Map<String, String> ctt, Map<String, String> ctk
//            , Map<String, String> ctr, EnvironmentInit environmentInit
//            , EmotionMap_E emotionMap_E, RatioMap_E ratioMap_E, LenovoInit lenovoInit
//            , EmotionSample emotionSample, SensingTest sensingTest
//            , SensingMap_E sensingMap_E
//            , Map<String, String> cko, Map<String, String> cfn
//            , Map<String, String> csp, Map<String, String> cgm

//        Map<String, String> pos= NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn
//            ; NE.app_S.fMHMMListOneTime_E_X_S.posEnToEn; NE.app_S.fMHMMListOneTime_E_X_S.enToCn
//            ; NE.app_S.fMHMMListOneTime_E_X_S.fullCnToEn; NE.app_S.fMHMMListOneTime_E_X_S.fullCnToPy
//            ; NE.app_S.fMHMMListOneTime_E_X_S.fullCnToJp; NE.app_S.fMHMMListOneTime_E_X_S.fullCnToTt
//            ; NE.app_S.fMHMMListOneTime_E_X_S.fullCnToAb; NE.app_S.fMHMMListOneTime_E_X_S.fullCnToRs
//            ; NE.app_S.environmentInit; NE.app_S.emotionMap_E; NE.app_S.ratioMap_E
//            ; NE.app_S.lenovoInit
//            ; NE.app_S.emotionSample; NE.app_S.sensingTest; NE.app_S.sensingMap_E
//            ; NE.app_S.fMHMMListOneTime_E_X_S.fullCnToKo; NE.app_S.fMHMMListOneTime_E_X_S.fullCnToFn
//            ; NE.app_S.fMHMMListOneTime_E_X_S.fullCnToSp; NE.app_S.fMHMMListOneTime_E_X_S.fullCnToGm
