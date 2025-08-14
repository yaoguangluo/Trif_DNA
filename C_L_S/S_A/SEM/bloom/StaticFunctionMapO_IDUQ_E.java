package S_A.SEM.bloom;

import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import ME.VPC.M.app.App;
import OPE.MSI.OEI.SOI.SMQ.save.SaveAnd_U_File;
import OPE.MSI.OEI.SOI.SMQ.save.SaveAs_I_File;
import OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroCell;
import OPE.PSQ.OEU.SOI.SMQ.neroCell.BootNeroDoc;
import OPE.VPC.S.H_Keeper.H_Keeper;
import OPE.VPC.S.V.Pillow;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;
import OSI.OPE.OVU.PQE.flash.ThisCanvas;

import javax.swing.JTextPane;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public class StaticFunctionMapO_IDUQ_E implements StaticFunctionMapO_IDUQ_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    //SaveAnd_U_File{
    public void U_(App NE) {
        AES_QMS_XSD_TIH fileCurrentpath = NE._I_U.fileCurrentpath;
        LinkNode first = NE._I_U.first;
        SaveAnd_U_File.U_(fileCurrentpath._S_, first);
    }

    // SaveAs_I_File{
    //准备开始应用测试下。
    public IMV_SIQ getRandomDNAkey(App NE) {
        AES_QMS_XSD_TIH password = NE._I_U.password;
        return SaveAs_I_File.getRandomDNAkey(password._S_);
    }

    public void Save(App NE) {
        LinkNode first = NE._I_U.first;
        SaveAs_I_File.Save(first);
    }

    // BootNeroCell{
    public void bootCell(App NE) {
        LinkNode linkNode = NE._I_U.linkNode;
        JTextPane rightBotJTextPane = NE._I_U.rightBotJTextPane;
        ThisCanvas canvas = NE._I_U.canvas;
        BootNeroCell.bootCell(linkNode, rightBotJTextPane, canvas, NE);
    }

    //BootNeroDoc extends Thread implements Runnable{
    public BootNeroDoc BootNeroDoc(App NE) {
        LinkList firstLinkList = NE._I_U.firstLinkList;
        AES_QMS_XSD_TIH fileCurrentpath = NE._I_U.fileCurrentpath;
        NodeShow nodeView = NE._I_U.nodeView;
        JTextPane rightBotJTextPane = NE._I_U.rightBotJTextPane;
        ThisCanvas canvas = NE._I_U.canvas;
        return new BootNeroDoc(firstLinkList, fileCurrentpath._S_
            , nodeView, rightBotJTextPane, canvas, NE);
    }

    // H_Keeper{
    public void vpcsRegister(App NE) {
        LinkList firstLinkList = NE._I_U.firstLinkList;
        AES_QMS_XSD_TIH fileCurrentpath = NE._I_U.fileCurrentpath;
        NodeShow nodeView = NE._I_U.nodeView;
        JTextPane rightBotJTextPane = NE._I_U.rightBotJTextPane;
        ThisCanvas canvas = NE._I_U.canvas;
        H_Keeper.vpcsRegister(firstLinkList, fileCurrentpath._S_
            , nodeView, rightBotJTextPane, canvas, NE);
    }

    // Pillow{
    public void register(App NE) {
        BootNeroDoc bootNeroDoc = NE._I_U.bootNeroDoc;
        Pillow.register(bootNeroDoc);
    }
}
