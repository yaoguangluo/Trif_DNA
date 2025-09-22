package OSI.OSU.SI.OSI.AVI.AEI.ACI.ASI.OVI.OEI.OCI.OSI.PVI.PEI.PCI.PSI.addXinShengErBook;
import ME.VPC.S.ne.App_S;
import E_A.ME.analysis.E.CogsBinaryForest_AE;
import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OVQ_OSQ_VSQ;import ME.VPC.M.app.App;
import I_A.IMO.EVU.bi_P.CoAuthorForWord;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.HeadlessException;
import java.util.Map;
public class AddXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ extends OSU_OVQ_OSQ_VSQ{

	public JButton button;
	public String path;
	public App_S u;
	public CogsBinaryForest_AE _A;
	public Map<String, String> pos;
	public String DNNtext;
	public AddXinShengErBookOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ(){
		super();
	}
	public void view(App NE) {
		try {
			CoAuthorForWord app= null;
			try {
				app= new CoAuthorForWord(NE);
				app.setSize(850, 400);
				app.setVisible(true);
				JFrame f= new JFrame();
				f.add(app);
				f.setTitle("处方DNN功效观测");
				f.setLocationRelativeTo(null);
				f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				f.setSize(650, 480);
				f.setVisible(true);
				app.bootZynkFlowerForest("药方功效森林", DNNtext, true, NE);
			} catch (HeadlessException e1) {
					e1.printStackTrace();
			}   
			close= false;
		}catch(Exception e) {
		}
		
	}
	@Override
	public OSU_OVQ_OSQ_VSQ clone() {
		objectView= (OSU_OVQ_OSQ_VSQ)super.clone();  
		return objectView;  
	}  
}
