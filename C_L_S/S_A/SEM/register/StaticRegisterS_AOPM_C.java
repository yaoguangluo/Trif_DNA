package S_A.SEM.register;

import S_A.SEM.bloom.StaticFunctionMapS_AOPM_E;

import java.util.Iterator;

import ME.VPC.M.app.App;

//著作权人+ 作者= 罗瑶光
/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public class StaticRegisterS_AOPM_C {
	@SuppressWarnings("unchecked")
	public static void load(
		StaticFunctionMapS_AOPM_E staticFunctionMapS_AOPM_E, App NE) {

		//稍后封装
		staticFunctionMapS_AOPM_E.annotationMap.put("DeleteCellORM",
			"rootPath:baseName:tabKey:rowCells:initonEncrypt");
		staticFunctionMapS_AOPM_E.annotationMap.put("DeleteCellPLSQL",
			"rootPath:baseName:tabKey:rowCells:initonEncrypt");
		staticFunctionMapS_AOPM_E.annotationMap.put("DropCellORM",
			"rootPath:baseName:tabKey");
		staticFunctionMapS_AOPM_E.annotationMap.put("DropCellPLSQL",
			"rootPath:baseName:tabKey");
		staticFunctionMapS_AOPM_E.annotationMap.put("InsertCellORM",
			"rootPath:baseName:tabKey:rowCells:initonEncrypt");
		staticFunctionMapS_AOPM_E.annotationMap.put("InsertCellPLSQL",
			"rootPath:baseName:tabKey:rowCells:initonEncrypt");
		staticFunctionMapS_AOPM_E.annotationMap.put("UpdateCellORM",
			"tabKey:rowId:cellName:cellValue");
		staticFunctionMapS_AOPM_E.annotationMap.put(
			"UpdateCellORMByRowId",
			"rootPath:baseName:unTest:tabKey:rowId:cellName:cellValue");
		staticFunctionMapS_AOPM_E.annotationMap.put(
			"UpdateCellORMByEquals",
			"rootPath:baseName:unTest:tabKey:conditionSubject:conditionObject:cellName:cellValue");
		staticFunctionMapS_AOPM_E.annotationMap.put("UpdateCellPLSQL",
			"tabKey:rowId:cellName:cellValue");
		staticFunctionMapS_AOPM_E.annotationMap.put("creatMap",
			"void");

		Iterator<String> iterators = staticFunctionMapS_AOPM_E.annotationMap
			.keySet().iterator();
		while (iterators.hasNext()) {
			String temp = iterators.next().toString();
			NE.app_S.staticRootMap.staticBloomingTimes.put(temp,
				(long) 0);
			NE.app_S.staticRootMap.staticClass_XE_Map.put(temp,
				"S_AOPM");
		}
	}
}
