package M_V.MSV.OSU.array;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */

public class ArrayValidation{
	//以后 validation大体包括 check和fix, 2个部分。
	public static boolean arrayIntCheck(int[] array
			, int min, int max) {
		for (int j : array) {
			if (j > max || j < min) {
				return false;
			}
		}
		return true;
	}

	public static int[] arrayIntFix(int[] array
			, int min, int max) {
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max) {
				array[i]= max;
			}
			if(array[i]< min) {
				array[i]= min;
			}
		}
		return array;
	}

	public static boolean arrayLongCheck(long[] array
			, long min, long max) {
		for (long l : array) {
			if (l > max || l < min) {
				return false;
			}
		}
		return true;
	}

	public static long[] arrayLongFix(long[] array
			, long min, long max) {
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max) {
				array[i]= max;
			}
			if(array[i]< min) {
				array[i]= min;
			}
		}
		return array;
	}

	public static boolean arrayDoubleCheck(double[]  array
			, double min, double max) {
		for (double aDouble : array) {
			if (aDouble > max || aDouble < min) {
				return false;
			}
		}
		return true;
	}

	public static double[]  arrayDoubleFix(double[]  array
			, double min, double max) {
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max) {
				array[i]= max;
			}
			if(array[i]< min) {
				array[i]= min;
			}
		}
		return array;
	}

	public static boolean arrayFloatCheck(float[] array
			, float min, float max) {
		for (float v : array) {
			if (v > max || v < min) {
				return false;
			}
		}
		return true;
	}

	public static float[] arrayFloatFix(float[] array
			, float min, float max) {
		for(int i= 0; i< array.length; i++) {
			if(array[i]> max) {
				array[i]= max;
			}
			if(array[i]< min) {
				array[i]= min;
			}
		}
		return array;
	}
}
