package S_I.OSI.PSO.regex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//作者 罗瑶光
//2021/11/23
//20220713如果正则处理无结果则封装原行返回 见86-88行
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class DoSplit {

    public static List<String> splitRegex(String input, String split, String unSplit, String inst) {
        input = input.replace(unSplit, inst);
        /*
         *
         *  input ds, ds, ada \\, sd
         *
         *  split= ,
         *  unSplit= \
         *
         *  output
         *  0  ds
         *  1  ds
         *  2  ada \, sd
         *
         *
         * */
        //1
        //String string= input.replace(unSplit+ split, "");//这种方法会速度变慢。
        //.....

        List<String> list = new ArrayList<>();
        //2
        //for(int i= 0; i< input.length(); i++) {//这种方法复杂。
        //	...
        //}

        //3
        //String[] strings= input.split(split);
        //for(int i= 0; i< strings.length; i++) {//这种方法快一点点还是复杂。
        //	if(strings[i].contains(unSplit)) {//满足包含
        //		String string= strings[i].replace(unSplit, "");//满足末尾匹配
        //       ......
        //	}
        //	list.add();
        //}
        //ds, ds, ada \\, sd
        //ds, ds, ada
        //sd

        //稍后设计为StringBuilder
        //String connect= unSplit+ split;
        //String[] stringsU= input.split(connect);//这里是PCRE linux 通配正则, 所以会将\定义为 关键字语法。
        String connect = "DetaConnect";
        input = input.replace(unSplit + split, "DetaConnect");
        String[] stringsU = input.split(connect);//这里是PCRE linux 通配正则, 所以会将\定义为 关键字语法。
        String temp = "";
        int postFix = 0;
        for (int i = 0; i < stringsU.length; i++) {
            String[] strings = stringsU[i].split(split);
            postFix = strings.length;
            int begin = 0;
            int end = 0;
            if (temp.isEmpty()) {//用于区别冒号的句型隔开添加
                temp += strings[strings.length - 1];
                begin = 0;
            } else {
                temp += unSplit + split + strings[0];
                list.add(temp.toString().replace(inst, unSplit));
                temp = strings[strings.length - 1]; //用来计算末尾的参数,
                begin = 1;
            }
            end = strings.length - 1;
            for (int j = begin; j < end; j++) {
                list.add(strings[j].replace(inst, unSplit));
            }
        }
        if (!temp.isEmpty() && 1 != postFix) {
            list.add(temp.replace(inst, unSplit));
        }
        if (1 == stringsU.length && 1 == postFix) {
            list.add(temp.replace(inst, unSplit));  //如果正则处理无结果则封装原行返回
        }
        return list;
    }

    public static void main(String[] args) {
        //String string= "ds, ds, ada \\, sd, ada \\\\, sd";
        //String string= "d\\, d, s, ada \\, sd, ada \\\\, sd";
        String string = "ds, , ds, ada \\, sd, ada \\\\, s, d";
        List<String> output = DoSplit.splitRegex(string, ", ", "\\", "\\");//nb
        Iterator<String> iterator = output.iterator();
        while (iterator.hasNext()) {
            //iterator.next();
            //20230106-//20230106-
            System.out.println(iterator.next());
        }
    }
}
