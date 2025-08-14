/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
package O_V.OSI.OSU.AVU.OSQ.wavePlay;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;
import U_A.PEU.P.sound.SoundWaveVector;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.geom.Line2D;
import java.util.Vector;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class WavePlayOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ extends OSU_OVQ_OSQ_VSQ {

    public JButton button;
    public String path;
    @SuppressWarnings("rawtypes")
    public Vector lines = new Vector();

    public WavePlayOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ() {
    }

    public void view() {
        scrollPane = new ScrollPane();
        //show graph
        SoundWaveVector sv = new SoundWaveVector();
        lines = sv.getVectorLines(lygout);
        panel = new Panel() {


            @SuppressWarnings("unused")
            public void paint(Graphics g) {
                Dimension d = this.getSize();
                int w = 80000;
                int h = 600;
                // //20230106-System.out.println(d.width+"**"+d.height);
                int INFOPAD = 15;
                //Graphics g= getGraphics();
                Graphics2D g2 = (Graphics2D) g;
                g2.setBackground(Color.white);
                g2.clearRect(0, 0, w, h);
                g2.setColor(Color.white);
                g2.fillRect(0, h - INFOPAD, w, INFOPAD);
                if (lygout != null) {
                    // .. render sampling graph ..
                    g2.setColor(Color.black);
                    for (int i = 1; i < lines.size(); i++) {
                        Line2D v = (Line2D) lines.get(i);
                        g2.draw((Line2D) lines.get(i));
                    }
                }
            }
        };
        //
        scrollPane.add(panel);
        add(scrollPane);
        close = false;
    }

    @Override
    public OSU_OVQ_OSQ_VSQ clone() {
        objectView = (OSU_OVQ_OSQ_VSQ) super.clone();
        return objectView;
    }
}
