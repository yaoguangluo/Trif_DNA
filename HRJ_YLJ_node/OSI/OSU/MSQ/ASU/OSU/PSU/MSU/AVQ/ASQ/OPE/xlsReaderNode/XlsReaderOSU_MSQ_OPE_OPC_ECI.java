package OSI.OSU.MSQ.ASU.OSU.PSU.MSU.AVQ.ASQ.OPE.xlsReaderNode;

import OPE.OEQ.MCQ.OVU.PQE.osgi.OSU_OPE_OPC_ECI;
//作者 + 著作权人： 罗瑶光, 浏阳
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
public class XlsReaderOSU_MSQ_OPE_OPC_ECI extends OSU_OPE_OPC_ECI {
	
	public int value= 0;
	public String filepath;
	public XlsReaderOSU_MSQ_OPE_OPC_ECI( ) {
	}
	public void run(final XlsReaderOSU_MSQ_AVQ_ASQ_OVQ_OSQ_VSQ _SQ__OVQ_OSQ_VSQ) {
		this.setLayout(null);
		System.out.println("runed"+value);	
		_SQ__OVQ_OSQ_VSQ.tableout=this.toptablein; 	
	}
}
