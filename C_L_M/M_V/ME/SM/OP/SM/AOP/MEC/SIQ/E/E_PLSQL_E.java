package M_V.ME.SM.OP.SM.AOP.MEC.SIQ.E;

import M_V.ME.E.PLSQLCommand_E_X_P_BaseName;
import M_V.ME.E.PLSQLCommand_E_X_P_Check;
import M_V.ME.E.PLSQLCommand_E_X_P_E;
import M_V.ME.E.PLSQLCommand_E_X_P_Join;
import M_V.ME.E.PLSQLCommand_E_X_P_ListNeedStart;
import M_V.ME.E.PLSQLCommand_E_X_P_SetRoot;
import M_V.ME.E.PLSQLCommand_E_X_P_TableName;
import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_C;
import S_A.SVQ.stable.S_ShellETL;
import S_A.pheromone.IMV_SIQ;
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
public class E_PLSQL_E {
	public static IMV_SIQ E_PLSQL(String plsql, boolean mod) {
		//working for here
		TinMap output= new TinMap();
		//1make container
		output.put("start", "0");
		output.put("countJoins", "0");
		//2make line
		String[] commands= plsql.replace(" ", "").replace("\n"
			, "").split(";");
		String[] acknowledge= null;
		for(String command:commands) {
			acknowledge= command.split(":");
			if(acknowledge[0].equals("setRoot")) {
				PLSQLCommand_E_X_P_SetRoot._E(acknowledge);
			}
			if(acknowledge[0].equals("baseName")) {
				PLSQLCommand_E_X_P_BaseName._E(acknowledge, output);
			}
			if(acknowledge[0].equals("tableName")) {
				PLSQLCommand_E_X_P_TableName._E(acknowledge, output);
			}
			if(acknowledge[0].equals(S_ShellETL.SHELL_ETL_CULUMNNAME)) {
				PLSQLCommand_E_X_P_ListNeedStart._E(acknowledge, output);
			}
			if(acknowledge[0].equals("修改列名")) {//later
				PLSQLCommand_E_X_P_ListNeedStart._E(acknowledge, output);
			}
			if(acknowledge[0].equals("culumnValue")) {
				PLSQLCommand_E_X_P_ListNeedStart._E(acknowledge, output);
			}
			if(acknowledge[0].equals("join")) {
				PLSQLCommand_E_X_P_Join._E(acknowledge, output);
			}
			if(acknowledge[0].equals(S_ShellETL.SHELL_ETL_CONDITION)) {
				PLSQLCommand_E_X_P_ListNeedStart._E(acknowledge, output);
			}
			if(acknowledge[0].equals("relation")) {
				PLSQLCommand_E_X_P_ListNeedStart._E(acknowledge, output);
			}
			if(acknowledge[0].equals("aggregation")) {
				PLSQLCommand_E_X_P_ListNeedStart._E(acknowledge, output);
			}
			if(acknowledge[0].equals("getCulumns")) {
				PLSQLCommand_E_X_P_ListNeedStart._E(acknowledge, output);
			}
			output.put("newCommand", acknowledge[0]);
			PLSQLCommand_E_X_P_E._E(acknowledge, output, mod);
			output.put("lastCommand", output.get("newCommand"));
		}
		if(null!= acknowledge) {
			if(output.get("start").toString().equals("1")) {
				PLSQLCommand_E_X_P_E._E(acknowledge, output, mod);
			}
		}
		//20230106-System.out.println("1");
		PLSQLCommand_E_X_P_Check._E(output.get("newCommand").toString(), output, mod);
		return output;
	}

	public static IMV_SIQ E_PLORM(PLORM_C orm, boolean b)  {
		return E_PLSQL(orm.getPLSQL(), true);
	}
}
