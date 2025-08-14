package O_V.OSI.AOP.rest.medicine;

import ME.VPC.M.app.App;
import M_V.MSU.OCI.ME.SMS.translator.C.Translator;
import M_V.MSU.OEI.ME.SMS.SEU.OSD.OSI.E.Translator_E;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.Verbal;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Annotation;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestMedicinePort_E {
    public static App kernel(App app, String string, App NE) {
        //Analyst
        String zhongyao = "";
        String key = string;
        String forE = key.toLowerCase().toString();
        if (key != null && !key.replace(" ", "").equals("") && key.length() > 50) {
            key = key.substring(0, 50);
        }
        if (forE != null && !forE.replace(" ", "").equals("") && forE.length() > 110) {
            forE = forE.substring(0, 110);
        }
        key = key.length() == 0 ? "" : app.app_S.translator.MixedStringToChineseString(app.app_S._A, key);
        if (key.replaceAll("/s+", " ").equalsIgnoreCase(" ")) {
            key = "";
        }
        zhongyao = key.toString();
        Here:
        for (int i = 0; i < key.length(); i++) {//later remove*/
            if (S_Annotation.feng.contains("" + key.charAt(i))) {
                key += "风";
                continue Here;
            }
            if (S_Annotation.han.contains("" + key.charAt(i))) {
                key += "风寒";
                continue Here;
            }
            if (S_Annotation.hot.contains("" + key.charAt(i))) {
                key += "风热";
                continue Here;
            }
            if (S_Annotation.shi.contains("" + key.charAt(i))) {
                key += "风湿";
                continue Here;
            }
            if (S_Annotation.huo.contains("" + key.charAt(i))) {
                key += "火";
                continue Here;
            }
            if (S_Annotation.zao.contains("" + key.charAt(i))) {
                key += "燥";
                continue Here;
            }
            if (S_Annotation.liuYin.contains("" + key.charAt(i))) {
                key += "六淫";
                continue Here;
            }
            if (S_Annotation.qiQing.contains("" + key.charAt(i))) {
                key += "七情";
                continue Here;
            }
            if (S_Annotation.wangYang.contains("" + key.charAt(i))) {
                key += "亡阳";
                continue Here;
            }
            if (S_Annotation.wangYin.contains("" + key.charAt(i))) {
                key += "亡阴";
                continue Here;
            }
            if (S_Annotation.jiBaoShiChang.contains("" + key.charAt(i))) {
                key += "饥饱失常";
                continue Here;
            }
            if (S_Annotation.yinShiBuJie.contains("" + key.charAt(i))) {
                key += "饮食不洁";
                continue Here;
            }
            if (S_Annotation.tiaoShiPianShe.contains("" + key.charAt(i))) {
                key += "挑食偏食";
                continue Here;
            }
            if (S_Annotation.biaoHan.contains("" + key.charAt(i))) {
                key += "表寒";
                continue Here;
            }
            if (S_Annotation.biaoRe.contains("" + key.charAt(i))) {
                key += "表热";
                continue Here;
            }
            if (S_Annotation.yuXue.contains("" + key.charAt(i))) {
                key += "淤";
            }
        }
        if (app.app_S.xynkPage != null) {
            app.app_S.xynkPage.key = zhongyao.toString();
            app.app_S.xynkPage.keyReleased(null);
        }
        if (app.app_S.zynkxPage != null) {
            app.app_S.zynkxPage.key = zhongyao.toString();
            app.app_S.zynkxPage.keyReleased(null);
        }
        if (app.app_S.zyzdxPage != null) {
            app.app_S.zyzdxPage.key = zhongyao.toString();
            app.app_S.zyzdxPage.keyReleased(null);
        }
        if (app.app_S.fyydPage != null) {
            app.app_S.fyydPage.key = zhongyao.toString();
            app.app_S.fyydPage.keyReleased(null);
        }
        if (app.app_S.fqzPage != null) {
            app.app_S.fqzPage.key = zhongyao.toString();
            app.app_S.fqzPage.keyReleased(null);
        }
        if (app.app_S.fckxPage != null) {
            app.app_S.fckxPage.key = zhongyao.toString();
            app.app_S.fckxPage.keyReleased(null);
        }
        if (app.app_S.jzkxPage != null) {
            app.app_S.jzkxPage.key = zhongyao.toString();
            app.app_S.jzkxPage.keyReleased(null);
        }
        if (app.app_S.wkxPage != null) {
            app.app_S.wkxPage.key = zhongyao.toString();
            app.app_S.wkxPage.keyReleased(null);
        }
        if (app.app_S.wskxPage != null) {
            app.app_S.wskxPage.key = zhongyao.toString();
            app.app_S.wskxPage.keyReleased(null);
        }
        if (app.app_S.xyscPage != null) {
            app.app_S.xyscPage.key = zhongyao.toString();
            app.app_S.xyscPage.keyReleased(null);
        }
        if (app.app_S.editPane != null) {
            app.app_S.editPane.key = zhongyao.toString();
            app.app_S.editPane.keyReleased(null);
        }
        Translator ts = new Translator_E();
        ts.IV_(app.app_S._A);
        List<Verbal> verbals = ts.index(app.app_S._A, forE);
        if (app.app_S.cecil != null) {
            app.app_S.cecil.verbals = verbals;
            app.app_S.cecil.keyReleased(null);
        }
        String[] score = new String[app.app_S.copy.size()];
        int[] score_code = new int[app.app_S.copy.size()];
        double[] reg = new double[app.app_S.copy.size()];
        int count = 0;
        IMV_SIQ_SS mapSearchWithoutSort = null;
        if (key.split(" ")[0].length() > 5) {
            mapSearchWithoutSort = app.app_S._A.parserMixStringByReturnFrequencyMap(key, NE);
        } else {
            mapSearchWithoutSort = app.app_S._A.parserMixStringByReturnFrequencyMap(zhongyao, NE);
        }
        Iterator<String> iteratorForCopy = app.app_S.copy.iterator();
        int copyCount = 0;
        while (iteratorForCopy.hasNext()) {
            String iteratorForCopyString = iteratorForCopy.next();
            score[copyCount] = iteratorForCopyString;
            String temps = app.app_S.dic_map.get(iteratorForCopyString).toString();
            String tempsPCA = app.app_S.dic_li.get(iteratorForCopyString).toString();
            Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
            Here:
            while (iteratorWordFrequency.hasNext()) {
                String mapSearchaAtII = iteratorWordFrequency.next();
                WordFrequency wordFrequencySearch = mapSearchWithoutSort.getW(mapSearchaAtII);
                if (temps.contains(mapSearchaAtII)) {
                    if (reg[copyCount] == 0) {
                        count += 1;
                    }
                    if (score[copyCount].contains(zhongyao.replace(" ", ""))) {
                        reg[copyCount] += 12;
                    }
                    if (zhongyao.contains(score[copyCount].replace(" ", ""))) {
                        reg[copyCount] += 12;
                    }
                    score[copyCount] = iteratorForCopyString;
                    int wfs = (int)wordFrequencySearch.get_frequency();
                    wfs = wfs > 5 ? 5 : wfs;
                    if (!app.app_S.fMHMMListOneTime_E_X_S.posCnToCn.containsKey(mapSearchaAtII)) {
                        reg[copyCount] += 1;
                        score_code[copyCount]
                            += 1 << mapSearchaAtII.length()
                            << wfs;
                        if (tempsPCA.contains(mapSearchaAtII)) {
                            score_code[copyCount] *= 2;
                        }
                        if (score[copyCount].contains(mapSearchaAtII)) {
                            if (score[copyCount].length() > 1) {
                                reg[copyCount] += 22;
                            }
                            reg[copyCount] += 3;
                        }
                        continue Here;
                    }
                    if (S_Maps.mingCi.containsKey(mapSearchaAtII)
                        || S_Maps.dongCi.containsKey(mapSearchaAtII)
                        || S_Maps.xingRongCi.containsKey(mapSearchaAtII)
                        || S_Maps.weiCi.containsKey(mapSearchaAtII)) {
                        reg[copyCount] += 2;
                        if (tempsPCA.contains(mapSearchaAtII)) {
                            reg[copyCount] *= 2;
                        }
                    }
                    reg[copyCount] += 1;
                    score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1)
                        * (!S_Maps.mingCi.containsKey(mapSearchaAtII)
                        ? S_Maps.dongCi.containsKey(mapSearchaAtII)
                        ? 45 : 1 : 50)
                        << mapSearchaAtII.length() * wfs;
                    if (score[copyCount].contains(mapSearchaAtII)) {
                        if (score[copyCount].length() > 1) {
                            reg[copyCount] += 22;
                        }
                        reg[copyCount] += 3;
                    }
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
                                S_Maps.mingCi.containsKey(temp)
                                    || S_Maps.dongCi.containsKey(temp)
                                    || S_Maps.xingRongCi.containsKey(temp)
                                    || S_Maps.weiCi.containsKey(temp)
                            )) {
                                reg[copyCount] += 2;
                            }
                            reg[copyCount] += 1;
                            if (score[copyCount].contains(mapSearchaAtII)) {
                                if (score[copyCount].length() > 1) {
                                    reg[copyCount] += 12;
                                }
                                reg[copyCount] += 3;
                            }
                            continue Here;
                        }
                    }
                }
            }
            score_code[copyCount] = score_code[copyCount] * (int)reg[copyCount];
            copyCount++;
        }
        NE.app_S.lYGSortESU9D.javaSort(score_code, score);
        Object[][] tableData = new Object[count][13];
        int new_count = 0;
        app.app_S.newTableModel.getDataVector().clear();
        if (null == key || key.equals("")) {
            for (int i = 0; i < app.app_S.tableData_old.length; i++) {
                app.app_S.newTableModel.insertRow(i, app.app_S.tableData_old[i]);
            }
            app.app_S.newTableModel.fireTableDataChanged();
            return null;
        }
        Here:
        for (int i = app.app_S.copy.size() - 1; i > -1; i--) {
            if (score_code[i] < 1) {
                continue Here;
            }
            if (app.app_S.risk_filter_box.isSelected()) {
                String hai = (app.app_S.dic_hai.get(score[i])
                    == null ? "null." : app.app_S.dic_hai.get(score[i]).toString()
                    .replaceAll("/s*", "").equalsIgnoreCase("")
                    ? "null" : app.app_S.dic_hai.get(score[i]).toString()
                    .replaceAll("/s*", ""));
                String temp = app.app_S.name_filter.getText();
                for (int j = 0; j < temp.length(); j++) {
                    if (hai.contains("" + temp.charAt(j))) {
                        continue Here;
                    }
                }
            }
            if (app.app_S.feel_filter_box.isSelected()) {
                String wei = app.app_S.dic_xw.get(score[i]).toString()
                    .replaceAll("/s*", "");
                String temp = app.app_S.name_filter.getText();
                for (int j = 0; j < temp.length(); j++) {
                    if (wei.contains("" + temp.charAt(j))) {
                        continue Here;
                    }
                }
            }
            String temp = app.app_S.dic_map.get(score[i]).toString();
            if (tableData.length <= new_count) {
                continue Here;
            }
            tableData[new_count] = new Object[]{new_count + 1, score_code[i]
                , score[i],
                app.app_S.dic_yw.get(score[i]).toString(),
                app.app_S.dic_li.get(score[i]).toString()
                    .replaceAll("/s*", ""),
                (app.app_S.dic_hai.get(score[i])
                    == null ? "详情参考笔记原文列: 是药三分毒, 补药甚三分. 食材亦如此, 勤俭亦长生."
                    : app.app_S.dic_hai.get(score[i]).toString()
                    .replaceAll("/s*", "").equalsIgnoreCase("")
                    ? "详情参考笔记原文列" : app.app_S.dic_hai.get(score[i]).toString()
                    .replaceAll("/s*", "")),
                (app.app_S.dic_yl.get(score[i]) == null ? "" : app.app_S.dic_yl.get(score[i])).toString()
                    .replaceAll("/s*", ""),
                app.app_S.dic_xw.get(score[i]).toString()
                    .replaceAll("/s*", ""),
                app.app_S.dic_jm.get(score[i]).toString()
                    .replaceAll("/s*", ""),
                (app.app_S.dic_xz.get(score[i]) == null ? "" : app.app_S.dic_xz.get(score[i])).toString()
                    .replaceAll("/s*", ""),
                (app.app_S.dic_jj.get(score[i]) == null ? "" : app.app_S.dic_jj.get(score[i])).toString()
                    .replaceAll("/s*", ""),
                (app.app_S.dic_cy.get(score[i]) == null ? "" : app.app_S.dic_cy.get(score[i])).toString()
                    .replaceAll("/s*", ""),
                (app.app_S.dic_ya.get(score[i]) == null ? "" : app.app_S.dic_ya.get(score[i])).toString()
                    .replaceAll("/s*", ""),
                (app.app_S.dic_zf.get(score[i]) == null ? "" : app.app_S.dic_zf.get(score[i])).toString()
                    .replaceAll("/s*", ""),
                (app.app_S.dic_cj.get(score[i]) == null ? "" : app.app_S.dic_cj.get(score[i])).toString()
                    .replaceAll("/s*", "")};
            if (zhongyao.contains("风寒")) {
                if (temp.contains("风寒")) {
                    app.app_S.newTableModel.insertRow(new_count, tableData[new_count]);
                    new_count += 1;
                }
            } else if (key.contains("风热")) {
                if (temp.contains("风热")) {
                    app.app_S.newTableModel.insertRow(new_count, tableData[new_count]);
                    new_count += 1;
                }
            } else {
                app.app_S.newTableModel.insertRow(new_count, tableData[new_count]);
                new_count += 1;
            }
        }
        app.app_S.newTableModel.fireTableDataChanged();
        return app;
    }

    public static IMV_SIQ getMedicineBookFeedbackZY(App app, String string, App NE) {
        app = RestMedicinePort_E.kernel(app, string, NE);
        if (null == app) {
            return null;
        }
        //feedback
        String preAdd = "仅作病症预测推荐, 不做行医诊治分析, 请拥有医师资格证人员慎重分析病情, 来做证候分析。谢谢!";
        //中医诊断：
        preAdd += "中医诊断：\r\n\r\n";
        for (int i = 0; i < 10; i++) {
            preAdd += "证候内容：" + app.app_S.zyzdxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.zyzdxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }

        preAdd += "方剂推荐：\r\n\r\n";
        //方剂分析：
        for (int i = 0; i < 10; i++) {
            preAdd += "证候内容：" + app.app_S.zynkxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.zynkxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }
        preAdd += "\r\n\r\n";
        if (app.app_S.text.getText().length() > 5000) {
            IMV_SIQ output = new IMV_SIQ();
            try {
                output.put(URLEncoder.encode("zy", "UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
            } catch (UnsupportedEncodingException e) {

                e.printStackTrace();
            }
            return output;
        }
        if (!app.app_S.text.getText().isEmpty()) {
            app.app_S.text.setText(app.app_S.text.getText() + "\r\n\r\n" + preAdd);
        } else {
            app.app_S.text.setText(preAdd);
        }
        app.app_S.text.validate();
        IMV_SIQ output = new IMV_SIQ();
        try {
            output.put(URLEncoder.encode("zy", "UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        }
        return output;
    }

    public static IMV_SIQ getMedicineBookFeedbackXY(App app, String string) {
        app = RestMedicinePort_E.kernel(app, string, app);
        if (null == app) {
            return null;
        }
        //feedback
        String preAdd = "仅作病症预测推荐, 不做行医诊治分析, 请拥有医师资格证人员慎重分析病情, 来做证候分析。谢谢!";
        preAdd += "西医诊断：\r\n\r\n";
        //西医急诊：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.jzkxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.jzkxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }
        preAdd += "外科诊断：\r\n\r\n";
        //外科分析：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.wkxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.wkxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }
        preAdd += "内科诊断：\r\n\r\n";
        //内科分析：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.xynkPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.xynkPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }
        preAdd += "妇幼诊断：\r\n\r\n";
        //妇幼分析：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.fckxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.fckxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }

        preAdd += "伤科：\r\n\r\n";
        //伤科分析：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.wskxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.wskxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }
        IMV_SIQ output = new IMV_SIQ();
        try {
            output.put(URLEncoder.encode("xy", "UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        }
        return output;
    }

    public static IMV_SIQ getMedicineBookFeedbackZT(App app, String string) {
        app = RestMedicinePort_E.kernel(app, string, app);//later duplicate
        //feedback
        String preAdd = "仅作病症预测推荐, 不做行医诊治分析, 请拥有医师资格证人员慎重分析病情, 来做证候分析。谢谢!";
        preAdd += "\r\n\r\n";
        preAdd += "*****************************************************************";
        preAdd += "仅作中药推荐, 不做处方权分析, 请拥有处方权职业药师慎重分析药理根据病情搭配修改。谢谢!";
        preAdd += "\r\n\r\n";
        for (int r = 0; r < (app.app_S.newTableModel.getRowCount() < 50 ? app.app_S.newTableModel.getRowCount() : 50); r++) {
            Object temp = app.app_S.newTableModel.getValueAt(r, 2);
            if (temp != null && !temp.toString().isEmpty()) {
                if (temp.toString().contains("穴位") || temp.toString().contains("武术")
                    || temp.toString().contains("瓜果") || temp.toString().contains("果蔬")
                    || temp.toString().contains("食物") || temp.toString().contains("菜谱")
                    || temp.toString().contains("音乐") || temp.toString().contains("零食")
                    || temp.toString().contains("书法") || temp.toString().contains("诗词")) {
                } else {
                    preAdd += app.app_S.newTableModel.getValueAt(r, 2);
                    preAdd += "/";
                    if (app.app_S.newTableModel.getValueAt(r, 6) != null
                        && !app.app_S.newTableModel.getValueAt(r, 6).toString().isEmpty()) {
                        temp = app.app_S.newTableModel.getValueAt(r, 6).toString();
                        String value = "";
                        for (int i = 0; i < temp.toString().length(); i++) {
                            if (temp.toString().charAt(i) < 128 || temp.toString().charAt(i) == 45) {
                                value += temp.toString().charAt(i);
                            } else {
                                value += " ";
                            }
                        }
                        String[] temps = value.replaceAll("/s+", " ").split(" ");
                        if (temps.length > 0 && temps[0].split("—").length > 1) {
                            value = temps[0].split("—")[1];
                            value += "g;";
                        } else {
                            value = "请酌情添加;";
                        }
                        preAdd += value;
                    } else {
                        preAdd += "请酌情添加;";
                    }
                    if (r % 2 != 0) {
                        preAdd += "\r\n\r\n";
                    } else {
                        preAdd += "    ";
                    }
                }
            }
        }
        if (app.app_S.text.getText().length() > 5000) {
            IMV_SIQ output = new IMV_SIQ();
            try {
                output.put(URLEncoder.encode("zt", "UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
            } catch (UnsupportedEncodingException e) {

                e.printStackTrace();
            }
            return output;
        }
        if (!app.app_S.text.getText().isEmpty()) {
            app.app_S.text.setText(app.app_S.text.getText() + "\r\n\r\n" + preAdd);
        } else {
            app.app_S.text.setText(preAdd);
        }
        app.app_S.text.validate();
        IMV_SIQ output = new IMV_SIQ();
        try {
            output.put(URLEncoder.encode("zt", "UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        }
        return output;
    }

    public static IMV_SIQ getMedicineBookFeedbackXT(App app, String string) {
        app = RestMedicinePort_E.kernel(app, string, app);
        //feedback
        String preAdd = "仅作病症预测推荐, 不做行医诊治分析, 请拥有医师资格证人员慎重分析病情, 来做证候分析。谢谢!";
        preAdd += "西药推荐：\r\n\r\n";
        //分析：
        for (int i = 0; i < 25; i++) {
            preAdd += "证候内容：" + app.app_S.xyscPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.xyscPage.table.getValueAt(i, 1).toString()
                + "适应性：" + app.app_S.xyscPage.table.getValueAt(i, 8).toString();
            preAdd += "\r\n\r\n";
        }
        preAdd += "\r\n\r\n";
        app.app_S.text.validate();
        IMV_SIQ output = new IMV_SIQ();
        try {
            output.put(URLEncoder.encode("xt", "UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        }
        return output;
    }

    public static IMV_SIQ getMedicineBookFeedbackYT(App app, String string) {
        app = RestMedicinePort_E.kernel(app, string, app);
        //feedback
        String preAdd = "仅作病症预测推荐, 不做行医诊治分析, 请拥有医师资格证人员慎重分析病情, 来做证候分析。谢谢!";
        preAdd += "\r\n\r\n";
        //
        preAdd += "*****************************************************************";
        preAdd += "仅作养生保健推荐, 不做处方权分析, 请拥有处方权职业药师慎重分析药理根据病情搭配修改。谢谢!";
        preAdd += "\r\n\r\n";
        for (int r = 0; r < (app.app_S.newTableModel.getRowCount() < 150 ? app.app_S.newTableModel.getRowCount() : 150); r++) {
            Object temp = app.app_S.newTableModel.getValueAt(r, 2);
            if (temp != null && !temp.toString().isEmpty()) {
                if (temp.toString().contains("穴位") || temp.toString().contains("武术")
                    || temp.toString().contains("瓜果") || temp.toString().contains("果蔬")
                    || temp.toString().contains("食物") || temp.toString().contains("菜谱")
                    || temp.toString().contains("音乐") || temp.toString().contains("零食")
                    || temp.toString().contains("书法") || temp.toString().contains("诗词")) {
                    preAdd += app.app_S.newTableModel.getValueAt(r, 2);
                    preAdd += "/";
                    if (app.app_S.newTableModel.getValueAt(r, 6)
                        != null && !app.app_S.newTableModel.getValueAt(r, 6).toString().isEmpty()) {
                        temp = app.app_S.newTableModel.getValueAt(r, 6).toString();
                        String value = "";
                        for (int i = 0; i < temp.toString().length(); i++) {
                            if (temp.toString().charAt(i) < 128 || temp.toString().charAt(i) == 45) {
                                value += temp.toString().charAt(i);
                            } else {
                                value += " ";
                            }
                        }
                        String[] temps = value.replaceAll("/s+", " ").split(" ");
                        if (temps.length > 0 && temps[0].split("—").length > 1) {
                            value = temps[0].split("—")[1];
                            value += "g;";
                        } else {
                            value = "请酌情添加;";
                        }
                        preAdd += value;
                    } else {
                        preAdd += "请酌情添加;";
                    }
                    if (r % 2 != 0) {
                        preAdd += "\r\n\r\n";
                    } else {
                        preAdd += "    ";
                    }
                }
            }
        }
        if (app.app_S.text.getText().length() > 5000) {
            IMV_SIQ output = new IMV_SIQ();
            try {
                output.put(URLEncoder.encode("yt", "UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return output;
        }
        if (!app.app_S.text.getText().isEmpty()) {
            app.app_S.text.setText(app.app_S.text.getText() + "\r\n\r\n" + preAdd);
        } else {
            app.app_S.text.setText(preAdd);
        }
        app.app_S.text.validate();
        IMV_SIQ output = new IMV_SIQ();
        try {
            output.put(URLEncoder.encode("yt", "UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return output;
    }

    public static IMV_SIQ getMedicineBookFeedback(App app, String string) {
        app = RestMedicinePort_E.kernel(app, string, app);
        //feedback
        String preAdd = "仅作病症预测推荐, 不做行医诊治分析, 请拥有医师资格证人员慎重分析病情, 来做证候分析。谢谢!";
        //中医诊断：
        preAdd += "中医诊断：\r\n\r\n";
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.zyzdxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.zyzdxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }
        preAdd += "西医诊断：\r\n\r\n";
        //西医急诊：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.jzkxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.jzkxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }
        preAdd += "外科诊断：\r\n\r\n";
        //外科分析：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.wkxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.wkxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }
        preAdd += "内科诊断：\r\n\r\n";
        //内科分析：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.xynkPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.xynkPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }
        preAdd += "妇幼诊断：\r\n\r\n";
        //妇幼分析：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.fckxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.fckxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }

        preAdd += "伤科：\r\n\r\n";
        //伤科分析：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.wskxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.wskxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }

        preAdd += "方剂推荐：\r\n\r\n";
        //方剂分析：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.zynkxPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.zynkxPage.table.getValueAt(i, 1).toString();
            preAdd += "\r\n\r\n";
        }

        preAdd += "西药推荐：\r\n\r\n";
        //分析：
        for (int i = 0; i < 5; i++) {
            preAdd += "证候内容：" + app.app_S.xyscPage.table.getValueAt(i, 2).toString()
                + "可能性：" + app.app_S.xyscPage.table.getValueAt(i, 1).toString()
                + "适应性：" + app.app_S.xyscPage.table.getValueAt(i, 8).toString();
            preAdd += "\r\n\r\n";
        }
        preAdd += "\r\n\r\n";
        //
        preAdd += "*****************************************************************";
        preAdd += "仅作中药推荐, 不做处方权分析, 请拥有处方权职业药师慎重分析药理根据病情搭配修改。谢谢!";
        preAdd += "\r\n\r\n";
        for (int r = 0; r < (app.app_S.newTableModel.getRowCount() < 50 ? app.app_S.newTableModel.getRowCount() : 50); r++) {
            if (app.app_S.newTableModel.getValueAt(r, 2) != null && !app.app_S.newTableModel.getValueAt(r, 2).toString().isEmpty()) {
                preAdd += app.app_S.newTableModel.getValueAt(r, 2);
                preAdd += "/";
                if (app.app_S.newTableModel.getValueAt(r, 6) != null && !app.app_S.newTableModel.getValueAt(r, 6).toString().isEmpty()) {
                    String temp = app.app_S.newTableModel.getValueAt(r, 6).toString();
                    String value = "";
                    for (int i = 0; i < temp.length(); i++) {
                        if (temp.charAt(i) < 128 || temp.charAt(i) == 45) {
                            value += temp.charAt(i);
                        } else {
                            value += " ";
                        }
                    }
                    String[] temps = value.replaceAll("/s+", " ").split(" ");
                    if (temps.length > 0 && temps[0].split("—").length > 1) {
                        value = temps[0].split("—")[1];
                        value += "g;";
                    } else {
                        value = "请酌情添加;";
                    }
                    preAdd += value;
                } else {
                    preAdd += "请酌情添加;";
                }
                if (r % 2 != 0) {
                    preAdd += "\r\n\r\n";
                } else {
                    preAdd += "    ";
                }
            }
        }
        if (app.app_S.text.getText().length() > 5000) {
            IMV_SIQ output = new IMV_SIQ();
            try {
                output.put(URLEncoder.encode("yl", "UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return output;
        }
        if (!app.app_S.text.getText().isEmpty()) {
            app.app_S.text.setText(app.app_S.text.getText() + "\r\n\r\n" + preAdd);
        } else {
            app.app_S.text.setText(preAdd);
        }
        app.app_S.text.validate();
        IMV_SIQ output = new IMV_SIQ();
        try {
            output.put(URLEncoder.encode("yl", "UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return output;
    }

    public static Object doSearch(App app, String string) {
        //20230106-System.out.println(app.app_S.name.getText());
        if (!app.app_S.name.getText().contains(string)) {
            app.app_S.name.setText(app.app_S.name.getText() + string);
        }
        app.app_S.name.validate();
        app.app_S.jsp_name.validate();
        app.validate();
        return null;
    }
}
