package ECE;

import C_A.OCI.ME.pos.C.X_O_parserFirst;
import ME.XCE_XAS;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;

import java.util.List;

///
/// O  o
/// E  e 
/// P  p
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class Pos_X_O extends XCE_XAS implements X_O_parserFirst {
	public int charOfTwo(int countLength, List<String> outputList,
			String[] strings, StringBuilder[] fixWord) {
		outputList.add(strings[S_Pos.INT_ZERO]);
		String postNext = S_Pos.EMPTY_STRING
				+ strings[S_Pos.INT_ONE].charAt(S_Pos.INT_ONE);
		outputList.add(postNext);
		fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				fixWord[S_Pos.INT_ZERO].length());
		fixWord[S_Pos.INT_ZERO].append(postNext);
		return countLength;
	}

//三个字中拆分
	public int charOfThree(int countLength, List<String> outputList,
			String[] strings, StringBuilder[] fixWord) {
		outputList.add(strings[S_Pos.INT_ZERO]);
		outputList.add(strings[S_Pos.INT_TWO]);
		fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				fixWord[S_Pos.INT_ZERO].length());
		fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
		return countLength;//trif-countLength
	}

	public int twoCharOfThree(int countLength, List<String> outputList,
			String[] strings, StringBuilder[] fixWord) {
		outputList.add(strings[S_Pos.INT_ONE]);
		outputList.add(strings[S_Pos.INT_THREE]);
		fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				fixWord[S_Pos.INT_ZERO].length());
		fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_THREE]);
		return countLength;//trif-countLength
	}

	public int charOfTwoForMap(int countLength, IMV_SIQ_SS outputList,
			String[] strings, StringBuilder[] fixWord, App NE) {
		countLength -= S_Pos.INT_TWO;
		WordFrequency wordFrequency;
		if (outputList.containsKey(strings[S_Pos.INT_ZERO])) {
			wordFrequency = outputList.getW(strings[S_Pos.INT_ZERO]);
			wordFrequency
					.I_frequency(wordFrequency.get_frequency() + S_Pos.INT_ONE);
		} else {
			wordFrequency = new WordFrequency(1.0, strings[S_Pos.INT_ZERO]);
		}
		wordFrequency.positions.add(NE._I_U.parserCharPosition);
		outputList.put(strings[S_Pos.INT_ZERO], wordFrequency);
		fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				fixWord[S_Pos.INT_ZERO].length());
		fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
		countLength += S_Pos.INT_ONE;
		return countLength;
	}

	// wordFrequency.I_frequency(1.0);
	// wordFrequency.I_Word(strings[S_Pos.INT_ZERO]);
	public int charOfThreeForMap(int countLength, IMV_SIQ_SS outputList,
			String[] strings, StringBuilder[] fixWord, App NE) {
		countLength -= S_Pos.INT_THREE;
		WordFrequency wordFrequency;
		if (outputList.containsKey(strings[S_Pos.INT_ZERO])) {
			wordFrequency = outputList.getW(strings[S_Pos.INT_ZERO]);
			wordFrequency
					.I_frequency(wordFrequency.get_frequency() + S_Pos.INT_ONE);
		} else {
			wordFrequency = new WordFrequency(1.0, strings[S_Pos.INT_ZERO]);
		}
		wordFrequency.positions.add(NE._I_U.parserCharPosition);
		outputList.put(strings[S_Pos.INT_ZERO], wordFrequency);
		fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				fixWord[S_Pos.INT_ZERO].length());
		fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_ZERO]);
		countLength++;
		if (!wordsForest.containsKey(strings[S_Pos.INT_TWO])) {
			return countLength;
		}
		WordFrequency newWordFrequency;
		if (outputList.containsKey(strings[S_Pos.INT_TWO])) {
			newWordFrequency = outputList.getW(strings[S_Pos.INT_TWO]);
			newWordFrequency.I_frequency(
					newWordFrequency.get_frequency() + S_Pos.INT_ONE);
		} else {
			newWordFrequency = new WordFrequency(1.0, strings[S_Pos.INT_TWO]);
		}
		newWordFrequency.positions.add(NE._I_U.parserCharPosition);
		outputList.put(strings[S_Pos.INT_TWO], newWordFrequency);
		fixWord[S_Pos.INT_ZERO].delete(S_Pos.INT_ZERO,
				fixWord[S_Pos.INT_ZERO].length());
		fixWord[S_Pos.INT_ZERO].append(strings[S_Pos.INT_TWO]);
		countLength += S_Pos.INT_TWO;
		return countLength;
	}
}
//}
//return countLength;

//83 //wordFrequency= new WordFrequency();
//			//wordFrequency.I_frequency(1.0);
//			//wordFrequency.I_Word(strings[S_Pos.INT_ZERO]);

//98 //newWordFrequency= new WordFrequency();
//			//newWordFrequency.I_frequency(1.0);
//			//newWordFrequency.I_Word(strings[S_Pos.INT_TWO]);