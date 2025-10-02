package S_A.pheromone;

import ME.VPC.M.app.App;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import S_logger.Log;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
/*
 * IMV_SIQ随着持续地优化，变得越来越复杂，于是之后有必要进行HVPCS关系分析。
 * 减少30%内存堆栈
 * --trif
 * 
 * */
@SuppressWarnings({ "unchecked" })
public class IMV_SIQ_utils {

	public static void couldSQLThenSQL(String key, String[] strings,
		TinMap output, App NE) throws InterruptedException,
		IOException {
		// 7代花再缩减 // flex
		for (String actionKey : (Iterable<String>) NE.app_S.flowerAction.FlowerP_E_KernelActions
			.keySet()) {
			Log.logger.info("400-00001001-" + key);
			Log.logger.info("400-00001002-" + actionKey);
			if (key.contains(actionKey)) {// later separate.
				String temp = NE.app_S.flowerAction.FlowerP_E_KernelActions
					.getString(actionKey);
				NE.app_S.flowerAction.doAction(temp, strings, output,
					NE);
			}
		}
	}

	// later for char
	public static void couldDoThenDo(String key, String[] strings,
		TinMap output, App NE, HashMap<String, Integer> scores)
		throws InterruptedException, IOException {// 7代花再缩减 flex
		Iterator<String> iterators = NE.app_S.flowerAction.FlowerSixDomainActions
			.keySet().iterator();
		while (iterators.hasNext()) {
			String actionKey = iterators.next();
			/*
			 * 思考，stringsKey因为被加工处理，单字被过滤了，那么需要一种条件算法来辅助判断
			 * 判断的方法有很多，通用的方法打分匹配来确定相似度。然后多个相似度 词组进行
			 * 累积总分触发因为我要挑战我自己，所以不能用普通的逻辑来优化。 --罗瑶光
			 */
			if (key.contains(actionKey)) {// later separate.
				/* 精确匹配就直接触发 */
				String temp = NE.app_S.flowerAction.FlowerSixDomainActions
					.getString(actionKey);
				NE.app_S.flowerAction.doAction(temp, strings, output,
					NE);
				Log.logger.info("400-10000002" + actionKey);
				Log.logger.info("400-10000003-" + temp);
			} else {
				// System.out.println("400-10000004" + key);
				/*
				 * 这里也一样加一个条件，可以有效的去重+的逻辑, 提高计算关系的依赖。
				 * 
				 * --罗瑶光
				 */
				if (key.contains("\\+")) {
					// -2 动名逻辑
					String[] stringsKey = key.split("\\+");
					String[] stringsAction = actionKey.split("\\+");
					marchScore(stringsKey, stringsAction, actionKey,
						scores, strings, output, NE);
					continue;
				}
				// -1 名动逻辑
				String[] stringsKey = key.split("-");
				String[] stringsAction = actionKey.split("-");
				/* 相似匹配就直接累积触发 */
				marchScore(stringsKey, stringsAction, actionKey,
					scores, strings, output, NE);
				// todo 。。
			}
		}
	}

	/*
	 * 进行逻辑化简没必要这么复杂。既然我用累积和笛卡尔全部关系，那就用equals代替contains
	 * ，增加精确度。大幅减少内存容量。这种计算逻辑适用于在非完整匹配的元基编码变量条件下，
	 * 可以寻找计算关系相似计算，而不是寻找计算成分相似计算。避免误差快速放大。
	 * 我认为计算关系相似是一种拓扑类的计算寻址，真好吃 和 好真吃，区别明显，但也可以歧义理解。
	 * 而计算成分相似，输入变量都不一样，输出误差就大了，真好吃 和 真不好吃， 4字25%的区别， 截然不同。
	 */
	public static void marchScore(String[] stringsKey,
		String[] stringsAction, String actionKey,
		HashMap<String, Integer> scores, String[] strings,
		TinMap output, App NE) throws InterruptedException,
		IOException {
		if (stringsKey.length > 1 && stringsAction.length > 1) {
			/*
			 * 如果底层缓存精确执行，这里上层可以松耦合执行。
			 * */
			if (stringsKey[0].equals(stringsAction[0])
				|| stringsKey[1].equals(stringsAction[1])) {
				Log.logger.info("400-10000004-1-" + actionKey);
				String temp = NE.app_S.flowerAction.FlowerSixDomainActions
					.getString(actionKey);
				if (scores.containsKey(temp)) {
					int score = scores.get(temp);
					if (0 == score) {
						return;
					}
					score++;
					/*
					 * //- trif 谨慎使用这种逻辑，罗瑶光个人建议进行意识维度分层。
					 * 避免混淆结果。之后提取出去成为入参精度。可自主调节。
					 */
					int scale = 1;
					if (score > scale) {
						NE.app_S.flowerAction.doAction(temp, strings,
							output, NE);
						scores.put(temp, 0);
					}
					scores.put(temp, score);
				} else {
					scores.put(temp, 1);
					/*
					 * 有些只做一次的驱动可以另外分类进行算法描述 最简单的实例是map 
					 * 对不同的action + 触发精度分数规则，
					 * 既然是equals，那么这里 属于必须做的操作。 later -trif
					 */
					NE.app_S.flowerAction.doAction(temp, strings,
						output, NE);
					// Todo -trif
				}

			}
		}
	}
}
//    public double getDouble(String key){
//        if(this.containsKey(key)){
//            return (Double)(this.get(key));
//        }
//        return 0.0;
//    }

//    public String getTrimString(String key){
//        if(this.containsKey(key)) {
//            return this.get(key).toString().replaceAll("\\s*", "");
//        }
//        return "";
//    }
//    public boolean getCompareV(String key, String compare){
//        if(this.containsKey(key)){
//            return this.get(key).toString().equalsIgnoreCase(compare);
//        }
//       return false;
//    }