package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZYBCBook;
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

public class AddZYBCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI {
    public AddZYBCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("添加中药本草");
        AMV_MVS_VSQ = new String("MEDCINE");
        Image img = ((ImageIcon) thisIcon).getImage();
        Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        thisIcon = new ImageIcon(newimg);
        //
    }

    public AddZYBCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text, App_S u
            , CogsBinaryForest_AE _A, IMV_SIQ pos) {
        this.text = text;
        this.tableData_old = tableData_old;
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("添加中药本草");
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
        _SQ__OVQ_OSQ_VSQ = new AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
        _SQ__OPE_OPC_ECI = new AddZYBCBookOSU_MSQ_OPE_OPC_ECI();
        _SQ__AOU_AOQ_VES = new AddZYBCBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES((AddZYBCBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, this.text, this.tableData_old);
        _SQ__AOU_AOQ_VES.config();
        showed = false;
    }

    public void IMP_PSU(App NE){
        dictionary d = new dictionary();
        u.dic_list = d.txtToList();
        u.dic_map = d.listToMap(u.dic_map, u.dic_list);
        u.dic_index = d.mapToIndex(u.dic_map);
        u.dic_yw = d.mapToMap_yw(u.dic_map);
        u.dic_li = d.mapToMap_li(u.dic_map);
        u.dic_hai = d.mapToMap_hai(u.dic_map);
        u.dic_xz = d.mapToMap_xz(u.dic_map);
        u.dic_ya = d.mapToMap_ya(u.dic_map);
        u.dic_jm = d.mapToMap_jm(u.dic_map);
        u.dic_xw = d.mapToMap_xw(u.dic_map);
        u.dic_cy = d.mapToMap_cy(u.dic_map);
        u.dic_jj = d.mapToMap_jj(u.dic_map);
        u.dic_zf = d.mapToMap_zf(u.dic_map);
        u.dic_cj = d.mapToMap_cj(u.dic_map);
        u.dic_yl = d.mapToMap_yl(u.dic_map, u.dic_xw, u.dic_li, u.dic_xz, u.dic_jm);

        Iterator<String> iter = u.dic_map.keySet().iterator();
        u.copy = new ArrayList<String>();
        while (iter.hasNext()) {
            u.copy.add(iter.next());
        }
        tableData_old = new Object[u.copy.size()][18];
        for (int i = 0; i < u.copy.size(); i++) {
            tableData_old[i] = new Object[]{
                    (u.dic_index.get(u.copy.get(i)) == null ? "" : u.dic_index.get(u.copy.get(i)).toString()
                            .replaceAll("\\s*", "")),
                    //u.dic_index.get(u.copy.get(i)).toString()
                    //.replaceAll("\\s*", ""),
                    "" + 0, u.copy.get(i).trim(),
//					u.dic_yw.get(u.copy.get(i)).toString()
//.replaceAll("\\s*", ""),
//					u.dic_li.get(u.copy.get(i)).toString()
//.replaceAll("\\s*", ""),
                    (u.dic_yw.get(u.copy.get(i)) == null ? "" : u.dic_yw.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", ""),
                    (u.dic_li.get(u.copy.get(i)) == null ? "" : u.dic_li.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", ""),
                    (u.dic_hai.get(u.copy.get(i)) == null ? "详情参考笔记原文列" : u.dic_hai.get(u.copy.get(i))
                            .toString()
                            .replaceAll("\\s*", "").equalsIgnoreCase("")
                            ? "详情参考笔记原文列" : u.dic_hai.get(u.copy.get(i)).toString()
                            .replaceAll("\\s*", "")),
                    (u.dic_yl.get(u.copy.get(i)) == null ? "" : u.dic_yl.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", ""),
                    (u.dic_xw.get(u.copy.get(i)) == null ? "" : u.dic_xw.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", ""),
                    (u.dic_jm.get(u.copy.get(i)) == null ? "" : u.dic_jm.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", ""),
//					u.dic_xw.get(u.copy.get(i)).toString()
//.replaceAll("\\s*", "") ,
//					u.dic_jm.get(u.copy.get(i)).toString()
//.replaceAll("\\s*", "") ,
                    (u.dic_xz.get(u.copy.get(i)) == null ? "" : u.dic_xz.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", ""),
                    (u.dic_jj.get(u.copy.get(i)) == null ? "" : u.dic_jj.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", ""),
                    (u.dic_cy.get(u.copy.get(i)) == null ? "" : u.dic_cy.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", ""),
                    (u.dic_ya.get(u.copy.get(i)) == null ? "" : u.dic_ya.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", ""),
                    (u.dic_zf.get(u.copy.get(i)) == null ? "" : u.dic_zf.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", ""),
                    (u.dic_cj.get(u.copy.get(i)) == null ? "" : u.dic_cj.get(u.copy.get(i))).toString()
                            .replaceAll("\\s*", "")};
        }
        ;
        u.newTableModel.getDataVector().clear();
        for (int i = 0; i < tableData_old.length; i++) {
            u.newTableModel.insertRow(i, tableData_old[i]);
        }
        u.tableData_old = tableData_old;
        u.newTableModel.fireTableDataChanged();
        NE.revalidate();
    }

    public void OPE_E(JTextPane jTextPane) {
        ((AddZYBCBookOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
    }

    public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE) {
        ((AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A = _A;
        ((AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u = u;
        ((AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos = pos;
        ((AddZYBCBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext = ((AddZYBCBookOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
        _SQ__OVQ_OSQ_VSQ.view(NE);
        showed = true;
    }

    public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
        _SQ_OSU_MSQ_OSU_MCI_MCU_MSI = new AddZYBCBookNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);
        return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;
    }
}
