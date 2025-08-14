//package U_V.OEU.LYG4DQS4D;
////import java.io.BufferedReader;
////
////import java.io.InputStream;
////import java.io.InputStreamReader;
//
//import S_A.pheromone.IMV_SIQ;
//
//import java.util.Map;
//
////import ME.APM.VSQ.C.App;
////import SVQ.stable.S_File;
////作者+ 著作权人： 罗瑶光, 浏阳,
/*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
// ** 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
// * */
//public class LYG10DWithChineseMixStringSort10D{
//	Map<String, Boolean> find= new IMV_SIQ();
//	Map<String, String> pinyin;
//	int range;
//	int deeps;
//	public void quick4DChineseStringArray1D(String[] strings, int scale, Map<String
//			, String> map, int range, int deeps) {
//		this.pinyin= map;
//		this.range= range;
//		this.deeps= deeps;
//		processKernel(strings, 0, strings.length- 1, scale, 0);
//	}
//
//	public boolean quick4DChineseStringArrayWithSmallInTwoChar(String[] strings
//			, int leftPosition, int rightPosition, int scale, Map<String, String> map
//			, int range, int deeps) {
//		this.pinyin= map;
//		this.range= range;
//		this.deeps= deeps;
//		String oldValue=strings[0].toString();
//		processKernel(strings, leftPosition, rightPosition, scale, 0);
//		if(oldValue.equalsIgnoreCase(strings[0])){
//			return true;
//		}else {
//			return false;
//		}
//	}
//
//	public int quick4DChineseStringArrayWithSmallInTwoChar3Returns(String[] strings
//			, int leftPosition, int rightPosition, int scale, Map<String, String> map
//			, int range, int deeps) {
//		this.pinyin= map;
//		this.range= range;
//		this.deeps= deeps;
//		String oldValue=strings[0].toString();
//		processKernel(strings, leftPosition, rightPosition, scale, 0);
//
//		//先1 等 后1    先 1等 后2
//		//先1 等 后1    先 1 不等 后2
//		//先1 不等 后1    先 1等 后2
//		//先1 不等 后1    先 1不等 后2
//
//		if(strings[0].equals(strings[1])) {
//			return 0;
//		}
//		if(oldValue.equalsIgnoreCase(strings[0])) {
//			return 1;
//		}
//		if(!oldValue.equalsIgnoreCase(strings[0])) {
//			return -1;
//		}
//		if(oldValue.equalsIgnoreCase(strings[1])) {
//			return -1;
//		}
//		if(!oldValue.equalsIgnoreCase(strings[1])) {
//			return 1;
//		}
//		return 0;
//	}
//
//	private void processKernel(String[] kernel, int leftPosition
//			, int rightPosition, int scale, int point) {
//		int rightPositionReflection= rightPosition;
//		if(point> scale) {
//			return;
//		}
//		processQS4DLYG9D(kernel, leftPosition, rightPosition, scale, point, 0);
//		int i;
//		for(i= leftPosition; i<= rightPosition; i++) {
//			if(!(kernel[i].length()<= point|| kernel[leftPosition].length()<= point)) {
//				if(kernel[i].charAt(point)!= kernel[leftPosition].charAt(point)){
//					rightPositionReflection= i- 1;
//					processKernel(kernel, leftPosition, rightPositionReflection
//							, scale, point+ 1);
//					leftPosition= i;
//				}
//			}
//		}
//		if(leftPosition!= rightPosition) {
//			processKernel(kernel, leftPosition, i- 1, scale, point+ 1);
//		}
//	}
//
//	private void processSort(String[] kernel, int leftPosition
//			, int rightPosition, int scale, int point) {
//		if(point> scale) {
//			return;
//		}
//		for(int i= leftPosition; i<= rightPosition; i++) {
//			Here:
//				for(int j= i; j<= rightPosition; j++) {
//					if(i== j) {
//						continue Here;
//					}
//					if(kernel[i].length()<= point|| kernel[j].length()<= point) {
//						if(kernel[i].length()< kernel[j].length()) {
//							for(int p= 0; p< scale; p++) {
//								if(!(kernel[i].length()<= p|| kernel[j].length()<= p)) {
//									if(kernel[i].charAt(p)!= kernel[j].charAt(p)) {
//										continue Here;
//									}
//								}
//							}
//							String temp= kernel[i].toString();;
//							kernel[i]= kernel[j].toString();;
//							kernel[j]= temp;
//						}
//						continue Here;
//					}else {
//						boolean hasXi= pinyin.containsKey(""+ kernel[i].charAt(point));
//						boolean hasXj= pinyin.containsKey(""+ kernel[j].charAt(point));
//							if(!(!hasXi|| !hasXj)){
//							String[] js= new String[2];
//							js[0]= this.pinyin.get(""+ kernel[i].charAt(point));
//							js[1]= this.pinyin.get(""+ kernel[j].charAt(point));
//							boolean change= processSortPinYin(js, 3);
//							if(!(!change|| i>= j)) {
//								String temp= kernel[i].toString();
//								kernel[i]= kernel[j].toString();
//								kernel[j]= temp;
//							}
//							continue Here;
//						}else if(!(hasXi|| !hasXj)){
//							if(i< j) {
//								if(!(i== rightPosition+1 || j== rightPosition+1)) {
//									String temp= kernel[i].toString();
//									kernel[i]= kernel[j].toString();
//									kernel[j]= temp;
//								}
//							}
//							continue Here;
//						}else if(!(!hasXi|| hasXj)){
//							if(i> j) {
//								if(!(i== rightPosition+1 || j== rightPosition+1)) {
//									String temp= kernel[i].toString();
//									kernel[i]= kernel[j].toString();
//									kernel[j]= temp;
//								}
//							}
//							continue Here;
//						}else if(!(hasXi|| hasXj)){
//							if(kernel[i].toLowerCase().charAt(point)
//									> kernel[j].toLowerCase().charAt(point)) {
//								if(i< j) {
//									String temp= kernel[i].toString();
//									kernel[i]= kernel[j].toString();
//									kernel[j]= temp;
//								}
//								continue Here;
//							}
//							if(kernel[i].toLowerCase().charAt(point)
//									== kernel[j].toLowerCase().charAt(point)) {
//								if(kernel[i].charAt(point)> kernel[j].charAt(point)) {
//									if(i< j) {
//										String temp= kernel[i].toString();
//										kernel[i]= kernel[j].toString();
//										kernel[j]= temp;
//									}
//								}
//								continue Here;
//							}
//						}
////						if(!(!hasBi|| !hasBj)){
////							if(i<j &&(this.bihua.get(""+ kernel[i].charAt(point))
////									> this.bihua.get(""+ kernel[j].charAt(point)))) {
////								String temp= kernel[i].toString();
////								kernel[i]= kernel[j].toString();
////								kernel[j]= temp;
////								continue Here;
////							}
////						}
//					}
//				}
//		}
//	}
//
//	//	private void processQS4DLYG5D(String[] kernel, int leftPosition
//	//			, int rightPosition, int scale, int point, int deep) {
//	//		if(leftPosition< rightPosition){
//	//			int c= rightPosition- leftPosition;
//	//			if(!(c > this.range|| deep> this.deeps)) {//增加了deep
//	//				processSort(kernel, leftPosition, rightPosition, scale, point);
//	//				return;
//	//			}
//	//			int pos= partition(kernel, leftPosition, rightPosition, scale, point);
//	//			processQS4DLYG5D(kernel, leftPosition, pos- 1, scale, point, deep+ 1);
//	//			processQS4DLYG5D(kernel, pos+ 1, rightPosition, scale, point, deep+ 1);
//	//		}
//	//	}
//
//	private void processQS4DLYG9D(String[] kernel, int leftPosition
//			, int rightPosition, int scale, int point, int deep) {
//		if(leftPosition< rightPosition){
//			int c= rightPosition- leftPosition+ 1;
//			if(!(c< this.range|| deep> this.deeps)) {//增加了deep
//				int pos= partition(kernel, leftPosition, rightPosition, scale, point);
//				if(leftPosition< pos- 1) {
//					processQS4DLYG9D(kernel, leftPosition, pos- 1, scale, point, deep+ 1);
//				}
//				if(pos+ 1< rightPosition) {
//					processQS4DLYG9D(kernel, pos+ 1, rightPosition, scale, point, deep+ 1);
//				}
//				return;
//			}
//			processSort(kernel, leftPosition, rightPosition, scale, point);
//			return;
//		}
//	}
//
//	private boolean findSmall(String[] kernel, int scale, int point
//			, int i, int j, int rightPosition) {
//		if(kernel[i].length()<= point|| kernel[j].length()<= point) {
//			if(kernel[i].length()< kernel[j].length()) {
//				for(int p= 0; p< scale; p++) {
//					if(!(kernel[i].length()<= p|| kernel[j].length()<= p)) {
//						if(kernel[i].charAt(p)!= kernel[j].charAt(p)) {
//							return false;
//						}
//					}
//				}
//				return true;
//			}
//			return false;
//		}else {
//			boolean hasXi= pinyin.containsKey(""+ kernel[i].charAt(point));
//			boolean hasXj= pinyin.containsKey(""+ kernel[j].charAt(point));
//			if(!(!hasXi|| !hasXj)){
//				String[] js= new String[2];
//				js[0]= this.pinyin.get(""+ kernel[i].charAt(point));
//				js[1]= this.pinyin.get(""+ kernel[j].charAt(point));
//				boolean change= processSortPinYin(js, 3);
//				if(!(!change|| i>= j)) {
//					return true;
//				}
//				return false;
//			}else if(!(hasXi|| hasXj)){
//				if(kernel[i].toLowerCase().charAt(point)
//						> kernel[j].toLowerCase().charAt(point)) {
//					if(i< j) {
//						return true;
//					}
//					return false;
//				}else if(kernel[i].toLowerCase().charAt(point)
//						== kernel[j].toLowerCase().charAt(point)) {
//					if(kernel[i].charAt(point)> kernel[j].charAt(point)) {
//						if(i< j) {
//							return true;
//						}
//						return false;
//					}
//					return false;
//				}
//				return false;
//			}else if(!(hasXi|| !hasXj)){
//				if(i< j) {
//					if(!(i== rightPosition || j== rightPosition)) {
//						return true;
//					}
//					return false;
//				}
//				return false;
//			}
//		}
//		return false;
//	}
//
//	private boolean findSmallWithTwoChar(String x1, String x2, int scale, int point) {
//		if(x1.length()<= point|| x2.length()<= point) {
//			if(x1.length()< x2.length()) {
//				for(int p= 0; p< scale; p++) {
//					if(!(x1.length()<= p|| x2.length()<= p)) {
//						if(x1.charAt(p)!= x2.charAt(p)) {
//							return false;
//						}
//					}
//				}
//				return true;
//			}
//			return false;
//		}else {
//			boolean hasX1= pinyin.containsKey(""+ x1.charAt(point));
//			boolean hasX2= pinyin.containsKey(""+ x2.charAt(point));
//			if(!(!hasX1|| !hasX2)){
//				String[] js= new String[2];
//				js[0]= this.pinyin.get(""+ x1.charAt(point));
//				js[1]= this.pinyin.get(""+ x2.charAt(point));
//				boolean changePinYin= processSortPinYin(js, 3);
//				if(changePinYin) {
//					return true;
//				}
//				return false;
//			}else if(!(hasX1|| hasX2)){
//				if(x1.toLowerCase().charAt(point)> x2.toLowerCase().charAt(point)) {
//					return true;
//				}else if(x1.toLowerCase().charAt(point)== x2.toLowerCase().charAt(point)) {
//					if(x1.charAt(point)> x2.charAt(point)) {
//						return true;
//					}
//					return false;
//				}
//				return false;
//			}else if(!(hasX1|| !hasX2)){
//				return true;
//			}
//		}
//		return false;
//	}
//
//	private int partition(String[] array, int leftPosition, int rightPosition, int scale, int point) {
//		String x= findSmall(array, scale, point, leftPosition, rightPosition, rightPosition)
//				? array[rightPosition]: array[leftPosition];
//				int leftPositionReflection= leftPosition;
//				while(leftPositionReflection++ < rightPosition) {
//					while(!(findSmallWithTwoChar(array[leftPositionReflection++]
//							, x, scale, point)|| leftPositionReflection> rightPosition)) {}
//					while(findSmallWithTwoChar(array[rightPosition--], x, scale, point)){}
//					if(--leftPositionReflection< ++rightPosition){
//						String temp= array[rightPosition].toString();;
//						array[rightPosition]= array[leftPositionReflection].toString();;
//						array[leftPositionReflection]= temp;
//					}
//				}
//				array[leftPosition]= array[rightPosition].toString();
//				array[rightPosition]= x;
//				return rightPosition;
//	}
//
//	private boolean processSortPinYin(String[] kernel, int scale) {
//		for(int k= 0; k< scale; k++) {
//			if(kernel[0].length()<= k|| kernel[1].length()<= k) {
//				if(kernel[0].length()< kernel[1].length()) {
//					return true;
//				}
//				return false;
//			}
//			if(kernel[0].toLowerCase().charAt(k)
//					> kernel[1].toLowerCase().charAt(k)) {
//				return true;
//			}
//			if(kernel[0].toLowerCase().charAt(k)
//					< kernel[1].toLowerCase().charAt(k)) {
//				return false;
//			}
//		}
//		if(kernel[0].length()< kernel[1].length()) {
//			return true;
//		}
//		return false;
//	}
//
////	private boolean processSortBiHua(int[] jsint, int scale) {
////		if(jsint[0]!= jsint[1]) {
////			return true;
////		}
////		return false;
////	}
//
//	public boolean findSmallWithTwoCharWithPinYin(Map<String, String> pinyinMap
//			, String x1, String x2, int scale, int point){
//		if(x1.length()<= point|| x2.length()<= point) {
//			if(x1.length()< x2.length()) {
//				for(int p= 0; p< scale; p++) {
//					if(!(x1.length()<= p|| x2.length()<= p)) {
//						if(x1.charAt(p)!= x2.charAt(p)) {
//							return false;
//						}
//					}
//				}
//				return true;
//			}
//			return false;
//		}else {
//			boolean hasX1= pinyinMap.containsKey(""+ x1.charAt(point));
//			boolean hasX2= pinyinMap.containsKey(""+ x2.charAt(point));
//			if(!(!hasX1|| !hasX2)){
//				String[] js= new String[2];
//				js[0]= pinyinMap.get(""+ x1.charAt(point));
//				js[1]= pinyinMap.get(""+ x2.charAt(point));
//				boolean change= processSortPinYin(js, 3);
//				if(change) {
//					return true;
//				}
//				return false;
//			}else if(!(hasX1|| hasX2)){
//				if(x1.toLowerCase().charAt(point)> x2.toLowerCase().charAt(point)) {
//					return true;
//				}else if(x1.toLowerCase().charAt(point)== x2.toLowerCase().charAt(point)) {
//					if(x1.charAt(point)> x2.charAt(point)) {
//						return true;
//					}
//					return false;
//				}
//				return false;
//			}else if(!(hasX1|| !hasX2)){
//				return true;
//			}
//		}
//		return false;
//	}
//
////	public static void main(String []v) {
////		try {
////			InputStream inputStreamc= new App().getClass().getResourceAsStream(S_File.poscc_lyg);
////			DetaBufferedReader cReaderc= new DetaBufferedReader(DetaInputStreamReader.E(inputStreamc, "UTF8"));
////			InputStream inputStreamp= new App().getClass().getResourceAsStream(S_File.poscp_lyg);
////			DetaBufferedReader cReaderp= new DetaBufferedReader(DetaInputStreamReader.E(inputStreamp, "UTF8"));
////			//index
////			String cInputStringc;
////			String cInputStringp;
////			Map<String, String> map= new IMV_SIQ();
////			while ((cInputStringp= cReaderp.readDetaLine())!= null) {
////				cInputStringc= cReaderc.readDetaLine();
////				String[] words= cInputStringp.split("/")[0].split(" ");
////				for(int i= 0; i< words.length; i++) {
////					if(!map.containsKey(""+ cInputStringc.charAt(i))) {
////						if(!cInputStringc.contains("字母")&& !cInputStringc.contains("标点")
////								&& !cInputStringc.contains("数字")&& !cInputStringc.contains("数词")) {
////							map.put(""+ cInputStringc.charAt(i), words[i]);
////						}
////					}
////				}
////			}
////			String[] strings1D= new String[3];
////			strings1D[0]= "dh罗韵律";
////			strings1D[1]= "dh罗瑶林";
////			strings1D[2]= "dh罗瑶光";
////
////			LYG10DWithChineseMixStringSort10D lYG10DWithChineseMixStringSort10D= new LYG10DWithChineseMixStringSort10D();
////			lYG10DWithChineseMixStringSort10D.quick4DChineseStringArray1D(strings1D, 30, map, 7, 70);
////			for(String string:strings1D) {
////				//20230106-System.out.println(string);
////			}
////			String[][] strings2D= new String[14][3];
////			strings2D[0][1]= "dh罗韵律";
////			strings2D[1][1]= "dh罗瑶d林";
////			strings2D[2][1]= "dh罗瑶光";
////			strings2D[3][1]= "dh罗韵律";
////			strings2D[4][1]= "dh罗瑶g林";
////			strings2D[5][1]= "dhv罗瑶光";
////			strings2D[6][1]= "dh罗韵律";
////			strings2D[7][1]= "";
////			//strings2D[8][1]="";
////			strings2D[9][1]= "dh罗韵律";
////			strings2D[10][1]= "dh罗瑶m林";
////			strings2D[11][1]= "dh罗瑶光";
////			strings2D[12][1]= "dh罗b瑶光";
////			strings2D[13][1]= "dh罗瑶光";
////			lYG10DWithChineseMixStringSort10D.quick4DChineseStringArray2D(strings2D, 30, map, 7, 70, 1);
////			for(String[] string:strings2D) {
////				//20230106-System.out.println(string[1]);
////			}
////			cReaderc.close();
////			cReaderp.close();
////		}catch(Exception e) {
////
////		}
////	}
//
//	public void quick4DChineseStringArray2D(String[][] strings2d, int scale
//			, Map<String, String> map, int range, int deeps, int culumn) {
//		this.pinyin= map;
//		this.range= range;
//		this.deeps= deeps;
//		processKernel2D(strings2d, 0, strings2d.length- 1, scale, 0, culumn);
//	}
//
//	private void processKernel2D(String[][] kernel, int leftPosition
//			, int rightPosition, int scale, int point, int culumn) {
//		int rightPositionReflection= rightPosition;
//		if(point> scale) {
//			return;
//		}
//		processQS4DLYG9D2D(kernel, leftPosition, rightPosition, scale, point, 0, culumn);
//		int i;
//		for(i= leftPosition; i<= rightPosition; i++) {
//			if(!(kernel[i][culumn].length()<= point
//					|| kernel[leftPosition][culumn].length()<= point)) {
//				if(kernel[i][culumn].charAt(point)
//						!= kernel[leftPosition][culumn].charAt(point)){
//					rightPositionReflection= i- 1;
//					processKernel2D(kernel, leftPosition, rightPositionReflection
//							, scale, point+ 1, culumn);
//					leftPosition= i;
//				}
//			}
//		}
//		if(leftPosition!= rightPosition) {
//			processKernel2D(kernel, leftPosition, i- 1, scale, point+ 1, culumn);
//		}
//	}
//
//	private void processQS4DLYG9D2D(String[][] kernel, int leftPosition
//			, int rightPosition, int scale, int point, int deep, int culumn) {
//		if(leftPosition< rightPosition){
//			int c= rightPosition- leftPosition+ 1;
//			if(!(c< this.range|| deep> this.deeps)) {//增加了deep
//				int pos= partition2D(kernel, leftPosition, rightPosition, scale
//						, point, culumn);
//				if(leftPosition< pos- 1) {
//					processQS4DLYG9D2D(kernel, leftPosition, pos- 1, scale, point
//							, deep+ 1, culumn);
//				}
//				if(pos+ 1< rightPosition) {
//					processQS4DLYG9D2D(kernel, pos+ 1, rightPosition, scale, point
//							, deep+ 1, culumn);
//				}
//				return;
//			}
//			processSort2D(kernel, leftPosition, rightPosition, scale, point, culumn);
//			return;
//		}
//	}
//
//	private int partition2D(String[][] array, int leftPosition, int rightPosition
//			, int scale, int point, int culumn) {
//		String[] x= findSmall2D(array, scale, point, leftPosition, rightPosition
//				, rightPosition, culumn)
//				? array[rightPosition]: array[leftPosition];
//				int leftPositionReflection= leftPosition;
//				while(leftPositionReflection++ < rightPosition) {
//					while(!(findSmallWithTwoChar(array[leftPositionReflection++][culumn]
//							, x[culumn], scale, point)|| leftPositionReflection> rightPosition)) {}
//					while(findSmallWithTwoChar(array[rightPosition--][culumn]
//							, x[culumn], scale, point)){}
//					if(--leftPositionReflection< ++rightPosition){
//						String[] temp= array[rightPosition].clone();;
//						array[rightPosition]= array[leftPositionReflection].clone();;
//						array[leftPositionReflection]= temp.clone();
//					}
//				}
//				array[leftPosition]= array[rightPosition].clone();
//				array[rightPosition]= x.clone();
//				return rightPosition;
//	}
//
//	private boolean findSmall2D(String[][] kernel, int scale, int point
//			, int i, int j, int rightPosition, int culumn) {
//		if(kernel[i][culumn].length()<= point
//				|| kernel[j][culumn].length()<= point) {
//			if(kernel[i][culumn].length()< kernel[j][culumn].length()) {
//				for(int p= 0; p< scale; p++) {
//					if(!(kernel[i][culumn].length()<= p|| kernel[j][culumn].length()<= p)) {
//						if(kernel[i][culumn].charAt(p)!= kernel[j][culumn].charAt(p)) {
//							return false;
//						}
//					}
//				}
//				return true;
//			}
//			return false;
//		}else {
//			boolean hasXi= pinyin.containsKey(""+ kernel[i][culumn].charAt(point));
//			boolean hasXj= pinyin.containsKey(""+ kernel[j][culumn].charAt(point));
//			if(!(!hasXi|| !hasXj)){
//				String[] js= new String[2];
//				js[0]= this.pinyin.get(""+ kernel[i][culumn].charAt(point));
//				js[1]= this.pinyin.get(""+ kernel[j][culumn].charAt(point));
//				boolean change= processSortPinYin(js, 3);
//				if(!(!change|| i>= j)) {
//					return true;
//				}
//				return false;
//			}else if(!(hasXi|| hasXj)){
//				if(kernel[i][culumn].toLowerCase().charAt(point)
//						> kernel[j][culumn].toLowerCase().charAt(point)) {
//					if(i< j) {
//						return true;
//					}
//					return false;
//				}else if(kernel[i][culumn].toLowerCase().charAt(point)
//						== kernel[j][culumn].toLowerCase().charAt(point)) {
//					if(kernel[i][culumn].charAt(point)
//							> kernel[j][culumn].charAt(point)) {
//						if(i< j) {
//							return true;
//						}
//						return false;
//					}
//					return false;
//				}
//				return false;
//			}else if(!(hasXi|| !hasXj)){
//				if(i< j) {
//					if(!(i== rightPosition || j== rightPosition)) {
//						return true;
//					}
//					return false;
//				}
//				return false;
//			}
//		}
//		return false;
//	}
//
//	private void processSort2D(String[][] kernel, int leftPosition
//			, int rightPosition, int scale, int point, int culumn) {
//		if(point> scale) {
//			return;
//		}
//		for(int i= leftPosition; i<= rightPosition; i++) {
//			Here:
//				for(int j= i; j<= rightPosition; j++) {
//					if(i== j) {
//						continue Here;
//					}
//					if(kernel[i][culumn].length()<= point
//							|| kernel[j][culumn].length()<= point) {
//						if(kernel[i][culumn].length()< kernel[j][culumn].length()) {
//							for(int p= 0; p< scale; p++) {
//								if(!(kernel[i][culumn].length()<= p
//										|| kernel[j][culumn].length()<= p)) {
//									if(kernel[i][culumn].charAt(p)
//											!= kernel[j][culumn].charAt(p)) {
//										continue Here;
//									}
//								}
//							}
//							String[] temp= kernel[i].clone();;
//							kernel[i]= kernel[j].clone();;
//							kernel[j]= temp.clone();
//						}
//						continue Here;
//					}else {
//						boolean hasXi
//						= pinyin.containsKey(""+ kernel[i][culumn].charAt(point));
//						boolean hasXj
//						= pinyin.containsKey(""+ kernel[j][culumn].charAt(point));
//						if(!(!hasXi|| !hasXj)){
//							String[] js= new String[2];
//							js[0]= this.pinyin.get(""+ kernel[i][culumn].charAt(point));
//							js[1]= this.pinyin.get(""+ kernel[j][culumn].charAt(point));
//							boolean change= processSortPinYin(js, 3);
//							if(!(!change|| i>= j)) {
//								String[] temp= kernel[i].clone();
//								kernel[i]= kernel[j].clone();
//								kernel[j]= temp.clone();
//							}
//							continue Here;
//						}else if(!(hasXi|| !hasXj)){
//							if(i< j) {
//								if(!(i== rightPosition+1 || j== rightPosition+1)) {
//									String[] temp= kernel[i].clone();
//									kernel[i]= kernel[j].clone();
//									kernel[j]= temp.clone();
//								}
//							}
//							continue Here;
//						}else if(!(hasXi|| hasXj)){
//							if(kernel[i][culumn].toLowerCase().charAt(point)
//									> kernel[j][culumn].toLowerCase().charAt(point)) {
//								if(i< j) {
//									String[] temp= kernel[i].clone();
//									kernel[i]= kernel[j].clone();
//									kernel[j]= temp.clone();
//								}
//								continue Here;
//							}
//							if(kernel[i][culumn].toLowerCase().charAt(point)
//									== kernel[j][culumn].toLowerCase().charAt(point)) {
//								if(kernel[i][culumn].charAt(point)> kernel[j][culumn].charAt(point)) {
//									if(i< j) {
//										String[] temp= kernel[i].clone();
//										kernel[i]= kernel[j].clone();
//										kernel[j]= temp.clone();
//									}
//								}
//							}
//						}
//					}
//				}
//		}
//	}
//}
