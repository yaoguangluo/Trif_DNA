package C_A.OSI.AOP.MS.VPC.server;

import C_A.OSI.AOP.MS.VPC.C.DBCategory_C;
import C_A.OSI.AOP.VPC.C.Config_C;
import C_A.OSI.AOP.VPC.C.D_C;
import C_A.OSI.AOP.VPC.C.IU_C;
import C_A.OSI.AOP.VPC.C.Q_C;
import C_A.OSI.AOP.VPC.C.U_C;
import DSU.V.VtoV;
import E_A.OSI.AOP.VPC.PP.port_E.RestAskPort_E;
import E_A.OSI.AOP.VPC.PP.port_E.RestLoginPort_E;
import S_A.pheromone.IMV_SIQ;

import java.io.File;
//作者 罗瑶光
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ServerVPC_Standard {
	public static String forward(String string, IMV_SIQ data)  {
//		if(!DNAAuth.DNAAuthStatusCheckEmailAndPassword(app, string, data)) {
//			return "";
//		}
		//controller
		if(string.contains("/select")){
			return Q_C.exec(string, data);
		}
		if(string.contains("/setDB")){
			return Config_C.exec(string, data);
		}
		if(string.contains("/insert")){
			return IU_C.exec(string, data);
		}
		if(string.contains("/delete")){
			return D_C.exec(string, data);
		}
		if(string.contains("/update")){
			return U_C.exec(string, data);
		}
		if(string.contains("DBCategory")){
			return DBCategory_C.exec(string, data);
		}
		//restMap  // 准备改成1次进入由原来的 前端 后端数据库, 变成前端 数据库。 模式为前端加cache
		// , 后端加数据库。 罗瑶光
		if(string.equalsIgnoreCase("/login")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.login(data.getString("uEmail")
					, data.getString("uPassword")));	
		}
		if(string.equalsIgnoreCase("/find")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.find(data.getString("uEmail")));
		}
		if(string.equalsIgnoreCase("/logout")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.logout(data.getString("uEmail")
					, data.getString("uToken")));
		}
//		if(string.equalsIgnoreCase("/register")){
//			return VtoV.ObjectToJsonString(RestLoginPort_E.register(data.getString("uEmail")
//					, data.getString("uEmailEnsure"), data.getString("uName")
//				, data.getString("uPassword"), data.getString("uPassWDEnsure")
//				, data.getString("uAddress"), data.getString("uPhone")
//				, data.getString("uWeChat"), data.getString("uQq")
//				, data.getString("uAge"), data.getString("uSex")));
//		}
		if(string.equalsIgnoreCase("/register")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.register(data.getString("uEmail")
				, data.getString("uName"), data.getString("uPassword")));
		}
		if(string.equalsIgnoreCase("/change")){
			return VtoV.ObjectToJsonString(RestLoginPort_E.change(data.getString("uEmail")
					, data.getString("uChange"), data.getString("uChangeEnsure")
				, data.getString("uToken"), data.getString("uPassword")));
		}
		//		if(string.equalsIgnoreCase("/checkStatus")){
		//			return VtoV.ObjectToJsonString(RestLoginPortImpl.checkStatus(data.getString("token")));	
		//		}
		if(string.equalsIgnoreCase("/ask")){
			return VtoV.ObjectToJsonString(RestAskPort_E.ask(data.getString("ip")
				, data.getString("token"), data.getString("message")
				, data.getString("pointIp")));
		}
		if(string.equalsIgnoreCase("/feedBack")){
			return VtoV.ObjectToJsonString(RestAskPort_E.feedBack(data.getString("ip")
					, data.getString("token"), data.getString("pointIp")));
		}
		if(string.equalsIgnoreCase("/getAskers")){
			return VtoV.ObjectToJsonString(RestAskPort_E.getAskers(data.getString("token")));
		}	
		if(string.equalsIgnoreCase("/dataWS")){
			return RestAskPort_E.dataWS(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataCX")){
			return RestAskPort_E.dataCX(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataCY")){
			return RestAskPort_E.dataCY(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataXL")){
			return RestAskPort_E.dataXL(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataRN")){
			return RestAskPort_E.dataRN(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataCG")){
			return RestAskPort_E.dataCG(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataCJ")){
			return RestAskPort_E.dataCJ(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataCL")){
			return RestAskPort_E.dataCL(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataXX")){
			return RestAskPort_E.dataXX(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataHF")){
			return RestAskPort_E.dataHF(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataCP")){
			return RestAskPort_E.dataCP(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataZF")){
			return RestAskPort_E.dataZF(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataZY")){
			return RestAskPort_E.dataZY(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataXY")){
			return RestAskPort_E.dataXY(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataYT")){
			return RestAskPort_E.dataYT(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataZT")){
			return RestAskPort_E.dataZT(data.getString("message"));
		}	
		if(string.equalsIgnoreCase("/dataXT")){
			return RestAskPort_E.dataXT(data.getString("message"));
		}	
		return "";
	}

	public static String getCode(String filePath) {
		if(filePath.contains(".html")||filePath.contains(".js")){
			return "UTF-8";
		}
		return "UTF8";
	}

	public static String getFilePath(String string) {
		String root= new File("src/main/resources/static")
				.getAbsolutePath().replace("\\", "/");
		if(null==string||string.equalsIgnoreCase("")
			||string.equalsIgnoreCase("/")){
			string= "/index.html";
		}
		return root + string;
	}
}
