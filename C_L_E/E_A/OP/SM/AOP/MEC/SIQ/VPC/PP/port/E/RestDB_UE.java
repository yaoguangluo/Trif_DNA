package E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;

import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;
import M_V.MSU.OP.SM.AOP.MEC.SIQ.SM.update.EU.Rows.E.X_U_RowByTablePathAndIndex;
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
public class RestDB_UE {
	public static IMV_SIQ updateRowByTablePathAndIndex(String tablePath, String pageIndex
		, String culumnOfUpdateRow, String token, String email, String password, String auth)  {
		IMV_SIQ output= new IMV_SIQ();
		if(token != null && !token.equalsIgnoreCase("")){
			String checkStatus= LoginService_E.checkTokenStatus(token, "level");
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
		JSONObject jaculumnOfUpdateRow= new JSONObject(culumnOfUpdateRow);
		return X_U_RowByTablePathAndIndex._E(tablePath, pageIndex, jaculumnOfUpdateRow);
	}
}
