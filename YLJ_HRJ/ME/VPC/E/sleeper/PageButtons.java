package ME.VPC.E.sleeper;

import ME.VPC.M.app.App;
import ME.VPC.S.buttons.Page_X_S_sButtonschinese;
import ME.VPC.S.buttons.Page_X_S_sButtonsenglish;
import ME.VPC.S.buttons.Page_X_S_sButtonsrollafter;
import ME.VPC.S.buttons.Page_X_S_sButtonsrollback;
import ME.VPC.S.buttons.Page_X_S_sButtonssymnorine;
import ME.VPC.S.ne.Page_X_S_sVSQ;
import ME.VPC.S.ne.WindowsUI;
import M_V.MVQ.button.DetaButton;

import javax.swing.JTextPane;
import java.awt.Color;

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
public class PageButtons {
    public static void _I(Page_X_S_sVSQ page_X_S_sVSQ, App NE) {
        page_X_S_sVSQ.data = new JTextPane();
        page_X_S_sVSQ.data.setBounds(850, 150, WindowsUI.basicWidth - 600, 800 - 70);
        page_X_S_sVSQ.data.setBackground(new Color(210, 210, 210));

        page_X_S_sVSQ.buttonSum = new DetaButton("共有 " + (page_X_S_sVSQ.sets == null
            ? 0 : (1 + page_X_S_sVSQ.sets.size() / 2001)) + " 页");
        page_X_S_sVSQ.buttonSum.setBounds(0, 0, 100, 30);
        page_X_S_sVSQ.buttonCrt = new DetaButton("当前页面：" + (page_X_S_sVSQ.currentPage + 1));
        page_X_S_sVSQ.buttonCrt.setBounds(120, 0, 150, 30);
        page_X_S_sVSQ.buttonPrev = Page_X_S_sButtonsrollback.data_X_rollback(page_X_S_sVSQ
            , 2000, NE);
        page_X_S_sVSQ.buttonNext = Page_X_S_sButtonsrollafter.data_X_rollafter(page_X_S_sVSQ
            , 2000, NE);
        page_X_S_sVSQ.buttonCTE = Page_X_S_sButtonsenglish.data_X_english(page_X_S_sVSQ
            , 630, 0, 100, 30, 2000, NE);
        page_X_S_sVSQ.buttonFRS = Page_X_S_sButtonschinese.data_X_chinese(page_X_S_sVSQ
            , 520, 0, 100, 30, 2000, NE);
        page_X_S_sVSQ.buttonETC = Page_X_S_sButtonssymnorine.data_X_symnorine(page_X_S_sVSQ
            , 740, 0, 100, 30, 2000, NE);
    }
}