package S_A.SixActionMap;

import ME.VPC.M.app.App;
import O_V.OSM.shell.CommandClass;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import java.util.Iterator;

//1 6元SDLC
//2 sdlc obss
//3 obss normalization
//4 normalizational format
//5 format map
//6 map parser
//7 parser in PDE model
//8 model in time norms
//全部基于罗瑶光著作权基础堆积即可。
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -(Facebook和-Gmail邮箱 我-2018年1月后从未使用，小心网墙欺诈)-
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
@SuppressWarnings("unchecked") // 稍后优化新陈代谢 逻辑
public class WorkVerbaMap_X extends WorkVerbaMap_X_S {
	// 稍后去重 -trif
	public void relationshipsCombinationWithNounAndVerb() {
		Iterator<String> iteratorNounMd = nounInText.keySet().iterator();
		NextNounMd: while (iteratorNounMd.hasNext()) {
			String stringNounMd = iteratorNounMd.next();
			if (stringNounMd.isEmpty()) {
				continue NextNounMd;
			}
			if (!command_V._IMV_SIQ_SS.containsKey(stringNounMd)) {
				/*稍后精简条件优化变量*/
				continue NextNounMd;
			}
			WordFrequency wordFrequencyNounMd = command_V._IMV_SIQ_SS
					.getW(stringNounMd);
			int averagePositionNounMd = wordFrequencyNounMd
					.getAveragePosition();

			Iterator<String> iteratorVerbNd = verbInText.keySet().iterator();
			NextVerbNd: while (iteratorVerbNd.hasNext()) {
				String stringVerbNd = iteratorVerbNd.next();
				if (stringVerbNd.isEmpty()) {
					continue NextVerbNd;
				}
				if (!command_V._IMV_SIQ_SS.containsKey(stringVerbNd)) {
					/*稍后精简条件优化变量*/
					continue NextVerbNd;
				}
				WordFrequency wordFrequencyVerbNd = command_V._IMV_SIQ_SS
						.getW(stringVerbNd);
				int averagePositionVerbNd = wordFrequencyVerbNd
						.getAveragePosition();
				if (stringNounMd.equalsIgnoreCase(stringVerbNd)) {
					continue NextVerbNd;
				}
				if (!((wordFrequencyNounMd.get_pos().contains("动")
						|| wordFrequencyNounMd.get_pos().contains("名"))
						&& (wordFrequencyNounMd.get_pos().contains("动")
								|| wordFrequencyNounMd.get_pos()
										.contains("名")))) {
					// 因为笛卡尔交集，所以需要用pos map来识别。
					continue NextVerbNd;
				}
				// noun-verb
				String rootNd = stringNounMd + stringVerbNd;
				String rootMd = stringVerbNd + stringNounMd;
				int rightNd = Math
						.abs(averagePositionNounMd - averagePositionVerbNd);
				int positionNd = (averagePositionNounMd
						+ averagePositionVerbNd) >> 1;
				if (2 > rightNd && rootNd.length() < 3) {
					nounInText.remove(stringNounMd);
					verbInText.remove(stringVerbNd);
					verbInText.put(rootNd, positionNd);
					verbInText.put(rootMd, positionNd);
					WordFrequency wordFrequency = new WordFrequency(1.0,
							rootNd);
					wordFrequency.positions.add(positionNd);
					wordFrequency.I_pos("动词名词");
					command_V._IMV_SIQ_SS.put(rootNd, wordFrequency);
					command_V._IMV_SIQ_SS.put(rootMd, wordFrequency);
				}
			}
		}
	}

	public void relationshipsCombinationWithVerb() {
		Iterator<String> iteratorVerbM = verbInText.keySet().iterator();
		NextVerbM: while (iteratorVerbM.hasNext()) {
			String stringVerbM = iteratorVerbM.next();
			if (stringVerbM.isEmpty()) {
				continue NextVerbM;
			}
			if (!command_V._IMV_SIQ_SS.containsKey(stringVerbM)) {
				/*稍后精简条件优化变量*/
				continue NextVerbM;
			}
			WordFrequency wordFrequencyVerbM = command_V._IMV_SIQ_SS
					.getW(stringVerbM);
			int averagePositionVerbM = wordFrequencyVerbM.getAveragePosition();
			Iterator<String> iteratorVerbN = verbInText.keySet().iterator();
			NextVerbN: while (iteratorVerbN.hasNext()) {
				String stringVerbN = iteratorVerbN.next();
				if (stringVerbN.isEmpty()) {
					continue NextVerbN;
				}
				if (!command_V._IMV_SIQ_SS.containsKey(stringVerbN)) {
					/*稍后精简条件优化变量*/
					continue NextVerbN;
				}
				WordFrequency wordFrequencyVerbN = command_V._IMV_SIQ_SS
						.getW(stringVerbN);
				int averagePositionVerbN = wordFrequencyVerbN
						.getAveragePosition();
				if (stringVerbN.equalsIgnoreCase(stringVerbN)) {
					continue NextVerbN;
				}
				if (!wordFrequencyVerbM.get_pos()
						.equals(wordFrequencyVerbN.get_pos())) {
					// 因为笛卡尔交集，所以需要用pos map来识别。
					continue NextVerbN;
				}
				// noun-verb
				String rootN = stringVerbM + stringVerbN;
				String rootM = stringVerbN + stringVerbM;
				int rightN = Math
						.abs(averagePositionVerbM - averagePositionVerbN);
				int positionN = (averagePositionVerbM
						+ averagePositionVerbN) >> 1;
				if (2 > rightN && rootN.length() < 3) {
					verbInText.remove(stringVerbM);
					verbInText.remove(stringVerbN);
					verbInText.put(rootN, positionN);
					verbInText.put(rootM, positionN);
					WordFrequency wordFrequency = new WordFrequency(1.0, rootN);
					wordFrequency.positions.add(positionN);
					wordFrequency.I_pos("动词");
					command_V._IMV_SIQ_SS.put(rootN, wordFrequency);
					command_V._IMV_SIQ_SS.put(rootM, wordFrequency);
				}
			}
		}
	}

	// 在计算哲学和语文意识中，非动词类词性组合可以算法省略，因为不构成指令集核心成分。我先不管，
	// 在计算意识中，单字的价值不打，但是在歧义处理中，单字是普遍存在的，如果下面函数执行，那么
	// 需要有精确的语法做铺垫，如果没有，那么就要进行概率累积评估，累积打分算法逻辑来灵活驱动。
	public void relationshipsCombinationWithNoun() {
		Iterator<String> iteratorNounM = nounInText.keySet().iterator();
		NextNounM: while (iteratorNounM.hasNext()) {
			String stringNounM = iteratorNounM.next();
			if (stringNounM.isEmpty()) {
				continue NextNounM;
			}
			if (!command_V._IMV_SIQ_SS.containsKey(stringNounM)) {
				continue NextNounM;
			}
			WordFrequency wordFrequencyNounM = command_V._IMV_SIQ_SS
					.getW(stringNounM);
			int averagePositionNounM = wordFrequencyNounM.getAveragePosition();
			Iterator<String> iteratorNounN = nounInText.keySet().iterator();
			NextNounN: while (iteratorNounN.hasNext()) {
				String stringNounN = iteratorNounN.next();
				if (stringNounN.isEmpty()) {
					continue NextNounN;
				}
				if (!command_V._IMV_SIQ_SS.containsKey(stringNounN)) {
					continue NextNounN;
				}
				WordFrequency wordFrequencyNounN = command_V._IMV_SIQ_SS
						.getW(stringNounN);
				int averagePositionNounN = wordFrequencyNounN
						.getAveragePosition();
				if (stringNounM.equalsIgnoreCase(stringNounN)) {
					continue NextNounN;
				}
				if (!wordFrequencyNounM.get_pos()
						.equals(wordFrequencyNounN.get_pos())) {
					// 因为笛卡尔交集，所以需要用pos map来识别。
					continue NextNounN;
				}
				// noun-verb
				String rootM = stringNounM + stringNounN;
				String rootN = stringNounN + stringNounM;
				int rightM = Math
						.abs(averagePositionNounM - averagePositionNounN);
				int positionM = (averagePositionNounM
						+ averagePositionNounN) >> 1;
				if (2 > rightM && rootM.length() < 3) {
					nounInText.remove(stringNounM);
					nounInText.remove(stringNounN);
					nounInText.put(rootM, positionM);
					nounInText.put(rootN, positionM);
					WordFrequency wordFrequency = new WordFrequency(1.0, rootM);
					wordFrequency.positions.add(positionM);
					wordFrequency.I_pos("名词");
					command_V._IMV_SIQ_SS.put(rootM, wordFrequency);
					command_V._IMV_SIQ_SS.put(rootN, wordFrequency);
				}
			}
		}
	}

	/*
	 * 思考，这里的 + - 符号 + 是position，-是connetion ，在词性组合中 +是动名， -是
	 * 名动，形成原因是我不断的优化引擎，用最简添加法方便迅捷编码，为了区别混淆，于是又 +
	 * 上改为++，-改为--来区分。那么在函数map中也应该进行区分，于是优化下最终结构 一个DP 
	 * 代表双字+—POS组合后的+-RNN组合 。 输出格式为 DP(+-) DP(++ --) DP(+-) 复杂笛
	 * 卡尔完整关系模型，那么在normalizationalWorkActionsRights.put的函数中就可以在
	 * 排序后进行精度筛选即可以避免过多的内存资源堆栈浪费，之后指令集按照累积打分来驱动计算
	 * ，精度筛选所造成的误差缺陷也能 得到最大限度的弥补 -罗瑶光
	 */
	// tree sort 比quick top快，但耗费大量stack，于是不考虑。
	public void sortCartesianWorkActionsDistanceSV(App NE,
			CommandClass command_V) {
		actionsDistanceV_SV = new int[command_V.cartesianWorkActionsRightsSV.size()];
		actionsDistance_SV = new String[command_V.cartesianWorkActionsRightsSV
				.size()];
		Iterator<String> iterator = command_V.cartesianWorkActionsRightsSV
				.keySet().iterator();
		int i = 0;
		while (iterator.hasNext()) {
			String string = iterator.next();
			actionsDistance_SV[i] = string;
			actionsDistanceV_SV[i++] = command_V.cartesianWorkActionsRightsSV
					.getInt(string);
		}
		NE.app_S.lYGSortESU9D.javaSort(actionsDistanceV_SV, actionsDistance_SV);
		// loop
		for (i = 0; i < actionsDistance_SV.length; i++) {
			System.out.println(actionsDistance_SV[i] + "-" + actionsDistanceV_SV[i]);
			//command_V.normalizationalWorkActionsRights.put(
			//		actionsDistance[i] + "-" + actionsDistanceV[i],
			//		actionsDistanceV[i]);

		}
	}
	//NE.app_S.lYGSortESU9D.javaSort关于RNN精度排序之后做联想扩展功能时候会用到，先保留。
	public void sortCartesianWorkActionsDistanceVO(App NE, CommandClass command_V) {
		actionsDistanceV_VO = new int[command_V.cartesianWorkActionsRightsVO.size()];
		actionsDistance_VO = new String[command_V.cartesianWorkActionsRightsVO
				.size()];
		Iterator<String> iterator = command_V.cartesianWorkActionsRightsVO
				.keySet().iterator();
		int i = 0;
		while (iterator.hasNext()) {
			String string = iterator.next();
			actionsDistance_VO[i] = string;
			actionsDistanceV_VO[i++] = command_V.cartesianWorkActionsRightsVO
					.getInt(string);
		}
		NE.app_S.lYGSortESU9D.javaSort(actionsDistanceV_VO, actionsDistance_VO);
		// loop
		for (i = 0; i < actionsDistance_VO.length; i++) {
			System.out.println(actionsDistance_VO[i] + "-" + actionsDistanceV_VO[i]);
			//command_V.normalizationalWorkActionsRights.put(
			//		actionsDistance[i] + "-" + actionsDistanceV[i],
			//		actionsDistanceV[i]);

		}
	}
	
	public void sortCartesianWorkActionsPositionSV(App NE,
			CommandClass command_V) {
		actionsPositionV_SV = new int[command_V.cartesianWorkActionsPositionsSV
				.size()];
		actionsPosition_SV = new String[command_V.cartesianWorkActionsPositionsSV
				.size()];
		Iterator<String> iterator = command_V.cartesianWorkActionsPositionsSV
				.keySet().iterator();
		int i = 0;
		while (iterator.hasNext()) {
			String string = iterator.next();
			actionsPosition_SV[i] = string;
			actionsPositionV_SV[i++] = command_V.cartesianWorkActionsPositionsSV
					.getInt(string);
		}
		NE.app_S.lYGSortESU9D.javaSort(actionsPositionV_SV, actionsPosition_SV);
		// loop
		for (i = 0; i < actionsPositionV_SV.length; i++) {
			System.out.println(actionsPosition_SV[i] + "+" + actionsPositionV_SV[i]);
			//command_V.normalizationalWorkActionsPositions
			//		.put(actionsPosition[i] + "+" + actionsPositionV[i], "");
		}
		// ------------
	}

	public void sortCartesianWorkActionsPositionVO(App NE,
			CommandClass command_V) {
		actionsPositionV_VO = new int[command_V.cartesianWorkActionsPositionsVO
				.size()];
		actionsPosition_VO = new String[command_V.cartesianWorkActionsPositionsVO
				.size()];
		Iterator<String> iterator = command_V.cartesianWorkActionsPositionsVO
				.keySet().iterator();
		int i = 0;
		while (iterator.hasNext()) {
			String string = iterator.next();
			actionsPosition_VO[i] = string;
			actionsPositionV_VO[i++] = command_V.cartesianWorkActionsPositionsVO
					.getInt(string);
		}
		NE.app_S.lYGSortESU9D.javaSort(actionsPositionV_VO, actionsPosition_VO);
		// loop
		for (i = 0; i < actionsPositionV_VO.length; i++) {
			System.out.println(actionsPosition_VO[i] + "+" + actionsPositionV_VO[i]);
			//command_V.normalizationalWorkActionsPositions
			//		.put(actionsPosition[i] + "+" + actionsPositionV[i], "");
		}
		// ------------
	}
	
	/*
	 * 关于复杂RNN关系 我引擎这里会逐渐用不到，因为DNN的重心分析加上语言的单句分解，是我
	 * 的花语计算逻辑趋势，以后复杂的句子首先走短句分解而不是走全局关系，那么这个复杂关系
	 * 价值将体现在修正和补充环境里面, 之后根据算法优化的BPM结构不断校正补充函数 -罗瑶光
	 */
	public void actionsNormalization(App NE, CommandClass command_V) {
//		Iterator<String> iterators = command_V.cartesianWorkActionsPositions
//				.keySet().iterator();
//		LEFT: while (iterators.hasNext()) {
//			String root_position_name = iterators.next();
//			int root_position_left = command_V.cartesianWorkActionsPositions
//					.getInt(root_position_name);
//			int root_rights_left = command_V.cartesianWorkActionsRights
//					.getInt(root_position_name);
//			Iterator<String> root_right_names = command_V.cartesianWorkActionsRights
//					.keySet().iterator();
//			RIGHT: while (root_right_names.hasNext()) {
//				String root_right_name = root_right_names.next();
//				int root_position_right = command_V.cartesianWorkActionsPositions
//						.getInt(root_position_name);
//				int root_rights_right = command_V.cartesianWorkActionsRights
//						.getInt(root_position_name);
//				int least_rights = root_rights_left + root_rights_right;
//				int average_rights = Math
//						.abs(root_position_left - root_position_right);
//				int average_position = (root_position_left
//						+ root_position_right) / 2;
//				if (least_rights < NE.app_S.initonsDistanceRelationship
//						&& !root_right_name.equalsIgnoreCase(root_position_name)
//						&& average_rights < NE.app_S.initonsDistanceRelationship) {
//					String[] leftsP = new String[2];
//					// = // root_right_name.split("+");
//					String[] leftsR = new String[2];
//					String[] rightsP = new String[2];
//					String[] rightsR = new String[2];
//					if (root_right_name.contains("+")) {
//						continue RIGHT;
//					}
//					if (root_right_name.contains("-")) {
//						leftsR = root_right_name.split("-");
//						leftsP = leftsR;
//					}
//					if (root_position_name.contains("+")) {
//						continue LEFT;
//					}
//					if (root_position_name.contains("-")) {
//						rightsR = root_position_name.split("-");
//						rightsP = rightsR;
//					}
//					if (!leftsP[0].equalsIgnoreCase(rightsR[1])
//							&& !leftsR[1].equalsIgnoreCase(rightsP[0])) {
//						//later..
//						//command_V.complementedWorkActionsRights.put(
//						//		root_right_name + "--" + root_position_name,
//						//		average_rights);
//						//command_V.complementedWorkActionsPositions.put(
//						//		root_right_name + "++" + root_position_name,
//						//		average_position);
//						if (root_right_name.contains("列")
//								|| root_right_name.contains("展示")) {
//							// System.out.println(root_right_name + "--"
//							// + root_position_name + ":" + average_rights
//							// + ":" + average_position + ":" + least_rights);
//						}
//					}
//				}
//			}
//		}
	}
}