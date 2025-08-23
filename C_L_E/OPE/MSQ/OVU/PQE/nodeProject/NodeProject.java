package OPE.MSQ.OVU.PQE.nodeProject;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import VSQ.etl.NodeProject_X_S;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class NodeProject extends NodeProject_X_S implements ComponentListener {
    public NodeProject() {
        images = FastReadProjectFile.getDetaImageIconReader("imageread.jpg"
            , "DetaResources/imgETL/");
        jlabel = new JLabel();
        jlabel.setIcon(images);
        this.add(jlabel);
        this.validate();
        this.addComponentListener(this);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        img = images.getImage().getScaledInstance(this.width <= 0 ? 100 : this.width
            , this.height <= 0 ? 100 : this.height, java.awt.Image.SCALE_SMOOTH);
        jlabel.setIcon(new ImageIcon(img));
        jlabel.validate();
        this.validate();
    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
