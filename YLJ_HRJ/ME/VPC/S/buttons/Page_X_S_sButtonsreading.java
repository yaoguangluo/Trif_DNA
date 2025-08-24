package ME.VPC.S.buttons;

import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import ME.VPC.S.ne.Page_X_S_sVSQ;
import M_V.MVQ.button.DetaButton;
import O_V.OSI.AOP.neo.tts.ReadChinese;
import exception.thread.DetaThread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
//_IVS_Q=reading
public class Page_X_S_sButtonsreading {
	public static DetaButton data_X_reading(Page_X_S_sVSQ pages, App_S app_S,
			App NE) {
		DetaButton buttonCTV = new DetaButton("阅读关");
		pages.readChinese = new ReadChinese(buttonCTV, app_S);
		buttonCTV.setBounds(740, 0, 100, 30);
		buttonCTV.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (buttonCTV.getText().equalsIgnoreCase("阅读开")) {
					pages.readChinese.waitString = true;
					pages.readChinese.waitWord = true;
					return;
				}
				if (pages.readChinese.getState().toString()
						.equalsIgnoreCase("TERMINATED")) {
					pages.readChinese.I_NullSap();
					pages.readChinese = new ReadChinese(buttonCTV, app_S);
				}
				if (pages.sets == null) {
					return;
				}
				if (pages.readChinese.finish == 0) {
					if (!pages.readChinese.isAlive()) {
						pages.buttonCTV.setLabel("阅读开");
						pages.buttonCTV.updateUI();
						DetaThread.sleepDeta(200);
						pages.readChinese.I_PreReadList(pages.sets, NE);
						if (pages.readChinese.finish == 2) {
							pages.readChinese.start();
						}
					}
				}
			}
		});
		return buttonCTV;
	}
}