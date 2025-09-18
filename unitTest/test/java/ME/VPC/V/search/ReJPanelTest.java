//package test.java.ME.VPC.V.search;
//
//import ME.VPC.V.search.ReJPanel;
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
//class ReJPanelTest {
//    /**
//     * Method under test: {@link ReJPanel#ReJPanel(JTextField)}
//     */
//    @Test
//    void testConstructor() {
//        ReJPanel actualReJPanel = new ReJPanel(new JTextField(1));
//        assertEquals(0, actualReJPanel.getMouseMotionListeners().length);
//        assertEquals(0.5f, actualReJPanel.getAlignmentX());
//        assertNull(actualReJPanel.getComponentPopupMenu());
//        assertEquals(0, actualReJPanel.getMouseListeners().length);
//        assertEquals(0, actualReJPanel.getHierarchyListeners().length);
//        assertFalse(actualReJPanel.getIgnoreRepaint());
//        assertEquals(22, actualReJPanel.getComponents().length);
//        assertFalse(actualReJPanel.getInheritsPopupMenu());
//        assertNull(actualReJPanel.getInputContext());
//        assertEquals(Component.BaselineResizeBehavior.OTHER, actualReJPanel.getBaselineResizeBehavior());
//        assertNull(actualReJPanel.getLayout());
//        assertEquals(0, actualReJPanel.getKeyListeners().length);
//        assertNull(actualReJPanel.getInputVerifier());
//        assertEquals(0, actualReJPanel.getContainerListeners().length);
//        assertEquals(0, actualReJPanel.getInputMethodListeners().length);
//        assertNull(actualReJPanel.getInputMethodRequests());
//        assertEquals(0.5f, actualReJPanel.getAlignmentY());
//        assertNull(actualReJPanel.getBorder());
//        assertEquals(0, actualReJPanel.getDebugGraphicsOptions());
//        assertNull(actualReJPanel.getDropTarget());
//        Rectangle expectedBounds = actualReJPanel.bounds();
//        assertEquals(expectedBounds, actualReJPanel.getBounds());
//        assertNull(actualReJPanel.getFocusCycleRootAncestor());
//        assertEquals(0, actualReJPanel.getFocusListeners().length);
//        assertEquals(0, actualReJPanel.getAncestorListeners().length);
//        assertEquals(0, actualReJPanel.getHierarchyBoundsListeners().length);
//        assertEquals(610, actualReJPanel.getHeight());
//        assertNull(actualReJPanel.getGraphicsConfiguration());
//        assertNull(actualReJPanel.getGraphics());
//        assertTrue(actualReJPanel.getFocusTraversalKeysEnabled());
//        assertNull(actualReJPanel.getFocusTraversalPolicy());
//        assertEquals(22, actualReJPanel.getComponentCount());
//        assertFalse(actualReJPanel.getAutoscrolls());
//        assertEquals(0, actualReJPanel.getComponentListeners().length);
//    }
//}
//
