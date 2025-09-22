package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYJZBook;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;
import S_A.pheromone.IMV_SIQ;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;

public class AddXYJZBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI{	
	public AddXYJZBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医急诊");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public AddXYJZBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App_S u
			, CogsBinaryForest_AE _A, IMV_SIQ pos) {
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西医急诊");
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
		_SQ__OVQ_OSQ_VSQ= new AddXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI= new AddXYJZBookOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES= new AddXYJZBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddXYJZBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, this.text, this.tableData_old);
		_SQ__AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU(App NE){
		dictionary d= new dictionary();
		u.jzkxPage.dic_list= d.txtToList();
		u.jzkxPage.dic_map= d.listToMap(u.jzkxPage.dic_map, u.jzkxPage.dic_list);
		u.jzkxPage.dic_gn= d.mapToMap_gn(u.jzkxPage.dic_map);
		u.jzkxPage.dic_lx= d.mapToMap_lx(u.jzkxPage.dic_map);
		u.jzkxPage.dic_by= d.mapToMap_by(u.jzkxPage.dic_map);
		u.jzkxPage.dic_wx= d.mapToMap_wx(u.jzkxPage.dic_map);
		u.jzkxPage.dic_bl= d.mapToMap_bl(u.jzkxPage.dic_map);
		u.jzkxPage.dic_lc= d.mapToMap_lc(u.jzkxPage.dic_map);
		u.jzkxPage.dic_sy= d.mapToMap_sy(u.jzkxPage.dic_map);
		u.jzkxPage.dic_zd= d.mapToMap_zd(u.jzkxPage.dic_map);
		u.jzkxPage.dic_bf= d.mapToMap_bf(u.jzkxPage.dic_map);
		u.jzkxPage.dic_zl= d.mapToMap_zl(u.jzkxPage.dic_map);
		u.jzkxPage.dic_jy= d.mapToMap_jy(u.jzkxPage.dic_map);
		u.jzkxPage.dic_yh= d.mapToMap_yh(u.jzkxPage.dic_map);
		u.jzkxPage.dic_yf= d.mapToMap_yf(u.jzkxPage.dic_map);
		u.jzkxPage.dic_yx= d.mapToMap_yx(u.jzkxPage.dic_map);
		tableData_old= new Object[u.jzkxPage.dic_map.size()][18];
		Iterator<String> iter= u.jzkxPage.dic_map.keySet().iterator();
		u.jzkxPage.copy= new ArrayList<String>();
		while (iter.hasNext())
			u.jzkxPage.copy.add(iter.next());
		for(int i= 0; i< u.jzkxPage.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1), ""+0, u.jzkxPage.copy.get(i).replace("〔〔〔", "〔").trim(),
					u.jzkxPage.dic_map.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", "").replace("〔〔〔", "〔"),
					u.jzkxPage.dic_gn.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_lx.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_by.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_wx.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_bl.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_lc.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_sy.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_zd.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_bf.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_zl.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_jy.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_yh.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_yf.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.jzkxPage.dic_yx.get(u.jzkxPage.copy.get(i)).toString()
.replaceAll("\\s*", "")
			};
		}	
		u.jzkxPage.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.jzkxPage.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.jzkxPage.tableData_old= tableData_old;
		u.jzkxPage.newTableModel.fireTableDataChanged();
		u.jzkxPage.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) {	
		((AddXYJZBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((AddXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		((AddXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A= _A;
		((AddXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u= u;
		((AddXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos= pos;
		((AddXYJZBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext= ((AddXYJZBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed= true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI= new AddXYJZBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old
				, this.text, this.u, this._A, this.pos);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
