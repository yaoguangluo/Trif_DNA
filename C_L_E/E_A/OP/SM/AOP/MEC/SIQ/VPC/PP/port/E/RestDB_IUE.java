package E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;

import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;
import M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_Rows_E_X_IU_RowByBaseName;
import M_V.MSI.OP.SM.AOP.MEC.SIQ.SM.OSU.E.IU_Rows_E_X_IU_RowByTablePathAndIndex;
import S_A.pheromone.IMV_SIQ;
import org.json.JSONObject;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class RestDB_IUE {
	public static IMV_SIQ insertRowByTablePath(String tablePath, String pageIndex
			, String culumnOfNewRow, String token, String email, String password
			, String auth)  {
		IMV_SIQ output= new IMV_SIQ();
		if(token != null && !token.equalsIgnoreCase("")){
			String checkStatus= LoginService_E.checkTokenStatus(token, "common");
			if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		}else if(email != null && !email.equalsIgnoreCase("")){
			String checkStatus= LoginService_E.checkRightsStatus(email, password, "DB");
			if(checkStatus.contains("invalid")) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		}else{
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", "invalid request");
			return output;
		}
		JSONObject jaculumnOfNewRow=new JSONObject(culumnOfNewRow);
		output= IU_Rows_E_X_IU_RowByTablePathAndIndex.insertRowByTablePathAndIndex(tablePath
			, pageIndex, jaculumnOfNewRow);
		return output;
	}

	public static IMV_SIQ insertRowByBaseName(String baseName, String tableName
			, String culumnOfNewRow, String token, String email, String password
			, String auth)  {
		IMV_SIQ output= new IMV_SIQ();
		String checkStatus= LoginService_E.checkRightsStatus(email, password, "DB");
		if(checkStatus.contains("invalid")) {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", checkStatus);
			return output;
		}

		checkStatus= LoginService_E.checkTokenStatus(token, "common");
		if(checkStatus.contains("invalid")&&(auth.contains("1"))) {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", checkStatus);
			return output;
		}

		JSONObject jaculumnOfNewRow=new JSONObject(culumnOfNewRow);
		output= IU_Rows_E_X_IU_RowByBaseName.insertRowByBaseName(baseName, tableName
			, jaculumnOfNewRow, true);
		return output;
	}
}
