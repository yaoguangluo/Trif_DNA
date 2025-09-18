//package test.java.ME.VPC.V.search;
//
//import ME.VPC.V.search.HanJPanel;
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
//class HanJPanelTest {
//    /**
//     * Method under test: {@link HanJPanel#HanJPanel(JTextField)}
//     */
//    @Test
//    void testConstructor() {
//        HanJPanel actualHanJPanel = new HanJPanel(new JTextField(1));
//        assertEquals(0, actualHanJPanel.getMouseMotionListeners().length);
//        assertEquals(0.5f, actualHanJPanel.getAlignmentX());
//        assertNull(actualHanJPanel.getComponentPopupMenu());
//        assertEquals(0, actualHanJPanel.getMouseListeners().length);
//        assertEquals(0, actualHanJPanel.getHierarchyListeners().length);
//        assertFalse(actualHanJPanel.getIgnoreRepaint());
//        assertEquals(38, actualHanJPanel.getComponents().length);
//        assertFalse(actualHanJPanel.getInheritsPopupMenu());
//        assertNull(actualHanJPanel.getInputContext());
//        assertEquals(Component.BaselineResizeBehavior.OTHER, actualHanJPanel.getBaselineResizeBehavior());
//        assertNull(actualHanJPanel.getLayout());
//        assertEquals(0, actualHanJPanel.getKeyListeners().length);
//        assertNull(actualHanJPanel.getInputVerifier());
//        assertEquals(0, actualHanJPanel.getContainerListeners().length);
//        assertEquals(0, actualHanJPanel.getInputMethodListeners().length);
//        assertNull(actualHanJPanel.getInputMethodRequests());
//        assertEquals(0.5f, actualHanJPanel.getAlignmentY());
//        assertNull(actualHanJPanel.getBorder());
//        assertEquals(0, actualHanJPanel.getDebugGraphicsOptions());
//        assertNull(actualHanJPanel.getDropTarget());
//        Rectangle expectedBounds = actualHanJPanel.bounds();
//        assertEquals(expectedBounds, actualHanJPanel.getBounds());
//        assertNull(actualHanJPanel.getFocusCycleRootAncestor());
//        assertEquals(0, actualHanJPanel.getFocusListeners().length);
//        assertEquals(0, actualHanJPanel.getAncestorListeners().length);
//        assertEquals(0, actualHanJPanel.getHierarchyBoundsListeners().length);
//        assertEquals(610, actualHanJPanel.getHeight());
//        assertNull(actualHanJPanel.getGraphicsConfiguration());
//        assertNull(actualHanJPanel.getGraphics());
//        assertTrue(actualHanJPanel.getFocusTraversalKeysEnabled());
//        assertNull(actualHanJPanel.getFocusTraversalPolicy());
//        assertEquals(38, actualHanJPanel.getComponentCount());
//        assertFalse(actualHanJPanel.getAutoscrolls());
//        assertEquals(0, actualHanJPanel.getComponentListeners().length);
//    }
//}
//
