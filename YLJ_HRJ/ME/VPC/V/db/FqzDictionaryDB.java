package ME.VPC.V.db;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_C;
import O_V.OSI.AOP.MEC.SIQ.plorm.PLORM_E;
import S_A.pheromone.IMV_SIQ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unused")
/*
 * 著作权人, 作者 罗瑶光, 浏阳 yaoguangluo@outlook.com,
 * 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用） 15116110525-
 * 430181198505250014, G24402609, EB0581342 204925063,
 * 389418686, F2406501, 0626136 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路
 * 208号 阳光家园别墅小区 第十栋别墅
 */
public class FqzDictionaryDB {

	public List<String> txtToList() {
		List<String> dic_list = new ArrayList<>();
		return dic_list;
	}

	// @SuppressWarnings({"unchecked", "rawtypes", "unused"})
	public IMV_SIQ listToMap(List<String> dic_list) {
		IMV_SIQ dic_map = new IMV_SIQ();
		IMV_SIQ map = null;
		// for(int i=0; i<)
		String plsql = "setRoot:C:/DetaDB1;" + "baseName:ZYY;"
				+ "tableName:gjjd:select;" + "condition:or:ID|<=|3000;";
		// "condition:or:ID|==|2;";
		try {
			// Select orm= new
			// Select().startAtRootDir("C:/DetaDB").withBaseName("ZYY")
			// .withTableSelect("xybg").withCondition("or",
			// "ID|<=|3000");
			// map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLSQL(plsql,
			// true);
			// map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm,
			// true);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// ArrayList list= (ArrayList) map.get("obj");
		// Iterator<IMV_SIQ> iterator= list.iterator();
		return map;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public IMV_SIQ txtToMap(IMV_SIQ dic_bing_ming, IMV_SIQ dic_yongyao) {
		IMV_SIQ dic_map = new IMV_SIQ();
		IMV_SIQ map = null;
		// for(int i=0; i<)
		String plsql = "setRoot:C:/DetaDB1;" + "baseName:ZYY;"
				+ "tableName:zysz:select;" + "condition:or:ID|<=|3000;";
		// "condition:or:ID|==|2;";
		try {
			PLORM_C orm = new PLORM_E();
			map = orm.startAtRootDir("C:/DetaDB1").withBaseName("ZYY")
					.withTableSelect("zysz").withCondition("or").let("ID")
					.lessThanAndEqualTo("3000").checkAndFixPlsqlGrammarErrors()// 准备完善plsql
																			   // orm语言
																			   // 的语法检查函数
																			   // 和修复函数。
					.checkAndFixSystemEnvironmentErrors()// 准备完善plsql orm语言
														 // 的系统环境检查函数和修复函数。
					.finalE(true).returnAsMap();
			// map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLSQL(plsql,
			// true);
			// map= org.plsql.db.plsql.imp.E_PLSQLImp.E_PLORM(orm,
			// true);
		} catch (Exception e1) {
			// 准备写回滚
			e1.printStackTrace();
		}
		ArrayList list = (ArrayList) map.get("obj");
		Iterator<IMV_SIQ> iterator = list.iterator();
		// int index= 0;
		Here: while (iterator.hasNext()) {
			// index++;
			IMV_SIQ hashmap = iterator.next();
			StringBuilder stringBuilder = new StringBuilder();
			if (hashmap.containsKey("rowValue")) {
				IMV_SIQ rowValue = (IMV_SIQ) hashmap.get("rowValue");
				String keyName = null;
				if (rowValue.containsKey("病名")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("病名");
					keyName = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString()
									.replace("@Tin@", ":");
					if (null == keyName) {
						continue Here;
					}
					String gg = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					gg = new FullDNATokenPDI().initonDeSect(gg);
					keyName = gg.replace("@Tin@", ":");
					dic_bing_ming.put(keyName, keyName);
					stringBuilder.append(keyName);
				}
				if (rowValue.containsKey("用药")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("用药");
					String gg = null == temp.get("culumnValue") ? ""
							: temp.get("culumnValue").toString();
					gg = new FullDNATokenPDI().initonDeSect(gg);
					dic_yongyao.put(keyName, gg.replace("@Tin@", ":"));
					stringBuilder.append(gg.replace("@Tin@", ":"));
				}
				dic_map.put(keyName,
						stringBuilder.toString().replace("@Tin@", ":"));
			}
		}
		return dic_map;
	}
}