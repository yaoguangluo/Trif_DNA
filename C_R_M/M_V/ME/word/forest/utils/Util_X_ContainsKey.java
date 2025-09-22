package M_V.ME.word.forest.utils;

import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）

 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class Util_X_ContainsKey {
	public static void not_E(IMV_SIQ_SS outputList, String countWordNode,
			StringBuilder[] prefixWord, App NE) {
		String string = String.valueOf(countWordNode.charAt(S_Pos.INT_ZERO));
		if (outputList.containsKey(string)) {
			WordFrequency wordFrequency = outputList.getW(string);
			wordFrequency
					.I_frequency(wordFrequency.get_frequency() + S_Pos.INT_ONE);
			wordFrequency.positions.add(NE._I_U.parserCharPosition);
			outputList.put(string, wordFrequency);
			prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
					prefixWord[S_Pos.INT_ZERO].length());
			prefixWord[S_Pos.INT_ZERO]
					.append(countWordNode.charAt(S_Pos.INT_ZERO));
			return;
		}
		WordFrequency wordFrequency = new WordFrequency(1.0, string);
		wordFrequency.positions.add(NE._I_U.parserCharPosition);
		outputList.put(string, wordFrequency);
		prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				prefixWord[S_Pos.INT_ZERO].length());
		prefixWord[S_Pos.INT_ZERO].append(countWordNode.charAt(S_Pos.INT_ZERO));
	}

	public static void _E(IMV_SIQ_SS outputList, String countWordNode,
			StringBuilder[] prefixWord, App NE) {
		prefixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				prefixWord[S_Pos.INT_ZERO].length());
		prefixWord[S_Pos.INT_ZERO].append(countWordNode);
		if (outputList.containsKey(countWordNode)) {
			WordFrequency wordFrequency = outputList.getW(countWordNode);
			wordFrequency
					.I_frequency(wordFrequency.get_frequency() + S_Pos.INT_ONE);
			wordFrequency.positions.add(NE._I_U.parserCharPosition);
			outputList.put(countWordNode, wordFrequency);
			return;
		}
		WordFrequency wordFrequency = new WordFrequency(1.0, countWordNode);
		wordFrequency.positions.add(NE._I_U.parserCharPosition);
		outputList.put(countWordNode, wordFrequency);
	}
}
