/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
package src.java.org.lyg.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import src.java.org.lyg.cache.Cache;
import src.java.org.lyg.cache.CacheManager;

public class DetaUtil {
	public static void initDB() {
		File config = new File("C:/DBconfig.lyg");
		if (config.exists()) {
			try {
				BufferedReader reader = new BufferedReader(
						new FileReader(config));
				String tempString;
				while ((tempString = reader.readLine()) != null) {
					Cache c = new Cache();
					c.setValue(tempString.split("->")[1]);
					CacheManager.putCache("DBPath", c);
					File fileDBPath = new File(tempString.split("->")[1]);
					if (fileDBPath.isDirectory()) {
					} else {
						fileDBPath.mkdir();
					}
				}
				reader.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			// ������mac
//			FileWriter fw = null;
//			try {
//				fw = new FileWriter("C:/DBconfig.lyg", true);
//				fw.write("path->" + "C:/DetaDB");
//				fw.close();
//				File fileDBPath = new File("C:/DetaDB");
//				if (fileDBPath.isDirectory()) {
//				}else {
//					fileDBPath.mkdir();
//				}
//				Cache c = new Cache();
//				c.setValue("C:/DetaDB");
//				CacheManager.putCache("DBPath", c);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
	}
}
