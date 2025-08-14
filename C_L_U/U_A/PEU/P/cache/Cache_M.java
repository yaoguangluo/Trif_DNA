package U_A.PEU.P.cache;

import java.util.*;

//refer javadoc-api/org/springframework/cache/Cache_M.html
//这是spring 早期的缓存函数进行了2次修改。
//修改人 罗瑶光
/*
 *  作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class Cache_M {
    @SuppressWarnings("rawtypes")
    private static HashMap cacheMap = new HashMap();

    private Cache_M() {
        super();
    }

    @SuppressWarnings("unchecked")
    public synchronized static boolean setSimpleFlag(String key, long serverbegrundt) {
        if (cacheMap.get(key) == null) {
            cacheMap.put(key, serverbegrundt);
            return true;
        } else {
            return false;
        }
    }

    //private synchronized static Cache getCache(String key) {
    private synchronized static Cache getCache(String key) {
        return (Cache) cacheMap.get(key);
    }

    // private synchronized static boolean hasCache(String key) {
    private synchronized static boolean hasCache(String key) {
        return cacheMap.containsKey(key);
    }

    public synchronized static void clearAll() {
        cacheMap.clear();
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public synchronized static void clearAll(String type) {
        Iterator i = cacheMap.entrySet().iterator();
        String key;
        ArrayList arr = new ArrayList();
        try {
            while (i.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) i.next();
                key = (String) entry.getKey();
                if (key.startsWith(type)) {
                    arr.add(key);
                }
            }
            for (int k = 0; k < arr.size(); k++) {
                clearOnly((String) arr.get(k));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public synchronized static void clearOnly(String key) {
        cacheMap.remove(key);
    }

    //public synchronized static void putCache(String key, Cache obj) {
    @SuppressWarnings("unchecked")
    public synchronized static void putCache(String key, Cache obj) {
        cacheMap.put(key, obj);
    }

    public synchronized static Cache getCacheInfo(String key) {
        if (hasCache(key)) {
            Cache cache = getCache(key);
            if (cacheExpired(cache)) {
                cache.I_Expired(true);
            }
            return cache;
        } else
            return null;
    }

    @SuppressWarnings("unchecked")
    public static void putCacheInfo(String key, Cache obj, long dt, boolean expired) {
        Cache cache = new Cache();
        cache.I_Key(key);
        cache.I_TimeOut(dt + System.currentTimeMillis());
        cache.I_Value(obj);
        cache.I_Expired(expired);
        cacheMap.put(key, cache);
    }

    @SuppressWarnings("unchecked")
    public static void putCacheInfo(String key, Cache obj, long dt) {
        Cache cache = new Cache();
        cache.I_Key(key);
        cache.I_TimeOut(dt + System.currentTimeMillis());
        cache.I_Value(obj);
        cache.I_Expired(false);
        cacheMap.put(key, cache);
    }

    public static boolean cacheExpired(Cache cache) {
        if (null == cache) {
            return false;
        }
        long nowDt = System.currentTimeMillis();
        long cacheDt = cache.getTimeOut();
        if (cacheDt <= 0 || cacheDt > nowDt) {
            return false;
        } else {
            return true;
        }
    }

    public synchronized static int getCacheSize() {
        return cacheMap.size();
    }

    @SuppressWarnings("rawtypes")
    public static int getCacheSize(String type) {
        int k = 0;
        Iterator i = cacheMap.entrySet().iterator();
        String key;
        try {
            while (i.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) i.next();
                key = (String) entry.getKey();
                if (key.indexOf(type) != -1) {
                    k++;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return k;
    }

    @SuppressWarnings({"rawtypes", "unchecked", "finally"})
    public static ArrayList getCacheAllkey() {
        ArrayList a = new ArrayList();
        try {
            Iterator i = cacheMap.entrySet().iterator();
            while (i.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) i.next();
                a.add((String) entry.getKey());
            }
        } catch (Exception ex) {
        } finally {
            return a;
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked", "finally"})
    public static ArrayList getCacheListkey(String type) {
        ArrayList a = new ArrayList();
        String key;
        try {
            Iterator i = cacheMap.entrySet().iterator();
            while (i.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) i.next();
                key = (String) entry.getKey();
                if (key.indexOf(type) != -1) {
                    a.add(key);
                }
            }
        } catch (Exception ex) {
        } finally {
            return a;
        }
    }
} 
