
package M_V.ME.APM.VSQ.editPane;

import A_V.C.RatioMap;
import A_V.E.RatioMap_E;
import E_A.OEI.AMV.ECS.SVQ.MPC.SOQ.OEM.E.SensingMap_E;
import E_A.ME.analysis.E.AE;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.WindowsUI;
import M_V.MVQ.button.DetaButton;
import M_V.MVQ.filenameFilter.TXTFilter;
import O_V.OSI.AOP.neo.tts.ReadChinese;
import P.image.Color_P;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.SVQ.stable.S_Maps;
import S_A.VSQ.parser.EmotionSample;
import S_A.pheromone.IMV_SIQ;
import U_V.ESU.string.StringReplace;
import exception.thread.DetaThread;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
public class EditPane_X_ extends Container implements KeyListener {
    private IMV_SIQ ctj;
    private IMV_SIQ ctk;
    private IMV_SIQ ctt;
    private IMV_SIQ ctr;

    private IMV_SIQ cko;
    private IMV_SIQ cfn;
    private IMV_SIQ csp;
    private IMV_SIQ cgm;
    //
    public App NE;
    private IMV_SIQ pinyin;
    private EmotionSample emotionSample;
    private RatioMap ratioMap;
    private RatioMap_E ratioMap_E;
    private SensingTest sensingTest;
    private SensingMap_E sensingMap_E;

    public String key;
    public String dataValue;
    public JTextPane data;
    public JTextPane text;
    public IMV_SIQ pose;
    public IMV_SIQ etc;
    public IMV_SIQ cte;
    public IMV_SIQ pos;
    public AE _A;
    public DetaButton buttonHighLight;

    public EditPane_X_(JTextPane text, App NE) {
        this.text = text;
        this.key = "";
        this.pose = NE.app_S.fMHMMListOneTime_E_X_S.posEnToEn;
        this.etc = NE.app_S.fMHMMListOneTime_E_X_S.fullEnToCn;
        this.cte = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToEn;
        this.pos = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;

        this._A = NE.app_S._A;
        this.ctj = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToJp;
        this.ctk = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToAb;
        this.ctt = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToTt;
        this.ctr = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToRs;

        this.cko = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToKo;
        this.cfn = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToFn;
        this.csp = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToSp;
        this.cgm = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToGm;

        this.ratioMap_E = NE.app_S.ratioMap_E;
        this.pinyin = NE.app_S.fMHMMListOneTime_E_X_S.fullCnToPy;
        this.emotionSample = NE.app_S.emotionSample;
        this.ratioMap = NE.app_S.ratioMap;
        this.sensingTest = NE.app_S.sensingTest;
        this.sensingMap_E = NE.app_S.sensingMap_E;

        this.setLayout(null);
        this.setBounds(0, 0, WindowsUI.makeContainerWidth
            , WindowsUI.makeContainerHeight);
        JScrollPane jsp_data = new JScrollPane(this.data(NE));
        jsp_data.setBounds(605, 80, WindowsUI.basicWidth - 750, 550);
        JScrollPane jsp_text = new JScrollPane(this.text);
        jsp_text.setBounds(5, 80, WindowsUI.basicWidth - 850, 550);
        I_OutputButton(NE);
        I_TranslateButton(NE);
        I_ExplainButton(NE);
        I_ClearButton(NE);
        I_TxtButton(NE);
        I_PrintButton(NE);
        I_ReadButton(NE);
        I_PinYinButton(NE);
        I_ArabicButton(NE);
        I_TranditionButton(NE);
        I_JapanButton(NE);
        I_RussianButton(NE);
        I_KoreanButton(NE);
        I_FnButton(NE);
        I_SpButton(NE);
        I_GmButton(NE);
        this.add(jsp_data);
        this.add(jsp_text);
    }

    private void I_KoreanButton(App NE) {
        M_V.MVQ.button.DetaButton button = new M_V.MVQ.button.DetaButton("韩语");
        button.setBounds(845, 33, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                String split = "【";
                String splite = "】";
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (cko.containsKey(setOfi)
                            ? split + cko.get(setOfi) + splite : ""));
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (StringReplace.pos(key, pos, cko, setOfi, page, NE)) {
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (cko.containsKey(setOfi)
                            ? split + cko.get(setOfi) + splite : "")
                            + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_FnButton(App NE) {
        M_V.MVQ.button.DetaButton button = new M_V.MVQ.button.DetaButton("法语");
        button.setBounds(950, 33, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                String split = "【";
                String splite = "】";
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (cfn.containsKey(setOfi)
                            ? split + cfn.get(setOfi) + splite : ""));
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (StringReplace.pos(key, pos, cfn, setOfi, page, NE)) {
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (cfn.containsKey(setOfi)
                            ? split + cfn.get(setOfi) + splite : "")
                            + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_SpButton(App NE) {
        M_V.MVQ.button.DetaButton button = new M_V.MVQ.button.DetaButton("西语");
        button.setBounds(1055, 33, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                String split = "【";
                String splite = "】";
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (csp.containsKey(setOfi)
                            ? split + csp.get(setOfi) + splite : ""));
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (StringReplace.pos(key, pos, csp, setOfi, page, NE)) {
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (csp.containsKey(setOfi)
                            ? split + csp.get(setOfi) + splite : "")
                            + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_GmButton(App NE) {
        M_V.MVQ.button.DetaButton button = new M_V.MVQ.button.DetaButton("德语");
        button.setBounds(1160, 33, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                String split = "【";
                String splite = "】";
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (cgm.containsKey(setOfi)
                            ? split + cgm.get(setOfi) + splite : ""));
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (StringReplace.pos(key, pos, cgm, setOfi, page, NE)) {
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (cgm.containsKey(setOfi)
                            ? split + cgm.get(setOfi) + splite : "")
                            + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_ArabicButton(App NE) {
        M_V.MVQ.button.DetaButton button = new M_V.MVQ.button.DetaButton("阿语");
        button.setBounds(950, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                String split = "【";
                String splite = "】";
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (ctk.containsKey(setOfi)
                            ? split + ctk.get(setOfi) + splite : ""));
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (StringReplace.pos(key, pos, ctk, setOfi, page, NE)) {
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (ctk.containsKey(setOfi)
                            ? split + ctk.get(setOfi) + splite : "")
                            + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_RussianButton(App NE) {
        M_V.MVQ.button.DetaButton button = new M_V.MVQ.button.DetaButton("俄语");
        button.setBounds(1160, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                String split = "【";
                String splite = "】";
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (ctr.containsKey(setOfi)
                            ? split + ctr.get(setOfi) + splite : ""));
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (StringReplace.pos(key, pos, ctr, setOfi, page, NE)) {
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (ctr.containsKey(setOfi)
                            ? split + ctr.get(setOfi) + splite : "")
                            + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_TranditionButton(App NE) {
        M_V.MVQ.button.DetaButton button = new M_V.MVQ.button.DetaButton("繁体");
        button.setBounds(845, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                String split = "【";
                String splite = "】";
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi
                            + (ctt.containsKey(setOfi) ? split
                            + ctt.get(setOfi) + splite : ""));
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (StringReplace.pos(key, pos, ctt, setOfi, page, NE)) {
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (ctt.containsKey(setOfi)
                            ? split + ctt.get(setOfi) + splite : "")
                            + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_JapanButton(App NE) {
        M_V.MVQ.button.DetaButton button = new M_V.MVQ.button.DetaButton("日语");
        button.setBounds(1055, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                String split = "【";
                String splite = "】";
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (ctj.containsKey(setOfi)
                            ? split + ctj.get(setOfi) + splite : ""));
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (StringReplace.pos(key, pos, ctj, setOfi, page, NE)) {
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\" "
                            + "size=\"5\">"
                            + setOfi
                            + (ctj.containsKey(setOfi) ? split
                            + ctj.get(setOfi) + splite : "") + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_PinYinButton(App NE) {
        M_V.MVQ.button.DetaButton button = new M_V.MVQ.button.DetaButton("拼音");
        button.setBounds(740, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (pinyin.containsKey(setOfi)
                            ? pinyin.get(setOfi) : ""));
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (StringReplace.pos(key, pos, pinyin, setOfi, page, NE)) {
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (pinyin.containsKey(setOfi)
                            ? pinyin.get(setOfi) : "") + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_ReadButton(App NE) {
        M_V.MVQ.button.DetaButton button = new M_V.MVQ.button.DetaButton("阅读关");
        button.setBounds(635, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            ReadChinese readChinese = new ReadChinese(button, NE.app_S);

            @SuppressWarnings("deprecation")
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (button.getText().equalsIgnoreCase("阅读开")) {
                    readChinese.waitString = true;
                    readChinese.waitWord = true;
                    return;
                }
                if (readChinese.getState().toString()
                    .equalsIgnoreCase("TERMINATED")) {
                    readChinese.I_NullSap();
                    readChinese = new ReadChinese(button, NE.app_S);
                }
                if (text == null) {
                    return;
                }
                if (readChinese.finish == 0) {
                    if (!readChinese.isAlive()) {
                        button.setLabel("阅读开");
                        button.updateUI();
                        DetaThread.sleepDeta(200);
                        long stopBy = 25;
                        char[] words = text.getText().toCharArray();
                        List<String> list = new ArrayList<>();
                        int i = 0;
                        while (i < words.length) {
                            int j = 0;
                            StringBuilder stringBuilder = new StringBuilder();
                            while (j < stopBy && i + j < words.length) {
                                stringBuilder.append(words[i + (j++)]);
                            }
                            list.add(stringBuilder.toString());
                            i += j;
                        }
                        readChinese.I_PreReadList(list, NE);
                        if (readChinese.finish == 2) {
                            readChinese.start();
                        }
                    }
                }
            }
        });
        this.add(button);
    }

    private void I_PrintButton(App NE) {
        DetaButton button = new DetaButton("打印");
        button.setBounds(530, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                String temp = text.getText();
                String[] lines = temp.split("\r\n");
                List<String> trueLines = new ArrayList<>();
                for (int i = 0; i < lines.length; i++) {
                    int line_count = lines[i].length() / 30;
                    String[] lineOfStrings = new String[line_count + 1];
                    for (int j = 0; j <= line_count; j++) {
                        lineOfStrings[j] = lines[i].substring(j * 30 > lines[i].length()
                            ? lines[i].length() : j * 30, (j + 1) * 30
                            > lines[i].length() ? lines[i].length() : (j + 1) * 30);
                        trueLines.add(lineOfStrings[j]);
                    }
                }
                int page = trueLines.size() / 46;
                for (int i = 0; i <= page; i++) {
                    new PrintTest4(trueLines.subList((i) * 46 > trueLines.size()
                        ? trueLines.size() : (i) * 46, (i + 1) * 46
                        > trueLines.size() ? trueLines.size() : (i + 1) * 46));
                }
            }
        });
        this.add(button);
    }

    private void I_TxtButton(App NE) {
        DetaButton button = new DetaButton("生成TXT");
        button.setBounds(425, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                //get path
                FileDialog filedialog = new FileDialog(new Frame()
                    , "导入到这里", FileDialog.LOAD);
                filedialog.setFilenameFilter(new TXTFilter("txt"));
                filedialog.setVisible(true);
                String filepath = filedialog.getDirectory() + filedialog.getFile();
                //20230106-System.out.println(filepath);
                //write file
                FileWriter fw = null;
                try {
                    fw = new FileWriter(filepath, true);
                    fw.write(text.getText());
                    fw.close();
                } catch (IOException e) {
                    try {
                        fw.close();
                    } catch (IOException e1) {
                        fw = null;
                        e1.printStackTrace();
                    }
                    e.printStackTrace();
                }
            }
        });
        this.add(button);
    }

    private void I_ClearButton(App NE) {
        DetaButton button = new DetaButton("还原");
        button.setBounds(320, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + "</font></span>");
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (key.contains(setOfi) && (S_Maps.mingCi.containsKey(setOfi)
                            || S_Maps.dongCi.containsKey(setOfi)
                            || S_Maps.xingRongCi.containsKey(setOfi))) {
                            page.append("<span style=\"background:red\">" +
                                "<font color=\"white\">"
                                + setOfi + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.mingCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(255, 245, 255)
                                + "\"><font color=\"black\""
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.dongCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(245, 255, 245)
                                + "\"><font color=\"black\""
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.xingRongCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(255, 255, 245)
                                + "\"><font color=\"black\""
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.fuCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:#F1FFFF\">" +
                                "<font color=\"black\""
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + "</font></span>");
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_ExplainButton(App NE) {
        DetaButton button = new DetaButton("解释");
        button.setBounds(5 + 105 + 105, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (cte.containsKey(setOfi)
                            ? (etc.containsKey(cte.get(setOfi))
                            ? ":(" + etc.get(cte.get(setOfi))
                            + ")" : "") : "") + "</font></span>");
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (key.contains(setOfi) && (S_Maps.mingCi.containsKey(setOfi)
                            || S_Maps.dongCi.containsKey(setOfi)
                            || S_Maps.xingRongCi.containsKey(setOfi))) {
                            page.append("<span style=\"background:red\">" +
                                "<font color=\"white\">"
                                + setOfi + (cte.containsKey(setOfi)
                                ? (etc.containsKey(cte.get(setOfi))
                                ? ":(" + etc.get(cte.get(setOfi))
                                + ")" : "") : "") + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.mingCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(255, 245, 255)
                                + "\"><font color=\"black\""
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + (cte.containsKey(setOfi)
                                ? (etc.containsKey(cte.get(setOfi))
                                ? ":(" + etc.get(cte.get(setOfi))
                                + ")" : "") : "") + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.dongCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(245, 255, 245)
                                + "\"><font color=\"black\""
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + (cte.containsKey(setOfi)
                                ? (etc.containsKey(cte.get(setOfi))
                                ? ":(" + etc.get(cte.get(setOfi))
                                + ")" : "") : "") + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.xingRongCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(255, 255, 245)
                                + "\"><font color=\"black\""
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + (cte.containsKey(setOfi)
                                ? (etc.containsKey(cte.get(setOfi))
                                ? ":(" + etc.get(cte.get(setOfi))
                                + ")" : "") : "") + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.fuCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:#F1FFFF\">" +
                                "<font color=\"black\""
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + (cte.containsKey(setOfi)
                                ? (etc.containsKey(cte.get(setOfi))
                                ? ":(" + etc.get(cte.get(setOfi))
                                + ")" : "") : "") + "</font></span>");
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (cte.containsKey(setOfi)
                            ? (etc.containsKey(cte.get(setOfi))
                            ? ":(" + etc.get(cte.get(setOfi))
                            + ")" : "") : "") + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_TranslateButton(App NE) {
        DetaButton button = new DetaButton("英译");
        button.setBounds(5 + 105, 3, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(
                    text.getText().trim()).iterator();
                if (text.getSelectedText() != null
                    && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(
                        text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#F1F1F1\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (cte.containsKey(setOfi)
                            ? ":(" + cte.get(setOfi) + ")" : "") + "</font></span>");
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (StringReplace.pos(key, pos, cte, setOfi, page, NE)) {
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">" +
                            "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + (cte.containsKey(setOfi)
                            ? ":(" + cte.get(setOfi) + ")" : "") + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_OutputButton(App NE) {
        buttonHighLight = new DetaButton("高亮");
        buttonHighLight.setBounds(5, 3, 100, 20);
        buttonHighLight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                StringBuilder page = new StringBuilder();
                Iterator<String> iterator = _A.parserMixedString(text.getText().trim()).iterator();
                if (text.getSelectedText() != null && !text.getSelectedText().trim().isEmpty()) {
                    iterator = _A.parserMixedString(text.getSelectedText().trim()).iterator();
                }
                text.setSelectionStart(0);
                text.setSelectionEnd(0);
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    setOfi = StringReplace.StringHTMLReplaceARCP(setOfi);
                    if (pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#818181\">" + "<font color=\"black\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + "</font></span>");
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (key.contains(setOfi) && (S_Maps.mingCi.containsKey(setOfi)
                            || S_Maps.dongCi.containsKey(setOfi)
                            || S_Maps.xingRongCi.containsKey(setOfi))) {
                            page.append("<span style=\"background:red\">"
                                + "<font color=\"white\">" + setOfi + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.mingCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(245, 215
                                - NE.app_S.raterot << 3, 245)
                                + "\"><font color=\"black\"" + " size=\""
                                + NE.app_S.size_font_rot + "\">" + setOfi
                                + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.dongCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(245
                                    - NE.app_S.raterot << 3, 255
                                , 245 - 40 - NE.app_S.raterot << 3)
                                + "\"><font color=\"black\"" + " size=\""
                                + NE.app_S.size_font_rot + "\">"
                                + setOfi + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.xingRongCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(245, 255
                                , 245 - 40 - NE.app_S.raterot << 3)
                                + "\"><font color=\"black\"" + " size=\""
                                + NE.app_S.size_font_rot + "\">" + setOfi
                                + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.fuCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:#81FFFF\">"
                                + "<font color=\"black\"" + " size=\""
                                + NE.app_S.size_font_rot + "\">" + setOfi
                                + "</font></span>");
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">"
                            + "<font color=\"black\"" + " size=\""
                            + NE.app_S.size_font_rot + "\">" + setOfi
                            + "</font></span>");
                    }
                }
                data.setText(page.toString());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(buttonHighLight);
    }

    public int getPagesCount(String text) {
        int page = 0;
        int AMV_MVS_VSQ, count = 0;
        String str = text;
        while (str.length() > 0) {
            AMV_MVS_VSQ = str.indexOf("\n");
            count += 1;
            if (AMV_MVS_VSQ != 1) {
                str = str.substring(AMV_MVS_VSQ + 1);
            } else {
                str = "";
            }
        }
        if (count > 0) {
            page = count / 54 + 1;
        }
        return page;
    }

    private JTextPane data(App NE) {
        data = new JTextPane();
        data.setContentType("text/html");
        data.setBackground(new Color(210, 210, 210));
        return data;
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }
}
//339
//if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")
//||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
//page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi
//	+ (ctj.containsKey(setOfi)?split+ ctj.get(setOfi)+ splite:"")+ "</font></span>");
//continue Here;
//}
//if(pos.get(setOfi).contains("名")) {
//page.append("<span style=\"background:"+U_A.PEU.P.image.Color_P.P(255, 245, 255)
//	+"\"><font color=\"black\" size=\"5\">"  + setOfi
//	+ (ctj.containsKey(setOfi)?split+ ctj.get(setOfi)+ splite:"")+  "</font></span>");
//continue Here;
//}
//if(pos.get(setOfi).contains("动")) {
//page.append("<span style=\"background:"+U_A.PEU.P.image.Color_P.P(245, 255, 245)
//	+"\"><font color=\"black\" size=\"5\">" + setOfi
//	+ (ctj.containsKey(setOfi)?split+ ctj.get(setOfi)+ splite:"")+ "</font></span>");
//continue Here;
//}
//if(pos.get(setOfi).contains("形")) {
//page.append("<span style=\"background:"+U_A.PEU.P.image.Color_P.P(255, 255, 245)
//	+"\"><font color=\"black\" size=\"5\">" + setOfi
//	+ (ctj.containsKey(setOfi)?split+ ctj.get(setOfi)+ splite:"")+ "</font></span>");
//continue Here;
//}
//if(pos.get(setOfi).contains("副")) {
//page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"  
//	+ setOfi+ (ctj.containsKey(setOfi)?split+ ctj.get(setOfi)+ splite:"")
//	+  "</font></span>");
//continue Here;
//}

//389
//				//get path
//				FileDialog filedialog= new FileDialog(new Frame(), "选择要阅读的医学书籍", FileDialog.LOAD);
//				filedialog.setFilenameFilter(new TXTFilter("txt"));
//				filedialog.setVisible(true);
//				String filepath= filedialog.getDirectory()+ filedialog.getFile();
//				//20230106-System.out.println(filepath);
//				if(filepath.endsWith(".doc")||filepath.endsWith(".docx")
//						||filepath.endsWith(".txt")||filepath.endsWith(".pdf")) {
//					try {
//						Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+filepath);
//					} catch (IOException e) {
//			//						e.printStackTrace();
//					}
//				}

//96
//       this.ratioMap =  this.ratioMap_E;
//        this.emotionSample = NE.app_S.emotionSample;
//        this.sensingTest = NE.app_S.sensingTest;
//        this.sensingMap_E = NE.app_S.sensingMap_E;