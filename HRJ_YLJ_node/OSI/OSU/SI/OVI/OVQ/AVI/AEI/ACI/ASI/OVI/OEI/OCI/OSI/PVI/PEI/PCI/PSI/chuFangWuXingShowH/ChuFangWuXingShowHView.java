package OSI.OSU.SI.OVI.OVQ.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.chuFangWuXingShowH;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ChuFangWuXingShowHView extends OSU_OVQ_OSQ_VSQ {
    
    public JButton button;
    public String path;

    public ChuFangWuXingShowHView() {
        super();
    }

    public void view()  {
        scrollPane = new ScrollPane();
        panel = new Panel() {
            

            public void paint(Graphics g) {
                ImageIcon image = null;
                image = FastReadProjectFile.getDetaImageIconReader("bagua_ljbz.png"
                        , "pngs/");
                //ImageIcon image=new ImageIcon(getClass().getResource("bagua_ljbz.png"));
                Image im = image.getImage();
                g.drawImage(im, 0, 0, this);
                g.drawString("" + ((topMapOut.containsKey("手少阳") ? topMapOut.get("手少阳") : 0)
                        + (topMapOut.containsKey("手少阴") ? topMapOut.get("手少阴") : 0)
                        + (topMapOut.containsKey("手厥阴") ? topMapOut.get("手厥阴") : 0)
                        + (topMapOut.containsKey("手太阳") ? topMapOut.get("手太阳") : 0)
                ), 320 - 30, 15);
                g.drawString("" + ((topMapOut.containsKey("足少阳") ? topMapOut.get("足少阳") : 0)
                ), 20, 70);
                g.drawString("" + ((topMapOut.containsKey("足厥阴") ? topMapOut.get("足厥阴") : 0)
                ), 20, 210);
                g.drawString("" + ((topMapOut.containsKey("足阳明") ? topMapOut.get("足阳明") : 0)
                        + (topMapOut.containsKey("手少阳") ? topMapOut.get("手少阳") : 0)
                ), 50, 350);
                g.drawString("" + ((topMapOut.containsKey("足少阴") ? topMapOut.get("足少阴") : 0)
                        + (topMapOut.containsKey("足太阳") ? topMapOut.get("足太阳") : 0)
                        + (topMapOut.containsKey("手少阳") ? topMapOut.get("手少阳") : 0)
                ), 320 - 30, 300);
                g.drawString("" + ((topMapOut.containsKey("手阳明") ? topMapOut.get("手阳明") : 0)
                ), 500, 300);
                g.drawString("" + ((topMapOut.containsKey("手太阴") ? topMapOut.get("手太阴") : 0)
                ), 550, 210);
                g.drawString("" + ((topMapOut.containsKey("手太阴") ? topMapOut.get("手太阴") : 0)
                ), 500 - 30, 70);
            }
        };
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
