package E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.port.E;

import E_A.OP.SM.AOP.MEC.SIQ.VPC.PP.company.E.LoginService_E;
import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.pheromone.IMV_SIQ;
import U_A.PEU.P.cache.Cache_M;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
public class Rest_C_Port_E {
	public static IMV_SIQ startResults(int aa, String token, String auth)
			throws NumberFormatException, JSONException, Exception {
		IMV_SIQ result = new IMV_SIQ();
		String checkStatus = LoginService_E.checkTokenStatus(token, "common");
		if (checkStatus.contains("invalid") && (auth.contains("1"))) {
			result.put("loginInfo", "unsuccess");
			result.put("returnResult", checkStatus);
			return result;
		}
		result.put("end", aa);
		return result;
	}

	public static IMV_SIQ startResultsBb(int bb, String token, String auth)
			throws NumberFormatException, JSONException, Exception {
		IMV_SIQ output = new IMV_SIQ();
		String checkStatus = LoginService_E.checkTokenStatus(token, "common");
		if (checkStatus.contains("invalid") && (auth.contains("1"))) {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", checkStatus);
			return output;
		}
		try {
			URL url = new URL("http://localhost:3306/aa?aa=1");
			// 20230106-System.out.println("http://localhost:3306/aa?aa=1");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException(
						"Failed : HTTP error code : " + conn.getResponseCode());
			}
			DetaBufferedReader br = new DetaBufferedReader(
					DetaInputStreamReader.E((conn.getInputStream())));
			String out = "";
			String out1;
			// 20230106-System.out.println("Output from Server ....
			// \n");
			while ((out1 = br.readDetaLine()) != null) {
				out += out1;
			}
			output.put("result", out);
			conn.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}

	public static IMV_SIQ getDBCategory(String baseName, String token,
			String auth) {
		IMV_SIQ output = new IMV_SIQ();
		if (token != null && !token.equalsIgnoreCase("")) {
			String checkStatus = LoginService_E.checkTokenStatus(token,
					"common");
			if (checkStatus.contains("invalid")
					&& ((auth == null ? "1" : auth).contains("1"))) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		} else {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", "invalid request");
			return output;
		}
		String DBPath = Cache_M.getCacheInfo("DBPath").getValue().toString()
				+ "/" + baseName;
		// 锁定表
		IMV_SIQ table = new IMV_SIQ();
		File fileDBPath = new File(DBPath);
		if (fileDBPath.isDirectory()) {
			String[] files = fileDBPath.list();
			for (String file : files) {
				table.put(file, DBPath + "/" + file);
			}
		}
		Map<String, IMV_SIQ> bases = new IMV_SIQ();
		bases.put(baseName, table);
		output.put("obj", bases);
		return output;
	}

	public static IMV_SIQ getAllDBCategory(String token, String auth) {
		IMV_SIQ output = new IMV_SIQ();
		if (token != null && !token.equalsIgnoreCase("")) {
			String checkStatus = LoginService_E.checkTokenStatus(token,
					"common");
			if (checkStatus.contains("invalid")
					&& ((auth == null ? "1" : auth).contains("1"))) {
				output.put("loginInfo", "unsuccess");
				output.put("returnResult", checkStatus);
				return output;
			}
		} else {
			output.put("loginInfo", "unsuccess");
			output.put("returnResult", "invalid request");
			return output;
		}
		String DBPath = Cache_M.getCacheInfo("DBPath").getValue().toString();
		IMV_SIQ db = new IMV_SIQ();
		List<Object> baseList = new ArrayList<>();
		File fileDBPath = new File(DBPath);
		if (fileDBPath.isDirectory()) {
			String[] files = fileDBPath.list();
			for (String file : files) {
				IMV_SIQ base = new IMV_SIQ();
				String DBBasePath = DBPath + "/" + file;
				File fileDBBasePath = new File(DBBasePath);
				if (fileDBBasePath.isDirectory()) {
					List<Object> tableList = new ArrayList<>();
					String[] filesInfileDBBasePath = fileDBBasePath.list();
					for (String fileInfileDBBasePath : filesInfileDBBasePath) {
						IMV_SIQ table = new IMV_SIQ();
						String DBTablePath = DBBasePath + "/"
								+ fileInfileDBBasePath;
						table.put("tableName", fileInfileDBBasePath);
						table.put("tablePath", DBTablePath);
						tableList.add(table);
					}
					base.put("tableList", tableList);
				}
				base.put("baseName", file);
				base.put("basePath", DBBasePath);
				baseList.add(base);
			}
			db.put("baseList", baseList);
		}
		db.put("dbName", "deta");
		db.put("dbPath", DBPath);
		// 锁定表
		return db;
	}
}
//29	//20230106-System.out.println("4444" + result.get("end"));
// String AA= helloBean.saySomething(aa);
// result.put("end", AA);
//return Response.status(Status.OK).entity(result).build();
/*
 * Session session=
 * HibernateUtil.getSessionFactory().openSession();
 * session.beginTransaction(); IMV_SIQ result=new IMV_SIQ();
 * 
 * String hql= "FROM Lolroler as l where l.name= :userName";
 * 
 * Query query= session.createQuery(hql); result.put("end",
 * results);
 * 
 * query.setString("userName", "Vi"); List<Lolroler>
 * results= query.list(); session.getTransaction().commit();
 * return Response.status(Status.OK).entity(result).build();
 */
/*
 * if(null== redisTemplate.opsForValue().get("click")){
 * redisTemplate.opsForValue().set("click", "0", 24000,
 * TimeUnit.HOURS); }else{ String click=
 * redisTemplate.opsForValue().get("click"); long
 * click_long= Long.parseLong(click); click_long += 1;
 * redisTemplate.opsForValue().set("click",
 * String.valueOf(click_long) , 24000, TimeUnit.HOURS); }
 * //20230106-System.out.println(1111); EventDispatcher
 * dispatcher= new EventDispatcher();
 * dispatcher.registerHandler(UserCreatedEvent.class, new
 * UserCreatedEventHandler());
 * //20230106-System.out.println(2222); User user= new
 * User("iluwatar"); dispatcher.dispatch(new
 * UserCreatedEvent(user));
 * 
 * //20230106-System.out.println(3333); IMV_SIQ result=new
 * IMV_SIQ(); result.put("end", user.getUsername());
 * //20230106-System.out.println("4444"+result.get("end"));
 * return Response.status(Status.OK).entity(result).build();
 */