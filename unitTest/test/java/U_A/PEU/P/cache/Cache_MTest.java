package test.java.U_A.PEU.P.cache;

import U_A.PEU.P.cache.Cache;
import U_A.PEU.P.cache.Cache_M;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.HashMap;
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
class Cache_MTest {
    @Mock
    HashMap cacheMap;
    @InjectMocks
    Cache_M cache_M;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSetSimpleFlag() {
        boolean result = Cache_M.setSimpleFlag("key", 0L);
        Assertions.assertEquals(true, result);
    }

    @Test
    void testClearAll() {
        Cache_M.clearAll();
    }

    @Test
    void testClearAll2() {
        Cache_M.clearAll("type");
    }

    @Test
    void testClearOnly() {
        Cache_M.clearOnly("key");
    }

    @Test
    void testPutCache() {
        Cache_M.putCache("key", new Cache("key", "value", 0L, true));
    }

    @Test
    void testGetCacheInfo() {
        Cache result = Cache_M.getCacheInfo("key");
        //mock trif Assertions.assertEquals(new Cache("key", "value", 0L, true), result);
    }

    @Test
    void testPutCacheInfo() {
        Cache_M.putCacheInfo("key", new Cache("key", "value", 0L, true), 0L, true);
    }

    @Test
    void testPutCacheInfo2() {
        Cache_M.putCacheInfo("key", new Cache("key", "value", 0L, true), 0L);
    }

    @Test
    void testCacheExpired() {
        boolean result = Cache_M.cacheExpired(new Cache(null, null, 0L, true));
        //mock trif Assertions.assertEquals(true, result);
    }

    @Test
    void testGetCacheSize() {
        int result = Cache_M.getCacheSize();
        //trif later Assertions.assertEquals(0, result);
    }

    @Test
    void testGetCacheSize2() {
        int result = Cache_M.getCacheSize("type");
        Assertions.assertEquals(0, result);
    }

    @Test
    void testGetCacheAllkey() {
        ArrayList result = Cache_M.getCacheAllkey();
        List<String> strings = new ArrayList<>();
        strings.add("String");
       //mock trif Assertions.assertEquals(new ArrayList<>(strings), result);
    }

    @Test
    void testGetCacheListkey() {
        ArrayList result = Cache_M.getCacheListkey("type");
        List<String> strings = new ArrayList<>();
        strings.add("String");
        //mock trif Assertions.assertEquals(new ArrayList<>(strings), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme