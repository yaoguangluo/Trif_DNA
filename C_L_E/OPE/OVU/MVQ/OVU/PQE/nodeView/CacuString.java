package OPE.OVU.MVQ.OVU.PQE.nodeView;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class CacuString {
    //因未加速计算, 所以算子名不进行码农的修养化
    public String cauString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        if (string.equals("Node")) {
            return null;
        }
        char[] a = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (a[i] == 't' && a[i + 1] == 'e' && a[i + 2] == 'x' && a[i + 3] == 't') {
                for (int j = i + 5; a[j] != ','; j++) {
                    stringBuilder.append(a[j]);
                }
                return stringBuilder.toString();
            }
        }
        return stringBuilder.toString();
    }
}
