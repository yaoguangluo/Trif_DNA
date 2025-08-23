package OSI.OSU.crab;

import ME.VPC.M.app.App;
import S_A.SEM.bloom.StaticFunctionMap;
import S_A.SEM.bloom.StaticFunctionMapS_AOPM_C;
import S_A.SEM.bloom.StaticRootMap;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
//稍后封装成一个统一的傻瓜接口。
public class CrabInterfaceClass implements CrabInterface {
	String callFunctionKey;

	// public IMV_SIQ chromosomeRoot= new IMV_SIQ();
	// public IMV_SIQ chromosomeFlower= new IMV_SIQ();
	// public IMV_SIQ chromosomeLeaf= new IMV_SIQ();
	// public IMV_SIQ chromosomeBlooming= new IMV_SIQ();
	// public IMV_SIQ chromosomeMetabolism= new IMV_SIQ();
	// public IMV_SIQ chromosomePDE= new IMV_SIQ();
	// public IMV_SIQ chromosomeDNA= new IMV_SIQ();
	// public IMV_SIQ chromosomeNode= new IMV_SIQ();
	/*
	 * 用于表达元基花的链接
	 */
	// 确定元基花的染色体位置
	// 确定元基花的染色体调用细节
	// 确定染色体的粘合机制
	// 确定染色体的剥离机制
	// 确定染色体的静态执行
	// StaticRootMap.chromosomeRoot.put("crab", null);
	// StaticRootMap.chromosomeLeaf.put("crab", null);
	// StaticRootMap.chromosomeDNA.put("crab", null);
	@SuppressWarnings("unchecked")
	public void chromosomes() {
		StaticRootMap.initMap();
		callFunctionKey = "callFunctionKey";
		// 20230207 走统计新陈代谢
		StaticRootMap.staticBloomingTimes.put(callFunctionKey, (long) 0);
		StaticRootMap.staticBloomingTime.put(callFunctionKey,
				System.currentTimeMillis());// 增加记忆时间。20241013
		StaticRootMap.staticClass_XE_Map.put(callFunctionKey, "S_AOPM");
		StaticRootMap.chromosomeNode.put(callFunctionKey,
				new CrabInterfaceClass());// 20241001准备把这行移出去。
		StaticFunctionMapS_AOPM_C.annotationMap.put(callFunctionKey,
				"inputValues:传参因子:因子");
		// String callFunctionKey= "callFunctionKey";
		// StaticRootMap.initMap();
	}

	;

	/*
	 * 用于表达花语的链接
	 */
	// 确定花语的入参模式
	// 确定花语的绽放次数
	// 确定花语的最优选择
	// 确定花语的映射记忆
	// StaticRootMap.chromosomeFlower.put("crab", null);
	// StaticRootMap.chromosomeBlooming.put("crab", null);
	// StaticRootMap.chromosomeMetabolism.put("crab", null);
	@SuppressWarnings("unchecked")
	public void bloomings() {
		StaticRootMap.chromosomeBlooming.put(callFunctionKey, this.getClass());
	}

	;

	/*
	 * 用于表达执行方式和函数内容
	 */
	// 确定函数的dna编码方式和名称
	// 确定输入的计算参数名称
	// 确定输出的结果对象类型
	// 确定函数的三方资源
	// 确定函数的加密形式
	// 确定函数的运算周期
	// StaticRootMap.chromosomeNode.put("crab", null);
	// StaticRootMap.chromosomePDE.put("crab", null);
	public void neroCells() {
	}

	;

	/*
	 * 用于表达执行主体
	 */
	//
	// StaticRootMap.chromosomeBlooming.put("crab", null);
	// StaticRootMap.chromosomeRNA.put("crab", null);
	// System.out.println("Hello Word!");
	// return null;
	public Object logic(IMV_SIQ inputValues, String[] 传参因子, int 因子, App NE) {
		System.out.println("Hello Word!");
		return null;
	}

	;

	// 一个简单osgi扩展例子的被元基花注册调用方法
	@SuppressWarnings("unchecked")
	public void main(String[] arg) {
		// init
		CrabInterfaceClass crabInterfaceClass = new CrabInterfaceClass();
		crabInterfaceClass.chromosomes();
		crabInterfaceClass.bloomings();
		//
		String callFunctionKey = ("callFunctionKey");
		IMV_SIQ outputReg = new IMV_SIQ();
		IMV_SIQ inputValue = new IMV_SIQ();
		String chromosome = StaticRootMap.staticClass_XE_Map
				.getString(callFunctionKey);
		String[] 传参因子 = StaticFunctionMap.callAnnotationMap(chromosome,
				callFunctionKey); // 我是神！ tin神！
		inputValue.put(传参因子[0], "");
		inputValue.put(传参因子[1], "");

		//
		outputReg.put("传参因子", 传参因子);
		outputReg.put("inputValues", inputValue);
		// strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是
		// 传参因子";
		// 稍后移动到 SAOPM花瓣下，逐渐完善即可。20230221
		if (StaticRootMap.chromosomeNode.containsKey(callFunctionKey)) {
			CrabInterface crabInterface = (OSI.OSU.crab.CrabInterface) StaticRootMap.chromosomeNode
					.get(callFunctionKey);
			crabInterface.logic(inputValue, 传参因子, 0, new App());
		}
//		strings[0]= "执行 "+ chromosome+ " 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
//		StaticRootMap.tinShellV005(strings, outputReg);
	}
}