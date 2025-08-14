package E_A.ME.analysis.E;

import C_A.ME.liner.C.Quick6DLuoYaoguangSort;
import C_A.OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
import ME.XCE_XAS;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import Q_V.QSD.VQS.MSO.Q_parser;
import S_A.pheromone.IMV_SIQ;

import java.util.List;
import java.util.Map;

//import S_A.SVQ.stable.S_Pos;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class AS extends XCE_XAS {
	public Quick6DLuoYaoguangSort quick6DLuoYaoguangSort;
	public Map<Long, IMV_SIQ> wordsForests;
	public int find;
	public int inputLength;
	public int forestDepth;
	public int countLength;
	public int charPosition;
	public int charPositionNext;
	public StringBuilder mixedString;
	public StringBuilder stringBuilder;
	public StringBuilder[] fixWords;
	public List<String> outputList;
	public Q_parser _Q_parser;
	public EmotionMap emotionMap;
	public SensingTest sensingTest;
	//public S_Pos _S_Pos;
}
