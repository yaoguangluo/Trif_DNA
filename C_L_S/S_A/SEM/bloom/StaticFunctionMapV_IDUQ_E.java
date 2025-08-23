package S_A.SEM.bloom;

import E_A.OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import E_A.ME.liner.E.Quick6DLuoYaoguangSort3DMap_E;
import E_A.ME.nero.E.NERO_C_OneTime_E;
import E_A.OEI.SVQ.MPC.fhmm.E.FMHMMListOneTime_E;
import ME.VPC.C.skivvy.MakeContainerSJFX;
import ME.VPC.M.app.App;
import ME.VPC.S.ne.WindowsUI;
import E.Nlp_CE_X_S;
import P.Pos_X_P;
import M_V.MVQ.tabbedpane.DetabbedPane;
import OPE.OVU.MVQ.OVU.PQE.nodeView.NodeShow;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkList;
import OPE.OVU.MVU.OVU.PQE.nodeEdit.LinkNode;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.File_X_Load;
import OSI.OPE.OEI.PVI.SOI.SMQ.load.File_X_getOrigianlTextByLock;
import OSI.OPE.OVU.PQE.flash.GUISample;
import P_V.PEQ.AMV.ECS.test.SensingTest;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.Container;
import java.io.File;


//著作权人+ 作者= 罗瑶光
//元基花裁剪，做了导入和执行分化模式。
public class StaticFunctionMapV_IDUQ_E implements StaticFunctionMapV_IDUQ_C {
    public IMV_SIQ annotationMap = new IMV_SIQ();

    @Override
    public MakeContainerSJFX initETL(App NE) {
        App app = NE._I_U.app;
        Container containerPanel = NE._I_U.containerPanel;
        MakeContainerSJFX makeContainerSJFX = new MakeContainerSJFX(app.app_S.tableData_old
            , app.app_S.text, containerPanel, NE);
        makeContainerSJFX.start();
        return makeContainerSJFX;
    }

    //元基花裁剪，做了导入和执行分化模式。
    public MakeContainerSJFX initETLWithInitons(App NE) {
        IMV_SIQ inputValues = NE._I_U.inputValues;
        String[] 传参因子 = NE._I_U.传参因子;
        int 因子 = NE._I_U.因子;
        //导入20230219
        App app = (App) inputValues.get(传参因子[因子++]);//remove later 。。
        Container container = (Container) inputValues.get(传参因子[因子++]);
        //执行20230219
        MakeContainerSJFX makeContainerSJFX = new MakeContainerSJFX(
            app.app_S.tableData_old, app.app_S.text, container, NE);
        makeContainerSJFX.start();
        return makeContainerSJFX;
    }

    @Override
    public GUISample onlyInitETL(App NE) {
        Object[][] tableData_old = NE._I_U.tableData_old;
        JTextPane text = NE._I_U.text;
        App app = NE._I_U.app;
        CogsBinaryForest_AE _A = NE._I_U._AE;
        IMV_SIQ pos = NE._I_U.pos;

        GUISample gUISample = new GUISample();
        gUISample.IV_(tableData_old, text, NE);
        gUISample.start();
        gUISample.validate();
        return gUISample;
    }

    @SuppressWarnings("unchecked")
    public GUISample onlyInitETLWithInitons(App NE) {
        IMV_SIQ inputValues = NE._I_U.inputValues;
        String[] 传参因子 = NE._I_U.传参因子;
        int 因子 = NE._I_U.因子;

        Object[][] tableData_old = (Object[][]) inputValues.get(传参因子[因子++]);
        JTextPane text = (JTextPane) inputValues.get(传参因子[因子++]);
        App app = (App) inputValues.get(传参因子[因子++]);
        CogsBinaryForest_AE _A = (CogsBinaryForest_AE) inputValues.get(传参因子[因子++]);
        IMV_SIQ pos = (IMV_SIQ) inputValues.get(传参因子[因子++]);
        //
        GUISample gUISample = new GUISample();
        gUISample.IV_(tableData_old, text, NE);
        gUISample.start();
        gUISample.validate();
        return gUISample;
    }

    //调通了下, 不要使用老接口, 建议写新的节点。参照已有的 image read节点即可。
    //之后进行复杂场景设计。
    @Override
    public void demoETL(App NE) {
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        NERO_C_OneTime_E nERO_C_OneTime_E = NE._I_U.nERO_C_OneTime_E;
        Nlp_CE_X_S nlp_CE_X_S = NE._I_U.nlp_CE_X_S;
        Pos_X_P pos_X_P = NE._I_U.pos_X_P;
        SensingTest sensingTest = NE._I_U.sensingTest;
        FMHMMListOneTime_E fMHMMListOneTime_E = NE._I_U.fMHMMListOneTime_E;
        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
            = NE._I_U.quick6DLuoYaoguangSort3DMap_E;
        GUISample gUISample = new GUISample();
        App app = NE;
        app.app_S.gUISample = gUISample;

        CogsBinaryForest_AE _A = NE.app_S._A;
//        _A.IV_Mixed(
////            emotionMap_E, nERO_C_OneTime_E, nlp_CE_X_S, pos_X_P, sensingTest
////                , fMHMMListOneTime_E, quick6DLuoYaoguangSort3DMap_E
//        );
        IMV_SIQ pos = _A.getPosCnToCn();

        JTextPane text = new JTextPane();
        app.app_S.jTabbedpane = new DetabbedPane(0, 0, null, NE);

        gUISample.IV_(new Object[10][10], text, NE);
        gUISample.start();
        gUISample.validate();

        JFrame jFrame = new JFrame();
        jFrame.add(gUISample);
        jFrame.setSize(WindowsUI.makeContainerWidth, WindowsUI.makeContainerHeight);
        jFrame.setVisible(true);
    }

    public void demoETLWithInitons(App NE) {

        IMV_SIQ inputValues = NE._I_U.inputValues;
        String[] 传参因子 = NE._I_U.传参因子;
        int 因子 = NE._I_U.因子;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        NERO_C_OneTime_E nERO_C_OneTime_E = NE._I_U.nERO_C_OneTime_E;
        Nlp_CE_X_S nlp_CE_X_S = NE._I_U.nlp_CE_X_S;
        Pos_X_P pos_X_P = NE._I_U.pos_X_P;
        SensingTest sensingTest = NE._I_U.sensingTest;
        FMHMMListOneTime_E fMHMMListOneTime_E = NE._I_U.fMHMMListOneTime_E;
        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
            = NE._I_U.quick6DLuoYaoguangSort3DMap_E;
        GUISample gUISample = new GUISample();
        App app = NE;//fatar opers
        app.app_S.gUISample = gUISample;

        CogsBinaryForest_AE _A = NE.app_S._A;
//        _A.IV_Mixed(
////            emotionMap_E, nERO_C_OneTime_E
////                , nlp_CE_X_S, pos_X_P, sensingTest
////                , fMHMMListOneTime_E
////                , quick6DLuoYaoguangSort3DMap_E
//        );
        IMV_SIQ pos = _A.getPosCnToCn();

        JTextPane text = new JTextPane();
        app.app_S.jTabbedpane = new DetabbedPane(0, 0, null, NE);

        gUISample.IV_(new Object[10][10], text, NE);
        gUISample.start();
        gUISample.validate();

        JFrame jFrame = new JFrame();
        jFrame.add(gUISample);
        jFrame.setSize(WindowsUI.makeContainerWidth, WindowsUI.makeContainerHeight);
        jFrame.setVisible(true);
    }

    @Override
    public void ETLDocLoader(App NE) {
    }

    public void ETLDocLoaderWithInitons(App NE) {
//        IMV_SIQ inputValues, String[] 传参因子, int 因子
    }

    @Override
    public void ETLDocExec(App NE) {
    }

    public void ETLDocExecWithInitons(App NE) {
//        IMV_SIQ inputValues, String[] 传参因子, int 因子
    }

    @Override
    public void ETLDocSave(App NE) {
    }

    public void ETLDocSaveWithInitons(App NE) {
//        IMV_SIQ inputValues, String[] 传参因子, int 因子
    }

    // LoadFile{
    public String getOrigianlTextByLock(App NE) {
        AES_QMS_XSD_TIH inputString = NE._I_U.inputString;
        AES_QMS_XSD_TIH lockString = NE._I_U.lockString;
        return File_X_getOrigianlTextByLock._E(inputString._S_, lockString._S_);
    }

    public String getOrigianlTextByLockWithInitons(App NE) {
        IMV_SIQ inputValues = NE._I_U.inputValues;
        String[] 传参因子 = NE._I_U.传参因子;
        int 因子 = NE._I_U.因子;

        String inputString = (String) inputValues.get(传参因子[因子++]);
        String lockString = (String) inputValues.get(传参因子[因子++]);

        return File_X_getOrigianlTextByLock._E(inputString, lockString);
    }

    public LinkNode Load(App NE) {
        LinkNode first = NE._I_U.first;
        NodeShow nodeView = NE._I_U.nodeView;
        File file = NE._I_U.file;
        LinkList thislist = NE._I_U.thislist;
        return File_X_Load._E(first, nodeView, file, thislist, NE);
    }

    public LinkNode LoadWithInitons(App NE) {
        IMV_SIQ inputValues = NE._I_U.inputValues;
        String[] 传参因子 = NE._I_U.传参因子;
        int 因子 = NE._I_U.因子;
        return File_X_Load._E((LinkNode) inputValues.get(传参因子[因子++])
            , (NodeShow) inputValues.get(传参因子[因子++])
            , (File) inputValues.get(传参因子[因子++])
            , (LinkList) inputValues.get(传参因子[因子++]), NE);
    }

    public static void main() {
        App NE = new App();
        String[] argv = NE._I_U.argv;
        EmotionMap_E emotionMap_E = NE._I_U.emotionMap_E;
        NERO_C_OneTime_E nERO_C_OneTime_E = NE._I_U.nERO_C_OneTime_E;
        Nlp_CE_X_S nlp_CE_X_S = NE._I_U.nlp_CE_X_S;
        Pos_X_P pos_X_P = NE._I_U.pos_X_P;
        SensingTest sensingTest = NE._I_U.sensingTest;
        FMHMMListOneTime_E fMHMMListOneTime_E = NE._I_U.fMHMMListOneTime_E;
        Quick6DLuoYaoguangSort3DMap_E quick6DLuoYaoguangSort3DMap_E
            = NE._I_U.quick6DLuoYaoguangSort3DMap_E;
        new StaticFunctionMapV_IDUQ_E().demoETL(new App());
    }
}
