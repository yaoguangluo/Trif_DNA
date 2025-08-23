package I_A.IMO.EVU.bi_P;

import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;

import java.awt.Font;
import java.awt.Graphics2D;
import java.util.Iterator;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于gleem J3D官方demo 来写的。
public class CoAuthorForWord_XCDX_M extends CoAuthorForWord_XCDX_S {
    //dnn bingming
    public IMV_SIQ kernerDnnBingMingForest(String[] dnn, IMV_SIQ root
        , Map<String, Integer> findLeaf, int depth) {
        IMV_SIQ leaf = new IMV_SIQ();
        if (++depth > 6) {
            return leaf;
        }
        //s[se]= root3.size()> (int)irot? (int)irot: root3.size();
        int max = dnn.length > (int) irot ? (int) irot : dnn.length;
        for (int i = 1; i < max; i++) {
            String tempRec = dnn[i].split(":")[0];
            if (tempRec.length() > 1) {
                if (this.pos.containsKey(tempRec)) {
                    int find = 0;
                    if (S_Maps.mingCi.containsKey(tempRec)) {
                        find++;
                    }
                    if (S_Maps.dongCi.containsKey(tempRec)) {
                        find++;
                    }
                    if (S_Maps.xingRongCi.containsKey(tempRec)) {
                        find++;
                    }
                    if (S_Maps.weiCi.containsKey(tempRec)) {
                        find++;
                    }
                    if (find > 0) {
                        if (!findLeaf.containsKey(tempRec)) {
                            findLeaf.put(tempRec, 1);
                            frequencyLeaf.put(tempRec, -1);
                            Iterator<String> iterator = u.xyscPage.dic_shi_ying.keySet().iterator();
                            IMV_SIQ gongxiao = new IMV_SIQ();
                            Here:
                            while (iterator.hasNext()) {
                                String yaoming = iterator.next();
                                IMV_SIQ gongxiaoyaoming = new IMV_SIQ();
                                String li = u.xyscPage.dic_shi_ying.get(yaoming).toString();
                                li += u.xyscPage.dic_yao_li.get(yaoming).toString();
                                if (li.contains(tempRec)) {
                                    String hai = u.xyscPage.dic_bu_liang_fan_ying
                                        .get(yaoming).toString();
                                    hai += u.xyscPage.dic_zhu_yi.get(yaoming).toString();
                                    String xw = li;
                                    if (!frequencyLeaf.containsKey(yaoming)) {
                                        frequencyLeaf.put(yaoming, 1);
                                        if (u.risk_filter_box.isSelected()) {
                                            String temp = u.name_filter.getText();
                                            for (int j = 0; j < temp.length(); j++) {
                                                if (hai.contains("" + temp.charAt(j))) {
                                                    continue Here;
                                                }
                                            }
                                        }
                                        //li
                                        if (u.feel_filter_box.isSelected()) {
                                            String temp = u.name_filter.getText();
                                            for (int j = 0; j < temp.length(); j++) {
                                                if (li.contains("" + temp.charAt(j))) {
                                                    continue Here;
                                                }
                                            }
                                        }
                                        //xw
                                        if (!u.nameFeelFilter.getText().isEmpty()) {
                                            String temp = u.nameFeelFilter.getText();
                                            for (int j = 0; j < temp.length(); j++) {
                                                if (xw.contains("" + temp.charAt(j))) {
                                                    continue Here;
                                                }
                                            }
                                        }

                                        //sm
                                        if (u.shuming_filter_box.isSelected()) {
                                            String temp = u.name_filter.getText();
                                            for (int j = 0; j < temp.length(); j++) {
                                                if (yaoming.contains("" + temp.charAt(j))) {
                                                    continue Here;
                                                }
                                            }
                                        }
                                        yaoming = yaoming.split("适应症")[0];
                                        yaoming = yaoming.split("（")[0];
                                        yaoming = yaoming.split("\\(")[0];
                                        gongxiao.put(yaoming, gongxiaoyaoming);
                                    } else {
                                        frequencyLeaf.put(yaoming, frequencyLeaf.get(yaoming) + 1);
                                        //hai
                                    }
                                    //	}
                                }
                            }
                            leaf.put(tempRec, gongxiao);
                        } else {
                            frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
                        }
                    }
                }
            }
        }
        return leaf;
    }

    //dnn
    public IMV_SIQ kernerDnnForest(String[] dnn, IMV_SIQ root
        , Map<String, Integer> findLeaf, int depth) {
        IMV_SIQ leaf = new IMV_SIQ();
        if (++depth > 6) {
            return leaf;
        }
        int max = dnn.length > (int) irot ? (int) irot : dnn.length;
        for (int i = 1; i < max; i++) {
            String tempRec = dnn[i].split(":")[0];
            if (tempRec.length() > 1) {
                if (this.pos.containsKey(tempRec)) {
                    int find = 0;
                    if (S_Maps.mingCi.containsKey(tempRec)) {
                        find++;
                    }
                    if (S_Maps.dongCi.containsKey(tempRec)) {
                        find++;
                    }
                    if (S_Maps.xingRongCi.containsKey(tempRec)) {
                        find++;
                    }
                    if (S_Maps.weiCi.containsKey(tempRec)) {
                        find++;
                    }
                    if (find > 0) {
                        if (!findLeaf.containsKey(tempRec)) {
                            findLeaf.put(tempRec, 1);
                            frequencyLeaf.put(tempRec, -1);
                            Iterator<String> iterator = u.dic_li.keySet().iterator();
                            IMV_SIQ gongxiao = new IMV_SIQ();
                            Here:
                            while (iterator.hasNext()) {
                                String yaoming = iterator.next();
                                IMV_SIQ gongxiaoyaoming = new IMV_SIQ();
                                if (u.dic_li.get(yaoming).toString().contains(tempRec)) {
                                    String hai = u.dic_hai.getString(yaoming);
                                    String li = u.dic_li.getString(yaoming);
                                    String xw = u.dic_xw.getString(yaoming);
                                    String jm = u.dic_jm.getTrimString(yaoming);//later..
                                    if (!frequencyLeaf.containsKey(yaoming)) {
                                        frequencyLeaf.put(yaoming, 1);
                                        //hai
                                        if (u.risk_filter_box.isSelected()) {
                                            String temp = u.name_filter.getText();
                                            for (int j = 0; j < temp.length(); j++) {
                                                if (hai.contains("" + temp.charAt(j))) {
                                                    continue Here;
                                                }
                                            }
                                        }
                                        //li
                                        if (u.feel_filter_box.isSelected()) {
                                            String temp = u.name_filter.getText();
                                            for (int j = 0; j < temp.length(); j++) {
                                                if (li.contains("" + temp.charAt(j))) {
                                                    continue Here;
                                                }
                                            }
                                        }
                                        //xw
                                        if (!u.nameFeelFilter.getText().isEmpty()) {
                                            String temp = u.nameFeelFilter.getText();
                                            for (int j = 0; j < temp.length(); j++) {
                                                if (xw.contains("" + temp.charAt(j))) {
                                                    continue Here;
                                                }
                                            }
                                        }
                                        //jm
                                        if (null != u.name_filter_not_have.getText()) {
                                            if (!u.name_filter_not_have.getText().replace(" "
                                                , "").isEmpty()) {
                                                String temp = u.name_filter_not_have.getText();
                                                int findJM = 0;
                                                for (int j = 0; j < temp.length(); j++) {
                                                    if (jm.contains("" + temp.charAt(j))) {
                                                        findJM = 1;
                                                    }
                                                }
                                                if (findJM == 0) {
                                                    continue Here;
                                                }
                                            }
                                        }
                                        //sm
                                        if (u.shuming_filter_box.isSelected()) {
                                            String temp = u.name_filter.getText();
                                            for (int j = 0; j < temp.length(); j++) {
                                                if (yaoming.contains("" + temp.charAt(j))) {
                                                    continue Here;
                                                }
                                            }
                                        }
                                        gongxiao.put(yaoming, gongxiaoyaoming);
                                    } else {
                                        frequencyLeaf.put(yaoming, frequencyLeaf.get(yaoming) + 1);
                                    }
                                }
                            }
                            leaf.put(tempRec, gongxiao);
                        } else {
                            frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
                        }
                    }
                }
            }
        }
        return leaf;
    }

    //neike JINJI
    public IMV_SIQ kernerZynkJForest(String temp, IMV_SIQ root
        , Map<String, Integer> findLeaf, int depth, App NE) {
        IMV_SIQ leaf = new IMV_SIQ();
        if (++depth > 6) {
            return leaf;
        }
        int ml = 0;
        IMV_SIQ_SS map = _A.parserMixStringByReturnFrequencyMap(temp, NE);
        Iterator<String> it = map.keySet().iterator();
        int max = 0;
        while (it.hasNext()) {
            String tempRec = it.next();
            if (!findLeaf.containsKey(tempRec)) {
                findLeaf.put(tempRec, 1);
                frequencyLeaf.put(tempRec, -1);
                if (u.dic_map.containsKey(tempRec)) {
                    IMV_SIQ subLeaf = new IMV_SIQ();
                    if (u.dic_hai.containsKey(tempRec)) {
                        if (!u.dic_hai.get(tempRec).toString().contains("笔记")) {
                            IMV_SIQ leafLiSub = new IMV_SIQ();
                            subLeaf.put(u.dic_hai.get(tempRec).toString(), leafLiSub);
                        }
                    }
                    if (max++ < 25) {
                        leaf.put(tempRec, subLeaf);
                    }
                    //return leaf;
                } else if (ml < 8) {
                    IMV_SIQ subLeaf = kernerForest(tempRec, leaf, findLeaf, depth, NE);
                    if (subLeaf.size() > 0) {
                        leaf.put(tempRec, subLeaf);
                        ml++;
                    }
                }
            } else {
                frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
            }
        }
        return leaf;
    }

    //li
    public IMV_SIQ kernerForest(String temp, IMV_SIQ root
        , Map<String, Integer> findLeaf, int depth, App NE) {
        IMV_SIQ leaf = new IMV_SIQ();
        if (++depth > 6) {
            return leaf;
        }
        //int ml=0;
        if (u.dic_li.containsKey(temp) || u.dic_yl.containsKey(temp) || u.dic_zf.containsKey(temp)) {
            IMV_SIQ_SS map = _A.parserMixStringByReturnFrequencyMap(
                (u.dic_li.get(temp) == null ? "" : u.dic_li.get(temp)) +
                    (u.dic_yl.get(temp) == null ? "" : "") +
                    (u.dic_zf.get(temp) == null ? "" : "")
                , NE);
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {//gongxiao
                String tempRec = it.next();
                if (tempRec.length() > 1) {
                    if (this.pos.containsKey(tempRec)) {
                        int find = 0;
                        if (S_Maps.mingCi.containsKey(tempRec)) {
                            find++;
                        }
                        if (S_Maps.dongCi.containsKey(tempRec)) {
                            find++;
                        }
                        if (S_Maps.xingRongCi.containsKey(tempRec)) {
                            find++;
                        }
                        if (S_Maps.weiCi.containsKey(tempRec)) {
                            find++;
                        }
                        if (find > 0) {
                            if (!findLeaf.containsKey(tempRec)) {
                                findLeaf.put(tempRec, 1);
                                frequencyLeaf.put(tempRec, -1);
                                Iterator<String> iterator = u.dic_li.keySet().iterator();
                                IMV_SIQ gongxiao = new IMV_SIQ();
                                while (iterator.hasNext()) {
                                    String yaoming = iterator.next();
                                    IMV_SIQ gongxiaoyaoming = new IMV_SIQ();
                                    if (u.dic_li.get(yaoming).toString().contains(tempRec)) {
                                        String hai = u.dic_hai.get(yaoming).toString();
                                        if (!hai.contains("慎") && !hai.contains("禁") && !hai.contains("恶")
                                            && !hai.contains("毒") && !hai.contains("畏")
                                            && !hai.contains("孕") && !hai.contains("忌") && !hai.contains("胎")) {
                                            if (!frequencyLeaf.containsKey(yaoming)) {
                                                frequencyLeaf.put(yaoming, 1);
                                                String xingWeiRatio = u.dic_xw.get(yaoming).toString();
                                                String xingWei = u.dic_xw.get(temp).toString();
                                                String maiLuoRatio = u.dic_jm.get(yaoming).toString();
                                                String maiLuo = u.dic_jm.get(temp).toString();
                                                boolean _V_O = ((maiLuoRatio.contains("大肠") && maiLuo.contains("大肠"))
                                                    || (maiLuoRatio.contains("小肠") && maiLuo.contains("小肠"))
                                                    || (maiLuoRatio.contains("肝") && maiLuo.contains("肝"))
                                                    || (maiLuoRatio.contains("脾") && maiLuo.contains("脾"))
                                                    || (maiLuoRatio.contains("膀胱") && maiLuo.contains("膀胱"))
                                                    || (maiLuoRatio.contains("胆") && maiLuo.contains("胆"))
                                                    || (maiLuoRatio.contains("肺") && maiLuo.contains("肺"))
                                                    || (maiLuoRatio.contains("肾") && maiLuo.contains("肾"))
                                                    || (maiLuoRatio.contains("十二") && maiLuo.contains("十二"))
                                                    || (maiLuoRatio.contains("任") && maiLuo.contains("任"))
                                                    || (maiLuoRatio.contains("督") && maiLuo.contains("督"))
                                                    || (maiLuoRatio.contains("三焦") && maiLuo.contains("三焦"))
                                                    || (maiLuoRatio.contains("胃") && maiLuo.contains("胃"))
                                                );
                                                boolean _V_A = ((!maiLuoRatio.contains("大肠") && !maiLuo.contains("大肠")
                                                    && !maiLuoRatio.contains("小肠") && !maiLuo.contains("小肠")
                                                    && !maiLuoRatio.contains("肝") && !maiLuo.contains("肝")
                                                    && !maiLuoRatio.contains("脾") && !maiLuo.contains("脾")
                                                    && !maiLuoRatio.contains("膀胱") && !maiLuo.contains("膀胱")
                                                    && !maiLuoRatio.contains("胆") && !maiLuo.contains("胆")
                                                    && !maiLuoRatio.contains("肺") && !maiLuo.contains("肺")
                                                    && !maiLuoRatio.contains("肾") && !maiLuo.contains("肾")
                                                    && !maiLuoRatio.contains("十二") && !maiLuo.contains("十二")
                                                    && !maiLuoRatio.contains("任") && !maiLuo.contains("任")
                                                    && !maiLuoRatio.contains("督") && !maiLuo.contains("督")
                                                    && !maiLuoRatio.contains("三焦") && !maiLuo.contains("三焦")
                                                    && !maiLuoRatio.contains("胃") && !maiLuo.contains("胃")
                                                    && !maiLuoRatio.contains("肠") && !maiLuo.contains("肠")));
                                                if (((xingWeiRatio.contains("辛") && xingWei.contains("辛"))
                                                    || (xingWeiRatio.contains("温") && xingWei.contains("温"))
                                                    || (xingWeiRatio.contains("燥") && xingWei.contains("燥"))
                                                    || (xingWeiRatio.contains("热") && xingWei.contains("热"))
                                                    || (xingWeiRatio.contains("苦") && xingWei.contains("苦"))
                                                    || (xingWeiRatio.contains("寒") && xingWei.contains("寒"))
                                                    || (xingWeiRatio.contains("凉") && xingWei.contains("凉"))
                                                )) {
                                                    if (maiLuoRatio.contains("心包")) {
                                                        if ((maiLuo.contains("心包"))) {
                                                            gongxiao.put(yaoming, gongxiaoyaoming);
                                                        }
                                                    }
                                                    if (!maiLuoRatio.contains("心包") && maiLuoRatio.contains("心")) {
                                                        if ((!maiLuo.contains("心包") && maiLuo.contains("心"))) {
                                                            gongxiao.put(yaoming, gongxiaoyaoming);
                                                        }
                                                    }
                                                    if (_V_O) {
                                                        gongxiao.put(yaoming, gongxiaoyaoming);
                                                    }
                                                    if (_V_A) {
                                                        gongxiao.put(yaoming, gongxiaoyaoming);
                                                    }
                                                }

                                                if (((!xingWeiRatio.contains("辛") && !xingWei.contains("辛")
                                                    && !xingWeiRatio.contains("温") && !xingWei.contains("温")
                                                    && !xingWeiRatio.contains("燥") && !xingWei.contains("燥")
                                                    && !xingWeiRatio.contains("热") && !xingWei.contains("热")
                                                    && !xingWeiRatio.contains("苦") && !xingWei.contains("苦")
                                                    && !xingWeiRatio.contains("寒") && !xingWei.contains("寒")
                                                    && !xingWeiRatio.contains("凉") && !xingWei.contains("凉")
                                                ))) {
                                                    if (maiLuoRatio.contains("心包")) {
                                                        if ((maiLuo.contains("心包"))) {
                                                            gongxiao.put(yaoming, gongxiaoyaoming);
                                                        }
                                                    }
                                                    if (!maiLuoRatio.contains("心包") && maiLuoRatio.contains("心")) {
                                                        if ((!maiLuo.contains("心包") && maiLuo.contains("心"))) {
                                                            gongxiao.put(yaoming, gongxiaoyaoming);
                                                        }
                                                    }
                                                    if (_V_O) {
                                                        gongxiao.put(yaoming, gongxiaoyaoming);
                                                    }
                                                    if (_V_A) {
                                                        gongxiao.put(yaoming, gongxiaoyaoming);
                                                    }
                                                }
                                            } else {
                                                frequencyLeaf.put(yaoming, frequencyLeaf.get(yaoming) + 1);
                                            }
                                        }
                                    }
                                }
                                leaf.put(tempRec, gongxiao);
                            } else {
                                frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
                            }
                        }
                    }
                }
            }
        }
        return leaf;
    }

    //neike
    public IMV_SIQ kernerZynkForest(String temp, IMV_SIQ root
        , Map<String, Integer> findLeaf, int depth, App NE) {
        IMV_SIQ leaf = new IMV_SIQ();
        if (++depth > 6) {
            return leaf;
        }
        int ml = 0;
        int max = 0;
        IMV_SIQ_SS map = _A.parserMixStringByReturnFrequencyMap(temp, NE);
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String tempRec = it.next();
            if (!findLeaf.containsKey(tempRec)) {
                findLeaf.put(tempRec, 1);
                frequencyLeaf.put(tempRec, -1);
                if (u.dic_map.containsKey(tempRec)) {
                    IMV_SIQ subLeaf = new IMV_SIQ();
                    if (u.dic_li.containsKey(tempRec)) {
                        IMV_SIQ_SS liMap
                            = this._A.parserMixStringByReturnFrequencyMap(u.dic_li.get(tempRec).toString(), NE);
                        Iterator<String> itli = liMap.keySet().iterator();
                        while (itli.hasNext()) {
                            String word = itli.next();
                            if (this.pos.containsKey(word)) {
                                if (word.length() > 1) {
                                    if (!frequencyLeaf.containsKey(word)) {
                                        frequencyLeaf.put(word, 1);
                                    } else {
                                        frequencyLeaf.put(word, frequencyLeaf.get(word) + 1);
                                    }
                                    IMV_SIQ leafLiSub = new IMV_SIQ();
                                    if (pos.getString(word).contains("动")) {
                                        subLeaf.put(word, leafLiSub);
                                    }
                                    if (pos.getString(word).contains("形")) {
                                        subLeaf.put(word, leafLiSub);
                                    }
                                    if (pos.getString(word).contains("谓")) {
                                        subLeaf.put(word, leafLiSub);
                                    }
                                }
                            }
                        }
                    }
                    if (max++ < 25) {
                        leaf.put(tempRec, subLeaf);
                    }
                    //return leaf;
                } else if (ml < 8) {
                    IMV_SIQ subLeaf = kernerForest(tempRec, leaf, findLeaf, depth, NE);
                    if (subLeaf.size() > 0) {
                        leaf.put(tempRec, subLeaf);
                        ml++;
                    }
                }
            } else {
                frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
            }
        }
        return leaf;
    }

    //gongxiao
    public IMV_SIQ kernerClassification(String temp, IMV_SIQ root
        , Map<String, Integer> findLeaf, int depth, App NE) {
        IMV_SIQ leaf = new IMV_SIQ();
        if (++depth > 6) {
            return leaf;
        }
        frequencyLeaf.put(temp, -1);
        if (u.dic_li.containsKey(temp)) {
            String className = temp + "功效";
            findLeaf.put(className, 1);
            frequencyLeaf.put(className, -1);
            //add sub sets
            IMV_SIQ_SS liMap
                = this._A.parserMixStringByReturnFrequencyMap(u.dic_li.get(temp).toString(), NE);
            Iterator<String> it = liMap.keySet().iterator();
            IMV_SIQ leafLi = new IMV_SIQ();
            int ml = 0;
            while (it.hasNext()) {
                String word = liMap.getW(it.next()).get_word();
                if (this.pos.containsKey(word)) {
                    if (word.length() > 1) {
                        IMV_SIQ leafLiSub = new IMV_SIQ();
                        leafLi.put(word, leafLiSub);
                        frequencyLeaf.put(word, -1);
                    } else if (ml < 10) {
                        IMV_SIQ leafLiSub = new IMV_SIQ();
                        if (leafLiSub.size() > 0) {
                            leaf.put(word, leafLiSub);
                            ml++;
                        }
                        ml++;
                    }
                }
            }
            leaf.put(className, leafLi);
        }
        if (u.dic_hai.containsKey(temp)) {
            String className = temp + "禁忌";
            findLeaf.put(className, 1);
            frequencyLeaf.put(className, -1);
            IMV_SIQ leafLi = new IMV_SIQ();
            String string = u.dic_hai.get(temp).toString().length() > 40
                ? u.dic_hai.get(temp).toString().substring(0, 40) : u.dic_hai.get(temp).toString();
            leafLi.put(string, leafLi);
            frequencyLeaf.put(string, -1);
            leaf.put(className, leafLi);
        }
        if (u.dic_xw.containsKey(temp)) {
            String className = temp + "性味";
            findLeaf.put(className, 1);
            frequencyLeaf.put(className, -1);
            //add sub sets
            IMV_SIQ_SS liMap
                = this._A.parserMixStringByReturnFrequencyMap(u.dic_xw.get(temp).toString(), NE);
            Iterator<String> it = liMap.keySet().iterator();
            IMV_SIQ leafLi = new IMV_SIQ();
            int ml = 0;
            while (it.hasNext()) {
                String word = liMap.getW(it.next()).get_word();
                if (this.pos.containsKey(word)) {
                    if (word.length() > 1) {
                        IMV_SIQ leafLiSub = new IMV_SIQ();
                        leafLi.put(word, leafLiSub);
                        frequencyLeaf.put(word, -1);
                    } else if (ml < 10) {
                        IMV_SIQ leafLiSub = new IMV_SIQ();
                        leafLi.put(word, leafLiSub);
                        frequencyLeaf.put(word, -1);
                        ml++;
                    }
                }
            }
            leaf.put(className, leafLi);
        }
        if (u.dic_yl.containsKey(temp)) {
            String className = temp + "用量备注";
            findLeaf.put(className, 1);
            frequencyLeaf.put(className, -1);
            //add sub sets
            IMV_SIQ leafLi = new IMV_SIQ();
            leafLi.put(u.dic_yl.get(temp).toString(), leafLi);
            frequencyLeaf.put(u.dic_yl.get(temp).toString(), -1);
            leaf.put(className, leafLi);
        }
        return leaf;
    }

    //hai
    public IMV_SIQ kernerSea(String temp, IMV_SIQ root
        , Map<String, Integer> findLeaf, int depth, App NE) {
        IMV_SIQ leaf = new IMV_SIQ();
        if (++depth > 6) {
            return leaf;
        }
        //int ml=0;
        if (u.dic_yw.containsKey(temp)) {
            if (u.dic_yw.get(temp).toString().isEmpty()) {
                return leaf;
            }
        } else {
            return leaf;
        }
        if (u.dic_li.containsKey(temp) || u.dic_yl.containsKey(temp)
            || u.dic_zf.containsKey(temp)) {
            IMV_SIQ_SS map = _A.parserMixStringByReturnFrequencyMap(
                (u.dic_li.get(temp) == null ? "" : u.dic_li.get(temp)) +
                    (u.dic_yl.get(temp) == null ? "" : "") +
                    (u.dic_zf.get(temp) == null ? "" : "")
                , NE
            );
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {//gongxiao
                String tempRec = it.next();
                if (tempRec.length() > 1) {
                    if (this.pos.containsKey(tempRec)) {
                        int find = 0;
                        if (S_Maps.mingCi.containsKey(tempRec)) {
                            find++;
                        }
                        if (S_Maps.dongCi.containsKey(tempRec)) {
                            find++;
                        }
                        if (S_Maps.xingRongCi.containsKey(tempRec)) {
                            find++;
                        }
                        if (S_Maps.weiCi.containsKey(tempRec)) {
                            find++;
                        }
                        if (find > 0) {
                            if (!findLeaf.containsKey(tempRec)) {
                                findLeaf.put(tempRec, 1);
                                frequencyLeaf.put(tempRec, -1);
                                Iterator<String> iterator = u.dic_li.keySet().iterator();
                                IMV_SIQ gongxiao
                                    = new IMV_SIQ();
                                //int max= 0;
                                //bianli gongxiao
                                Here:
                                while (iterator.hasNext()) {
                                    String yaoming = iterator.next();
                                    IMV_SIQ gongxiaoyaoming = new IMV_SIQ();
                                    if (u.dic_li.get(yaoming).toString().contains(tempRec)) {
                                        String hai = u.dic_hai.get(yaoming).toString();
                                        if (hai.contains("慎") || hai.contains("禁") || hai.contains("恶")
                                            || hai.contains("毒") || hai.contains("畏")
                                            || hai.contains("孕") || hai.contains("忌") || hai.contains("胎")) {
                                            if (!yaoming.contains("穴") && !frequencyLeaf.containsKey(yaoming)) {
                                                frequencyLeaf.put(yaoming, 1);
                                                String xingWeiRatio = u.dic_xw.get(yaoming).toString();
                                                String xingWei = u.dic_xw.get(temp).toString();
                                                String maiLuoRatio = u.dic_jm.get(yaoming).toString();
                                                String maiLuo = u.dic_jm.get(temp).toString();
//
                                                if (u.risk_filter_box.isSelected()) {
                                                    String tempRisk = u.name_filter.getText();
                                                    for (int j = 0; j < tempRisk.length(); j++) {
                                                        if (hai.contains("" + tempRisk.charAt(j))) {
                                                            continue Here;
                                                        }
                                                    }
                                                }
                                                if (((xingWeiRatio.contains("辛") && xingWei.contains("辛"))
                                                    || (xingWeiRatio.contains("温") && xingWei.contains("温"))
                                                    || (xingWeiRatio.contains("燥") && xingWei.contains("燥"))
                                                    || (xingWeiRatio.contains("热") && xingWei.contains("热"))
                                                    || (xingWeiRatio.contains("苦") && xingWei.contains("苦"))
                                                    || (xingWeiRatio.contains("寒") && xingWei.contains("寒"))
                                                    || (xingWeiRatio.contains("凉") && xingWei.contains("凉"))
                                                )) {
                                                    if (maiLuoRatio.contains("心包")) {
                                                        if ((maiLuo.contains("心包"))) {
                                                            gongxiaoyaoming.put(hai, new IMV_SIQ());
                                                            findLeaf.put(yaoming, 1);
                                                            gongxiao.put(yaoming, gongxiaoyaoming);
                                                        }
                                                    }
                                                    if (!maiLuoRatio.contains("心包") && maiLuoRatio.contains("心")) {
                                                        if ((!maiLuo.contains("心包") && maiLuo.contains("心"))) {
                                                            gongxiaoyaoming.put(hai, new IMV_SIQ());
                                                            findLeaf.put(yaoming, 1);
                                                            gongxiao.put(yaoming, gongxiaoyaoming);
                                                        }
                                                    }
                                                    if ((maiLuoRatio.contains("大肠") && maiLuo.contains("大肠"))
                                                        || (maiLuoRatio.contains("小肠") && maiLuo.contains("小肠"))
                                                        || (maiLuoRatio.contains("肝") && maiLuo.contains("肝"))
                                                        || (maiLuoRatio.contains("脾") && maiLuo.contains("脾"))
                                                        || (maiLuoRatio.contains("膀胱") && maiLuo.contains("膀胱"))
                                                        || (maiLuoRatio.contains("胆") && maiLuo.contains("胆"))
                                                        || (maiLuoRatio.contains("肺") && maiLuo.contains("肺"))
                                                        || (maiLuoRatio.contains("肾") && maiLuo.contains("肾"))
                                                        || (maiLuoRatio.contains("十二") && maiLuo.contains("十二"))
                                                        || (maiLuoRatio.contains("任") && maiLuo.contains("任"))
                                                        || (maiLuoRatio.contains("督") && maiLuo.contains("督"))
                                                        || (maiLuoRatio.contains("三焦") && maiLuo.contains("三焦"))
                                                        || (maiLuoRatio.contains("胃") && maiLuo.contains("胃"))
                                                    ) {
                                                        gongxiaoyaoming.put(hai, new IMV_SIQ());
                                                        findLeaf.put(yaoming, 1);
                                                        gongxiao.put(yaoming, gongxiaoyaoming);
                                                    }
                                                    if ((!maiLuoRatio.contains("大肠") && !maiLuo.contains("大肠")
                                                        && !maiLuoRatio.contains("小肠") && !maiLuo.contains("小肠")
                                                        && !maiLuoRatio.contains("肝") && !maiLuo.contains("肝")
                                                        && !maiLuoRatio.contains("脾") && !maiLuo.contains("脾")
                                                        && !maiLuoRatio.contains("膀胱") && !maiLuo.contains("膀胱")
                                                        && !maiLuoRatio.contains("胆") && !maiLuo.contains("胆")
                                                        && !maiLuoRatio.contains("肺") && !maiLuo.contains("肺")
                                                        && !maiLuoRatio.contains("肾") && !maiLuo.contains("肾")
                                                        && !maiLuoRatio.contains("十二") && !maiLuo.contains("十二")
                                                        && !maiLuoRatio.contains("任") && !maiLuo.contains("任")
                                                        && !maiLuoRatio.contains("督") && !maiLuo.contains("督")
                                                        && !maiLuoRatio.contains("三焦") && !maiLuo.contains("三焦")
                                                        && !maiLuoRatio.contains("胃") && !maiLuo.contains("胃")
                                                    )) {
                                                        gongxiaoyaoming.put(hai, new IMV_SIQ());
                                                        findLeaf.put(yaoming, 1);
                                                        gongxiao.put(yaoming, gongxiaoyaoming);
                                                    }
                                                }
                                                if (((!xingWeiRatio.contains("辛") && !xingWei.contains("辛")
                                                    && !xingWeiRatio.contains("温") && !xingWei.contains("温")
                                                    && !xingWeiRatio.contains("燥") && !xingWei.contains("燥")
                                                    && !xingWeiRatio.contains("热") && !xingWei.contains("热")
                                                    && !xingWeiRatio.contains("苦") && !xingWei.contains("苦")
                                                    && !xingWeiRatio.contains("寒") && !xingWei.contains("寒")
                                                    && !xingWeiRatio.contains("凉") && !xingWei.contains("凉"))
                                                )) {
                                                    if (maiLuoRatio.contains("心包")) {
                                                        if ((maiLuo.contains("心包"))) {
                                                            gongxiaoyaoming.put(hai, new IMV_SIQ());
                                                            findLeaf.put(yaoming, 1);
                                                            gongxiao.put(yaoming, gongxiaoyaoming);
                                                        }
                                                    }
                                                    if (!maiLuoRatio.contains("心包") && maiLuoRatio.contains("心")) {
                                                        if ((!maiLuo.contains("心包") && maiLuo.contains("心"))) {
                                                            gongxiaoyaoming.put(hai, new IMV_SIQ());
                                                            findLeaf.put(yaoming, 1);
                                                            gongxiao.put(yaoming, gongxiaoyaoming);
                                                        }
                                                    }
                                                    if ((maiLuoRatio.contains("大肠") && maiLuo.contains("大肠"))
                                                        || (maiLuoRatio.contains("小肠") && maiLuo.contains("小肠"))
                                                        || (maiLuoRatio.contains("肝") && maiLuo.contains("肝"))
                                                        || (maiLuoRatio.contains("脾") && maiLuo.contains("脾"))
                                                        || (maiLuoRatio.contains("膀胱") && maiLuo.contains("膀胱"))
                                                        || (maiLuoRatio.contains("胆") && maiLuo.contains("胆"))
                                                        || (maiLuoRatio.contains("肺") && maiLuo.contains("肺"))
                                                        || (maiLuoRatio.contains("肾") && maiLuo.contains("肾"))
                                                        || (maiLuoRatio.contains("十二") && maiLuo.contains("十二"))
                                                        || (maiLuoRatio.contains("任") && maiLuo.contains("任"))
                                                        || (maiLuoRatio.contains("督") && maiLuo.contains("督"))
                                                        || (maiLuoRatio.contains("三焦") && maiLuo.contains("三焦"))
                                                        || (maiLuoRatio.contains("胃") && maiLuo.contains("胃"))
                                                    ) {
                                                        gongxiaoyaoming.put(hai, new IMV_SIQ());
                                                        findLeaf.put(yaoming, 1);
                                                        gongxiao.put(yaoming, gongxiaoyaoming);
                                                    }
                                                    if ((!maiLuoRatio.contains("大肠") && !maiLuo.contains("大肠") && (!maiLuoRatio.contains("小肠") && !maiLuo.contains("小肠"))
                                                        && !maiLuoRatio.contains("肝") && !maiLuo.contains("肝")
                                                        && !maiLuoRatio.contains("脾") && !maiLuo.contains("脾")
                                                        && !maiLuoRatio.contains("膀胱") && !maiLuo.contains("膀胱")
                                                        && !maiLuoRatio.contains("胆") && !maiLuo.contains("胆")
                                                        && !maiLuoRatio.contains("肺") && !maiLuo.contains("肺")
                                                        && !maiLuoRatio.contains("肾") && !maiLuo.contains("肾")
                                                        && !maiLuoRatio.contains("十二") && !maiLuo.contains("十二")
                                                        && !maiLuoRatio.contains("任") && !maiLuo.contains("任")
                                                        && !maiLuoRatio.contains("督") && !maiLuo.contains("督")
                                                        && !maiLuoRatio.contains("三焦") && !maiLuo.contains("三焦")
                                                        && !maiLuoRatio.contains("胃") && !maiLuo.contains("胃"))
                                                    ) {
                                                        gongxiaoyaoming.put(hai, new IMV_SIQ());
                                                        findLeaf.put(yaoming, 1);
                                                        gongxiao.put(yaoming, gongxiaoyaoming);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                leaf.put(tempRec, gongxiao);
                            } else {
                                frequencyLeaf.put(tempRec, frequencyLeaf.get(tempRec) + 1);
                            }
                        }
                    }
                }
            }
        }
        return leaf;
    }

    public void weightPrint(String prePrint, Graphics2D g, int AMV_MVS_VSQX
        , int AMV_MVS_VSQY, Font font) {
        g.setFont(font);
        g.drawString(prePrint, AMV_MVS_VSQX, AMV_MVS_VSQY);
    }

    public void heightPrint(String prePrint, Graphics2D g, int AMV_MVS_VSQX
        , int AMV_MVS_VSQY, Font font) {
        g.setFont(font);
        g.drawString(prePrint, AMV_MVS_VSQX, AMV_MVS_VSQY);
    }
}
