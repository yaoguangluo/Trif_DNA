//package test.java.ME.VPC.V.search;
//
//import ME.VPC.V.config.YangJPanel;
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
//class YangJPanelTest {
//    /**
//     * Method under test: {@link YangJPanel#YangJPanel(JTextField)}
//     */
//    @Test
//    void testConstructor() {
//        YangJPanel actualYangJPanel = new YangJPanel(new JTextField(1));
//        assertEquals(0, actualYangJPanel.getMouseMotionListeners().length);
//        assertEquals(0.5f, actualYangJPanel.getAlignmentX());
//        assertNull(actualYangJPanel.getComponentPopupMenu());
//        assertEquals(0, actualYangJPanel.getMouseListeners().length);
//        assertEquals(0, actualYangJPanel.getHierarchyListeners().length);
//        assertFalse(actualYangJPanel.getIgnoreRepaint());
//        assertEquals(28, actualYangJPanel.getComponents().length);
//        assertFalse(actualYangJPanel.getInheritsPopupMenu());
//        assertNull(actualYangJPanel.getInputContext());
//        assertEquals(Component.BaselineResizeBehavior.OTHER, actualYangJPanel.getBaselineResizeBehavior());
//        assertNull(actualYangJPanel.getLayout());
//        assertEquals(0, actualYangJPanel.getKeyListeners().length);
//        assertNull(actualYangJPanel.getInputVerifier());
//        assertEquals(0, actualYangJPanel.getContainerListeners().length);
//        assertEquals(0, actualYangJPanel.getInputMethodListeners().length);
//        assertNull(actualYangJPanel.getInputMethodRequests());
//        assertEquals(0.5f, actualYangJPanel.getAlignmentY());
//        assertNull(actualYangJPanel.getBorder());
//        assertEquals(0, actualYangJPanel.getDebugGraphicsOptions());
//        assertNull(actualYangJPanel.getDropTarget());
//        Rectangle expectedBounds = actualYangJPanel.bounds();
//        assertEquals(expectedBounds, actualYangJPanel.getBounds());
//        assertNull(actualYangJPanel.getFocusCycleRootAncestor());
//        assertEquals(0, actualYangJPanel.getFocusListeners().length);
//        assertEquals(0, actualYangJPanel.getAncestorListeners().length);
//        assertEquals(0, actualYangJPanel.getHierarchyBoundsListeners().length);
//        assertEquals(610, actualYangJPanel.getHeight());
//        assertNull(actualYangJPanel.getGraphicsConfiguration());
//        assertNull(actualYangJPanel.getGraphics());
//        assertTrue(actualYangJPanel.getFocusTraversalKeysEnabled());
//        assertNull(actualYangJPanel.getFocusTraversalPolicy());
//        assertEquals(28, actualYangJPanel.getComponentCount());
//        assertFalse(actualYangJPanel.getAutoscrolls());
//        assertEquals(0, actualYangJPanel.getComponentListeners().length);
//    }
//}
//
