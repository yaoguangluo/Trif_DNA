package OSI.OSU.crab;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SQI;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 * 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
public interface CrabInterface {
	// public IMV_SQI chromosomeRoot= new IMV_SQI();
//	public IMV_SQI chromosomeFlower= new IMV_SQI();
//	public IMV_SQI chromosomeLeaf= new IMV_SQI();
//	public IMV_SQI chromosomeBlooming= new IMV_SQI();
//	public IMV_SQI chromosomeMetabolism= new IMV_SQI();
//	public IMV_SQI chromosomePDE= new IMV_SQI();
//	public IMV_SQI chromosomeDNA= new IMV_SQI();
//	public IMV_SQI chromosomeNode= new IMV_SQI();
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
	public void chromosomes(App NE);

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
	public void bloomings(App NE);

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
	public void neroCells();

	/*
	 * 用于表达执行主体
	 */
	//
	// StaticRootMap.chromosomeBlooming.put("crab", null);
	// StaticRootMap.chromosomeRNA.put("crab", null);
	// System.out.println("Hello Word!");
	// return null;
	public boolean logic(IMV_SQI inputValues, String[] 传参因子, int 因子, App NE, IMV_SQI outputReg);

	// public void main(String[] arg) {
	// CrabInterface crabInterface= CrabInterface.logic(null,
	// arg, 0);
	// CrabInterface.logic(null, arg, 0);
	// public stativ
	// }
}