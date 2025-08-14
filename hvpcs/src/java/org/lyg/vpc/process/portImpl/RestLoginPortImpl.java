/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */package src.java.org.lyg.vpc.process.portImpl;

import org.json.JSONObject;
import org.lyg.common.maps.VtoV;
import org.lyg.common.utils.DetaDBUtil;
import src.java.org.lyg.vpc.transaction.TransactionDelegate;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
//����Ȩ�ˣ����ߣ�������
public class RestLoginPortImpl {//implements RestLoginPort {

	public static Map<String, Object> login(String uEmail, String uPassword) throws Exception {
		Map<String, Object> map = TransactionDelegate.transactionLogin(uEmail, uPassword);
		return map;
	}

	public static Map<String, Object> logout(String uEmail, String uToken) throws IOException {
		Map<String, Object> output = new HashMap<String, Object>();
		output.put("userEmail", "friend");
		output.put("userToken", "123456");
		return output;
	}

	public static Map<String, Object> register(String uEmail, String uEmailEnsure
			, String uName, String uPassword, String uPassWDEnsure, String uAddress
			, String uPhone, String uWeChat, String uQq, String uAge
			, String uSex) throws Exception {
		Map<String, Object> output = TransactionDelegate.transactionRegisterFE(uEmail
				, uEmailEnsure, uName, uPassword,
				uPassWDEnsure, uAddress, uPhone, uWeChat,
				uQq, uAge, uSex);
		return output;
	}

	public static Map<String, Object> change(String uEmail, String uChange
			, String uChangeEnsure, String uToken, String uPassword) throws IOException {
		return null;
	}

	public static Map<String, Object> find(String uEmail) throws IOException {
		return null;
	}
	
	@SuppressWarnings("deprecation")
	public static Map<String, Object> checkStatus(String token) throws IOException {
		String json = DetaDBUtil.DBRequest("/checkStatus?token=" + URLEncoder.encode(token));
		Map<String, Object> output = null;
		boolean jsonCheck = true;
		if(null == json){
			output = new HashMap<String, Object>();
			output.put("loginInfo", "unsuccess");
			jsonCheck = false;
		}
		if(json.contains("unsuccess")){
			output = VtoV.JsonObjectToMap(new JSONObject(json));
			jsonCheck = false;
		}
		if(jsonCheck){
			output = VtoV.JsonObjectToMap(new JSONObject(json));
			return output;
		}
		output = new HashMap<String, Object>();
		output.put("loginInfo", "unsuccess");
		return output;
	}
	
}