package S_A.SEM.bloom;

import C_A.ME.analysis.C.A;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import I_A.IMO.EVU.bi_P.BigWord;
import I_A.IMO.EVU.bi_P.Classify;
import I_A.IMO.EVU.bi_P.CoAuthor;
import I_A.IMO.EVU.bi_P.CoAuthorForWord;
import I_A.IMO.EVU.bi_P.CoDNAAuthorForWord;
import I_A.IMO.EVU.bi_P.Histogram;
import I_A.IMO.EVU.bi_P.LineMed;
import I_A.IMS.EUQ.SP.LYGFileIO;
import I_A.IMS.EUQ.SP.Recoder;
import I_A.IMS.EUQ.recoder.Jpv;
import I_A.IMS.EUQ.recoder.VoicejPanel;
import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SQI;

import java.awt.HeadlessException;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
//著作权人+ 作者= 罗瑶光
public class StaticFunctionMapI_AOPM_E extends StaticFunctionMapCASE
	implements StaticFunctionMapI_AOPM_C {

	public BigWord getBigWord(App NE) {
		return new BigWord();
	}

	public Classify getClassify(App NE) {
		return new Classify();
	}

	@SuppressWarnings("unused")
	public CoAuthor getCoAuthor(App NE) {
		IMV_SQI dic_li = NE._I_U.dic_li;
		CogsBinaryForest_AE _AE = NE._I_U._AE;
		IMV_SQI pos = NE._I_U.pos;
		return new CoAuthor(dic_li, NE);
	}

	@SuppressWarnings("unused")
	public CoAuthorForWord getCoAuthorForWord(App NE)
		throws HeadlessException {
		App app = NE._I_U.app;//later
		CogsBinaryForest_AE _AE = NE._I_U._AE;
		IMV_SQI pos = NE._I_U.pos;
		return new CoAuthorForWord(NE);
	}

	@SuppressWarnings("unused")
	public CoDNAAuthorForWord getCoDNAAuthorForWord(App NE)
		throws HeadlessException {
		App app = NE._I_U.app;//later..
		A _A = NE._I_U._A;
		IMV_SQI pos = NE._I_U.pos;
		return new CoDNAAuthorForWord(NE);
	}

	public Histogram getHistogram(App NE) {
		return new Histogram();
	}

	public LineMed getLineMed(App NE) {
		return new LineMed();
	}

	public Jpv getJpv(App NE) {
		return new Jpv();
	}

	public Recoder getRecoder(App NE) {
		return new Recoder();
	}

	public VoicejPanel getVoicejPanel(App NE) {
		return new VoicejPanel();
	}

	public LYGFileIO getLYGFileIO(App NE) {
		return new LYGFileIO();
	}
}
