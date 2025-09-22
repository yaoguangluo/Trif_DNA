package E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;

import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.rows.Q_Rows_E_X_selectRowsByAttribute;
import M_V.MSQ.OP.SM.AOP.MEC.SIQ.SM.OSQ.E.rows.Q_Rows_E_X_selectRowsByTablePath;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings({ "unchecked", "resource", "unused" })
public class RestDB_QE {
	public static IMV_SIQ selectRowsByAttribute(String baseName,
			String tableName, String culumnName, String value, String token,
			String email, String password, String auth) {
		IMV_SIQ output = new IMV_SIQ();
		if (token != null && !token.equalsIgnoreCase("")) {
			String checkStatus = LoginService_E.checkTokenStatus(token,
					"common");
			if (checkStatus.contains("invalid") && (auth.contains("1"))) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		} else if (email != null && !email.equalsIgnoreCase("")) {
			String checkStatus = LoginService_E.checkRightsStatusDNA(email,
					password, "DB");
			if (checkStatus.contains("invalid")) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		} else {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", "invalid request");
			return output;
		}
		output.put("obj", Q_Rows_E_X_selectRowsByAttribute._E(baseName,
				tableName, culumnName, value));
		return output;
	}

	public static IMV_SIQ selectRowsByTablePath(String tablePath,
			String pageBegin, String pageEnd, String direction, String token,
			String email, String password, String auth) {
		IMV_SIQ output = new IMV_SIQ();
		if (token != null && !token.equalsIgnoreCase("")) {
			String checkStatus = LoginService_E.checkTokenStatus(token,
					"common");
			if (checkStatus.contains("invalid") && (auth.contains("1"))) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		} else if (email != null && !email.equalsIgnoreCase("")) {
			String checkStatus = LoginService_E.checkRightsStatus(email,
					password, "DB");
			if (checkStatus.contains("invalid")) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		} else {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", "invalid request");
			return output;
		}
		output = Q_Rows_E_X_selectRowsByTablePath._E(tablePath, pageBegin,
				pageEnd, direction);
		return output;
	}
}
//69 		//		if(Cache_M.getCacheInfo(tablePath + S_Common.STRING_SYMBOL_PER + pageBegin
//		//+ S_Common.STRING_SYMBOL_PER + pageEnd
//		//+ S_Common.STRING_SYMBOL_PER + direction) != null) {
//		//			output= (IMV_SIQ)(Cache_M.getCacheInfo(tablePath
//		//+ S_Common.STRING_SYMBOL_PER + pageBegin + S_Common.STRING_SYMBOL_PER
//		//+ pageEnd + S_Common.STRING_SYMBOL_PER + direction).getValue());
//		//			return output;
//		//		}

//70		//		if(tablePath.equalsIgnoreCase("c:/DetaDB/frontend/login")) {
//		//			Cache c= new Cache();
//		//			c.setValue(output);
//		//			Cache_M.putCache(tablePath + S_Common.STRING_SYMBOL_PER + pageBegin
//		//+ S_Common.STRING_SYMBOL_PER + pageEnd + S_Common.STRING_SYMBOL_PER + direction, c);
//		//		}