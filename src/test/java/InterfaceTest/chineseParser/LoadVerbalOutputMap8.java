package test.java.InterfaceTest.chineseParser;

import java.util.HashMap;
import java.util.Map;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
/*
 * 这是一个 关于极速分词 的测试类扩展加工函数，main函数demo的test版本，进行输出map化，方便百分比比对。
 * 避免修改源码后输出要全部逐字检查 繁琐 浪费精力。 在导入了api之后进行系统集成，系统需要jdk1.8 以上的java环境，
 * 本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。
 * --罗瑶光
 * */
class LoadVerbalOutputMap8 {
    void exec(Map<String, String>[] verbal, String[] ss, String[] ss1) {
    	ss1[127] = "";
		ss1[128] = "";
		ss1[129] = "";
		ss1[130] = "";
		ss1[131] = "";
		ss1[132] = "";
		ss1[133] = "";
		ss1[134] = "";
		ss1[135] = "";
		ss1[136] = "";
		ss1[137] = "";
		ss1[138] = "";
		ss1[139] = "";
		ss1[140] = "";
		ss1[141] = "";
        //
        for (int i = 127; i < 142; i++) {
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

