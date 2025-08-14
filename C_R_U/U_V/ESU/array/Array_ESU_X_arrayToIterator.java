package U_V.ESU.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

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

public class Array_ESU_X_arrayToIterator {
    public static Iterator<Object> _E(Object[] objects) {
        List<Object> list = new ArrayList<>();
        Collections.addAll(list, objects);//later
        return list.iterator();
    }
}
//for(Object object: objects) {
//			list.add(object);
//		}
