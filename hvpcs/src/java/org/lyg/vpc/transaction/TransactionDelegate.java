/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */package src.java.org.lyg.vpc.transaction;
import java.net.URLEncoder;
import java.util.Map;

import org.json.JSONObject;
import org.lyg.common.maps.VtoV;
import org.lyg.common.utils.DetaDBUtil;
//����Ȩ��, ���� ������
//�����������������޹�˾
public class TransactionDelegate {
	@SuppressWarnings("deprecation")
	public static Map<String, Object> transactionLogin(String uEmail, String uPassword)throws Exception {
		String response = DetaDBUtil.backEndRequest("login?uEmail=" + URLEncoder.encode(uEmail) 
		+ "&uPassword=" + URLEncoder.encode(uPassword));
		Map<String, Object> out = VtoV.JsonObjectToMap(new JSONObject(response));
		return out;
	}

	@SuppressWarnings("deprecation")
	public static Map<String, Object> transactionRegisterFE(String uEmail, String uEmailEnsure, String uName, String uPassword,
			String uPassWDEnsure, String uAddress, String uPhone, String uWeChat, String uQq, String uAge,
			String uSex) throws Exception {
		String response = DetaDBUtil.backEndRequest("register?uEmail=" + URLEncoder.encode(uEmail) 
		+ "&uName=" + URLEncoder.encode(uName)
		+ "&uPassword=" + URLEncoder.encode(uPassword));
		//�Ժ�д�ȶ��߼�������uPassWDEnsure�� 
		//"&uEmailEnsure=" + URLEncoder.encode(uEmailEnsure)
		//������ҵ��ˣ����˺�eclipse�Ŀӣ������ļ���Ͳ����Զ�refresh��Ҫ�ֶ����������front end��ǰ����Ŀ���кܶ���վ��ͼƬ��
		//+ "&uPassWDEnsure=" + URLEncoder.encode(uPassWDEnsure)
		//+ "&uAddress=" + URLEncoder.encode(uAddress)
		//+ "&uPhone=" + URLEncoder.encode(uPhone)
		//+ "&uWeChat=" + URLEncoder.encode(uWeChat)
		//+ "&uQq=" + URLEncoder.encode(uQq)
		//+ "&uAge=" + URLEncoder.encode(uAge)
		//+ "&uSex=" + URLEncoder.encode(uSex));		
		Map<String, Object> out = VtoV.JsonObjectToMap(new JSONObject(response));
		return out;
	}
}