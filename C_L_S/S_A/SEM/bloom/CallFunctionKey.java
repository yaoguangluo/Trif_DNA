package S_A.SEM.bloom;

import ME.VPC.M.app.App;

/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class CallFunctionKey {
    public String value;

    public CallFunctionKey(String string) {
        value = new String(string);
    }

    public boolean contains(String string, App NE) {//later in list
        if (string.contains("orp") || string.contains("elete") || string.contains("reat")
            || string.contains("pdate") || string.contains("hange")
            || string.contains("orp") || string.contains("增") || string.contains("改")
            || string.contains("删")) {
            if (value.equalsIgnoreCase(string)) {
                return true;
            }
            return false;
        } else {
            if (value.contains(string)) {
                double PdePossiblity = Math.random();
                if (PdePossiblity > NE.app_S.pdeRatio) {
                    return true;//flex仅存在应激过敏的状态下。
                }
                if (value.equalsIgnoreCase(string)) {
                    return true;
                }
                return false;//flex仅存在应激过敏的状态下。
            }
            return false;
        }
    }
}