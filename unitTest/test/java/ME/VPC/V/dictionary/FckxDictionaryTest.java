package test.java.ME.VPC.V.dictionary;

import ME.VPC.V.dictionary.FckxDictionary;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class FckxDictionaryTest {
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
    FckxDictionary fckxDictionary;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testTxtToList() {
        //到时候全部手写测试函数。
    }

    @Test
    void testListToMap() {
        IMV_SIQ_ result = fckxDictionary.listToMap(new ArrayList<>(Arrays.asList("String")));
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_zd() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_zd(new IMV_SIQ());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_zl() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_zl(new IMV_SIQ());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_bf() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_bf(new IMV_SIQ());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_jy() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_jy(new IMV_SIQ_());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_yh() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_yh(new IMV_SIQ_());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_bl() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_bl(new IMV_SIQ());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_wx() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_wx(new IMV_SIQ());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_gn() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_gn(new IMV_SIQ());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_yf() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_yf(new IMV_SIQ_());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_yx() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_yx(new IMV_SIQ_());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_sy() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_sy(new IMV_SIQ_());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_lc() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_lc(new IMV_SIQ_());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_by() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_by(new IMV_SIQ_());
        assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_lx() {
        IMV_SIQ_ result = fckxDictionary.mapToMap_lx(new IMV_SIQ_());
        assertEquals(new IMV_SIQ_(), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme