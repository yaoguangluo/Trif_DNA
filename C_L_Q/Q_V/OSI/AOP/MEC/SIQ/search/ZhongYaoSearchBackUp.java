package Q_V.OSI.AOP.MEC.SIQ.search;

//作者 罗瑶光
//思想 元基肽展公式
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ZhongYaoSearchBackUp {}//begin
//    //因为这几行是新电脑开发的只有3行数据测试, 老电脑写的拼音索引没用到, 就出现这个问题
//    //, 我先注释掉, 以后优化. 罗瑶光20210516
//    //	* (!app.pos.get(mapSearchaAtII).contains("名")
//    //	? app.pos.get(mapSearchaAtII).contains("动")? 10: 1: 150) //用位移替换10、1、150
//    //动、、名
//    //测试了下不错, 误差小, 罗瑶光202111011900
//    //用位移替换10、1、150
//    //词距
//    //今天检查了没有封顶, 会被 int 超出溢出问题。
//    //中药是编辑字符, 这里用zhongyao八纲增新
//    //205-key是原输入字符, 这里用key 原搜补漏
//    //20210724 //合并后数据冗余 eclipse不上报错误, 因为空格字符null问题,
//    //害我调试了半天。bin的debug函数被本地欺骗了。
//    //catalyticRot dna 催化计算
//    public static void zhongYaoSearch(App_S app, String zhongyao, String forE, String key) {
//        String CatalyticDNA_xingwei = "";
//        String CatalyticDNA_gongxiao = "";
//        if (app.DNASearchIsClick) {
//            TokenPDI pDE_RNA_Formular = new TokenPDI();
//            double rate = ((double) app.catalyticRot) / 100;
//            //pDE_RNA_Formular.key[0]= 0.3;
//            pDE_RNA_Formular.key[1] = rate;
//            pDE_RNA_Formular.key[2] = rate;
//            //pDE_RNA_Formular.key[3]= 0.3;
//            if (null != app.nameFeelFilter.getText()) {
//                pDE_RNA_Formular.pdw = app.nameFeelFilter.getText().toUpperCase();
//                pDE_RNA_Formular.code = pDE_RNA_Formular.pdw.toString().toUpperCase();
//                pDE_RNA_Formular.doKeyPress(pDE_RNA_Formular.code, pDE_RNA_Formular, false);
//                CatalyticDNA_xingwei = null == pDE_RNA_Formular.pde ? ""
//                        : pDE_RNA_Formular.pde.toString();
//            }
//            //
//            pDE_RNA_Formular.pde = "";
//            if (null != app.name_filter_not_have.getText()) {
//                pDE_RNA_Formular.pdw = app.name_filter_not_have.getText().toUpperCase();
//                pDE_RNA_Formular.code = pDE_RNA_Formular.pdw.toString().toUpperCase();
//                pDE_RNA_Formular.doKeyPress(pDE_RNA_Formular.code, pDE_RNA_Formular, false);
//                CatalyticDNA_gongxiao = null == pDE_RNA_Formular.pde ? ""
//                        : pDE_RNA_Formular.pde.toString();
//            }
//        }
//        String[] score = new String[app.copy.size()];
//        int[] score_code = new int[app.copy.size()];
//        int[] reg = new int[app.copy.size()];
//        int count = 0;
//        IMV_SIQ_SS mapSearchWithoutSort = null;
//        if (app.dic_map.containsKey(zhongyao.replaceAll(" ", ""))) {
//            mapSearchWithoutSort = app._A.parserMixStringByReturnFrequencyMap(zhongyao);
//        } else {
//            String[] strings = key.split(" ");
//            if (strings.length > 1 && key.split(" ")[0].length() > 5) {
//                mapSearchWithoutSort = app._A.parserMixStringByReturnFrequencyMap(key, NE);
//            } else {
//                mapSearchWithoutSort = app._A.parserMixStringByReturnFrequencyMap(zhongyao);
//            }
//        }
//        Iterator<String> iteratorForCopy = app.copy.iterator();
//        int copyCount = 0;
//        List<String> list = app._A.parserMixedString(key);
//        String[] string = List_ESU_X_listToArray._E(list);
//        String[] stringReg = new String[forE.length() / 3];
//        for (int i = 0; i < stringReg.length; i++) {
//            stringReg[i] = forE.substring(i * 3, (i * 3 + 3) < forE.length() ? (i * 3 + 3) : forE.length() - 1);
//        }
//        String zhongyaoReplace = zhongyao.replace(" ", "");
//        while (iteratorForCopy.hasNext()) {
//            String iteratorForCopyString = iteratorForCopy.next();
//            score[copyCount] = iteratorForCopyString;
//            String temps = app.dic_map.get(iteratorForCopyString).toString();
//            String tempsPCA = app.dic_li.get(iteratorForCopyString).toString();
//            String tempsIndex = app.dic_index.get(iteratorForCopyString).toString();
//            if (app.appConfig.SectionJPanel.jlabel_peizhi_di2233.isSelected()) {//literial测试
//                if (null != temps) {//既然都null了就跳过
//                    temps = literial_X_literial_P.literial_P(app, temps);
//                }
//                if (null != tempsPCA) {
//                    tempsPCA = literial_X_literial_liner_P.literial_liner_P(app, tempsPCA);
//                }
//            }
//            Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
//            Here:
//            while (iteratorWordFrequency.hasNext()) {
//                String mapSearchaAtII = iteratorWordFrequency.next();
//                WordFrequency wordFrequencySearch
//                        = mapSearchWithoutSort.getW(mapSearchaAtII);
//                if (temps.contains(mapSearchaAtII)) {
//                    if (reg[copyCount] == 0) {
//                        count += 1;
//                    }
//                    if (score[copyCount].contains(zhongyaoReplace)) {
//                        reg[copyCount] += 12;
//                    }
//                    if (zhongyao.contains(score[copyCount].replace(" ", ""))) {
//                        reg[copyCount] += 12;
//                    }
//                    if (tempsIndex.equalsIgnoreCase(zhongyaoReplace)) {
//                        reg[copyCount] += 1200;
//                    }
//                    if (tempsIndex.contains(zhongyaoReplace.toUpperCase())) {
//                        reg[copyCount] += 1200;
//                    }
//                    score[copyCount] = iteratorForCopyString;
//                    int wfs=wordFrequencySearch.get_frequency();
//                    wfs= wfs > 5 ? 5 : wfs;
//                    if (!app.fMHMMListOneTime_E_X_S.posCnToCn.containsKey(mapSearchaAtII)) {
//                        reg[copyCount] += 1;
//                        score_code[copyCount] += 1 << mapSearchaAtII.length()
//                                << wfs;
//                        if (tempsPCA.contains(mapSearchaAtII)) {
//                            score_code[copyCount] <<= 1;
//                        }
//                        if (score[copyCount].contains(mapSearchaAtII)) {
//                            if (score[copyCount].length() > 1) {
//                                reg[copyCount] += 22;
//                            }
//                            reg[copyCount] += 3;
//                        }
//                        continue Here;
//                    }
//                    if (app.fMHMMListOneTime_E_X_S.posCnToCn.get(mapSearchaAtII).contains("名")
//                            || app.fMHMMListOneTime_E_X_S.posCnToCn.get(mapSearchaAtII).contains("动")
//                            || app.fMHMMListOneTime_E_X_S.posCnToCn.get(mapSearchaAtII).contains("形")
//                            || app.fMHMMListOneTime_E_X_S.posCnToCn.get(mapSearchaAtII).contains("谓")) {
//                        reg[copyCount] += 2;
//                        if (tempsPCA.contains(mapSearchaAtII)) {
//                            reg[copyCount] <<= 1;
//                        }
//                    }
//                    reg[copyCount] += 1;
//                    score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII)
//                            ? 2 : 1) << (!app.fMHMMListOneTime_E_X_S.posCnToCn
//                        .get(mapSearchaAtII).contains("名") ? app.fMHMMListOneTime_E_X_S
//                        .posCnToCn.get(mapSearchaAtII).contains("动") ? 3 : 0 : 7)
//                            << mapSearchaAtII.length() + wfs;
//                    if (score[copyCount].contains(mapSearchaAtII)) {
//                        if (score[copyCount].length() > 1) {
//                            reg[copyCount] += 22;
//                        }
//                        reg[copyCount] += 3;
//                    }
//                    continue Here;
//                }
//                if (mapSearchaAtII.length() > 1) {
//                    for (int j = 0; j < mapSearchaAtII.length(); j++) {
//                        if (temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
//                            if (reg[copyCount] == 0) {
//                                count += 1;
//                            }
//                            score[copyCount] = iteratorForCopyString;
//                            score_code[copyCount] += 1;
//                            if (app.fMHMMListOneTime_E_X_S.posCnToCn.containsKey(
//                                String.valueOf(mapSearchaAtII.charAt(j)))
//                                    && (app.fMHMMListOneTime_E_X_S.posCnToCn.get(
//                                        String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
//                                    || app.fMHMMListOneTime_E_X_S.posCnToCn.get(
//                                        String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
//                                    || app.fMHMMListOneTime_E_X_S.posCnToCn.get(
//                                        String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
//                                    || app.fMHMMListOneTime_E_X_S.posCnToCn.get(
//                                        String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
//                            )) {
//                                reg[copyCount] += 2;
//                            }
//                            reg[copyCount] += 1;
//                            if (score[copyCount].contains(mapSearchaAtII)) {
//                                if (score[copyCount].length() > 1) {
//                                    reg[copyCount] += 12;
//                                }
//                                reg[copyCount] += 3;
//                            }
//                            continue Here;
//                        }
//                    }
//                }
//            }
//            score_code[copyCount] = score_code[copyCount] * reg[copyCount];
//            score_code[copyCount] = score_code[copyCount] / 1000;
//            //
//            int code = 200;
//            int tempb = 0;
//            int tempa = score_code[copyCount];
//            if (key.length() > 6) {
//                //全词
//                for (int i = 0; i < string.length; i++) {
//                    if (temps.contains(string[i]) && string[i].length() > 1) {
//                        tempb += code;
//                    }
//                }
//                //断句
//                for (int i = 0; i < stringReg.length; i++) {
//                    if (temps.contains(stringReg[i])) {
//                        tempb += code;
//                    }
//                }
//                score_code[copyCount] = (int) (tempa / Math.pow(app.lookrot + 1, 4)
//                        + tempb * Math.pow(app.lookrot, 2));
//            }
//            if (zhongyao.replace(" ", "").length() > 1
//                && zhongyao.replace(" ", "").length() < 5) {
//                if (temps.contains(zhongyao.replace(" ", ""))) {
//                    tempb += code << 7;
//                }
//                if (temps.contains(key.replace(" ", ""))) {
//                    tempb += code << 3;
//                }
//                score_code[copyCount] = (int) (tempa / Math.pow(app.lookrot + 1, 4)
//                        + tempb * Math.pow(app.lookrot + 1, 2));
//            }
//            copyCount++;
//        }
//        //new Quick9DLYGWithString_ESU().sortZhongYao(score_code, score);
//        new LYGSortESU9D().jnisort(score_code, score);
//        Object[][] tableData = new Object[count][13];
//        int new_count = 0;
//        app.newTableModel.getDataVector().clear();
//        if (null == key || key.equals("")) {
//            for (int i = 0; i < app.tableData_old.length; i++) {
//                app.tableData_old[i][6] = app.tableData_old[i][6] == null
//                        ? "" : app.tableData_old[i][6];
//                app.newTableModel.insertRow(i, app.tableData_old[i]);
//            }
//            app.newTableModel.fireTableDataChanged();
//            return;
//        }
//        Here:
//        for (int i = app.copy.size() - 1; i > -1; i--) {
//            if (score_code[i] < 1) {
//                continue Here;
//            }
//            if (app.risk_filter_box.isSelected()) {
//                String hai = (app.dic_hai.get(score[i]) == null ? "null."
//                        : app.dic_hai.get(score[i]).toString().replaceAll("\\s*", "")
//                        .equalsIgnoreCase("") ? "null" : app.dic_hai.get(score[i]).toString()
//                        .replaceAll("\\s*", ""));
//                String temp = app.name_filter.getText();
//                for (int j = 0; j < temp.length(); j++) {
//                    if (hai.contains("" + temp.charAt(j))) {
//                        continue Here;
//                    }
//                }
//            }
//            if (app.feel_filter_box.isSelected()) {//功效
//                String li = (app.dic_li.get(score[i]) == null ? "null."
//                        : app.dic_li.get(score[i]).toString().replaceAll("\\s*", "")
//                        .equalsIgnoreCase("") ? "null" : app.dic_li.get(score[i]).toString()
//                        .replaceAll("\\s*", ""));
//                String temp = app.name_filter.getText();
//                for (int j = 0; j < temp.length(); j++) {
//                    if (li.contains("" + temp.charAt(j))) {
//                        continue Here;
//                    }
//                }
//            }
//            if (app.luo_filter_box.isSelected()) {//经络
//                String li = (app.dic_jm.get(score[i]) == null ? "null."
//                        : app.dic_jm.get(score[i]).toString()
//                        .replaceAll("\\s*", "")
//                        .equalsIgnoreCase("") ? "null" : app.dic_jm.get(score[i]).toString()
//                        .replaceAll("\\s*", ""));
//                String temp = app.name_filter.getText();
//                for (int j = 0; j < temp.length(); j++) {
//                    if (li.contains("" + temp.charAt(j))) {
//                        continue Here;
//                    }
//                }
//            }
//            if (app.wei_filter_box.isSelected()) {//性味
//                String li = (app.dic_xw.get(score[i]) == null ? "null."
//                        : app.dic_xw.get(score[i]).toString()
//                        .replaceAll("\\s*", "")
//                        .equalsIgnoreCase("") ? "null" : app.dic_xw.get(score[i]).toString()
//                        .replaceAll("\\s*", ""));
//                String temp = app.name_filter.getText();
//                for (int j = 0; j < temp.length(); j++) {
//                    if (li.contains("" + temp.charAt(j))) {
//                        continue Here;
//                    }
//                }
//            }
//            if (!app.nameFeelFilter.getText().isEmpty()) {//性味
//                String wei = !app.dic_xw.containsKey(score[i]) ? ""
//                        : app.dic_xw.get(score[i]).toString()
//                        .replaceAll("\\s*", "");
//                //String wei= app.dic_xw.get(score[i]).toString()
////.replaceAll("\\s*", "");
//                CatalyticDNA_xingwei = app.nameFeelFilter.getText().replace(" ", "");
//                //CatalyticDNA_xingwei= CatalyticDNA_xingwei.replace(" ", "");
//                for (int j = 0; j < CatalyticDNA_xingwei.length(); j++) {
//                    if (!wei.contains("" + CatalyticDNA_xingwei.charAt(j))) {
//                        continue Here;//20061 改包含
//                    }
//                }
//            }
//            if (null != app.name_filter_not_have.getText()) {
//                if (!app.name_filter_not_have.getText().replace(" ", "").isEmpty()) {
//                    String wei = !app.dic_jm.containsKey(score[i]) ? ""
//                            : app.dic_jm.get(score[i]).toString()
//                            .replaceAll("\\s*", "");
//                    //String wei= app.dic_jm.get(score[i]).toString()
////.replaceAll("\\s*", "");
//                    CatalyticDNA_gongxiao = app.name_filter_not_have.getText().replace(" ", "");
//                    for (int j = 0; j < CatalyticDNA_gongxiao.length(); j++) {//怎么会+=？联想电脑 我日你先人。
//                        if (!wei.contains("" + CatalyticDNA_gongxiao.charAt(j))) {
//                            continue Here;//之后准备筛选页重做20230512
//                        }
//                    }
//                }
//            }
//            if (app.shuming_filter_box.isSelected()) {
//                String wei = score[i];
//                String temp = app.name_filter.getText();
//                for (int j = 0; j < temp.length(); j++) {
//                    if (wei.contains("" + temp.charAt(j))) {
//                        continue Here;
//                    }
//                }
//            }
//            String temp = app.dic_map.get(score[i]).toString();
//            if (tableData.length <= new_count) {
//                continue Here;
//            }
//            tableData[new_count] = new Object[]{
//                    (app.dic_index.get(score[i]) == null ? ""
//                            : app.dic_index.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    score_code[i], score[i],
//                    (app.dic_yw.get(score[i]) == null ? ""
//                            : app.dic_yw.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    (app.dic_li.get(score[i]) == null ? ""
//                            : app.dic_li.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    (app.dic_hai.get(score[i]) == null
//                            ? "详情参考笔记原文列: 是药三分毒, 补药甚三分. 食材亦如此, 勤俭亦长生."
//                            : app.dic_hai.get(score[i]).toString()
//                            .replaceAll("\\s*", "")
//                            .equalsIgnoreCase("") ? "详情参考笔记原文列"
//                            : app.dic_hai.get(score[i]).toString()
//                            .replaceAll("\\s*", "")),
//                    (app.dic_yl.get(score[i]) == null ? "详情参考相关书籍"
//                            : app.dic_yl.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    (app.dic_xw.get(score[i]) == null ? ""
//                            : app.dic_xw.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    (app.dic_jm.get(score[i]) == null ? ""
//                            : app.dic_jm.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    (app.dic_xz.get(score[i]) == null ? ""
//                            : app.dic_xz.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    (app.dic_jj.get(score[i]) == null ? ""
//                            : app.dic_jj.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    (app.dic_cy.get(score[i]) == null ? ""
//                            : app.dic_cy.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    (app.dic_ya.get(score[i]) == null ? ""
//                            : app.dic_ya.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    (app.dic_zf.get(score[i]) == null ? ""
//                            : app.dic_zf.get(score[i])).toString()
//                            .replaceAll("\\s*", ""),
//                    "" + (new_count + 1)};
////						(app.dic_cj.get(score[i])==null?""
////								:app.dic_cj.get(score[i])).toString()
////.replaceAll("\\s*", "")};
//            if (zhongyao.contains("风寒")) {
//                if (temp.contains("风寒")) {
//                    app.newTableModel.insertRow(new_count, tableData[new_count]);
//                    new_count += 1;
//                }
//            } else if (zhongyao.contains("风热")) {
//                if (temp.contains("风热")) {
//                    app.newTableModel.insertRow(new_count, tableData[new_count]);
//                    new_count += 1;
//                }
//            } else {
//                app.newTableModel.insertRow(new_count, tableData[new_count]);
//                new_count += 1;
//            }
//        }
//        app.newTableModel.fireTableDataChanged();
//    }
//}


	
