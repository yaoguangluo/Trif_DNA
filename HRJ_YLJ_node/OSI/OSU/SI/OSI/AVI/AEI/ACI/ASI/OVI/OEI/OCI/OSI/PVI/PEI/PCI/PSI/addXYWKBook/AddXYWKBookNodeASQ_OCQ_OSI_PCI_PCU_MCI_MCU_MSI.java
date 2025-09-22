package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYWKBook;
import ME.VPC.S.ne.App_S;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import S_A.SVQ.stable.S_Common;
import S_A.pheromone.IMV_SIQ;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;

public class AddXYWKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI{	
	public AddXYWKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医外科");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public AddXYWKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App_S u
			, CogsBinaryForest_AE _A, IMV_SIQ pos) {
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医外科");
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
		_SQ__OVQ_OSQ_VSQ= new AddXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI= new AddXYWKBookOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES= new AddXYWKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddXYWKBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, this.text, this.tableData_old);
		_SQ__AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU(App NE){
		dictionary d= new dictionary();
		u.wkxPage.dic_list= d.txtToList();
		u.wkxPage.dic_map= d.listToMap(u.wkxPage.dic_map, u.wkxPage.dic_list);
		u.wkxPage.dic_xj= d.mapToMap_xj(u.wkxPage.dic_map);
		Iterator<String> iter= u.wkxPage.dic_xj.keySet().iterator();
		u.wkxPage.copy_xj= new ArrayList<String>();
		while (iter.hasNext()) {
			u.wkxPage.copy_xj.add(iter.next());
		}
		tableData_old= new Object[u.wkxPage.dic_xj.size()][18];
		for(int i= 0; i< u.wkxPage.dic_xj.size(); i++) {
			tableData_old[i]= new Object[]{""+ (i+ 1)
					, S_Common.STRING_EMPTY+ 0
					, u.wkxPage.copy_xj.get(i).trim()
					, u.wkxPage.dic_xj.get(u.wkxPage.copy_xj.get(i)).toString()
.replaceAll("\\s*", "")
			};
		}	
		u.wkxPage.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.wkxPage.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.wkxPage.tableData_old= tableData_old;
		u.wkxPage.newTableModel.fireTableDataChanged();
		u.wkxPage.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) {	
		((AddXYWKBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((AddXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		((AddXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A= _A;
		((AddXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u= u;
		((AddXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos= pos;
		((AddXYWKBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext= ((AddXYWKBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed= true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI= new AddXYWKBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
