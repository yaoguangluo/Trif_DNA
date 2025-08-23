package S_I.OSI.OSU.VSQ.OSU.MSQ.VQ.SQ.lygPlayer;


import javax.swing.JFrame;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import U_A.PEU.P.movie.LYGFileIO;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class LYGPlayerOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {

	public int value= 0;
	public String filepath;
	public String writefile;
	Jp jj;
	public String filepathWAV;
	public LYGPlayerOSU_MSQ_OPE_OPC_ECI(){
 	}
	public void run(final LYGPlayerOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ)
			{
		 _SQ__OVQ_OSQ_VSQ.lygout= new LYGFileIO();
		 jj= new Jp(filepath);		 JFrame ff= new JFrame();
		 ff.add(jj);
	     ff.setSize(800, 600);
	     ff.setVisible(true);
	     //20230106-System.out.println("run end");
	}
}
