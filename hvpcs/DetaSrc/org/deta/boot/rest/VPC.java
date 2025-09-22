package DetaSrc.org.deta.boot.rest;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import src.java.org.lyg.common.maps.VtoV;
import src.java.org.lyg.vpc.process.portImpl.RestAskPortImpl;
import src.java.org.lyg.vpc.process.portImpl.RestLoginPortImpl;

import DetaSrc.org.deta.boot.controller.SelectController;

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
public class VPC {
//这个文件以后直接继承和扩展即可。
	public static String forward(String string, Map<String, String> data)
			throws Exception {
		// controller
		if (string.contains("/select")) {
			return SelectController.exec(string, data);
		}
		if (string.contains("/setDB")) {
			// return ConfigController.exec(string, data);
		}
		if (string.contains("/insert")) {
			// return InsertController.exec(string, data);
		}
		if (string.contains("/delete")) {
			// return DeleteController.exec(string, data);
		}
		if (string.contains("/update")) {
			// return UpdateController.exec(string, data);
		}
		if (string.contains("DBCategory")) {
			// return DBCategoryController.exec(string, data);
		}
		// restMap
		if (string.equalsIgnoreCase("/login")) {
			return VtoV.ObjectToJsonString(RestLoginPortImpl
					.login(data.get("uEmail"), data.get("uPassword")));
		}
		if (string.equalsIgnoreCase("/find")) {
			return VtoV.ObjectToJsonString(
					RestLoginPortImpl.find(data.get("uEmail")));
		}
		if (string.equalsIgnoreCase("/logout")) {
			return VtoV.ObjectToJsonString(RestLoginPortImpl
					.logout(data.get("uEmail"), data.get("uToken")));
		}
		if (string.equalsIgnoreCase("/register")) {
			return VtoV.ObjectToJsonString(RestLoginPortImpl.register(
					data.get("uEmail"), data.get("uEmailEnsure"),
					data.get("uName"), data.get("uPassword"),
					data.get("uPassWDEnsure"), data.get("uAddress"),
					data.get("uPhone"), data.get("uWeChat"), data.get("uQq"),
					data.get("uAge"), data.get("uSex")));
		}
		if (string.equalsIgnoreCase("/change")) {
			return VtoV.ObjectToJsonString(
					RestLoginPortImpl.change(data.get("uEmail"),
							data.get("uChange"), data.get("uChangeEnsure"),
							data.get("uToken"), data.get("uPassword")));
		}
		// if(string.equalsIgnoreCase("/checkStatus")){
		// return
		// VtoV.ObjectToJsonString(RestLoginPortImpl.checkStatus(data.get("token")));
		// }
		if (string.equalsIgnoreCase("/ask")) {
			return VtoV.ObjectToJsonString(
					RestAskPortImpl.ask(data.get("ip"), data.get("token"),
							data.get("message"), data.get("pointIp")));
		}
		if (string.equalsIgnoreCase("/feedBack")) {
			return VtoV.ObjectToJsonString(RestAskPortImpl.feedBack(
					data.get("ip"), data.get("token"), data.get("pointIp")));
		}
		if (string.equalsIgnoreCase("/getAskers")) {
			return VtoV.ObjectToJsonString(
					RestAskPortImpl.getAskers(data.get("token")));
		}
		if (string.equalsIgnoreCase("/dataWS")) {
			return RestAskPortImpl.dataWS(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataCX")) {
			return RestAskPortImpl.dataCX(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataCY")) {
			return RestAskPortImpl.dataCY(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataXL")) {
			return RestAskPortImpl.dataXL(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataRN")) {
			return RestAskPortImpl.dataRN(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataCG")) {
			return RestAskPortImpl.dataCG(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataCJ")) {
			return RestAskPortImpl.dataCJ(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataCL")) {
			return RestAskPortImpl.dataCL(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataXX")) {
			return RestAskPortImpl.dataXX(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataHF")) {
			return RestAskPortImpl.dataHF(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataCP")) {
			return RestAskPortImpl.dataCP(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataZF")) {
			return RestAskPortImpl.dataZF(data.get("message"));
		}
		if (string.equalsIgnoreCase("/dataYL")) {
			System.out.flush();
			System.out.println(System.currentTimeMillis());
			System.out.flush();
			System.out.println("2huaruiji->" + data.get("email"));
			System.out.flush();
			System.out.println("2huaruiji->" + data.get("token"));
			if (null == data.get("token") || null == data.get("email")) {
				return "";
			}
			return RestAskPortImpl.dataYL(data.get("message"),
					data.get("email"), data.get("token"));
		}
		if (string.equalsIgnoreCase("/dataSC")) {
			System.out.flush();
			System.out.println(System.currentTimeMillis());
		}
		return "";
	}

	public static String getCode(String filePath) throws IOException {
		if (filePath.contains(".html") || filePath.contains(".js")) {
			return "UTF-8";
		}
		return "UTF8";
	}

	public static String getFilePath(String string) {
		String root = new File("src/main/resources/static").getAbsolutePath()
				.replace("\\", "/");
		if (null == string || string.equalsIgnoreCase("")
				|| string.equalsIgnoreCase("/")) {
			string = "/index.html";
		}
		return root + string;
	}
}