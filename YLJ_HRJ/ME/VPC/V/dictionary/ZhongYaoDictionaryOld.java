package ME.VPC.V.dictionary;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
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
public class ZhongYaoDictionaryOld extends Dictionary_S {
    public List<String> txtToList() {
        dic_list = new ArrayList<>();
        InputStream in = getClass().getResourceAsStream("c.txt");
        DetaBufferedReader cReader = new DetaBufferedReader(DetaInputStreamReader.E(in));
        String ctempString = null;
        while ((ctempString = cReader.readDetaLine()) != null) {
            if (!ctempString.replace(" ", "").equals(""))
                dic_list.add(ctempString);
        }
        cReader.closeDeta();

        in = getClass().getResourceAsStream("本经疏证-清-邹谢.txt");
        cReader = new DetaBufferedReader(DetaInputStreamReader.E(in));
        ctempString = null;
        while ((ctempString = cReader.readDetaLine()) != null) {
            if (!ctempString.replace(" ", "").equals(""))
                dic_list.add(ctempString);
        }
        cReader.closeDeta();

        in = getClass().getResourceAsStream("食疗本草.txt");
        cReader = new DetaBufferedReader(DetaInputStreamReader.E(in));
        ctempString = null;
        while ((ctempString = cReader.readDetaLine()) != null) {
            if (!ctempString.replace(" ", "").equals(""))
                dic_list.add(ctempString);
        }
        cReader.closeDeta();
        return dic_list;
    }

    @SuppressWarnings("unused")
    public IMV_SIQ_ listToMap(List<String> dic_list) {
        dic_map = new IMV_SIQ_();
        for (int i = 0; i < dic_list.size(); i++) {
            if (dic_list.get(i).contains("摘要")) {
                String med_name = dic_list.get(i + 1);
                String med_text = "";
                int j = i;
                while (++j < dic_list.size() && !dic_list.get(j).contains("摘要")
                    && !dic_list.get(j).contains("^^")) {
                    med_text += "\n" + dic_list.get(j);
                }
                dic_map.put(med_name.replaceAll(" ", "").replace("〔", "").replace("〕", ":")
                    , med_text + "〕〕");
            }

            if (dic_list.get(i).contains("^^")) {
                String med_name = dic_list.get(i + 1);
                String med_text = "";
                int j = i;
                while (++j < dic_list.size() && !dic_list.get(j).contains("^^")
                    && !dic_list.get(j).contains("<篇名>")) {
                    med_text += "\n" + dic_list.get(j);
                }
                if (!dic_map.containsKey(med_name.replaceAll(" ", "").replace("〔", "")
                    .replace("〕", ":"))) {
                    dic_map.put(med_name.replaceAll(" ", "").replace("〔", "").replace("〕", ":")
                        , med_text + "〕〕");
                }
            }
            if (dic_list.get(i).contains("<篇名>")) {
                String med_name = dic_list.get(i).replace("<篇名>", "");
                String med_text = "" + med_name;
                med_name = med_name.replaceAll("〈(.*?)〉", "").replaceAll("（(.*?)）", "");
                int j = i;
                while (++j < dic_list.size() && !dic_list.get(j).contains("<篇名>")) {
                    med_text += "\n" + dic_list.get(j);
                }
                if (!dic_map.containsKey(med_name.replaceAll(" ", "").replace("〔", "")
                    .replace("〕", ":"))) {
                    dic_map.put(med_name.replaceAll(" ", "").replace("〔", "").replace("〕", ":")
                        , med_text + "〕〕");
                }
            }
        }
        return dic_map;
    }

    public IMV_SIQ mapToMap_li(IMV_SIQ dic_map) {
        dic_li = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name.trim()).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔利〕(.*?)〔修治〕");
            Pattern p1 = Pattern.compile("功专(.*?)恶");
            Pattern p2 = Pattern.compile("功专(.*?)畏");
            Pattern p3 = Pattern.compile("功专(.*?)反");
            Pattern p4 = Pattern.compile("功专(.*?)卷");
            Pattern p7 = Pattern.compile("功专(.*?)忌");
            Pattern p5 = Pattern.compile("主(.*?)。");
            Pattern p6 = Pattern.compile("内容(.*?)〕〕");
            Matcher m = p.matcher(med_text);
            Matcher m4 = p4.matcher(med_text);
            Matcher m5 = p5.matcher(med_text);
            Matcher m6 = p6.matcher(med_text);
            Matcher m7 = p7.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
                temp = temp.replace("〔修治〕", ".");
            }
            if (m4.find()) {
                String deter = m4.group(0);
                deter = deter.replace("卷", ".");
                Matcher m1 = p1.matcher(deter);
                Matcher m2 = p2.matcher(deter);
                Matcher m3 = p3.matcher(deter);
                if (m1.find()) {
                    temp += m1.group(0);
                    temp = temp.replace("恶", ".");
                } else if (m2.find()) {
                    temp += m2.group(0);
                    temp = temp.replace("畏", ".");
                } else if (m3.find()) {
                    temp += m3.group(0);
                    temp = temp.replace("反", ".");
                } else if (m7.find()) {
                    temp += m7.group(0);
                    temp = temp.replace("忌", ".");
                } else {
                    temp += deter;
                }
            }
            if (temp.equals("")) {
                if (m5.find()) {
                    temp = m5.group(0);
                }
            }
            if (temp.equals("")) {
                if (m6.find()) {
                    temp = m6.group(0);
                }
            }
//later..
            if (!dic_li.containsKey(med_name.replaceAll("\\s*", "").replace("〔", "")
                .replace("〕", ":"))) {
                dic_li.put(med_name.replaceAll("\\s*", "").replace("〔", "")
                    .replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "")
                    .replace("〕", ":"));
            }
        }
        return dic_li;
    }

    @SuppressWarnings("unused")
    public IMV_SIQ mapToMap_hai(IMV_SIQ dic_map) {
        dic_hai = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            if (med_name.contains("何首乌")) {
                int i22 = 0;
                i22 += 1;
            }
            String med_text = dic_map.get(med_name.trim()).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔害〕(.*?)〔利〕");

            Pattern p1 = Pattern.compile("恶(.*?)〔利〕");
            Pattern p2 = Pattern.compile("畏(.*?)〔利〕");
            Pattern p3 = Pattern.compile("反(.*?)〔利〕");
            Pattern p4 = Pattern.compile("忌(.*?)〔利〕");
            Pattern p5 = Pattern.compile("恶(.*?)卷");
            Pattern p6 = Pattern.compile("畏(.*?)卷");
            Pattern p7 = Pattern.compile("反(.*?)卷");
            Pattern p8 = Pattern.compile("忌(.*?)卷");
            Pattern p9 = Pattern.compile("恶(.*?)）");
            Pattern p10 = Pattern.compile("有(.*?)忌");
            Matcher m = p.matcher(med_text);
            Matcher m1 = p1.matcher(med_text);
            Matcher m2 = p2.matcher(med_text);
            Matcher m3 = p3.matcher(med_text);
            Matcher m4 = p4.matcher(med_text);
            Matcher m5 = p5.matcher(med_text);
            Matcher m6 = p6.matcher(med_text);
            Matcher m7 = p7.matcher(med_text);
            Matcher m8 = p8.matcher(med_text);
            Matcher m9 = p9.matcher(med_text);
            Matcher m10 = p10.matcher(med_text);

            String temp = "";
            if (m.find()) {
                temp = m.group(0);
                temp = temp.replace("〔利〕", ".");
            }
            if (m1.find()) {
                String temp_s = m1.group(0);
                temp_s = temp_s.replace("〔利〕", ".");
                temp += temp_s;
            } else if (m2.find()) {
                String temp_s = m2.group(0);
                temp_s = temp_s.replace("〔利〕", ".");
                temp += temp_s;
            } else if (m3.find()) {
                String temp_s = m3.group(0);
                temp_s = temp_s.replace("〔利〕", ".");
                temp += temp_s;
            } else if (m4.find()) {
                String temp_s = m4.group(0);
                temp_s = temp_s.replace("〔利〕", ".");
                temp += temp_s;
            } else if (m5.find()) {
                String temp_s = m5.group(0);
                Pattern p55 = Pattern.compile("恶(.*?)。");
                Matcher m55 = p55.matcher(temp_s);
                if (m55.find()) {
                    temp += m55.group(0);
                } else {
                    temp += temp_s.replace("卷", ".");
                }
            } else if (m6.find()) {
                String temp_s = m6.group(0);
                Pattern p55 = Pattern.compile("畏(.*?)。");
                Matcher m55 = p55.matcher(temp_s);
                if (m55.find()) {
                    temp += m55.group(0);
                } else {
                    temp += temp_s.replace("卷", ".");
                }
            } else if (m7.find()) {
                String temp_s = m7.group(0);
                Pattern p55 = Pattern.compile("反(.*?)。");
                Matcher m55 = p55.matcher(temp_s);
                if (m55.find()) {
                    temp += m55.group(0);
                } else {
                    temp += temp_s.replace("卷", ".");
                }
            } else if (m8.find()) {
                String temp_s = m8.group(0);
                Pattern p55 = Pattern.compile("忌(.*?)。");
                Matcher m55 = p55.matcher(temp_s);
                if (m55.find()) {
                    temp += m55.group(0);
                } else {
                    temp += temp_s.replace("卷", ".");
                }
            } else if (m10.find()) {
                String temp_s = m10.group(0);
                Pattern p55 = Pattern.compile("有(.*?)忌。");
                Matcher m55 = p55.matcher(temp_s);
                if (m55.find()) {
                    temp += m55.group(0);
                } else {
                    temp += temp_s.replace("卷", ".");
                }
            } else {
            }

            if (temp.equals("")) {
                if (m9.find()) {
                    temp = m9.group(0);
                }
            }
            if (!dic_hai.containsKey(med_name.replaceAll("\\s*", "").replace("〔", "")
                .replace("〕", ":"))) {
                dic_hai.put(med_name.replaceAll("\\s*", "").replace("〔", "")
                    .replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "")
                    .replace("〕", ":"));

            }
        }
        return dic_hai;
    }

    public IMV_SIQ mapToMap_xz(IMV_SIQ dic_map) {
        dic_xz = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name.trim()).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔修治〕(.*?)崇源");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("〔修治〕(.*?)经解");
            Matcher m1 = p1.matcher(med_text);
            Pattern p2 = Pattern.compile("〔修治〕(.*?)卷");
            Matcher m2 = p2.matcher(med_text);
            Pattern p3 = Pattern.compile("〔修治〕(.*?)〕〕");
            Matcher m3 = p3.matcher(med_text);

            Pattern p4 = Pattern.compile("\\#\\#(.*?)〕〕");
            Matcher m4 = p4.matcher(med_text);

            String temp = "";
            if (m.find()) {
                temp = m.group(0);
                temp = temp.replace("崇源", ".");
            } else if (m1.find()) {
                temp += m1.group(0);
                temp = temp.replace("经解", ".");
            } else if (m2.find()) {
                temp = m2.group(0);
            } else if (m3.find()) {
                temp = m3.group(0);
            } else if (m4.find()) {
                temp = m4.group(0);
            }
            if (!dic_xz.containsKey(med_name.replaceAll("\\s*", "").replace("〔", "")
                .replace("〕", ":"))) {
                dic_xz.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
                    , temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
            }
        }
        return dic_xz;
    }

    public IMV_SIQ mapToMap_zf(IMV_SIQ dic_map) {
        dic_zf = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("制方(.*?)卷");
            //med_text.m.matches("/〔利〕*〔修治〕/");
            Matcher m = p.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0).replace("卷", "");
            }
            dic_zf.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
                , temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
        }
        return dic_zf;
    }

    public IMV_SIQ mapToMap_cj(IMV_SIQ dic_map) {
        dic_cj = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("常见药品(.*?)药品末尾");
            Matcher m = p.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0).replace("药品末尾", "");
            }
            dic_cj.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
                , temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
        }
        return dic_cj;
    }


    public IMV_SIQ mapToMap_jj(IMV_SIQ dic_map) {
        dic_jj = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("经解(.*?)$");
            Matcher m = p.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            }
            dic_jj.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
                , temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
        }
        return dic_jj;
    }

    public IMV_SIQ mapToMap_cy(IMV_SIQ dic_map) {
        dic_cy = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("崇源(.*?)经解");
            Pattern p1 = Pattern.compile("崇源(.*?)$");
            Matcher m = p.matcher(med_text);
            Matcher m1 = p1.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
                temp = temp.replace("经解", ".");
            } else if (m1.find()) {
                temp += m1.group(0);
            }
            dic_cy.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
                , temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
        }
        return dic_cy;
    }

    public IMV_SIQ mapToMap_ya(IMV_SIQ dic_map) {
        dic_ya = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("按(^：)(.*?)〔利〕");
            Pattern p1 = Pattern.compile("愚按：(.*?)经解");
            Pattern p2 = Pattern.compile("愚按：(.*?)$");
            Matcher m = p.matcher(med_text);
            Matcher m1 = p1.matcher(med_text);
            Matcher m2 = p2.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
                temp = temp.replace("〔利〕", ".");
            }
            if (m1.find()) {
                temp += m1.group(0);
                temp = temp.replace("经解", ".");
            } else if (m2.find()) {
                temp = m2.group(0);
                temp = temp.replace("摘要", ".");
            } else {
            }
            dic_ya.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
                , temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
        }
        return dic_ya;
    }

    public IMV_SIQ mapToMap_jm(IMV_SIQ dic_map) {
        dic_jm = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("入(.*?)经");
            Matcher m = p.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            }

            dic_jm.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
                , temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
        }
        return dic_jm;
    }

    public IMV_SIQ mapToMap_xw(IMV_SIQ dic_map) {
        dic_xw = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("味(.*?)入");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("味(.*?)。");
            Matcher m1 = p1.matcher(med_text);
            Pattern p2 = Pattern.compile("味(.*?)主");
            Matcher m2 = p2.matcher(med_text);

            Pattern p3 = Pattern.compile("〈(.*?)〉");
            Matcher m3 = p3.matcher(med_text.replace("<篇名>", ""));

            String temp = "";
            if (m.find()) {
                temp = m.group(0).replace("入", "");
            }
            if (m1.find()) {
                temp = m1.group(0).replace("。", "");
            }
            if (temp.equals("")) {
                if (m2.find()) {
                    temp = m2.group(0).replace("主", "");
                }
            }

            if (temp.equals("")) {
                if (m3.find()) {
                    temp = m3.group(0);
                }
            }
            if (!dic_xw.containsKey(med_name.replaceAll("\\s*", "").replace("〔", "")
                .replace("〕", ":"))) {
                dic_xw.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
                    , temp.replace("经络", "").replaceAll("\\s*", "").replace("〔", "")
                        .replace("〕", ":"));

            }
        }
        return dic_xw;
    }

    public IMV_SIQ mapToMap_yl(IMV_SIQ dic_map, IMV_SIQ dic_xw,
                               IMV_SIQ dic_li, IMV_SIQ dic_xz
        , IMV_SIQ dic_jm) {
        dic_yl = new IMV_SIQ();
        InputStream in = getClass().getResourceAsStream("中药学第九版最全表格(含临床应用).txt");
        DetaBufferedReader cReader = new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF-8"));
        String ctempString = null;
        String temp = "";
        cReader.readDetaLine();
        while ((ctempString = cReader.readDetaLine()) != null) {
            if (ctempString.replace(" ", "").equals("")) {
                if (!temp.equals("")) {
                    String[] ts = temp.replace("\r", "").replace("\n", "").replace("\t", "").split("\\^");
                    if (!dic_map.containsKey(ts[0])) {
                        dic_map.put(ts[0], temp);
                    } else {
                        dic_map.put(ts[0], dic_map.get(ts[0]) + "人卫九" + temp);
                    }

                    if (!dic_xw.containsKey(ts[0])) {
                        dic_xw.put(ts[0], ts[1]);
                    } else {
                        dic_xw.put(ts[0], dic_xw.get(ts[0]) + "人卫九" + ts[1]);
                    }

                    String li = ts[3];
                    for (int i = 5; i < ts.length; i++) {
                        li += ts[i];
                    }
                    if (!dic_li.containsKey(ts[0])) {
                        dic_li.put(ts[0], li);
                    } else {
                        dic_li.put(ts[0], dic_li.get(ts[0]) + "人卫九" + li);
                    }
                    if (!dic_jm.containsKey(ts[0])) {
                        dic_jm.put(ts[0], ts[2]);
                    } else {
                        dic_jm.put(ts[0], dic_jm.get(ts[0]) + "人卫九" + ts[2]);
                    }
                    if (!dic_yl.containsKey(ts[0])) {
                        dic_yl.put(ts[0], ts[4]);
                    } else {
                        dic_yl.put(ts[0], dic_yl.get(ts[0]) + "人卫九" + li);
                    }
                    temp = "";
                }
            }
            temp += ctempString;
        }
        cReader.closeDeta();
        return dic_yl;
    }

    public IMV_SIQ mapToMap_ym(IMV_SIQ dic_map) {
        dic_ym = new IMV_SIQ();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext()) {
            String string = iter.next();
            copy.add(string);
            dic_ym.put(string.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
                , string.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
        }
        return dic_ym;
    }
}