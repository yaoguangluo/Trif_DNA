package ME.VPC.V.dictionary;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.SVQ.stable.S_File;
import S_A.pheromone.IMV_SIQ_;
import YLJ_HRJ.ME.VPC.S.books.BookIndex;

import java.io.InputStream;
import java.util.ArrayList;
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
public class CecilDictionary extends Dictionary_S {
	public List<String> txtToListName() {
		temp_list = new ArrayList<>();
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed1_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed2_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed3_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed4_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed5_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed6_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed7_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed8_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed9_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed10_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed11_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed12_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed13_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed14_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed15_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed16_txt);
		temp_list.add(S_File.HarrisonsPrinciplesofInternalMedicine_18ed17_txt);
		return temp_list;
	}

	public IMV_SIQ_ listNameToMap(List<String> dic_list) {
		dic_map = new IMV_SIQ_();
		for (int i = 0; i < dic_list.size(); i++) {
			String para = "";
			String name = dic_list.get(i).toString();
			InputStream in = new BookIndex().getClass()
					.getResourceAsStream(name);
			DetaBufferedReader cReader;
			cReader = new DetaBufferedReader(
					DetaInputStreamReader.E(in, "UTF8"));
			String ctempString = null;
			int index = 0;
			while ((ctempString = cReader.readDetaLine()) != null) {
				if (!ctempString.replace(" ", "").equals("")) {
					para += " " + ctempString;
					if (ctempString.contains("^^")) {
						dic_map.put(name + (index++) + para.substring(0, 30),
								para.replace("\\s+", " ").toLowerCase());
						para = "";
					}
				}
			}
			cReader.closeDeta();
		}
		return dic_map;
	}
}