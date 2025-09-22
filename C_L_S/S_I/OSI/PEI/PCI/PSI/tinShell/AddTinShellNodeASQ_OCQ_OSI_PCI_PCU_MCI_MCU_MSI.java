package S_I.OSI.PEI.PCI.PSI.tinShell;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Image;
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */

public class AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI extends OSU_MCI_MCU_MSI {
    //public AddTinShellRun addTinShellRun;//拿出来pipe line 迭代用。
    public AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text) {
        this.text = text;
        this.tableData_old = tableData_old;
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("Tin语shell脚本");
        AMV_MVS_VSQ = new String("MEDCINE");
        Image img = ((ImageIcon) thisIcon).getImage();
        Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        thisIcon = new ImageIcon(newimg);
    }

    public AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI() {
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg", "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("Tin语shell脚本");
        AMV_MVS_VSQ = new String("MEDCINE");
        Image img = ((ImageIcon) thisIcon).getImage();
        Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
        thisIcon = new ImageIcon(newimg);
    }

    public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
        _SQ__OVQ_OSQ_VSQ = new AddTinShellView();
        //读档的时候会生成, 用null check 区分开
        _SQ__OPE_OPC_ECI = new AddTinShellRun();
        _SQ__AOU_AOQ_VES = new AddTinShellPanel((AddTinShellRun) _SQ__OPE_OPC_ECI
					, this.text, this.tableData_old);
        _SQ__AOU_AOQ_VES.config();
        showed = false;
        isConfiged = true;//记录配置
    }

    //在一键etl执行的时候, 因为没有生成子类, 所以父类不能cast成子类。于是开始设计成子类的new模式。
    //稍后hook 进行 异常修整 20230218
    public void OPE_E(JTextPane jTextPane, App NE) {
        AddTinShellView _OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ = (AddTinShellView) _SQ__OVQ_OSQ_VSQ;
        //addTinShellRun=  new AddTinShellRun();//SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI;
        //SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI
        //先把tinshellrun拿出来到一键执行的上层去, 再迭代下来。罗瑶光 20211103
        if (null != _SQ__OPE_OPC_ECI.topOutput) {
            //20230106-System.out.println(_SQ__OPE_OPC_ECI.topOutput.size());
        }
        if (null != _SQ__OPE_OPC_ECI.midOutput) {
            //20230106-System.out.println(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.midOutput.size());
        }
        if (null != _SQ__OPE_OPC_ECI.downOutput) {
            //20230106-System.out.println(SQ_OSU_MSQ_OSU_AVQ_ASQ_OPE_OPC_ECI.downOutput.size());
        }
        ((AddTinShellRun) _SQ__OPE_OPC_ECI).run(_OSU_AVQ_ASQ_AVQ_ASQ_OVQ_OSQ_VSQ
					, this, NE);
    }

    public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE) {
        _SQ__OVQ_OSQ_VSQ.view(NE);
        showed = true;
    }

    public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
        _SQ_OSU_MSQ_OSU_MCI_MCU_MSI = new AddTinShellNodeASQ_OCQ_OSI_PCI_PCU_MCI_MCU_MSI(this.tableData_old, this.text);
        return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;
    }
}
