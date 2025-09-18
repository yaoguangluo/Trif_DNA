//package test.java.ME.VPC.E.sleeper;
//
//import A_V.C.RatioMap;
//import A_V.E.RatioMap_E;
//import E_A.ME.analysis.E.CogsBinaryForest_AE;
//import ME.VPC.E.sleeper.WskxPage;
//import ME.VPC.M.app.App;
//import ME.VPC.S.ne.App_S;
//import M_V.MVQ.button.DetaButton;
//import M_V.MVQ.tabbedpane.DetabbedPane;
//import O_V.OSI.AOP.neo.tts.ReadChinese;
//import P_V.PEQ.AMV.ECS.test.SensingTest;
//import S_A.AVQ.OVQ.OSQ.VSQ.obj.Verbal;
//import S_A.VSQ.parser.EmotionSample;
//import S_A.pheromone.IMV_SIQ;
//import S_A.pheromone.IMV_SIQ_;
//import S_A.pheromone.IMV_SIQ_SS;
//import S_A.pheromone.IMV_SIQ_S_;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import javax.accessibility.AccessibleContext;
//import javax.swing.JTable;
//import javax.swing.JTextField;
//import javax.swing.JTextPane;
//import javax.swing.table.DefaultTableModel;
//import java.awt.Color;
//import java.awt.Component;
//import java.awt.Container;
//import java.awt.Cursor;
//import java.awt.Dimension;
//import java.awt.FocusTraversalPolicy;
//import java.awt.Font;
//import java.awt.GraphicsConfiguration;
//import java.awt.LayoutManager;
//import java.awt.PopupMenu;
//import java.awt.dnd.DropTarget;
//import java.awt.event.ComponentListener;
//import java.awt.event.ContainerListener;
//import java.awt.event.FocusListener;
//import java.awt.event.HierarchyBoundsListener;
//import java.awt.event.HierarchyListener;
//import java.awt.event.InputMethodListener;
//import java.awt.event.KeyListener;
//import java.awt.event.MouseListener;
//import java.awt.event.MouseMotionListener;
//import java.awt.event.MouseWheelListener;
//import java.awt.image.BufferStrategy;
//import java.beans.PropertyChangeSupport;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//import java.util.Vector;
//
//import static org.mockito.Mockito.any;
//import static org.mockito.Mockito.anyString;
//import static org.mockito.Mockito.when;
//
//class WskxPageTest {
//    @Mock
//    App NE;
//    //Field columnTitle of type Object[] - was not mocked since Mockito doesn't mock arrays
//    @Mock
//    JTextPane data;
//    @Mock
//    JTextPane statistic;
//    @Mock
//    JTextField name;
//    @Mock
//    JTable table;
//    //Field tableData_old of type Object[] - was not mocked since Mockito doesn't mock arrays
//    @Mock
//    DefaultTableModel newTableModel;
//    @Mock
//    CogsBinaryForest_AE _A;
//    @Mock
//    IMV_SIQ posFec;
//    @Mock
//    JTextPane text;
//    @Mock
//    DetabbedPane jTabbedpane;
//    @Mock
//    App_S app_S;
//    @Mock
//    ReadChinese readChinese;
//    @Mock
//    DetaButton buttonSum;
//    @Mock
//    DetaButton buttonCrt;
//    @Mock
//    DetaButton buttonPrev;
//    @Mock
//    DetaButton buttonNext;
//    @Mock
//    DetaButton buttonCTE;
//    @Mock
//    DetaButton buttonFRS;
//    @Mock
//    DetaButton buttonETC;
//    @Mock
//    DetaButton buttonCTV;
//    @Mock
//    IMV_SIQ dic_xj;
//    @Mock
//    IMV_SIQ pos;
//    @Mock
//    IMV_SIQ pose;
//    @Mock
//    IMV_SIQ etc;
//    @Mock
//    IMV_SIQ cte;
//    @Mock
//    IMV_SIQ posec;
//    @Mock
//    IMV_SIQ posFullec;
//    @Mock
//    List<Verbal> verbals;
//    @Mock
//    List<String> copy;
//    @Mock
//    List<String> dic_list;
//    @Mock
//    List<String> sets;
//    @Mock
//    List<String> copy_xj;
//    @Mock
//    IMV_SIQ_ dic_map;
//    @Mock
//    IMV_SIQ dic_chu_fang;
//    @Mock
//    IMV_SIQ dic_mz;
//    @Mock
//    IMV_SIQ dic_zf;
//    @Mock
//    IMV_SIQ dic_yy;
//    @Mock
//    IMV_SIQ dic_fg;
//    @Mock
//    IMV_SIQ dic_ff;
//    @Mock
//    IMV_SIQ_ dic_sy;
//    @Mock
//    IMV_SIQ dic_tl;
//    @Mock
//    IMV_SIQ dic_bzm;
//    @Mock
//    IMV_SIQ_ dic_gn;
//    @Mock
//    IMV_SIQ dic_lcbx;
//    @Mock
//    IMV_SIQ dic_lcyy;
//    @Mock
//    IMV_SIQ dic_zhfx;
//    @Mock
//    IMV_SIQ dic_zhjb;
//    @Mock
//    IMV_SIQ dic_yao_ming;
//    @Mock
//    IMV_SIQ dic_chengfen_danwei;
//    @Mock
//    IMV_SIQ dic_yong_fa;
//    @Mock
//    IMV_SIQ dic_yong_liang;
//    @Mock
//    IMV_SIQ dic_yao_li;
//    @Mock
//    IMV_SIQ dic_zhu_yi;
//    @Mock
//    IMV_SIQ dic_shi_ying;
//    @Mock
//    IMV_SIQ dic_bu_liang_fan_ying;
//    @Mock
//    IMV_SIQ dic_yao_wu_xiang_hu_zuo_yong;
//    @Mock
//    IMV_SIQ dic_qi_ta;
//    @Mock
//    IMV_SIQ dic_jie_shao;
//    @Mock
//    IMV_SIQ_ dic_lx;
//    @Mock
//    IMV_SIQ_ dic_by;
//    @Mock
//    IMV_SIQ_ dic_wx;
//    @Mock
//    IMV_SIQ_ dic_bl;
//    @Mock
//    IMV_SIQ_ dic_lc;
//    @Mock
//    IMV_SIQ_ dic_zd;
//    @Mock
//    IMV_SIQ_ dic_bf;
//    @Mock
//    IMV_SIQ_ dic_zl;
//    @Mock
//    IMV_SIQ_ dic_jy;
//    @Mock
//    IMV_SIQ_ dic_yh;
//    @Mock
//    IMV_SIQ_ dic_yf;
//    @Mock
//    IMV_SIQ_ dic_yx;
//    @Mock
//    Map<String, Integer> subASCmap;
//    @Mock
//    Map<String, Map<String, Double>> DNNmap;
//    @Mock
//    EmotionSample emotionSample;
//    @Mock
//    RatioMap ratioMap;
//    @Mock
//    RatioMap_E ratioMap_E;
//    @Mock
//    SensingTest sensingTest;
//    @Mock
//    List<Component> component;
//    @Mock
//    LayoutManager layoutMgr;
//    @Mock
//    FocusTraversalPolicy focusTraversalPolicy;
//    @Mock
//    Set<Thread> printingThreads;
//    @Mock
//    ContainerListener containerListener;
//    @Mock
//    Color preserveBackgroundColor;
//    @Mock
//    Component modalComp;
//    //Field modalAppContext of type AppContext - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
//    @Mock
//    Container parent;
//    //Field appContext of type AppContext - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
//    @Mock
//    Color foreground;
//    @Mock
//    Color background;
//    @Mock
//    Font font;
//    @Mock
//    Font peerFont;
//    @Mock
//    Cursor cursor;
//    //Field locale of type Locale - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
//    @Mock
//    GraphicsConfiguration graphicsConfig;
//    @Mock
//    BufferStrategy bufferStrategy;
//    @Mock
//    DropTarget dropTarget;
//    @Mock
//    Vector<PopupMenu> popups;
//    //Field focusTraversalKeys of type Set[] - was not mocked since Mockito doesn't mock arrays
//    @Mock
//    Object LOCK;
//    //Field acc of type AccessControlContext - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
//    @Mock
//    Dimension minSize;
//    @Mock
//    Dimension prefSize;
//    @Mock
//    Dimension maxSize;
//    //Field componentOrientation of type ComponentOrientation - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
//    @Mock
//    ComponentListener componentListener;
//    @Mock
//    FocusListener focusListener;
//    @Mock
//    HierarchyListener hierarchyListener;
//    @Mock
//    HierarchyBoundsListener hierarchyBoundsListener;
//    @Mock
//    KeyListener keyListener;
//    @Mock
//    MouseListener mouseListener;
//    @Mock
//    MouseMotionListener mouseMotionListener;
//    @Mock
//    MouseWheelListener mouseWheelListener;
//    @Mock
//    InputMethodListener inputMethodListener;
//    @Mock
//    PropertyChangeSupport changeSupport;
//    @Mock
//    Object objectLock;
//    //Field compoundShape of type Region - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
//    //Field mixingCutoutRegion of type Region - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
//    //Field eventCache of type EventQueueItem[] - was not mocked since Mockito doesn't mock arrays
//    @Mock
//    Map<Class<?>, Boolean> coalesceMap;
//    @Mock
//    AccessibleContext accessibleContext;
//    @InjectMocks
//    WskxPage wskxPage;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testData() {
//        JTextPane result = wskxPage.data(new App());
//        //Assertions.assertEquals(null, result);
//    }
//
//    @Test
//    void testStatistic() {
//        JTextPane result = wskxPage.statistic();
//       // Assertions.assertEquals(null, result);
//    }
//
//    @Test
//    void testName() {
//        JTextField result = wskxPage.name();
//       // Assertions.assertEquals(null, result);
//    }
//
//    @Test
//    void testJTable() {
//        when(dic_map.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_sy.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_gn.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_lx.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_by.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_wx.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_bl.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_lc.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_zd.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_bf.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_zl.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_jy.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_yh.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_yf.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//        when(dic_yx.getTrimString(anyString())).thenReturn("getTrimStringResponse");
//
//        JTable result = wskxPage.jTable(new App());
//        //Assertions.assertEquals(null, result);
//    }
//
//    @Test
//    void testMouseClicked() {
//        wskxPage.mouseClicked(null);
//    }
//
//    @Test
//    void testMouseEntered() {
//        wskxPage.mouseEntered(null);
//    }
//
//    @Test
//    void testMouseExited() {
//        wskxPage.mouseExited(null);
//    }
//
//    @Test
//    void testMousePressed() {
//        wskxPage.mousePressed(null);
//    }
//
//    @Test
//    void testMouseReleased() {
//        wskxPage.mouseReleased(null);
//    }
//
//    @Test
//    void testKeyPressed() {
//        wskxPage.keyPressed(null);
//    }
//
//    @Test
//    void testKeyReleased() {
//        wskxPage.keyReleased(null);
//    }
//
//    @Test
//    void testKeyTyped() {
//        wskxPage.keyTyped(null);
//    }
//
//    @Test
//    void testDoFwaArrangement() {
//        when(_A.sortWordFrequencyMapToSortMap(any())).thenReturn(new IMV_SIQ_S_());
//
//        IMV_SIQ_S_ result = wskxPage.doFwaArrangement(new IMV_SIQ_SS(), new App());
//        //Assertions.assertEquals(new IMV_SIQ_S_(), result);
//    }
//
//    @Test
//    void testInitPage() {
//        wskxPage.initPage(null, new App());
//    }
//
//    @Test
//    void testSimpleClicked() {
//        when(_A.sortWordFrequencyMapToSortMap(any())).thenReturn(new IMV_SIQ_S_());
//        //when(_A.parserMixedString(anyString())).thenReturn(List.of("String"));
//
//        wskxPage.simpleClicked(new App());
//    }
//
//    @Test
//    void testTableSections() {
//        wskxPage.tableSections(new App());
//    }
//}
//
////Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme