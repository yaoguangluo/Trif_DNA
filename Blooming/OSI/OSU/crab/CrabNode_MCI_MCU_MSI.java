package OSI.OSU.crab;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Image;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
//吃螃蟹Tin神
public class CrabNode_MCI_MCU_MSI extends OSU_MCI_MCU_MSI {
    public CrabNode_MCI_MCU_MSI(Object[][] tableData_old, JTextPane text) {
        this.text = text;
        this.tableData_old = tableData_old;
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
                , "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("注册元基花函数");
        AMV_MVS_VSQ = new String("register");
        Image img = ((ImageIcon) thisIcon).getImage();
        Image newimg = img.getScaledInstance(30, 30
                , java.awt.Image.SCALE_SMOOTH);
        thisImage = img.getScaledInstance(30, 30
            , java.awt.Image.SCALE_SMOOTH);
        thisIcon = new ImageIcon(newimg);
        //osgi的插件扩展函数方法
        //CrabInterface crabInterface= new CrabInterfaceClass();
        //crabInterface.chromosomes();
        //crabInterface.bloomings();
        //crabInterface.neroCells();;
        //crabInterface.logic(null, null, 0);
    }

    public CrabNode_MCI_MCU_MSI()  {
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
                , "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("注册元基花函数");
        AMV_MVS_VSQ = new String("register");
        Image img = ((ImageIcon) thisIcon).getImage();
        Image newimg = img.getScaledInstance(30, 30
                , java.awt.Image.SCALE_SMOOTH);
        thisImage = img.getScaledInstance(30, 30
                , java.awt.Image.SCALE_SMOOTH);
        thisIcon = new ImageIcon(newimg);
        //CrabInterface crabInterface= new CrabInterfaceClass();
        //crabInterface.chromosomes();
        //crabInterface.bloomings();
        //crabInterface.neroCells();;
        //crabInterface.logic(null, null, 0);
    }

    public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas)  {
        _SQ__OVQ_OSQ_VSQ = new CrabNodeView();
        _SQ__OPE_OPC_ECI = new CrabNodeRun();
        _SQ__AOU_AOQ_VES = new CrabNodePanel((CrabNodeRun) _SQ__OPE_OPC_ECI
                , this.text, this.tableData_old);
        _SQ__AOU_AOQ_VES.config();
        showed = false;
    }

    public void OPE_E(JTextPane jTextPane) {
        ((CrabNodeRun) _SQ__OPE_OPC_ECI).run((CrabNodeView) _SQ__OVQ_OSQ_VSQ);
    }

    public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane jTextPane, App NE)  {
        _SQ__OVQ_OSQ_VSQ.view(NE);
        showed = true;
    }

    public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
        _SQ_OSU_MSQ_OSU_MCI_MCU_MSI = new CrabNode_MCI_MCU_MSI(this.tableData_old
                , this.text);
        return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;
    }
}
