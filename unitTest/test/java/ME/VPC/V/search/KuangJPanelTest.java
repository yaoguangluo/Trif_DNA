//package test.java.ME.VPC.V.search;
//
//import ME.VPC.V.search.KuangJPanel;
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
//class KuangJPanelTest {
//    /**
//     * Method under test: {@link KuangJPanel#KuangJPanel(JTextField)}
//     */
//    @Test
//    void testConstructor() {
//        KuangJPanel actualKuangJPanel = new KuangJPanel(new JTextField(1));
//        assertEquals(0, actualKuangJPanel.getMouseMotionListeners().length);
//        assertEquals(0.5f, actualKuangJPanel.getAlignmentX());
//        assertNull(actualKuangJPanel.getComponentPopupMenu());
//        assertEquals(0, actualKuangJPanel.getMouseListeners().length);
//        assertEquals(0, actualKuangJPanel.getHierarchyListeners().length);
//        assertFalse(actualKuangJPanel.getIgnoreRepaint());
//        assertEquals(Integer.SIZE, actualKuangJPanel.getComponents().length);
//        assertFalse(actualKuangJPanel.getInheritsPopupMenu());
//        assertNull(actualKuangJPanel.getInputContext());
//        assertEquals(Component.BaselineResizeBehavior.OTHER, actualKuangJPanel.getBaselineResizeBehavior());
//        assertNull(actualKuangJPanel.getLayout());
//        assertEquals(0, actualKuangJPanel.getKeyListeners().length);
//        assertNull(actualKuangJPanel.getInputVerifier());
//        assertEquals(0, actualKuangJPanel.getContainerListeners().length);
//        assertEquals(0, actualKuangJPanel.getInputMethodListeners().length);
//        assertNull(actualKuangJPanel.getInputMethodRequests());
//        assertEquals(0.5f, actualKuangJPanel.getAlignmentY());
//        assertNull(actualKuangJPanel.getBorder());
//        assertEquals(0, actualKuangJPanel.getDebugGraphicsOptions());
//        assertNull(actualKuangJPanel.getDropTarget());
//        Rectangle expectedBounds = actualKuangJPanel.bounds();
//        assertEquals(expectedBounds, actualKuangJPanel.getBounds());
//        assertNull(actualKuangJPanel.getFocusCycleRootAncestor());
//        assertEquals(0, actualKuangJPanel.getFocusListeners().length);
//        assertEquals(0, actualKuangJPanel.getAncestorListeners().length);
//        assertEquals(0, actualKuangJPanel.getHierarchyBoundsListeners().length);
//        assertEquals(610, actualKuangJPanel.getHeight());
//        assertNull(actualKuangJPanel.getGraphicsConfiguration());
//        assertNull(actualKuangJPanel.getGraphics());
//        assertTrue(actualKuangJPanel.getFocusTraversalKeysEnabled());
//        assertNull(actualKuangJPanel.getFocusTraversalPolicy());
//        assertEquals(Integer.SIZE, actualKuangJPanel.getComponentCount());
//        assertFalse(actualKuangJPanel.getAutoscrolls());
//        assertEquals(0, actualKuangJPanel.getComponentListeners().length);
//    }
//}
//
