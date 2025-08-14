package ME.VPC.E.sleeper;

import ME.VPC.M.app.App;
import ME.VPC.S.buttons.Page_X_S_sButtonsreading;
import ME.VPC.S.ne.WindowsUI;
import ME.VPC.V.ET.XynkPage_X_S_sListeners;
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
public class XynkPage extends XynkPage_X_S_sListeners {
    

    public XynkPage(JTextPane text, App NE) {
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

    public JTextPane data(App NE) {
//        data = new JTextPane();
//        data.setBounds(850, 150, WindowsUI.basicWidth - 600, 800 - 70);
//        data.setBackground(new Color(210, 210, 210));
//        buttonSum = new DetaButton("共有 " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " 页");
//        buttonSum.setBounds(0, 0, 100, 30);
//        buttonCrt = new DetaButton("当前页面：" + (currentPage + 1));
//        buttonCrt.setBounds(120, 0, 150, 30);
//
////        buttonPrev = Page_X_S_sButtonsrollback.data_X_rollback(this
////                , 290, 0, 100, 30, 2000);
////        buttonNext = Page_X_S_sButtonsrollafter.data_X_rollafter(this
////                , 410, 0, 100, 30, 2000);
//        buttonPrev = Page_X_S_sButtonsrollback.data_X_rollback(this
//            , 2000);
//        buttonNext = Page_X_S_sButtonsrollafter.data_X_rollafter(this
//            , 2000);
//        buttonCTE = Page_X_S_sButtonsenglish.data_X_english(this
//                , 630, 0, 100, 30, 2000);
//        buttonFRS = Page_X_S_sButtonschinese.data_X_chinese(this
//                , 520, 0, 100, 30, 2000);
//        buttonETC = Page_X_S_sButtonssymnorine.data_X_symnorine(this
//                , 740, 0, 100, 30, 2000);
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
            AppButtonUtil_X_DNN_Page.pageDNN(page, sets, currentPage, app_S, table
                , row, key, buttonSum, buttonCrt, data, statistic, "中药", NE);
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
        //
        //dnn游标
        JSlider sliderDNN = new JSlider(0, 25);
        sliderDNN.setSnapToTicks(true);
        sliderDNN.setPaintTicks(true);
        sliderDNN.setMajorTickSpacing(5);
        sliderDNN.setMinorTickSpacing(1);
        sliderDNN.addChangeListener(
            event -> {
                JSlider source = (JSlider) event.getSource();
                app_S.jsliderDNNRatio = (double) source.getValue();
                if (null == sets) {
                    return;
                }
                if (text.getText().length() > 5000) {
                    return;
                }
                StringBuilder page = new StringBuilder().append("");
                AppButtonUtil_X_DNN_Classify.classifyDNN(page
                    , sets, currentPage, table, row, key
                    , buttonSum, buttonCrt, data, statistic, "西药", NE);
            });
        //
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
        buttonBox.add(buttonKSLJB);
        buttonBox.add(sliderDNN);
        buttonBox.setBounds(5 + 800 - 650, 290 + 100 - 80 + 200 - 260 + 120, 950 + 220, 20);
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

//DetaButton buttonKSLJ= new DetaButton("中药DNN");
//buttonKSLJ.setBounds(990, 0, 115, 30);
//buttonKSLJ.addActionListener(new ActionListener() {
//	public void actionPerformed(ActionEvent e) {
//		if(null== sets) {
//			return;
//		}
//		if(text.getText().length()>5000) {
//			return;
//		}
//		StringBuilder page= new StringBuilder().append("");
//		List<String> setsForGet= sets.subList(currentPage * 2000, (currentPage + 1)
//		*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
//		Iterator<String> iterator= setsForGet.iterator();
//		String setOfi= "";
//		int times= 0;
//		while(times++<1000&& iterator.hasNext()) {
//			setOfi += iterator.next();
//		}
//		String response= "";
//		String keyCache= setOfi.length()> 30? setOfi.substring(0, 30)
//		: setOfi.substring(0, setOfi.length()- 1);
//		if(!u.CacheString.containsKey(keyCache)) {
//			try {
//				String string= String_ESU_X_charsetSwap._E(setOfi, "UTF8", "UTF8");
//				String encode= String_ESU_X_stringToURIencode._E(string, "UTF8");
//				response= RestCall_X_backEndRequest._E(encode);
//				String[] strings= response.split("\"");
//				response= strings.length> 3? strings[3]: "";
//				response= String_ESU_X_uRIencodeToURIdecode._E(response, "UTF8");
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
//			if(u.CacheStringPiple.size()< 301) {//buman
//				u.CacheString.put(keyCache, response);
//				u.CacheStringPiple.add(0, keyCache);
//			}else {//man
//				u.CacheString.put(keyCache, response);
//				u.CacheStringPiple.add(0, keyCache);
//				u.CacheString.remove(u.CacheStringPiple.get(300));
//				u.CacheStringPiple.remove(300);
//			}
//		}else {
//			response=u.CacheString.get(keyCache);
//		}
//		//dnn森林
//		try {
//			String[] dnn= response.replace("\r\n", "<br/>").split("<br/>");
//			u.coAuthorForWord.bootDetaDnnFlowerForest(app_S
//			, table.getValueAt(row, 2).toString(), dnn, true);
//			//(this.u.table.getValueAt(row, 2).toString(), false);
//		}catch(Exception e1) {
//			validate();
//		}
//		
//		Map<String, WordFrequency> map= new IMV_SIQ();
//		iterator= setsForGet.iterator();
//		Here:
//			while(iterator.hasNext()) {
//				setOfi= iterator.next();
//				if(pos.get(setOfi)== null) {
//					page.append(
//					"<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">"
//					+ setOfi + "</font></span>");
//					continue Here;
//				}
//				if((pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")
//				||pos.get(setOfi).contains("形"))) {
//					if (map.containsKey(setOfi)) {
//						WordFrequency wordFrequency= map.get(setOfi);
//						wordFrequency.I_frequency(wordFrequency.get_frequency() + S_POS.INT_ONE);
//						map.put(setOfi, wordFrequency);
//					} else {
//						WordFrequency wordFrequency= new WordFrequency();
//						wordFrequency.I_frequency(S_POS.INT_ONE);
//						wordFrequency.I_Word(setOfi);
//						map.put(setOfi, wordFrequency);
//					}
//				}
//				if (!setOfi.equals("")) {
//					if(response.contains(setOfi)&& setOfi.length()> 1) {
//						page.append("<span style=\"background:"+new PEU.P.image.Color_P()
//						.P(255, 145, 255)+"\"><font color=\"black\" size=\"5\">"
//						+setOfi+"</font></span>");
//						continue Here;
//					} 
//					if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")
//					||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
//						page.append("<span style=\"background:red\"><font color=\"white\">"
//						+setOfi+"</font></span>");
//						continue Here;
//					}
//					if(pos.get(setOfi).contains("名")) {
//						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
//						+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
//						continue Here;
//					}
//					if(pos.get(setOfi).contains("动")) {
//						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
//						+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
//						continue Here;
//					}
//					if(pos.get(setOfi).contains("形")) {
//						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
//						+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
//						continue Here;
//					}
//					if(pos.get(setOfi).contains("副")) {
//						page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"
//						+setOfi+"</font></span>");
//						continue Here;
//					} 
//					page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"
//					+setOfi+"</font></span>");
//				}
//			}	
//		buttonSum.setText("共有 " + (sets== null ? 0 : (1 + sets.size() / 2001)) + " 页");
//		buttonCrt.setText("当前页面：" + (sets== null? 0 : 1));
//		data.setText(page.toString());
//		data.setSelectionStart(0);
//		data.setSelectionEnd(0);
//		data.validate();//		//
//		try {
//			statistic.setSize(500, 800);
//			//Map<Integer, WordFrequency> fwa= _A.sortWordFrequencyMapToSortMap(map);
//			statistic.setContentType("text/html");
//			StringBuilder stringBuilder= new StringBuilder();
//			String[] fwa= response.replace("\r\n", "<br/>").split("<br/>");
//			Here:
//				for (int i= fwa.length-1; i > 0; i--) {
//					if (fwa[i]!= null) {
//						if(pos.get(fwa[i].split(":")[0])== null) {
//							stringBuilder.append("<div style=\"background:black\"><font color=\"white\">"
//							+fwa[i] + "</font></div>");
//							continue Here;
//						}
//						if(pos.get(fwa[i].split(":")[0]).contains("名")) {
//							stringBuilder.append( "<div style=\"background:#FF44FF\"><font color=\"white\">"
//							+ fwa[i] +"</font></div>");
//							continue Here;
//						}
//						if(pos.get(fwa[i].split(":")[0]).contains("动")) {
//							stringBuilder.append(
//							"<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">"
//							+ fwa[i] +"</font></div>");
//							continue Here;
//						}
//						if(pos.get(fwa[i].split(":")[0]).contains("形")) {
//							stringBuilder.append(
//							"<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">"
//							+ fwa[i] +"</font></div>");
//						}
//					}
//				}	
//			statistic.setText(stringBuilder.toString());
//			statistic.setSelectionStart(0);
//			statistic.setSelectionEnd(0);
//			statistic.validate();
//		}catch(Exception e1){	
//			statistic.validate();
//		}          
//	}
//});

//DetaButton buttonKSLJB= new DetaButton("西药DNN");
//buttonKSLJB.setBounds(990+ 115+ 7, 0, 115, 30);
//buttonKSLJB.addActionListener(new ActionListener() {
//	public void actionPerformed(ActionEvent e) {
//		if(null== sets) {
//			return;
//		}
//		if(text.getText().length()>5000) {
//			return;
//		}
//		StringBuilder page= new StringBuilder().append("");
//		List<String> setsForGet= sets.subList(currentPage * 2000, (currentPage + 1)
//		*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
//		Iterator<String> iterator= setsForGet.iterator();
//		String setOfi= "";
//		int times= 0;
//		while(times++<1000&& iterator.hasNext()) {
//			setOfi += iterator.next();
//		}
//		String response= "";
//		String keyCache= setOfi.length()> 30? setOfi.substring(0, 30)
//		: setOfi.substring(0, setOfi.length()- 1);
//		if(!u.CacheString.containsKey(keyCache)) {
//			try {
//				String string= String_ESU_X_charsetSwap._E(setOfi, "UTF8", "UTF8");
//				String encode= String_ESU_X_stringToURIencode._E(string, "UTF8");
//				response= RestCall_X_backEndRequest._E(encode);
//				String[] strings= response.split("\"");
//				response= strings.length> 3? strings[3]: "";
//				response= String_ESU_X_uRIencodeToURIdecode._E(response, "UTF8");
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}
//			if(u.CacheStringPiple.size()< 301) {//buman
//				u.CacheString.put(keyCache, response);
//				u.CacheStringPiple.add(0, keyCache);
//			}else {//man
//				u.CacheString.put(keyCache, response);
//				u.CacheStringPiple.add(0, keyCache);
//				u.CacheString.remove(u.CacheStringPiple.get(300));
//				u.CacheStringPiple.remove(300);
//			}
//		}else {
//			response=u.CacheString.get(keyCache);
//		}
//		//dnn森林
//		try {
//			String[] dnn= response.replace("\r\n", "<br/>").split("<br/>");
//			u.coAuthorForWord.bootDetaBingMingDnnFlowerForest(app_S
//			, table.getValueAt(row, 2).toString(), dnn, true);
//			//(this.u.table.getValueAt(row, 2).toString(), false);
//		}catch(Exception e1) {
//			validate();
//		}
//		
//		Map<String, WordFrequency> map= new IMV_SIQ();
//		iterator= setsForGet.iterator();
//		Here:
//			while(iterator.hasNext()) {
//				setOfi= iterator.next();
//				if(pos.get(setOfi)== null) {
//					page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">"
//					+ setOfi + "</font></span>");
//					continue Here;
//				}
//				if((pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")
//				||pos.get(setOfi).contains("形"))) {
//					if (map.containsKey(setOfi)) {
//						WordFrequency wordFrequency= map.get(setOfi);
//						wordFrequency.I_frequency(wordFrequency.get_frequency() + S_POS.INT_ONE);
//						map.put(setOfi, wordFrequency);
//					} else {
//						WordFrequency wordFrequency= new WordFrequency();
//						wordFrequency.I_frequency(S_POS.INT_ONE);
//						wordFrequency.I_Word(setOfi);
//						map.put(setOfi, wordFrequency);
//					}
//				}
//				if (!setOfi.equals("")) {
//					if(response.contains(setOfi)&& setOfi.length()> 1) {
//						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 145, 255)
//						+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
//						continue Here;
//					} 
//					if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")
//					||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
//						page.append("<span style=\"background:red\"><font color=\"white\">"
//						+setOfi+"</font></span>");
//						continue Here;
//					}
//					if(pos.get(setOfi).contains("名")) {
//						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 245, 255)
//						+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
//						continue Here;
//					}
//					if(pos.get(setOfi).contains("动")) {
//						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(245, 255, 245)
//						+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
//						continue Here;
//					}
//					if(pos.get(setOfi).contains("形")) {
//						page.append("<span style=\"background:"+new PEU.P.image.Color_P().P(255, 255, 245)
//						+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
//						continue Here;
//					}
//					if(pos.get(setOfi).contains("副")) {
//						page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"
//						+setOfi+"</font></span>");
//						continue Here;
//					} 
//					page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"
//					+setOfi+"</font></span>");
//				}
//			}	
//		buttonSum.setText("共有 " + (sets== null ? 0 : (1 + sets.size() / 2001)) + " 页");
//		buttonCrt.setText("当前页面：" + (sets== null? 0 : 1));
//		data.setText(page.toString());
//		data.setSelectionStart(0);
//		data.setSelectionEnd(0);
//		data.validate();//		//
//		try {
//			statistic.setSize(500, 800);
//			//Map<Integer, WordFrequency> fwa= _A.sortWordFrequencyMapToSortMap(map);
//			statistic.setContentType("text/html");
//			StringBuilder stringBuilder= new StringBuilder();
//			String[] fwa= response.replace("\r\n", "<br/>").split("<br/>");
//			Here:
//				for (int i= fwa.length-1; i > 0; i--) {
//					if (fwa[i]!= null) {
//						if(pos.get(fwa[i].split(":")[0])== null) {
//							stringBuilder.append(
//							"<div style=\"background:black\"><font color=\"white\">"
//							+fwa[i] + "</font></div>");
//							continue Here;
//						}
//						if(pos.get(fwa[i].split(":")[0]).contains("名")) {
//							stringBuilder.append(
//							"<div style=\"background:#FF44FF\"><font color=\"white\">"
//							+ fwa[i] +"</font></div>");
//							continue Here;
//						}
//						if(pos.get(fwa[i].split(":")[0]).contains("动")) {
//							stringBuilder.append(
//							"<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">"
//							+ fwa[i] +"</font></div>");
//							continue Here;
//						}
//						if(pos.get(fwa[i].split(":")[0]).contains("形")) {
//							stringBuilder.append(
//							"<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">"
//							+ fwa[i] +"</font></div>");
//						}
//					}
//				}	
//			statistic.setText(stringBuilder.toString());
//			statistic.setSelectionStart(0);
//			statistic.setSelectionEnd(0);
//			statistic.validate();
//		}catch(Exception e1){	
//			statistic.validate();
//		}          
//	}
//});