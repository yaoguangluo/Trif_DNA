package U_V.ESU.string;
//作者+ 著作权人： 罗瑶光, 浏阳,
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class StringSequency{
	public static String stringToSequency(String string){
		char[] chars= string.toCharArray();
		for(int i= 0; i< chars.length; i++) {
			for(int j= 0; j< chars.length; j++) {
				if(chars[i]< chars[j]) {
					char temp= chars[i];
					chars[i]= chars[j];
					chars[j]= temp;
				}
			}
		}	
		return String.valueOf(chars);	
	}

	public static String[] stringArrayToSequencyArrayIncrement(String[] string
			, int scale){
		//比较头
		for(int i= 0; i< string.length; i++) {
			for(int j= 0; j< string.length; j++) {
				//区别字母
				if(string[i].toLowerCase().charAt(0)
						< string[j].toLowerCase().charAt(0)) {
					//区别大小写
					String temp= string[i].toString();
					string[i]= string[j].toString();
					string[j]= temp.toString();	
				}
			}
		}	
		//比较身
		for(int k= 1; k< scale; k++) {
			for(int i= 0; i< string.length; i++) {
				for(int j= 0; j< string.length; j++) {
					if(string[i].length()> k&& string[j].length()> k) {
						if(string[i].toLowerCase().charAt(k)
								< string[j].toLowerCase().charAt(k)) {
							boolean find= true;
							for(int p= 0; p< k; p++) {
								if(string[i].charAt(p)!= string[j].charAt(p)) {
									find= false;
								}
							}
							if(find) {
								String temp= string[i].toString();
								string[i]= string[j].toString();
								string[j]= temp.toString();
							}
						}	
					}
				}
			}		
		}
		return string;
	}

	public static String[] stringArrayToSequencyArrayDecrement(String[] string
			, int scale){
		//比较头
		for(int i= 0; i< string.length; i++) {
			for(int j= 0; j< string.length; j++) {
				//区别字母
				if(string[i].toLowerCase().charAt(0)
						< string[j].toLowerCase().charAt(0)) {
					//区别大小写
					String temp= string[i].toString();
					string[i]= string[j].toString();
					string[j]= temp.toString();	
				}else if(string[i].toLowerCase().charAt(0)
						== string[j].toLowerCase().charAt(0)) {
					//区别大小写
					if(string[i].charAt(0)<string[j].charAt(0)) {
						String temp= string[i].toString();
						string[i]= string[j].toString();
						string[j]= temp.toString();	
					}
				}
			}
		}	
		//比较身
		for(int k= 1; k< scale; k++) {
			for(int i= 0; i< string.length; i++) {
				for(int j= 0; j< string.length; j++) {
					if(string[i].length()> k&& string[j].length()> k) {
						if(string[i].toLowerCase().charAt(k)
								< string[j].toLowerCase().charAt(k)) {
							boolean find= true;
							for(int p= 0; p< k; p++) {
								if(string[i].charAt(p)!= string[j].charAt(p)) {
									find= false;
								}
							}
							if(find) {
								String temp= string[i].toString();
								string[i]= string[j].toString();
								string[j]= temp.toString();
							}
						}else if(string[i].toLowerCase().charAt(k)
								== string[j].toLowerCase().charAt(k)) {
							//区别大小写
							if(string[i].charAt(k)<string[j].charAt(k)) {
								boolean find= true;
								for(int p= 0; p< k; p++) {
									if(string[i].charAt(p)!= string[j].charAt(p)) {
										find= false;
									}
								}
								if(find) {
									String temp= string[i].toString();
									string[i]= string[j].toString();
									string[j]= temp.toString();
								}
							}
						}	
					}
				}
			}		
		}
		return string;
	}

	//			//DEMO
	public static void main(String[] argv) {
		//1
		String testValue[]= new String[2500];
		testValue[0]= "ca罗cded";
		testValue[1]= "ba罗cded";
		testValue[2]= "瑶Bcedd";
		testValue[3]= "Ca罗cded";
		testValue[4]= "瑶Ab";
		testValue[5]= "bCaef";
		testValue[6]= "BCAe";
		for(int i=7;i<2500;i++) {
			testValue[i]=""+ Math.random();
		}
		
//		new QuickLuoyaoguang4D().quick4DStringArray(testValue, 0
//				, testValue.length-1, 16);
		//testValue= stringToSequencyArrayIncrement(testValue, 0);
	//	testValue= stringArrayToSequencyArrayDecrement(testValue, 16);
		//20230106-System.out.println(testValue[0]);
		//20230106-System.out.println(testValue[1]);
		//20230106-System.out.println(testValue[2]);
		//20230106-System.out.println(testValue[3]);	
		//20230106-System.out.println(testValue[4]);
		//20230106-System.out.println(testValue[5]);
		//20230106-System.out.println(testValue[6]);
		testValue= new String[2500];
		testValue[0]= "ca罗cded";
		testValue[1]= "ba罗cded";
		testValue[2]= "瑶Bcedd";
		testValue[3]= "Ca罗cded";
		testValue[4]= "瑶Ab";
		testValue[5]= "bCaef";
		testValue[6]= "BCAe";
		for(int i=7;i<2500;i++) {
			testValue[i]=""+ Math.random();
		}
		new QuickLuoyaoguang4D().quick4DStringArray(testValue, 0
				, testValue.length-1, 16);
//		testValue= stringArrayToSequencyArrayDecrement(testValue, 16);
		//20230106-System.out.println(testValue[0]);
		//20230106-System.out.println(testValue[1]);
		//20230106-System.out.println(testValue[2]);
		//20230106-System.out.println(testValue[3]);	
		//20230106-System.out.println(testValue[4]);
		//20230106-System.out.println(testValue[5]);
		//20230106-System.out.println(testValue[6]);
		//2		////				String value= "AabusahudBDHDbuHgfUiGgfj";
		////				//20230106-System.out.println(stringToSequency(value));
	}
}
