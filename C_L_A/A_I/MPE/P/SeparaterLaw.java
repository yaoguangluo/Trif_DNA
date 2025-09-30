package A_I.MPE.P;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳 yaoguangluo@outlook.com,
 * 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 * 15116110525- 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136 湖南省 浏阳市 集里街道
 * 神仙坳社区 大塘冲路一段 208号 阳光家园别墅小区 第十栋别墅 第三层
 */
public class SeparaterLaw{
	public ConcurrentLinkedDeque<DNA> separater(ConcurrentLinkedDeque<DNA> original) {
		ConcurrentLinkedDeque<DNA> output= new ConcurrentLinkedDeque<>();
		//random
		if(Math.random()> 0.999997) {
			Iterator<DNA> iterator= original.iterator();
			while(iterator.hasNext()) {
				output.add(new CopyLaw().mutationCopy(iterator.next()));
			}
		}else {
			Iterator<DNA> iterator= original.iterator();
			while(iterator.hasNext()) {
				output.add(new CopyLaw().copy(iterator.next()));
			}
		}
		return output;
	}
}
