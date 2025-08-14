package ASQ.ica;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class CorrelationICA_X_frequencyUpSplitWithScale {
    //比较简单的鸡尾酒频率盲分割
    public static double[] _E(double[] originFrequency
        , double[] compareFrequency, double scale) {
        double[] output = new double[originFrequency.length];
        for (int i = 0; i < originFrequency.length; i++) {
            output[i] = originFrequency[i] - compareFrequency[i] > scale ? originFrequency[i] : 0;
        }
        return output;
    }
}
