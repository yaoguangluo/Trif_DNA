package ME.VPC.S.ne;

import A_V.IVDTIXQCTIV.EnvironmentInit;
import A_V.IVDTIXQCTIV.LenovoInit;
import A_V.C.RatioMap;
import A_V.E.RatioMap_E;
import A_V.ATIPDAXQDTIV.TaskMakeCoWorker;
import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.AE;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import M_V.MVQ.tabbedpane.DetabbedPane;
import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SQI;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Container;
import java.util.List;

//著作权人+作者 罗瑶光, 浏阳
public class MakeContainer_X_S_s extends Thread {
	public App NE;
	public JPanel panel_bg;
	public boolean isFinished = false;
	public int dice = 0;
	public int currentX;
	public int currentY;
	public TaskMakeCoWorker taskMakeCoWorker;

	public AE _A;
	// public List<String> tabNames;
	public IMV_SQI pos;
	public IMV_SQI pose;
	public IMV_SQI etc;
	public IMV_SQI cte;
	public IMV_SQI pinyin;
	public IMV_SQI ctj;
	public IMV_SQI ctk;
	public IMV_SQI ctt;
	public IMV_SQI ctr;
	public IMV_SQI cko;
	public IMV_SQI cfn;
	public IMV_SQI csp;
	public IMV_SQI cgm;
	public IMV_SQI posec;
	public IMV_SQI posFullec;
	public App_S app_S;
	public CogsBinaryForest_AE _AE;
	public EnvironmentInit environmentInit;
	public EmotionMap_E emotionMap_E;
	public LenovoInit lenovoInit;
	public EmotionSample emotionSample;
	public RatioMap_E ratioMap_E;
	public RatioMap ratioMap;
	public SensingTest sensingTest;
	public SensingMap_E sensingMap_E;
	public Box buttonBox;

	public JTextPane text;
	public Container containerPanel;
	public DetabbedPane jTabbedpane;
	public Thread thread;
	public Object[][] tableData_old;
	public DNNTest dNNTest;
	public ANNTest aNNTest;
	public RNN_IDETest rNN_IDETest;
	public Container jpanelFourth;
	// public App_S u;
	public List<String> tabNames;

	public MakeContainer_X_S_s(App NE) {
		this.app_S = NE.app_S;
		if (null == NE.app_S) {
			return;
		}
		this.jTabbedpane = NE.app_S.jTabbedpane;
		this._AE = NE.app_S._A;
		this.pos = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
		this.pose = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToEn;// later..
		this.etc = NE.app_S.fMHMMListOneTime_E_X_S.enToCn;
		this.cte = NE.app_S.fMHMMListOneTime_E_X_S.cnToEn;
		this.emotionSample = NE.app_S.emotionSample;
		this.ratioMap_E = NE.app_S.ratioMap_E;
		this.sensingTest = NE.app_S.sensingTest;
	}
}