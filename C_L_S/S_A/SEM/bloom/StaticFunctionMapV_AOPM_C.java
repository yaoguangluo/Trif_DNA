package S_A.SEM.bloom;

import A_I.MPE.MAQPVDCOISIV.full.FullDNATokenPDI;
import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
import VPC.PdeSwapFix.X_pdeToPds;
import VPC.PdeSwapFix.X_pdsToPde;
import VPC.PdeSwapFix.X_pdwToPdc;
import VPC.PdeSwapFix.X_textToPdw;

//著作权人+ 作者= 罗瑶光
//Refer的源码来自 《DNA 元基催化与肽计算 第三修订版本 V039010912》
//证书编号：国作登字-2021-L-00268255 (中华人民共和国 国家版权登记中心)
public interface StaticFunctionMapV_AOPM_C {
	public static IMV_SIQ annotationMap= new IMV_SIQ();
 
	//PdeSwap{
	public String PdeSwapPdcToPde(App NE);
	public String PdeSwapPdcToPds(App NE);
	//刚检查pds to pde 似乎被猫腻了, 我测试下
	//罗瑶光 MPOASCEV
	public String PdeSwapPdeToPds(App NE);
	//把FullDNATokenPDI 类里 do_PDE_RNA_FullFormular_Back 函数中的 SCEV MPOA 注释的部分 分出来到在这里。
	//罗瑶光 VECSAOPM
	public String PdeSwapPdsToPde(App NE);
	//PdeSwapFix{
	public String PdeSwapFixpdcToPde(App NE);
	public String PdeSwapFixpdcToPds(App NE);

	//刚检查pds to pde 似乎被猫腻了, 我测试下
	//罗瑶光 MPOASCEV
	public String PdeSwapFixpdeToPds(App NE);

	//把FullDNATokenPDI 类里 do_PDE_RNA_FullFormular_Back 函数中的 SCEV MPOA 注释的部分 分出来到在这里。
	//罗瑶光 VECSAOPM
	public String PdeSwapFixpdsToPde(App NE);
	public String PdeSwapFixtextToPdw(App NE) ;
	public String PdeSwapFixpdwToPdc(App NE) ;
	//下面这个test demo 展示了 密码-> 肽文-> 肽锁+肽密码-> 密钥, pds和pde密码
	//-> pds转pde验证-> pde转pds验证
	//全部封装成函数
	//罗瑶光 20210830
	@SuppressWarnings("unused")
	public static void main() {
		FullDNATokenPDI pDE_RNA_FullFormular= new FullDNATokenPDI();
		pDE_RNA_FullFormular.text= "控制吸收";
		pDE_RNA_FullFormular.pdw= X_textToPdw.textToPdw(pDE_RNA_FullFormular
    );
		pDE_RNA_FullFormular.code= X_pdwToPdc.pdwToPdc(pDE_RNA_FullFormular);
		//20230106-System.out.println("肽语: "+ pDE_RNA_FullFormular.pdw);
		//20230106-System.out.println("肽锁: "+ pDE_RNA_FullFormular.lock);
		//20230106-System.out.println("散列肽语:"+ pDE_RNA_FullFormular.code);
		////////////////////////////////////////////////////
		pDE_RNA_FullFormular.doKeyPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular, false);
		//20230106-System.out.println("静态肽展降元概率钥匙E: "+ pDE_RNA_FullFormular.pdedeKey);
		//20230106-System.out.println("静态肽展降元概率钥匙S: "+ pDE_RNA_FullFormular.pdedsKey);
		//20230106-System.out.println("静态肽展降元: "+ pDE_RNA_FullFormular.pds);
		//20230106-System.out.println("静态肽展增元概率钥匙E: "+ pDE_RNA_FullFormular.pdeieKey);
		//20230106-System.out.println("静态肽展增元概率钥匙S: "+ pDE_RNA_FullFormular.pdeisKey);
		//20230106-System.out.println("静态肽展增元: "+ pDE_RNA_FullFormular.pde);
		//////////////////////////////////////////////////////
		pDE_RNA_FullFormular.time= "" + System.currentTimeMillis();
		pDE_RNA_FullFormular.cacheId= "ID" + Math.random() + ":" + Math.random();
		//20230106-System.out.println("时间:  " + pDE_RNA_FullFormular.time);
		//20230106-System.out.println("账号随机缓存字符串:  " + pDE_RNA_FullFormular.cacheId);
		/////////////////////////////////////////////////////
		pDE_RNA_FullFormular.session_key= pDE_RNA_FullFormular.pde;
		//20230106-System.out.println("Session: " + pDE_RNA_FullFormular.session_key);
		//20230106-System.out.println("============================================");
		//20230106-System.out.println("开始前序验证：");
		//20230106-System.out.println("开始Session解析： " + pDE_RNA_FullFormular.session_key);
		//20230106-System.out.println("开始概率钥匙解析：" + pDE_RNA_FullFormular.pdedeKey
		//		+ pDE_RNA_FullFormular.pdedsKey
		//		+ pDE_RNA_FullFormular.pdeieKey+ pDE_RNA_FullFormular.pdeisKey);
		/////////////////////////////////////////////////
		FullDNATokenPDI pDE_RNA_FullFormular1= new FullDNATokenPDI();
		pDE_RNA_FullFormular1.pdedeKey= pDE_RNA_FullFormular.pdedeKey.toString();
		pDE_RNA_FullFormular1.pdedsKey= pDE_RNA_FullFormular.pdedsKey.toString();
		pDE_RNA_FullFormular1.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular1.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular.doKeyUnPress(pDE_RNA_FullFormular.code, pDE_RNA_FullFormular1, true);
		//20230106-System.out.println();
		//20230106-System.out.println("得到原降元元基DNA序列："+ pDE_RNA_FullFormular.pds);
		//20230106-System.out.println("得到新降元元基DNA序列："+ pDE_RNA_FullFormular1.pds);
		//20230106-System.out.println("得到原元基DNA序列："+ pDE_RNA_FullFormular.pde);
		//20230106-System.out.println("得到新元基DNA序列："+ pDE_RNA_FullFormular1.pde);
		//20230106-System.out.println("验证正确？");
		//20230106-System.out.println(pDE_RNA_FullFormular.pde.equals(pDE_RNA_FullFormular1.pde)
		//		? "正确": "失败");

		/////////////////////////////////////////
		//20230106-System.out.println("========================================");
		//20230106-System.out.println("开始pde降元验证：");
		FullDNATokenPDI pDE_RNA_FullFormular2= new FullDNATokenPDI();
		pDE_RNA_FullFormular2.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular2.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular2.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular2.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();
		//20230106-System.out.println("准备计算元基DNA序列："+ pDE_RNA_FullFormular1.pde);
		String pds= X_pdeToPds.pdeToPds(pDE_RNA_FullFormular1.pde,
			pDE_RNA_FullFormular2.pdedeKey
				,  pDE_RNA_FullFormular2.pdedsKey
				,  pDE_RNA_FullFormular2.pdeieKey
				,  pDE_RNA_FullFormular2.pdeisKey);
		//20230106-System.out.println("pds");
		//20230106-System.out.println("pds");
		//20230106-System.out.println(pDE_RNA_FullFormular1.pds);
		//20230106-System.out.println(pds);
		//////////////////////////////////////////////////////////////////
		//20230106-System.out.println("开始pds增元验证：");
		FullDNATokenPDI pDE_RNA_FullFormular3= new FullDNATokenPDI();
		pDE_RNA_FullFormular3.pdeieKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdeisKey= pDE_RNA_FullFormular.pdeisKey.toString();
		pDE_RNA_FullFormular3.pdedeKey= pDE_RNA_FullFormular.pdeieKey.toString();
		pDE_RNA_FullFormular3.pdedsKey= pDE_RNA_FullFormular.pdeisKey.toString();

		String pde= X_pdsToPde.pdsToPde(pDE_RNA_FullFormular1.pds,
			pDE_RNA_FullFormular3.pdedeKey
				, pDE_RNA_FullFormular3.pdedsKey
				, pDE_RNA_FullFormular3.pdeieKey
				, pDE_RNA_FullFormular3.pdeisKey);
		//20230106-System.out.println("pde");
		//20230106-System.out.println("pde");
		//20230106-System.out.println(pDE_RNA_FullFormular1.pde);
		//20230106-System.out.println(pde);
	}

	//DetaDBUtil {
	public String DetaDBUtilDBRequest(App NE);
	public String DetaDBUtilbackEndRequest(App NE);
	public String DetaDBUtilcacheRequest(App NE);
	public void IV_CulumnNameType(App NE) ;
	public boolean withoutCulumnNameType(App NE) ;

	// DetaFrontEndUtil {
	public String DetaFrontEndUtilbackEndRequest(App NE) ;
	//先不动 稍后归纳 华瑞集rest走 前端还是后端还是数据库。
	public String DetaFrontEndUtilhuaRuiJiRequest(App NE)  ;
	public String DetaFrontEndUtilcacheRequest(App NE)  ;

	//DetaUtil {
	public void IV_DB(App NE);

	//GzipUtil {
	// 压缩
	public byte[] compressBytes(App NE);
	public byte[] compress(App NE);
	public byte[] uncompress(App NE);
	//jogl 画图略
}
