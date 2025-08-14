//package test.java.ME.VPC.V.search;
//
//import ME.VPC.V.search.DuJPanel;
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
//class DuJPanelTest {
//    /**
//     * Method under test: {@link DuJPanel#DuJPanel(JTextField)}
//     */
//    @Test
//    void testConstructor() {
//        DuJPanel actualDuJPanel = new DuJPanel(new JTextField(1));
//        assertEquals(0, actualDuJPanel.getMouseMotionListeners().length);
//        assertEquals(0.5f, actualDuJPanel.getAlignmentX());
//        assertNull(actualDuJPanel.getComponentPopupMenu());
//        assertEquals(0, actualDuJPanel.getMouseListeners().length);
//        assertEquals(0, actualDuJPanel.getHierarchyListeners().length);
//        assertFalse(actualDuJPanel.getIgnoreRepaint());
//        assertEquals(24, actualDuJPanel.getComponents().length);
//        assertFalse(actualDuJPanel.getInheritsPopupMenu());
//        assertNull(actualDuJPanel.getInputContext());
//        assertEquals(Component.BaselineResizeBehavior.OTHER, actualDuJPanel.getBaselineResizeBehavior());
//        assertNull(actualDuJPanel.getLayout());
//        assertEquals(0, actualDuJPanel.getKeyListeners().length);
//        assertNull(actualDuJPanel.getInputVerifier());
//        assertEquals(0, actualDuJPanel.getContainerListeners().length);
//        assertEquals(0, actualDuJPanel.getInputMethodListeners().length);
//        assertNull(actualDuJPanel.getInputMethodRequests());
//        assertEquals(0.5f, actualDuJPanel.getAlignmentY());
//        assertNull(actualDuJPanel.getBorder());
//        assertEquals(0, actualDuJPanel.getDebugGraphicsOptions());
//        assertNull(actualDuJPanel.getDropTarget());
//        Rectangle expectedBounds = actualDuJPanel.bounds();
//        assertEquals(expectedBounds, actualDuJPanel.getBounds());
//        assertNull(actualDuJPanel.getFocusCycleRootAncestor());
//        assertEquals(0, actualDuJPanel.getFocusListeners().length);
//        assertEquals(0, actualDuJPanel.getAncestorListeners().length);
//        assertEquals(0, actualDuJPanel.getHierarchyBoundsListeners().length);
//        assertEquals(610, actualDuJPanel.getHeight());
//        assertNull(actualDuJPanel.getGraphicsConfiguration());
//        assertNull(actualDuJPanel.getGraphics());
//        assertTrue(actualDuJPanel.getFocusTraversalKeysEnabled());
//        assertNull(actualDuJPanel.getFocusTraversalPolicy());
//        assertEquals(24, actualDuJPanel.getComponentCount());
//        assertFalse(actualDuJPanel.getAutoscrolls());
//        assertEquals(0, actualDuJPanel.getComponentListeners().length);
//    }
//}
//
