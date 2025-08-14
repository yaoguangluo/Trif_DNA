//package test.java.ME.VPC.V.search;
//
//import ME.VPC.V.search.QitaJPanel;
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
//class QitaJPanelTest {
//    /**
//     * Method under test: {@link QitaJPanel#QitaJPanel(JTextField)}
//     */
//    @Test
//    void testConstructor() {
//        QitaJPanel actualQitaJPanel = new QitaJPanel(new JTextField(1));
//        assertEquals(0, actualQitaJPanel.getMouseMotionListeners().length);
//        assertEquals(0.5f, actualQitaJPanel.getAlignmentX());
//        assertNull(actualQitaJPanel.getComponentPopupMenu());
//        assertEquals(0, actualQitaJPanel.getMouseListeners().length);
//        assertEquals(0, actualQitaJPanel.getHierarchyListeners().length);
//        assertFalse(actualQitaJPanel.getIgnoreRepaint());
//        assertEquals(296, actualQitaJPanel.getComponents().length);
//        assertFalse(actualQitaJPanel.getInheritsPopupMenu());
//        assertNull(actualQitaJPanel.getInputContext());
//        assertEquals(Component.BaselineResizeBehavior.OTHER, actualQitaJPanel.getBaselineResizeBehavior());
//        assertNull(actualQitaJPanel.getLayout());
//        assertEquals(0, actualQitaJPanel.getKeyListeners().length);
//        assertNull(actualQitaJPanel.getInputVerifier());
//        assertEquals(0, actualQitaJPanel.getContainerListeners().length);
//        assertEquals(0, actualQitaJPanel.getInputMethodListeners().length);
//        assertNull(actualQitaJPanel.getInputMethodRequests());
//        assertEquals(0.5f, actualQitaJPanel.getAlignmentY());
//        assertNull(actualQitaJPanel.getBorder());
//        assertEquals(0, actualQitaJPanel.getDebugGraphicsOptions());
//        assertNull(actualQitaJPanel.getDropTarget());
//        Rectangle expectedBounds = actualQitaJPanel.bounds();
//        assertEquals(expectedBounds, actualQitaJPanel.getBounds());
//        assertNull(actualQitaJPanel.getFocusCycleRootAncestor());
//        assertEquals(0, actualQitaJPanel.getFocusListeners().length);
//        assertEquals(0, actualQitaJPanel.getAncestorListeners().length);
//        assertEquals(0, actualQitaJPanel.getHierarchyBoundsListeners().length);
//        assertEquals(610, actualQitaJPanel.getHeight());
//        assertNull(actualQitaJPanel.getGraphicsConfiguration());
//        assertNull(actualQitaJPanel.getGraphics());
//        assertTrue(actualQitaJPanel.getFocusTraversalKeysEnabled());
//        assertNull(actualQitaJPanel.getFocusTraversalPolicy());
//        assertEquals(296, actualQitaJPanel.getComponentCount());
//        assertFalse(actualQitaJPanel.getAutoscrolls());
//        assertEquals(0, actualQitaJPanel.getComponentListeners().length);
//    }
//}
//
