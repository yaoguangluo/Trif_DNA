package ME.VPC.V.dictionary;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.SVQ.stable.S_File;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;
import YLJ_HRJ.ME.VPC.S.books.BookIndex;

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
public class XynkDictionary extends TxtDictionary {
    public List<String> txtToList() {
        temp_list = new ArrayList<>();
        InputStream in = new BookIndex().getClass().getResourceAsStream(S_File.k_txt);
        DetaBufferedReader cReader = new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF-8"));
        String ctempString = null;
        while ((ctempString = cReader.readDetaLine()) != null) {
            if (!ctempString.replace(" ", "").equals("")) {
                if (ctempString.contains("〔") && ctempString.contains("〕")) {
                    ctempString = "〔〔" + ctempString;
                }
                temp_list.add(ctempString);
            }
        }
        cReader.closeDeta();
        return temp_list;
    }

    public IMV_SIQ_ listToMap(List<String> dic_list) {
        dic_map = new IMV_SIQ_();
        for (int i = 0; i < dic_list.size(); i++) {
            if (dic_list.get(i).contains("病症段落")) {
                String med_name = dic_list.get(i).replace("病症段落", "") +
                    (dic_list.get(i + 1).isEmpty() ? dic_list.get(i + 2) : dic_list.get(i + 1));
                String med_text = "" + med_name;
                int j = i;
                while (++j < dic_list.size() && !(dic_list.get(j).contains("病症段落"))) {
                    med_text += dic_list.get(j);
                    //j+=1;
                }
                dic_map.put(med_name.replaceAll("\\s*", "")
                        .replace("〔", "").replace("〕", ":")
                    , (med_text + "〔〔").replace("\\s+", " "));
            }
        }
        return dic_map;
    }

    public IMV_SIQ_ mapToMap_zl(IMV_SIQ dic_map) {
        dic_zl = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔治疗(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("治疗〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            Pattern p2 = Pattern.compile("处理〕(.*?)〔〔");
            Matcher m2 = p2.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            } else if (m2.find()) {
                temp = m2.group(0);
            }
            dic_zl.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "").replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "").replace("〕", ":"));
        }
        return dic_zl;
    }

    public IMV_SIQ_ mapToMap_zd(IMV_SIQ dic_map) {
        dic_zd = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔诊断(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("诊断〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            Pattern p2 = Pattern.compile("方法〕(.*?)〔〔");
            Matcher m2 = p2.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            } else if (m2.find()) {
                temp = m2.group(0);
            }
            dic_zd.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_zd;
    }

    public IMV_SIQ_ mapToMap_bf(IMV_SIQ dic_map) {
        dic_bf = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔并发(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("并发症〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            }
            dic_bf.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_bf;
    }

    public IMV_SIQ_ mapToMap_jy(IMV_SIQ dic_map) {
        dic_jy = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔教育(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            }
            dic_jy.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_jy;
    }

    public IMV_SIQ_ mapToMap_yh(IMV_SIQ dic_map) {
        dic_yh = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔预后(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("预后〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            }
            dic_yh.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_yh;
    }

    public IMV_SIQ_ mapToMap_bl(IMV_SIQ dic_map) {
        dic_bl = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔病理(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("病理〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            Pattern p2 = Pattern.compile("分类〕(.*?)〔〔");
            Matcher m2 = p2.matcher(med_text);
            Pattern p3 = Pattern.compile("类型〕(.*?)〔〔");
            Matcher m3 = p3.matcher(med_text);
            Pattern p4 = Pattern.compile("生理〕(.*?)〔〔");
            Matcher m4 = p4.matcher(med_text);
            Pattern p5 = Pattern.compile("种类〕(.*?)〔〔");
            Matcher m5 = p5.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            } else if (m2.find()) {
                temp = m2.group(0);
            } else if (m3.find()) {
                temp = m3.group(0);
            } else if (m4.find()) {
                temp = m4.group(0);
            } else if (m5.find()) {
                temp = m5.group(0);
            }
            dic_bl.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_bl;
    }

    public IMV_SIQ_ mapToMap_wx(IMV_SIQ dic_map) {
        dic_wx = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔危险(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("因素〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            Pattern p2 = Pattern.compile("反应〕(.*?)〔〔");
            Matcher m2 = p2.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            } else if (m2.find()) {
                temp = m2.group(0);
            }
            dic_wx.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "")
                    .replace("〕", ":"));
        }
        return dic_wx;
    }

    public IMV_SIQ_ mapToMap_gn(IMV_SIQ dic_map) {
        dic_gn = new IMV_SIQ_();
        iter = dic_map.keySet().iterator();
        copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                .replace("\n", "");
            Pattern p = Pattern.compile("〔概念(.*?)〔〔");
            Pattern p1 = Pattern.compile("概念〕(.*?)〔〔");
            Pattern p2 = Pattern.compile("解剖〕(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Matcher m1 = p1.matcher(med_text);
            Matcher m2 = p2.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            } else if (m2.find()) {
                temp = m2.group(0);
            }
            dic_gn.put(med_name.replaceAll("\\s*", "")
                    .replace("〔", "").replace("〕", ":")
                , temp.replaceAll("\\s*", "")
                    .replace("〔", "").replace("〕", ":"));
        }
        return dic_gn;
    }
}