//YLJ_HRJ/ME/APM/VSQ/fuchankexue/FckxPage.java
package ME.VPC.E.sleeper;

import ME.VPC.M.app.App;
import ME.VPC.S.buttons.Page_X_S_sButtonsreading;
import ME.VPC.S.ne.WindowsUI;
import ME.VPC.V.ET.FckxPage_X_S_sListeners;
import ME.VPC.V.appButton.AppButtonUtil_X_DNN_Classify;
import ME.VPC.V.appButton.AppButtonUtil_X_DNN_Page;
import M_V.MVQ.button.DetaButton;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class FckxPage extends FckxPage_X_S_sListeners {
    
    public FckxPage(JTextPane text, App NE) {
        initPage(text, NE);
        this.setLayout(null);
        this.setBounds(0, 0, WindowsUI.makeContainerWidth
            , WindowsUI.makeContainerHeight);
        this.jTabbedpane = jTabbedpane;
        JScrollPane jsp_name = new JScrollPane(this.name());
        jsp_name.setBounds(100, 15, 680, 50);
        JScrollPane jsp_data = new JScrollPane(this.data(NE));
        JScrollPane jsp_statistic = new JScrollPane(this.statistic());
        JScrollPane jsp = new JScrollPane(this.jTable(NE));
        JLabel jlabel = new JLabel("主要词汇 \\ 操作选项");
        PageUtil.initPageTail(jsp_statistic, jsp_data, jsp, jlabel);
        this.add(jsp);
        this.add(jlabel);
        this.add(jsp_data);
        this.add(jsp_statistic);
    }

    public JTextPane data(App NE) {
        PageButtons._I(this, NE);
        DetaButton buttonADD = new DetaButton("添加到编辑页");
        buttonADD.setBounds(868, 0, 115, 30);
        buttonADD.addActionListener(e -> {
            if (sets == null) {
                return;
            }
            if (text.getText().length() > 5000) {
                return;
            }
            StringBuilder page = new StringBuilder();
            List<String> setsForGet = sets.subList(currentPage * 2000
                , (currentPage + 1) * 2000 < sets.size()
                    ? (currentPage + 1) * 2000 : sets.size());
            Iterator<String> iterator = setsForGet.iterator();
            while (iterator.hasNext()) {
                String setOfi = iterator.next();
                page.append(setOfi);
            }
            if (!text.getText().isEmpty()) {
                text.setText(text.getText() + "\r\n\r\n" + page.toString());
            } else {
                text.setText(page.toString());
            }
            text.validate();
        });
        DetaButton buttonKSLJ = new DetaButton("中药DNN");
        buttonKSLJ.setBounds(990, 0, 115, 30);
        buttonKSLJ.addActionListener(e -> {
            if (null == sets) {
                return;
            }
            if (text.getText().length() > 5000) {
                return;
            }
            StringBuilder page = new StringBuilder().append("");
            AppButtonUtil_X_DNN_Page.pageDNN(page, sets, currentPage, app_S
                , table, row, key, buttonSum, buttonCrt, data, statistic
                , "中药", NE);
        });
        DetaButton buttonKSLJB = new DetaButton("西药DNN");
        buttonKSLJB.setBounds(990 + 115 + 7, 0, 115, 30);
        buttonKSLJB.addActionListener(e -> {
            if (null == sets) {
                return;
            }
            if (text.getText().length() > 5000) {
                return;
            }
            StringBuilder page = new StringBuilder().append("");
            AppButtonUtil_X_DNN_Page.pageDNN(page, sets, currentPage, app_S, table
                , row, key, buttonSum, buttonCrt, data, statistic, "西药", NE);
        });
        //dnn游标
        JSlider sliderDNN = new JSlider(0, 25);
        sliderDNN.setSnapToTicks(true);
        sliderDNN.setPaintTicks(true);
        sliderDNN.setMajorTickSpacing(5);
        sliderDNN.setMinorTickSpacing(1);
        sliderDNN.addChangeListener(event -> {
            JSlider source = (JSlider) event.getSource();
            app_S.jsliderDNNRatio = Double.valueOf(source.getValue());
            if (null == sets) {
                return;
            }
            if (text.getText().length() > 5000) {
                return;
            }
            StringBuilder page = new StringBuilder().append("");
            AppButtonUtil_X_DNN_Classify.classifyDNN(page, sets, currentPage
                , table, row, key, buttonSum, buttonCrt, data, statistic
                , "西药", NE);
        });
        buttonCTV = Page_X_S_sButtonsreading.data_X_reading(this, app_S, NE);
        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(buttonPrev);
        buttonBox.add(buttonNext);
        buttonBox.add(buttonSum);
        buttonBox.add(buttonCrt);
        buttonBox.add(buttonCTE);
        buttonBox.add(buttonFRS);
        buttonBox.add(buttonETC);
        buttonBox.add(buttonCTV);
        buttonBox.add(buttonADD);
        buttonBox.add(buttonKSLJ);
        //buttonBox.add(buttonKSLJB);
        buttonBox.add(buttonKSLJB);
        buttonBox.add(sliderDNN);
        buttonBox.setBounds(155, 370, 950 + 220, 20);
        this.add(buttonBox);
        return data;
    }

    public JTextPane statistic() {
        statistic = new JTextPane();
        statistic.setBackground(new Color(210, 210, 210));
        statistic.setBounds(850, 150, WindowsUI.basicWidth - 840, 800);
        return statistic;
    }
}

//62 //        data = new JTextPane();
////        data.setBounds(850, 150, WindowsUI.basicWidth - 600, 800 - 70);
////        data.setBackground(new Color(210, 210, 210));
////
////        buttonSum = new DetaButton("共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
////        buttonSum.setBounds(0, 0, 100, 30);
////        buttonCrt = new DetaButton("当前页面：" + (currentPage + 1));
////        buttonCrt.setBounds(120, 0, 150, 30);
////
//////        buttonPrev = Page_X_S_sButtonsrollback.data_X_rollback(this
//////                , 290, 0, 100, 30, 2000);
//////        buttonNext = Page_X_S_sButtonsrollafter.data_X_rollafter(this
//////                , 410, 0, 100, 30, 2000);
////        buttonPrev = Page_X_S_sButtonsrollback.data_X_rollback(this
////            , 2000);
////        buttonNext = Page_X_S_sButtonsrollafter.data_X_rollafter(this
////            , 2000);
////        buttonCTE = Page_X_S_sButtonsenglish.data_X_english(this
////                , 630, 0, 100, 30, 2000);
////        buttonFRS = Page_X_S_sButtonschinese.data_X_chinese(this
////                , 520, 0, 100, 30, 2000);
////        buttonETC = Page_X_S_sButtonssymnorine.data_X_symnorine(this
////                , 740, 0, 100, 30, 2000);