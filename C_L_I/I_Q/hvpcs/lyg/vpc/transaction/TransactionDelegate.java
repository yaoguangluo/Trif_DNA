/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
package I_Q.hvpcs.lyg.vpc.transaction;

import java.net.URLEncoder;
import java.util.Map;

import org.json.JSONObject;

import DSU.V.VtoV;
import I_Q.hvpcs.lyg.common.utils.DetaDBUtil;

public class TransactionDelegate {
	@SuppressWarnings({ "deprecation", "unchecked" })
	public static Map<String, Object> transactionLogin(String uEmail,
			String uPassword) throws Exception {
		String response = DetaDBUtil
				.backEndRequest("login?uEmail=" + URLEncoder.encode(uEmail)
						+ "&uPassword=" + URLEncoder.encode(uPassword));
		Map<String, Object> out = VtoV
				.JsonObjectToMap(new JSONObject(response));
		return out;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static Map<String, Object> transactionRegisterFE(String uEmail,
			String uEmailEnsure, String uName, String uPassword,
			String uPassWDEnsure, String uAddress, String uPhone,
			String uWeChat, String uQq, String uAge, String uSex)
			throws Exception {
		String response = DetaDBUtil
				.backEndRequest("register?uEmail=" + URLEncoder.encode(uEmail)
						+ "&uName=" + URLEncoder.encode(uName) + "&uPassword="
						+ URLEncoder.encode(uPassword));
		// + "&uPassWDEnsure=" + URLEncoder.encode(uPassWDEnsure)
		// + "&uAddress=" + URLEncoder.encode(uAddress)
		// + "&uPhone=" + URLEncoder.encode(uPhone)
		// + "&uWeChat=" + URLEncoder.encode(uWeChat)
		// + "&uQq=" + URLEncoder.encode(uQq)
		// + "&uAge=" + URLEncoder.encode(uAge)
		// + "&uSex=" + URLEncoder.encode(uSex));
		Map<String, Object> out = VtoV
				.JsonObjectToMap(new JSONObject(response));
		return out;
	}
}