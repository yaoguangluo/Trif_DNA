package ME.VPC.V.db;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import ME.VPC.M.app.App;
import V_A.SQ.ReadPinYinBihua;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unused")
/*
 * 著作权人, 作者 罗瑶光, 浏阳 yaoguangluo@outlook.com,
 * 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用） 15116110525-
 * 430181198505250014, G24402609, EB0581342 204925063,
 * 389418686, F2406501, 0626136 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路
 * 208号 阳光家园别墅小区 第十栋别墅
 */
public class ZhongYaoDictionaryFromDB {

	public List<String> txtToList() {
		List<String> dic_list = new ArrayList<>();

		return dic_list;
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public IMV_SIQ listToMap(List<String> dic_list) {
		IMV_SIQ dic_map = new IMV_SIQ();
		IMV_SIQ map = null;
		// for(int i=0; i<)
		String plsql = "setRoot:C:/DetaDB1;" + "baseName:ZYY;"
				+ "tableName:zybc:select;" + "condition:or:ID|<=|3000;";
		// "condition:or:ID|==|2;";
		try {
			map = M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		ArrayList list = (ArrayList) map.get("obj");
		Iterator<IMV_SIQ> iterator = list.iterator();
		return map;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public IMV_SIQ listToMap(IMV_SIQ dic_yw, IMV_SIQ dic_li, IMV_SIQ dic_hai,
			IMV_SIQ dic_xz, IMV_SIQ dic_ya, IMV_SIQ dic_jm, IMV_SIQ dic_xw,
			IMV_SIQ dic_cy, IMV_SIQ dic_jj, IMV_SIQ dic_zf, IMV_SIQ dic_cj,
			IMV_SIQ dic_yl, App NE) {
		IMV_SIQ dic_map = new IMV_SIQ();
		IMV_SIQ map = null;
		// for(int i=0; i<)
		// System.out.println("1");
		NE.app_S.appConfig.SectionJPanel.jTextPane.setText("1");
		String plsql = "setRoot:C:/DetaDB1;" + "baseName:ZYY;"
				+ "tableName:zybc:select;" + "condition:or:ID|<=|3000;";
		// "condition:or:ID|==|2;";
		try {
			map = M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E.E_PLSQL_E.E_PLSQL(plsql, true);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		ArrayList list = (ArrayList) map.get("obj");
		Iterator<IMV_SIQ> iterator = list.iterator();
		while (iterator.hasNext()) {
			IMV_SIQ hashmap = iterator.next();
			StringBuilder stringBuilder = new StringBuilder();
			if (hashmap.containsKey("rowValue")) {
				IMV_SIQ rowValue = (IMV_SIQ) hashmap.get("rowValue");
				String keyName = null;
				if (rowValue.containsKey("中药名称")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("中药名称");
					keyName = temp.get("culumnValue").toString();
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("常见药")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("常见药");
					String cj = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					cj = new FullDNATokenPDI().initonDeSect(cj);
					dic_cj.put(keyName, cj.replace("@Tin@", ":"));
					stringBuilder.append(cj);
				}
				if (rowValue.containsKey("搭配")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("搭配");
					String zf = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					zf = new FullDNATokenPDI().initonDeSect(zf);
					dic_zf.put(keyName, zf.replace("@Tin@", ":"));
					stringBuilder.append(zf);
				}
				if (rowValue.containsKey("愚按")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("愚按");
					String ya = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					ya = new FullDNATokenPDI().initonDeSect(ya);
					dic_ya.put(keyName, ya.replace("@Tin@", ":"));
					stringBuilder.append(ya);
				}
				if (rowValue.containsKey("崇源")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("崇源");
					String cy = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					cy = new FullDNATokenPDI().initonDeSect(cy);
					dic_cy.put(keyName, cy.replace("@Tin@", ":"));
					stringBuilder.append(cy);
				}
				if (rowValue.containsKey("经解")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("经解");
					String jj = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					jj = new FullDNATokenPDI().initonDeSect(jj);
					dic_jj.put(keyName, jj.replace("@Tin@", ":"));
					stringBuilder.append(jj);
				}
				if (rowValue.containsKey("经脉")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("经脉");
					String jm = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					jm = new FullDNATokenPDI().initonDeSect(jm);
					dic_jm.put(keyName, jm.replace("@Tin@", ":"));
					stringBuilder.append(jm);
				}
				if (rowValue.containsKey("性味")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("性味");
					String xw = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					xw = new FullDNATokenPDI().initonDeSect(xw);
					dic_xw.put(keyName, xw.replace("@Tin@", ":"));
					stringBuilder.append(xw);
				}
				if (rowValue.containsKey("用量")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("用量");
					String yl = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					// yl= new FullDNATokenPDI().initonDeSect(yl);
					dic_yl.put(keyName, yl.replace("@Tin@", ":"));
					stringBuilder.append(yl);
				}
				if (rowValue.containsKey("风险规避")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("风险规避");
					String hai = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					hai = new FullDNATokenPDI().initonDeSect(hai);
					dic_hai.put(keyName, hai.replace("@Tin@", ":"));
					stringBuilder.append(hai);
				}
				if (rowValue.containsKey("功效")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("功效");
					String li = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					li = new FullDNATokenPDI().initonDeSect(li);
					dic_li.put(keyName, li.replace("@Tin@", ":"));
					stringBuilder.append(li);
				}
				if (rowValue.containsKey("笔记原文")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("笔记原文");
					String yw = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					// yw= new FullDNATokenPDI().initonDeSect(yw);
					dic_yw.put(keyName, yw.replace("@Tin@", ":"));
					stringBuilder.append(yw);
				}
				if (rowValue.containsKey("中医馆药理")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("中医馆药理");
					String xz = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					xz = new FullDNATokenPDI().initonDeSect(xz);
					dic_xz.put(keyName, xz.replace("@Tin@", ":"));
					stringBuilder.append(xz);
				}

				dic_map.put(keyName,
						stringBuilder.toString().replace("@Tin@", ":"));
			}
		}
		return dic_map;
	}

	@SuppressWarnings("unchecked")
	public IMV_SIQ_ mapToIndex(IMV_SIQ_ dic_map) {
		// Map<String, String> pinyin = new IMV_SIQ();
		IMV_SIQ_ pinyin = ReadPinYinBihua.pinYin;
		IMV_SIQ_ dic_index = new IMV_SIQ_();
		Iterator<String> iter = dic_map.keySet().iterator();
		while (iter.hasNext()) {
			String index = iter.next().replaceAll(" ", "").replace("〔", "")
					.replace("〕", ":");
			StringBuilder stringBuilder = new StringBuilder();
			for (int l = 0; l < index.length(); l++) {
				if (pinyin.containsKey("" + index.charAt(l))) {
					stringBuilder
							.append("" + pinyin.getString("" + index.charAt(l))
									.toUpperCase().charAt(0));
				}
			}
			// med_name= stringBuilder.toString()+ ":"+ index;
			dic_index.put(index, stringBuilder.toString());
		}
		return dic_index;
	}
}
//194 //        try {
////            InputStream inputStreamp = new VerbalSource().getClass()
////                    .getResourceAsStream(S_File.PinYinCN_lyg);
////            InputStreamReader inputStreamReader = new InputStreamReader(inputStreamp, "UTF8");
////            DetaBufferedReader cReaderp = new DetaBufferedReader(inputStreamReader);
////            //index
////            String cInputStringp;
////            while ((cInputStringp = cReaderp.readDetaLine()) != null) {
////                String[] words = cInputStringp.split("->");
////                if (words.length > 1) {
////                    pinyin.put(words[0], words[1]);
////                }
////            }
////            cReaderp.close();
////        } catch (Exception e) {
////
////        }