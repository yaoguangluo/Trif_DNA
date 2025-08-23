package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addHLSBook;

import exception.file.O.DetaBufferedReader;
import exception.file.O.DetaInputStreamReader;
import S_A.pheromone.IMV_SIQ_;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class dictionary{	
	public List<String> dic_list;
	public Map<String, String> dic_map;
	public List<String> txtToListName() {
		List<String> temp_list= new ArrayList<>();
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed1.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed2.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed3.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed4.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed5.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed6.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed7.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed8.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed9.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed10.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed11.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed12.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed13.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed14.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed15.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed16.txt");
		temp_list.add("HarrisonsPrinciplesofInternalMedicine-18ed17.txt");
		
		return temp_list;
	}
	
	public IMV_SIQ_ listNameToMap(IMV_SIQ_ dic_map, List<String> dic_list) {
		//Map<String, String> dic_map= new ConcurrentHashMap<String, String>();
		for(int i= 0; i < dic_list.size(); i++) {
			String para= "";
			String name= dic_list.get(i).toString();
			InputStream in= this.getClass().getResourceAsStream(name);
			DetaBufferedReader cReader;
			cReader= new DetaBufferedReader(DetaInputStreamReader.E(in, "UTF8"));
			String ctempString= null; 
			int index= 0;
			while ((ctempString= cReader.readDetaLine()) != null) {  
				if(!ctempString.replace(" ", "").equals("")) {
					para += " "+ctempString;
					if(ctempString.contains("^^")) {
						dic_map.put(name+(index++)+para.substring(0, 30), para.replace("\\s+", " ").toLowerCase());
						para="";
					}
				}
			}
			cReader.closeDeta();
		}
		return dic_map;
	}
}
