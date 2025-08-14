package plshell;

import dnn.GetDNNMap;
import ME.VPC.M.app.App;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Cell;
import O_V.OP.SM.AOP.MEC.SIQ.SM.reflection.Row;
import O_V.OSA.shell.XA_ShellTable;
import O_V.OSA.shell.XA_ShellTables;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import U_V.ESU.list.List_ESU_X_listToArray;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

//稍后将DMA文件与内存caoZuo替换成 jtable表内存caoZuo 罗瑶光
@SuppressWarnings({"unused"})
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class P_CO_XA_X_Map extends P_CO_XA_X_ {
    //以后优化成统一对象输出, 不需要再转换。2019-1-15 tin
    public static IMV_SIQ rowToRowMap(Row row) {
        IMV_SIQ culumnMaps = new IMV_SIQ();
        IMV_SIQ rowMap = new IMV_SIQ();
        for (String cellName : row.getCells().keySet()) {
            if (!cellName.contains("is_delete")) {
                Cell cell = row.getCell(cellName);
                IMV_SIQ culumnMap = new IMV_SIQ();
                culumnMap.putString(S_ShellETL.SHELL_ETL_CULUMNNAME, cellName);
                if (null != cell && null != cell.getCellValue()) {
                    culumnMap.putString("culumnValue", cell.getCellValue().toString());
                } else {
                    culumnMap.putString("culumnValue", "");
                }
                culumnMaps.put_IMV_SIQ(cellName, culumnMap);
            }
        }
        rowMap.put_IMV_SIQ(S_ShellETL.SHELL_ETL_ROWVALUE, culumnMaps);
        return rowMap;
    }

    //将rowToRowMap 进行逆向 RowMapToRow 一来验证, 2来找最小计算模型, 方便下一步表格编译计算。
    //罗瑶光202109302339
    @SuppressWarnings("unchecked")
    public static Row rowMapToRow(IMV_SIQ _IMV_SIQ_) {
        Row row = new Row();
        ConcurrentHashMap<String, Cell> cells = new IMV_SIQ();
        row.I_Cells(cells);
        IMV_SIQ _IMV_SIQ = _IMV_SIQ_.QSV_IMV_SIQ(S_ShellETL.SHELL_ETL_ROWVALUE);
        for (String cellName : (Iterable<String>) _IMV_SIQ.keySet()) {
            if (!cellName.contains("is_delete")) {
                Cell cell = new Cell();
                IMV_SIQ culumnMap = _IMV_SIQ.QSV_IMV_SIQ(cellName);
                cell.I_CellValue(culumnMap.get("culumnValue"));
                row.putCell(cellName, cell);
            }
        }
        return row;
    }

    //猫腻哥 把我pmap的output 都改了, 今天一查问题全出来了。20210927
    //懒得管, 把P_Map 改成 shellP_Map
    public static void P_Map(String[] sets, List<IMV_SIQ> output, String tableName
        , IMV_SIQ object, App NE) {
        //算了统一接口, 以后统一优化改。
        List<IMV_SIQ> outputTemp = new ArrayList<>();
        //创建一个table
        XA_ShellTable table;
        //outputTemp.addAll(output);
        if (output.isEmpty() && object.get("firstTime").equals("true")) {
            table = XA_ShellTables.searchShellTables.get(tableName);
            object.putString("firstTime", "others");
        } else {
            Row[] huaRuiJiJtableRows = new Row[output.size()];
            for (int i = 0; i < output.size(); i++) {
                huaRuiJiJtableRows[i] = P_CO_XA_X_Map.rowMapToRow(output.get(i));
            }
            table = new XA_ShellTable();
            table.setHuaRuiJiJtableRows(huaRuiJiJtableRows);
        }
        //修改下把output的逻辑重复利用 满足conditon的and 和or
        //只拿前50行 以后改成分页
        //稍后把这个函数片段移除这个文件, 变成一个函数。
        if (sets[1].equalsIgnoreCase("精度搜索")) {
            //table to object
            //稍后我的养疗经界面搜索release函数的 片段 这里也可以优化如下。
            String key = sets[2];
            if (null == key || key.equals("")) {
                return;
            }
            String[] score = new String[table.huaRuiJiJtableRows.length];
            int[] score_code = new int[table.huaRuiJiJtableRows.length];
            int[] reg = new int[table.huaRuiJiJtableRows.length];
            int count = 0;
            IMV_SIQ pos = NE.app_S._A.getPosCnToCn();
            IMV_SIQ_SS mapSearchWithoutSort;
            mapSearchWithoutSort = NE.app_S._A.parserMixStringByReturnFrequencyMap(key, NE);
            //Iterator<String> iteratorForCopy= copy.iterator();*/
            int copyCount = 0;
            List<String> list = NE.app_S._A.parserMixedString(key);
            String[] string = List_ESU_X_listToArray._E(list);
            String[] stringReg = new String[key.length() / 3];
            for (int i = 0; i < stringReg.length; i++) {
                stringReg[i] = key.substring(i * 3, (i * 3 + 3) < key.length()
                    ? (i * 3 + 3) : key.length() - 1);
            }
            IMV_SIQ map = new IMV_SIQ();
            for (int i = 0; i < table.huaRuiJiJtableRows.length; i++) {
                //while(iteratorForCopy.hasNext()) {*/
                String temps = table.huaRuiJiJtableRows[i].getCell(sets[0]).getCellValue().toString();
                score[copyCount] = "i" + i;//因为 不再有map key, 所以就通用为map 内容。*/
                map.putRow(score[copyCount], table.huaRuiJiJtableRows[i]);
                Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
                Here:
                while (iteratorWordFrequency.hasNext()) {
                    String mapSearchaAtII = iteratorWordFrequency.next();
                    WordFrequency wordFrequencySearch = mapSearchWithoutSort.getW(mapSearchaAtII);
                    int wfs = (int) wordFrequencySearch.get_frequency();
                    wfs = Math.min(wfs, 5);
                    if (temps.contains(mapSearchaAtII)) {
                        if (reg[copyCount] == 0) {
                            count += 1;
                        }
                        //score[copyCount]= temps;//因为 不再有map key, 所以就通用为map 内容。, 还是需要map
                        //if(score[copyCount].contains(key.replace(" ", ""))) {
                        //	reg[copyCount]+= 500;
                        //}
                        //if(key.contains(score[copyCount].replace(" ", ""))) {
                        //	reg[copyCount]+= 500;
                        //}*/
                        if (temps.contains(key.replace(" ", ""))) {
                            reg[copyCount] += 500;
                        }
                        if (key.contains(temps.replace(" ", ""))) {
                            reg[copyCount] += 500;
                        }
                        if (!pos.containsKey(mapSearchaAtII)) {
                            reg[copyCount] += 1;
                            score_code[copyCount] += 1 << mapSearchaAtII.length() << wfs;
                            continue;
                        }
                        if (S_Maps.mingCi.containsKey(mapSearchaAtII)
                            || S_Maps.dongCi.containsKey(mapSearchaAtII)
                            || S_Maps.xingRongCi.containsKey(mapSearchaAtII)
                            || S_Maps.weiCi.containsKey(mapSearchaAtII)) {
                            reg[copyCount] += 2;
                        }
                        reg[copyCount] += 1;
                        score_code[copyCount] += (temps.contains(mapSearchaAtII) ? 2 : 1)
                            * (!S_Maps.mingCi.containsKey(mapSearchaAtII)
                            ? S_Maps.dongCi.containsKey(mapSearchaAtII) ? 45 : 1 : 50)
                            << mapSearchaAtII.length() + wfs;
                        continue;
                    }
                    if (mapSearchaAtII.length() > 1) {
                        for (int j = 0; j < mapSearchaAtII.length(); j++) {
                            String temp = "" + mapSearchaAtII.charAt(j);
                            if (temps.contains(temp)) {
                                if (reg[copyCount] == 0) {
                                    count += 1;
                                }
                                //		score[copyCount]= temps;
                                score_code[copyCount] += 1;
                                if (S_Maps.CiOne.containsKey(temp) && (
                                    S_Maps.mingCi.containsKey(temp)//later..
                                        || S_Maps.dongCi.containsKey(temp)
                                        || S_Maps.xingRongCi.containsKey(temp)
                                        || S_Maps.weiCi.containsKey(temp)
                                )) {
                                    reg[copyCount] += 2;
                                }
                                reg[copyCount] += 1;
                                continue Here;
                            }
                        }
                    }
                }
                score_code[copyCount] = score_code[copyCount] * reg[copyCount];
                //词距*/
                int code = 100;
                int tempb = 0;
                int tempa = score_code[copyCount];
                if (key.length() > 4) {
                    //全词
                    for (String s : string) {
                        if (temps.contains(s)) {
                            tempb += code;
                        }
                    }
                    //断句
                    for (String s : stringReg) {
                        if (temps.contains(s)) {
                            tempb += code;
                        }
                    }
                    score_code[copyCount] = (int) (tempa / Math.pow(NE.app_S.lookrot + 1, 4)
                        + tempb * Math.pow(Integer.parseInt(sets[3]), 2));
                }
                if (key.replace(" ", "").length() > 1
                    && key.replace(" ", "").length() < 5) {
                    if (temps.contains(key.replace(" ", ""))) {
                        tempb += code << 7;
                    }
                    score_code[copyCount] = (int) (tempa / Math.pow(Integer.parseInt(sets[3])
                        + 1, 4) + tempb * Math.pow(Integer.parseInt(sets[3]), 2));
                }
                copyCount++;
            }
            NE.app_S.lYGSortESU9D.javaSort(score_code, score);
            int max = score_code[0];
            Object[][] tableData = new Object[count][18];
            int new_count = 0;
            //			newTableModel.getDataVector().clear();
            //			if(null== key|| key.equals("")) {
            //				return;
            //			}
            //recordRows 没有 值
            //recordRows 有 值*/
            for (int i = score.length - 1; i > 0; i--) {
                if (score_code[i] < 1) {
                    continue;
                }
                outputTemp.add(P_CO_XA_X_Map.rowToRowMap(map.getRow(score[i])));
            }
            output.clear();
            output.addAll(outputTemp);
            return;
        }

        if (sets[1].equalsIgnoreCase("DNN搜索")) {
            //table to object
            //稍后我的养疗经界面搜索release函数的 片段 这里也可以优化如下。
            //DNN分析*/
            String key = sets[3];
            if (null == key || key.equals("")) {
                return;
            }
            IMV_SIQ dnnSet = new IMV_SIQ();
            double perRatio = 0.0;
            if (null == NE.app_S.DNNmap || NE.app_S.DNNmap.isEmpty()) {
                NE.app_S.DNNmap = GetDNNMap.doGetDNNMap(NE.app_S, NE);
            }
            String[] score = new String[table.huaRuiJiJtableRows.length];
            int[] score_code = new int[table.huaRuiJiJtableRows.length];
            int[] reg = new int[table.huaRuiJiJtableRows.length];
            int count = 0;
            IMV_SIQ pos = NE.app_S._A.getPosCnToCn();
            IMV_SIQ_SS mapSearchWithoutSort;
            mapSearchWithoutSort = NE.app_S._A.parserMixStringByReturnFrequencyMap(key, NE);
            //Iterator<String> iteratorForCopy= copy.iterator();*/
            int copyCount = 0;
            List<String> list = NE.app_S._A.parserMixedString(key);
            String[] string = List_ESU_X_listToArray._E(list);
            String[] stringReg = new String[key.length() / 3];
            for (int i = 0; i < stringReg.length; i++) {
                stringReg[i] = key.substring(i * 3, (i * 3 + 3) < key.length() ? (i * 3 + 3) : key.length() - 1);
            }
            IMV_SIQ map = new IMV_SIQ();
            for (int i = 0; i < table.huaRuiJiJtableRows.length; i++) {
                String temps = table.huaRuiJiJtableRows[i].getCell(sets[0]).getCellValue().toString();
                String textContent = table.huaRuiJiJtableRows[i].getCell(sets[2]).getCellValue().toString();
                if (NE.app_S.DNNmap.containsKey(temps)) {
                    dnnSet = NE.app_S.DNNmap.get(temps);
                    double zongfen = dnnSet.getDouble("总分");
                    perRatio = zongfen;//.isInfinite() ? 1 : zongfen;
                    //dnnSet.remove("总分");//不参与搜索算子；
                } else {
                    //return 失败没有找到主码dnn表 key
                    NE.app_S.hook.hookFrequentException("DNN搜索没有找到主码dnn表 key"
                        , System.currentTimeMillis(), new Exception());
                }
                score[copyCount] = "i" + i;//因为 不再有map key, 所以就通用为map 内容。
                map.putRow(score[copyCount], table.huaRuiJiJtableRows[i]);
                Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
                IMV_SIQ DNNcountBonus = new IMV_SIQ();
                double BonusFullRatio = 0.0;
                Here:
                while (iteratorWordFrequency.hasNext()) {
                    String mapSearchaAtII = iteratorWordFrequency.next();
                    WordFrequency wordFrequencySearch = mapSearchWithoutSort.getW(mapSearchaAtII);
                    int wfs = (int) wordFrequencySearch.get_frequency();
                    wfs = Math.min(wfs, 5);
                    if (dnnSet.containsKey(mapSearchaAtII)) {
                        //dnn 不同核心词汇bouns。
                        //罗瑶光先生定义dnn bonus由3个部分组成, 1 核心词汇数量, 2核心词汇的比值,
                        //3 核心词汇的频率（常规已经baoHan, 于是略）, 于是公式为 核心词汇的比值为其
                        //DNN的分数/DNN核心词汇总分, 核心词汇数量为 核心词汇的比值相加；
                        //获取dnn词汇原文分数
                        double BonusRatio = dnnSet.getDouble(mapSearchaAtII);
                        //原文分数的总分比值
                        double BonusPerRatio = BonusRatio / perRatio;
                        //比值分数PCA前10~25
                        if (BonusPerRatio > 0.1 - (Integer.parseInt(sets[4]) * 0.003)) {
                            BonusPerRatio = 2.0;
                        }
                        //总分比值的叠加, 只加第一次
                        if (!DNNcountBonus.containsKey(mapSearchaAtII)) {
                            BonusFullRatio += BonusPerRatio;
                        }
                        DNNcountBonus.putDouble(mapSearchaAtII, BonusPerRatio);
                        //dnn 不同核心词汇bouns。
                        //reg[copyCount]+= DNNcountBonus.size();
                    }
                    if (textContent.contains(mapSearchaAtII)) {
                        if (reg[copyCount] == 0) {
                            count += 1;
                        }
                        if (temps.contains(key.replace(" ", ""))) {
                            reg[copyCount] += 500;
                        }
                        if (key.contains(temps.replace(" ", ""))) {
                            reg[copyCount] += 500;
                        }
                        if (!pos.containsKey(mapSearchaAtII)) {
                            reg[copyCount] += 1;
                            score_code[copyCount]
                                += 1 << mapSearchaAtII.length() << wfs;
                            continue;
                        }
                        if (S_Maps.mingCi.containsKey(mapSearchaAtII)
                            || S_Maps.dongCi.containsKey(mapSearchaAtII)
                            || S_Maps.xingRongCi.containsKey(mapSearchaAtII)
                            || S_Maps.weiCi.containsKey(mapSearchaAtII)) {
                            reg[copyCount] += 2;
                        }
                        reg[copyCount] += 1;
                        score_code[copyCount] += (temps.contains(mapSearchaAtII) ? 2 : 1)
                            * (!S_Maps.mingCi.containsKey(mapSearchaAtII)
                            ? S_Maps.dongCi.containsKey(mapSearchaAtII) ? 45 : 1 : 50)
                            << mapSearchaAtII.length() + wfs;
                        continue;
                    }
                    if (mapSearchaAtII.length() > 1) {
                        for (int j = 0; j < mapSearchaAtII.length(); j++) {
                            char temp = mapSearchaAtII.charAt(j);
                            if (textContent.contains(String.valueOf(temp))) {
                                if (reg[copyCount] == 0) {
                                    count += 1;
                                }
                                //		score[copyCount]= temps;
                                score_code[copyCount] += 1;
                                if (pos.containsKeyChar(temp) && (
                                    pos.getString(temp).contains("名")//later..
                                        || pos.getString(temp).contains("动")
                                        || pos.getString(temp).contains("形")
                                        || pos.getString(temp).contains("谓")
                                )) {
                                    reg[copyCount] += 2;
                                }
                                reg[copyCount] += 1;
                                continue Here;
                            }
                        }
                    }
                }
                if (!DNNcountBonus.isEmpty()) {
                    score_code[copyCount] *= (1 + DNNcountBonus.size());
                    score_code[copyCount] *= BonusFullRatio;
                }
                score_code[copyCount] = score_code[copyCount] * reg[copyCount];
                //词距
                int code = 100;
                int tempb = 0;
                int tempa = score_code[copyCount];
                if (key.length() > 4) {
                    //全词
                    for (String s : string) {
                        if (temps.contains(s)) {
                            tempb += code;
                        }
                    }
                    //断句
                    for (String s : stringReg) {
                        if (temps.contains(s)) {
                            tempb += code;
                        }
                    }
                    double valuea = tempa / Math.pow(Integer.parseInt(sets[4]) + 1, 4);
                    double valueb = tempb * Math.pow(Integer.parseInt(sets[4]) + 1, 2);
                    valuea = valuea + valueb;
                    score_code[copyCount] = (int) valuea;
                }
                if (key.replace(" ", "").length() > 1
                    && key.replace(" ", "").length() < 5) {
                    if (temps.contains(key.replace(" ", ""))) {
                        tempb += code << 7;
                    }
                    double valuea = tempa / Math.pow(Integer.parseInt(sets[4]) + 1, 4);
                    double valueb = tempb * Math.pow(Integer.parseInt(sets[4]) + 1, 2);
                    valuea = valuea + valueb;
                    score_code[copyCount] = (int) valuea;
                }
                copyCount++;
            }
            NE.app_S.lYGSortESU9D.javaSort(score_code, score);
            int max = score_code[0];
            Object[][] tableData = new Object[count][18];
            int new_count = 0;
            for (int i = score.length - 1; i > 0; i--) {
                if (score_code[i] < 1) {
                    continue;
                }
                outputTemp.add(P_CO_XA_X_Map.rowToRowMap(map.getRow(score[i])));
            }
            output.clear();
            output.addAll(outputTemp);
            return;
        }

        int max = 50;
        //获取table的row
        for (int i = 0; i < table.huaRuiJiJtableRows.length; i++) {
            Row row = table.huaRuiJiJtableRows[i];
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_SMALL)
                || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_THAN)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                //大家看见没, rowvalue是 db的 Row单例, 这里竟然是output的iterator。2019年被动手脚了。
                if (new BigDecimal(rowCellFromString).doubleValue()
                    < new BigDecimal((S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])).doubleValue()) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_AND_EQUAL_TO)
                || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_AND_EQUAL_TO_R)
                || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_LESS_THAN_AND_EQUAL_TO)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (new BigDecimal(rowCellFromString).doubleValue()
                    <= new BigDecimal((S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])).doubleValue()) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOUBLE_EQUALS)
                || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_SIMPLE_EUQALS)
                || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_TRIPAL_EQUALS)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (new BigDecimal(rowCellFromString).doubleValue()
                    == new BigDecimal((S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])).doubleValue()) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO)
                || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_AND_EQUAL_TO_R)
                || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_THAN_AND_EQUAL_TO)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (new BigDecimal(rowCellFromString).doubleValue()
                    >= new BigDecimal((S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])).doubleValue()) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER)
                || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_GREATER_THAN)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (new BigDecimal(rowCellFromString).doubleValue()
                    > new BigDecimal((S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])).doubleValue()) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_STRING_LENGTH_GREATER_THAN)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (rowCellFromString.length() > new BigDecimal((S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])).doubleValue()) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_STRING_LENGTH_LESS_THAN)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (rowCellFromString.length() < new BigDecimal((S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])).doubleValue()) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_EUQAL_TO)
                || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_EUQAL_TO_R)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (new BigDecimal(rowCellFromString).doubleValue() != new BigDecimal(sets[2]).doubleValue()) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_CONTANS)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (rowCellFromString.contains(S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])) {
                    //if(rowCellFromString.contains(sets[2])) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_FILTER_BY)
                || sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOES_NOT_CONTANS)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (!rowCellFromString.contains(S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_EQUAL)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (rowCellFromString.equalsIgnoreCase(S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_DOES_NOT_EQUALS)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                if (!rowCellFromString.equalsIgnoreCase(S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2])) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase((S_ShellETL.SHELL_ETL_IN))) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                String set = ", " + (S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2]) + ", ";
                if (set.contains(", " + rowCellFromString + ", ")) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
            if (sets[1].equalsIgnoreCase(S_ShellETL.SHELL_ETL_NOT_IN)) {
                String rowCellFromString = row.getCell(sets[0]).getCellValue().toString();
                String set = ", " + (S_ShellETL.storeValue.containsKey(sets[2])
                    ? S_ShellETL.storeValue.get(sets[2]) : sets[2]) + ", ";
                if (!set.contains(", " + rowCellFromString + ", ")) {
                    outputTemp.add(P_CO_XA_X_Map.rowToRowMap(row));
                }
            }
        }
        output.clear();
        output.addAll(outputTemp);
    }
}
//129
//String iteratorForCopyString= iteratorForCopy.next();
//score[copyCount]= iteratorForCopyString;
//String temps= dic_map.get(iteratorForCopyString).toString();
//425
//			if(i> max) {
//				continue Here;
//			}
