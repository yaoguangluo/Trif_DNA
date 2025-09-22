package S_A.SEM.bloom;

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
public interface StaticFunctionMapI_AOPM_C {
    public static IMV_SIQ annotationMap = new IMV_SIQ();

    //重名稍后
    public BigWord getBigWord(App NE);

    public Classify getClassify(App NE);

    public CoAuthor getCoAuthor(App NE);

    public CoAuthorForWord getCoAuthorForWord(App NE) throws HeadlessException;

    public CoDNAAuthorForWord getCoDNAAuthorForWord(App NE) throws HeadlessException;

    public Histogram getHistogram(App NE);

    public LineMed getLineMed(App NE);

    public Jpv getJpv(App NE);

    public Recoder getRecoder(App NE);

    public VoicejPanel getVoicejPanel(App NE);

    public LYGFileIO getLYGFileIO(App NE);
    //声音略 私人不更进研究
}
