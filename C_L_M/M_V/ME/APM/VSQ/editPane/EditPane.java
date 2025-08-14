package M_V.ME.APM.VSQ.editPane;

import E_A.OSI.AOP.PCS.PP.port_E.RestNLPPortImpl;
import ME.VPC.M.app.App;
import ME.VPC.V.appButton.AppButtonUtil_X_DNN;
import M_V.MVQ.button.DetaButton;
import S_A.pheromone.IMV_SIQ;

import javax.swing.JSlider;
import javax.swing.JTextPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class EditPane extends EditPane_X_OS {

    public EditPane(JTextPane text, App app_NE) {
        super(text, app_NE);//shaohou duplication
        NE = app_NE;
        I_DNNButton();
        I_DNNButtonSort();
        I_DNNButtonWest();
        I_DNNButtonChinese();
        I_DNNSlider();
        I_Literature();
        I_MindReader();
    }

    

    //dataCY
    private void I_MindReader() {
        DetaButton button = new DetaButton("词义分析");
        button.setBounds(635, 33, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                try {
                    IMV_SIQ output = RestNLPPortImpl
                        .dataCY(text.getText().trim(), NE);
                    String cy = output.get("cy").toString().trim();
                    cy = URLDecoder.decode(cy, "UTF-8");
                    cy = cy.replace("\r\n", "<br/>   ");
                    cy = "<html>" + cy + "</html>";
                    data.setText(cy);
                    data.setSelectionStart(0);
                    data.setSelectionEnd(0);
                    data.validate();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        this.add(button);
    }

    //dataZF
    private void I_Literature() {
        DetaButton button = new DetaButton("作文辅导");
        button.setBounds(740, 33, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                try {
                    @SuppressWarnings("unchecked")
                    IMV_SIQ output = (IMV_SIQ) RestNLPPortImpl
                        .dataZF(text.getText().trim(), NE);
                    String zf = output.get("zf").toString().trim();
                    zf = URLDecoder.decode(zf, "UTF-8");
                    zf = zf.replace("\r\n", "<br/>   ");
                    zf = "<html>" + zf + "</html>";
                    data.setText(zf);
                    data.setSelectionStart(0);
                    data.setSelectionEnd(0);
                    data.validate();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        this.add(button);
    }

    private void I_DNNButtonSort() {
        DetaButton button = new DetaButton("DNN重心");
        button.setBounds(5 + 105 * 1, 3 + 30, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                List<String> setsForGet = _A.parserMixedString(text.getText().trim());
                Iterator<String> iterator = setsForGet.iterator();
                String setOfi = new String();
                String response = null;
                response = sectionLocalDNN(setsForGet, iterator, setOfi);
                //稍后新button 罗瑶光20230905
                //dnn rank
                JTextPane statistic = new JTextPane();
                Map<String, Double> dNNrank = new IMV_SIQ();
                AppButtonUtil_X_DNN.doRankDNN(statistic, response, pos, dNNrank, NE);
                //String temp= statistic.getText();
                data.setText(statistic.getText());
                data.setSelectionStart(0);
                data.setSelectionEnd(0);
                data.validate();
            }
        });
        this.add(button);
    }

    private void I_DNNButtonWest() {
        DetaButton button = new DetaButton("DNN西药");
        button.setBounds(5 + 105 * 2, 3 + 30, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                //
                StringBuilder page = new StringBuilder().append("");
                List<String> setsForGet = _A.parserMixedString(text.getText().trim());
                Iterator<String> iterator = setsForGet.iterator();
                String setOfi = new String();
                //String response= sectionDNN(setsForGet, iterator, setOfi);
                String response = null;
                response = sectionLocalDNN(setsForGet, iterator, setOfi);
                //dnn森林//稍后新button 罗瑶光20230905
                try {
                    String[] dnn = response.replace("\r\n", "<br/>")
                        .split("<br/>");
                    NE.app_S.coAuthorForWord.bootDetaBingMingDnnFlowerForest(
                        "西药", dnn, true);
                } catch (Exception e1) {
                    NE.validate();
                }
                //稍后新button 罗瑶光20230905
                //				//dnn rank
                JTextPane statistic = new JTextPane();
                Map<String, Double> dNNrank = new IMV_SIQ();
                AppButtonUtil_X_DNN.doRankDNN(statistic, response, pos, dNNrank, NE);
                //DNN
                showDataTagDNN(iterator, setsForGet, setOfi, page, response, dNNrank);
            }
        });
        this.add(button);
    }

    private void I_DNNButtonChinese() {
        DetaButton button = new DetaButton("DNN中药");
        button.setBounds(5 + 105 * 3, 3 + 30, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                //
                StringBuilder page = new StringBuilder().append("");
                List<String> setsForGet = _A.parserMixedString(text.getText().trim());
                Iterator<String> iterator = setsForGet.iterator();
                String setOfi = new String();
                String response = null;

                response = sectionLocalDNN(setsForGet, iterator, setOfi);

                //dnn森林//稍后新button 罗瑶光20230905

                String[] dnn = response.replace("\r\n", "<br/>").split("<br/>");
                NE.app_S.coAuthorForWord.bootDetaDnnFlowerForest("中药", dnn, true);
                //稍后新button 罗瑶光20230905
                //				//dnn rank
                JTextPane statistic = new JTextPane();
                Map<String, Double> dNNrank = new IMV_SIQ();
                AppButtonUtil_X_DNN.doRankDNN(statistic, response, pos, dNNrank, NE);
                //DNN
                showDataTagDNN(iterator, setsForGet, setOfi, page, response, dNNrank);
            }
        });
        this.add(button);
    }

    //替换下准备
    private void I_DNNButton() {
        DetaButton button = new DetaButton("DNN");
        button.setBounds(5, 3 + 30, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (text.getText().equalsIgnoreCase("")) {
                    return;
                }
                //
                StringBuilder page = new StringBuilder().append("");
                List<String> setsForGet = _A.parserMixedString(text.getText().trim());
                Iterator<String> iterator = setsForGet.iterator();
                String setOfi = new String();
                String response = null;
                response = sectionLocalDNN(setsForGet, iterator, setOfi);
                //稍后新button 罗瑶光20230905
                //				//dnn rank
                JTextPane statistic = new JTextPane();
                Map<String, Double> dNNrank = new IMV_SIQ();
                AppButtonUtil_X_DNN.doRankDNN(statistic, response, pos, dNNrank, NE);
                //DNN
                showDataTagDNN(iterator, setsForGet, setOfi, page, response, dNNrank);
            }
        });
        this.add(button);
    }

    private void I_DNNSlider() {
        JSlider sliderDNN = new JSlider(0, 25);
        sliderDNN.setBounds(5 + 105 + 105 + 105 + 105, 3 + 30, 205, 20);
        sliderDNN.setSnapToTicks(true);
        sliderDNN.setPaintTicks(true);
        sliderDNN.setMajorTickSpacing(5);
        sliderDNN.setMinorTickSpacing(1);
        sliderDNN.addChangeListener(
            new ChangeListener() {
                public void stateChanged(ChangeEvent event) {
                    JSlider source = (JSlider) event.getSource();
                    NE.app_S.jsliderDNNRatio = (double) source.getValue();
                    if (text.getText().equalsIgnoreCase("")) {
                        return;
                    }
                    //
                    StringBuilder page = new StringBuilder().append("");
                    List<String> setsForGet = _A.parserMixedString(text.getText().trim());
                    Iterator<String> iterator = setsForGet.iterator();
                    String setOfi = new String();
                    String response = null;
                    response = sectionLocalDNN(setsForGet, iterator, setOfi);
                    //稍后新button 罗瑶光20230905
                    //dnn rank
                    JTextPane statistic = new JTextPane();
                    Map<String, Double> dNNrank = new IMV_SIQ();
                    AppButtonUtil_X_DNN.doRankDNN(statistic, response, pos, dNNrank, NE);
                    //DNN
                    showDataTagDNN(iterator, setsForGet, setOfi, page, response, dNNrank);
                }
            });
        this.add(sliderDNN);
    }
}

//Map<String, WordFrequency> map= new IMV_SIQ();
//iterator= setsForGet.iterator();
//Here:
//	while(iterator.hasNext()) {
//		setOfi= iterator.next();
//		if(pos.get(setOfi)== null) {
//			page.append("<span style=\"background:#F1F1F1\">"
//					+ "<font color=\"black\" size=\"5\">" 
//					+ setOfi+ "</font></span>");
//			continue Here;
//		}
//		if((pos.get(setOfi).contains("名")|| pos.get(setOfi).contains("动")
//				|| pos.get(setOfi).contains("形"))) {
//			if (map.containsKey(setOfi)) {
//				WordFrequency wordFrequency= map.get(setOfi);
//				wordFrequency.I_frequency(wordFrequency.get_frequency() 
//						+ S_Pos.INT_ONE);
//				map.put(setOfi, wordFrequency);
//			} else {
//				WordFrequency wordFrequency= new WordFrequency();
//				wordFrequency.I_frequency(S_Pos.INT_ONE);
//				wordFrequency.I_Word(setOfi);
//				map.put(setOfi, wordFrequency);
//			}
//		}
//		if (!setOfi.equals("")) {
//			if(response.contains(setOfi)&& setOfi.length()> 1) {
//				if(AppButtonUtil_X_DNN.doResponseContainsSetofI(NE.app_S
//						, pos, page, setOfi, dNNrank)) {
//					continue Here;
//				};
//			} 
//			if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")
//					||pos.get(setOfi).contains("动")
//					||pos.get(setOfi).contains("形"))) {
//				page.append("<span style=\"background:red\">"
//						+ "<font color=\"white\">"
//						+ setOfi+ "</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("名")) {
//				page.append("<span style=\"background:"
//						+ U_A.PEU.P.image.Color_P.P(255, 245, 255)
//						+ "\"><font color=\"black\" size=\"5\">"
//						+ setOfi+ "</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("动")) {
//				page.append("<span style=\"background:"
//						+ U_A.PEU.P.image.Color_P.P(245, 255, 245)
//						+ "\"><font color=\"black\" size=\"5\">"
//						+ setOfi+ "</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("形")) {
//				page.append("<span style=\"background:"
//						+ U_A.PEU.P.image.Color_P.P(255, 255, 245)
//						+ "\"><font color=\"black\" size=\"5\">"
//						+ setOfi+ "</font></span>");
//				continue Here;
//			}
//			if(pos.get(setOfi).contains("副")) {
//				page.append("<span style=\"background:#F1FFFF\">"
//						+ "<font color=\"black\" size=\"5\">"
//						+ setOfi+ "</font></span>");
//				continue Here;
//			} 
//			page.append("<span style=\"background:white\">"
//					+ "<font color=\"black\" size=\"5\">"+ setOfi
//					+ "</font></span>");			 
//		}
//	}	
//data.setText(page.toString());
//data.setSelectionStart(0);
//data.setSelectionEnd(0);
//data.validate();