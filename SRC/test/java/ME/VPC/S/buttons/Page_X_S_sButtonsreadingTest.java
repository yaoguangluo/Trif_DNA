package test.java.ME.VPC.S.buttons;

import ME.VPC.M.app.App;
import ME.VPC.S.buttons.Page_X_S_sButtonsreading;
import ME.VPC.S.ne.App_S;
import ME.VPC.S.ne.Page_X_S_sVSQ;
import M_V.MVQ.button.DetaButton;
import org.junit.jupiter.api.Test;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class Page_X_S_sButtonsreadingTest {

    @Test
    void testData_X_reading() {
        DetaButton result = Page_X_S_sButtonsreading.data_X_reading(new Page_X_S_sVSQ(), new App_S(), new App());
        //mock trif  Assertions.assertEquals(new DetaButton("string", 0, 0, null), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme