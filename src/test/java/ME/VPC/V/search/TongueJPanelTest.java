//package test.java.ME.VPC.V.search;
//
//import ME.VPC.V.search.TongueJPanel;
//import org.junit.jupiter.api.Test;
//
//import javax.swing.JTextField;
//import java.awt.Component;
//import java.awt.Rectangle;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertNull;
//import static org.junit.jupiter.api.Assertions.assertTrue;
///*
// * 著作权人, 作者 罗瑶光, 浏阳
// * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
// * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
// * 15116110525-
// * 430181198505250014, G24402609, EB0581342
// * 204925063, 389418686, F2406501, 0626136
// * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
// * */
//class TongueJPanelTest {
//    /**
//     * Method under test: {@link TongueJPanel#TongueJPanel(JTextField, JTextField, JTextField)}
//     */
//    @Test
//    void testConstructor() {
//        JTextField name = new JTextField(1);
//        JTextField 性味 = new JTextField(1);
//        TongueJPanel actualTongueJPanel = new TongueJPanel(name, 性味, new JTextField(1));
//
//        assertEquals(0, actualTongueJPanel.getMouseMotionListeners().length);
//        assertEquals(0.5f, actualTongueJPanel.getAlignmentX());
//        assertNull(actualTongueJPanel.getComponentPopupMenu());
//        assertEquals(0, actualTongueJPanel.getMouseListeners().length);
//        assertEquals(0, actualTongueJPanel.getHierarchyListeners().length);
//        assertFalse(actualTongueJPanel.getIgnoreRepaint());
//        assertEquals(240, actualTongueJPanel.getComponents().length);
//        assertFalse(actualTongueJPanel.getInheritsPopupMenu());
//        assertNull(actualTongueJPanel.getInputContext());
//        assertEquals(Component.BaselineResizeBehavior.OTHER, actualTongueJPanel.getBaselineResizeBehavior());
//        assertNull(actualTongueJPanel.getLayout());
//        assertEquals(0, actualTongueJPanel.getKeyListeners().length);
//        assertNull(actualTongueJPanel.getInputVerifier());
//        assertEquals(0, actualTongueJPanel.getContainerListeners().length);
//        assertEquals(0, actualTongueJPanel.getInputMethodListeners().length);
//        assertNull(actualTongueJPanel.getInputMethodRequests());
//        assertEquals(0.5f, actualTongueJPanel.getAlignmentY());
//        assertNull(actualTongueJPanel.getBorder());
//        assertEquals(0, actualTongueJPanel.getDebugGraphicsOptions());
//        assertNull(actualTongueJPanel.getDropTarget());
//        Rectangle expectedBounds = actualTongueJPanel.bounds();
//        assertEquals(expectedBounds, actualTongueJPanel.getBounds());
//        assertNull(actualTongueJPanel.getFocusCycleRootAncestor());
//        assertEquals(0, actualTongueJPanel.getFocusListeners().length);
//        assertEquals(0, actualTongueJPanel.getAncestorListeners().length);
//        assertEquals(0, actualTongueJPanel.getHierarchyBoundsListeners().length);
//        assertEquals(610, actualTongueJPanel.getHeight());
//        assertNull(actualTongueJPanel.getGraphicsConfiguration());
//        assertNull(actualTongueJPanel.getGraphics());
//        assertTrue(actualTongueJPanel.getFocusTraversalKeysEnabled());
//        assertNull(actualTongueJPanel.getFocusTraversalPolicy());
//        assertEquals(240, actualTongueJPanel.getComponentCount());
//        assertFalse(actualTongueJPanel.getAutoscrolls());
//        assertEquals(0, actualTongueJPanel.getComponentListeners().length);
//    }
//}
//
