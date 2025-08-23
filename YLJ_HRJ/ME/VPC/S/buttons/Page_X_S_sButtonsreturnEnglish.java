package ME.VPC.S.buttons;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.Page_X_S_sVSQ;
import M_V.MVQ.button.DetaButton;
import P.image.Color_P;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
//import OCI.ME.analysis.C.A;
//import OSV.VCQ.standard.DictionaryStandardDB;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 *  （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class Page_X_S_sButtonsreturnEnglish {
    //    public DetaButton data_X_returnEnglish(Page_X_S_sVSQ page_X_S_s
//            , int x, int y, int weight, int height, int maxInPage)  {
    public static DetaButton data_X_returnEnglish(Page_X_S_sVSQ page_X_S_s, App NE) {
        DetaButton buttonFRS = new DetaButton("returnEnglish");
        buttonFRS.setBounds(520, 0, 100, 30);
        buttonFRS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (page_X_S_s.sets == null) {
                    return;
                }
                List<String> sets = page_X_S_s.sets;
                StringBuilder page = new StringBuilder().append("");
                List<String> setsForGet = sets.subList(page_X_S_s.currentPage * 2000
                    , (page_X_S_s.currentPage + 1) * 2000 < sets.size()
                        ? (page_X_S_s.currentPage + 1) * 2000 : sets.size());
                Iterator<String> iterator = setsForGet.iterator();
                Here:
                while (iterator.hasNext()) {
                    String setOfi = iterator.next();
                    String pecsi = "";
                    String pfullecsi = page_X_S_s.posFullec.getString(setOfi);
//                        NE.app_S.fMHMMListOneTime_E_X_S.fullEnToCn.get(setOfi);
                    if (pfullecsi == null) {
                        page.append("<span style=\"background:#000000\">"
                            + "<font color=\"white\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + "</font></span>");
                        continue Here;
                    }
                    if (page_X_S_s.pos.containsKey(pfullecsi)) {
                        pecsi = page_X_S_s.pos.getString(pfullecsi);
                    }
                    if (!setOfi.equals("")) {
                        if (page_X_S_s.key.contains(setOfi) && (setOfi.length() > 2)
                            && (pecsi.contains("名") || pecsi.contains("动")
                            || pecsi.contains("形"))) {
                            page.append("<span style=\"background:red\">"
                                + "<font color=\"white\">" + setOfi + "</font></span>");
                            continue Here;
                        }
                        if (pecsi.contains("名")) {
                            page.append("<span style=\"background:"
                                + Color_P.P(0, 0, 0)
                                + "\"><font color="
                                + Color_P.P(245
                                , 245 - 40 - page_X_S_s.app_S.raterot << 3
                                , 245)
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + "</font></span>");
                            continue Here;
                        }
                        if (pecsi.contains("动")) {
                            page.append("<span style=\"background:"
                                + Color_P.P(245, 255, 245)
                                + "\"><font color="
                                + Color_P.P(245
                                    - page_X_S_s.app_S.raterot << 3, 245
                                , 245 - 40 - page_X_S_s.app_S.raterot << 3)
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + "</font></span>");
                            continue Here;
                        }
                        if (pecsi.contains("形")) {
                            page.append("<span style=\"background:"
                                + Color_P.P(255, 255, 245)
                                + "\"><font color="
                                + Color_P.P(245, 245
                                , 245 - 40 - page_X_S_s.app_S.raterot << 3)
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + "</font></span>");
                            continue Here;
                        }
                        if (pecsi.contains("副")) {
                            page.append("<span style=\"background:#000000\">"
                                + "<font color=\"white\""
                                + " size=\"" + NE.app_S.size_font_rot + "\">"
                                + setOfi + "</font></span>");
                            continue Here;
                        }
                        page.append("<span style=\"background:black\">"
                            + "<font color=\"white\""
                            + " size=\"" + NE.app_S.size_font_rot + "\">"
                            + setOfi + "</font></span>");
                    }
                }
                page_X_S_s.buttonCrt.setText("当前页面：" + (page_X_S_s.currentPage + 1));
                page_X_S_s.data.setText(page.toString());
                page_X_S_s.data.setSelectionStart(0);
                page_X_S_s.data.setSelectionEnd(0);
                page_X_S_s.data.validate();
            }
        });
        return buttonFRS;
    }
}