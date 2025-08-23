package OSI.OSU.SI.OVI.OSQ.AVQ.SI.SD.SU.SQ.ASU.OSU.PSU.MSU.AVQ.ASQ.dNA3DShow;
import ME.VPC.S.ne.App_S;
import C_A.ME.analysis.C.A;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;import ME.VPC.M.app.App;
import I_A.IMO.EVU.bi_P.CoDNAAuthorForWord;
import Q_A.life.Application;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.HeadlessException;
import java.util.Map;

public class DNA3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ extends OSU_OVQ_OSQ_VSQ {
    
    public JButton button;
    public String path;
    public App_S u;
    public A _A;
    public Map<String, String> pos;
    public String DNNtext;

    public DNA3DShowOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ() {
        super();
    }

    public void view(App NE) {
        Application application = new Application();
        application.IV_();
        try {
            CoDNAAuthorForWord app = null;
            try {
                app = new CoDNAAuthorForWord(NE);
                app.setSize(850, 400);
                app.setVisible(true);
                JFrame f = new JFrame();
                f.add(app);
                f.setTitle("DNA三维观测");
                f.setLocationRelativeTo(null);
                f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                f.setSize(650, 480);
                f.setVisible(true);
                //app.bootZynkFlowerForest("DNA三维观测", DNNtext, true, NE);
                app.bootDNAFlowerForest("DNA三维观测", application, true);
                //application
            } catch (HeadlessException e1) {
                e1.printStackTrace();
            }
            close = false;
        } catch (Exception e) {
        }
    }

    @Override
    public OSU_OVQ_OSQ_VSQ clone() {
        objectView = (OSU_OVQ_OSQ_VSQ) super.clone();
        return objectView;
    }
}
