package ME.VPC.M.X;
import ME.VPC.S.ne.App_S;
import ME.VPC.M.app.App;
import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import U_V.ESU.iterator.Iterator_ESU_X_iteratorToList;
import U_V.ESU.list.List_ESU_X_listToArray;

import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings("serial")
public class AppSearch_X_DetaSearchWithDNN_backup extends ScrollPane {
    

    @SuppressWarnings("unused")
    public int detaSimpleSearch(int[] score_code, String[] score
        , DefaultTableModel newTableModel, Object[][] tableData_old, String key
        , boolean keyIsPCA, int[] identifyColumns, Map<String, int[][]> subASCmap
        , String fileNamePrefix, String[] scoreOutput, App NE) {//later zou zhege yinqing */
        int count = 0;
        App_S u = NE.app_S;
        IMV_SIQ pos = u.fMHMMListOneTime_E_X_S.posCnToCn;
        try {
            SensingTest sensingTest = null;
            DNNTest dNNTest = null;
            ANNTest aNNTest = null;
            if (u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {
                //DNN初始
                sensingTest = u._A.getSensingTest();
                dNNTest = new DNNTest();
                aNNTest = new ANNTest();
            }
            boolean nullCheck = false;//今天优化下这个jingDuSouSuo函数。//nullcheck一遍
            if (null == key) {//把null key check提前, 搜索加快
                nullCheck = true;
            } else if (key.isEmpty()) {
                nullCheck = true;
            }
            if (nullCheck) {
                newTableModel.getDataVector().clear();
                for (int i = 0; i < tableData_old.length; i++) {
                    newTableModel.insertRow(i, tableData_old[i]);
                }
                newTableModel.fireTableDataChanged();
                return -1;
            }
            int[] reg = new int[tableData_old.length];
            String trimKey = key.replace(" ", "").trim();
            int keyLength = key.length();
            IMV_SIQ_SS mapSearchWithoutSort = null;
            mapSearchWithoutSort = u._A.parserMixStringByReturnFrequencyMap(key, NE);
            int copyCount = 0;
            Iterator<String> iterator = mapSearchWithoutSort.keySet().iterator();
            List<String> list = Iterator_ESU_X_iteratorToList._E(iterator);
            String[] string = List_ESU_X_listToArray._E(list);
            StringBuilder[] stringReg = new StringBuilder[keyLength / 3];
            for (int i = 0; i < stringReg.length; i++) {
                stringReg[i] = new StringBuilder();
                stringReg[i].append(key.substring(i * 3, (i * 3 + 3) < keyLength
                    ? (i * 3 + 3) : keyLength - 1));
            }
            for (int line = 0; line < tableData_old.length; line++) {
                StringBuilder stringTempOut = new StringBuilder();
                //String stringTemp= new String();
                String identify = fileNamePrefix + "_" + line;
                for (int j = 0; j < tableData_old[0].length; j++) {
                    if (null != tableData_old[line][j]) {
                        stringTempOut.append("_-_" + tableData_old[line][j]);
                    } else {
                        stringTempOut.append("_-_ ");
                    }
                }
                String identifyString = "";
                for (int i = 0; i < identifyColumns.length; i++) {
                    identifyString += tableData_old[i];
                }
                String iteratorForCopyString = stringTempOut.toString();
                scoreOutput[copyCount] = stringTempOut.toString();
                Map<String, Double> dnnSet = new IMV_SIQ();
                double perRatio = 0.0;
                if (u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {//DNN分析
                    if (u.DNNmap.containsKey(identifyString)) {
                        dnnSet = u.DNNmap.get(identifyString);
                        double zongfen = dnnSet.get("总分");
                        perRatio = zongfen;//.isInfinite() ? 1 : zongfen; //later inif check
                    }
                }
                Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
                Map<String, Double> DNNcountBonus = new IMV_SIQ();
                double BonusFullRatio = 0.0;
                Here:
                while (iteratorWordFrequency.hasNext()) {
                    String mapSearchaAtII = iteratorWordFrequency.next();
                    WordFrequency wordFrequencySearch = mapSearchWithoutSort.getW(mapSearchaAtII);
                    String posString = wordFrequencySearch.get_pos();
                    if (u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {//DNN计算
                        if (dnnSet.containsKey(mapSearchaAtII)) {
                            double BonusRatio = dnnSet.get(mapSearchaAtII).doubleValue();
                            double BonusPerRatio = BonusRatio / perRatio;
                            if (BonusPerRatio > 0.1 - (u.lookrot * 0.003)) {
                                BonusPerRatio = 2.0;
                            }
                            if (!DNNcountBonus.containsKey(mapSearchaAtII)) {
                                BonusFullRatio += BonusPerRatio;
                            }
                            DNNcountBonus.put(mapSearchaAtII, BonusPerRatio);
                        }
                    }
                    boolean temp = iteratorForCopyString.contains(mapSearchaAtII);
                    if (temp) {
                        if (reg[copyCount] == 0) {
                            count += 1;
                        }
                        score[copyCount] = iteratorForCopyString;
                        if (keyIsPCA) {
                            if (iteratorForCopyString.contains(trimKey)) {
                                reg[copyCount] += 500;
                            }
                            if (key.contains(score[copyCount])) {
                                reg[copyCount] += 500;
                            }
                        }
                        int wfs = (int)wordFrequencySearch.get_frequency();
                        wfs = wfs > 5 ? 5 : wfs;
                        if (!pos.containsKey(mapSearchaAtII)) {
                            reg[copyCount] += 1;
                            score_code[copyCount] += 1 << mapSearchaAtII.length() << wfs;
                            continue Here;
                        }
                        if (S_Maps.mingCi.containsKey(mapSearchaAtII)
                            || S_Maps.dongCi.containsKey(mapSearchaAtII)
                            || S_Maps.xingRongCi.containsKey(mapSearchaAtII)
                            || S_Maps.weiCi.containsKey(mapSearchaAtII)) {
                            reg[copyCount] += 2;
                        }
                        reg[copyCount] += 1;
                        score_code[copyCount] += (temp ? 2 : 1)
                            * (!S_Maps.mingCi.containsKey(mapSearchaAtII)
                            ? S_Maps.dongCi.containsKey(mapSearchaAtII) ? 45 : 1 : 50)
                            << mapSearchaAtII.length() + wfs;
                        continue Here;
                    }
                    if (mapSearchaAtII.length() > 1) {
                        for (int j = 0; j < mapSearchaAtII.length(); j++) {
                            String tempReg = "" + mapSearchaAtII.charAt(j);
                            if (iteratorForCopyString.contains("" + tempReg)) {
                                if (reg[copyCount] == 0) {
                                    count += 1;
                                }
                                score[copyCount] = iteratorForCopyString;
                                scoreOutput[copyCount] = stringTempOut.toString();
                                score_code[copyCount] += 1;
                                reg[copyCount] += 1;
                                if (S_Maps.CiOne.containsKey(tempReg) && (//later all in 1*/
                                    S_Maps.mingCi.containsKey(tempReg)//later..
                                        || S_Maps.dongCi.containsKey(tempReg)
                                        || S_Maps.xingRongCi.containsKey(tempReg)
                                        || S_Maps.weiCi.containsKey(tempReg)
                                )) {
                                    reg[copyCount] += 2;
                                }
                                continue Here;
                            }
                        }
                    }
                }
                if (u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {//DNN计算
                    if (!DNNcountBonus.isEmpty()) {
                        score_code[copyCount] *= (1 + DNNcountBonus.size());
                        score_code[copyCount] *= BonusFullRatio;
                    }
                }
                score_code[copyCount] = score_code[copyCount] * reg[copyCount];
                //词距
                int code = 100;
                int jing_du_sou_suo_suan_zi = 0;
                int zhi_hui_sou_suo_suan_zi = score_code[copyCount];
                boolean jing_du_sou_suo = false;
                if (keyLength > 4) {//全词
                    for (int i = 0; i < string.length; i++) {
                        if (iteratorForCopyString.contains(string[i])) {
                            jing_du_sou_suo_suan_zi += (int)(mapSearchWithoutSort
                                .getW(string[i]).get_frequency()) << 7;
                        }
                    }
                    for (int i = 0; i < stringReg.length; i++) {//断句
                        if (iteratorForCopyString.contains(stringReg[i].toString())) {
                            jing_du_sou_suo_suan_zi += code;
                        }
                    }
                    jing_du_sou_suo = true;
                }
                if (trimKey.length() > 1 && trimKey.length() < 5) {
                    if (iteratorForCopyString.contains(trimKey)) {
                        jing_du_sou_suo_suan_zi += code << 7;
                    }
                    jing_du_sou_suo = true;
                }
                if (jing_du_sou_suo) {
                    double valuea = zhi_hui_sou_suo_suan_zi / Math.pow(u.lookrot + 1, 4);
                    double valueb = jing_du_sou_suo_suan_zi * Math.pow(u.lookrot + 1, 2);
                    valuea = valuea + valueb;
                    score_code[copyCount] = (int)valuea;
//                    score_code[copyCount] = (int) (zhi_hui_sou_suo_suan_zi / Math.pow(u.lookrot + 1, 4)
//                            + jing_du_sou_suo_suan_zi * Math.pow(u.lookrot + 1, 2));
                }
                copyCount++;
            }
        } catch (Exception e) {
            e.printStackTrace();
            u.hook.hookFrequentException("搜索问题", System.currentTimeMillis(), e);
        }
        return count;
    }
}
//
//@SuppressWarnings("unused")
//public int detaSearch(int[] score_code, String[] score
// , DefaultTableModel newTableModel
//		, Object[][] tableData_old, String key, Map<String, String> pos, App_S u
//		, boolean keyIsPCA
//		, int[] identifyColumns, Map<String, int[][]> subASCmap, String fileNamePrefix
//		, String[] scoreOutput) {
//	int count= 0;
//	try {
//		u= NE.app_S;
//		SensingTest sensingTest= null;
//		DNNTest dNNTest= null;
//		ANNTest aNNTest= null;
//		if(u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {
//			//DNN初始		
//			sensingTest= u._A.getSensingTest();
//			dNNTest= new DNNTest();
//			aNNTest= new ANNTest();
//		}
//		boolean nullCheck= false;//今天优化下这个jingDuSouSuo函数。//nullcheck一遍
//		if(null== key) {//把null key check提前, 搜索加快
//			nullCheck= true;
//		}else if(key.isEmpty()) {
//			nullCheck= true;
//		}
//		if(nullCheck) {
//			newTableModel.getDataVector().clear();
//			for(int i= 0; i< tableData_old.length; i++) {
//				newTableModel.insertRow(i, tableData_old[i]);
//			}		
//			newTableModel.fireTableDataChanged();	
//			return -1;
//		}
//		//
//		int[] reg= new int[tableData_old.length];
//		String trimKey= key.replace(" ", "").trim();
//		int keyLength= key.length(); 
//		Map<String, WordFrequency> mapSearchWithoutSort= null;
//		mapSearchWithoutSort= u._A.parserMixStringByReturnFrequencyMap(key, NE);
//		int copyCount= 0;
//		Iterator<String> iterator= mapSearchWithoutSort.keySet().iterator();
//		List<String> list= Iterator_ESU_X_iteratorToList._E(iterator);
//		String[] string= List_ESU_X_listToArray._E(list);
//		StringBuilder[] stringReg= new StringBuilder[keyLength/ 3];
//		for(int i= 0; i< stringReg.length; i++) {
//			stringReg[i]= new StringBuilder();
//			stringReg[i].append(key.substring(i* 3, (i* 3+ 3)
//			< keyLength? (i* 3+ 3): keyLength- 1));
//		}
//		for(int line= 0; line< tableData_old.length; line++) {
//			String stringTemp= new String();
//			String stringTempOut= new String();
//			String identify= fileNamePrefix+"_"+line;
//			for(int j= 0; j< tableData_old[0].length; j++) {
//				if(null!= tableData_old[line][j]) {
//					stringTempOut+= "_-_"+ tableData_old[line][j].toString();
//					stringTemp+= tableData_old[line][j].toString();
//				}else {
//					stringTemp+= "";
//					stringTempOut+= "_-_ ";
//				}
//			}	
//			String identifyString= "";
//			for(int i= 0; i<identifyColumns.length; i++) {
//				identifyString+= tableData_old[i];
//			}
//			String iteratorForCopyString= stringTemp.toString();
//			score[copyCount]= iteratorForCopyString;
//			scoreOutput[copyCount]= stringTempOut.toString();
//			String 待搜索词典= stringTemp;
//			setIdentify(identify, 待搜索词典, subASCmap);
//			Map<String, Double> dnnSet= new IMV_SIQ();
//			double perRatio= 0.0;
//			if(u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {//DNN分析		
//				if(u.DNNmap.containsKey(identifyString)) {
//					dnnSet= u.DNNmap.get(identifyString);
//					double zongfen= dnnSet.get("总分");
//					perRatio= zongfen.isInfinite()? 1: zongfen;
//				}
//			}
//			Iterator<String> iteratorWordFrequency= mapSearchWithoutSort.keySet().iterator();
//			Map<String, Double> DNNcountBonus= new IMV_SIQ();
//			double BonusFullRatio= 0.0;
//			Here:
//				while(iteratorWordFrequency.hasNext()) { 
//					String mapSearchaAtII= iteratorWordFrequency.next();
//					WordFrequency wordFrequencySearch= mapSearchWithoutSort.get(mapSearchaAtII);
//					if(u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {//DNN计算
//						if(dnnSet.containsKey(mapSearchaAtII)) {
//							double BonusRatio= dnnSet.get(mapSearchaAtII).doubleValue();
// 原文分数的总分比值
//							double BonusPerRatio= BonusRatio/ perRatio;//比值分数PCA前10~25
//							if(BonusPerRatio> 0.1- (u.lookrot* 0.003)) {
//								BonusPerRatio= 2.0;
//							}//总分比值的叠加, 只加第一次
//							if(!DNNcountBonus.containsKey(mapSearchaAtII)) {
//								BonusFullRatio+= BonusPerRatio;
//							}
//							DNNcountBonus.put(mapSearchaAtII, BonusPerRatio);
//						}
//					}
//					boolean temp= binaryHRJContains(mapSearchaAtII);
//					if(temp) {
//						if(reg[copyCount]== 0){
//							count+= 1;
//						}
//						score[copyCount]= iteratorForCopyString;
//						scoreOutput[copyCount]= stringTempOut.toString();
//						if(keyIsPCA) {
//							if(binaryHRJContains(trimKey)) {
//								reg[copyCount]+= 500;
//							}
//							if(key.contains(score[copyCount].replace(" ", ""))) {
//								reg[copyCount]+= 500;
//							}
//						}
//						if(!pos.containsKey(mapSearchaAtII)) {
//							reg[copyCount]+= 1;
//							score_code[copyCount]+= 1 << mapSearchaAtII.length()
//									<< wordFrequencySearch.get_frequency() ;
//							continue Here;
//						}
//						if(pos.getString(mapSearchaAtII).contains("名")
//								||pos.get(mapSearchaAtII).contains("动")
//								||pos.get(mapSearchaAtII).contains("形")
//								||pos.get(mapSearchaAtII).contains("谓")) {
//							reg[copyCount]+= 2;
//						}
//						reg[copyCount]+= 1;
//						score_code[copyCount]+= (temp? 2: 1) 
//								* (!pos.get(mapSearchaAtII).contains("名")
//										? pos.get(mapSearchaAtII).contains("动")? 45: 1: 50) 
//								<< mapSearchaAtII.length()* wordFrequencySearch.get_frequency();
//						continue Here;
//					}
//					if(mapSearchaAtII.length()> 1) {
//						for(int j= 0; j<mapSearchaAtII.length(); j++) {
//							if(binaryHRJContains(""+ mapSearchaAtII.charAt(j))) {
//								if(reg[copyCount]== 0){
//									count+= 1;
//								}
//								score[copyCount]= iteratorForCopyString;
//								scoreOutput[copyCount]= stringTempOut.toString();
//								score_code[copyCount]+= 1;
//								reg[copyCount]+= 1;
//								if(pos.containsKey(String.valueOf(mapSearchaAtII.charAt(j)))&&(
//										pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
//										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
//										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
//										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
//										)) {
//									reg[copyCount]+= 2;
//								}
//								continue Here;
//							}
//						}
//					}
//				}
//			if(u.appConfig.SectionJPanel.jlabel_peizhi_di2122.isSelected()) {//DNN计算
//				if(!DNNcountBonus.isEmpty()) {
//					score_code[copyCount]*= (1+ DNNcountBonus.size());
//					score_code[copyCount]*= BonusFullRatio;
//				}
//			}
//			score_code[copyCount]= score_code[copyCount]* reg[copyCount];
//			//词距
//			int code= 100;
//			int jingDuSouSuo算子= 0;
//			int zhi_hui_sou_suo_suan_zi= score_code[copyCount];		
//			boolean jingDuSouSuo= false;
//			if(keyLength> 4) {//全词
//				for(int i= 0; i< string.length; i++) {
//					if(binaryHRJContains(string[i])) {
//						jingDuSouSuo算子+= mapSearchWithoutSort.get(string[i]).get_frequency()<< 7;
//					}
//				}
//				for(int i= 0; i< stringReg.length; i++) {//断句
//					if(binaryHRJContains(stringReg[i].toString())) {
//						jingDuSouSuo算子+= code;
//					}
//				}
//				jingDuSouSuo= true;
//			}
//			if(trimKey.length()> 1&& trimKey.length()< 5) {
//				if(binaryHRJContains(trimKey)) {
//					jingDuSouSuo算子+= code<< 7;
//				}
//				jingDuSouSuo= true;
//			}
//			if(jingDuSouSuo) {
//				score_code[copyCount]= (int) (zhi_hui_sou_suo_suan_zi/Math.pow(u.lookrot+ 1, 4)
//						+ jingDuSouSuo算子* Math.pow(u.lookrot+ 1, 2));
//			}
//			copyCount++;
//		}
//	}catch(Exception e) {
//		e.printStackTrace();
//		u.hook.hookFrequentException("搜索问题", System.currentTimeMillis(), e);
//	}
//	return count;
//}
//233 WriteDNNMap.doWriteDNNMap("C:\\Users\\yaogu\\Desktop\\project\\DNN19228.lyg", u) ;
//char[] ic;
//char[] is;
//public int[] ispos;
//public int[] isascii;
//boolean isFind= false;
//public void setIdentify(String identify, String input, Map<String, int[][]> subASCmap) {
//	int[][] pa= null;
//	if(subASCmap.containsKey(identify)) {
//		pa= subASCmap.get(identify);
//	}
//	ispos= pa[0];
//	isascii= pa[1];
//	ic= input.toCharArray();
//}
//public boolean binaryHRJContains(String search){
//	if(search.isEmpty()) {
//		return false;
//	}
//	isFind= false;
//	is= search.toCharArray();
//	doBinary(0, ic.length-1, ic, is);
//	return isFind;
//}
//
//private void doBinary(int lp, int rp, char[] ic, char[] is) {
//	int mid= (rp- lp)>> 1;
//	int posMid= lp+ mid;
//	if(isascii[posMid]== is[0]) {
//		if(ispos[posMid]+ is.length< ic.length) {
//			for(int i= 0; i< is.length; i++) {
//				if(is[i]!= ic[ispos[posMid]+ i]) {
//					break;
//				}
//			}
//			isFind= true;
//			return;
//		}
//	}
//	if(!isFind) {
//		if(posMid> lp) {
//			doBinary(lp, posMid, ic, is);
//		}
//		if(posMid> lp) {
//			doBinary(posMid, rp, ic, is);
//		}
//	}
//}