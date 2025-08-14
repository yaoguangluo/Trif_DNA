package ME.VPC.V.ET;

import ME.VPC.M.app.App;
import ME.VPC.S.pillow.XyscPage_X_S_s;
import ME.VPC.V.dictionary.XyscDictionary;
import M_V.MSV.OSU.string.NullObject;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;
import U_V.ESU.list.List_ESU_X_listToArray;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import OCI.ME.analysis.C.A;
//import OSV.VCQ.standard.DictionaryStandardDB;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class XyscPage_X_S_sListeners extends XyscPage_X_S_s
    implements MouseListener, KeyListener {

    public JTextField name() {
        name = new JTextField();
        name.setBounds(180, 50, 380, 80);
        name.addKeyListener(this);
        return name;
    }

    @SuppressWarnings({"serial", "unused"})
    public javax.swing.JTable jTable(App app_NE) {
        NE = app_NE;
        //dictionaryFromDB d= new dictionaryFromDB();
        XyscDictionary d = new XyscDictionary();
        dic_yao_ming = new IMV_SIQ();
        dic_chengfen_danwei = new IMV_SIQ();
        dic_yong_fa = new IMV_SIQ();
        dic_yong_liang = new IMV_SIQ();
        dic_yao_li = new IMV_SIQ();
        dic_zhu_yi = new IMV_SIQ();
        dic_shi_ying = new IMV_SIQ();
        dic_jie_shao = new IMV_SIQ();
        dic_bu_liang_fan_ying = new IMV_SIQ();
        dic_yao_wu_xiang_hu_zuo_yong = new IMV_SIQ();
        dic_qi_ta = new IMV_SIQ();
        d.txtToMap(dic_yao_ming, dic_chengfen_danwei, dic_yong_fa
            , dic_yao_li, dic_zhu_yi, dic_shi_ying,
            dic_bu_liang_fan_ying, dic_yao_wu_xiang_hu_zuo_yong
            , dic_qi_ta, dic_yong_liang, dic_jie_shao);
        tableData_old = new Object[dic_yao_ming.size()][18];
        Iterator<String> iter = dic_yao_ming.keySet().iterator();
        copy = new ArrayList<>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            tableData_old[i] = new Object[]{"" + (i + 1),
                "" + 0,
                copy.get(i).trim(),
                dic_chengfen_danwei.get(copy.get(i))
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_zhu_yi.get(copy.get(i))
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_yong_liang.get(copy.get(i))
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_shi_ying.get(copy.get(i))
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_yao_li.get(copy.get(i))
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_jie_shao.get(copy.get(i))
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_yong_fa.get(copy.get(i))
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_bu_liang_fan_ying.get(copy.get(i))
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_yao_wu_xiang_hu_zuo_yong.get(copy.get(i))
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_qi_ta.get(copy.get(i))
                    .toString()
                    .replaceAll("\\s*", "")
            };
        }
        table = new javax.swing.JTable();
        newTableModel = new DefaultTableModel(tableData_old, columnTitle) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tableSections(NE);
        table.getColumnModel().getColumn(0).setPreferredWidth(80 + 30);
        table.getColumnModel().getColumn(1).setPreferredWidth(80 + 30);
        table.getColumnModel().getColumn(2).setPreferredWidth(80 + 530);
        table.getColumnModel().getColumn(3).setPreferredWidth(80 + 60);
        table.getColumnModel().getColumn(4).setPreferredWidth(80 + 60);
        table.getColumnModel().getColumn(5).setPreferredWidth(80 + 30);
        table.getColumnModel().getColumn(6).setPreferredWidth(80 + 60);
        table.getColumnModel().getColumn(7).setPreferredWidth(80 + 30);
        table.getColumnModel().getColumn(8).setPreferredWidth(80 + 30);
        table.getColumnModel().getColumn(9).setPreferredWidth(80 + 30);
        table.getColumnModel().getColumn(10).setPreferredWidth(80 + 60);
        table.getColumnModel().getColumn(11).setPreferredWidth(80 + 30);
        table.getColumnModel().getColumn(12).setPreferredWidth(80 + 30);
        table.addMouseListener(this);
        return table;
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        simpleClicked(NE);
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
    }

    @SuppressWarnings("unused")
    @Override
    public void keyReleased(KeyEvent arg0) {
        if (null == copy) {
            return;//fatar trif
        }
        String[] score = new String[copy.size()];
        int[] score_code = new int[copy.size()];
        int[] reg = new int[copy.size()];
        int count = 0;
        IMV_SIQ_SS mapSearchWithoutSort = null;
        mapSearchWithoutSort = _A.parserMixStringByReturnFrequencyMap(key, NE);
        Iterator<String> iteratorForCopy = copy.iterator();
        int copyCount = 0;
        List<String> list = _A.parserMixedString(key);
        String[] string = List_ESU_X_listToArray._E(list);

        String[] stringReg = new String[key.length() / 3];
        for (int i = 0; i < stringReg.length; i++) {
            stringReg[i] = key.substring(i * 3, (i * 3 + 3) < key.length() ? (i * 3 + 3) : key.length() - 1);
        }
        while (iteratorForCopy.hasNext()) {
            String iteratorForCopyString = iteratorForCopy.next();
            score[copyCount] = iteratorForCopyString;
            String temps = iteratorForCopyString.toString()
                + NullObject.checkNULL(dic_jie_shao.get(iteratorForCopyString))
                .replaceAll("\\s*", "")
                + NullObject.checkNULL(dic_yao_li.get(iteratorForCopyString))
                .replaceAll("\\s*", "")
                + NullObject.checkNULL(dic_chengfen_danwei.get(iteratorForCopyString))
                .replaceAll("\\s*", "")
                + NullObject.checkNULL(dic_yong_fa.get(iteratorForCopyString))
                .replaceAll("\\s*", "")
                + NullObject.checkNULL(dic_zhu_yi.get(iteratorForCopyString))
                .replaceAll("\\s*", "")
                + NullObject.checkNULL(dic_shi_ying.get(iteratorForCopyString))
                .replaceAll("\\s*", "")
                + NullObject.checkNULL(dic_bu_liang_fan_ying.get(iteratorForCopyString))
                .replaceAll("\\s*", "")
                + NullObject.checkNULL(dic_yong_liang.get(iteratorForCopyString))
                .replaceAll("\\s*", "")
                + NullObject.checkNULL(dic_yao_wu_xiang_hu_zuo_yong.get(iteratorForCopyString))
                .replaceAll("\\s*", "")
                + NullObject.checkNULL(dic_qi_ta.get(iteratorForCopyString))
                .replaceAll("\\s*", "");
            Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
            Here:
            while (iteratorWordFrequency.hasNext()) {
                String mapSearchaAtII = iteratorWordFrequency.next();
                WordFrequency wordFrequencySearch = mapSearchWithoutSort.getW(mapSearchaAtII);
                if (temps.contains(mapSearchaAtII)) {
                    if (reg[copyCount] == 0) {
                        count += 1;
                    }
                    reg[copyCount] += 1;
                    score[copyCount] = iteratorForCopyString;
                    if (score[copyCount].contains(key.replace(" ", ""))) {
                        reg[copyCount] += 500;
                    }
                    if (key.contains(score[copyCount].replace(" ", ""))) {
                        reg[copyCount] += 500;
                    }
                    int wfs = (int)wordFrequencySearch.get_frequency();
                    wfs = wfs > 5 ? 5 : wfs;
                    if (pos.containsKey(mapSearchaAtII)) {
                        score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII)
                            ? 2 : 1) * (!S_Maps.mingCi.containsKey(mapSearchaAtII) ?
                            S_Maps.dongCi.containsKey(mapSearchaAtII) ? 10 : 1 : 50)
                            << mapSearchaAtII.length() + wfs;
                        continue Here;
                    }
                    score_code[copyCount] += 2 << mapSearchaAtII.length() + wfs;
                    continue Here;
                }
                if (mapSearchaAtII.length() > 1) {
                    for (int j = 0; j < mapSearchaAtII.length(); j++) {
                        if (temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
                            if (reg[copyCount] == 0) {
                                count += 1;
                            }
                            reg[copyCount] += 1;
                            score[copyCount] = iteratorForCopyString;
                            score_code[copyCount] += 1;
                        }
                    }
                }
            }
            score_code[copyCount] = score_code[copyCount] * reg[copyCount];
            //词距
            int code = 100;
            int tempb = 0;
            int tempa = score_code[copyCount];
            if (key.length() > 4) {
                //全词
                for (int i = 0; i < string.length; i++) {
                    if (temps.contains(string[i])) {
                        tempb += code;
                    }
                }
                //断句
                for (int i = 0; i < stringReg.length; i++) {
                    if (temps.contains(stringReg[i])) {
                        tempb += code;
                    }
                }
                score_code[copyCount] = (int) (tempa / Math.pow(this.app_S.lookrot + 1, 4)
                    + tempb * Math.pow(this.app_S.lookrot, 2));
            }
            if (key.replace(" ", "").length() > 1
                && key.replace(" ", "").length() < 5) {
                if (temps.contains(key.replace(" ", ""))) {
                    tempb += code << 7;
                }
                score_code[copyCount] = (int) (tempa / Math.pow(this.app_S.lookrot + 1, 4)
                    + tempb * Math.pow(this.app_S.lookrot, 2));
            }
            copyCount++;
        }
        LABEL2:
        NE.app_S.lYGSortESU9D.javaSort(score_code, score);
        int max = score_code[0];
        Object[][] tableData = new Object[count][18];
        int new_count = 0;
        newTableModel.getDataVector().clear();
        if (null == key || key.equals("")) {
            for (int i = 0; i < tableData_old.length; i++) {
                newTableModel.insertRow(i, tableData_old[i]);
            }
            newTableModel.fireTableDataChanged();
            return;
        }
        Here:
        for (int i = copy.size() - 1; i > -1; i--) {
            if (score_code[i] < 1) {
                continue Here;
            }
            if (app_S.risk_filter_box.isSelected()) {
                String hai = (dic_zhu_yi.get(score[i]) == null ? "null."
                    : dic_zhu_yi.get(score[i]).toString()
                    .replaceAll("\\s*", "")
                    .equalsIgnoreCase("")
                    ? "null" : dic_zhu_yi.get(score[i])
                    .toString()
                    .replaceAll("\\s*", ""));
                String temp = app_S.name_filter.getText();
                for (int j = 0; j < temp.length(); j++) {
                    if (hai.contains("" + temp.charAt(j))) {
                        continue Here;
                    }
                }
            }
            if (app_S.shuming_filter_box.isSelected()) {
                String wei = score[i];
                String temp = app_S.name_filter.getText();
                for (int j = 0; j < temp.length(); j++) {
                    if (wei.contains("" + temp.charAt(j))) {
                        continue Here;
                    }
                }
            }
            tableData[new_count] = new Object[]{new_count + 1,
                score_code[i],
                score[i],
                dic_chengfen_danwei.get(score[i])
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_zhu_yi.get(score[i])
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_yong_liang.get(score[i])
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_shi_ying.get(score[i])
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_yao_li.get(score[i])
                    .toString()
                    .replaceAll("\\s*", ""),

                dic_jie_shao.get(score[i])
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_yong_fa.get(score[i])
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_bu_liang_fan_ying.get(score[i])
                    .toString()
                    .replaceAll("\\s*", ""),
                dic_yao_wu_xiang_hu_zuo_yong.get(score[i]).
                    toString().replaceAll("\\s*", ""),
                dic_qi_ta.get(score[i])
                    .toString()
                    .replaceAll("\\s*", "")
            };
            newTableModel.insertRow(new_count, tableData[new_count]);
            new_count += 1;
        }
        newTableModel.fireTableDataChanged();
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
    }
}

//
//63		


//测试下刚写的标准读表函数.
//		DictionaryStandardDB d= new DictionaryStandardDB();
//		String primaryKey= "西药名";
//		String tabKey= "xybg";
//		//以后设计 uniq forenkey等.
//		//记得在数据库文件rows 的row 下加 is_delete_0 文件夹. 不然不显示哦 罗瑶光20210505
//		Map<String, IMV_SIQ> map= d.dbToMap(primaryKey, tabKey);
//		dic_yao_ming= map.get("西药名");
//		dic_jie_shao= map.get("介绍");
//		dic_yao_li= map.get("药理");
//		dic_chengfen_danwei= map.get("主要成分");
//		dic_yong_fa= map.get("用法");
//		dic_zhu_yi= map.get("注意事项");
//		dic_shi_ying= map.get("适应症");
//		dic_bu_liang_fan_ying= map.get("不良反应");
//		dic_yong_liang= map.get("用量");
//		dic_yao_wu_xiang_hu_zuo_yong= map.get("药物相互作用");
//		dic_qi_ta= map.get("其他");
//		IMV_SIQ dic_map= map.get("dic_map");