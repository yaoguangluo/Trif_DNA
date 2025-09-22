//package test.java.ME.VPC.V.search;
//
//import ME.VPC.V.search.TongJPanel;
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
//class TongJPanelTest {
//    /**
//     * Method under test: {@link TongJPanel#TongJPanel(JTextField)}
//     */
//    @Test
//    void testConstructor() {
//        TongJPanel actualTongJPanel = new TongJPanel(new JTextField(1));
//        assertEquals(0, actualTongJPanel.getMouseMotionListeners().length);
//        assertEquals(0.5f, actualTongJPanel.getAlignmentX());
//        assertNull(actualTongJPanel.getComponentPopupMenu());
//        assertEquals(0, actualTongJPanel.getMouseListeners().length);
//        assertEquals(0, actualTongJPanel.getHierarchyListeners().length);
//        assertFalse(actualTongJPanel.getIgnoreRepaint());
//        assertEquals(60, actualTongJPanel.getComponents().length);
//        assertFalse(actualTongJPanel.getInheritsPopupMenu());
//        assertNull(actualTongJPanel.getInputContext());
//        assertEquals(Component.BaselineResizeBehavior.OTHER, actualTongJPanel.getBaselineResizeBehavior());
//        assertNull(actualTongJPanel.getLayout());
//        assertEquals(0, actualTongJPanel.getKeyListeners().length);
//        assertNull(actualTongJPanel.getInputVerifier());
//        assertEquals(0, actualTongJPanel.getContainerListeners().length);
//        assertEquals(0, actualTongJPanel.getInputMethodListeners().length);
//        assertNull(actualTongJPanel.getInputMethodRequests());
//        assertEquals(0.5f, actualTongJPanel.getAlignmentY());
//        assertNull(actualTongJPanel.getBorder());
//        assertEquals(0, actualTongJPanel.getDebugGraphicsOptions());
//        assertNull(actualTongJPanel.getDropTarget());
//        Rectangle expectedBounds = actualTongJPanel.bounds();
//        assertEquals(expectedBounds, actualTongJPanel.getBounds());
//        assertNull(actualTongJPanel.getFocusCycleRootAncestor());
//        assertEquals(0, actualTongJPanel.getFocusListeners().length);
//        assertEquals(0, actualTongJPanel.getAncestorListeners().length);
//        assertEquals(0, actualTongJPanel.getHierarchyBoundsListeners().length);
//        assertEquals(610, actualTongJPanel.getHeight());
//        assertNull(actualTongJPanel.getGraphicsConfiguration());
//        assertNull(actualTongJPanel.getGraphics());
//        assertTrue(actualTongJPanel.getFocusTraversalKeysEnabled());
//        assertNull(actualTongJPanel.getFocusTraversalPolicy());
//        assertEquals(60, actualTongJPanel.getComponentCount());
//        assertFalse(actualTongJPanel.getAutoscrolls());
//        assertEquals(0, actualTongJPanel.getComponentListeners().length);
//    }
//}
//
