package OSI.OSU.SI.OVI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addZNSZPage;

import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.App_S;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;
import S_A.pheromone.IMV_SIQ;
import exception.thread.DetaThread;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Container;
import java.awt.Image;

public class AddZNSZPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI {
    public AddZNSZPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
            , "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("添加智能声诊断页");
        AMV_MVS_VSQ = new String("MEDCINE");
        Image img = ((ImageIcon) thisIcon).getImage();
        Image newimg = img.getScaledInstance(30, 30
            , java.awt.Image.SCALE_SMOOTH);
        thisImage = img.getScaledInstance(30, 30
            , java.awt.Image.SCALE_SMOOTH);
        thisIcon = new ImageIcon(newimg);
        //
    }

    public AddZNSZPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old
        , JTextPane text, App_S u, CogsBinaryForest_AE _A, IMV_SIQ pos) {
        this.text = text;
        this.tableData_old = tableData_old;
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
            , "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("添加智能声诊断页");
        AMV_MVS_VSQ = new String("MEDCINE");
        Image img = ((ImageIcon) thisIcon).getImage();
        Image newimg = img.getScaledInstance(30, 30
            , java.awt.Image.SCALE_SMOOTH);
        thisImage = img.getScaledInstance(30, 30
            , java.awt.Image.SCALE_SMOOTH);
        thisIcon = new ImageIcon(newimg);
        //
        this.u = u;
        this._A = _A;
        this.pos = pos;
    }

    public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
        _SQ__OVQ_OSQ_VSQ = new AddZNSZPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
        _SQ__OPE_OPC_ECI = new AddZNSZPageOSU_MSQ_OPE_OPC_ECI();
        _SQ__AOU_AOQ_VES = new AddZNSZPageOSU_MSQ_AOI_AOD_AOU_AOQ_VES(
            (AddZNSZPageOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, this.text
            , this.tableData_old);
        _SQ__AOU_AOQ_VES.config();
        showed = false;
    }

    public void IMP_PSU(App NE) {
        Container jpanelFourth = new Container();
        NE._I_U.makeContainerZNSZ = new S_A.pheromone.MSI_EVD_SVX_TVS_DAH(_A, jpanelFourth
            , u, u.jTabbedpane, u.tabNames, pos, _A.getPosEnToEn()
            , _A.getPosEnToCn(), _A.getCnToEn(), NE);
        NE._I_U.makeContainerZNSZ.start();
        DetaThread.sleepDeta(2000);
        u.jTabbedpane.validate();
    }

    public void OPE_E(JTextPane jTextPane) {
        ((AddZNSZPageOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run((AddZNSZPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ);
    }

    public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE) {
        ((AddZNSZPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ)._A = _A;
        ((AddZNSZPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).u = u;
        ((AddZNSZPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).pos = pos;
        ((AddZNSZPageOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ).DNNtext = ((AddZNSZPageOSU_MSQ_AOI_AOD_AOU_AOQ_VES) _SQ__AOU_AOQ_VES).DNNtext;
        _SQ__OVQ_OSQ_VSQ.view(NE);
        showed = true;
    }

    public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
        _SQ_OSU_MSQ_OSU_MCI_MCU_MSI = new AddZNSZPageNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text, this.u, this._A, this.pos);
        return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;
    }
}
