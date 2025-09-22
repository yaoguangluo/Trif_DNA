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

import ME.VPC.V.db.FyydDictionaryDB;
import org.junit.jupiter.api.Test;

import java.util.List;

class FyydDictionaryDBTest {
    FyydDictionaryDB fyydDictionaryDB = new FyydDictionaryDB();

    @Test
    void testTxtToList() {
        // mock trif
        List<String> result = fyydDictionaryDB.txtToList();
        //Assertions.assertEquals(new ArrayList<>(Arrays.asList("String")), result);
    }

    @Test
    void testTxtToMap() {
        // mock trif
        //IMV_SIQ result = fyydDictionaryDB.txtToMap(new IMV_SIQ(), new IMV_SIQ());
        //Assertions.assertEquals(new IMV_SIQ(), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme