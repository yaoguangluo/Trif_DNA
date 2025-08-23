/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
package src.java.org.lyg.vpc.transaction;

import java.net.URLEncoder;
import java.util.Map;

import org.json.JSONObject;

import DSU.V.VtoV;
import src.java.org.lyg.common.utils.DetaDBUtil;

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

	@SuppressWarnings("deprecation")
	public static Map<String, Object> transactionRegisterFE(String uEmail,
			String uEmailEnsure, String uName, String uPassword,
			String uPassWDEnsure, String uAddress, String uPhone,
			String uWeChat, String uQq, String uAge, String uSex)
			throws Exception {
		String response = DetaDBUtil
				.backEndRequest("register?uEmail=" + URLEncoder.encode(uEmail)
						+ "&uName=" + URLEncoder.encode(uName) + "&uPassword="
						+ URLEncoder.encode(uPassword));
		// 锟皆猴拷写锟饺讹拷锟竭硷拷锟斤拷锟斤拷锟斤拷uPassWDEnsure锟斤拷
		// "&uEmailEnsure=" + URLEncoder.encode(uEmailEnsure)
		// 锟斤拷锟斤拷锟斤拷业锟斤拷耍锟斤拷锟斤拷撕锟絜clipse锟侥坑ｏ拷锟斤拷锟斤拷锟侥硷拷锟斤拷筒锟斤拷锟斤拷远锟絩efresh锟斤拷要锟街讹拷锟斤拷锟斤拷锟斤拷锟斤拷锟絝ront
		// end锟斤拷前锟斤拷锟斤拷目锟斤拷锟叫很讹拷锟斤拷站锟斤拷图片锟斤拷
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