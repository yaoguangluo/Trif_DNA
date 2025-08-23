package ME.VPC.S.buttons;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.Page_X_S_sVSQ;
import M_V.MVQ.button.DetaButton;
import P.image.Color_P;
import S_A.SVQ.stable.S_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
//import OCI.ME.analysis.C.A;
//import OSV.VCQ.standard.DictionaryStandardDB;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class Page_X_S_sButtonsenglish {
    public static DetaButton data_X_english(Page_X_S_sVSQ page_X_S_s
        , int x, int y, int weight, int height, int maxInPage, App NE) {
        DetaButton buttonCTE = new DetaButton("english");
        //buttonCTE.setBounds(630, 0, 100, 30);
        buttonCTE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (page_X_S_s.sets == null) {
                    return;
                }
                StringBuilder page = new StringBuilder().append("");
                if (page_X_S_s.currentPage * maxInPage > page_X_S_s.sets.size()) {
                    return;
                }
                List<String> setsForGet = page_X_S_s.sets.subList(
                    page_X_S_s.currentPage * maxInPage, (page_X_S_s.currentPage + 1)
                        * maxInPage < page_X_S_s.sets.size()
                        ? (page_X_S_s.currentPage + 1) * maxInPage
                        : page_X_S_s.sets.size());
                Iterator<String> iterator = setsForGet.iterator();
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    if (page_X_S_s.pos.get(setOfi) == null) {
                        page.append("<span style=\"background:#ffffff\">"
                            + "<font color=\"black\"" + " size=\""
                            + NE.app_S.size_font_rot + "\">"
                            + setOfi + (page_X_S_s.cte.containsKey(setOfi)
                            ? ":(" + page_X_S_s.cte.get(setOfi) + ")" : "")
                            + "</font></span>");
                        continue Here;
                    }
                    if (!setOfi.equals("")) {
                        if (page_X_S_s.key.contains(setOfi)
                            && (S_Maps.mingCi.containsKey(setOfi)
                            || S_Maps.dongCi.containsKey(setOfi)
                            || S_Maps.xingRongCi.containsKey(setOfi))) {
                            page.append("<span style=\"background:red\">"
                                + "<font color=\"white\">"
                                + setOfi + (page_X_S_s.cte.containsKey(setOfi)
                                ? ":(" + page_X_S_s.cte.get(setOfi) + ")" : "")
                                + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.mingCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(255, 205
                                - NE.app_S.raterot << 3, 255)
                                + "\"><font color="
                                + Color_P.P(0, 0, 0)
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + (page_X_S_s.cte.containsKey(setOfi)
                                ? ":(" + page_X_S_s.cte.get(setOfi) + ")" : "")
                                + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.dongCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(255
                                    - NE.app_S.raterot << 3, 255
                                , 255 - 40 - NE.app_S.raterot << 3)
                                + "\"><font color="
                                + Color_P.P(0, 0, 0)
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + (page_X_S_s.cte.containsKey(setOfi)
                                ? ":(" + page_X_S_s.cte.get(setOfi) + ")" : "")
                                + "</font></span>");
                            continue Here;
                        }
                        if (S_Maps.xingRongCi.containsKey(setOfi)) {
                            page.append("<span style=\"background:"
                                + Color_P.P(255, 255
                                , 255 - 40 - NE.app_S.raterot << 3)
                                + "\"><font color="
                                + Color_P.P(0, 0, 0)
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + (page_X_S_s.cte.containsKey(setOfi)
                                ? ":(" + page_X_S_s.cte.get(setOfi) + ")" : "")
                                + "</font></span>");
                            continue Here;
                        }
                        if (page_X_S_s.pos.getString(setOfi).contains("副")) {
                            page.append("<span style=\"background:"
                                + Color_P.P(255
                                    - NE.app_S.raterot << 3
                                , 255, 255) + "\">" + "<font color="
                                + Color_P.P(0, 0, 0)
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + (page_X_S_s.cte.containsKey(setOfi) ? ":("
                                + page_X_S_s.cte.get(setOfi) + ")" : "")
                                + "</font></span>");
                            continue Here;
                        }
                        page.append("<span style=\"background:white\">"
                            + "<font color=" + "\"black\"" + " size=\""
                            + NE.app_S.size_font_rot + "\">"
                            + setOfi + (page_X_S_s.cte.containsKey(setOfi)
                            ? ":(" + page_X_S_s.cte.get(setOfi) + ")" : "")
                            + "</font></span>");
                    }
                }
                page_X_S_s.buttonCrt.setText("当前页面：" + (page_X_S_s.currentPage + 1));
                page_X_S_s.data.setText(page.toString());
                page_X_S_s.data.setSelectionStart(0);
                page_X_S_s.data.setSelectionEnd(0);
                page_X_S_s.data.validate();
            }
        });

        return buttonCTE;
    }
}