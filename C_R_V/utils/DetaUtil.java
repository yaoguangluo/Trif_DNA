package utils;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaFileReader;
import U_A.PEU.P.cache.Cache;
import U_A.PEU.P.cache.Cache_M;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaUtil {
	public static void IV_DB(String dbConfigPath) {
		File config = new File(dbConfigPath);
		String DBFile = "";
		if (config.exists()) {
			DetaBufferedReader reader = new DetaBufferedReader(
					DetaFileReader.E(config));
			String tempString;
			while ((tempString = reader.readDetaLine()) != null) {
				Cache c = new Cache();
				c.I_Value(tempString.split("->")[1]);
				Cache_M.putCache("DBPath", c);
				File fileDBPath = new File(tempString.split("->")[1]);
				if (!fileDBPath.isDirectory()) {
					fileDBPath.mkdir();
				}
			}
			reader.closeDeta();
		} else {
			FileWriter fileWriter;
			try {
				DBFile = dbConfigPath.replace("DBconfig.lyg", "") + "DetaDB";
				fileWriter = new FileWriter(dbConfigPath, true);
				fileWriter.write("path->" + DBFile);
				fileWriter.close();
				File fileDBPath = new File(DBFile);
				if (!fileDBPath.isDirectory()) {
					fileDBPath.mkdir();
				}
				Cache c = new Cache();
				c.I_Value(DBFile);
				Cache_M.putCache("DBPath", c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}