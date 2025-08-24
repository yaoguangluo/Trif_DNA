package M_V.ME.E;

import S_A.SVQ.stable.S_ShellETL;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class PLSQLCommand_E_X_P_E {
	public static void _E(String[] acknowledge, TinMap object, boolean mod) {
		if (object.getCompareV("start", "1")) {
			if (!acknowledge[0]
					.equalsIgnoreCase(object.get("lastCommand").toString())
					&& (object.get("lastCommand").toString().contains("修改列名")// later
							|| object.get("lastCommand").toString()
									.contains("culumnValue")
							|| object.get("lastCommand").toString()
									.contains(S_ShellETL.SHELL_ETL_CONDITION)
							|| object.get("lastCommand").toString()
									.contains("relation")
							|| object.get("lastCommand").toString()
									.contains("aggregation")
							|| object.get("lastCommand").toString()
									.contains("getCulumns")
							|| object.get("lastCommand").toString()
									.contains(S_ShellETL.SHELL_ETL_CULUMNNAME)
							|| object.get("lastCommand").toString()
									.contains("relation"))) {
				PLSQLCommand_E_X_P_E_Kernel._E(object, mod);
			}
		}
	}
}