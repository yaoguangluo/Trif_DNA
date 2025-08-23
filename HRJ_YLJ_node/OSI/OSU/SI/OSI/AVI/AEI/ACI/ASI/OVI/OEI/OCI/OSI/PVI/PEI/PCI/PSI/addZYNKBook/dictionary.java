package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYNKBook;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.SVQ.stable.S_Common;
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
	public IMV_SIQ dic_chu_fang;
	public List<String> txtToList() {
		List<String> temp_list= new ArrayList<>();
		InputStream in= this.getClass().getResourceAsStream("n.txt");
		DetaBufferedReader cReader= new DetaBufferedReader(DetaInputStreamReader.E(in));
		String ctempString= null; 
		while ((ctempString= cReader.readDetaLine()) != null) {  
			if(!ctempString.replace(" ", "").equals(""))
				temp_list.add(ctempString);
		}
		cReader.closeDeta();
		
		in= this.getClass().getResourceAsStream("wbx142f.txt");
		cReader= new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF8"));
		ctempString= null; 
		while ((ctempString= cReader.readDetaLine()) != null) {  
			if(!ctempString.replace(" ", "").equals(""))
				temp_list.add(ctempString);
		}
		cReader.closeDeta();
		
		in= this.getClass().getResourceAsStream("中医方剂学.txt");
		cReader= new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF8"));
		ctempString= null; 
		while ((ctempString= cReader.readDetaLine()) != null) {  
			if(!ctempString.replace(" ", "").equals(""))
				temp_list.add(ctempString);
		}
		cReader.closeDeta();
		
		in= this.getClass().getResourceAsStream("zydcd.txt");
		cReader= new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF8"));
		ctempString= null; 
		while ((ctempString= cReader.readDetaLine()) != null) {  
			if(!ctempString.replace(" ", "").equals(""))
				temp_list.add(ctempString);
		}
		cReader.closeDeta();
		
		return temp_list;
	}
	
	public IMV_SIQ_ listToMap(IMV_SIQ_ dic_map, List<String> dic_list) {
		//IMV_SIQ dic_map= new IMV_SIQ();
		for(int i= 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("^")) {
				String med_name= dic_list.get(i);
				String med_text= S_Common.STRING_EMPTY+med_name;
				int j= i;					while(++j< dic_list.size() && !dic_list.get(j).contains("^")) {
					med_text += dic_list.get(j);
				}
				if(!med_text.contains("中医大辞典")) {
					dic_map.put(med_name.replaceAll("\\s*", "").replace("〔"
						, "").replace("〕", ":"), med_text.replaceAll("\\s*"
						, "").replace("〔", "").replace("〕", ":"));
				}
			}
			if(dic_list.get(i).contains("..")) {
				String med_name= dic_list.get(i+1);
				String med_text= S_Common.STRING_EMPTY+med_name;
				med_text += dic_list.get(i);
				int j= i+1;					while(j< dic_list.size() && !dic_list.get(j).contains("..")) {
					med_text += dic_list.get(j++);
				}
				if(!med_text.contains("中医大辞典")) {
					dic_map.put(med_name.replaceAll("\\s*", "").replace("〔"
						, "").replace("〕", ":"), med_text.replaceAll("\\s*"
						, "").replace("〔", "").replace("〕", ":"));
				}
			}
			if(dic_list.get(i).contains("^^")) {
				String med_name= dic_list.get(i+ 1);
				String med_text= "" + med_name;
				med_text += dic_list.get(i);
				int j= i+ 1;					while(j< dic_list.size() && !dic_list.get(j).contains("^^")&& !dic_list.get(j).contains("^L^Y^G")) {
					med_text += dic_list.get(j++);
				}
				if(!med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":").isEmpty()) {
					if(!med_name.contains("罗瑶光")&&!med_name.contains("秽气奔迫广肠魄门")) {
						if(!med_text.contains("中医大辞典")) {
							dic_map.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), med_text.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
						}
					}
				}
			}

			if(dic_list.get(i).contains("邢公天成")) {
				int j= i;	
				while(++j< dic_list.size()) {
					String[] med_text= dic_list.get(j).toString().split("-->");
					String temp= "";
					int k= 0;
					String med_name= "";
					for(String string: med_text) {
						if(k++== 0) {
							med_name= string;
						}else {
							if(k> 2) {
								temp+= ", ";
							}
							temp+= string;
						}
					}
					if(!temp.contains("中医大辞典")) {
						dic_map.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), temp.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));											}
				}
			}
		}
		return dic_map;
	}
	
	public IMV_SIQ MapToChuFang(List<String> dic_list, IMV_SIQ dic_map) {
		IMV_SIQ dic_chu_fang= new IMV_SIQ();
		for(int i= 0; i < dic_list.size(); i++) {
			if(dic_list.get(i).contains("^")) {
				String med_name= dic_list.get(i);
				if(dic_map.containsKey(med_name)){
					String temp= dic_map.get(med_name).toString();
					String med_text= "";
					for(int j=0; j<temp.length()-2; j++) {
						if(("" + temp.charAt(j)).equals("-")&&(""+temp.charAt(j+1)).equals("-")&&(""+temp.charAt(j+2)).equals("-")) {
							for(int k=j+2; k<temp.length()-2; k++) {
								if(("" + temp.charAt(k)).equals("-")&&(""+temp.charAt(k+1)).equals("-")&&(""+temp.charAt(k+2)).equals("-")) {
									break;
									}
								med_text+=temp.charAt(k);
							}
						}
					}
					dic_chu_fang.put(med_name.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"), med_text.replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"));
				}
			}
		}
		
		Iterator<String> it= dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name= it.next();
			String temp= dic_map.get(name).toString();
			Pattern p= Pattern.compile("处方(.*?)应用"); 
			Pattern p1= Pattern.compile("处方(.*?)$"); 
			Matcher m= p.matcher(temp); 
			Matcher m1= p1.matcher(temp); 
			if (m.find()) {
				dic_chu_fang.put(name, m.group(0));
			}else if (m1.find()) {
				dic_chu_fang.put(name, m1.group(0));
			}
		}
		
		it= dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name= it.next();
			String temp= dic_map.get(name).toString();
			Pattern p= Pattern.compile("处方(.*?)应用"); 
			Pattern p1= Pattern.compile("处方(.*?)$"); 
			Pattern p2= Pattern.compile("组成：(.*?)功用："); 
			Pattern p3= Pattern.compile("组成：(.*?)$："); 
			Matcher m= p.matcher(temp); 
			Matcher m1= p1.matcher(temp); 
			Matcher m2= p2.matcher(temp); 
			Matcher m3= p3.matcher(temp); 
			if (m.find()) {
				dic_chu_fang.put(name, m.group(0));
			}else if (m1.find()) {
				dic_chu_fang.put(name, m1.group(0));
			}else if (m2.find()) {
				dic_chu_fang.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_chu_fang.put(name, m3.group(0));
			}
		}
		return dic_chu_fang;
	}

	public IMV_SIQ MapTomz(List<String> dic_list, IMV_SIQ dic_map) {
		IMV_SIQ dic_mz= new IMV_SIQ();
		Iterator<String> it= dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name= it.next();
			String temp= dic_map.get(name).toString();
			Pattern p= Pattern.compile("脉症(.*?)治法"); 
			Pattern p1= Pattern.compile("脉症(.*?)$"); 
			Matcher m= p.matcher(temp); 
			Matcher m1= p1.matcher(temp); 
			if (m.find()) {
				dic_mz.put(name, m.group(0));
			}else if (m1.find()) {
				dic_mz.put(name, m1.group(0));
			}
		}
		return dic_mz;
	}

	public IMV_SIQ MapTozf(List<String> dic_list, IMV_SIQ dic_map) {
		IMV_SIQ dic_zf= new IMV_SIQ();
		Iterator<String> it= dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name= it.next();
			String temp= dic_map.get(name).toString();
			Pattern p= Pattern.compile("治法(.*?)处方"); 
			Pattern p1= Pattern.compile("治法(.*?)$"); 
			Pattern p2= Pattern.compile("方解：(.*?)使用："); 
			Pattern p3= Pattern.compile("方解：(.*?)$："); 
			Matcher m= p.matcher(temp); 
			Matcher m1= p1.matcher(temp); 
			Matcher m2= p2.matcher(temp); 
			Matcher m3= p3.matcher(temp); 
			if (m.find()) {
				dic_zf.put(name, m.group(0));
			}else if (m1.find()) {
				dic_zf.put(name, m1.group(0));
			}else if (m2.find()) {
				dic_zf.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_zf.put(name, m3.group(0));
			}
		}
		return dic_zf;
	}

	public IMV_SIQ MapToyy(List<String> dic_list, IMV_SIQ dic_map) {
		IMV_SIQ dic_yy= new IMV_SIQ();
		Iterator<String> it= dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name= it.next();
			String temp= dic_map.get(name).toString();
			Pattern p1= Pattern.compile("应用(.*?)$"); 
			Pattern p2= Pattern.compile("主治：(.*?)方解"); 
			Pattern p3= Pattern.compile("主治：(.*?)$"); 
			Matcher m1= p1.matcher(temp); 
			Matcher m2= p2.matcher(temp); 
			Matcher m3= p3.matcher(temp); 
			if (m1.find()) {
				dic_yy.put(name, m1.group(0));
			}else if (m2.find()) {
				dic_yy.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_yy.put(name, m3.group(0));
			}
		}
		return dic_yy;
	}

	public IMV_SIQ_ MapTosy(List<String> dic_list, IMV_SIQ dic_map) {
		IMV_SIQ_ dic_sy= new IMV_SIQ_();
		Iterator<String> it= dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name= it.next();
			String temp= dic_map.get(name).toString();
			Pattern p2= Pattern.compile("使用：(.*?)讨论"); 
			Pattern p3= Pattern.compile("使用：(.*?)$"); 
			Matcher m2= p2.matcher(temp); 
			Matcher m3= p3.matcher(temp); 
			if (m2.find()) {
				dic_sy.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_sy.put(name, m3.group(0));
			}
		}
		return dic_sy;
	}

	public IMV_SIQ MapTotl(List<String> dic_list, IMV_SIQ dic_map) {
		IMV_SIQ dic_tl= new IMV_SIQ();
		Iterator<String> it= dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name= it.next();
			String temp= dic_map.get(name).toString();
			Pattern p2= Pattern.compile("讨论：(.*?)附方"); 
			Pattern p3= Pattern.compile("讨论：(.*?)$"); 
			Matcher m2= p2.matcher(temp); 
			Matcher m3= p3.matcher(temp); 
			if (m2.find()) {
				dic_tl.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_tl.put(name, m3.group(0));
			}
		}
		return dic_tl;
	}

	public IMV_SIQ MapToff(List<String> dic_list, IMV_SIQ dic_map) {
		IMV_SIQ dic_ff= new IMV_SIQ();
		Iterator<String> it= dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name= it.next();
			String temp= dic_map.get(name).toString();
			Pattern p2= Pattern.compile("附方：(.*?)方歌"); 
			Pattern p3= Pattern.compile("附方：(.*?)$"); 
			Matcher m2= p2.matcher(temp); 
			Matcher m3= p3.matcher(temp); 
			if (m2.find()) {
				dic_ff.put(name, m2.group(0));
			}else if (m3.find()) {
				dic_ff.put(name, m3.group(0));
			}
		}
		return dic_ff;
	}

	public IMV_SIQ MapTofg(List<String> dic_list, IMV_SIQ dic_map) {
		IMV_SIQ dic_fg= new IMV_SIQ();
		Iterator<String> it= dic_map.keySet().iterator();
		while(it.hasNext()) {
			String name= it.next();
			String temp= dic_map.get(name).toString();
			Pattern p3= Pattern.compile("方歌：(.*?)$"); 
			Matcher m3= p3.matcher(temp); 
			if (m3.find()) {
				dic_fg.put(name, m3.group(0));
			}
		}
		return dic_fg;
	}	
}
