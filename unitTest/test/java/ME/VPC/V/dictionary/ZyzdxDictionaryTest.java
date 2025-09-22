package test.java.ME.VPC.V.dictionary;

import ME.VPC.V.dictionary.ZyzdxDictionary;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
class ZyzdxDictionaryTest {
    ZyzdxDictionary zyzdxDictionary = new ZyzdxDictionary();

    @Test
    void testTxtToList() {
      // List<String> result = zyzdxDictionary.txtToList();
// mock trif
       //        Assertions.assertEquals(new ArrayList<>(Arrays.asList("String")), result);
    }

    @Test
    void testListToMap() {
        IMV_SIQ_ result = zyzdxDictionary.listToMap(new ArrayList<>(Arrays.asList("String")));
        Assertions.assertEquals(new IMV_SIQ_(), result);
    }

    @Test
    void testMapToMap_zhjb() {
        IMV_SIQ result = zyzdxDictionary.mapToMap_zhjb(new IMV_SIQ());
        Assertions.assertEquals(new IMV_SIQ(), result);
    }

    @Test
    void testMapToMap_lcyy() {
        IMV_SIQ result = zyzdxDictionary.mapToMap_lcyy(new IMV_SIQ());
        Assertions.assertEquals(new IMV_SIQ(), result);
    }

    @Test
    void testMapToMap_zhfx() {
        IMV_SIQ result = zyzdxDictionary.mapToMap_zhfx(new IMV_SIQ());
        Assertions.assertEquals(new IMV_SIQ(), result);
    }

    @Test
    void testMapToMap_lcbx() {
        IMV_SIQ result = zyzdxDictionary.mapToMap_lcbx(new IMV_SIQ());
        Assertions.assertEquals(new IMV_SIQ(), result);
    }

    @Test
    void testMapToMap_gn() {
        IMV_SIQ_ result = zyzdxDictionary.mapToMap_gn(new IMV_SIQ_());
        Assertions.assertEquals(new IMV_SIQ_(), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme