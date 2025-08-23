package ME.VPC.H.literature;

import ME.VPC.S.ne.App_S;

//准备导入数据
//罗瑶光
//20211028
public class literial_X_literial_P extends literial {
    //速度慢, 精度高, 适用于文章短篇
    public static String literial_P(App_S app, String input) {
        String output = input.toString();
        try {
            if (null == literialVerbalBaseMap) {//局部调试, 稍后进行合并, 罗瑶光
                literial_X_initVerbalBase.initVerbalBase();
            }
            for (String string : (Iterable<String>) literialVerbalBaseMap.keySet()) {
                output = output.replace(string, literialVerbalBaseMap.getString(string));
            }
        } catch (Exception e) {
            app.hook.hookFrequentException("literial_P异常."
                , System.currentTimeMillis(), e);
        }
        return output;
    }
}