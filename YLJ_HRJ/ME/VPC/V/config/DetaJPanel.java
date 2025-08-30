package ME.VPC.V.config;

import ME.VPC.M.app.App;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Color;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings("serial")
public class DetaJPanel extends JPanel{
	//
	public JTextPane jTextPane;
	@SuppressWarnings("resource")
	public DetaJPanel(App app) {
		this.setLayout(null);
		this.setBounds(0, 0, 800, 600);
		this.setBackground(new Color(210, 210, 210));
//		Process process= Runtime.getRuntime().exec(
//				new String[] {"wmic", "cpu", "get", "ProcessorId"});
//		process.getOutputStream().close();
//		String value= "";
//		Scanner sc= new Scanner(process.getInputStream());
//		while(sc.hasNext()) {
//			value+=sc.next();
//		}
//		value+= new GetDisk().getKey();
//		process= Runtime.getRuntime().exec(
//				new String[] {"wmic", "dram", "get", "ProcessorId"});
//		process.getOutputStream().close();
//		sc= new Scanner(process.getInputStream());
//		while(sc.hasNext()) {
//			value+=sc.next();
//		}
// unix shell need
		JLabel jlabel= new JLabel();
		jlabel.setBackground(Color.orange);
		//jlabel.setText("<html><body>请将此序列号"+ value+ "拍照发送给微信客服号:15116110525"
				jlabel.setText("<html><body>请将此序列号"+ "拍照发送给微信客服号:15116110525"
				+ "<br> 罗瑶光/Yaoguang Luo"
				+ "<br>  yaoguangluo@outlook.com-313699483@qq.com-"
				+ "<br> * 15116110525-"
				+ "<br>  430181198505250014-G24402609-EB0581342"
				+ "<br>  204925063-389418686-F2406501-0626136"
				+ "<br>  湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段 208 阳光家园 第10栋"
				+ "</body></html>");

		jlabel.setBounds(0, 0, 800, 600);
		this.add(jlabel);
	}
}