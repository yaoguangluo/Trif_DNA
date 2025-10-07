package O_V.OSM.shell;

import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_File;
import S_A.pheromone.IMV_SQI;
import U_A.PEU.P.table.TableSorterZYNK;
import U_V.OEU.xqpx.wcms.sort.LYG10D13D_X_CAS;
import U_V.PEU.S.UVIMIACI.VerbalSource;
import V_A.SQ.ReadPinYinBihua;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class SortStringDemo {
	public static IMV_SQI pinYin = null;
	public static Map<String, Integer> biHua = null;

	public static void initMap() {
		try {
			if (null != pinYin || null != biHua) {
				return;
			}
			InputStream inputStreamp = new VerbalSource().getClass()
					.getResourceAsStream(S_File.PinYinCN_lyg);
			DetaBufferedReader cReaderp = new DetaBufferedReader(
					DetaInputStreamReader.E(inputStreamp, "UTF8"));
			// index
			String cInputStringp;
			IMV_SQI map = new IMV_SQI();
			biHua = new IMV_SQI();
			while ((cInputStringp = cReaderp.readDetaLine()) != null) {
				String[] words = cInputStringp.split("->");
				if (words.length > 1) {
					map.put(words[0], words[1]);
				}
			}
			cReaderp.close();
			InputStream inputStreamb = new VerbalSource().getClass()
					.getResourceAsStream(S_File.BiHuaCN_lyg);
			DetaBufferedReader cReaderb = new DetaBufferedReader(
					new InputStreamReader(inputStreamb, "UTF8"));
			// index
			String cInputStringb;
			while ((cInputStringb = cReaderb.readDetaLine()) != null) {
				String[] words = cInputStringb.split("->");
				if (words.length > 1) {
					biHua.put(words[0], Integer.valueOf(words[1]));
				}
			}
			pinYin = map;
			cReaderb.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] argv) {
		App NE = new App();
		ReadPinYinBihua.getPinYinBihuaMap(NE);
		TableSorterZYNK tableSorterZYNK = new TableSorterZYNK(NE);
		String[] strings = new String[10];
		strings[0] = "luoy罗瑶光uang";
		strings[1] = "罗瑶光";
		strings[2] = "瑶光";
		strings[3] = "罗瑶";
		strings[4] = "yaoguang";
		strings[5] = "y瑶光g";
		strings[6] = "yaog瑶光ng";
		strings[7] = "xy瑶光guang";
		strings[8] = "ya罗瑶光ang";
		strings[9] = "yaoguang";
		int returnInt = new LYG10D13D_X_CAS()
				.quick4DChineseStringArrayWithSmallInTwoChar3bihuaReturns(
						strings, 0, 9, 30, ReadPinYinBihua.pinYin,
						ReadPinYinBihua.biHua, 7, 70);

		for (String string : strings) {
			System.out.println(string);
		}

	}
}

//  输出 Connected to the target VM, address:
//  '127.0.0.1:54000', transport: 'socket' 罗瑶 罗瑶光 瑶光
//  罗瑶
////罗瑶光
////瑶光
////luoy罗瑶光uang
////xy瑶光guang
////y瑶光g
////ya罗瑶光ang
////yaog瑶光ng
////yaoguang
////yaoguang
//  yaoguang Disconnected from the target VM, address:
//  '127.0.0.1:54000', transport: 'socket'
//  
//  Process finished with exit code 0
