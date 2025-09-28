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

import java.awt.HeadlessException;
/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
//著作权人+ 作者= 罗瑶光
public interface StaticFunctionMapI_AOPM_C  {

	//重名稍后
	public BigWord getBigWord(App NE);

	public Classify getClassify(App NE);

	public CoAuthor getCoAuthor(App NE);

	public CoAuthorForWord getCoAuthorForWord(App NE)
		throws HeadlessException;

	public CoDNAAuthorForWord getCoDNAAuthorForWord(App NE)
		throws HeadlessException;

	public Histogram getHistogram(App NE);

	public LineMed getLineMed(App NE);

	public Jpv getJpv(App NE);

	public Recoder getRecoder(App NE);

	public VoicejPanel getVoicejPanel(App NE);

	public LYGFileIO getLYGFileIO(App NE);
	//声音略 私人不更进研究
}
