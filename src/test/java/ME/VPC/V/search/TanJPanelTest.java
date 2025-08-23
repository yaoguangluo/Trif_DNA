//package test.java.ME.VPC.V.search;
//
//import ME.VPC.V.search.TanJPanel;
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
//class TanJPanelTest {
//    /**
//     * Method under test: {@link TanJPanel#TanJPanel(JTextField)}
//     */
//    @Test
//    void testConstructor() {
//        TanJPanel actualTanJPanel = new TanJPanel(new JTextField(1));
//        assertEquals(0, actualTanJPanel.getMouseMotionListeners().length);
//        assertEquals(0.5f, actualTanJPanel.getAlignmentX());
//        assertNull(actualTanJPanel.getComponentPopupMenu());
//        assertEquals(0, actualTanJPanel.getMouseListeners().length);
//        assertEquals(0, actualTanJPanel.getHierarchyListeners().length);
//        assertFalse(actualTanJPanel.getIgnoreRepaint());
//        assertEquals(24, actualTanJPanel.getComponents().length);
//        assertFalse(actualTanJPanel.getInheritsPopupMenu());
//        assertNull(actualTanJPanel.getInputContext());
//        assertEquals(Component.BaselineResizeBehavior.OTHER, actualTanJPanel.getBaselineResizeBehavior());
//        assertNull(actualTanJPanel.getLayout());
//        assertEquals(0, actualTanJPanel.getKeyListeners().length);
//        assertNull(actualTanJPanel.getInputVerifier());
//        assertEquals(0, actualTanJPanel.getContainerListeners().length);
//        assertEquals(0, actualTanJPanel.getInputMethodListeners().length);
//        assertNull(actualTanJPanel.getInputMethodRequests());
//        assertEquals(0.5f, actualTanJPanel.getAlignmentY());
//        assertNull(actualTanJPanel.getBorder());
//        assertEquals(0, actualTanJPanel.getDebugGraphicsOptions());
//        assertNull(actualTanJPanel.getDropTarget());
//        Rectangle expectedBounds = actualTanJPanel.bounds();
//        assertEquals(expectedBounds, actualTanJPanel.getBounds());
//        assertNull(actualTanJPanel.getFocusCycleRootAncestor());
//        assertEquals(0, actualTanJPanel.getFocusListeners().length);
//        assertEquals(0, actualTanJPanel.getAncestorListeners().length);
//        assertEquals(0, actualTanJPanel.getHierarchyBoundsListeners().length);
//        assertEquals(610, actualTanJPanel.getHeight());
//        assertNull(actualTanJPanel.getGraphicsConfiguration());
//        assertNull(actualTanJPanel.getGraphics());
//        assertTrue(actualTanJPanel.getFocusTraversalKeysEnabled());
//        assertNull(actualTanJPanel.getFocusTraversalPolicy());
//        assertEquals(24, actualTanJPanel.getComponentCount());
//        assertFalse(actualTanJPanel.getAutoscrolls());
//        assertEquals(0, actualTanJPanel.getComponentListeners().length);
//    }
//}
//
