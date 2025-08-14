package S_A.SVQ.stable;

import S_A.pheromone.IMV_SIQ;

import java.util.Map;
//思想 罗瑶光 DNA元基催化与肽计算
//编码 罗瑶光
//#### 元基数字= 元基符号= 肽展公式元基数字变换= (肽概率展开数字逻辑集合) #### 1位 ##### E= I= I=(I) 
//##### F= U= I++ OR Q--=(I, Q)
//##### G= Q= Q=(Q) 
//#### 1~2位 
//##### 0= D= DD=(D, DD)
//#### 2位 
//##### 1= C= DI=(DI) 
//##### 3= E= IU, DU=(IU, DU)
//##### D= V= UQ=(UQ) 
//##### 9= S= QI=(QI) 
//#### 2~4位 
//##### 4= H= (IU, DU) OR DI=(IU, DU, DI) OR (IUDI, DUDI)
//#### 4位 
//##### 2= P= (IU, DU) + DI=(IUDI, DUDI)
//##### A= O= (IU, DU) + QI=(IUQI, DUQI)
//##### 7= A= UQQI=(UQQI) 
//#### 4~6位 
//##### 5= HC-= ((IU, DU) OR DI) + DI=(IUDI, DUDI, DIDI) OR (IUDIDI, DUDIDI)
//##### B= HE+= ((IU, DU) OR DI) + (IU, DU)=(IUIU, IUDU, DUIU, DUDU, DIIU, DIDU)
//OR (IUDIIU, IUDIDU, DUDIIU, DUDIDU)
//#### 6~8位
//##### 8= M= ((IU, DU) OR DI) + DI + QI=(IUDIQI, DUDIQI, DIDIQI)
//OR (IUDIDIQI, DUDIDIQI)
//##### 6= X= UQ + ((IU, DU) OR DI) + DI=(UQIUDI, UQDUDI, UQDIDI)
//OR (UQIUDIDI, UQDUDIDI)
//##### C= T= UQ + ((IU, DU) OR DI) + (IU, DU)=(UQIUIU, UQIUDU, UQDUIU, UQDUDU, UQDIIU
//, UQDIDU) OR (UQIUDIIU, UQIUDIDU, UQDUDIIU, UQDUDIDU)
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public interface S_MapsInitons{
	public static final Map<String, String> initonsMap= new IMV_SIQ();
	public static final Map<String, Integer> numberSet= new IMV_SIQ();
	public static final Map<String, String> initonsSet= new IMV_SIQ();
	public static final Map<String, String> initonsCode= new IMV_SIQ();
	public static final Map<String, String> initonsMap16= new IMV_SIQ();
	public static final Map<String, Integer> numberSet16= new IMV_SIQ();
	public static final Map<String, String> initonsSet16= new IMV_SIQ();
	public static final Map<String, String> initonsCode16= new IMV_SIQ();

	public static void init() {
 		initonsMap.put("A", "7");
 		initonsMap.put("O", "A");
 		initonsMap.put("P", "2");
 		initonsMap.put("M", "8");
 		initonsMap.put("V", "D");
 		initonsMap.put("E", "3");
 		initonsMap.put("C", "1");
 		initonsMap.put("S", "9");
 		initonsMap.put("I", "E");
 		initonsMap.put("D", "0");
 		initonsMap.put("U", "F");
 		initonsMap.put("Q", "G");
 		initonsMap.put("T", "C");
 		initonsMap.put("X", "6");
 		initonsMap.put("+", "B");
 		initonsMap.put("-", "5");
 		initonsMap.put("H", "4");
 		
 		numberSet.put("0", 0);
 		numberSet.put("1", 1);
 		numberSet.put("2", 2);
 		numberSet.put("3", 3);
 		numberSet.put("4", 4);
 		numberSet.put("5", 5);
 		numberSet.put("6", 6);
 		numberSet.put("7", 7);
 		numberSet.put("8", 8);
 		numberSet.put("9", 9);
 		numberSet.put("A", 10);
 		numberSet.put("B", 11);
 		numberSet.put("C", 12);
 		numberSet.put("D", 13);
 		numberSet.put("E", 14);
 		numberSet.put("F", 15);
 		numberSet.put("G", 16);
 		
		initonsSet.put("0", "0");
		initonsSet.put("1", "1");
		initonsSet.put("2", "2");
		initonsSet.put("3", "3");
		initonsSet.put("4", "4");
		initonsSet.put("5", "5");
		initonsSet.put("6", "6");
		initonsSet.put("7", "7");
		initonsSet.put("8", "8");
		initonsSet.put("9", "9");
		initonsSet.put("10", "A");
		initonsSet.put("11", "B");
		initonsSet.put("12", "C");
		initonsSet.put("13", "D");
		initonsSet.put("14", "E");
		initonsSet.put("15", "F");
		initonsSet.put("16", "G");

		initonsCode.put("0", "D");
		initonsCode.put("1", "C");
		initonsCode.put("2", "P");
		initonsCode.put("3", "E");
		initonsCode.put("4", "H");
		initonsCode.put("5", "-");
		initonsCode.put("6", "X");
		initonsCode.put("7", "A");
		initonsCode.put("8", "M");
		initonsCode.put("9", "S");
		initonsCode.put("A", "O");
		initonsCode.put("B", "+");
		initonsCode.put("C", "T");
		initonsCode.put("D", "V");
		initonsCode.put("E", "I");
		initonsCode.put("F", "U");
		initonsCode.put("G", "Q");
		//17up
		//16down
		initonsSet16.put("0", "0");//later remove out
		initonsSet16.put("1", "1");
		initonsSet16.put("2", "2");
		initonsSet16.put("3", "3");
		initonsSet16.put("4", "4");
		initonsSet16.put("5", "5");
		initonsSet16.put("6", "6");
		initonsSet16.put("7", "7");
		initonsSet16.put("8", "8");
		initonsSet16.put("9", "9");
		initonsSet16.put("10", "A");
		initonsSet16.put("11", "B");
		initonsSet16.put("12", "C");
		initonsSet16.put("13", "D");
		initonsSet16.put("14", "E");
		initonsSet16.put("15", "F");

		initonsCode16.put("0", "D");
		initonsCode16.put("1", "C");
		initonsCode16.put("2", "P");
		initonsCode16.put("3", "E");
		initonsCode16.put("4", "T");
		initonsCode16.put("5", "H");
		initonsCode16.put("6", "O");
		initonsCode16.put("7", "S");
		initonsCode16.put("8", "M");
		initonsCode16.put("9", "A");
		initonsCode16.put("A", "X");
		initonsCode16.put("B", "F");
		initonsCode16.put("C", "V");
		initonsCode16.put("D", "I");
		initonsCode16.put("E", "U");
		initonsCode16.put("F", "Q");

		initonsMap16.put("D", "0");
		initonsMap16.put("C", "1");
		initonsMap16.put("P", "2");
		initonsMap16.put("E", "3");
		initonsMap16.put("T", "4");
		initonsMap16.put("H", "5");
		initonsMap16.put("O", "6");
		initonsMap16.put("S", "7");
		initonsMap16.put("M", "8");
		initonsMap16.put("A", "9");
		initonsMap16.put("X", "A");
		initonsMap16.put("F", "B");
		initonsMap16.put("V", "C");
		initonsMap16.put("I", "D");
		initonsMap16.put("U", "E");
		initonsMap16.put("Q", "F");

		numberSet16.put("0", 0);
		numberSet16.put("1", 1);
		numberSet16.put("2", 2);
		numberSet16.put("3", 3);
		numberSet16.put("4", 4);
		numberSet16.put("5", 5);
		numberSet16.put("6", 6);
		numberSet16.put("7", 7);
		numberSet16.put("8", 8);
		numberSet16.put("9", 9);
		numberSet16.put("A", 10);
		numberSet16.put("B", 11);
		numberSet16.put("C", 12);
		numberSet16.put("D", 13);
		numberSet16.put("E", 14);
		numberSet16.put("F", 15);
	}

}
