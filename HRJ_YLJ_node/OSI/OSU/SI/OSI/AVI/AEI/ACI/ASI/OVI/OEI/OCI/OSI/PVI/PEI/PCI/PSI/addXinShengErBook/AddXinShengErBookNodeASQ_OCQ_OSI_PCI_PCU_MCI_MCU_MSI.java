package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXinShengErBook;
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

public class AddXinShengErBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI{	
	public AddXinShengErBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加新生儿科");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public AddXinShengErBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App_S u
			, CogsBinaryForest_AE _A, IMV_SIQ pos) {
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加新生儿科");
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
		_SQ__OVQ_OSQ_VSQ= new AddXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI= new AddXinShengErBookOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES= new AddXinShengErBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddXinShengErBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, this.text, this.tableData_old);
		_SQ__AOU_AOQ_VES.config();
		showed= false;
	}
	public void OPE_E(JTextPane jTextPane) {	
		dictionary d= new dictionary();
		u.fckxPage.dic_list= d.txtToList();
		u.fckxPage.dic_map= d.listToMap(u.fckxPage.dic_map, u.fckxPage.dic_list);
		u.fckxPage.dic_gn= d.mapToMap_gn(u.fckxPage.dic_map);
		u.fckxPage.dic_lx= d.mapToMap_lx(u.fckxPage.dic_map);
		u.fckxPage.dic_by= d.mapToMap_by(u.fckxPage.dic_map);
		u.fckxPage.dic_wx= d.mapToMap_wx(u.fckxPage.dic_map);
		u.fckxPage.dic_bl= d.mapToMap_bl(u.fckxPage.dic_map);
		u.fckxPage.dic_lc= d.mapToMap_lc(u.fckxPage.dic_map);
		u.fckxPage.dic_sy= d.mapToMap_sy(u.fckxPage.dic_map);
		u.fckxPage.dic_zd= d.mapToMap_zd(u.fckxPage.dic_map);
		u.fckxPage.dic_bf= d.mapToMap_bf(u.fckxPage.dic_map);
		u.fckxPage.dic_zl= d.mapToMap_zl(u.fckxPage.dic_map);
		u.fckxPage.dic_jy= d.mapToMap_jy(u.fckxPage.dic_map);
		u.fckxPage.dic_yh= d.mapToMap_yh(u.fckxPage.dic_map);
		u.fckxPage.dic_yf= d.mapToMap_yf(u.fckxPage.dic_map);
		u.fckxPage.dic_yx= d.mapToMap_yx(u.fckxPage.dic_map);
		Iterator<String> iter= u.fckxPage.dic_map.keySet().iterator();
		u.fckxPage.copy= new ArrayList<String>();
		while (iter.hasNext()) {
			u.fckxPage.copy.add(iter.next());	
		}
		tableData_old= new Object[u.fckxPage.copy.size()][18];
		for(int i=0;i<u.fckxPage.copy.size();i++) {
			tableData_old[i]= new Object[]{""+(i+1), ""+0, u.fckxPage.copy.get(i).replaceAll("〔+", "〔").trim(),
					u.fckxPage.dic_map.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", "").replaceAll("〔+", "〔"),
					u.fckxPage.dic_gn.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_lx.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_by.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_wx.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_bl.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_lc.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_sy.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_zd.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_bf.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_zl.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_jy.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_yh.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_yf.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.fckxPage.dic_yx.get(u.fckxPage.copy.get(i)).toString()
.replaceAll("\\s*", "")
			};
		}	
		u.fckxPage.newTableModel.getDataVector().clear();
		for(int i=0;i<tableData_old.length;i++) {
			u.fckxPage.newTableModel.insertRow(i, tableData_old[i]);
		}	
		u.fckxPage.newTableModel.fireTableDataChanged();
		u.fckxPage.revalidate();
		((AddXinShengErBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((AddXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		((AddXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A= _A;
		((AddXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u= u;
		((AddXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos= pos;
		((AddXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext= ((AddXinShengErBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed= true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI= new AddXinShengErBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
