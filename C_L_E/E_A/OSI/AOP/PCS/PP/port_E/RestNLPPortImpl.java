package E_A.OSI.AOP.PCS.PP.port_E;

import A_V.ica.InitBehaviorICAKernel;
import ME.VPC.M.app.App;
import M_V.MSV.OSQ.sets.DetaDouble;
import P_V.PEQ.AMV.ECS.test.ANNTest;
import P_V.PEQ.AMV.ECS.test.DNNTest;
import P_V.PEQ.AMV.ECS.test.RNN_IDETest;
import P_V.PEQ.OPM.VEC.test.SuccessICATest;
import S_A.SVQ.stable.S_Maps;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_S_;
import S_A.pheromone.IMV_SIQ_X_;
import U_V.ESU.sort.Quick9DLYGWithDoubleString_ESU;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//import OSI.OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
//import OSM.shell.E_pl_XA_E;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestNLPPortImpl {// implements RestLoginPort {

    public static IMV_SIQ dataWS(String string, App NE) {
        ////20230106-System.out.printntln(string);
        //List<String> sets= _A.parserMixedString(string);
        List<String> sets = NE.app_S._A.parserMixedString(string);
        IMV_SIQ output = new IMV_SIQ();
        String ws = "";
        Iterator<String> iterator = sets.iterator();
        while (iterator.hasNext()) {
            String token = iterator.next();
            ws += token + " ";
        }
        try {
            output.put(URLEncoder.encode("ws", "UTF-8")
                , URLEncoder.encode(ws, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    public static IMV_SIQ dataCX(String string, App NE) {
        ////20230106-System.out.printntln(string);
        IMV_SIQ pos = NE.app_S._A.getPosCnToCn();
        List<String> sets = NE.app_S._A.parserString(string);
        Iterator<String> iterator = sets.iterator();
        String cx = "";
        while (iterator.hasNext()) {
            String token = iterator.next();
            if (pos.containsKey(token)) {
                cx += token + "/" + pos.get(token) + " ";
            }
        }
        IMV_SIQ outputMap = new IMV_SIQ();
        try {
            outputMap.put(URLEncoder.encode("cx", "UTF-8")
                , URLEncoder.encode(cx, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return outputMap;
    }

    public static IMV_SIQ dataCY(String string, App NE) {
        ////20230106-System.out.printntln(string);
        //LenovoInit lenovoInit = new LenovoInit();
        NE.app_S.lenovoInit.IV_Exclude_A(string, NE);
        IMV_SIQ_X_ environmentSampleMap = NE.app_S.lenovoInit
            .getEnvironmentInit().getEmotionSampleMap();
        IMV_SIQ lenovo = NE.app_S.lenovoInit.getSensingMap().getLenovoMap();
        IMV_SIQ output = new IMV_SIQ();
        List<String> ciyi = new LinkedList<>();
        ciyi.add("\r\n环    境：");
        Iterator<String> Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            EmotionSample emotionSample = environmentSampleMap.get_S(word);//注意空指针。
            if (null != emotionSample.getDistinction()) {
                if (lenovo.containsKey(emotionSample.getDistinction())) {
                    ////20230106-System.out.printnt(lenovo
                    // .get(emotionSample.getDistinction()).toString()+" ");
                    ciyi.add(lenovo.getString(emotionSample.getDistinction()) + " ");
                } else {
                    ////20230106-System.out.printnt(emotionSample.getDistinction()+" ");
                    ciyi.add(emotionSample.getDistinction() + " ");
                }
            }
        }
        ciyi.add("\r\n动机联想");
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            EmotionSample emotionSample = environmentSampleMap.get_S(word);
            if (null != emotionSample.getMotivation()) {
                if (lenovo.containsKey(emotionSample.getMotivation())) {
                    ////20230106-System.out.printnt(lenovo.get(
                    // emotionSample.getMotivation()).toString()+" ");
                    ciyi.add(lenovo.getString(emotionSample.getMotivation()) + " ");
                } else {
                    ////20230106-System.out.printnt(emotionSample.getMotivation()+" ");
                    ciyi.add(emotionSample.getMotivation() + " ");
                }
            }
        }
        ciyi.add("\r\n倾向探索");
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            EmotionSample emotionSample = environmentSampleMap.get_S(word);
            if (null != emotionSample.getTrending()) {
                if (lenovo.containsKey(emotionSample.getTrending())) {
                    ciyi.add(lenovo.getString(emotionSample.getTrending()) + " ");
                } else {
                    ciyi.add(emotionSample.getTrending() + " ");
                }
            }
        }
        ciyi.add("\r\n决策挖掘");
        Iterator = environmentSampleMap.keySet().iterator();
        while (Iterator.hasNext()) {
            String word = Iterator.next();
            EmotionSample emotionSample = environmentSampleMap.get_S(word);
            if (null != emotionSample.getPrediction()) {
                if (lenovo.containsKey(emotionSample.getPrediction())) {
                    ciyi.add(lenovo.get(emotionSample.getPrediction()).toString() + " ");
                } else {
                    ciyi.add(emotionSample.getPrediction() + " ");
                }
            }
        }
        String cy = "";
        Iterator<String> iterator = ciyi.iterator();
        while (iterator.hasNext()) {
            cy += iterator.next() + " ";
        }
        try {
            output.put(URLEncoder.encode("cy", "UTF-8")
                , URLEncoder.encode(cy, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    public static IMV_SIQ dataCG(String string, App NE) {
        ////20230106-System.out.printntln(string);
        // SensingTest sensingTest = _A.getSensingTest();
        DNNTest dNNTest = NE.app_S.dNNTest;
        ANNTest aNNTest = NE.app_S.aNNTest;
        RNN_IDETest rNN_IDETest = NE.app_S.rNN_IDETest;
        String[][] ann = aNNTest.getANNMatrix(string, NE);
        String[][] dnn = dNNTest.getDNNMatrix(ann, string, NE);
        IMV_SIQ output = new IMV_SIQ();
        List<String> cigan = new LinkedList<>();
        Here:
        for (int i = 0; i < dnn.length; i++) {
            double dnn_lwa = 0.0;
            if (null == dnn[i][3]) {
                continue Here;
            }
            dnn_lwa = DetaDouble.parseDouble(dnn[i][3]);
            if (dnn_lwa > 0) {
                String line = "";
                line += ann[i][0] + ":";
                line += dnn[i][3] + ":";
                cigan.add(line);
            }
        }
        String[][] value = new String[cigan.size()][2];
        double[] score_code = new double[cigan.size()];
        String[] score = new String[cigan.size()];

        Iterator<String> iterator = cigan.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            String iteratorString = iterator.next();
//			value[count][0]= iteratorString.split(":")[0];
//			value[count++][1]= iteratorString.split(":")[1];
            score[count] = iteratorString.split(":")[0];
            score_code[count++] = Double.valueOf(iteratorString.split(":")[1]);
        }
        //value= new Quick_6D_luoyaoguang_Sort().sort(value);
        //value= new Quick_7D_luoyaoguang_Sort().sort(value);
        new Quick9DLYGWithDoubleString_ESU().sort(score_code, score);

        String cg = "词名/中心";
        cg += "\r\n";
        for (int i = 0; i < value.length; i++) {
            cg += score[i] + ":" + score_code[i] + "\r\n";
        }
        try {
            output.put(URLEncoder.encode("cg", "UTF-8"), URLEncoder.encode(cg, "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }

    public static IMV_SIQ dataCJ(String string, App NE) {
        ////20230106-System.out.printntln(string);
        double[][] kernel = new double[1][];
        InitBehaviorICAKernel InitBehaviorICAKernel = new InitBehaviorICAKernel();
        kernel[0] = InitBehaviorICAKernel.getBehaviorICAKernel(string, NE);
        SuccessICATest successICATest = new SuccessICATest();
        successICATest.IQ_KernelCNN(kernel);
        IMV_SIQ output = new IMV_SIQ();
        String cj = "\r\n";
        Iterator<String> iterator = InitBehaviorICAKernel.getForRestReturn().iterator();
        while (iterator.hasNext()) {
            cj += iterator.next() + "\r\n";
        }
        try {
            output.put(URLEncoder.encode("cj", "UTF-8")
                , URLEncoder.encode(cj, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    public static IMV_SIQ dataCL(String string, App NE) {
        return null;
    }

    public synchronized static Object dataXX(String string, App NE) {
        ////20230106-System.out.printntln(string);
        IMV_SIQ outputMap;
        try {
            IMV_SIQ pos = NE.app_S._A.getPosCnToCn();
            IMV_SIQ studyPos = NE.app_S._A.getStudyPos();
            List<String> sets = NE.app_S._A.parserString(string);
            Iterator<String> iterator = sets.iterator();
            String xx = "";
            String pres = "";
            String study = "";
            String posStudy = "";
            while (iterator.hasNext()) {
                String token = iterator.next();
                if (!pos.containsKey(token)) {
                    xx += pres + "(" + token + ")";
                    xx += "\r\n";
                    //ApplicationBoot.luoyaoguang.study(token);
                } else {
                    pres = token + "/" + pos.get(token) + " ";
                }
                //record
                int find = 0;
                if (pos.containsKey(token)) {
                    String posToken = pos.getString(token);
                    if (pos.containsKey(study)) {
                        if (study.length() == 1 && token.length() == 1
                            && posStudy.equals(posToken)) {
                            //write
                            if (!pos.containsKey(study + token)) {
                                if (studyPos.containsKey(study)
                                    && studyPos.containsKey(token)) {
                                    if (studyPos.getString(study).contains("助")
                                        || studyPos.getString(study).contains("量")
                                        || studyPos.getString(study).contains("时")
                                        || studyPos.getString(study).contains("连")
                                        || studyPos.getString(study).contains("介")) {
                                        NE.app_S._A.studyNewWord(study, token, posStudy);
                                        String stringFile
                                            = "C:/Users/Administrator/git/Deta_Parser/"
                                            + "wordSegment/org/tinos/ortho/fhmm/imp/poscc.lyg";
                                        FileOutputStream fileOutputStream
                                            = null;
                                        fileOutputStream = new FileOutputStream(stringFile, true);
                                        OutputStreamWriter fileWriter
                                            = new OutputStreamWriter(fileOutputStream, "UTF-8");
                                        fileWriter.write("\r\n" + study + token + "/" + posStudy);
                                        fileWriter.flush();
                                        fileWriter.close();
                                        studyPos.put(study + token, posStudy);
                                        posToken = "";
                                        token = "";
                                    }
                                }
                                pos.put(study + token, posStudy);
                            }
                        }
                    }
                    find = 1;
                    posStudy = posToken.toString();
                }
                study = token;
                if (find == 0) {
                    posStudy = "";
                }
            }
            outputMap = new IMV_SIQ();
            outputMap.put(URLEncoder.encode("xx", "UTF-8")
                , URLEncoder.encode(xx, "UTF-8"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return outputMap;
    }

    public static Object dataHF(String string, App NE) {
        ////20230106-System.out.printntln(string);
        List<String> sets = NE.app_S._A.parserMixedString(string);
        IMV_SIQ output = new IMV_SIQ();
        String hf = "";
        Iterator<String> iterator = sets.iterator();
        while (iterator.hasNext()) {
            hf += iterator.next() + " ";
        }
        try {
            output.put(URLEncoder.encode("hf", "UTF-8"), URLEncoder.encode(hf, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    public static Object dataCP(String string, App NE) {
        List<String> sets = NE.app_S._A.parserMixedString(string);
        //Map<Integer, WordFrequency> fwa= AE_X_Map.getWordFrequencyByReturnSortMap(sets);
        //Map<Integer, WordFrequency> fwa= new AE_X_Map()
        // .getWordFrequencyByReturnSortMap(sets);
        IMV_SIQ_S_ fwa = NE.app_S._A.getWordFrequencyByReturnSortMap(sets, NE);
        IMV_SIQ output = new IMV_SIQ();
        String cp = "";
        for (int i = fwa.size() - 1; i >= 0; i--) {
            cp += fwa.getW(i).get_word() + ":" + fwa.getW(i).get_frequency() + "----";
        }
        try {
            output.put(URLEncoder.encode("cp", "UTF-8")
                , URLEncoder.encode(cp, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    public static Object dataZF(String string, App NE) {
        ////20230106-System.out.printntln(string);
        List<String> sets = NE.app_S._A.parserMixedString(string);
        IMV_SIQ pos = NE.app_S._A.getPosCnToCn();
        String zf = "";
        Iterator<String> iterator = sets.iterator();
        double mingCi = 0.0;
        double dongCi = 0.0;
        double mingCiDuo = 0.0;
        double dongCiDuo = 0.0;
        double importantCiDuo = 0.0;
        double importantCi = 0.0;
        double unimportantCi = 0.0;
        double unimportantCiDuo = 0.0;//有意思吗 当年联想拆开
        double danCi = 0.0;
        double duoCi = 0.0;
        double sanCi = 0.0;
        double siCi = 0.0;
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if (temp.length() > 3) {
                siCi += 1;
            } else if (temp.length() > 2) {
                sanCi += 1;
            } else if (temp.length() > 1) {
                duoCi += 1;
            } else {
                danCi += 1;
            }
            if (pos.containsKey(temp)) {
                if (S_Maps.mingCi.containsKey(temp)) {
                    mingCi += 1;
                    if (temp.length() > 1) {
                        mingCiDuo += 1;
                    }
                } else if (S_Maps.dongCi.containsKey(temp)) {
                    dongCi += 1;
                    if (temp.length() > 1) {
                        dongCiDuo += 1;
                    }
                } else if (S_Maps.xingRongCi.containsKey(temp)
                    || S_Maps.weiCi.containsKey(temp)
                    || S_Maps.fuCi.containsKey(temp)) {
                    importantCi += 1;
                    if (temp.length() > 1) {
                        importantCiDuo += 1;
                    }
                } else {
                    unimportantCi += 1;
                    if (temp.length() > 1) {
                        unimportantCiDuo += 1;
                    }
                }
            }
        }
        zf += "参考属性:" + "\r\n";
        zf += "定义:" + mingCi;
        zf += "状词:" + dongCi;
        zf += "修饰:" + importantCi;
        zf += "点缀:" + unimportantCi;
        zf += "高级定义:" + mingCiDuo;
        zf += "高级状词:" + dongCiDuo;
        zf += "高级修饰:" + importantCiDuo;
        zf += "高级点缀:" + unimportantCiDuo;
        zf += "\r\n";
        zf += "重要指数:" + "\r\n";
        double pca = (mingCi + dongCi + importantCi);
        double zy = (mingCi + dongCi) / pca;
        zf += zy + "\r\n";

        zf += "散文艺术:" + "\r\n";
        double sy = (0 + importantCi) / pca;
        zf += sy + "\r\n";

        zf += "叙述艺术:" + "\r\n";
        double xs = (0 + dongCi) / pca;
        zf += xs + "\r\n";

        zf += "议论艺术:" + "\r\n";
        double yl = (0 + mingCi) / pca;
        zf += yl + "\r\n";

        zf += "分析能力:" + "\r\n";
        double fx = (0 + unimportantCi) / (1 + pca + unimportantCi);
        zf += fx + "\r\n";

        zf += "学习能力:" + "\r\n";
        double xx = (0 + duoCi + sanCi + siCi) / (1 + danCi + duoCi + sanCi + siCi);
        zf += xx + "\r\n";

        zf += "文学造诣:" + "\r\n";
        double level = pca / (pca + unimportantCi);
        zf += level + "\r\n";

        zf += "评价:" + "\r\n";
        String pj = "这段文章主题" + (zy < 0.20 ? "一般" : (zy < 0.30 ? "良好"
            : (zy < 0.40 ? "优秀" : (zy < 0.65 ? "卓越" : "无与伦比")))) + ";";
        pj += "抒情" + (sy < 0.20 ? "一般" : (sy < 0.30 ? "良好" : (sy < 0.40 ? "优秀"
            : (sy < 0.65 ? "卓越" : "无与伦比")))) + ";";
        pj += "刻画" + (xs < 0.20 ? "一般" : (xs < 0.30 ? "良好" : (xs < 0.40 ? "优秀"
            : (xs < 0.65 ? "卓越" : "无与伦比")))) + ";";
        pj += "解释" + (yl < 0.20 ? "一般" : (yl < 0.30 ? "良好" : (yl < 0.40 ? "优秀"
            : (yl < 0.65 ? "卓越" : "无与伦比")))) + ";";
        pj += "组织" + (fx < 0.20 ? "一般" : (fx < 0.30 ? "良好" : (fx < 0.40 ? "优秀"
            : (fx < 0.65 ? "卓越" : "无与伦比")))) + ";";
        pj += "教育水平" + (xx < 0.20 ? "一般" : (xx < 0.30 ? "良好" : (xx < 0.40 ? "优秀"
            : (xx < 0.65 ? "卓越" : "无与伦比")))) + ";";
        pj += "文学修养" + (level < 0.20 ? "一般" : (level < 0.30 ? "良好" : (level < 0.40 ? "优秀"
            : (level < 0.65 ? "卓越" : "无与伦比")))) + ";";
        zf += pj + "\r\n";
        IMV_SIQ outputMap = new IMV_SIQ();
        try {
            outputMap.put(URLEncoder.encode("zf", "UTF-8")
                , URLEncoder.encode(zf, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return outputMap;
    }

    public static Object dataXL(String string, App NE) {
        ////20230106-System.out.printntln(string);
        ANNTest aNNTest = new ANNTest();
        String[][] ann = aNNTest.getANNMatrix(string, NE);
        IMV_SIQ output = new IMV_SIQ();
        String xl = "词名/情感/动机/词权/持续/趋势/预测/猜想/意识/";
        xl += "\r\n";
        for (int i = 0; i < ann.length; i++) {
            if (ann[i].length > 7) {
                xl += ann[i][0] + "/";
                for (int j = 7; j < ann[i].length; j++) {
                    xl += ann[i][j] + "/";
                }
            }
            xl += "\r\n";
        }
        try {
            output.put(URLEncoder.encode("xl", "UTF-8")
                , URLEncoder.encode(xl, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    public static Object dataRN(String string, App NE) {
        //RNN_IDETest rNN_IDETest = new RNN_IDETest();
        String[][] rnn = NE.app_S.rNN_IDETest.getIDEMatrixExclude_A(string, NE);
        IMV_SIQ output = new IMV_SIQ();
        String rn = "词名/pos距离/covex距离/euclid距离";
        rn += "\r\n";
        for (int i = 0; i < rnn.length; i++) {
            for (int j = 0; j < rnn[i].length; j++) {
                rn += rnn[i][j] + "/";
            }
            rn += "\r\n";
        }
        try {
            output.put(URLEncoder.encode("rn", "UTF-8")
                , URLEncoder.encode(rn, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return output;
    }

    @SuppressWarnings("unused")
    public static Object dataSB(int[][][] rgb, App NE) {
        List<String> sets = NE.app_S._A.parserMixedString("");
        IMV_SIQ output = new IMV_SIQ();
        String yl = NE.app_S.appConfig.pLShellJPanel.getStringFromStringBuilder();
        try {
            output.put(URLEncoder.encode("yl", "UTF-8")
                , URLEncoder.encode(yl, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        //output.put(URLEncoder.encode("yl", "UTF-8")
        // , URLEncoder.encode("罗瑶光", "UTF-8"));
        return output;
    }

    @SuppressWarnings("unused")
    public static Object dataYL(String string, App NE) {
        ////20230106-System.out.printntln(string);
        List<String> sets = NE.app_S._A.parserMixedString(string);
        IMV_SIQ output = new IMV_SIQ();
        //执行养疗经tinshell搜索
        if (null != NE.app_S.appConfig) {
            if (null != NE.app_S.appConfig.pLShellJPanel) {
                NE.app_S.jTabbedpane.validate();
                NE.validate();
                //检测脚本综合分类、
                //分类执行脚本编译机
                //chushi
                NE.app_S.appConfig.pLShellJPanel.jlabel_init_button.doClick();
                //qingkong
                NE.app_S.appConfig.pLShellJPanel.jlabel_button_clear.doClick();
                //传参tinshell
                NE.app_S.appConfig.pLShellJPanel.jTextPane.setText(string);
                //baocun
                NE.app_S.appConfig.pLShellJPanel.jlabel_debug_button.doClick();
                //qingkongshuaxin
                //执行
                NE.app_S.appConfig.pLShellJPanel.jlabel_flush_button.doClick();
                //取值
            }
        }
        //执行搜索结果string
        //输出
//		String yl= "";
        //Iterator<String> iterator= sets.iterator();
//		while(iterator.hasNext()) {
//			String token= iterator.next();
//			yl+= token+ " ";
//		}
        //String yl= HRJFrame.NE.app_S.appConfig.pLShellJPanel.outputjTextPane.getText();
        String yl = NE.app_S.appConfig.pLShellJPanel.getStringFromStringBuilder();
        try {
            output.put(URLEncoder.encode("yl", "UTF-8")
                , URLEncoder.encode(yl, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        //output.put(URLEncoder.encode("yl", "UTF-8"), URLEncoder.encode("罗瑶光", "UTF-8"));
        return output;
    }
}
