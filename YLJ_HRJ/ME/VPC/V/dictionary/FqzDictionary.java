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
public class FqzDictionary extends Dictionary_S {
	public List<String> txtToListName() {
		temp_list = new ArrayList<>();
		temp_list.add(S_File.fqznkgkqfs_txt);
		temp_list.add(S_File.byzymxk_txt);
		temp_list.add(S_File.byxpqlgl_txt);
		temp_list.add(S_File.cyblqym_txt);
		temp_list.add(S_File.rkjccsz_txt);
		temp_list.add(S_File.fkbbmzly_txt);
		temp_list.add(S_File.fkms_txt);
		temp_list.add(S_File.fkycqsja_txt);
		temp_list.add(S_File.frlf_txt);
		temp_list.add(S_File.fqznkmfs_txt);
		temp_list.add(S_File.fqznkmfs_txt);
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
			if (name.equalsIgnoreCase(S_File.byzymxk_txt)
					|| name.equalsIgnoreCase(S_File.cyblqym_txt)
					|| name.equalsIgnoreCase(S_File.fqznkgkqfs_txt)) {
				cReader = new DetaBufferedReader(
						DetaInputStreamReader.E(in, "UTF-16"));
			} else {
				cReader = new DetaBufferedReader(
						DetaInputStreamReader.E(in, "UTF8"));
			}
			String ctempString = null;
			int index = 0;
			while ((ctempString = cReader.readDetaLine()) != null) {
				if (!ctempString.replace(" ", "").equals("")) {
					para += ctempString;
					if (ctempString.replace(" ", "").contains("^^")) {
						dic_map.put(name + (index++),
								para.replace("\\s+", " "));
						para = "";
					}
				}
			}
			cReader.closeDeta();
		}
		return dic_map;
	}
}