package ME.VPC.S.ne;

import A_V.C.RatioMap;
import A_V.E.RatioMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.tabbedpane.DetabbedPane;
import O_V.OSI.AOP.neo.tts.ReadChinese;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.Verbal;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SQI;
import S_A.pheromone.IMV_SQI_;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Container;
import java.util.List;
import java.util.Map;

//import OSV.VCQ.standard.DictionaryStandardDB;
//import OSI.OPE.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.ASU.MPE.procedure.pde.FullDNATokenPDI;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
@SuppressWarnings({ "unchecked", "serial" })
public class Page_X_S_sVSQ extends Container {
	public App NE;

	public int row;
	public int col;
	public int currentPage;
	public String key;
	public String pageName;
	public String fileNamePrefix;
	public String xlsFilePath;
	public JTextPane data;
	public JTextPane statistic;
	public JTextField name;
	public javax.swing.JTable table;
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel = null;
	public CogsBinaryForest_AE _A;
	public IMV_SQI posFec;
	public JTextPane text;
	public DetabbedPane jTabbedpane;
	public App_S app_S;
	public ReadChinese readChinese;
	// private DetaButton buttonZYSZ;

	public DetaButton buttonSum;
	public DetaButton buttonCrt;
	public DetaButton buttonPrev;
	public DetaButton buttonNext;
	public DetaButton buttonCTE;
	public DetaButton buttonFRS;
	public DetaButton buttonETC;
	public DetaButton buttonCTV;

	public IMV_SQI dic_xj;
	public IMV_SQI pos;
	public IMV_SQI pose;
	public IMV_SQI etc;
	public IMV_SQI cte;
	public IMV_SQI posec;
	public IMV_SQI posFullec;
	public List<Verbal> verbals;
	public List<String> copy;
	public List<String> dic_list;
	public List<String> sets;
	public List<String> copy_xj;

	public IMV_SQI_ dic_map;
	public IMV_SQI dic_chu_fang;
	public IMV_SQI dic_mz;
	public IMV_SQI dic_zf;
	public IMV_SQI dic_yy;
	public IMV_SQI dic_fg;
	public IMV_SQI dic_ff;
	public IMV_SQI_ dic_sy;
	public IMV_SQI dic_tl;
	public IMV_SQI dic_bzm;

	public IMV_SQI_ dic_gn;
	public IMV_SQI dic_lcbx;
	public IMV_SQI dic_lcyy;
	public IMV_SQI dic_zhfx;
	public IMV_SQI dic_zhjb;

	public IMV_SQI dic_yao_ming;
	public IMV_SQI dic_chengfen_danwei;
	public IMV_SQI dic_yong_fa;
	public IMV_SQI dic_yong_liang;
	public IMV_SQI dic_yao_li;
	public IMV_SQI dic_zhu_yi;
	public IMV_SQI dic_shi_ying;
	public IMV_SQI dic_bu_liang_fan_ying;
	public IMV_SQI dic_yao_wu_xiang_hu_zuo_yong;
	public IMV_SQI dic_qi_ta;
	public IMV_SQI dic_jie_shao;

	public IMV_SQI_ dic_lx;
	public IMV_SQI_ dic_by;
	public IMV_SQI_ dic_wx;
	public IMV_SQI_ dic_bl;
	public IMV_SQI_ dic_lc;
	public IMV_SQI_ dic_zd;
	public IMV_SQI_ dic_bf;
	public IMV_SQI_ dic_zl;
	public IMV_SQI_ dic_jy;
	public IMV_SQI_ dic_yh;
	public IMV_SQI_ dic_yf;
	public IMV_SQI_ dic_yx;
	public Map<String, int[][]> subASCmap = new IMV_SQI();
	public Map<String, Map<String, Double>> DNNmap = new IMV_SQI();
	public EmotionSample emotionSample;
	public RatioMap ratioMap;
	public RatioMap_E ratioMap_E;
	public SensingTest sensingTest;
}