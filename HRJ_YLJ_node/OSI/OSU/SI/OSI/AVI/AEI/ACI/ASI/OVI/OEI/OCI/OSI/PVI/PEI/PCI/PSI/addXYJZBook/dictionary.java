package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYJZBook;

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
	public IMV_SIQ dic_bz;
	public IMV_SIQ dic_gn;
	public IMV_SIQ dic_lx;
	public IMV_SIQ dic_by;
	public IMV_SIQ dic_wx;
	public IMV_SIQ dic_bl;
	public IMV_SIQ dic_lc;
	public IMV_SIQ dic_sy;
	public IMV_SIQ dic_zd;
	public IMV_SIQ dic_bf;
	public IMV_SIQ dic_zl;
	public IMV_SIQ dic_jy;
	public IMV_SIQ dic_yh;
	public IMV_SIQ dic_yf;
	public IMV_SIQ dic_yx;
	public List<String> txtToList() {
		List<String> temp_list= new ArrayList<>();
		InputStream in= this.getClass().getResourceAsStream("jzkxPage.txt");
		DetaBufferedReader cReader= new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF8"));
		String ctempString= null; 
		while ((ctempString= cReader.readDetaLine()) != null) {  
			if(!ctempString.replace(" ", "").equals("")) {
				if(ctempString.contains("〔")&&ctempString.contains("〕")) {
					ctempString= "〔〔"+ctempString;
				}
				temp_list.add(ctempString);
			}
		}
		cReader.closeDeta();
		return temp_list;
	}
	
	public IMV_SIQ_ listToMap(IMV_SIQ_ dic_map, List<String> dic_list) {
		//IMV_SIQ dic_map= new IMV_SIQ();
		for(int i= 0;i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("病症段落")) {
				String med_name= dic_list.get(i).replace("病症段落", "")+dic_list.get(i+1)+dic_list.get(i+2);
				String med_text= "" + med_name;
				int j= i;					while(++j< dic_list.size() && !(dic_list.get(j).contains("病症段落"))) {
					med_text += dic_list.get(j);
					//j+=1;
				}
				dic_map.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), (med_text+"〔〔").replace("\\s+", " "));
			}
		}
		return dic_map;
	}

	public IMV_SIQ_ mapToMap_zl(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_zl= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔治疗(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("治疗〕(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			Pattern p2= Pattern.compile("处理〕(.*?)〔〔"); 
			Matcher m2= p2.matcher(med_text); 
			Pattern p3= Pattern.compile("〔救治(.*?)〔〔"); 
			Matcher m3= p3.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);		
			}else if(m1.find()) {
				temp=m1.group(0);	
			}else if(m2.find()) {
				temp=m2.group(0);	
			}else if(m3.find()) {
				temp=m3.group(0);	
			}
			dic_zl.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_zl;
	}

	public IMV_SIQ_ mapToMap_zd(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_zd= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔诊断(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("诊断〕(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			Pattern p2= Pattern.compile("方法〕(.*?)〔〔"); 
			Matcher m2= p2.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);		
			}else if(m1.find()) {
				temp=m1.group(0);	
			}else if(m2.find()) {
				temp=m2.group(0);	
			}
			dic_zd.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_zd;
	}

	public IMV_SIQ_ mapToMap_bf(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_bf= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔并发(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("并发症〕(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);		
			}else if(m1.find()) {
				temp=m1.group(0);	
			}
			dic_bf.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_bf;
	}

	public IMV_SIQ_ mapToMap_jy(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_jy= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔教育(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("〔处置(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp= m.group(0);		
			}else if (m1.find()) {
				temp= m1.group(0);		
			}
			dic_jy.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_jy;
	}

	public IMV_SIQ_ mapToMap_yh(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_yh= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔预后(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("预后〕(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);		
			}else if(m1.find()) {
				temp=m1.group(0);	
			}
			dic_yh.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_yh;
	}

	public IMV_SIQ_ mapToMap_yf(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_yf= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔预防(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("预防〕(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}
			dic_yf.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_yf;
	}

	public IMV_SIQ_ mapToMap_yx(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_yx= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔影像(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);		
			}
			dic_yx.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_yx;
	}

	public IMV_SIQ_ mapToMap_sy(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_sy= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔实验(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("检查〕(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}
			dic_sy.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_sy;
	}

	public IMV_SIQ_ mapToMap_lc(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_lc= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔临床(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("临床〕(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}
			dic_lc.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_lc;
	}

	public IMV_SIQ_ mapToMap_bl(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_bl= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔病理(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("病理〕(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			Pattern p2= Pattern.compile("分类〕(.*?)〔〔"); 
			Matcher m2= p2.matcher(med_text); 
			Pattern p3= Pattern.compile("类型〕(.*?)〔〔"); 
			Matcher m3= p3.matcher(med_text); 
			Pattern p4= Pattern.compile("生理〕(.*?)〔〔"); 
			Matcher m4= p4.matcher(med_text); 
			Pattern p5= Pattern.compile("种类〕(.*?)〔〔"); 
			Matcher m5= p5.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}else if(m2.find()) {
				temp=m2.group(0);
			}else if(m3.find()) {
				temp=m3.group(0);
			}else if(m4.find()) {
				temp=m4.group(0);
			}else if(m5.find()) {
				temp=m5.group(0);
			}
			dic_bl.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_bl;
	}

	public IMV_SIQ_ mapToMap_wx(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_wx= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔危险(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("因素〕(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			Pattern p2= Pattern.compile("反应〕(.*?)〔〔"); 
			Matcher m2= p2.matcher(med_text); 
			Pattern p3= Pattern.compile("〔注意(.*?)〔〔"); 
			Matcher m3= p3.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}else if(m2.find()) {
				temp=m2.group(0);
			}else if(m3.find()) {
				temp=m3.group(0);
			}
			dic_wx.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_wx;
	}

	public IMV_SIQ_ mapToMap_by(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_by= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔病因(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Pattern p1= Pattern.compile("病因〕(.*?)〔〔"); 
			Matcher m1= p1.matcher(med_text); 
			Pattern p2= Pattern.compile("〔发病(.*?)〔〔"); 
			Matcher m2= p2.matcher(med_text); 
			Pattern p3= Pattern.compile("机制〕(.*?)〔〔"); 
			Matcher m3= p3.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}else if(m2.find()) {
				temp=m2.group(0);
			}else if(m3.find()) {
				temp=m3.group(0);
			}
			dic_by.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_by;
	}

	public IMV_SIQ_ mapToMap_lx(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_lx= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔流行(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);		
			}
			dic_lx.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_lx;
	}

	public IMV_SIQ_ mapToMap_gn(IMV_SIQ_ dic_map) {
		IMV_SIQ_ dic_gn= new IMV_SIQ_();
		Iterator<String> iter= dic_map.keySet().iterator();
		List<String> copy= new ArrayList<String>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++){
			String med_name= copy.get(i);
			String med_text= dic_map.get(med_name).toString()
.replace("\n", "");
			Pattern p= Pattern.compile("〔概念(.*?)〔〔"); 
			Pattern p1= Pattern.compile("概念〕(.*?)〔〔"); 
			Pattern p2= Pattern.compile("解剖〕(.*?)〔〔"); 
			Pattern p3= Pattern.compile("〔概述(.*?)〔〔"); 
			Pattern p4= Pattern.compile("概述〕(.*?)〔〔"); 
			Matcher m= p.matcher(med_text); 
			Matcher m1= p1.matcher(med_text); 
			Matcher m2= p2.matcher(med_text); 
			Matcher m3= p3.matcher(med_text); 
			Matcher m4= p4.matcher(med_text); 
			String temp="";
			if (m.find()) {
				temp=m.group(0);
			}else if(m1.find()) {
				temp=m1.group(0);
			}else if(m2.find()) {
				temp=m2.group(0);
			}else if(m3.find()) {
				temp=m3.group(0);
			}else if(m4.find()) {
				temp=m4.group(0);
			}
			dic_gn.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
		}
		return dic_gn;
	}
}
