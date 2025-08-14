package S_A.SEM.reflection;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.CallFunctionKey;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapQ_VECS_E;
import S_A.pheromone.IMV_SIQ;

//著作权人+ 作者= 罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StaticReflectionMapQ_VECS_C {
	public static IMV_SIQ annotationMap= new IMV_SIQ();
	@SuppressWarnings("unchecked")
	public static void callFunction(CallFunctionKey callFunctionKey
			, StaticFunctionMapQ_VECS_E staticFunctionMapQ_VECS_C
			, IMV_SIQ output, App NE)  {
		String[] 传参因子= (String[]) output.get("传参因子");
		int 因子= 0;
		Object map=null;
		if(callFunctionKey.contains("searchFromTable", NE)){
			IMV_SIQ inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if(inputValues.getBoolean("find")) {
				staticFunctionMapQ_VECS_C.searchFromTable(NE);
			}
			StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
					, "searchFromTable");
		};
		if(callFunctionKey.contains("searchFromTablewithScale", NE)){
			IMV_SIQ inputValues= StaticFunctionMap.preValues(output, 传参因子);
			if(inputValues.getBoolean("find")) {
				map= staticFunctionMapQ_VECS_C.searchFromTablewithScale(NE);
			}
			StaticFunctionMap.postValues(output, inputValues.getBoolean("find"), map
					, "searchFromTablewithScale");
		};
	}
}
