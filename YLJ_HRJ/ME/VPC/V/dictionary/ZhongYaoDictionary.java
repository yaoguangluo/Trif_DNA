package ME.VPC.V.dictionary;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import exception.file.O.DetaBufferedReader;
import S_A.SVQ.stable.S_File;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;

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
@SuppressWarnings("unchecked")
public class ZhongYaoDictionary extends Dictionary_S {
	public List<String> txtToList() {
		dic_list = new ArrayList<>();
		DetaBufferedReader cReader = FastReadProjectFile.getDetaBufferedReader(
				S_File.bcqj_txt, "DetaResources/books/", "UTF8");
		String ctempString = null;
		try {
			while ((ctempString = cReader.readDetaLine()) != null) {
				if (!ctempString.replace(" ", "").equals(""))
					dic_list.add(ctempString);
			}
			cReader.closeDeta();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dic_list;
	}

	public IMV_SIQ_ listToMap(List<String> dic_list, App NE) {
		int medCount = 0;
		dic_map = new IMV_SIQ_();
		for (int i = 0; i < dic_list.size(); i++) {
			if (dic_list.get(i).contains("摘要")) {
				if (i + 3 < dic_list.size()) {
					String med_name = dic_list.get(i + 3).replace("[中药名称]", "");
					String med_text = "";
					int j = i + 2;
					while (++j < dic_list.size()
							&& !dic_list.get(j).contains("摘要")) {
						med_text += "\n" + dic_list.get(j);
					}
					medCount++;
					med_name = med_name.replaceAll(" ", "").replace("〔", "")
							.replace("〕", ":");
					if (!dic_map.containsKey(med_name)) {
						dic_map.put(med_name, med_text + "〕〕");
					} else {
						dic_map.put(med_name, dic_map.get(med_name) + "叠加："
								+ med_text + "〕〕");
					}
				}
			}
		}
		if (null == NE.app_S) {
			return null;// fatal trif
		}
		NE.app_S.appConfig.SectionJPanel.jTextPane
				.setText("录入药食同源共计:" + medCount + "味");
		return dic_map;
	}

	public IMV_SIQ mapToMap_yw(IMV_SIQ dic_map) {
		dic_yw = new IMV_SIQ();
		iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for (int i = 0; i < copy.size(); i++) {
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString()
					.replace("\n", "");
			Pattern p = Pattern.compile("笔记原文(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("笔记原文]", "").replace("[", ".");
			}
			med_name = med_name.replaceAll("\\s*", "").replace("〔", "")
					.replace("〕", ":");
			if (!dic_yw.containsKey(med_name)) {
				dic_yw.put(med_name, temp.replaceAll("\\s*", "")
						.replace("〔", "").replace("〕", ":"));
			} else {
				dic_yw.put(med_name,
						dic_yw.get(med_name) + "叠加："
								+ temp.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"));
			}
		}
		return dic_yw;
	}

	public IMV_SIQ mapToMap_li(IMV_SIQ dic_map) {
		dic_li = new IMV_SIQ_();// later trif constant problem
		iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for (int i = 0; i < copy.size(); i++) {
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString()
					.replace("\n", "");
			Pattern p = Pattern.compile("功效(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("功效]", "").replace("[", ".");
			}
			med_name = med_name.replaceAll("\\s*", "").replace("〔", "")
					.replace("〕", ":");
			if (!dic_li.containsKey(med_name)) {
				dic_li.put(med_name, temp.replaceAll("\\s*", "")
						.replace("〔", "").replace("〕", ":"));
			} else {
				dic_li.put(med_name,
						dic_li.get(med_name) + "叠加："
								+ temp.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"));
			}
		}
		return dic_li;// later trif
	}

	public IMV_SIQ mapToMap_hai(IMV_SIQ dic_map) {
		dic_hai = new IMV_SIQ();
		iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for (int i = 0; i < copy.size(); i++) {
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name.trim()).toString()
					.replace("\n", "");
			Pattern p = Pattern.compile("风险规避(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("风险规避]", "").replace("[", "");
			}
//			if(!dic_hai.containsKey(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"))) {
//				dic_hai.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
//						, temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
//	//			}
//            med_name = med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":");
			if (!dic_hai.containsKey(med_name)) {
				dic_hai.put(med_name, temp.replaceAll("\\s*", "")
						.replace("〔", "").replace("〕", ":"));
			} else {
				dic_hai.put(med_name,
						dic_hai.get(med_name) + "叠加："
								+ temp.replaceAll("\\s*", "").replace("〔", "")
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
			Pattern p = Pattern.compile("中医馆药理(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("中医馆药理]", "").replace("[", "");
			}
//			if(!dic_xz.containsKey(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"))) {
//				dic_xz.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
//						, temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
//			}
			med_name = med_name.replaceAll("\\s*", "").replace("〔", "")
					.replace("〕", ":");
			if (!dic_xz.containsKey(med_name)) {
				dic_xz.put(med_name, temp.replaceAll("\\s*", "")
						.replace("〔", "").replace("〕", ":"));
			} else {
				dic_xz.put(med_name,
						dic_xz.get(med_name) + "叠加："
								+ temp.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"));
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
			String med_text = dic_map.get(med_name).toString().replace("\n",
					"");
			Pattern p = Pattern.compile("搭配(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("搭配]", "").replace("[", "");
			}
			dic_zf.put(
					med_name.replaceAll("\\s*", "").replace("〔", "")
							.replace("〕", ":"),
					temp.replaceAll("\\s*", "").replace("〔", "").replace("〕",
							":"));
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
			String med_text = dic_map.get(med_name).toString().replace("\n",
					"");
			Pattern p = Pattern.compile("常见药(.*?)药小节完");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0).replace("常见药]", "");
			}
			dic_cj.put(
					med_name.replaceAll("\\s*", "").replace("〔", "")
							.replace("〕", ":"),
					temp.replaceAll("\\s*", "").replace("〔", "").replace("〕",
							":"));
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
			String med_text = dic_map.get(med_name).toString().replace("\n",
					"");
			Pattern p = Pattern.compile("经解(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("经解]", "").replace("[", "");
			}
			dic_jj.put(
					med_name.replaceAll("\\s*", "").replace("〔", "")
							.replace("〕", ":"),
					temp.replaceAll("\\s*", "").replace("〔", "").replace("〕",
							":"));
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
			String med_text = dic_map.get(med_name).toString().replace("\n",
					"");
			Pattern p = Pattern.compile("崇源(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("崇源]", "").replace("[", "");
			}
			dic_cy.put(
					med_name.replaceAll("\\s*", "").replace("〔", "")
							.replace("〕", ":"),
					temp.replaceAll("\\s*", "").replace("〔", "").replace("〕",
							":"));
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
			String med_text = dic_map.get(med_name).toString().replace("\n",
					"");
			Pattern p = Pattern.compile("愚按(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("愚按]", "").replace("[", "");
			}
			dic_ya.put(
					med_name.replaceAll("\\s*", "").replace("〔", "")
							.replace("〕", ":"),
					temp.replaceAll("\\s*", "").replace("〔", "").replace("〕",
							":"));
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
			String med_text = dic_map.get(med_name).toString().replace("\n",
					"");
			Pattern p = Pattern.compile("经脉/经络(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("经脉/经络]", "").replace("[", "");
			}
			dic_jm.put(
					med_name.replaceAll("\\s*", "").replace("〔", "")
							.replace("〕", ":"),
					temp.replaceAll("\\s*", "").replace("〔", "").replace("〕",
							":"));
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
			String med_text = dic_map.get(med_name).toString().replace("\n",
					"");
			Pattern p = Pattern.compile("性味(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("性味]", "").replace("[", "");
			}
			// if(!dic_xw.containsKey(med_name.replaceAll("\\s*",
			// "").replace("〔", "").replace("〕", ":"))) {
			// dic_xw.put(med_name.replaceAll("\\s*", "").replace("〔",
			// "").replace("〕", ":")
			// , temp.replace("经络", "").replaceAll("\\s*",
			// "").replace("〔", "").replace("〕", ":"));
			med_name = med_name.replaceAll("\\s*", "").replace("〔", "")
					.replace("〕", ":");
			if (!dic_xw.containsKey(med_name)) {
				dic_xw.put(med_name, temp.replaceAll("\\s*", "")
						.replace("〔", "").replace("〕", ":"));
			} else {
				dic_xw.put(med_name,
						dic_xw.get(med_name) + "叠加："
								+ temp.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"));
			}
		}
		return dic_xw;
	}

	public IMV_SIQ mapToMap_yl(IMV_SIQ dic_map, IMV_SIQ dic_xw, IMV_SIQ dic_li,
			IMV_SIQ dic_xz, IMV_SIQ dic_jm) {
		dic_yl = new IMV_SIQ();
		iter = dic_map.keySet().iterator();
		copy = new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for (int i = 0; i < copy.size(); i++) {
			String med_name = copy.get(i);
			String med_text = dic_map.get(med_name).toString().replace("\n",
					"");
			Pattern p = Pattern.compile("用量-克-别名-其他-备注(.*?)\\[");
			Matcher m = p.matcher(med_text);
			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				temp = temp.replace("用量/克-别名-其他-备注]", "").replace("[", "");
			}
//			if(!dic_yl.containsKey(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"))) {
//				dic_yl.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")
//						, temp.replace("经络", "").replaceAll("\\s*", "").replace("〔", "").replace("〕", ":")+":");
//			}
			med_name = med_name.replaceAll("\\s*", "").replace("〔", "")
					.replace("〕", ":");
			if (!dic_yl.containsKey(med_name)) {
				dic_yl.put(med_name, temp.replaceAll("\\s*", "")
						.replace("〔", "").replace("〕", ":"));
			} else {
				dic_yl.put(med_name,
						dic_yl.get(med_name) + "叠加："
								+ temp.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"));
			}
		}
		return dic_yl;
	}
}

//77
//public IMV_SIQ mapToIndex(IMV_SIQ dic_map, App NE) {
//pinyin = new IMV_SIQ();
//
////InputStream inputStreamp= new VerbalSource().getClass().getResourceAsStream(S_File.PinYinCN_lyg);
////DetaBufferedReader cReaderp= new DetaBufferedReader(DetaInputStreamReader.E(inputStreamp, "UTF8"));
//
//DetaBufferedReader cReaderp = FastReadProjectFile.getDetaBufferedReader(
//		S_File.PinYinCN_lyg, NE.resourceTail + "lygs/",
//		S_Pos.UTF8_STRING);
//try {
//	// index
//	String cInputStringp;
//	while ((cInputStringp = cReaderp.readDetaLine()) != null) {
//		String[] words = cInputStringp.split("->");
//		if (words.length > 1) {
//			pinyin.put(words[0], words[1]);
//		}
//	}
//	cReaderp.close();
//} catch (Exception e) {
//	e.printStackTrace();
//}
//dic_index = new IMV_SIQ();
//iter = dic_map.keySet().iterator();
//while (iter.hasNext()) {
//	String index = iter.next().replaceAll(" ", "").replace("〔", "")
//			.replace("〕", ":");
//	StringBuilder stringBuilder = new StringBuilder();
//	for (int l = 0; l < index.length(); l++) {
//		if (pinyin.containsKey("" + index.charAt(l))) {
//			stringBuilder
//					.append("" + pinyin.getString("" + index.charAt(l))
//							.toUpperCase().charAt(0));
//		}
//	}
//	// med_name= stringBuilder.toString()+ ":"+ index;
//	dic_index.put(index, stringBuilder.toString());
//}
//return dic_index;
//}