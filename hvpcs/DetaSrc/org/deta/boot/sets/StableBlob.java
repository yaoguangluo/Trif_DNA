package DetaSrc.org.deta.boot.sets;


/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public interface StableBlob {
	public BlobLimit blobLimit = new BlobLimit();
	
	public static boolean goodState() {
		if(!blobLimit.gc) {
			return true;
		}
		return false;
	}
	
	public static void initBlobLimit() {
		blobLimit.initBlobLimit();
	}
	public static boolean addBlobLimit(String string, long time) {
		return blobLimit.addBlobLimit(string, time);
	}
	public static boolean clearBlobLimit(String string) {
		if(null != string) {
			return blobLimit.clearBlobLimit(string);
		}
		return false;
	}
	public static void addException() {
		if(blobLimit.exceptions++ > 8) {
			System.out.flush();System.out.println("-more exceptions");
		}
	}
	
	public static void checkException() {
		if(blobLimit.exceptions > 15) {
			blobLimit.exceptions = 0;
			System.gc();
			System.out.flush();System.out.println("-gc exceptions");
		}
	}
	
}
