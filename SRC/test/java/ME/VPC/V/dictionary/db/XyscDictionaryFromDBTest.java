package test.java.ME.VPC.V.dictionary.db;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

import ME.VPC.V.db.XyscDictionaryFromDB;
import S_A.pheromone.IMV_SIQ;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class XyscDictionaryFromDBTest {
    XyscDictionaryFromDB xyscDictionaryFromDB = new XyscDictionaryFromDB();

    @Test
    void testTxtToList() {
        List<String> result = xyscDictionaryFromDB.txtToList();
        //mock trif  Assertions.assertEquals(new ArrayList<>(Arrays.asList("String")), result);
    }

    @Test
    void testListToMap() {
        IMV_SIQ result = xyscDictionaryFromDB.listToMap(new ArrayList<>(Arrays.asList("String")));
        //mock trif  Assertions.assertEquals(new IMV_SIQ(), result);
    }

    @Test
    void testTxtToMap() {
        //mock trif  xyscDictionaryFromDB.txtToMap(new IMV_SIQ(), new IMV_SIQ(), new IMV_SIQ(), new IMV_SIQ(), new IMV_SIQ(), new IMV_SIQ(), new IMV_SIQ(), new IMV_SIQ(), new IMV_SIQ(), new IMV_SIQ(), new IMV_SIQ());
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme