package ME.VPC.V.db;

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
public class XyscDictionaryFromDB {

	public List<String> txtToList() {
		List<String> dic_list = new ArrayList<>();
		return dic_list;
	}

	// @SuppressWarnings({"unchecked", "rawtypes", "unused"})
	public IMV_SIQ listToMap(List<String> dic_list) {
		IMV_SIQ dic_map = new IMV_SIQ();
		IMV_SIQ map = null;
		// for(int i=0; i<)
		String plsql = "setRoot:C:/DetaDB;" + "baseName:ZYY;"
				+ "tableName:xybg:select;" + "condition:or:ID|<=|3000;";
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
	public void txtToMap(IMV_SIQ dic_yao_ming, IMV_SIQ dic_chengfen_danwei,
			IMV_SIQ dic_yong_fa, IMV_SIQ dic_yao_li, IMV_SIQ dic_zhu_yi,
			IMV_SIQ dic_shi_ying, IMV_SIQ dic_bu_liang_fan_ying,
			IMV_SIQ dic_yao_wu_xiang_hu_zuo_yong, IMV_SIQ dic_qi_ta,
			IMV_SIQ dic_yong_liang, IMV_SIQ dic_jie_shao) {
		IMV_SIQ dic_map = new IMV_SIQ();
		IMV_SIQ map = null;
		// for(int i=0; i<)
		String plsql = "setRoot:C:/DetaDB;" + "baseName:ZYY;"
				+ "tableName:xybg:select;" + "condition:or:ID|<=|3000;";
		// "condition:or:ID|==|2;";
		try {
			PLORM_C orm = new PLORM_E();
			map = orm.startAtRootDir("C:/DetaDB").withBaseName("ZYY")
					.withTableSelect("xybg").withCondition("or").let("ID")
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
		while (iterator.hasNext()) {
			IMV_SIQ hashmap = iterator.next();
			StringBuilder stringBuilder = new StringBuilder();
			if (hashmap.containsKey("rowValue")) {
				IMV_SIQ rowValue = (IMV_SIQ) hashmap.get("rowValue");
				String keyName = null;
				if (rowValue.containsKey("西药名")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("西药名");
					keyName = temp.get("culumnValue").toString()
							.replace("@Tin@", ":");
					dic_yao_ming.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("介绍")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("介绍");
					dic_jie_shao.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("药理")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("药理");
					dic_yao_li.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("主要成分")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("主要成分");
					dic_chengfen_danwei.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("用法")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("用法");
					dic_yong_fa.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("注意事项")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("注意事项");
					dic_zhu_yi.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("适应症")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("适应症");
					dic_shi_ying.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("不良反应")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("不良反应");
					dic_bu_liang_fan_ying.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("用量")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("用量");
					dic_yong_liang.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("药物相互作用")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("药物相互作用");
					dic_yao_wu_xiang_hu_zuo_yong.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				if (rowValue.containsKey("其他")) {
					IMV_SIQ temp = (IMV_SIQ) rowValue.get("其他");
					dic_qi_ta.put(keyName,
							null == temp.get("culumnValue") ? ""
									: temp.get("culumnValue").toString()
											.replace("@Tin@", ":"));
					stringBuilder.append(temp.get("culumnValue").toString());
				}
				dic_map.put(keyName,
						stringBuilder.toString().replace("@Tin@", ":"));
			}
		}
		// return dic_map;
	}
}