package U_A.PEU.P.dna;
import ME.VPC.S.ne.App_S;
import A_I.MPE.MAQPVDCOISIV.pdi.TokenPDI;
import E_A.OSI.AOP.PCS.PP.company_E.LoginServiceImpl;
import ME.VPC.M.app.App;
import M_V.MSU.sessionValidation.X_sessionInitByTokenPDICertsDNA;
import M_V.MSU.sessionValidation.X_sessionTokenCertsInitWithHumanWordsByDNA;
import S_A.SVQ.stable.S_Token;
import U_A.PEU.P.md5.Usr;
import U_A.PEU.P.md5.UsrToken;
import U_V.ESU.string.String_ESU_X_charsetSwap;
import U_V.ESU.string.String_ESU_X_stringToURIencode;

import java.util.Map;
//从VPC分离出来
//MD5的token也是罗瑶光先生设计的, 这里分出来到 dna processor, 备注下
//准备把响应事件移植到这里。
//设计成一个档案文件一个密钥文件。
//作者罗瑶光
/*
 * 著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class DNAAuth {
	//写个新的DNA status 跟之前的区分开来
	//稍后合并下, 并新陈代谢下 把status的 裁出来。
	public static boolean DNAAuthStatusCheckEmailAndPds(App app, String string
			, Map<String, String> data)  {
		//同理稍后做pds
		String uEmail= "id";
		String uPassword= "password";
		//检查是否有email id
		if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
			uEmail= "uEmail";
			uPassword= "uPassword";
			if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
				return false;
			}
		}
		//检查db是否有email id
		Usr usr= LoginServiceImpl.findUsrByUEmail(data.get(uEmail));
		if(null== usr.getuEmail()) {
			return false;
		}
		//数据库取密
		UsrToken usrToken
		= LoginServiceImpl.findUsrTokenByUId(Integer.valueOf(usr.getuId()));
		if(null== usrToken.getuPassword()) {
			return false;
		}
		//取密进行加密
		String[] MD5dice_DNA= usrToken.getuKey().split(S_Token.ETL_SYMBOL_SMILL);
		if(0== MD5dice_DNA.length) {
			return false;
		}
		//humanpassword-> tvmpassword
		TokenCerts tokenCerts
		= X_sessionTokenCertsInitWithHumanWordsByDNA._E(data.get(uPassword)
				, true, MD5dice_DNA[0]);
		//tvmpassword->pde, dps
		TokenPDI tokenPDI= new TokenPDI();
		TokenPDI bootTokenPDI= new TokenPDI();
		tokenPDI.pdedeKey= MD5dice_DNA[1];
		tokenPDI.pdedsKey= MD5dice_DNA[2];
		tokenPDI.pdeieKey= MD5dice_DNA[3];
		tokenPDI.pdeisKey= MD5dice_DNA[4];
		bootTokenPDI.doKeyUnPress(tokenCerts.getPdnPassword(), tokenPDI, true);
		//对比 入参密码的加密 与 DB获取PDE密码
		if(tokenPDI.pds.equals(usrToken.getuPassword())) {
			return true;
		}
		return false;
	}
	//写个新的DNA status 跟之前的区分开来
	public static boolean DNAAuthStatusCheckEmailAndPde(App app, String string
			, Map<String, String> data)  {
		String uEmail= "id";
		String uPassword= "password";
		//检查是否有email id
		if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
			return false;
		}
		//检查db是否有email id
		Usr usr= LoginServiceImpl.findUsrByUEmail(data.get(uEmail));
		if(null== usr.getuEmail()) {
			return false;
		}
		//数据库取密
		UsrToken usrToken
		= LoginServiceImpl.findUsrTokenByUId(Integer.valueOf(usr.getuId()));
		if(null== usrToken.getuPassword()) {
			return false;
		}
		//对比 入参密码的加密 与 DB获取PDE密码
		if(data.get(uPassword).equals(usrToken.getuPassword())) {
			return true;
		}
		return false;
	}
	
	//写个新的DNA status 跟之前的区分开来
	//vpcs standard 化, 稍后化简 20210811 罗瑶光
	public static boolean DNAAuthStatusCheckEmailAndPassword(App_S app, String string
			, Map<String, String> data)  {
		String uEmail= "id";
		String uPassword= "password";
		//检查是否有email id
		if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
			uEmail= "uEmail";
			uPassword= "uPassword";
			if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
				uEmail= "email";
				uPassword= "password";
				if(!data.containsKey(uEmail)|| !data.containsKey(uPassword)) {
					return false;
				}
			}
		}
		//检查db是否有email id
		//第一次不能走db, 不然就会认证 循环,
		Usr usr= LoginServiceImpl.findUsrByUEmail(data.get(uEmail));
		if(null== usr.getuEmail()) {
			if(null!= data.get("uType")) {
				if(data.get("uType").equals("register")) {
					return true;
				}
			}
			return false;
		}
		//数据库取密
		UsrToken usrToken
		= LoginServiceImpl.findUsrTokenByUId(Integer.valueOf(usr.getuId()));
		if(null== usrToken.getuPassword()) {
			return false;
		}
		//取密进行加密
		String[] MD5dice_DNA= usrToken.getuKey().split(S_Token.ETL_SYMBOL_SMILL);
		if(0== MD5dice_DNA.length) {
			return false;
		}
		//humanpassword-> tvmpassword
		TokenCerts tokenCerts
		= X_sessionTokenCertsInitWithHumanWordsByDNA._E(data.get(uPassword)
				, true, MD5dice_DNA[0]);
		//tvmpassword->pde, dps
		TokenPDI tokenPDI= new TokenPDI();
		TokenPDI bootTokenPDI= new TokenPDI();
		tokenPDI.pdedeKey= MD5dice_DNA[1];
		tokenPDI.pdedsKey= MD5dice_DNA[2];
		tokenPDI.pdeieKey= MD5dice_DNA[3];
		tokenPDI.pdeisKey= MD5dice_DNA[4];
		bootTokenPDI.doKeyUnPress(tokenCerts.getPdnPassword(), tokenPDI, true);
		//对比 入参密码的加密 与 DB获取PDE密码
		if(tokenPDI.pde.equals(usrToken.getuPassword())) {
			return true;
		}
		return false;
	}
	
	public static boolean DNAAuthCheck(App app, String string, Map<String, String> data)
			 {
		//养疗经的DNA加密展示 全局检查密钥 调试已经成功, .
		String id= data.containsKey("id")? data.get("id"): "";
		String password= data.get("password");
		String de= data.containsKey("de")? data.get("de"): "";// data.get("de");
		String ds= data.containsKey("ds")? data.get("ds"): "";// data.get("ds");
		String ie= data.containsKey("ie")? data.get("ie"): "";// data.get("ie");
		String is= data.containsKey("is")? data.get("is"): "";// data.get("is");
		String lock= data.containsKey("lock")? data.get("lock"): "";// data.get("lock");
		//也可已放数据表中.不在rest里面发送.
		TokenPDI pDE_RNA_Formular= new TokenPDI();
		TokenPDI pDE_RNA_Formular1= new TokenPDI();
		TokenPDI pDE_RNA_Formular2= new TokenPDI();
		pDE_RNA_Formular2.pdeieKey= de;
		pDE_RNA_Formular2.pdeisKey= ds;
		pDE_RNA_Formular2.pdedeKey= ie;
		pDE_RNA_Formular2.pdedsKey= is;

		////20230106-System.out.println("准备计算元基DNA序列："+ token.getmPassword());
		//加了老版本集成, 先去掉dnn计算的DNA假数据测试。罗瑶光 20210730
		//if(null== password) {
			id= "313699483@qq.com";
			String idString= String_ESU_X_charsetSwap._E(id, "UTF8", "UTF8");
			String idEncoder= String_ESU_X_stringToURIencode._E(idString, "UTF8");
			password= "Fengyue1985!";
			//加密
			TokenCerts tokenCerts
			= X_sessionTokenCertsInitWithHumanWordsByDNA._E(password, false
					, null);
			Token token= X_sessionInitByTokenPDICertsDNA._E(tokenCerts);
			String passwordString= String_ESU_X_charsetSwap._E(token.getmPassword(), "UTF8"
					, "UTF8");
			String passwordEncoder= String_ESU_X_stringToURIencode._E(passwordString, "UTF8");
			//20230106-System.out.println("pds--1>"+ tokenCerts.getPds());
			id= idEncoder.toString();
			password= passwordEncoder.toString();
			de= token.getUpdsde();
			ds= token.getUpdsds();
			ie= token.getUpdsie();
			is= token.getUpdsis();	
			pDE_RNA_Formular2.pdeieKey= de;
			pDE_RNA_Formular2.pdeisKey= ds;
			pDE_RNA_Formular2.pdedeKey= ie;
			pDE_RNA_Formular2.pdedsKey= is;
			lock= tokenCerts.getPdnLock();
		//}
		pDE_RNA_Formular2.doSessionKeyUnPress(password, pDE_RNA_Formular2, true);
		//20230106-System.out.println("pds--2>"+ pDE_RNA_Formular2.pds);

		@SuppressWarnings("unused")
		String DB_id= "313699483@qq.com";

		//String DB_id= id;
		//模拟本地数据库计算DB_password 在数据库user表中通过DB_id 来获取. 大家好理解吧. 
		String DB_password= "Fengyue1985!";

		//String lock= data.get("lock");//也可已放数据表中.不在rest里面发送.
		//DB_password to lock DB
		tokenCerts
		= X_sessionTokenCertsInitWithHumanWordsByDNA._E(DB_password, true, lock);
		pDE_RNA_Formular1.pdedeKey= de;
		pDE_RNA_Formular1.pdedsKey= ds;
		pDE_RNA_Formular1.pdeieKey= ie;
		pDE_RNA_Formular1.pdeisKey= is;
		pDE_RNA_Formular.doKeyUnPress(tokenCerts.getPdnPassword(), pDE_RNA_Formular1, true);
		//20230106-System.out.println("pds--3>"+ pDE_RNA_Formular1.pds);
		//开始比对
		if(!pDE_RNA_Formular1.pde.equalsIgnoreCase(password)? true: false) {
			return false;
			//成功就放下走, 不成功就返回了失败.
			//以后有时间我包装成完美的 DNA VPCS 包。优先级降低。
			//罗瑶光 20210422
		}
		return true;
	}
}
