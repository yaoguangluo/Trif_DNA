/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package M_V.ME.APM.VSQ.editPane;

import DSU.V.VtoV;
import E_A.OSI.AOP.PCS.PP.port_E.RestNLPPortImpl;
import ME.VPC.M.app.App;
import ME.VPC.V.appButton.AppButtonUtil_X_DNN;
import M_V.MSU.AMS.VQS.SQV.SI.OSU.SMV.http.RestCall_X_backEndRequest;
import P.image.Color_P;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ_SS;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_stringToURIencode;
import U_V.ESU.string.String_ESU_X_uRIencodeToURIdecode;

import javax.swing.JTextPane;
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
public class EditPane_X_OS extends EditPane_X_ {

    public EditPane_X_OS(JTextPane text, App app_NE) {
        super(text, app_NE);
        NE = app_NE;
        // TODO Auto-generated constructor stub
    }

    

    public String sectionDNN(List<String> setsForGet, Iterator<String> iterator
        , String setOfi) {
        setsForGet = _A.parserMixedString(text.getText().trim());
        iterator = setsForGet.iterator();
        if (text.getSelectedText() != null
            && !text.getSelectedText().trim().isEmpty()) {
            iterator = setsForGet.iterator();
        }
        text.setSelectionStart(0);
        text.setSelectionEnd(0);
        int times = 0;
        while (times++ < 1000 && iterator.hasNext()) {
            setOfi += iterator.next();
        }
        String response = "";
        String keyCache = setOfi.length() > 30 ? setOfi.substring(0, 30)
            : setOfi.substring(0, setOfi.length() - 1);
        if (!NE.app_S.CacheString.containsKey(keyCache)) {
            String string = String_ESU_X_charsetSwap._E(setOfi
                , "UTF8", "UTF8");
            String encode = String_ESU_X_stringToURIencode._E(string, "UTF8");
            response = RestCall_X_backEndRequest._E(encode);
            String[] strings = response.split("\"");
            response = strings.length > 3 ? strings[3] : "";
            response = String_ESU_X_uRIencodeToURIdecode._E(response, "UTF8");
            if (NE.app_S.CacheStringPiple.size() < 301) {//buman
                NE.app_S.CacheString.put(keyCache, response);
                NE.app_S.CacheStringPiple.add(0, keyCache);
            } else {//man
                NE.app_S.CacheString.put(keyCache, response);
                NE.app_S.CacheStringPiple.add(0, keyCache);
                NE.app_S.CacheString.remove(
                    NE.app_S.CacheStringPiple.get(300));
                NE.app_S.CacheStringPiple.remove(300);
            }
        } else {
            response = NE.app_S.CacheString.getString(keyCache);
        }
        return response;
    }

    public String sectionLocalDNN(List<String> setsForGet, Iterator<String> iterator
        , String setOfi) {
        setsForGet = _A.parserMixedString(text.getText().trim());
        iterator = setsForGet.iterator();
        if (text.getSelectedText() != null && !text.getSelectedText().trim().isEmpty()) {
            iterator = setsForGet.iterator();
        }
        text.setSelectionStart(0);
        text.setSelectionEnd(0);
        int times = 0;
        while (times++ < 1000 && iterator.hasNext()) {
            setOfi += iterator.next();
        }
        String response = "";
        String keyCache = setOfi.length() > 30 ? setOfi.substring(0, 30)
            : setOfi.substring(0, setOfi.length() - 1);
        if (NE.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2515.isSelected()) {
            if (NE.app_S.CacheString.containsKey(keyCache)) {
                response = NE.app_S.CacheString.getString(keyCache);
            } else {
                String string = String_ESU_X_charsetSwap._E(setOfi, "UTF8", "UTF8");
                String encode = String_ESU_X_stringToURIencode._E(string, "UTF8");
                //response= RestCall_X_backEndRequest._E(encode);
                response = VtoV.ObjectToJsonString(RestNLPPortImpl.dataCG(encode, NE));
                String[] strings = response.split("\"");
                response = strings.length > 3 ? strings[3] : "";
                response = String_ESU_X_uRIencodeToURIdecode._E(response, "UTF8");
                if (NE.app_S.CacheStringPiple.size() < 301) {//buman
                    NE.app_S.CacheString.put(keyCache, response);
                    NE.app_S.CacheStringPiple.add(0, keyCache);
                } else {//man
                    NE.app_S.CacheString.put(keyCache, response);
                    NE.app_S.CacheStringPiple.add(0, keyCache);
                    NE.app_S.CacheString.remove(NE.app_S.CacheStringPiple.get(300));
                    NE.app_S.CacheStringPiple.remove(300);
                }
            }
        } else {//shaohousuojin
            String string = String_ESU_X_charsetSwap._E(setOfi
                , "UTF8", "UTF8");
            //String encode= String_ESU_X_stringToURIencode._E(string, "UTF8");
            //response= RestCall_X_backEndRequest._E(encode);
            response = VtoV.ObjectToJsonString(RestNLPPortImpl.dataCG(string, NE));
            String[] strings = response.split("\"");
            response = strings.length > 3 ? strings[3] : "";
            response = String_ESU_X_uRIencodeToURIdecode._E(response, "UTF8");
            if (NE.app_S.CacheStringPiple.size() < 301) {//buman
                NE.app_S.CacheString.put(keyCache, response);
                NE.app_S.CacheStringPiple.add(0, keyCache);
            } else {//man
                NE.app_S.CacheString.put(keyCache, response);
                NE.app_S.CacheStringPiple.add(0, keyCache);
                NE.app_S.CacheString.remove(
                    NE.app_S.CacheStringPiple.get(300));
                NE.app_S.CacheStringPiple.remove(300);
            }
        }
        return response;
    }

    public void showDataTagDNN(Iterator<String> iterator, List<String> setsForGet
        , String setOfi, StringBuilder page, String response
        , Map<String, Double> dNNrank) {
        IMV_SIQ_SS map = new IMV_SIQ_SS();
        iterator = setsForGet.iterator();
        NE.app_S.listCharPosition = 0;
        Here:
        while (iterator.hasNext()) {
            NE.app_S.listCharPosition++;
            setOfi = iterator.next();
            if (pos.get(setOfi) == null) {
                page.append("<span style=\"background:#F1F1F1\">"
                    + "<font color=\"black\""
                    + " size=\"" + NE.app_S.size_font_rot + "\">"
                    + setOfi + "</font></span>");
                continue Here;
            }
            if ((S_Maps.mingCi.containsKey(setOfi) || S_Maps.dongCi.containsKey(setOfi)
                || S_Maps.xingRongCi.containsKey(setOfi))) {
                if (map.containsKey(setOfi)) {
                    WordFrequency wordFrequency = map.getW(setOfi);
                    wordFrequency.I_frequency(wordFrequency.get_frequency() + S_Pos.INT_ONE);
                    wordFrequency.positions.add(NE.app_S.listCharPosition);
                    map.put(setOfi, wordFrequency);
                } else {
                    WordFrequency wordFrequency = new WordFrequency(1.0, setOfi);
                    wordFrequency.positions.add(NE.app_S.listCharPosition);
                    map.put(setOfi, wordFrequency);
                }
            }
            if (!setOfi.equals("")) {
                if (response.contains(setOfi) && setOfi.length() > 1) {
                    if (AppButtonUtil_X_DNN.doResponseContainsSetofI(page
                        , setOfi, dNNrank, NE)) {
                        continue Here;
                    }
                    ;
                }
                if (key.contains(setOfi) && (S_Maps.mingCi.containsKey(setOfi)
                    || S_Maps.dongCi.containsKey(setOfi)
                    || S_Maps.xingRongCi.containsKey(setOfi))) {
                    page.append("<span style=\"background:red\">"
                        + "<font color=\"white\">"
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
                    page.append("<span style=\"background:#F1FFFF\">"
                        + "<font color=\"black\""
                        + " size=\"" + NE.app_S.size_font_rot + "\">"
                        + setOfi + "</font></span>");
                    continue Here;
                }
                page.append("<span style=\"background:white\">"
                    + "<font color=\"black\""
                    + " size=\"" + NE.app_S.size_font_rot + "\">"
                    + setOfi
                    + "</font></span>");
            }
        }
        data.setText(page.toString());
        data.setSelectionStart(0);
        data.setSelectionEnd(0);
        data.validate();
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

//156 //                    WordFrequency wordFrequency = new WordFrequency();
////                    wordFrequency.I_frequency(1.0);
////                    wordFrequency.I_Word(setOfi);