package test.java.ME.VPC.H.hospital;

import ME.VPC.H.hospital.DetaLabelS_s;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class DetaLabelS_sTest {
    @Mock
    DetaLabelS_s stableImages;
    @InjectMocks
    DetaLabelS_s detaLabelS_s;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSetS_Images() {
        detaLabelS_s.setS_Images();
    }

    @Test
    void testSetTarget() {
        detaLabelS_s.setTarget(true);
    }

    @Test
    void testSetIndexString() {
        detaLabelS_s.setIndexString("string");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme