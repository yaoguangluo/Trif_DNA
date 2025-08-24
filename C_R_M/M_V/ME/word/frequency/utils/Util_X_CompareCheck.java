package M_V.ME.word.frequency.utils;

import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Util_X_CompareCheck {
	public static void _E(IMV_SIQ_SS outputList, StringBuilder[] fixWords,
			String countWordNode, App NE) {
		if (outputList.containsKey(countWordNode)) {
			WordFrequency wordFrequency = outputList.getW(countWordNode);
			wordFrequency
					.I_frequency(wordFrequency.get_frequency() + S_Pos.INT_ONE);
			wordFrequency.positions.add(NE._I_U.parserCharPosition);
			outputList.put(countWordNode, wordFrequency);
			return;
		}
		WordFrequency wordFrequency = new WordFrequency(1.0,
				fixWords[S_Pos.INT_ZERO].toString());
		wordFrequency.positions.add(NE._I_U.parserCharPosition);
		outputList.put(countWordNode, wordFrequency);
	}
}
//25 //		WordFrequency wordFrequency=new WordFrequency();
////		wordFrequency.I_frequency(1.0);
////		wordFrequency.I_Word(fixWords[S_Pos.INT_ZERO].toString());
