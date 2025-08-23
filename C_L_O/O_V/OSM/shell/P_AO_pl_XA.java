package O_V.OSM.shell;

import A_V.E.RatioMap_E;
import ME.VPC.M.app.App;
import M_V.MSV.OSQ.sets.DetaDouble;
import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_ShellETL;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SIQ;
import U_V.ESU.string.String_ESU_X_stringArrayToString;
import U_V.OEU.LYG4DQS4D.LYG9DWithDoubleTopSort4D;
import U_V.OEU.LYG4DQS4D.Quick_7D_luoyaoguang_Sort;
import U_V.OEU.xqpx.wcms.sort.LYG10D13D_X_CAS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"unused"})
//稍后将DMA文件与内存操作替换成 jtable表内存操作 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class P_AO_pl_XA {
    @SuppressWarnings({"unchecked"})
    public static void P_AggregationLimitMap(String[] sets
        , List<IMV_SIQ> output, EmotionSample emotionSample
        , RatioMap_E ratioMap, App NE) {
        List<IMV_SIQ> outputTemp = new ArrayList<>();
        if (sets[1].equalsIgnoreCase("sortNumber")) {
            //outputTemp 是一个arraylist, 已经具备了 排序的 模子。
            //这里通常会有数字和字符串2种模式,
            //于是设计sortNumber, sortString两个语法先
            return;
        }
        if (sets[1].equalsIgnoreCase("进行字符排序")) {
            //outputTemp 是一个 arraylist, 已经具备了 排序的 模子。
            //这里通常会有数字和字符串2种模式,
            //于是设计sortNumber, sortString两个语法先
            //outputTemp
            //先把之前的文字拼音笔画排序接口拿过来,
            //然后面向该接口进行封装适应这里的功能。
            //看怎么改
            outputTemp.addAll(output);
            //1 list 存map
            Map<String, IMV_SIQ> maps = new IMV_SIQ();
            Iterator<IMV_SIQ> iterators = outputTemp.iterator();
            String[] strings = new String[outputTemp.size()];
            int index = 0;
            while (iterators.hasNext()) {
                IMV_SIQ map = iterators.next();
                IMV_SIQ rowValue
                    = (IMV_SIQ) map.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                IMV_SIQ culumnValue = (IMV_SIQ) rowValue.get(sets[0]);
                maps.put(culumnValue.get("culumnValue").toString(), map);
                strings[index++] = culumnValue.get("culumnValue").toString();
            }

            //2 list 去map名
            //3 sort map名
            SortStringDemo.initMap();
            int returnInt = new LYG10D13D_X_CAS()
                .quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(strings
                    , 0, strings.length - 1, 80, SortStringDemo.pinYin
                    , SortStringDemo.biHua, 7, 70);
            //4 输出
            outputTemp.clear();
            if (sets[2].equalsIgnoreCase("从小到大")) {
                for (int i = 0; i < strings.length; i++) {
                    outputTemp.add(maps.get(strings[i]));
                }
            } else if (sets[2].equalsIgnoreCase("从大到小")) {
                for (int i = 0; i < strings.length; i++) {
                    outputTemp.add(maps.get(strings[strings.length - i - 1]));
                }
            }
            output.clear();
            output.addAll(outputTemp);
            return;
        }

        if (sets[1].equalsIgnoreCase("进行数字排序")) {
            //outputTemp 是一个 arraylist, 已经具备了 排序的 模子。
            //这里通常会有数字和字符串2种模式,
            //于是设计sortNumber, sortString两个语法先
            //outputTemp
            //先把之前的文字拼音笔画排序接口拿过来,
            //然后面向该接口进行封装适应这里的功能。
            //看怎么改
            outputTemp.addAll(output);
            //1 list 存map
            Map<String, IMV_SIQ> maps = new IMV_SIQ();
            Iterator<IMV_SIQ> iterators = outputTemp.iterator();
            double[] doubles = new double[outputTemp.size()];
            int index = 0;
            while (iterators.hasNext()) {
                IMV_SIQ map = iterators.next();
                IMV_SIQ rowValue
                    = (IMV_SIQ) map.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                IMV_SIQ culumnValue = (IMV_SIQ) rowValue.get(sets[0]);
                maps.put(culumnValue.get("culumnValue").toString(), map);
                doubles[index++] = Double.valueOf(culumnValue.get("culumnValue").toString());
            }

            //2 list 去map名
            //3 sort map名
//			SortStringDemo.initMap();	
//			int returnInt= new LYG10DWCMSSort13D_X_C_A_S()
//					.quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(strings
//							, 0, strings.length- 1, 80, SortStringDemo.pinYin
//							, SortStringDemo.biHua, 7, 70);
            new LYG9DWithDoubleTopSort4D().sort(doubles, 7, 70);
            //4 输出
            outputTemp.clear();
            if (sets[2].equalsIgnoreCase("从小到大")) {
                for (int i = 0; i < doubles.length; i++) {
                    outputTemp.add(maps.get("" + doubles[i]));
                }
            } else if (sets[2].equalsIgnoreCase("从大到小")) {
                for (int i = 0; i < doubles.length; i++) {
                    outputTemp.add(maps.get("" + doubles[doubles.length - i - 1]));
                }
            }
            output.clear();
            output.addAll(outputTemp);
            return;
        }

        if (sets[1].equalsIgnoreCase("行至")) {
            Iterator<IMV_SIQ> iterator = output.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                int rowid = count++;
                IMV_SIQ row = iterator.next();
                IMV_SIQ rowMap = new IMV_SIQ();
                if (sets[1].equalsIgnoreCase("行至")) {
                    if (rowid >= new BigDecimal(sets[0]).doubleValue() && rowid
                        <= new BigDecimal(sets[2]).doubleValue()) {
                        outputTemp.add(row);
                    }
                }
            }
            output.clear();
            output.addAll(outputTemp);
            return;
        }
        //稍后我会把这里 改成 contains 德塔DNN词汇, 这样语言就自适应了。
        //罗瑶光 20211003
        if (sets[1].equalsIgnoreCase("颜色标记为")) {
            Iterator<IMV_SIQ> iterator = output.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                int rowid = count++;
                IMV_SIQ row = iterator.next();
                IMV_SIQ rowMap = new IMV_SIQ();
                if (sets[1].equalsIgnoreCase("颜色标记为")) {
                    IMV_SIQ map
                        = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                    IMV_SIQ mapCulumn = (IMV_SIQ) map.get(sets[0]);
                    String rowCellFromString = mapCulumn.get("culumnValue").toString();
                    if (sets[2].equals("红色")) {
                        sets[2] = "red";
                    }
                    if (sets[2].equals("黄色")) {
                        sets[2] = "yellow";
                    }
                    if (sets[2].equals("蓝色")) {
                        sets[2] = "blue";
                    }
                    if (sets[2].equals("绿色")) {
                        sets[2] = "green";
                    }
                    rowCellFromString = "<div style=\"background:black\"><font color=\""
                        + sets[2] + "\">"
                        + rowCellFromString + "</font></div>";
                    //更新
                    outputTemp.remove(row);
                    mapCulumn.put("culumnValue", rowCellFromString);
                    map.put(sets[0], mapCulumn);
                    row.put(S_ShellETL.SHELL_ETL_ROWVALUE, map);
                    outputTemp.add(row);
                }
            }
            output.clear();
            output.addAll(outputTemp);
            return;
        }

        //之后分出去准备思考怎么分类。罗瑶光
        if (String_ESU_X_stringArrayToString._E(sets).contains("替换")) {
            Iterator<IMV_SIQ> iterator = output.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                int rowid = count++;
                IMV_SIQ row = iterator.next();
                IMV_SIQ rowMap = new IMV_SIQ();
                //先分类, 之后再统一进行管理
                if (sets[1].equalsIgnoreCase("把")) {
                    if (sets[3].equalsIgnoreCase("替换为")) {
                        IMV_SIQ map = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                        IMV_SIQ mapCulumn = (IMV_SIQ) map.get(sets[0]);
                        String rowCellFromString = mapCulumn.get("culumnValue").toString();
                        rowCellFromString = rowCellFromString.replace(sets[2], sets[4]);
                        //更新
                        outputTemp.remove(row);
                        mapCulumn.put("culumnValue", rowCellFromString);
                        map.put(sets[0], mapCulumn);
                        row.put(S_ShellETL.SHELL_ETL_ROWVALUE, map);
                        outputTemp.add(row);
                    }
                }
                if (sets[2].equalsIgnoreCase("被")) {
                    if (sets[3].equalsIgnoreCase("替换为")) {
                        IMV_SIQ map = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                        IMV_SIQ mapCulumn = (IMV_SIQ) map.get(sets[0]);
                        String rowCellFromString = mapCulumn.get("culumnValue").toString();
                        rowCellFromString = rowCellFromString.replace(sets[1], sets[4]);
                        //更新
                        outputTemp.remove(row);
                        mapCulumn.put("culumnValue", rowCellFromString);
                        map.put(sets[0], mapCulumn);
                        row.put(S_ShellETL.SHELL_ETL_ROWVALUE, map);
                        outputTemp.add(row);
                    }
                    if (sets[4].equalsIgnoreCase("替换")) {
                        IMV_SIQ map = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                        IMV_SIQ mapCulumn = (IMV_SIQ) map.get(sets[0]);
                        String rowCellFromString = mapCulumn.get("culumnValue").toString();
                        rowCellFromString = rowCellFromString.replace(sets[1], sets[3]);
                        //更新
                        outputTemp.remove(row);
                        mapCulumn.put("culumnValue", rowCellFromString);
                        map.put(sets[0], mapCulumn);
                        row.put(S_ShellETL.SHELL_ETL_ROWVALUE, map);
                        outputTemp.add(row);
                    }
                }
                if (sets[1].equalsIgnoreCase("用")) {
                    if (sets[3].equalsIgnoreCase("替换")) {
                        IMV_SIQ map = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                        IMV_SIQ mapCulumn = (IMV_SIQ) map.get(sets[0]);
                        String rowCellFromString = mapCulumn.get("culumnValue").toString();
                        rowCellFromString = rowCellFromString.replace(sets[4], sets[2]);
                        //更新
                        outputTemp.remove(row);
                        mapCulumn.put("culumnValue", rowCellFromString);
                        map.put(sets[0], mapCulumn);
                        row.put(S_ShellETL.SHELL_ETL_ROWVALUE, map);
                        outputTemp.add(row);
                    }
                }
            }
        }
        //操作|进行分词|词性显色;
        //操作|进行分词|词性标注;
        //操作|进行分词|DNN;
        if (sets[1].equalsIgnoreCase("进行分词")) {
            Iterator<IMV_SIQ> iterator = output.iterator();
            int count = 0;
            while (iterator.hasNext()) {
                int rowid = count++;
                IMV_SIQ row = iterator.next();
                IMV_SIQ rowMap = new IMV_SIQ();
                if (sets[2].equalsIgnoreCase("词性显色")) {
                    IMV_SIQ map = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                    IMV_SIQ mapCulumn = (IMV_SIQ) map.get(sets[0]);
                    String rowCellFromString = mapCulumn.get("culumnValue").toString();
                    List<String> list = NE.app_S._A.parserMixedString(rowCellFromString);
                    IMV_SIQ nlp = NE.app_S._A.getPosCnToCn();
                    Iterator<String> iterators = list.iterator();
                    rowCellFromString = "";
                    rowCellFromString += "<div style=\"background:white\">";
                    while (iterators.hasNext()) {
                        String string = iterators.next();
                        if (nlp.containsKey(string)) {
                            rowCellFromString += "<font color=\"" +
                                (!S_Maps.dongCi.containsKey(string)
                                    ? !S_Maps.mingCi.containsKey(string)
                                    ? !S_Maps.xingRongCi.containsKey(string) ?
                                    "black" : "blue" : "red" : "green") + "\">"
                                + string + "</font>";
                        }
                    }
                    rowCellFromString += "</div>";
                    //rowCellFromString= "<div style=\"background:white\"><font color=\""+ sets[2] +"\">"
                    //+ rowCellFromString+ "</font></div>";
                    //更新
                    outputTemp.remove(row);
                    mapCulumn.put("culumnValue", rowCellFromString);
                    map.put(sets[0], mapCulumn);
                    row.put(S_ShellETL.SHELL_ETL_ROWVALUE, map);
                    outputTemp.add(row);
                }
                if (sets[2].equalsIgnoreCase("词性标注")) {
                    IMV_SIQ map = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                    IMV_SIQ mapCulumn = (IMV_SIQ) map.get(sets[0]);
                    String rowCellFromString = mapCulumn.get("culumnValue").toString();
                    List<String> list = NE.app_S._A.parserMixedString(rowCellFromString);
                    IMV_SIQ nlp = NE.app_S._A.getPosCnToCn();
                    Iterator<String> iterators = list.iterator();
                    rowCellFromString = "";
                    rowCellFromString += "<div style=\"background:white\">";
                    while (iterators.hasNext()) {
                        String string = iterators.next();
                        if (nlp.containsKey(string)) {
                            rowCellFromString += string + "(" + nlp.get(string) + ") ";
                        }
                    }
                    rowCellFromString += "</div>";
                    //rowCellFromString= "<div style=\"background:white\"><font color=\""+ sets[2] +"\">"
                    //+ rowCellFromString+ "</font></div>";
                    //更新
                    outputTemp.remove(row);
                    mapCulumn.put("culumnValue", rowCellFromString);
                    map.put(sets[0], mapCulumn);
                    row.put(S_ShellETL.SHELL_ETL_ROWVALUE, map);
                    outputTemp.add(row);
                }
                //之后我会把dataCG函数进行重新封装, 去重。
                if (sets[2].equalsIgnoreCase("DNN")) {
                    IMV_SIQ map = (IMV_SIQ) row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
                    IMV_SIQ mapCulumn = (IMV_SIQ) map.get(sets[0]);
                    String rowCellFromString = mapCulumn.get("culumnValue").toString();
                    //
                    ////20230106-System.out.printntln(string);
                    SensingTest sensingTest = NE.app_S._A.getSensingTest();
                    DNNTest dNNTest = NE.app_S.dNNTest;
                    ANNTest aNNTest = NE.app_S.aNNTest;
                    RNN_IDETest rNN_IDETest = NE.app_S.rNN_IDETest;
                    String[][] ann = aNNTest.getANNMatrix(rowCellFromString, NE);
                    String[][] dnn = dNNTest.getDNNMatrix(ann, rowCellFromString, NE);
                    List<String> cigan = new LinkedList<>();
                    Here:
                    for (int i = 0; i < dnn.length; i++) {
                        double dnn_lwa = 0.0;
                        if (null == dnn[i][3]) {
                            continue Here;
                        }
                        dnn_lwa = DetaDouble.parseDouble(dnn[i][3]);
                        if (dnn_lwa > 0) {
                            String line = "";
                            line += ann[i][0] + ":";
                            line += dnn[i][3] + ":";
                            cigan.add(line);
                        }
                    }
                    String[][] value = new String[cigan.size()][2];
                    Iterator<String> iterators = cigan.iterator();
                    int valueCount = 0;
                    while (iterators.hasNext()) {
                        String iteratorString = iterators.next();
                        value[valueCount][0] = iteratorString.split(":")[0];
                        value[valueCount++][1] = iteratorString.split(":")[1];
                    }
                    //value= new Quick_6D_luoyaoguang_Sort().sort(value);
                    value = new Quick_7D_luoyaoguang_Sort().sort(value);
                    String cg = "词名/DNN";
                    cg += "\r\n";
                    for (int i = 0; i < value.length; i++) {
                        cg += value[i][0] + ":" + value[i][1] + "\r\n";
                    }
                    rowCellFromString += "<div style=\"background:white\">";
                    rowCellFromString += cg + "</div>";
                    //更新
                    outputTemp.remove(row);
                    mapCulumn.put("culumnValue", rowCellFromString);
                    map.put(sets[0], mapCulumn);
                    row.put(S_ShellETL.SHELL_ETL_ROWVALUE, map);
                    outputTemp.add(row);
                }
            }
            output.clear();
            output.addAll(outputTemp);
            return;
        }
//		//操作:进行合并:列名:上中下
        //
//		if(sets[1].equalsIgnoreCase("进行合并")) {
////		}

//		//稍后把这里 行遍历 改成 命令遍历。提高计算速度
//		//罗瑶光20211002
//		Iterator<IMV_SIQ> iterator= output.iterator();
//		int count= 0;
//		while(iterator.hasNext()) {
//			int rowid= count++;
//			IMV_SIQ row= iterator.next();
//			IMV_SIQ rowMap= new IMV_SIQ();
//			if(sets[1].equalsIgnoreCase("行至")) {
//				if(rowid >= new BigDecimal(sets[0]).doubleValue() && rowid 
//						<= new BigDecimal(sets[2]).doubleValue()) {
//					outputTemp.add(row);
//				}	
//			}
//
//			if(sets[1].equalsIgnoreCase("颜色")) {
//				IMV_SIQ map= (IMV_SIQ)row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
//				IMV_SIQ mapCulumn= (IMV_SIQ)map.get(sets[0]);
//				String rowCellFromString= mapCulumn.get("culumnValue").toString();
//				if(sets[2].equals("红色")) {
//					sets[2]= "red";
//				}
//				if(sets[2].equals("黄色")) {
//					sets[2]= "yellow";
//				}
//				if(sets[2].equals("蓝色")) {
//					sets[2]= "blue";
//				}
//				if(sets[2].equals("绿色")) {
//					sets[2]= "green";
//				}
//				rowCellFromString= "<div style=\"background:black\"><font color=\""+ sets[2] +"\">"
//						+ rowCellFromString+ "</font></div>";
//				//更新
//				outputTemp.remove(row);
//				mapCulumn.put("culumnValue", rowCellFromString);
//				map.put(sets[0], mapCulumn);
//				row.put(S_ShellETL.SHELL_ETL_ROWVALUE, map);
//				outputTemp.add(row);
//			}
//
//			if(sets[1].equalsIgnoreCase("分词")) {
//				IMV_SIQ map= (IMV_SIQ)row.get(S_ShellETL.SHELL_ETL_ROWVALUE);
//				IMV_SIQ mapCulumn= (IMV_SIQ)map.get(sets[0]);
//				String rowCellFromString= mapCulumn.get("culumnValue").toString();
//				List<String> list= HRJFrame.NE.app_S._A.parserMixedString(rowCellFromString);
//				Map<String, String> nlp= HRJFrame.NE.app_S._A.getPosCnToCn();
//				Iterator<String> iterators= list.iterator();
//				rowCellFromString= "";
//				rowCellFromString+= "<div style=\"background:white\">";
//				while(iterators.hasNext()) {
//					String string= iterators.next();
//					if(nlp.containsKey(string)) {
//						rowCellFromString+= "<font color=\""+ 
//								(!nlp.get(string).contains("动")?!nlp.get(string).contains("名")?!nlp.get(string).contains("形")?
//										"black": "blue": "red": "green") +"\">"
//										+ string+ "</font>";
//					}
//				}
//				rowCellFromString+= "</div>";
//				//rowCellFromString= "<div style=\"background:white\"><font color=\""+ sets[2] +"\">"
//				//+ rowCellFromString+ "</font></div>";
//				//更新
//				outputTemp.remove(row);
//				mapCulumn.put("culumnValue", rowCellFromString);
//				map.put(sets[0], mapCulumn);
//				row.put(S_ShellETL.SHELL_ETL_ROWVALUE, map);
//				outputTemp.add(row);
//			}
//		}	
        output.clear();
        output.addAll(outputTemp);
    }

    //分出去
    public static void P_PletlLimitMap(String[] sets, List<IMV_SIQ> obj) {


    }
}
