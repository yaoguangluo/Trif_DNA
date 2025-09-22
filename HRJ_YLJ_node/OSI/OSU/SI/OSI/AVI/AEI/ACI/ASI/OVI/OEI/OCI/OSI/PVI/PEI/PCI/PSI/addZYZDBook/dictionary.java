package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYZDBook;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.pheromone.IMV_SIQ;
import S_A.pheromone.IMV_SIQ_;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dictionary{	
	public List<String> dic_list;
	public IMV_SIQ dic_map;
	public IMV_SIQ dic_gn;
	public IMV_SIQ dic_lcbx;
	public IMV_SIQ dic_zhfx;
	public IMV_SIQ dic_lcyy;
	public IMV_SIQ dic_zhjb;
	public List<String> txtToList() {
		List<String> dic_list= new ArrayList<>();
		List<String> temp_list= new ArrayList<>();
		InputStream in= this.getClass().getResourceAsStream("z.txt");
		DetaBufferedReader cReader= new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF-8"));
		String ctempString= null; 
		while ((ctempString= cReader.readDetaLine()) != null) {  
			if(!ctempString.replace(" ", "").equals(""))
				temp_list.add(ctempString);
		}
		cReader.closeDeta();
		for(int i= 0; i < temp_list.size(); i++) {
			dic_list.add(temp_list.get(i));
			if(temp_list.get(i).contains("[临床表现]")) {
				if(!temp_list.get(i-1).contains("[概念]")) {
					dic_list.add(dic_list.size()-1, "[概念]");
				}	
			}	
		}	
		dic_list.add("[该文章结束]");
		in= getClass().getResourceAsStream("shl.txt");
		cReader= new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF8"));
		ctempString= null; 
		while ((ctempString= cReader.readDetaLine()) != null) {  
			if(!ctempString.replace(" ", "").equals("")) {
				dic_list.add(ctempString);
			}
		}
		cReader.closeDeta();	
		return dic_list;
	}
	
	public IMV_SIQ_ listToMap(IMV_SIQ_ dic_map, List<String> dic_list) {
		//IMV_SIQ dic_map= new IMV_SIQ();
		for(int i= 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("[概念]")) {
				String med_name=dic_list.get(i-1);
				String med_text= "" + med_name;
				int j= i;					while(j+2 < dic_list.size() && (!dic_list.get(j).contains("[该文章结束]"))&& (!dic_list.get(j+2).contains("[概念]"))) {
					med_text += dic_list.get(j);
					j+=1;
				}
				dic_map.put(med_name, med_text.replace("\\s+", " "));
			}
			if(dic_list.get(i).contains("[原文]")) {
				String med_name="伤寒论:" + dic_list.get(i+1);
				String med_text= "" + med_name;
				int j= i;					while(j+1 < dic_list.size() && (!dic_list.get(j+1).contains("[原文]"))) {
					med_text += dic_list.get(j);
					j+=1;
				}
				dic_map.put(med_name, med_text.replace("\\s+", " "));
			}
		}
		return dic_map;
	}

	public IMV_SIQ mapToMap_zhjb(IMV_SIQ dic_map) {
		IMV_SIQ dic_zhjb= new IMV_SIQ();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0; i<copy.size(); i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("证候鉴别(.*?)$"); 
			Matcher m= p.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp="["+m.group(0);
			}
			dic_zhjb.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":") );
		}
		return dic_zhjb;
	}

	public IMV_SIQ mapToMap_lcyy(IMV_SIQ dic_map) {
		IMV_SIQ dic_lcyy= new IMV_SIQ();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("临床意义(.*?)证侯鉴别"); 

			Pattern p1= Pattern.compile("临床意义(.*?)$"); 
			Matcher m= p.matcher(med_text); 
			Matcher m1= p1.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp="["+m.group(0);
				temp=temp.replace("[证侯鉴别", ".");
			}else if (m1.find()) {
				temp="["+m1.group(0);
			}
			dic_lcyy.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":") );
		}
		
		return dic_lcyy;
	}

	public IMV_SIQ mapToMap_zhfx(IMV_SIQ dic_map) {
		IMV_SIQ dic_zhfx= new IMV_SIQ();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("证候分析(.*?)临床意义"); 
			Pattern p1= Pattern.compile("证候分析(.*?)证候鉴别"); 
			Pattern p2= Pattern.compile("证候分析(.*?)$"); 
			Pattern p3= Pattern.compile("评析(.*?)$"); 
			Matcher m= p.matcher(med_text);
			Matcher m1= p1.matcher(med_text); 
			Matcher m2= p2.matcher(med_text); 
			Matcher m3= p3.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp="["+m.group(0);
				temp=temp.replace("[临床意义", ".");
			}else if (m1.find()) {
				temp="["+m1.group(0);
				temp=temp.replace("[证侯鉴别", ".");
			}else if (m2.find()) {
				temp=m2.group(0);
			}else if (m3.find()) {
				temp="["+m3.group(0);
				temp=temp.replace("[评析]", ".");
			}
			dic_zhfx.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":") );
		}
		
		return dic_zhfx;
	}

	public IMV_SIQ mapToMap_lcbx(IMV_SIQ dic_map) {
		IMV_SIQ dic_lcbx= new IMV_SIQ();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("临床表现(.*?)临床意义"); 
			Pattern p1= Pattern.compile("临床表现(.*?)证候分析"); 
			Pattern p2= Pattern.compile("临床表现(.*?)证侯鉴别"); 
			Pattern p3= Pattern.compile("临床表现(.*?)$"); 
			Pattern p4= Pattern.compile("注释(.*?)译文"); 
			Pattern p5= Pattern.compile("注释(.*?)$"); 
			Matcher m= p.matcher(med_text);
			Matcher m1= p1.matcher(med_text); 
			Matcher m2= p2.matcher(med_text); 
			Matcher m3= p3.matcher(med_text); 
			Matcher m4= p4.matcher(med_text); 
			Matcher m5= p5.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp= "[" + m.group(0);
				temp= temp.replace("[临床意义", ".");
			}else if (m1.find()) {
				temp= "[" + m1.group(0);
				temp= temp.replace("[证候分析", ".");
			}else if (m2.find()) {
				temp= "[" + m2.group(0);
				temp= temp.replace("[证侯鉴别", ".");
			}else if (m3.find()) {
				temp= "[" + m3.group(0);
			}else if (m4.find()) {
				temp= "[" + m4.group(0);
				temp= temp.replace("[注释]", ".");
			}else if (m5.find()) {
				temp= "[" + m5.group(0);
			}
			dic_lcbx.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":") );
		}
		
		return dic_lcbx;
	}

	public IMV_SIQ_ mapToMap_gn(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_li= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i= 0; i < copy.size(); i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("概念(.*?)临床表现"); 
			Pattern p1= Pattern.compile("译文(.*?)评析"); 
			Pattern p2= Pattern.compile("译文(.*?)$"); 
			Matcher m= p.matcher(med_text); 
			Matcher m1= p1.matcher(med_text); 
			Matcher m2= p2.matcher(med_text); 
			String temp= "";
			if (m.find()) {
				temp= "[" + m.group(0);
				temp= temp.replace("[临床表现", ".");
			}else if (m1.find()) {
				temp= "[" + m1.group(0);
				temp= temp.replace("[译文]", ".");
			}else if (m2.find()) {
				temp= "[" + m2.group(0);
			}
			dic_li.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":") );
		}
		return dic_li;
	}
}
