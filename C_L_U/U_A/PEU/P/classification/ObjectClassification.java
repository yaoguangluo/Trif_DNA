package U_A.PEU.P.classification;

import S_A.pheromone.IMV_SIQ;
import U_V.ESU.list.List_ESU_X_listToArray;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
//罗瑶光
//昨天有了合并函数, 今天就设计分类函数
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class ObjectClassification {
	public static Map<String, IMV_SIQ>
	mapClassification(IMV_SIQ input, String[] keywords) {
		Map<String, IMV_SIQ> output= new IMV_SIQ();
		Iterator<String> iterator= input.keySet().iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			for(int i= 0; i< keywords.length; i++) {
				if(string.contains(keywords[i])) {
					IMV_SIQ map;
					if(output.containsKey(keywords[i])) {
						map= output.get(keywords[i]);
					}else {
						map= new IMV_SIQ(); 
					}
					map.put(string, input.get(string));
					output.put(keywords[i], map);
				}
			}
		}
		return output;
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String, IMV_SIQ> mapClassification2D(IMV_SIQ input
		, String[] keywords) {
		Map<String, IMV_SIQ> output= new IMV_SIQ();
		IMV_SIQ[] outputArray= new IMV_SIQ[keywords.length];
		for(int i= 0; i< keywords.length; i++) {
			outputArray[i]= new IMV_SIQ();
		}
		Iterator<String> iterator= input.keySet().iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			for(int i= 0; i< keywords.length; i++) {
				if(string.contains(keywords[i])) {
					outputArray[i].put(string, input.get(string));
				}
			}
		}
		for(int i= 0; i< keywords.length; i++) {
			output.put(keywords[i], outputArray[i]);
		}
		return output;
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String, String[]>
	stringClassification2D(String[] input, String[] keywords) {
		Map<String, String[]> output= new IMV_SIQ();
		List<String>[] outputArray= new LinkedList[keywords.length];
		for(int i= 0; i< keywords.length; i++) {
			outputArray[i]= new LinkedList<>();
		}
		for(int i= 0; i< input.length; i++) {
			for(int j= 0; j< keywords.length; j++)
			if(input[i].contains(keywords[j])) {
				outputArray[j].add(input[i]);
			}
		}
		for(int i= 0; i< keywords.length; i++) {
			output.put(keywords[i]
					, List_ESU_X_listToArray._E(outputArray[i]));
		}
		return output;
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String, List<String>>
	listClassification2D(List<String> input, String[] keywords) {
		Map<String, List<String>> output= new IMV_SIQ();
		List<String>[] outputArray= new LinkedList[keywords.length];
		for(int i= 0; i< keywords.length; i++) {
			outputArray[i]= new LinkedList<>();
		}
		Iterator<String> iterator= input.iterator();
		while(iterator.hasNext()) {
			String string= iterator.next();
			for(int j= 0; j< keywords.length; j++)
				if(string.contains(keywords[j])) {
					outputArray[j].add(string);
				}
		}
		for(int i= 0; i< keywords.length; i++) {
			output.put(keywords[i], outputArray[i]);
		}
		return output;
	}
	
	public static void main(String[] ARGS) {
		IMV_SIQ input= new IMV_SIQ();
		String[] keywords= new String[3];
		input.put("罗", "罗");
		input.put("罗", "罗");
		input.put("瑶", "瑶");
		input.put("瑶", "瑶");
		input.put("光", "光");
		input.put("光", "光");
		
		keywords[0]="罗";
		keywords[1]="瑶";
		keywords[2]="光";
		mapClassification(input, keywords);
		mapClassification2D(input, keywords);
		
		String[] inputString= new String[3];
		inputString[0]="罗瑶";
		inputString[1]="罗光";
		inputString[2]="瑶光";
		stringClassification2D(inputString, keywords);
		
		List<String> inputList= new LinkedList<String>();
		inputList.add("罗瑶");
		inputList.add("罗光");
		inputList.add("瑶光");
		listClassification2D(inputList, keywords);
	}
}
