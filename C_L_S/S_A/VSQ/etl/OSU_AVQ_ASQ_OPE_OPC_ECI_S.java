package S_A.VSQ.etl;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
import S_I.OSI.PEI.PCI.PSI.tinShell.TinMap;
import U_A.PEU.P.movie.LYGFileIO;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.util.Map;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class OSU_AVQ_ASQ_OPE_OPC_ECI_S extends JPanel implements Cloneable{

	public OSU_OPE_OPC_ECI addr;
	public JTable toptablein;
	public Map<String, Integer> topMapIn;
	public int[][] topgin;
	public String topsin;
	public AudioInputStream topaisin;
	public LYGFileIO toplygin;
	public TinMap topOutput;//准备做文章流计算的内存 罗瑶光20211008
	
	public JTable midtablein;
	public int[][] midgin;
	public AudioInputStream midaisin;
	public LYGFileIO midlygin;
	public TinMap midOutput;//准备做文章流计算的内存 罗瑶光20211008

	public JTable downtablein;
	public int[][] downgin;
	public AudioInputStream downaisin;
	public LYGFileIO downlygin;
	public TinMap downOutput;//准备做文章流计算的内存 罗瑶光20211008
}
