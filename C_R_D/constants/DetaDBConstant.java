package constants;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public interface DetaDBConstant {
	//common
	int DIGIT_ONE= 1;
	int DIGIT_60000= 60000;
	//Token expired.
	String ERRORCODE_ER1001= "ER1001";

	//rest tire
	String REST_JSON_CONFIG= "application/json;charset=utf-8";
	String REST_LOGIN_LOGIN= "/login";
	String REST_LOGIN_LOGOUT= "/logout";
	String REST_LOGIN_REGISTER= "/register";
	String REST_LOGIN_FIND= "/find";
	String REST_LOGIN_CHANGE= "/change";

	String DB_LOGIN_U_NAME= "uName";
	String DB_LOGIN_U_CHANGE= "uChange";
	String DB_LOGIN_U_CHANGE_ENSURE= "uChangeEnsure";
	String DB_LOGIN_U_AGE= "uAge";
	String DB_LOGIN_U_EMAIL= "uEmail";
	String DB_LOGIN_U_EMAIL_ENSURE= "uEmailEnsure";
	String DB_LOGIN_U_ID= "uId";
	String DB_LOGIN_U_SEX= "uSex";
	String DB_LOGIN_U_PHONE= "uPhone";
	String DB_LOGIN_U_ADDRESS= "uAddress";
	String DB_LOGIN_U_WECHAT= "uWeChat";
	String DB_LOGIN_U_PSWD= "uPassword";
	String DB_LOGIN_U_PSWD_ENSURE= "uPasswordEnsure";
	String DB_LOGIN_U_PSTOKEN= "uToken";
	String DB_LOGIN_U_CLASS= "uClass";
	String DB_LOGIN_U_QQ= "uQq";

	//service tire

	//schedular tire

	//dao tire

	//database tire

	//condition tire

}
