package test.java.ME.VPC.V.dictionary;

import ME.VPC.V.dictionary.ZynkxDictionary;
import S_A.pheromone.IMV_SQI;
import S_A.pheromone.IMV_SQI_;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
class ZynkxDictionaryTest {
    @Mock
    IMV_SQI_ dic_yf;
    @Mock
    Iterator<String> iter;
    @Mock
    List<String> copy;
    @Mock
    IMV_SQI_ dic_yx;
    @Mock
    IMV_SQI_ dic_sy;
    @Mock
    IMV_SQI_ dic_lc;
    @Mock
    IMV_SQI_ dic_by;
    @Mock
    IMV_SQI_ dic_lx;
    @Mock
    IMV_SQI_ dic_map;
    @Mock
    List<String> temp_list;
    @Mock
    IMV_SQI_ dic_zd;
    @Mock
    IMV_SQI_ dic_zl;
    @Mock
    IMV_SQI_ dic_bf;
    @Mock
    IMV_SQI_ dic_jy;
    @Mock
    IMV_SQI_ dic_yh;
    @Mock
    IMV_SQI_ dic_bl;
    @Mock
    IMV_SQI_ dic_wx;
    @Mock
    IMV_SQI_ dic_gn;
    @Mock
    IMV_SQI dic_xj;
    @Mock
    List<String> dic_list;
    @Mock
    IMV_SQI pinyin;
    @Mock
    IMV_SQI dic_index;
    @Mock
    IMV_SQI dic_yw;
    @Mock
    IMV_SQI dic_li;
    @Mock
    IMV_SQI dic_hai;
    @Mock
    IMV_SQI dic_xz;
    @Mock
    IMV_SQI dic_zf;
    @Mock
    IMV_SQI dic_cj;
    @Mock
    IMV_SQI dic_jj;
    @Mock
    IMV_SQI dic_cy;
    @Mock
    IMV_SQI dic_ya;
    @Mock
    IMV_SQI dic_jm;
    @Mock
    IMV_SQI dic_xw;
    @Mock
    IMV_SQI dic_yl;
    @Mock
    IMV_SQI dic_ym;
    @Mock
    IMV_SQI dic_chu_fang;
    @Mock
    Iterator<String> it;
    @Mock
    IMV_SQI dic_mz;
    @Mock
    IMV_SQI dic_yy;
    @Mock
    IMV_SQI dic_tl;
    @Mock
    IMV_SQI dic_ff;
    @Mock
    IMV_SQI dic_fg;
    @InjectMocks
    ZynkxDictionary zynkxDictionary;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testTxtToList() {
        //List<String> result = zynkxDictionary.txtToList();
        // mock trif//Assertions.assertEquals(new ArrayList<>(Arrays.asList("String")), result);
    }

    @Test
    void testListToMap() {
        IMV_SQI_ result = zynkxDictionary.listToMap(new ArrayList<>(Arrays.asList("String")));
        Assertions.assertEquals(new IMV_SQI_(), result);
    }

    @Test
    void testMapToChuFang() {
        IMV_SQI result = zynkxDictionary.MapToChuFang(new ArrayList<>(Arrays.asList("String")), new IMV_SQI());
        Assertions.assertEquals(new IMV_SQI(), result);
    }

    @Test
    void testMapTomz() {
        IMV_SQI result = zynkxDictionary.MapTomz(new ArrayList<>(Arrays.asList("String")), new IMV_SQI());
        Assertions.assertEquals(new IMV_SQI(), result);
    }

    @Test
    void testMapTozf() {
        IMV_SQI result = zynkxDictionary.MapTozf(new ArrayList<>(Arrays.asList("String")), new IMV_SQI());
        Assertions.assertEquals(new IMV_SQI(), result);
    }

    @Test
    void testMapToyy() {
        IMV_SQI result = zynkxDictionary.MapToyy(new ArrayList<>(Arrays.asList("String")), new IMV_SQI());
        Assertions.assertEquals(new IMV_SQI(), result);
    }

    @Test
    void testMapTosy() {
        IMV_SQI_ result = zynkxDictionary.MapTosy(new ArrayList<>(Arrays.asList("String")), new IMV_SQI());
        Assertions.assertEquals(new IMV_SQI_(), result);
    }

    @Test
    void testMapTotl() {
        IMV_SQI result = zynkxDictionary.MapTotl(new ArrayList<>(Arrays.asList("String")), new IMV_SQI());
        Assertions.assertEquals(new IMV_SQI(), result);
    }

    @Test
    void testMapToff() {
        IMV_SQI result = zynkxDictionary.MapToff(new ArrayList<>(Arrays.asList("String")), new IMV_SQI());
        Assertions.assertEquals(new IMV_SQI(), result);
    }

    @Test
    void testMapTofg() {
        IMV_SQI result = zynkxDictionary.MapTofg(new ArrayList<>(Arrays.asList("String")), new IMV_SQI());
        Assertions.assertEquals(new IMV_SQI(), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme