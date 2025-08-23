package test.java.InterfaceTest.sort.objectSort.mapSort;

import U_V.OEU.LYG4DQS4D.LYG9DWithDoubleTopSort5D;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
class Map_ESU_X_mapToListTest {
	public static void main(String[] argv) {
		Map_ESU_X_mapToListTest map_ESU_X_mapToListTest=new Map_ESU_X_mapToListTest();
		map_ESU_X_mapToListTest._E();
	}
    /*
     * 这是一个 用于德塔快速排序5代进行左右比对分词优化的算法对map提取变换的double数组排序demo
     * 测试main函数demo的test版本，  同时refer 哈尔霍夫对快速排序qucik sort 4代的基础贡献 在导入了
     * api之后进行系统集成，然后用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，
     * 源码的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以
     * 用println来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，本人会把测试的输入
     * 输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。 --罗瑶光
     * */
    @Test
    void _E() {
        //初始化 可以是double，也可以是int，string等可以排序的变量key，稍后我都会全部举例。
        Map<Double, Object> input = new HashMap<>();
        //输出参数为列表，可以是 object[], 可以是List<Object>，
        List<Object> outputList = new ArrayList<>();
        Object[][] outputArray = new Object[6][2];
        //得到一个排序的map
        input.put(3.0, "UI2VJ");//伪参数，需要list等复数objects类型 去合并。本测试不管。
        input.put(11.0, "UIVJ");
        input.put(3.0, "UI5VJ");//真参数。
        input.put(5.0, "UI1VJ");
        input.put(19.0, "UI8VJ");
        input.put(2.0, "UI9VJ");
        //
        //执行
        double[] needKeySort = new double[input.size()];
        int i = 0;
        //map进行提取需要排序的变量数组
        Iterator<Double> iterators = input.keySet().iterator();
        //Set sets= input.keySet();
        while (iterators.hasNext()) {
            needKeySort[i++] = iterators.next();
        }
        //变量数组进行排序
        LYG9DWithDoubleTopSort5D lYG9DWithDoubleTopSort5D = new LYG9DWithDoubleTopSort5D();
        lYG9DWithDoubleTopSort5D.sort(needKeySort, 7, 70);
        //map取出排序的对象list 或者其他格式
        for (int j = 0; j < needKeySort.length; j++) {
            Object object = input.get(needKeySort[j]);
            //输出
            System.out.println(needKeySort[j]);
            System.out.println(object.toString());
            //变换
            outputList.add(object);
            //其他格式扩展
            outputArray[j][0] = j;
            outputArray[j][1] = object;
        }
        //输出
        /*
        *   Connected to the target VM, address: '127.0.0.1:59210', transport: 'socket'
            2.0
            UI9VJ
            3.0
            UI5VJ
            5.0
            UI1VJ
            11.0
            UIVJ
            19.0
            UI8VJ
            Disconnected from the target VM, address: '127.0.0.1:59210', transport: 'socket'

            Process finished with exit code 0
        * */
        //结束
    }
}