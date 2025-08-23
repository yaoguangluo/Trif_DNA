package ME.VPC.V.dictionary;

import S_A.pheromone.IMV_SIQ_;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class TxtDictionary extends Dictionary_S {
    public IMV_SIQ_ mapToMap_yf(IMV_SIQ_ dic_map) {
        dic_yf = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔预防(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("预防〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            }
            dic_yf.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_yf;
    }

    public IMV_SIQ_ mapToMap_yx(IMV_SIQ_ dic_map) {
        dic_yx = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔影像(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            }
            dic_yx.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_yx;
    }

    public IMV_SIQ_ mapToMap_sy(IMV_SIQ_ dic_map) {
        dic_sy = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔实验(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("检查〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            }
            dic_sy.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_sy;
    }

    public IMV_SIQ_ mapToMap_lc(IMV_SIQ_ dic_map) {
        dic_lc = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔临床(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("临床〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            }
            dic_lc.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_lc;
    }

    public IMV_SIQ_ mapToMap_by(IMV_SIQ_ dic_map) {
        dic_by = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔病因(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("病因〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            Pattern p2 = Pattern.compile("〔发病(.*?)〔〔");
            Matcher m2 = p2.matcher(med_text);
            Pattern p3 = Pattern.compile("机制〕(.*?)〔〔");
            Matcher m3 = p3.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            } else if (m2.find()) {
                temp = m2.group(0);
            } else if (m3.find()) {
                temp = m3.group(0);
            }
            dic_by.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_by;
    }

    public IMV_SIQ_ mapToMap_lx(IMV_SIQ_ dic_map) {
        dic_lx = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔流行(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            }
            dic_lx.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_lx;
    }
}