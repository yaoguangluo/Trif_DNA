package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYWKBook;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.pheromone.IMV_SQI;
import S_A.pheromone.IMV_SQI_;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dictionary {
    public List<String> dic_list;
    public IMV_SQI dic_map;

    public List<String> txtToList() {
        List<String> temp_list = new ArrayList<>();
        InputStream in = this.getClass().getResourceAsStream("wkxPage.txt");
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

    public IMV_SQI_ listToMap(IMV_SQI_ dic_map, List<String> dic_list) {
        //IMV_SQI dic_map= new IMV_SQI();
        for (int i = 0; i < dic_list.size(); i++) {
            if (dic_list.get(i).contains("病症段落")) {
                String med_name = dic_list.get(i).replace("病症段落", "")
                        + dic_list.get(i + 1) + dic_list.get(i + 2);
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

    public IMV_SQI mapToMap_xj(IMV_SQI dic_map) {
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());

        IMV_SQI dic_xj = new IMV_SQI();
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                    .replace("\n", "");
            Pattern p = Pattern.compile("病症小节(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            int j = 0;
            while (m.find()) {
                String temp = m.group().replace("\\s+", " ")
                        .replace("病症小节", "")
                        .replace("〔", "")
                        .replace("(", "")
                        .replace(" ", "");
                if (!temp.equals("")) {
                    dic_xj.put((med_name.split("病症小节")[0] + j)
                                    .replaceAll("\\s*", "")
                                    .replace("〔", "")
                                    .replace("〕", ":")
                            , temp.replaceAll("\\s*", "")
                                    .replace("〔", "")
                                    .replace("〕", ":"));
                    j++;
                }
            }
        }
        return dic_xj;
    }


    public IMV_SQI mapToMap_zl(IMV_SQI dic_map) {
        IMV_SQI dic_zl = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name)
                    .toString()
                    .replace("\n", "");
            Pattern p = Pattern.compile("〔治疗(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("治疗〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            Pattern p2 = Pattern.compile("处理〕(.*?)〔〔");
            Matcher m2 = p2.matcher(med_text);
            Pattern p3 = Pattern.compile("〔救治(.*?)〔〔");
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
            dic_zl.put(med_name.replaceAll("\\s*", "")
                            .replace("〔", "").replace("〕", ":")
                    , temp.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":"));
        }
        return dic_zl;
    }

    public IMV_SQI mapToMap_zd(IMV_SQI dic_map) {
        IMV_SQI dic_zd = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name)
                    .toString()
                    .replace("\n", "");
            Pattern p = Pattern.compile("〔诊断(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("诊断〕(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            Pattern p2 = Pattern.compile("方法〕(.*?)〔〔");
            Matcher m2 = p2.matcher(med_text);
            Pattern p3 = Pattern.compile("〔诊查(.*?)〔〔");
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
            dic_zd.put(med_name.replaceAll("\\s*", "")
                            .replace("〔", "").replace("〕", ":")
                    , temp.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":"));
        }
        return dic_zd;
    }

    public IMV_SQI mapToMap_bf(IMV_SQI dic_map) {
        IMV_SQI dic_bf = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
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

    public IMV_SQI mapToMap_jy(IMV_SQI dic_map) {
        IMV_SQI dic_jy = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                    .replace("\n", "");
            Pattern p = Pattern.compile("〔教育(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Pattern p1 = Pattern.compile("〔处置(.*?)〔〔");
            Matcher m1 = p1.matcher(med_text);
            String temp = "";
            if (m.find()) {
                temp = m.group(0);
            } else if (m1.find()) {
                temp = m1.group(0);
            }
            dic_jy.put(med_name.replaceAll("\\s*", "")
                            .replace("〔", "").replace("〕", ":")
                    , temp.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":"));
        }
        return dic_jy;
    }

    public IMV_SQI mapToMap_yh(IMV_SQI dic_map) {
        IMV_SQI dic_yh = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
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
                            .replace("〔", "").replace("〕", ":")
                    , temp.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":"));
        }
        return dic_yh;
    }

    public IMV_SQI mapToMap_yf(IMV_SQI dic_map) {
        IMV_SQI dic_yf = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
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
                            .replace("〔", "").replace("〕", ":")
                    , temp.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":"));
        }
        return dic_yf;
    }

    public IMV_SQI mapToMap_yx(IMV_SQI dic_map) {
        IMV_SQI dic_yx = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
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
                            .replace("〔", "").replace("〕", ":")
                    , temp.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":"));
        }
        return dic_yx;
    }

    public IMV_SQI mapToMap_sy(IMV_SQI dic_map) {
        IMV_SQI dic_sy = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
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
                            .replace("〔", "").replace("〕", ":")
                    , temp.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":"));
        }
        return dic_sy;
    }

    public IMV_SQI mapToMap_lc(IMV_SQI dic_map) {
        IMV_SQI dic_lc = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
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

    public IMV_SQI mapToMap_bl(IMV_SQI dic_map) {
        IMV_SQI dic_bl = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
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

    public IMV_SQI mapToMap_wx(IMV_SQI dic_map) {
        IMV_SQI dic_wx = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
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
            Pattern p3 = Pattern.compile("〔注意(.*?)〔〔");
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
            dic_wx.put(med_name.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":")
                    , temp.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":"));
        }
        return dic_wx;
    }

    public IMV_SQI mapToMap_by(IMV_SQI dic_map) {
        IMV_SQI dic_by = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
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
                            .replace("〔", "").replace("〕", ":")
                    , temp.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":"));
        }
        return dic_by;
    }

    public IMV_SQI mapToMap_lx(IMV_SQI dic_map) {
        IMV_SQI dic_lx = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
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

    public IMV_SQI mapToMap_gn(IMV_SQI dic_map) {
        IMV_SQI dic_gn = new IMV_SQI();
        Iterator<String> iter = dic_map.keySet().iterator();
        List<String> copy = new ArrayList<String>();
        while (iter.hasNext())
            copy.add(iter.next());
        for (int i = 0; i < copy.size(); i++) {
            String med_name = copy.get(i);
            String med_text = dic_map.get(med_name).toString()
                    .replace("\n", "");
            Pattern p = Pattern.compile("〔概念(.*?)〔〔");
            Pattern p1 = Pattern.compile("概念〕(.*?)〔〔");
            Pattern p2 = Pattern.compile("解剖〕(.*?)〔〔");
            Pattern p3 = Pattern.compile("〔概述(.*?)〔〔");
            Pattern p4 = Pattern.compile("概述〕(.*?)〔〔");
            Matcher m = p.matcher(med_text);
            Matcher m1 = p1.matcher(med_text);
            Matcher m2 = p2.matcher(med_text);
            Matcher m3 = p3.matcher(med_text);
            Matcher m4 = p4.matcher(med_text);
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
            }
            dic_gn.put(med_name.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":")
                    , temp.replaceAll("\\s*", "")
                            .replace("〔", "")
                            .replace("〕", ":"));
        }
        return dic_gn;
    }
}
