//package test.java.ME.VPC.E.sleeper;
//
//import A_V.C.RatioMap;
//import A_V.E.RatioMap_E;
//import E_A.ME.analysis.E.CogsBinaryForest_AE;
//import ME.VPC.E.sleeper.FyydPage;
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
//import static org.mockito.Mockito.anyChar;
//import static org.mockito.Mockito.anyString;
//import static org.mockito.Mockito.when;
//
//class FyydPageTest {
//    @Mock
//    App NE;
//    @Mock
//    DetaButton buttonGJJD;
//    //Field columnTitle of type Object[] - was not mocked since Mockito doesn't mock arrays
//    @Mock
//    IMV_SIQ dic_map;
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
//
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
//
//    @Mock
//    List<Component> component;
//    @Mock
//    LayoutManager layoutMgr;
//
//    @Mock
//    FocusTraversalPolicy focusTraversalPolicy;
//    @Mock
//    Set<Thread> printingThreads;
//    @Mock
//    ContainerListener containerListener;
//    @Mock
//    Color preserveBackgroundColor;
//
//    @Mock
//    Component modalComp;
//    //Field modalAppContext of type AppContext - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
//
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
//    FyydPage fyydPage;
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void testData() {
//        JTextPane result = fyydPage.data(new App());
//        //Assertions.assertEquals(null, result);
//    }
//
//    @Test
//    void testStatistic() {
//        JTextPane result = fyydPage.statistic();
//        //Assertions.assertEquals(null, result);
//    }
//
//    @Test
//    void testName() {
//        JTextField result = fyydPage.name();
//        //Assertions.assertEquals(null, result);
//    }
//
//    @Test
//    void testJTable() {
//        JTable result = fyydPage.jTable(new App());
//       // Assertions.assertEquals(null, result);
//    }
//
//    @Test
//    void testMouseClicked() {
//        fyydPage.mouseClicked(null);
//    }
//
//    @Test
//    void testMouseEntered() {
//        fyydPage.mouseEntered(null);
//    }
//
//    @Test
//    void testMouseExited() {
//        fyydPage.mouseExited(null);
//    }
//
//    @Test
//    void testMousePressed() {
//        fyydPage.mousePressed(null);
//    }
//
//    @Test
//    void testMouseReleased() {
//        fyydPage.mouseReleased(null);
//    }
//
//    @Test
//    void testKeyPressed() {
//        fyydPage.keyPressed(null);
//    }
//
//    @Test
//    void testKeyReleased() {
//        when(dic_map.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_map.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_map.getString(anyChar())).thenReturn("getStringResponse");
//        when(_A.parserMixStringByReturnFrequencyMap(anyString(), any())).thenReturn(new IMV_SIQ_SS());
//        //when(_A.parserMixedString(anyString())).thenReturn(List.of("String"));
//        when(posFec.containsKeyChar(anyChar())).thenReturn(true);
//        when(posFec.getString(anyString())).thenReturn("getStringResponse");
//        when(posFec.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_xj.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_xj.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_xj.getString(anyChar())).thenReturn("getStringResponse");
//        when(pos.containsKeyChar(anyChar())).thenReturn(true);
//        when(pos.getString(anyString())).thenReturn("getStringResponse");
//        when(pos.getString(anyChar())).thenReturn("getStringResponse");
//        when(pose.containsKeyChar(anyChar())).thenReturn(true);
//        when(pose.getString(anyString())).thenReturn("getStringResponse");
//        when(pose.getString(anyChar())).thenReturn("getStringResponse");
//        when(etc.containsKeyChar(anyChar())).thenReturn(true);
//        when(etc.getString(anyString())).thenReturn("getStringResponse");
//        when(etc.getString(anyChar())).thenReturn("getStringResponse");
//        when(cte.containsKeyChar(anyChar())).thenReturn(true);
//        when(cte.getString(anyString())).thenReturn("getStringResponse");
//        when(cte.getString(anyChar())).thenReturn("getStringResponse");
//        when(posec.containsKeyChar(anyChar())).thenReturn(true);
//        when(posec.getString(anyString())).thenReturn("getStringResponse");
//        when(posec.getString(anyChar())).thenReturn("getStringResponse");
//        when(posFullec.containsKeyChar(anyChar())).thenReturn(true);
//        when(posFullec.getString(anyString())).thenReturn("getStringResponse");
//        when(posFullec.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_map.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_map.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_map.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_chu_fang.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_chu_fang.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_chu_fang.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_mz.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_mz.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_mz.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_zf.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_zf.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_zf.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_yy.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_yy.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_yy.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_fg.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_fg.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_fg.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_ff.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_ff.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_ff.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_sy.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_sy.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_sy.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_tl.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_tl.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_tl.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_bzm.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_bzm.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_bzm.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_gn.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_gn.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_gn.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_lcbx.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_lcbx.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_lcbx.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_lcyy.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_lcyy.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_lcyy.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_zhfx.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_zhfx.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_zhfx.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_zhjb.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_zhjb.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_zhjb.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_yao_ming.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_yao_ming.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_yao_ming.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_chengfen_danwei.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_chengfen_danwei.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_chengfen_danwei.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_yong_fa.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_yong_fa.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_yong_fa.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_yong_liang.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_yong_liang.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_yong_liang.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_yao_li.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_yao_li.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_yao_li.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_zhu_yi.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_zhu_yi.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_zhu_yi.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_shi_ying.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_shi_ying.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_shi_ying.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_bu_liang_fan_ying.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_bu_liang_fan_ying.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_bu_liang_fan_ying.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_yao_wu_xiang_hu_zuo_yong.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_yao_wu_xiang_hu_zuo_yong.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_yao_wu_xiang_hu_zuo_yong.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_qi_ta.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_qi_ta.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_qi_ta.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_jie_shao.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_jie_shao.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_jie_shao.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_lx.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_lx.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_lx.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_by.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_by.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_by.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_wx.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_wx.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_wx.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_bl.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_bl.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_bl.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_lc.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_lc.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_lc.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_zd.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_zd.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_zd.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_bf.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_bf.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_bf.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_zl.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_zl.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_zl.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_jy.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_jy.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_jy.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_yh.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_yh.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_yh.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_yf.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_yf.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_yf.getString(anyChar())).thenReturn("getStringResponse");
//        when(dic_yx.containsKeyChar(anyChar())).thenReturn(true);
//        when(dic_yx.getString(anyString())).thenReturn("getStringResponse");
//        when(dic_yx.getString(anyChar())).thenReturn("getStringResponse");
//
//        fyydPage.keyReleased(null);
//    }
//
//    @Test
//    void testKeyTyped() {
//        fyydPage.keyTyped(null);
//    }
//
//    @Test
//    void testDoFwaArrangement() {
//        when(_A.sortWordFrequencyMapToSortMap(any())).thenReturn(new IMV_SIQ_S_());
//
//        IMV_SIQ_S_ result = fyydPage.doFwaArrangement(new IMV_SIQ_SS(), new App());
//        //Assertions.assertEquals(new IMV_SIQ_S_(), result);
//    }
//
//    @Test
//    void testInitPage() {
//        fyydPage.initPage(null, new App());
//    }
//
//    @Test
//    void testSimpleClicked() {
//        when(_A.sortWordFrequencyMapToSortMap(any())).thenReturn(new IMV_SIQ_S_());
//        //when(_A.parserMixedString(anyString())).thenReturn(List.of("String"));
//
//        fyydPage.simpleClicked(new App());
//    }
//
//    @Test
//    void testTableSections() {
//        fyydPage.tableSections(new App());
//    }
//}
//
////Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme