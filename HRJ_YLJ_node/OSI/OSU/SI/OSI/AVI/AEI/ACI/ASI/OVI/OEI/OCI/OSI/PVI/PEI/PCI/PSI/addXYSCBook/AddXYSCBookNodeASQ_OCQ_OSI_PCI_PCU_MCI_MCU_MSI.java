package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXYSCBook;
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

public class AddXYSCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI{	
	public AddXYSCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西药手册");
		AMV_MVS_VSQ= new String("MEDCINE");
		Image img= ((ImageIcon) thisIcon).getImage();
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
		//
	}
	
	public AddXYSCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App_S u
			, CogsBinaryForest_AE _A, IMV_SIQ pos) {
		this.text= text;
		this.tableData_old= tableData_old;
		thisIcon= FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
		_SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS= new String("添加西药手册");
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
		_SQ__OVQ_OSQ_VSQ= new AddXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
		_SQ__OPE_OPC_ECI= new AddXYSCBookOSU_MSQ_OPE_OPC_ECI();
		_SQ__AOU_AOQ_VES= new AddXYSCBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddXYSCBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, this.text, this.tableData_old);
		_SQ__AOU_AOQ_VES.config();
		showed= false;
	}
	public void IMP_PSU(App NE){
		dictionary d= new dictionary();
		u.xyscPage.dic_yao_ming= new IMV_SIQ();
		u.xyscPage.dic_chengfen_danwei= new IMV_SIQ();
		u.xyscPage.dic_yong_fa= new IMV_SIQ();
		u.xyscPage.dic_yong_liang= new IMV_SIQ();
		u.xyscPage.dic_yao_li= new IMV_SIQ();
		u.xyscPage.dic_zhu_yi= new IMV_SIQ();
		u.xyscPage.dic_shi_ying= new IMV_SIQ();
		u.xyscPage.dic_jie_shao= new IMV_SIQ();
		u.xyscPage.dic_bu_liang_fan_ying= new IMV_SIQ();
		u.xyscPage.dic_yao_wu_xiang_hu_zuo_yong= new IMV_SIQ();
		u.xyscPage.dic_qi_ta= new IMV_SIQ();
		d.txtToMap(u.xyscPage.dic_yao_ming, u.xyscPage.dic_chengfen_danwei, u.xyscPage.dic_yong_fa
				, u.xyscPage.dic_yao_li, u.xyscPage.dic_zhu_yi, u.xyscPage.dic_shi_ying
				, u.xyscPage.dic_bu_liang_fan_ying, u.xyscPage.dic_yao_wu_xiang_hu_zuo_yong
				, u.xyscPage.dic_qi_ta, u.xyscPage.dic_yong_liang, u.xyscPage.dic_jie_shao);
		Iterator<String> iter= u.xyscPage.dic_yao_ming.keySet().iterator();
		u.xyscPage.copy= new ArrayList<>();
		while(iter.hasNext()) {
			u.xyscPage.copy.add(iter.next());	
		}
		tableData_old= new Object[u.xyscPage.dic_yao_ming.size()][18];
		for(int i= 0; i< u.xyscPage.copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1),
					""+0,
					u.xyscPage.copy.get(i).trim(),
					u.xyscPage.dic_jie_shao.get(u.xyscPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.xyscPage.dic_yao_li.get(u.xyscPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.xyscPage.dic_chengfen_danwei.get(u.xyscPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.xyscPage.dic_yong_fa.get(u.xyscPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.xyscPage.dic_zhu_yi.get(u.xyscPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.xyscPage.dic_shi_ying.get(u.xyscPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.xyscPage.dic_bu_liang_fan_ying.get(u.xyscPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.xyscPage.dic_yong_liang.get(u.xyscPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.xyscPage.dic_yao_wu_xiang_hu_zuo_yong.get(u.xyscPage.copy.get(i)).toString()
.replaceAll("\\s*", ""),
					u.xyscPage.dic_qi_ta.get(u.xyscPage.copy.get(i)).toString()
.replaceAll("\\s*", "")
			};
		}	
		u.xyscPage.newTableModel.getDataVector().clear();
		for(int i= 0; i< tableData_old.length; i++) {
			u.xyscPage.newTableModel.insertRow(i, tableData_old[i]);
		}
		u.xyscPage.tableData_old= tableData_old;
		u.xyscPage.newTableModel.fireTableDataChanged();
		u.xyscPage.revalidate();
	}
	
	public void OPE_E(JTextPane jTextPane) {	
		((AddXYSCBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((AddXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
	}
	public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
		((AddXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A= _A;
		((AddXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u= u;
		((AddXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos= pos;
		((AddXYSCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext= ((AddXYSCBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
		_SQ__OVQ_OSQ_VSQ.view(NE);
		showed= true;
	}
	public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
		_SQ_OSU_MSQ_OSU_MCI_MCU_MSI= new AddXYSCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);
		return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;  
	}
}
