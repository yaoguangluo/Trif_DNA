package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYWSBook;

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

public class AddZYWSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI{	
	public AddZYWSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医外伤");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public AddZYWSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App_S u
			, CogsBinaryForest_AE _A, IMV_SIQ pos) {
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加中医外伤");
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
		_SQ__OVQ_OSQ_VSQ= new AddZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI= new AddZYWSBookOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES= new AddZYWSBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddZYWSBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, this.text, this.tableData_old);
		_SQ__AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU(App NE){
		dictionary d=new dictionary();
		u.wskxPage.dic_list=d.txtToList();
		u.wskxPage.dic_map= d.listToMap(u.wskxPage.dic_map, u.wskxPage.dic_list);
		u.wskxPage.dic_gn= d.mapToMap_gn(u.wskxPage.dic_map);
		u.wskxPage.dic_lx= d.mapToMap_lx(u.wskxPage.dic_map);
		u.wskxPage.dic_by= d.mapToMap_by(u.wskxPage.dic_map);
		u.wskxPage.dic_wx= d.mapToMap_wx(u.wskxPage.dic_map);
		u.wskxPage.dic_bl= d.mapToMap_bl(u.wskxPage.dic_map);
		u.wskxPage.dic_lc= d.mapToMap_lc(u.wskxPage.dic_map);
		u.wskxPage.dic_sy= d.mapToMap_sy(u.wskxPage.dic_map);
		u.wskxPage.dic_zd= d.mapToMap_zd(u.wskxPage.dic_map);
		u.wskxPage.dic_bf= d.mapToMap_bf(u.wskxPage.dic_map);
		u.wskxPage.dic_zl= d.mapToMap_zl(u.wskxPage.dic_map);
		u.wskxPage.dic_jy= d.mapToMap_jy(u.wskxPage.dic_map);
		u.wskxPage.dic_yh= d.mapToMap_yh(u.wskxPage.dic_map);
		u.wskxPage.dic_yf= d.mapToMap_yf(u.wskxPage.dic_map);
		u.wskxPage.dic_yx= d.mapToMap_yx(u.wskxPage.dic_map);
		tableData_old= new Object[u.wskxPage.dic_map.size()][18];
		Iterator<String> iter= u.wskxPage.dic_map.keySet().iterator();
		u.wskxPage.copy= new ArrayList<String>();
		while (iter.hasNext())
			u.wskxPage.copy.add(iter.next());
		for(int i= 0;i< u.wskxPage.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1), ""+0, u.wskxPage.copy.get(i).trim().replace("〔〔〔", "〔") ,
					u.wskxPage.dic_map.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", "").replace("〔〔〔", "〔"),
					u.wskxPage.dic_gn.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_lx.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_by.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_wx.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_bl.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_lc.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_sy.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_zd.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_bf.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_zl.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_jy.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_yh.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_yf.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.wskxPage.dic_yx.get(u.wskxPage.copy.get(i)).toString()
.replaceAll("\\s*", "")};
		}	
		u.wskxPage.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.wskxPage.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.wskxPage.tableData_old= tableData_old;
		u.wskxPage.newTableModel.fireTableDataChanged();
		u.wskxPage.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) {	
		((AddZYWSBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((AddZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		((AddZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A= _A;
		((AddZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u= u;
		((AddZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos= pos;
		((AddZYWSBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext= ((AddZYWSBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed= true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI= new AddZYWSBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
