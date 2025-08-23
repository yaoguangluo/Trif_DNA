package A_V.ASQ.PSU.test;

import S_A.SVQ.stable.S_Common;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class EffectionDemo {
    public static void main(String[] argv) {
        TimeCheck timeCheck = new TimeCheck();
        //titan sets
        //20230106-System.out.println(1);
        IMV_SIQ map = new IMV_SIQ();
        for (int i = 0; i < 100000; i++) {
            map.put("" + i, S_Common.STRING_EMPTY + i);
        }
        //20230106-System.out.println(2);
        //subset
        IMV_SIQ map1 = new IMV_SIQ();
        for (int i = 0; i < 30000; i++) {
            map1.put("" + i, S_Common.STRING_EMPTY + i);
        }
        //20230106-System.out.println(3);
        IMV_SIQ map2 = new IMV_SIQ();
        for (int i = 0; i < 30000; i++) {
            map2.put("" + i, S_Common.STRING_EMPTY + i);
        }
        //20230106-System.out.println(4);
        IMV_SIQ map3 = new IMV_SIQ();
        for (int i = 0; i < 30000; i++) {
            map3.put("" + i, S_Common.STRING_EMPTY + i);
        }
        //20230106-System.out.println(7);
        //time check
        timeCheck.begin();
        function1(map);
        timeCheck.end();
        timeCheck.duration();
        //
        timeCheck.begin();
        function2(map1, map2, map3);
        timeCheck.end();
        timeCheck.duration();
    }

    private static void function2(IMV_SIQ map1, IMV_SIQ map2
        , IMV_SIQ map3) {
        Here:
        for (int i = 0; i < 100000; i++) {
            int digits = (int) (Math.random() * 30000);
            if (map1.containsKey(digits + "")) {
                continue Here;
            }
            if (map2.containsKey(digits + "")) {
                continue Here;
            }
            if (map3.containsKey(digits + "")) {
                continue Here;
            }
        }
    }

    private static void function1(IMV_SIQ map) {
        Here1:
        for (int i = 0; i < 100000; i++) {
            int digits = (int) (Math.random() * 30000);
            if (map.containsKey(digits + "")) {
                continue Here1;
            }
        }
    }
}
//39
//		//20230106-System.out.println(5);
//		Map<String, String> map4= new IMV_SIQ();
//		for(int i=0; i<20000; i++) {
//			map4.put(""+i, S_Common.STRING_EMPTYi);
//		}
//		//20230106-System.out.println(6);
//		Map<String, String> map5= new IMV_SIQ();
//		for(int i=0; i<20000; i++) {
//			map5.put(""+i, S_Common.STRING_EMPTYi);
//		}