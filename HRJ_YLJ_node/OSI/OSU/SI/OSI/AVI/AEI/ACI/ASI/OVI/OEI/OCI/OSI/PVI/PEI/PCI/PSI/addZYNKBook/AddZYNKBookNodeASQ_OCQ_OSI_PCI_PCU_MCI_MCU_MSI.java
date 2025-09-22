package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYNKBook;
import ME.VPC.S.ne.App_S;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;

public class AddZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI{	
	public AddZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医内科方剂");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public AddZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App_S u
			, CogsBinaryForest_AE _A, IMV_SIQ pos) {
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医内科方剂");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
		this.u= u;
		this._A= _A;
		this.pos= pos;
	}
	public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
		_SQ__OVQ_OSQ_VSQ= new AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI= new AddZYNKBookOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES= new AddZYNKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddZYNKBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, this.text, this.tableData_old);
		_SQ__AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU(App NE){
		dictionary d=new dictionary();
		u.zynkxPage.dic_list=d.txtToList();
		u.zynkxPage.dic_map= d.listToMap(u.zynkxPage.dic_map, u.zynkxPage.dic_list);
		u.zynkxPage.dic_chu_fang= d.MapToChuFang(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_mz= d.MapTomz(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_zf= d.MapTozf(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_yy= d.MapToyy(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		
		u.zynkxPage.dic_sy= d.MapTosy(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_tl= d.MapTotl(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_ff= d.MapToff(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		u.zynkxPage.dic_fg= d.MapTofg(u.zynkxPage.dic_list, u.zynkxPage.dic_map);
		
		tableData_old= new Object[u.zynkxPage.dic_map.size()][12];
		Iterator<String> iter= u.zynkxPage.dic_map.keySet().iterator();
		u.zynkxPage.copy= new ArrayList<String>();
		while (iter.hasNext())
			u.zynkxPage.copy.add(iter.next());
		for(int i= 0;i< u.zynkxPage.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1),
					"" + 0, u.zynkxPage.copy.get(i).trim().replace("^", " "),
					u.zynkxPage.dic_map.get(u.zynkxPage.copy.get(i)).toString()
.replaceAll("\\s*", "").replace("^", " "),
					u.zynkxPage.dic_chu_fang.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_chu_fang.get(u.zynkxPage.copy.get(i)).toString()
.replace("-", " "):"",
					u.zynkxPage.dic_mz.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_mz.get(u.zynkxPage.copy.get(i)).toString()
.replace("-", " "):"",
					u.zynkxPage.dic_zf.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_zf.get(u.zynkxPage.copy.get(i)).toString()
.replace("-", " "):"",
					u.zynkxPage.dic_yy.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_yy.get(u.zynkxPage.copy.get(i)).toString()
.replace("-", " "):"",
					u.zynkxPage.dic_sy.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_sy.get(u.zynkxPage.copy.get(i)).toString()
.replace("-", " "):"",
					u.zynkxPage.dic_tl.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_tl.get(u.zynkxPage.copy.get(i)).toString()
.replace("-", " "):"",
					u.zynkxPage.dic_ff.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_ff.get(u.zynkxPage.copy.get(i)).toString()
.replace("-", " "):"",
					u.zynkxPage.dic_fg.containsKey(u.zynkxPage.copy.get(i))?u.zynkxPage.dic_fg.get(u.zynkxPage.copy.get(i)).toString()
.replace("-", " "):""
			};
		}	
		u.zynkxPage.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.zynkxPage.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.zynkxPage.tableData_old= tableData_old;
		u.zynkxPage.newTableModel.fireTableDataChanged();
		u.zynkxPage.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) {	
		((AddZYNKBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		((AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A= _A;
		((AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u= u;
		((AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos= pos;
		((AddZYNKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext= ((AddZYNKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed= true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI= new AddZYNKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
