package test.java.ME.VPC.H.hospital;

import ME.VPC.H.hospital.XiYaoJPanel;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.accessibility.AccessibleContext;
import javax.swing.ActionMap;
import javax.swing.ComponentInputMap;
import javax.swing.InputMap;
import javax.swing.InputVerifier;
import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.border.Border;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FocusTraversalPolicy;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.LayoutManager;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.dnd.DropTarget;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerListener;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelListener;
import java.awt.image.BufferStrategy;
import java.beans.PropertyChangeSupport;
import java.beans.VetoableChangeSupport;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
class XiYaoJPanelTest {

    @Mock
    Set<KeyStroke> managingFocusForwardTraversalKeys;
    @Mock
    Set<KeyStroke> managingFocusBackwardTraversalKeys;
    @Mock
    Object INPUT_VERIFIER_SOURCE_KEY;
    @Mock
    ComponentUI ui;
    @Mock
    EventListenerList listenerList;
    @Mock
    VetoableChangeSupport vetoableChangeSupport;
    @Mock
    Border border;
    @Mock
    InputVerifier inputVerifier;
    @Mock
    Component paintingChild;
    @Mock
    JPopupMenu popupMenu;
    @Mock
    AtomicBoolean revalidateRunnableScheduled;
    @Mock
    List<Rectangle> tempRectangles;
    @Mock
    InputMap focusInputMap;
    @Mock
    InputMap ancestorInputMap;
    @Mock
    ComponentInputMap windowInputMap;
    @Mock
    ActionMap actionMap;
    @Mock
    Component componentObtainingGraphicsFrom;
    @Mock
    Object componentObtainingGraphicsFromLock;
    @Mock
    Object aaHint;
    @Mock
    Object lcdRenderingHint;
    
            @Mock
    List<Component> component;
    @Mock
    LayoutManager layoutMgr;
    @Mock
    FocusTraversalPolicy focusTraversalPolicy;
    @Mock
    Set<Thread> printingThreads;
    @Mock
    ContainerListener containerListener;
    @Mock
    Color preserveBackgroundColor;
    
    @Mock
    Component modalComp;
    //Field modalAppContext of type AppContext - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set

    
    
    @Mock
    Container parent;
    //Field appContext of type AppContext - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @Mock
    Color foreground;
    @Mock
    Color background;
    @Mock
    Font font;
    @Mock
    Font peerFont;
    @Mock
    Cursor cursor;
    //Field locale of type Locale - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @Mock
    GraphicsConfiguration graphicsConfig;
    @Mock
    BufferStrategy bufferStrategy;
    @Mock
    DropTarget dropTarget;
    @Mock
    Vector<PopupMenu> popups;
    //Field focusTraversalKeys of type Set[] - was not mocked since Mockito doesn't mock arrays
    @Mock
    Object LOCK;
    //Field acc of type AccessControlContext - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @Mock
    Dimension minSize;
    @Mock
    Dimension prefSize;
    @Mock
    Dimension maxSize;
    //Field componentOrientation of type ComponentOrientation - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    @Mock
    ComponentListener componentListener;
    @Mock
    FocusListener focusListener;
    @Mock
    HierarchyListener hierarchyListener;
    @Mock
    HierarchyBoundsListener hierarchyBoundsListener;
    @Mock
    KeyListener keyListener;
    @Mock
    MouseListener mouseListener;
    @Mock
    MouseMotionListener mouseMotionListener;
    @Mock
    MouseWheelListener mouseWheelListener;
    @Mock
    InputMethodListener inputMethodListener;
    @Mock
    PropertyChangeSupport changeSupport;
    @Mock
    Object objectLock;
    //Field compoundShape of type Region - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field mixingCutoutRegion of type Region - was not mocked since Mockito doesn't mock a Final class when 'mock-maker-inline' option is not set
    //Field eventCache of type EventQueueItem[] - was not mocked since Mockito doesn't mock arrays
    @Mock
    Map<Class<?>, Boolean> coalesceMap;
    
    @Mock
    AccessibleContext accessibleContext;
    @InjectMocks
    XiYaoJPanel xiYaoJPanel;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme