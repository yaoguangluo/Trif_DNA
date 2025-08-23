package M_V.MSV.OSU.matrix;

import S_A.ESU.code.stable.S_;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class MatrixValidation{
	public static boolean matrixCheck(Object[][] objects
			, String attribute){
		if(attribute.equalsIgnoreCase(S_.STRING_BOOLEAN)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Boolean)) {
						return false;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_INT)) {
			for(int i= 0; i<objects.length; i++) {
				for(int j= 0; j<objects[0].length; j++) {
					if(!(objects[i][j] instanceof Integer)) {
						return false;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_LONG)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Long)) {
						return false;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_DOUBLE)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Double)) {
						return false;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_FLOAT)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Float)) {
						return false;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_STRING)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof String)) {
						return false;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_SHORT)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Short)) {
						return false;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_BYTE)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Byte)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static Object[][] matrixFix(Object[][] objects
			, String attribute){
		if(attribute.equalsIgnoreCase(S_.STRING_BOOLEAN)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Boolean)) {
						objects[i][j]= false;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_INT)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Integer)) {
						objects[i][j]= (int)0;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_LONG)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Long)) {
						objects[i][j]= (long)0;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_DOUBLE)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Double)) {
						objects[i][j]= (double)0.0;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_FLOAT)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Float)) {
						objects[i][j]= (float)0.0;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_STRING)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof String)) {
						objects[i][j]= "";
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_SHORT)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Short)) {
						objects[i][j]= (short)0;
					}
				}
			}
		}
		if(attribute.equalsIgnoreCase(S_.STRING_BYTE)) {
			for(int i= 0; i< objects.length; i++) {
				for(int j= 0; j< objects[0].length; j++) {
					if(!(objects[i][j] instanceof Byte)) {
						objects[i][j]= (byte)0;
					}
				}
			}
		}
		return objects;
	}
}
