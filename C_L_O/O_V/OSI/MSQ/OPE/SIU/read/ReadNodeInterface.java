package O_V.OSI.MSQ.OPE.SIU.read;

import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_MCI_MCU_MSI;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import ME.VPC.M.app.App;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Image;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class ReadNodeInterface extends OSU_MCI_MCU_MSI {
    public ReadNodeInterface(Object[][] tableData_old, JTextPane text) {
        thisIcon = FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
                , "DetaResources/imgETL/");
        _SQ_OSU_MSQ_OSU_AVQ_ASQ_SQ_VPC_PCS = new String("Read");
        AMV_MVS_VSQ = new String("BI");
        Image img = ((ImageIcon) thisIcon).getImage();
        Image newimg = img.getScaledInstance(30, 30
                , java.awt.Image.SCALE_SMOOTH);
        thisImage = img.getScaledInstance(30, 30
                , java.awt.Image.SCALE_SMOOTH);
        thisIcon = new ImageIcon(newimg);
    }

    public void MEI_MSU(JTextPane jTextPane, ThisCanvas canvas) {
        _SQ__OVQ_OSQ_VSQ = new ReadOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ();
        _SQ__OPE_OPC_ECI = new ReadOSU_MSQ_OPE_OPC_ECI();
        _SQ__AOU_AOQ_VES = new ReadOSU_MSQ_AOI_AOD_AOU_AOQ_VES(
                (ReadOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI, canvas);
        _SQ__AOU_AOQ_VES.config();
        showed = false;
    }
//later..
    public void OPE_E(JTextPane jTextPane, EmotionMap_E emotionMap_E
            , NERO_C_OneTime_E nERO_C_OneTime_E, Nlp_CE_X_S nlp_CE_X_S
            , Pos_X_P pos_X_P, SensingTest sensingTest
            , FMHMMListOneTime_E fMHMMListOneTime_E
            , Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E, App NE) {
        ((ReadOSU_MSQ_OPE_OPC_ECI) _SQ__OPE_OPC_ECI).run(
                (ReadOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ) _SQ__OVQ_OSQ_VSQ, emotionMap_E
                , nERO_C_OneTime_E, nlp_CE_X_S, pos_X_P, sensingTest
                , fMHMMListOneTime_E, quick6DLuoYaoguangSort3DMap_E, NE);
    }

    public void AVQ_ASQ_OVQ_OSQ_VSQ(JTextPane rightBotJTextPane, App NE) {
        _SQ__OVQ_OSQ_VSQ.view(NE);
        showed = true;
    }

    public OSU_MCI_MCU_MSI AOP_MVE_CSI_DUQ(App NE) {
        _SQ_OSU_MSQ_OSU_MCI_MCU_MSI = new ReadNodeInterface(null, null);
        return _SQ_OSU_MSQ_OSU_MCI_MCU_MSI;
    }
}
