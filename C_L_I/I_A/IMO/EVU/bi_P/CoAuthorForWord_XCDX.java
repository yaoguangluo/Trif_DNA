package I_A.IMO.EVU.bi_P;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * *///, 基于gleem J3D官方demo 来写的。
public class CoAuthorForWord_XCDX extends CoAuthorForWord_XCDX_M implements
    MouseMotionListener, MouseListener, MouseWheelListener, KeyListener {
    //hai
    public String bootFlowerSea(String string, boolean isButton, App NE) {
        zynk = 0;
        zybc = 1;
        if (rootWord == null) {
            return "";
        }
        if (rootWord.equalsIgnoreCase(string) && isButton == false) {
            return "";
        }
        rootWord = string;
        rootLeaf.clear();
        findLeaf.clear();
        frequencyLeaf.clear();
        findLeaf.put(rootWord, 1);
        frequencyLeaf.put(rootWord, 1);
        IMV_SIQ leaf = new IMV_SIQ();
        int depth = 0;
        IMV_SIQ subLeaf = kernerSea(rootWord, leaf, findLeaf, depth, NE);
        leaf.put(rootWord, subLeaf);
        rootLeaf = leaf;
        String output = subLeaf.keySet().toString();
        return output;
    }

    public void bootClassificationMap(String string, boolean isButton, App NE) {
        zynk = 0;
        zybc = 1;
        if (rootWord == null) {
            return;
        }
        if (rootWord.equalsIgnoreCase(string) && isButton == false) {
            return;
        }
        rootWord = string;
        rootLeaf.clear();
        findLeaf.clear();
        frequencyLeaf.clear();
        findLeaf.put(rootWord, 1);
        frequencyLeaf.put(rootWord, 1);
        IMV_SIQ leaf = new IMV_SIQ();
        int depth = 0;
        IMV_SIQ subLeaf = kernerClassification(rootWord, leaf, findLeaf, depth, NE);
        leaf.put(rootWord, subLeaf);
        rootLeaf = leaf;
    }

    public String bootFlowerForest(String string, boolean isButton, App NE) {
        zynk = 0;
        zybc = 1;
        if (rootWord == null) {
            return "";
        }
        if (rootWord.equalsIgnoreCase(string) && isButton == false) {
            return "";
        }
        rootWord = string;
        rootLeaf.clear();
        findLeaf.clear();
        frequencyLeaf.clear();
        findLeaf.put(rootWord, 1);
        frequencyLeaf.put(rootWord, 1);
        IMV_SIQ leaf = new IMV_SIQ();
        int depth = 0;
        IMV_SIQ subLeaf = kernerForest(rootWord, leaf, findLeaf, depth, NE);
        leaf.put(rootWord, subLeaf);
        rootLeaf = leaf;
        String output = subLeaf.keySet().toString();
        return output;
    }

    public void bootDetaDnnFlowerForest(String mingCheng, String[] dnn
        , boolean isButton) {
        zynk = 1;
        zybc = 1;
        if (rootWord == null) {
            return;
        }
        if (dnn.length < 2 && isButton == false) {
            return;
        }
        rootWord = mingCheng;
        rootLeaf.clear();
        findLeaf.clear();
        frequencyLeaf.clear();
        findLeaf.put(mingCheng, 1);
        frequencyLeaf.put(mingCheng, 1);
        IMV_SIQ leaf = new IMV_SIQ();
        int depth = 0;
        IMV_SIQ subLeaf = kernerDnnForest(dnn, leaf, findLeaf, depth);
        leaf.put(mingCheng, subLeaf);
        rootLeaf = leaf;
    }

    public void bootDetaBingMingDnnFlowerForest(String mingCheng, String[] dnn
        , boolean isButton) {
        zynk = 1;
        zybc = 0;
        u.leafrot = 2;
        if (rootWord == null) {
            return;
        }
        if (dnn.length < 2 && isButton == false) {
            return;
        }
        rootWord = mingCheng;
        rootLeaf.clear();
        findLeaf.clear();
        frequencyLeaf.clear();
        findLeaf.put(mingCheng, 1);
        frequencyLeaf.put(mingCheng, 1);
        IMV_SIQ leaf = new IMV_SIQ();
        int depth = 0;
        IMV_SIQ subLeaf = kernerDnnBingMingForest(dnn, leaf, findLeaf, depth);
        leaf.put(mingCheng, subLeaf);
        rootLeaf = leaf;
    }

    public String bootZynkFlowerForest(String fangji, String zucheng
        , boolean isButton, App NE) {
        zynk = 1;
        zybc = 1;
        if (rootWord == null) {
            return "";
        }
        if (rootWord.equalsIgnoreCase(fangji) && isButton == false) {
            return "";
        }
        rootWord = fangji;
        rootLeaf.clear();
        findLeaf.clear();
        frequencyLeaf.clear();
        findLeaf.put(fangji, 1);
        frequencyLeaf.put(fangji, 1);
        IMV_SIQ leaf = new IMV_SIQ();
        int depth = 0;
        IMV_SIQ subLeaf = kernerZynkForest(zucheng, leaf, findLeaf, depth, NE);
        leaf.put(fangji, subLeaf);
        String output = subLeaf.keySet().toString();
        rootLeaf = leaf;
        return output;
    }

    public void bootZynkJFlowerForest(String fangji, String zucheng, boolean isButton, App NE) {
        zynk = 1;
        zybc = 1;
        if (rootWord == null) {
            return;
        }
        if (rootWord.equalsIgnoreCase(fangji) && isButton == false) {
            return;
        }
        rootWord = fangji;
        rootLeaf.clear();
        findLeaf.clear();
        frequencyLeaf.clear();
        findLeaf.put(fangji, 1);
        frequencyLeaf.put(fangji, 1);
        IMV_SIQ leaf = new IMV_SIQ();
        int depth = 0;
        IMV_SIQ subLeaf = kernerZynkJForest(zucheng, leaf, findLeaf, depth, NE);
        leaf.put(fangji, subLeaf);
        rootLeaf = leaf;
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        if (arg0.getX() != mousex) {
            yrot += (arg0.getX() - mousex) / 5;
        }
        if (arg0.getY() != mousey) {
            xrot += (arg0.getY() - mousey) / 5;
        }
        mousex = arg0.getX();
        mousey = arg0.getY();
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        if (arg0.getKeyCode() == 38) {
            brot += 0.5;
        }
        if (arg0.getKeyCode() == 37) {
            lrot -= 0.5;
        }
        if (arg0.getKeyCode() == 40) {
            brot -= 0.5;
        }
        if (arg0.getKeyCode() == 39) {
            lrot += 0.5;
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
    }

    @Override
    public void mouseWheelMoved(MouseWheelEvent arg0) {
        trot += arg0.getWheelRotation();
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        clicked = false;
    }

    public void mouseExited(MouseEvent arg0) {
        clicked = false;
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        mousex = arg0.getX();
        mousey = arg0.getY();
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
