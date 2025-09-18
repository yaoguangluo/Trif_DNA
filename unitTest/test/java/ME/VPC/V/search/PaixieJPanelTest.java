//package test.java.ME.VPC.V.search;
//
//import ME.VPC.V.search.PaixieJPanel;
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
//class PaixieJPanelTest {
//    /**
//     * Method under test: {@link PaixieJPanel#PaixieJPanel(JTextField)}
//     */
//    @Test
//    void testConstructor() {
//        PaixieJPanel actualPaixieJPanel = new PaixieJPanel(new JTextField(1));
//        assertEquals(0, actualPaixieJPanel.getMouseMotionListeners().length);
//        assertEquals(0.5f, actualPaixieJPanel.getAlignmentX());
//        assertNull(actualPaixieJPanel.getComponentPopupMenu());
//        assertEquals(0, actualPaixieJPanel.getMouseListeners().length);
//        assertEquals(0, actualPaixieJPanel.getHierarchyListeners().length);
//        assertFalse(actualPaixieJPanel.getIgnoreRepaint());
//        assertEquals(44, actualPaixieJPanel.getComponents().length);
//        assertFalse(actualPaixieJPanel.getInheritsPopupMenu());
//        assertNull(actualPaixieJPanel.getInputContext());
//        assertEquals(Component.BaselineResizeBehavior.OTHER, actualPaixieJPanel.getBaselineResizeBehavior());
//        assertNull(actualPaixieJPanel.getLayout());
//        assertEquals(0, actualPaixieJPanel.getKeyListeners().length);
//        assertNull(actualPaixieJPanel.getInputVerifier());
//        assertEquals(0, actualPaixieJPanel.getContainerListeners().length);
//        assertEquals(0, actualPaixieJPanel.getInputMethodListeners().length);
//        assertNull(actualPaixieJPanel.getInputMethodRequests());
//        assertEquals(0.5f, actualPaixieJPanel.getAlignmentY());
//        assertNull(actualPaixieJPanel.getBorder());
//        assertEquals(0, actualPaixieJPanel.getDebugGraphicsOptions());
//        assertNull(actualPaixieJPanel.getDropTarget());
//        Rectangle expectedBounds = actualPaixieJPanel.bounds();
//        assertEquals(expectedBounds, actualPaixieJPanel.getBounds());
//        assertNull(actualPaixieJPanel.getFocusCycleRootAncestor());
//        assertEquals(0, actualPaixieJPanel.getFocusListeners().length);
//        assertEquals(0, actualPaixieJPanel.getAncestorListeners().length);
//        assertEquals(0, actualPaixieJPanel.getHierarchyBoundsListeners().length);
//        assertEquals(610, actualPaixieJPanel.getHeight());
//        assertNull(actualPaixieJPanel.getGraphicsConfiguration());
//        assertNull(actualPaixieJPanel.getGraphics());
//        assertTrue(actualPaixieJPanel.getFocusTraversalKeysEnabled());
//        assertNull(actualPaixieJPanel.getFocusTraversalPolicy());
//        assertEquals(44, actualPaixieJPanel.getComponentCount());
//        assertFalse(actualPaixieJPanel.getAutoscrolls());
//        assertEquals(0, actualPaixieJPanel.getComponentListeners().length);
//    }
//}
//
