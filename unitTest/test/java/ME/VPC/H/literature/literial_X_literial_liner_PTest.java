package test.java.ME.VPC.H.literature;

import ME.VPC.S.ne.App_S;
import S_A.pheromone.IMV_SIQ;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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
class literial_X_literial_liner_PTest {
    @Mock
    List<String> literialVerbalBase;
    @Mock
    IMV_SIQ literialVerbalBaseMap;
    @InjectMocks
    ME.VPC.H.literature.literial_X_literial_liner_P literial_X_literial_liner_P;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testLiterial_liner_P() {
        String result = literial_X_literial_liner_P.literial_liner_P(new App_S(), "input");
        //assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme