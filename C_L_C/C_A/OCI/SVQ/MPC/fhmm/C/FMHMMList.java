package C_A.OCI.SVQ.MPC.fhmm.C;

import S_A.AVQ.OVQ.OSQ.VSQ.obj.FMHMMNode;
import S_A.pheromone.IMV_SQI;
import java.util.List;
import java.util.Map;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public interface FMHMMList extends FHMMList {
	@SuppressWarnings("rawtypes")
	public Map<Integer, Map> getRoot();

	public void index();

	public Map<Long, FMHMMNode> loopLoadForest(String cInputString);

	public Map<Long, FMHMMNode> doNeroPostCognitive(FMHMMNode fFHMMNode,
			String cInputString, int i);

	public Map<Long, FMHMMNode> doCheckAndRunNeroPostFix(FMHMMNode fFHMMNode,
			String cInputString, int i);

	public IMV_SQI getWords();

	public Map<Long, FMHMMNode> getMap();

	public IMV_SQI getPosEnToEn();

	public IMV_SQI getEnToCn();

	public IMV_SQI getCnToEn();

	public void indexEnToCn();

	public void indexCnToEn();

	public IMV_SQI getPosEnToCn();

	public IMV_SQI getPosCnToCn();

	public void indexPosEnToCn();

	public void indexPosEnToEn();

	public void indexFullEnToCn();

	public void indexFullCnToEn();

	public IMV_SQI getFullEnToCn();

	public IMV_SQI getFullCnToEn();

	public List<String> englishStringToWordsList(String string);

	public void indexFullCnToJp();

	public void indexFullCnToRs();

	public void indexFullCnToAb();

	public void indexFullCnToFn();

	public void indexFullCnToGm();

	public void indexFullCnToKo();

	public void indexFullCnToSp();

	public void indexFullCnToPy();

	public IMV_SQI getFullCnToJp();

	public IMV_SQI getFullCnToRs();

	public IMV_SQI getFullCnToAb();

	public IMV_SQI getFullCnToFn();

	public IMV_SQI getFullCnToGm();

	public IMV_SQI getFullCnToKo();

	public IMV_SQI getFullCnToSp();

	public IMV_SQI getFullCnToPy();

	public Map<Long, FMHMMNode>[] getMaps();

	public Map<Long, IMV_SQI> getWordsForests();

	public void studyNewPos(String string, String posStudy);

	public IMV_SQI getStudyPos();

	public IMV_SQI getFullCnToTt();

	public void indexFullCnToTt();
}
