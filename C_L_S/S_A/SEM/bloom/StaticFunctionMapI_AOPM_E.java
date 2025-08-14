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
import S_A.pheromone.IMV_SIQ;

import java.awt.HeadlessException;
//著作权人+ 作者= 罗瑶光
public class StaticFunctionMapI_AOPM_E implements StaticFunctionMapI_AOPM_C {
	public IMV_SIQ annotationMap= new IMV_SIQ();
	public BigWord getBigWord(App NE) {
		return new BigWord();
	}
	public Classify getClassify(App NE) {
		return new Classify();
	}
	public CoAuthor getCoAuthor(App NE) {
		IMV_SIQ dic_li= NE._I_U.dic_li;
		CogsBinaryForest_AE _AE= NE._I_U._AE;
		IMV_SIQ pos= NE._I_U.pos;
		return new  CoAuthor(dic_li, NE) ;
	}
	public CoAuthorForWord getCoAuthorForWord(App NE) throws HeadlessException {
		App app=NE._I_U.app;//later
		CogsBinaryForest_AE _AE=NE._I_U._AE;
		IMV_SIQ pos=NE._I_U.pos;
		return new CoAuthorForWord(NE);
	}
	public CoDNAAuthorForWord getCoDNAAuthorForWord(App NE) throws HeadlessException {
		App app= NE._I_U.app;//later..
		A _A= NE._I_U._A;
		IMV_SIQ pos= NE._I_U.pos;
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
