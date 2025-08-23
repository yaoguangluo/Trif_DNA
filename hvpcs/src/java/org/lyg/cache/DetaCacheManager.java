/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
package src.java.org.lyg.cache;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class DetaCacheManager {
	private static ConcurrentHashMap<String, DetaCache> cacheMap = new ConcurrentHashMap<>();
	private static ConcurrentHashMap<String, List<byte[]>> bytesMap = new ConcurrentHashMap<>();
	private static ConcurrentHashMap<String, String> stringMap = new ConcurrentHashMap<>();

	private DetaCacheManager() {
		super();
	}

	public static String putCache(String key, String value, long timeOut) {
		DetaCache c = new DetaCache();
		c.setValue(value);
		c.setTimeOut(timeOut);
		cacheMap.put(key, c);
		return "success";
	}

	public static String getCache(String key) {
		DetaCache c = cacheMap.get(key);
		if (null == c) {
			return "unsuccess nofind cache";
		}
		long now = System.currentTimeMillis();
		if (c.getTimeOut() < now) {
			cacheMap.remove(key);
			return "unsuccess timeout";
		}
		return c.getValue();
	}

	@SuppressWarnings("rawtypes")
	public static Iterator getCacheIterator() {
		return cacheMap.entrySet().iterator();
	}

	public static void putCacheOfBytesList(String filePath, List<byte[]> list) {
		bytesMap.put(filePath, list);
	}

	public static List<byte[]> getCacheOfBytesList(String filePath) {
		if (bytesMap.containsKey(filePath)) {
			return bytesMap.get(filePath);
		}
		return null;
	}

	public static String getCacheOfString(String filePath) {
		if (stringMap.containsKey(filePath)) {
			return stringMap.get(filePath);
		}
		return null;
	}

	public static void putCacheOfString(String filePath, String stringBuilder) {
		stringMap.put(filePath, stringBuilder);
	}
}