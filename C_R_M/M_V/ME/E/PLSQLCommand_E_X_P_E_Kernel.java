package M_V.ME.E;

import M_V.MSD.OP.SM.AOP.MEC.SIQ.SM.OSD.E.D_Rows_E_X_D_RowByAttributesOfCondition;
import M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSI.E.I_Tables_E;
import M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_Rows_E_X_IU_RowByAttributes;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.joinRows.Q_JoinRows_E_X_selectRowsByAttributesOfJoinAggregation;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.joinRows.Q_JoinRows_E_X_selectRowsByAttributesOfJoinCondition;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.joinRows.Q_JoinRows_E_X_selectRowsByAttributesOfJoinGetCulumns;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.joinRows.Q_JoinRows_E_X_selectRowsByAttributesOfJoinRelation;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.rows.Q_Rows_E_X_selectRowsByAttributesOfAggregation;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.rows.Q_Rows_E_X_selectRowsByAttributesOfCondition;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.rows.Q_Rows_E_X_selectRowsByAttributesOfGetCulumns;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.JoinRows.E.X_U_RowsByAttributesOfJoinAggregation;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.JoinRows.E.X_U_RowsByAttributesOfJoinCondition;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.JoinRows.E.X_U_RowsByAttributesOfJoinRelation;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowsByAttributesOfAggregation;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowsByAttributesOfCondition;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowsByRecordConditions;
import S_A.SVQ.stable.S_ShellETL;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
* (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class PLSQLCommand_E_X_P_E_Kernel {
//处理机中心, 别急, 准备验证 罗瑶光 object.getString("type")
	public static void _E(TinMap object, boolean mod) {
		if(object.getCompareV("type", "select") &&
				(object.getCompareV("countJoins", "0") ||
						(object.getCompareV("countJoins", "1")
								&& object.getCompareV("newCommand", "join")))){
			if(object.containsKey(S_ShellETL.SHELL_ETL_CONDITION)) {
				object.putObject("obj", Q_Rows_E_X_selectRowsByAttributesOfCondition._E(object));
			}
			if(object.containsKey("aggregation")) {
				object.putObject("obj", Q_Rows_E_X_selectRowsByAttributesOfAggregation._E(object));
			}
			if(object.containsKey("getCulumns")) {
				object.putObject("obj", Q_Rows_E_X_selectRowsByAttributesOfGetCulumns._E(object));
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("select") && //later..
				(object.get("countJoins").toString().equalsIgnoreCase("n") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1")
								&& !object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey(S_ShellETL.SHELL_ETL_CONDITION)) {
				object.putObject("joinObj", Q_JoinRows_E_X_selectRowsByAttributesOfJoinCondition._E(object));
			}
			if(object.containsKey("relation")) {
				object.putObject("obj", Q_JoinRows_E_X_selectRowsByAttributesOfJoinRelation._E(object));
			}
			if(object.containsKey("aggregation")) {
				object.putObject("obj", Q_JoinRows_E_X_selectRowsByAttributesOfJoinAggregation._E(object));
			}
			if(object.containsKey("getCulumns")) {
				object.putObject("joinObj", Q_JoinRows_E_X_selectRowsByAttributesOfJoinGetCulumns._E(object));
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("create")){
			if(object.containsKey(S_ShellETL.SHELL_ETL_CULUMNNAME)) {
				I_Tables_E.I_Table(object, mod);
			}
			object.remove("recordRows");
		}
		//离散数学的conjuction变换  a^&&b^&&c * kernel[]= (a^&&b^)^^&&c * kernel[]= (a||b)^&&c * kernel[]
		if(object.get("type").toString().equalsIgnoreCase("update") && 
				(object.get("countJoins").toString().equalsIgnoreCase("0") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") 
								&& object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey(S_ShellETL.SHELL_ETL_CONDITION)) {
				object.putObject("updateObj", X_U_RowsByAttributesOfCondition._E(object, mod));
			}
			if(object.containsKey("aggregation")) {
				object.putObject("updateObj", X_U_RowsByAttributesOfAggregation._E(object, mod));
			}
			if(object.containsKey("culumnValue")) {
				X_U_RowsByRecordConditions._E(object, mod);
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("update") && 
				(object.get("countJoins").toString().equalsIgnoreCase("n") ||
						(object.get("countJoins").toString().equalsIgnoreCase("1") 
								&& !object.get("newCommand").toString().equalsIgnoreCase("join")))){
			if(object.containsKey(S_ShellETL.SHELL_ETL_CONDITION)) {
				object.putObject("updateJoinObj"
						, X_U_RowsByAttributesOfJoinCondition._E(object, mod));
			}
			if(object.containsKey("relation")) {
				object.putObject("updateObj"
						, X_U_RowsByAttributesOfJoinRelation._E(object, mod));
			}
			if(object.containsKey("aggregation")) {
				object.putObject("updateObj"
						, X_U_RowsByAttributesOfJoinAggregation._E(object, mod));
			}
			if(object.containsKey("culumnValue")) {
				X_U_RowsByRecordConditions._E(object, mod);
			}
			object.remove("recordRows");
		}
		if(object.get("type").toString().equalsIgnoreCase("insert")) {
			if(object.containsKey("culumnValue")) {
				IU_Rows_E_X_IU_RowByAttributes.IU_RowByAttributes(object, mod);
			}
		}
		if(object.get("type").toString().equalsIgnoreCase("delete")) {
			if(object.containsKey(S_ShellETL.SHELL_ETL_CONDITION)) {
				D_Rows_E_X_D_RowByAttributesOfCondition._E(object, mod);
			}
		}
		object.remove(S_ShellETL.SHELL_ETL_CONDITION);
		object.remove(S_ShellETL.SHELL_ETL_CULUMNNAME);
		object.remove("修改列名");//later
		object.remove("getCulumns");
		object.remove("relation");
		object.remove("aggregation");
		object.remove("getCulumns");
		object.putString("start", "0");
	}
}