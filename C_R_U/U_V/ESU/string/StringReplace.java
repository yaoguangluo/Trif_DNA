package U_V.ESU.string;

import ME.VPC.M.app.App;
import P.image.Color_P;
import S_A.SVQ.stable.S_Maps;
import S_A.pheromone.IMV_SIQ;

/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class StringReplace {
    //WINDOWS REXP
    public static String StringHTMLReplaceARCP(String string) {
        string = string.replace("\\", "");
        string = string.replace("<", "");
        string = string.replace(">", "");
        string = string.replace("!", "");
        string = string.replace("-", "");
        return string;
    }

    public static boolean pos(String key, IMV_SIQ pos, IMV_SIQ maps
        , String setOfi, StringBuilder page, App NE) {
        String split = "【";
        String splite = "】";
        if (key.contains(setOfi) && (S_Maps.mingCi.containsKey(setOfi)
            || S_Maps.dongCi.containsKey(setOfi) || S_Maps.xingRongCi.containsKey(setOfi))) {
            page.append("<span style=\"background:red\"><font color=\"white\">").append(setOfi).append(maps.containsKey(setOfi) ? split + maps.get(setOfi) + splite : "").append("</font></span>");
            return true;
        }
        if (pos.getString(setOfi).contains("名")) {
            page.append("<span style=\"background:").append(Color_P.P(255, 245, 255)).append("\"><font color=\"black\"").append(" size=\"").append(NE.app_S.size_font_rot).append("\">").append(setOfi).append(maps.containsKey(setOfi) ? split + maps.get(setOfi) + splite : "").append("</font></span>");
            return true;
        }
        if (pos.getString(setOfi).contains("动")) {
            page.append("<span style=\"background:")
                .append(Color_P.P(245, 255, 245))
                .append("\"><font color=\"black\"")
                .append(" size=\"").append(NE.app_S.size_font_rot)
                .append("\">").append(setOfi).append(maps.containsKey(setOfi) ? split
                    + maps.get(setOfi) + splite : "").append("</font></span>");
            return true;
        }
        if (pos.getString(setOfi).contains("形")) {
            page.append("<span style=\"background:")
                .append(Color_P.P(255, 255, 245))
                .append("\"><font color=\"black\"").append(" size=\"")
                .append(NE.app_S.size_font_rot).append("\">").append(setOfi)
                .append(maps.containsKey(setOfi) ? split + maps.get(setOfi)
                    + splite : "").append("</font></span>");
            return true;
        }
        if (pos.getString(setOfi).contains("副")) {
            page.append("<span style=\"background:#F1FFFF\"><font color=\"black\""
                    + " size=\"").append(NE.app_S.size_font_rot).append("\">")
                .append(setOfi).append(maps.containsKey(setOfi) ? split
                    + maps.get(setOfi) + splite : "").append("</font></span>");
            return true;
        }
        return false;
    }
}