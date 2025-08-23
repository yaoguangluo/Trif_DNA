package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYZDBook;

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

public class AddZYZDBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI {
    public AddZYZDBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("添加中医诊断");
        AMV_MVS_VSQ = new String("MEDCINE");
        Image img = ((ImageIcon) thisIcon).getImage();
        Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        thisIcon = new ImageIcon(newimg);
        //
    }

    public AddZYZDBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old
        , JTextPane text, App_S u, CogsBinaryForest_AE _A, IMV_SIQ pos) {
        this.text = text;
        this.tableData_old = tableData_old;
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
            , "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("添加中医诊断");
        AMV_MVS_VSQ = new String("MEDCINE");
        Image img = ((ImageIcon) thisIcon).getImage();
        Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        thisIcon = new ImageIcon(newimg);
        //
        this.u = u;
        this._A = _A;
        this.pos = pos;
    }

    public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
        _SQ__OVQ_OSQ_VSQ = new AddZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
        _SQ__OPE_OPC_ECI = new AddZYZDBookOSU_MSQ_OPE_OPC_ECI();
        _SQ__AOU_AOQ_VES = new AddZYZDBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddZYZDBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, this.text, this.tableData_old);
        _SQ__AOU_AOQ_VES.config();
        showed = false;
    }

    public void IMP_PSU(App NE){
        dictionary d = new dictionary();
        u.zyzdxPage.dic_list = d.txtToList();
        u.zyzdxPage.dic_map = d.listToMap(u.zyzdxPage.dic_map, u.zyzdxPage.dic_list);
        u.zyzdxPage.dic_gn = d.mapToMap_gn(u.zyzdxPage.dic_map);
        u.zyzdxPage.dic_lcbx = d.mapToMap_lcbx(u.zyzdxPage.dic_map);
        u.zyzdxPage.dic_lcyy = d.mapToMap_lcyy(u.zyzdxPage.dic_map);
        u.zyzdxPage.dic_zhfx = d.mapToMap_zhfx(u.zyzdxPage.dic_map);
        u.zyzdxPage.dic_zhjb = d.mapToMap_zhjb(u.zyzdxPage.dic_map);
        tableData_old = new Object[u.zyzdxPage.dic_map.size()][9];
        Iterator<String> iter = u.zyzdxPage.dic_map.keySet().iterator();
        u.zyzdxPage.copy = new ArrayList<String>();
        while (iter.hasNext())
            u.zyzdxPage.copy.add(iter.next());
        for (int i = 0; i < u.zyzdxPage.copy.size(); i++) {
            tableData_old[i] = new Object[]{"" + (i + 1), "" + 0, u.zyzdxPage.copy.get(i).trim().replace("〔", "").replace("〕", ":"),
                u.zyzdxPage.dic_map.get(u.zyzdxPage.copy.get(i)).toString()
                    .replaceAll("\\s*", "").replace("〔", "").replace("〕", ":"),
                u.zyzdxPage.dic_gn.get(u.zyzdxPage.copy.get(i)).toString(),
                u.zyzdxPage.dic_lcbx.get(u.zyzdxPage.copy.get(i)).toString(),
                u.zyzdxPage.dic_zhfx.get(u.zyzdxPage.copy.get(i)).toString(),
                u.zyzdxPage.dic_lcyy.get(u.zyzdxPage.copy.get(i)).toString(),
                u.zyzdxPage.dic_zhjb.get(u.zyzdxPage.copy.get(i)).toString()};
        }

        u.zyzdxPage.newTableModel.getDataVector().clear();
        for (int i = 0; i < tableData_old.length; i++) {
            u.zyzdxPage.newTableModel.insertRow(i, tableData_old[i]);
        }
        u.zyzdxPage.tableData_old = tableData_old;
        u.zyzdxPage.newTableModel.fireTableDataChanged();
        u.zyzdxPage.revalidate();
    }

    public void OPE_E(JTextPane jTextPane) {
        ((AddZYZDBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((AddZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
    }

    public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE) {
        ((AddZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A = _A;
        ((AddZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u = u;
        ((AddZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos = pos;
        ((AddZYZDBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext = ((AddZYZDBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
        _SQ__OVQ_OSQ_VSQ.view(NE);
        showed = true;
    }

    public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
        _SQ_OSU_MSQ_OSU_MCI_MCU_MSI = new AddZYZDBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);
        return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;
    }
}
