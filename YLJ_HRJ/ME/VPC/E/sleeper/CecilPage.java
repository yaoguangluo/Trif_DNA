package ME.VPC.E.sleeper;

import ME.VPC.M.app.App;
import ME.VPC.S.buttons.Page_X_S_sButtonschineseAnnotation;
import ME.VPC.S.buttons.Page_X_S_sButtonsreading;
import ME.VPC.S.buttons.Page_X_S_sButtonsreturnEnglish;
import ME.VPC.S.buttons.Page_X_S_sButtonsrollafter;
import ME.VPC.S.buttons.Page_X_S_sButtonsrollback;
import ME.VPC.S.ne.WindowsUI;
import ME.VPC.V.ET.CecilPage_X_S_sListeners;
import M_V.MVQ.button.DetaButton;
import S_A.SEM.bloom.StaticFunctionMapM_VECS_C;
import S_A.SEM.bloom.StaticRootMap;
import S_A.pheromone.IMV_SIQ;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import java.awt.Color;
import java.io.IOException;
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
@SuppressWarnings("serial")
public class CecilPage extends CecilPage_X_S_sListeners {
    

    public CecilPage(JTextPane text, App NE) throws InterruptedException, IOException {
        initPage(text, NE);
        this.setLayout(null);
        this.setBounds(0, 0, WindowsUI.makeContainerWidth
            , WindowsUI.makeContainerHeight);
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

    @SuppressWarnings("unchecked")
    public JTextPane data(App NE) throws InterruptedException, IOException {
        data = new JTextPane();
        data.setBounds(850, 150, WindowsUI.basicWidth - 600, 800 - 70);
        data.setBackground(new Color(210, 210, 210));
        String callFunctionKey = "DetaButton";
        //StaticRootMap.initMap();
        String[] strings = new String[1];
        IMV_SIQ output = new IMV_SIQ();
        IMV_SIQ inputValue = new IMV_SIQ();
        String[] 传参因子 = StaticFunctionMapM_VECS_C.annotationMap
            .getString(callFunctionKey).split(":");
        inputValue.put(传参因子[0], "共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
        if (null == NE._I_U) {
            return null; //trif
        }
        NE._I_U.string._S_ = "共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页";
        //因为异步，所以支持。
        output.put("传参因子", 传参因子);
        output.put("inputValues", inputValue);
        //strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
        strings[0] = "执行 M_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
        StaticRootMap.tinShellV005(strings, output, NE);
        IMV_SIQ map = (IMV_SIQ) output.get(callFunctionKey);
        buttonSum = (DetaButton) map.get("interfaceReturn");
        //buttonSum= new DetaButton("共有 " + (sets==null?0:(1 + sets.size() / 2001))+ " 页");
        buttonSum.setBounds(0, 0, 100, 30);

        inputValue.put(传参因子[0], "当前页面：" + (currentPage + 1));
        output.put("inputValues", inputValue);
        StaticRootMap.tinShellV005(strings, output, NE);
        map = (IMV_SIQ) output.get(callFunctionKey);
        buttonCrt = (DetaButton) map.get("interfaceReturn");
        //buttonCrt= new DetaButton("当前页面：" + (currentPage + 1));
        buttonCrt.setBounds(120, 0, 150, 30);
        buttonPrev = Page_X_S_sButtonsrollback.data_X_rollback(this
            , 2000, NE);
        buttonNext = Page_X_S_sButtonsrollafter.data_X_rollafter(this
            , 2000, NE);
        buttonCTE = Page_X_S_sButtonschineseAnnotation.data_X_chineseAnnotation(this, NE);
        buttonFRS = Page_X_S_sButtonsreturnEnglish.data_X_returnEnglish(this, NE);
        //        buttonNext = Page_X_S_sButtonsrollafter.data_X_rollafter(this
//                , 410, 0, 100, 30, 2000);
        //        buttonCTE = Page_X_S_sButtonschineseAnnotation.data_X_chineseAnnotation(this
//                , 410, 0, 100, 30, 2000);
//        buttonFRS = Page_X_S_sButtonsreturnEnglish.data_X_returnEnglish(this
//            , 410, 0, 100, 30, 2000);
        buttonETC = Page_X_S_sButtonsreading.data_X_reading(this, app_S, NE);

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
            List<String> setsForGet
                = sets.subList(currentPage * 2000, (currentPage + 1) * 2000 < sets.size()
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
        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(buttonPrev);
        buttonBox.add(buttonNext);
        buttonBox.add(buttonSum);
        buttonBox.add(buttonCrt);
        buttonBox.add(buttonCTE);
        buttonBox.add(buttonFRS);
        buttonBox.add(buttonETC);
        buttonBox.add(buttonADD);
        buttonBox.setBounds(5 + 800 - 650, 290 + 100 - 80 + 200 - 260 + 120
            , 950, 20);
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