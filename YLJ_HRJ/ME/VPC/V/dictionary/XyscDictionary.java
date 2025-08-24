package ME.VPC.V.dictionary;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.SVQ.stable.S_File;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;
import YLJ_HRJ.ME.VPC.S.books.BookIndex;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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
public class XyscDictionary extends Dictionary_S {
	@SuppressWarnings("unchecked")
	public void txtToMap(IMV_SIQ dic_yao_ming, IMV_SIQ dic_chengfen_danwei,
			IMV_SIQ dic_yong_fa, IMV_SIQ dic_yao_li, IMV_SIQ dic_zhu_yi,
			IMV_SIQ dic_shi_ying, IMV_SIQ dic_bu_liang_fan_ying,
			IMV_SIQ dic_yao_wu_xiang_hu_zuo_yong, IMV_SIQ dic_qi_ta,
			IMV_SIQ dic_yong_liang, IMV_SIQ dic_jie_shao) {
		InputStream in = new BookIndex().getClass().getResourceAsStream(
				S_File._127xiYiChangYongYaoPinGongNengZhuZhi_txt);
		DetaBufferedReader cReader = new DetaBufferedReader(
				DetaInputStreamReader.E(in, "UTF-8"));
		String ctempString = null;
		while ((ctempString = cReader.readDetaLine()) != null) {
			if (!ctempString.replace(" ", "").equals("")) {
				String temps[] = ctempString.split("：");
				dic_yao_ming.put(temps[0].split("、")[1], 1);
				dic_yao_li.put(temps[0].split("、")[1], "");
				dic_chengfen_danwei.put(temps[0].split("、")[1], "");
				dic_yong_fa.put(temps[0].split("、")[1], "");
				dic_zhu_yi.put(temps[0].split("、")[1], "");
				dic_shi_ying.put(temps[0].split("、")[1], temps[1]);
				dic_bu_liang_fan_ying.put(temps[0].split("、")[1], "");
				dic_yao_wu_xiang_hu_zuo_yong.put(temps[0].split("、")[1], "");
				dic_qi_ta.put(temps[0].split("、")[1], "");
				dic_yong_liang.put(temps[0].split("、")[1], "");
				dic_jie_shao.put(temps[0].split("、")[1], "");
			}
		}
		cReader.closeDeta();
		try {
			in.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		in = new BookIndex().getClass()
				.getResourceAsStream(S_File.xiYiChangYongYao_txt);
		cReader = new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF-8"));
		ctempString = null;
		String yaoming = "";
		while ((ctempString = cReader.readDetaLine()) != null) {
			if (!ctempString.replace(" ", "").equals("")) {
				if (ctempString.contains("西药类")) {
					String temps[] = ctempString.replace("西药类", "").split("：");
					yaoming = temps[0].replaceAll("\\s*", "").replace("〔", "")
							.replace("〕", ":");
					dic_yao_ming.put(yaoming, 1);
					if (!dic_yao_li.containsKey(yaoming))
						dic_yao_li.put(yaoming, "");
					if (!dic_chengfen_danwei.containsKey(yaoming))
						dic_chengfen_danwei.put(yaoming, "");
					if (!dic_yong_fa.containsKey(yaoming))
						dic_yong_fa.put(yaoming, "");
					if (!dic_zhu_yi.containsKey(yaoming))
						dic_zhu_yi.put(yaoming, "");
					if (!dic_shi_ying.containsKey(yaoming))
						dic_shi_ying.put(yaoming, "");
					if (!dic_bu_liang_fan_ying.containsKey(yaoming))
						dic_bu_liang_fan_ying.put(yaoming, "");
					if (!dic_yao_wu_xiang_hu_zuo_yong.containsKey(yaoming))
						dic_yao_wu_xiang_hu_zuo_yong.put(yaoming, "");
					if (!dic_qi_ta.containsKey(yaoming))
						dic_qi_ta.put(yaoming, "");
					if (!dic_yong_liang.containsKey(yaoming))
						dic_yong_liang.put(yaoming, "");
					if (!dic_jie_shao.containsKey(yaoming))
						dic_jie_shao.put(yaoming, "");
					if (temps.length > 1) {
						if (!dic_jie_shao.containsKey(yaoming)) {
							dic_jie_shao.put(yaoming,
									temps[1].replaceAll("\\s*", "")
											.replace("〔", "")
											.replace("〕", ":"));
						} else {
							dic_jie_shao.put(yaoming,
									dic_jie_shao.get(yaoming)
											+ temps[1].replaceAll("\\s*", "")
													.replace("〔", "")
													.replace("〕", ":"));
						}
					}
				}
				if (ctempString.contains("用法")) {// later。。
					if (!dic_yong_fa.containsKey(yaoming.replaceAll("\\s*", "")
							.replace("〔", "").replace("〕", ":"))) {
						dic_yong_fa.put(
								yaoming.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"),
								ctempString.replaceAll("\\s*", "")
										.replace("〔", "").replace("〕", ":"));
					} else {
						dic_yong_fa.put(
								yaoming.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"),
								dic_yong_fa.get(yaoming.replaceAll("\\s*", "")
										.replace("〔", "").replace("〕", ":"))
										+ ctempString.replaceAll("\\s*", "")
												.replace("〔", "")
												.replace("〕", ":"));
					}
				}
				if (ctempString.contains("注意事项")) {
					if (!dic_zhu_yi.containsKey(yaoming.replaceAll("\\s*", "")
							.replace("〔", "").replace("〕", ":"))) {
						dic_zhu_yi.put(
								yaoming.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"),
								ctempString.replaceAll("\\s*", "")
										.replace("〔", "").replace("〕", ":"));
					} else {
						dic_zhu_yi.put(
								yaoming.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"),
								dic_zhu_yi.get(yaoming.replaceAll("\\s*", "")
										.replace("〔", "").replace("〕", ":"))
										+ ctempString.replaceAll("\\s*", "")
												.replace("〔", "")
												.replace("〕", ":"));
					}
				}
				if (ctempString.contains("此外")) {
					if (!dic_qi_ta.containsKey(yaoming.replaceAll("\\s*", "")
							.replace("〔", "").replace("〕", ":"))) {
						dic_qi_ta.put(
								yaoming.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"),
								ctempString.replaceAll("\\s*", "")
										.replace("〔", "").replace("〕", ":"));
					} else {
						dic_qi_ta.put(
								yaoming.replaceAll("\\s*", "").replace("〔", "")
										.replace("〕", ":"),
								dic_qi_ta.get(yaoming.replaceAll("\\s*", "")
										.replace("〔", "").replace("〕", ":"))
										+ ctempString.replaceAll("\\s*", "")
												.replace("〔", "")
												.replace("〕", ":"));
					}
				}
			}
		}
		cReader.closeDeta();
		in = new BookIndex().getClass()
				.getResourceAsStream(S_File.yaoLiXue_DiQiBan_txt);
		cReader = new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF8"));
		ctempString = null;
		yaoming = "";
		String temps = "";
		while ((ctempString = cReader.readDetaLine()) != null) {
			if (!ctempString.replace(" ", "").equals("")) {
				if (ctempString.contains("西药类")) {
					if (!yaoming.equals("")) {// 确认有药名
						dic_yao_ming.put(yaoming, 1);
						if (!dic_chengfen_danwei.containsKey(yaoming))
							dic_chengfen_danwei.put(yaoming, "");
						if (!dic_yong_fa.containsKey(yaoming))
							dic_yong_fa.put(yaoming, "");
						if (!dic_zhu_yi.containsKey(yaoming))
							dic_zhu_yi.put(yaoming, "");
						if (!dic_shi_ying.containsKey(yaoming))
							dic_shi_ying.put(yaoming, "");
						if (!dic_bu_liang_fan_ying.containsKey(yaoming))
							dic_bu_liang_fan_ying.put(yaoming, "");
						if (!dic_yao_wu_xiang_hu_zuo_yong.containsKey(yaoming))
							dic_yao_wu_xiang_hu_zuo_yong.put(yaoming, "");
						if (!dic_qi_ta.containsKey(yaoming))
							dic_qi_ta.put(yaoming, "");
						if (!dic_yong_liang.containsKey(yaoming))
							dic_yong_liang.put(yaoming, "");
						if (!dic_jie_shao.containsKey(yaoming))
							dic_jie_shao.put(yaoming, "");
						if (!dic_yao_li.containsKey(yaoming))
							dic_yao_li.put(yaoming, temps.replace(" ", ""));
						else
							dic_yao_li.put(yaoming, dic_yao_li.get(yaoming)
									+ temps.replace(" ", ""));
						temps = "";
					}
					yaoming = ctempString.replace("西药类", "")
							.replaceAll("\\s*", "").replace("〔", "")
							.replace("〕", ":");
					temps += yaoming;
				} else {
					temps += ctempString.replaceAll("\\s*", "").replace("〔", "")
							.replace("〕", ":");
				}
			}
		}
		cReader.closeDeta();
		temp_list = new ArrayList<>();
		in = new BookIndex().getClass()
				.getResourceAsStream(S_File.linChuangYaoWuShouCe_txt);
		cReader = new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF8"));
		ctempString = null;
		while ((ctempString = cReader.readDetaLine()) != null) {
			if (!ctempString.replace(" ", "").equals("")) {
				if (ctempString.contains("〔") && ctempString.contains("〕")) {
					ctempString = "〔〔" + ctempString;
				}
				temp_list.add(ctempString);
			}
		}
		cReader.closeDeta();
		dic_map = new IMV_SIQ_();
		for (int i = 0; i < temp_list.size(); i++) {
			if (temp_list.get(i).contains("西药类")) {
				String med_name = temp_list.get(i).replace("西药类", "")
						+ temp_list.get(i + 1) + temp_list.get(i + 2);
				String med_text = "" + med_name;
				int j = i;
				while (++j < temp_list.size()
						&& !(temp_list.get(j).contains("西药类"))) {
					med_text += temp_list.get(j);
				}
				med_name = med_name.replaceAll("\\s*", "").replace("〔", "")
						.replace("〕", ":");
				if (!dic_map.containsKey(med_name)) {
					dic_map.put(med_name,
							(med_text + "〔〔").replace("\\s+", " "));
				} else {
					dic_map.put(med_name, dic_map.get(med_name)
							+ (med_text + "〔〔").replace("\\s+", " "));
				}
				dic_yao_ming.put(med_name, 1);
				if (!dic_chengfen_danwei.containsKey(med_name)) {
					dic_chengfen_danwei.put(med_name, "");
				}
				if (!dic_yong_fa.containsKey(med_name)) {
					dic_yong_fa.put(med_name, "");
				}
				if (!dic_zhu_yi.containsKey(med_name)) {
					dic_zhu_yi.put(med_name, "");
				}
				if (!dic_shi_ying.containsKey(med_name)) {
					dic_shi_ying.put(med_name, "");
				}
				if (!dic_bu_liang_fan_ying.containsKey(med_name)) {
					dic_bu_liang_fan_ying.put(med_name, "");
				}
				if (!dic_yao_wu_xiang_hu_zuo_yong.containsKey(med_name)) {
					dic_yao_wu_xiang_hu_zuo_yong.put(med_name, "");
				}
				if (!dic_qi_ta.containsKey(med_name)) {
					dic_qi_ta.put(med_name, "");
				}
				if (!dic_yong_liang.containsKey(med_name)) {
					dic_yong_liang.put(med_name, "");
				}
				if (!dic_jie_shao.containsKey(med_name)) {
					dic_jie_shao.put(med_name, "");
				}
				if (!dic_yao_li.containsKey(med_name)) {
					dic_yao_li.put(med_name, temps.replaceAll("\\s*", "")
							.replace("〔", "").replace("〕", ":"));
				} else {
					dic_yao_li.put(med_name,
							dic_yao_li.get(med_name) + temps
									.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				}
			}
		}
		iter = dic_map.keySet().iterator();
		copy = new ArrayList<>();
		while (iter.hasNext())
			copy.add(iter.next());
		for (int i = 0; i < copy.size(); i++) {
			String med_name = copy.get(i).replaceAll("\\s*", "")
					.replace("〔", "").replace("〕", ":");
			String med_text = dic_map.get(med_name).toString().replace("\n",
					"");
			Pattern p = Pattern.compile("〔主要(.*?)〔〔");
			Matcher m = p.matcher(med_text);
			Pattern p1 = Pattern.compile("〔适应(.*?)〔〔");
			Matcher m1 = p1.matcher(med_text);
			Pattern p2 = Pattern.compile("〔注意(.*?)〔〔");
			Matcher m2 = p2.matcher(med_text);
			Pattern p3 = Pattern.compile("〔用法(.*?)〔〔");
			Matcher m3 = p3.matcher(med_text);
			Pattern p4 = Pattern.compile("〔药物(.*?)〔〔");
			Matcher m4 = p4.matcher(med_text);
			Pattern p5 = Pattern.compile("〔不良(.*?)〔〔");
			Matcher m5 = p5.matcher(med_text);
			Pattern p6 = Pattern.compile("〔功能(.*?)〔〔");
			Matcher m6 = p6.matcher(med_text);
			Pattern p7 = Pattern.compile("〔剂型(.*?)〔〔");
			Matcher m7 = p7.matcher(med_text);

			String temp = "";
			if (m.find()) {
				temp = m.group(0);
				if (!dic_chengfen_danwei.containsKey(med_name)) {
					dic_chengfen_danwei.put(med_name,
							temp.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				} else {
					dic_chengfen_danwei.put(med_name,
							dic_chengfen_danwei.get(med_name) + temp
									.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				}
			}
			if (m1.find()) {
				temp = m1.group(0);
				while (m1.find()) {
					temp = m1.group(0);
				}
				if (!dic_shi_ying.containsKey(med_name)) {
					dic_shi_ying.put(med_name, temp.replaceAll("\\s*", "")
							.replace("〔", "").replace("〕", ":"));
				} else {
					dic_shi_ying.put(med_name,
							dic_shi_ying.get(med_name) + temp
									.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				}
			}
			if (m2.find()) {
				temp = m2.group(0);
				if (!dic_zhu_yi.containsKey(yaoming)) {
					dic_zhu_yi.put(med_name, temp.replaceAll("\\s*", "")
							.replace("〔", "").replace("〕", ":"));
				} else {
					dic_zhu_yi.put(med_name,
							dic_zhu_yi.get(med_name) + temp
									.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				}
			}
			if (m3.find()) {
				temp = m3.group(0);
				if (!dic_yong_liang.containsKey(med_name)) {
					dic_yong_liang.put(med_name, temp.replaceAll("\\s*", "")
							.replace("〔", "").replace("〕", ":"));
				} else {
					dic_yong_liang.put(med_name,
							dic_yong_liang.get(med_name) + temp
									.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				}
			}
			if (m4.find()) {
				temp = m4.group(0);
				if (!dic_yao_wu_xiang_hu_zuo_yong.containsKey(med_name)) {
					dic_yao_wu_xiang_hu_zuo_yong.put(med_name,
							temp.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				} else {
					dic_yao_wu_xiang_hu_zuo_yong.put(med_name,
							dic_yao_wu_xiang_hu_zuo_yong.get(med_name) + temp
									.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				}
			}
			if (m5.find()) {
				temp = m5.group(0);
				if (!dic_bu_liang_fan_ying.containsKey(med_name)) {
					dic_bu_liang_fan_ying.put(med_name,
							temp.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				} else {
					dic_bu_liang_fan_ying.put(med_name,
							dic_bu_liang_fan_ying.get(med_name) + temp
									.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				}
			}
			if (m6.find()) {
				temp = m6.group(0);
				if (!dic_shi_ying.containsKey(med_name)) {
					dic_shi_ying.put(med_name, temp.replaceAll("\\s*", "")
							.replace("〔", "").replace("〕", ":"));
				} else {
					dic_shi_ying.put(med_name,
							dic_shi_ying.get(med_name) + temp
									.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				}
			}
			if (m7.find()) {
				temp = m7.group(0);
				if (!dic_chengfen_danwei.containsKey(med_name)) {
					dic_chengfen_danwei.put(med_name,
							temp.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				} else {
					dic_chengfen_danwei.put(med_name,
							dic_chengfen_danwei.get(med_name) + temp
									.replaceAll("\\s*", "").replace("〔", "")
									.replace("〕", ":"));
				}
			}
		}
	}
}