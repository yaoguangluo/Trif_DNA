package ME.VPC.S.pillow;
import ME.VPC.S.ne.App_S;
import ME.VPC.M.app.App;
import P.image.Color_P;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.WordFrequency;
import S_A.SVQ.stable.S_Maps;
import S_A.SVQ.stable.S_Pos;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_SS;

import java.util.Iterator;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class PageWords {

    public static void renderWordLoopPOS(StringBuilder page
        , List<String> setsForGet, IMV_SIQ_SS map, String key
        , boolean needMap, App NE) {
        App_S u = NE.app_S;
        IMV_SIQ pos = u.fMHMMListOneTime_E_X_S.posCnToCn;
        Iterator<String> iterator = setsForGet.iterator();
        Here:
        while (iterator.hasNext()) {
            String setOfi = iterator.next();
            if (pos.get(setOfi) == null) {
                page.append("<span style=\"background:#ffffff\">"
                    + "<font color=\"black\""
                    + " size=\"" + NE.app_S.size_font_rot + "\">"
                    + setOfi + "</font></span>");
                continue Here;
            }
            if (needMap) {
                MapProcedureWordLoopPOS(map, setOfi, NE);
            }
            if (!setOfi.equals("")) {
                if (key.contains(setOfi) && (S_Maps.mingCi.containsKey(setOfi)
                    || S_Maps.dongCi.containsKey(setOfi)
                    || S_Maps.xingRongCi.containsKey(setOfi))) {
                    page.append("<span style=\"background:red\">"
                        + "<font color=\"white\">" + setOfi + "</font></span>");
                    continue Here;
                }
                if (S_Maps.mingCi.containsKey(setOfi)) {
                    page.append("<span style=\"background:"
                        + Color_P.P(245
                        , 255 - 40 - u.raterot << 3, 245)
                        + "\"><font color="
                        + Color_P.P(0, 0, 0)
                        + " size=\"" + NE.app_S.size_font_rot + "\">"
                        + setOfi + "</font></span>");
                    continue Here;
                }
                if (S_Maps.dongCi.containsKey(setOfi)) {
                    page.append("<span style=\"background:"
                        + Color_P.P(255 - 10 - u.raterot << 3
                        , 255, 245 - 40 - u.raterot << 3)
                        + "\"><font color="
                        + Color_P.P(0, 0, 0)
                        + " size=\"" + NE.app_S.size_font_rot + "\">"
                        + setOfi + "</font></span>");
                    continue Here;
                }
                if (S_Maps.xingRongCi.containsKey(setOfi)) {
                    page.append("<span style=\"background:"
                        + Color_P.P(245
                        , 255, 245 - 40 - u.raterot << 3)
                        + "\"><font color="
                        + Color_P.P(0, 0, 0)
                        + " size=\"" + NE.app_S.size_font_rot + "\">"
                        + setOfi + "</font></span>");
                    continue Here;
                }
                if (pos.getString(setOfi).contains("副")) {
                    page.append("<span style=\"background:"
                        + Color_P.P(255 - 10 - u.raterot << 3
                        , 255, 245) + "\">" + "<font color="
                        + Color_P.P(0, 0, 0)
                        + " size=\"" + NE.app_S.size_font_rot + "\">"
                        + setOfi + "</font></span>");
                    continue Here;
                }
                page.append("<span style=\"background:white\">"
                    + "<font color=" + "\"black\""
                    + " size=\"" + NE.app_S.size_font_rot + "\">"
                    + setOfi + "</font></span>");
            }
        }
    }

    @SuppressWarnings("unused")
	public static void MapProcedureWordLoopPOS(IMV_SIQ_SS map
        , String setOfi, App NE) {
        IMV_SIQ pos = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
        if (S_Maps.mingCi.containsKey(setOfi) || S_Maps.dongCi.containsKey(setOfi)
            || S_Maps.xingRongCi.containsKey(setOfi)) {
            if (map.containsKey(setOfi)) {
                WordFrequency wordFrequency = map.getW(setOfi);
                wordFrequency.I_frequency(wordFrequency.get_frequency()
                    + S_Pos.INT_ONE);
                map.put(setOfi, wordFrequency);
            } else {
                WordFrequency wordFrequency = new WordFrequency(1.0
                    , setOfi);
//                WordFrequency wordFrequency = new WordFrequency();
//                wordFrequency.I_frequency(1.0);
//                wordFrequency.I_Word(setOfi);
                map.put(setOfi, wordFrequency);
            }
        }
    }
}	
	