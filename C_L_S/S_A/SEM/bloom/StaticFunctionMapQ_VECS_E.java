package S_A.SEM.bloom;


import E_A.ME.analysis.E.CogsBinaryForest_AE;
import ME.VPC.M.app.App;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import U_V.ESU.list.List_ESU_X_listToArray;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public class StaticFunctionMapQ_VECS_E implements StaticFunctionMapQ_VECS_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    public void searchFromTable(App NE, int rangeScale) {
        AES_QMS_XSD_TIH key = NE._I_U.key;
        DefaultTableModel newTableModel = NE._I_U.newTableModel;
        Object[][] tableData_old = NE._I_U.tableData_old;
        ArrayList<String> copy_xj = NE._I_U.copy_xj;
        IMV_SIQ dic_xj = NE._I_U.dic_xj;
        App app = NE._I_U.app;

        if (null == key || key.equals("")) {//把null key check提前, 搜索加快
            newTableModel.getDataVector().clear();
            for (int i = 0; i < tableData_old.length; i++) {
                newTableModel.insertRow(i, tableData_old[i]);
            }
            newTableModel.fireTableDataChanged();
            return;
        }
        //////////////
        String[] score = new String[copy_xj.size()];
        int[] score_code = new int[copy_xj.size()];
        int[] reg = new int[copy_xj.size()];
        int count = 0;
        IMV_SIQ_SS mapSearchWithoutSort = null;
        CogsBinaryForest_AE _A = app.app_S._A;
        IMV_SIQ pos = _A.getPosCnToCn();
        mapSearchWithoutSort = _A.parserMixStringByReturnFrequencyMap(key._S_, NE);
        Iterator<String> iteratorForCopy = copy_xj.iterator();
        int copyCount = 0;
        //List<String> list= u._A.parserMixedString(key);
        //这里用不到 list更多操作, 准备把frequencymap的key搞成list
        List<String> list = new ArrayList<>();
        Iterator<String> iterator = mapSearchWithoutSort.keySet().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        String[] string = List_ESU_X_listToArray._E(list);
        String[] stringReg = new String[key._S_.length() / 3];
        for (int i = 0; i < stringReg.length; i++) {
            stringReg[i] = key._S_.substring(i * 3, (i * 3 + 3) < key._S_.length()
                ? (i * 3 + 3) : key._S_.length() - 1);
        }
        while (iteratorForCopy.hasNext()) {
            String iteratorForCopyString = iteratorForCopy.next();
            score[copyCount] = iteratorForCopyString;
            String temps = dic_xj.get(iteratorForCopyString).toString();
            Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
            Here:
            while (iteratorWordFrequency.hasNext()) {
                String mapSearchaAtII = iteratorWordFrequency.next();
                WordFrequency wordFrequencySearch = mapSearchWithoutSort.getW(mapSearchaAtII);
                if (temps.contains(mapSearchaAtII)) {
                    if (reg[copyCount] == 0) {
                        count += 1;
                    }
                    score[copyCount] = iteratorForCopyString;
                    if (score[copyCount].contains(key._S_.replace(" ", ""))) {
                        reg[copyCount] += 500;
                    }
                    if (key._S_.contains(score[copyCount].replace(" ", ""))) {
                        reg[copyCount] += 500;
                    }
                    int wfs = (int) wordFrequencySearch.get_frequency();
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
                    score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII)
                        ? 2 : 1) * (!S_Maps.mingCi.containsKey(mapSearchaAtII)
                        ? S_Maps.dongCi.containsKey(mapSearchaAtII) ? 45 : 1 : 50)
                        << mapSearchaAtII.length() + wfs;
                    continue Here;
                }
                if (mapSearchaAtII.length() > 1) {
                    for (int j = 0; j < mapSearchaAtII.length(); j++) {
                        String temp = "" + mapSearchaAtII.charAt(j);
                        if (temps.contains(String.valueOf(temp))) {
                            if (reg[copyCount] == 0) {
                                count += 1;
                            }
                            score[copyCount] = iteratorForCopyString;
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
            //词距
            int code = 100;
            int tempb = 0;
            int tempa = score_code[copyCount];
            if (key._S_.length() > 4) {
                //全词
                for (int i = 0; i < string.length; i++) {
                    if (temps.contains(string[i])) {//因为用FrequencyMap代替, 所以要乘以频率。
                        tempb += code * mapSearchWithoutSort.getW(string[i]).get_frequency();
                    }
                }
                //断句
                for (int i = 0; i < stringReg.length; i++) {
                    if (temps.contains(stringReg[i])) {
                        tempb += code;
                    }
                }
                score_code[copyCount] = (int) (tempa / Math.pow(app.app_S.lookrot + 1, 4)
                    + tempb * Math.pow(app.app_S.lookrot, 2));
            }
            if (key._S_.replace(" ", "").length() > 1
                && key._S_.replace(" ", "").length() < 5) {
                if (temps.contains(key._S_)) {
                    tempb += code << 7;
                }
                score_code[copyCount] = (int) (tempa / Math.pow(app.app_S.lookrot + 1, 4)
                    + tempb * Math.pow(app.app_S.lookrot, 2));
            }
            copyCount++;
        }
        NE.app_S.lYGSortESU9D.javaSort(score_code, score);
        Object[][] tableData = new Object[count][18];
        int new_count = 0;
        newTableModel.getDataVector().clear();
        Here:
        for (int i = copy_xj.size() - 1; i > -1; i--) {
            if (score_code[i] < rangeScale) {
                continue Here;
            }
            if (app.app_S.shuming_filter_box.isSelected()) {
                String wei = score[i];
                String temp = app.app_S.name_filter.getText();
                for (int j = 0; j < temp.length(); j++) {
                    if (wei.contains("" + temp.charAt(j))) {
                        continue Here;
                    }
                }
            }
            tableData[new_count] = new Object[]{new_count + 1, score_code[i]
                , score[i], dic_xj.get(score[i]).toString()
            };
            newTableModel.insertRow(new_count, tableData[new_count]);
            new_count += 1;
        }
        newTableModel.fireTableDataChanged();
    }

    //再精简点 稍后去DefaultTableModel 直接输出 搜索排序后的 Object[][] 即可。
    public List<Object[]> searchFromTablewithScale(App NE, int rangeScale, boolean isKey) {
        AES_QMS_XSD_TIH searchkey = NE._I_U.searchkey;
        ArrayList<String> nameContent = NE._I_U.nameContent;
        IMV_SIQ textContent = NE._I_U.textContent;
        double lookrot = NE._I_U.lookrot;
        CogsBinaryForest_AE _AE = NE._I_U._AE;

        List<Object[]> outputList = new ArrayList<>();
        if (null == searchkey || searchkey.equals("")) {//把null key check提前, 搜索加快
            return outputList;
        }
        //////////////
        String[] score = new String[nameContent.size()];
        int[] score_code = new int[nameContent.size()];
        int[] reg = new int[nameContent.size()];
        int count = 0;
        IMV_SIQ_SS mapSearchWithoutSort = null;
        CogsBinaryForest_AE _A = _AE;
        //_A.IV_Mixed(emotionMap_E);
        IMV_SIQ pos = _A.getPosCnToCn();
        mapSearchWithoutSort = _A.parserMixStringByReturnFrequencyMap(searchkey._S_, NE);
        Iterator<String> iteratorForCopy = nameContent.iterator();
        int copyCount = 0;
        //List<String> list= u._A.parserMixedString(key);
        //这里用不到 list更多操作, 准备把frequencymap的key搞成list
        List<String> list = new ArrayList<>();
        Iterator<String> iterator = mapSearchWithoutSort.keySet().iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        String[] string = List_ESU_X_listToArray._E(list);
        String[] stringReg = new String[searchkey._S_.length() / 3];
        for (int i = 0; i < stringReg.length; i++) {
            stringReg[i] = searchkey._S_.substring(i * 3, (i * 3 + 3) < searchkey._S_.length() ? (i * 3 + 3)
                : searchkey._S_.length() - 1);
        }
        while (iteratorForCopy.hasNext()) {
            String iteratorForCopyString = iteratorForCopy.next();
            score[copyCount] = iteratorForCopyString;
            String temps = textContent.get(iteratorForCopyString).toString();
            if (isKey) {
                temps = iteratorForCopyString.toString();
            }
            Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
            Here:
            while (iteratorWordFrequency.hasNext()) {
                String mapSearchaAtII = iteratorWordFrequency.next();
                WordFrequency wordFrequencySearch = mapSearchWithoutSort.getW(mapSearchaAtII);
                if (temps.contains(mapSearchaAtII)) {
                    if (reg[copyCount] == 0) {
                        count += 1;
                    }
                    score[copyCount] = iteratorForCopyString;
                    if (score[copyCount].contains(searchkey._S_.replace(" ", ""))) {
                        reg[copyCount] += 500;
                    }
                    if (searchkey._S_.contains(score[copyCount].replace(" ", ""))) {
                        reg[copyCount] += 500;
                    }
                    if (!pos.containsKey(mapSearchaAtII)) {
                        reg[copyCount] += 1;
                        int wfs = (int) wordFrequencySearch.get_frequency();
                        wfs = wfs > 5 ? 5 : wfs;
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
                    int wfs = (int) wordFrequencySearch.get_frequency();
                    wfs = wfs > 5 ? 5 : wfs;
                    score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII)
                        ? 2 : 1) * (!S_Maps.mingCi.containsKey(mapSearchaAtII)
                        ? S_Maps.dongCi.containsKey(mapSearchaAtII) ? 45 : 1 : 50)
                        << mapSearchaAtII.length() * wfs;
                    continue Here;
                }
                if (mapSearchaAtII.length() > 1) {
                    for (int j = 0; j < mapSearchaAtII.length(); j++) {
                        String temp = "" + mapSearchaAtII.charAt(j);
                        if (temps.contains(String.valueOf(temp))) {
                            if (reg[copyCount] == 0) {
                                count += 1;
                            }
                            score[copyCount] = iteratorForCopyString;
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
            //词距
            int code = 100;
            int tempb = 0;
            int tempa = score_code[copyCount];
            if (searchkey._S_.length() > 4) {
                //全词
                for (int i = 0; i < string.length; i++) {
                    if (temps.contains(string[i])) {//因为用FrequencyMap代替, 所以要乘以频率。
                        tempb += code * mapSearchWithoutSort.getW(string[i]).get_frequency();
                    }
                }
                //断句
                for (int i = 0; i < stringReg.length; i++) {
                    if (temps.contains(stringReg[i])) {
                        tempb += code;
                    }
                }
                score_code[copyCount] = (int) (tempa / Math.pow(lookrot + 1, 4)
                    + tempb * Math.pow(lookrot, 2));
            }
            if (searchkey._S_.replace(" ", "").length() > 1
                && searchkey._S_.replace(" ", "").length() < 5) {
                if (temps.contains(searchkey._S_)) {
                    tempb += code << 7;
                }
                score_code[copyCount] = (int) (tempa / Math.pow(lookrot + 1, 4)
                    + tempb * Math.pow(lookrot, 2));
            }
            copyCount++;
        }
        NE.app_S.lYGSortESU9D.javaSort(score_code, score);
        //有结果就输出结果，无结果便输出全部，因为有0打分，可输出后筛选。
        if (count == 0) {
            count = nameContent.size();
        } else {
            rangeScale = 1;
        }
        Object[][] tableData = new Object[count][18];
        int new_count = 0;
        Here:
        for (int i = nameContent.size() - 1; i > -1; i--) {
            if (score_code[i] < rangeScale) {
                continue Here;
            }
            String value = "";
            if (textContent.containsKey(score[i])) {
                value = textContent.getString(score[i]).toString();
            }
            tableData[new_count] = new Object[]{new_count + 1,
                score_code[i],
                score[i],
                value
            };
            outputList.add(tableData[new_count]);
            new_count += 1;
        }
        return outputList;
    }

    //已测试, 结果正确
    public static void main() {
        App NE = new App();
        String[] argv = NE._I_U.argv;
        CogsBinaryForest_AE _AE = NE._I_U._AE;
        ArrayList<String> nameContent = new ArrayList<String>();
        IMV_SIQ textContent = new IMV_SIQ();
        double lookrot = 0.0;
        nameContent.add("罗瑶光");
        nameContent.add("罗瑶林");
        nameContent.add("罗韵律");
        nameContent.add("罗振友");
        nameContent.add("罗振兴");

        textContent.put("罗瑶光", "罗瑶光luoyaoguang");
        textContent.put("罗瑶林", "罗瑶林luoyaolin");
        textContent.put("罗韵律", "罗韵律luoyunlv");
        textContent.put("罗振友", "罗振友luozhenyou");
        textContent.put("罗振兴", "罗振兴luozhenxin");

        AES_QMS_XSD_TIH searchkey = new AES_QMS_XSD_TIH("罗瑶光");

        NE._I_U.searchkey = searchkey;
        NE._I_U.nameContent = nameContent;
        NE._I_U.textContent = textContent;
        NE._I_U.lookrot = lookrot;
        NE._I_U._AE = _AE;

        List<Object[]> outputList = new StaticFunctionMapQ_VECS_E()
            .searchFromTablewithScale(NE, 0, false);
        Iterator<Object[]> iterator = outputList.iterator();
        while (iterator.hasNext()) {
            Object[] object = iterator.next();
            for (int i = 0; i < object.length; i++) {
                System.out.println(object[i].toString());
            }
        }
        searchkey._S_ = "罗瑶";

        NE._I_U.searchkey = searchkey;
        NE._I_U.nameContent = nameContent;
        NE._I_U.textContent = textContent;
        NE._I_U.lookrot = lookrot;
        NE._I_U._AE = _AE;

        outputList = new StaticFunctionMapQ_VECS_E()
            .searchFromTablewithScale(NE, 0, false);
        iterator = outputList.iterator();
        while (iterator.hasNext()) {
            Object[] object = iterator.next();
            for (int i = 0; i < object.length; i++) {
                System.out.println(object[i].toString());
            }
        }

        searchkey._S_ = "罗振";
        NE._I_U.searchkey = searchkey;
        NE._I_U.nameContent = nameContent;
        NE._I_U.textContent = textContent;
        NE._I_U.lookrot = lookrot;
        NE._I_U._AE = _AE;
        outputList = new StaticFunctionMapQ_VECS_E()
            .searchFromTablewithScale(NE, 0, false);
        iterator = outputList.iterator();
        while (iterator.hasNext()) {
            Object[] object = iterator.next();
            for (int i = 0; i < object.length; i++) {
                System.out.println(object[i].toString());
            }
        }
    }
}
