package DetaSrc.org.deta.boot.sets;
import java.util.concurrent.ConcurrentHashMap;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class BlobLimit{
	public int exceptions = 0;
	public boolean gc= false;
	public ConcurrentHashMap<String, Long> blobLimitMap;
	public void initBlobLimit() {
		blobLimitMap = new ConcurrentHashMap<String, Long>();
	}

	public boolean addBlobLimit(String string, long time) {
		if(blobLimitMap.containsKey(string)) {
			long timeOld = blobLimitMap.get(string);
			if(time - timeOld > 1000 * 60 * 3) {//fix later
				blobLimitMap.put(string, time);
				return true;	
			}
			return false;
		}
		blobLimitMap.put(string, time);
		return true;
	}

	public boolean clearBlobLimit(String string) {
		if(blobLimitMap.containsKey(string)) {
			blobLimitMap.remove(string);
			return true;	
		}
		return false;	
	}
}