package test.java.ME.VPC.V.dictionary;

import ME.VPC.V.dictionary.Dictionary_S;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

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
class Dictionary_STest {
    @Mock
    IMV_SIQ_ dic_yf;
    @Mock
    Iterator<String> iter;
    @Mock
    List<String> copy;
    @Mock
    IMV_SIQ_ dic_yx;
    @Mock
    IMV_SIQ_ dic_sy;
    @Mock
    IMV_SIQ_ dic_lc;
    @Mock
    IMV_SIQ_ dic_by;
    @Mock
    IMV_SIQ_ dic_lx;
    @Mock
    IMV_SIQ_ dic_map;
    @Mock
    List<String> temp_list;
    @Mock
    IMV_SIQ_ dic_zd;
    @Mock
    IMV_SIQ_ dic_zl;
    @Mock
    IMV_SIQ_ dic_bf;
    @Mock
    IMV_SIQ_ dic_jy;
    @Mock
    IMV_SIQ_ dic_yh;
    @Mock
    IMV_SIQ_ dic_bl;
    @Mock
    IMV_SIQ_ dic_wx;
    @Mock
    IMV_SIQ_ dic_gn;
    @Mock
    IMV_SIQ dic_xj;
    @Mock
    List<String> dic_list;
    @Mock
    IMV_SIQ pinyin;
    @Mock
    IMV_SIQ dic_index;
    @Mock
    IMV_SIQ dic_yw;
    @Mock
    IMV_SIQ dic_li;
    @Mock
    IMV_SIQ dic_hai;
    @Mock
    IMV_SIQ dic_xz;
    @Mock
    IMV_SIQ dic_zf;
    @Mock
    IMV_SIQ dic_cj;
    @Mock
    IMV_SIQ dic_jj;
    @Mock
    IMV_SIQ dic_cy;
    @Mock
    IMV_SIQ dic_ya;
    @Mock
    IMV_SIQ dic_jm;
    @Mock
    IMV_SIQ dic_xw;
    @Mock
    IMV_SIQ dic_yl;
    @Mock
    IMV_SIQ dic_ym;
    @Mock
    IMV_SIQ dic_chu_fang;
    @Mock
    Iterator<String> it;
    @Mock
    IMV_SIQ dic_mz;
    @Mock
    IMV_SIQ dic_yy;
    @Mock
    IMV_SIQ dic_tl;
    @Mock
    IMV_SIQ dic_ff;
    @Mock
    IMV_SIQ dic_fg;
    @InjectMocks
    Dictionary_S dictionary_S;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme