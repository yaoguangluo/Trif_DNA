package test.java.InterfaceTest.chineseParser;

import java.util.HashMap;
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
/*
 * 这是一个 关于极速分词 的测试类扩展加工函数，main函数demo的test版本，进行输出map化，方便百分比比对。
 * 避免修改源码后输出要全部逐字检查 繁琐 浪费精力。 在导入了api之后进行系统集成，系统需要jdk1.8 以上的java环境，
 * 本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
 * --罗瑶光
 * */
class LoadVerbalOutputMap6 {
    void exec(Map<String, String>[] verbal, String[] ss, String[] ss1) {
    	ss1[97] = "";
		ss1[98] = "";
		ss1[99] = "";
		ss1[100] = "";
		ss1[101] = "";
		ss1[102] = "";
		ss1[103] = "";
		ss1[104] = "";
		ss1[105] = "";
		ss1[106] = "";
		ss1[107] = "";
		ss1[108] = "";
		ss1[109] = "";
		ss1[110] = "";
		ss1[111] = "";
        //
        for (int i = 97; i < 112; i++) {
            String[] strings = ss1[i].split("-");
            verbal[i] = new HashMap<>();
            int size = 0;
            for (int j = 0; j < strings.length; j++) {
                if (strings[j].equals(" ") && strings[j].equals("-")) {
                } else {
                    size++;
                    verbal[i].put(strings[j], "");
                }
            }
            verbal[i].put("-size-", "" + size);
        }
    }
}
//ss ss1输出字符--见DemoEXTest_output.txt DemoEXTest_output1.txt DemoEXTest_output2.txt 文件

