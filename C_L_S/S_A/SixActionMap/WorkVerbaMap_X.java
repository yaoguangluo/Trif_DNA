package S_A.SixActionMap;

import ME.VPC.M.app.App;
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
@SuppressWarnings("unchecked") //稍后优化新陈代谢 逻辑
public class WorkVerbaMap_X extends WorkVerbaMap_X_S {
	// 稍后去重 -trif
	void relationshipsCombinationWithNounAndVerb() {
		Iterator<String> iteratorNounMd = nounInText.keySet().iterator();
		NextNounMd: while (iteratorNounMd.hasNext()) {
			String stringNounMd = iteratorNounMd.next();
			if (stringNounMd.isEmpty()) {
				continue NextNounMd;
			}
			WordFrequency wordFrequencyNounMd = _IMV_SIQ_SS.getW(stringNounMd);
			int averagePositionNounMd = wordFrequencyNounMd
					.getAveragePosition();

			Iterator<String> iteratorVerbNd = verbInText.keySet().iterator();
			NextVerbNd: while (iteratorVerbNd.hasNext()) {
				String stringVerbNd = iteratorVerbNd.next();
				if (stringVerbNd.isEmpty()) {
					continue NextVerbNd;
				}
				WordFrequency wordFrequencyVerbNd = _IMV_SIQ_SS
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
					_IMV_SIQ_SS.put(rootNd, wordFrequency);
					_IMV_SIQ_SS.put(rootMd, wordFrequency);
				}
			}
		}
	}

	void relationshipsCombinationWithVerb() {
		Iterator<String> iteratorVerbM = verbInText.keySet().iterator();
		NextVerbM: while (iteratorVerbM.hasNext()) {
			String stringVerbM = iteratorVerbM.next();
			if (stringVerbM.isEmpty()) {
				continue NextVerbM;
			}
			WordFrequency wordFrequencyVerbM = _IMV_SIQ_SS.getW(stringVerbM);
			int averagePositionVerbM = wordFrequencyVerbM.getAveragePosition();
			Iterator<String> iteratorVerbN = verbInText.keySet().iterator();
			NextVerbN: while (iteratorVerbN.hasNext()) {
				String stringVerbN = iteratorVerbN.next();
				if (stringVerbN.isEmpty()) {
					continue NextVerbN;
				}
				WordFrequency wordFrequencyVerbN = _IMV_SIQ_SS
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
					_IMV_SIQ_SS.put(rootN, wordFrequency);
					_IMV_SIQ_SS.put(rootM, wordFrequency);
				}
			}
		}
	}

	// 在计算哲学和语文意识中，非动词类词性组合可以算法省略，因为不构成指令集核心成分。我先不管，
	void relationshipsCombinationWithNoun() {
		Iterator<String> iteratorNounM = nounInText.keySet().iterator();
		NextNounM: while (iteratorNounM.hasNext()) {
			String stringNounM = iteratorNounM.next();
			if (stringNounM.isEmpty()) {
				continue NextNounM;
			}
			WordFrequency wordFrequencyNounM = _IMV_SIQ_SS.getW(stringNounM);
			int averagePositionNounM = wordFrequencyNounM.getAveragePosition();
			Iterator<String> iteratorNounN = nounInText.keySet().iterator();
			NextNounN: while (iteratorNounN.hasNext()) {
				String stringNounN = iteratorNounN.next();
				if (stringNounN.isEmpty()) {
					continue NextNounN;
				}
				WordFrequency wordFrequencyNounN = _IMV_SIQ_SS
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
					_IMV_SIQ_SS.put(rootM, wordFrequency);
					_IMV_SIQ_SS.put(rootN, wordFrequency);
				}
			}
		}
	}

	public void actionsNormalization(App NE) {
		Iterator<String> iterators = cartesianWorkActionsPositions.keySet()
				.iterator();
		LEFT: while (iterators.hasNext()) {
			String root_position_name = iterators.next();
			int root_position_left = cartesianWorkActionsPositions
					.getInt(root_position_name);
			int root_rights_left = cartesianWorkActionsRights
					.getInt(root_position_name);
			Iterator<String> root_right_names = cartesianWorkActionsRights
					.keySet().iterator();
			RIGHT: while (root_right_names.hasNext()) {
				String root_right_name = root_right_names.next();
				int root_position_right = cartesianWorkActionsPositions
						.getInt(root_position_name);
				int root_rights_right = cartesianWorkActionsRights
						.getInt(root_position_name);
				int least_rights = root_rights_left + root_rights_right;
				int average_rights = Math
						.abs(root_position_left - root_position_right);
				int average_position = (root_position_left
						+ root_position_right) / 2;
				if (least_rights < NE.app_S.initonsDistanceRelationship
						&& !root_right_name.equalsIgnoreCase(root_position_name)
						&& average_rights < NE.app_S.initonsDistanceRelationship) {
					String[] leftsP = new String[2];
					// = // root_right_name.split("+");
					String[] leftsR = new String[2];
					String[] rightsP = new String[2];
					String[] rightsR = new String[2];
					if (root_right_name.contains("+")) {
						continue RIGHT;
					}
					if (root_right_name.contains("-")) {
						leftsR = root_right_name.split("-");
						leftsP = leftsR;
					}
					if (root_position_name.contains("+")) {
						continue LEFT;
					}
					if (root_position_name.contains("-")) {
						rightsR = root_position_name.split("-");
						rightsP = rightsR;
					}
					if (!leftsP[0].equalsIgnoreCase(rightsR[1])
							&& !leftsR[1].equalsIgnoreCase(rightsP[0])) {
						// later..
						normalizationalWorkActionsRights.put(
								root_right_name + "--" + root_position_name,
								average_rights);
						normalizationalWorkActionsPositions.put(
								root_right_name + "++" + root_position_name,
								average_position);
						System.out.println(root_right_name + "--"
								+ root_position_name + ":" + average_rights
								+ ":" + average_position + ":" + least_rights);
					}
				}
			}
		}
	}

	// tree sort 比quick top快，但耗费大量stack，于是不考虑。
	public void sortCartesianWorkActionsDistance(App NE) {
		actionsDistanceV = new int[cartesianWorkActionsRights.size()];
		actionsDistance = new String[cartesianWorkActionsRights.size()];
		Iterator<String> iterator = cartesianWorkActionsRights.keySet()
				.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			String string = iterator.next();
			actionsDistance[i] = string;
			actionsDistanceV[i++] = cartesianWorkActionsRights.getInt(string);
		}
		NE.app_S.lYGSortESU9D.javaSort(actionsDistanceV, actionsDistance);
		// loop
		for (i = 0; i < actionsDistance.length; i++) {
			System.out.println(actionsDistance[i] + "-" + actionsDistanceV[i]);
		}
	}

	public void sortCartesianWorkActionsPosition(App NE) {
		actionsPositionV = new int[cartesianWorkActionsPositions.size()];
		actionsPosition = new String[cartesianWorkActionsPositions.size()];
		Iterator<String> iterator = cartesianWorkActionsPositions.keySet()
				.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			String string = iterator.next();
			actionsPosition[i] = string;
			actionsPositionV[i++] = cartesianWorkActionsPositions
					.getInt(string);
		}
		NE.app_S.lYGSortESU9D.javaSort(actionsPositionV, actionsPosition);
		// loop
		for (i = 0; i < actionsPositionV.length; i++) {
			System.out.println(actionsPosition[i] + "+" + actionsPositionV[i]);
		}
		// ------------
	}
	
}