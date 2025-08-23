package ME.VPC.M.X;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import ME.VPC.M.app.App;
import M_V.MVQ.textfield.CfxTextField;
import M_V.MVQ.textpane.CfxTextPane;
import S_A.SEM.bloom.InitonTalk;
import S_A.SVQ.stable.S_File;
import S_A.SVQ.stable.S_Tag;
import S_A.pheromone.AES_QMS_XSD_TIH;
import S_A.pheromone.IMV_SIQ;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.io.IOException;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * * 作者的家庭是父亲 罗荣武，母亲 刘瑞珍，女儿 christina.yaja.luo/罗雅佳, 前妻ringli/李妙环。
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
public class App_XCDX {
	public App app;

	public void IV_(App app) {
		this.app = app;
	}

	// String[] 传参因子= new String[4];
	// 稍后准备将staticClassMap 移到 StaticFunctionMapM_VECS_C 下
	// , 24组相关配置全部改下。这样代码就少了, 就快了。
	public JTextField nameFeelFilter(App NE) throws InterruptedException, IOException {
		NE._I_U.string = new AES_QMS_XSD_TIH("");
		IMV_SIQ map = InitonTalk.listenFlower(
				"执行 " + "M_VECS" + " 下 " + "CfxTextField" + " 接口, 参数是 传参因子",
				"CfxTextField", "M_VECS", NE);
		app.app_S.nameFeelFilter = (CfxTextField) map.get("interfaceReturn");
		app.app_S.nameFeelFilter.setBounds(180 - 50, 50, 380, 80);
		app.app_S.nameFeelFilter.setBackground(new Color(210, 210, 210));
		app.app_S.nameFeelFilter.setText(S_Tag.STRING_SPACE);
		app.app_S.nameFeelFilter.addKeyListener(app);
		return app.app_S.nameFeelFilter;
	}

	public JPanel panel() {
		app.app_S.panel_yt = new JPanel();
		app.app_S.panel_yt.setBackground(new Color(210, 210, 210));
//		app.app_S.pngy_2_1
//		= new ImageIcon(new YaoCaiIndex().getClass().getResource(S_File.yc_2_1_png));
		app.app_S.pngy_2_1 = FastReadProjectFile.getDetaImageIconReader(
				S_File.yc_2_1_png, "DetaResources/yaoCaiTu/");
		app.app_S.yaoCaiLabel = new JLabel(app.app_S.pngy_2_1);
		app.app_S.panel_yt.add(app.app_S.yaoCaiLabel);
		return app.app_S.panel_yt;
	}

	public JTextPane data(App NE) throws InterruptedException, IOException {
		NE._I_U.string = new AES_QMS_XSD_TIH(S_Tag.NEI_RONG);
		// 这些需要从 initonflower里面 获取参数。以后
		NE._I_U.x = 1350;
		NE._I_U.y = 2980;
		NE._I_U.c = null;
		// app.app_S.data= new CfxTextPane(S_Tag.NEI_RONG, 1350,
		// 2980, null);
		IMV_SIQ map = InitonTalk.listenFlower(
				"执行 " + "M_VECS" + " 下 " + "CfxTextPane" + " 接口, 参数是 传参因子",
				"CfxTextPane", "M_VECS", NE);
		// example 不断的 talk 人性化 序列化即可，搞这个不是我罗瑶光的下一步重点，所以优先级降低。
		// 社会人士别盯着我，看电影都要门票，你就是看破解版 也要每月手机充值费吧，入网要网费，电费啊，老子进过你们一分钱？
		app.app_S.data = (CfxTextPane) map.get("interfaceReturn");
		app.app_S.data.setBounds(850, 150, 1350, 2980);
		// app.app_S.data.setBackground(new Color(252, 242, 252));
		app.app_S.data.setBackground(new Color(210, 210, 210));
		Box buttonBoxLineTwo = new Box(BoxLayout.X_AXIS);
		buttonBoxLineTwo.setBounds(0, 22, 450, 20);
		return app.app_S.data;
	}

	public JTextField name(App NE) throws InterruptedException, IOException {
		NE._I_U.string = new AES_QMS_XSD_TIH("");
		IMV_SIQ map = InitonTalk.listenFlower(
				"执行 " + "M_VECS" + " 下 " + "CfxTextField" + " 接口, 参数是 传参因子",
				"CfxTextField", "M_VECS", NE);
		// 分词动+名，壮+补，取指令，---不可取，AOPM繁琐。
		// 关键字+固定格式，可以，因为人类也就那么IDUQ几种词语表示执行。。
		Object object = map.get("interfaceReturn");
		CfxTextField cfxTextField = (CfxTextField) object;
		NE.app_S.name = cfxTextField;
		NE.app_S.name.setBounds(180 - 50, 50, 380, 80);
		NE.app_S.name.setBackground(new Color(210, 210, 210));
		NE.app_S.name.setText(S_Tag.STRING_SPACE);
		NE.app_S.name.addKeyListener(NE);
		return NE.app_S.name;
	}

	public JTextField nameHospital(App NE) throws InterruptedException, IOException {
		NE._I_U.string = new AES_QMS_XSD_TIH("");
		IMV_SIQ map = InitonTalk.listenFlower(
				"执行 " + "M_VECS" + " 下 " + "CfxTextField" + " 接口, 参数是 传参因子",
				"CfxTextField", "M_VECS", NE);
		app.app_S.nameHospital = (CfxTextField) map.get("interfaceReturn");
		app.app_S.nameHospital.setBounds(180 - 50, 50, 380, 80);
		app.app_S.nameHospital.setBackground(new Color(210, 210, 210));
		app.app_S.nameHospital.setText(S_Tag.STRING_SPACE);
		app.app_S.nameHospital.addKeyListener(app);
		return app.app_S.nameHospital;
	}

	public JTextField name_filter(App NE) throws InterruptedException, IOException {
		NE._I_U.string = new AES_QMS_XSD_TIH("");
		IMV_SIQ map = InitonTalk.listenFlower(
				"执行 " + "M_VECS" + " 下 " + "CfxTextField" + " 接口, 参数是 传参因子",
				"CfxTextField", "M_VECS", NE);
		app.app_S.name_filter = (CfxTextField) map.get("interfaceReturn");
		app.app_S.name_filter.setBounds(180 - 50, 50, 380, 80);
		app.app_S.name_filter.setBackground(new Color(210, 210, 210));
		app.app_S.name_filter.setText(S_Tag.STRING_SPACE);
		app.app_S.name_filter.addKeyListener(app);
		return app.app_S.name_filter;
	}

	public JTextField name_filter_not_have(App NE) throws InterruptedException, IOException {// 某种稳定的函数执行与固定搭配。
		NE._I_U.string = new AES_QMS_XSD_TIH("");
		IMV_SIQ map = InitonTalk.listenFlower(
				"执行 " + "M_VECS" + " 下 " + "CfxTextField" + " 接口, 参数是 传参因子",
				"CfxTextField", "M_VECS", NE);
		app.app_S.name_filter_not_have = (CfxTextField) map
				.get("interfaceReturn");
		app.app_S.name_filter_not_have.setBounds(180 - 50, 50, 380, 80);
		app.app_S.name_filter_not_have.setBackground(new Color(210, 210, 210));
		app.app_S.name_filter_not_have.setText(S_Tag.STRING_SPACE);
		app.app_S.name_filter_not_have.addKeyListener(app);
		return app.app_S.name_filter_not_have;
	}
}

//41        String callFunctionKey = "CfxTextField";
//        //StaticRootMap.initMap();
//        String[] strings = new String[1];
//        IMV_SIQ output = new IMV_SIQ();
//        IMV_SIQ inputValue = new IMV_SIQ();
//        String[] 传参因子
//                = StaticFunctionMapM_VECS_C.annotationMap.get(callFunctionKey).split(":");
//        NE._I_U.string = null;
//        NE._I_U.x = 0;
//        NE._I_U.y = 0;
//        NE._I_U.c = null;
//        //下面4行已无效，局部删除避免堆栈出错，所以之后统一去除。罗瑶光大花匠20241004
//        inputValue.put(传参因子[0], null);
//        inputValue.put(传参因子[1], 0);
//        inputValue.put(传参因子[2], 0);
//        inputValue.put(传参因子[3], null);
//        //
//        output.put("传参因子", 传参因子);
//
//        output.put("inputValues", inputValue);
//        //strings[0]= "执行 元基花 下 "+ callFunctionKey+ " 接口, 参数是 传参因子";
//        strings[0] = "执行 M_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//
//        StaticRootMap.tinShellV006(strings, output);
//        @SuppressWarnings("unchecked")
//        IMV_SIQ map = (IMV_SIQ) output.get(callFunctionKey);

//        NE._I_U.string= null;
//        NE._I_U.x=0;
//        NE._I_U.y=0;
//        NE._I_U.c=null;
//app.app_S.data= new CfxTextPane(S_Tag.NEI_RONG, 1350, 2980, null);

//app.app_S.name_filter= new CfxTextField(null, 0, 0, null);
//        String callFunctionKey = "CfxTextField";
//        //StaticRootMap.initMap();
//        String[] strings = new String[1];
//        IMV_SIQ output = new IMV_SIQ();
//        IMV_SIQ inputValue = new IMV_SIQ();
//        String[] 传参因子
//                = StaticFunctionMapM_VECS_C.annotationMap.get(callFunctionKey).split(":");
//        NE._I_U.string=null;
//        NE._I_U.x=0;
//        NE._I_U.y=0;
//        NE._I_U.c=null;
//        inputValue.put(传参因子[0], null);
//        inputValue.put(传参因子[1], 0);
//        inputValue.put(传参因子[2], 0);
//        inputValue.put(传参因子[3], null);
//        output.put("传参因子", 传参因子);
//        output.put("inputValues", inputValue);
//        strings[0] = "执行 M_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//        StaticRootMap.tinShellV005(strings, output, NE);
//        @SuppressWarnings("unchecked")
//        IMV_SIQ map = (IMV_SIQ) output.get(callFunctionKey);

//        NE._I_U.string= null;
//        NE._I_U.x=0;
//        NE._I_U.y=0;
//        NE._I_U.c=null;
//app.app_S.data= new CfxTextPane(S_Tag.NEI_RONG, 1350, 2980, null);

//app.app_S.name_filter_not_have= new CfxTextField(null, 0, 0, null);
//        String callFunctionKey = "CfxTextField";
//        //StaticRootMap.initMap();
//        String[] strings = new String[1];
//        IMV_SIQ output = new IMV_SIQ();
//        IMV_SIQ inputValue = new IMV_SIQ();
//        String[] 传参因子
//                = StaticFunctionMapM_VECS_C.annotationMap.get(callFunctionKey).split(":");
//        NE._I_U.string=null;
//        NE._I_U.x=0;
//        NE._I_U.y=0;
//        NE._I_U.c=null;
//        inputValue.put(传参因子[0], null);
//        inputValue.put(传参因子[1], 0);
//        inputValue.put(传参因子[2], 0);
//        inputValue.put(传参因子[3], null);
//        output.put("传参因子", 传参因子);
//        output.put("inputValues", inputValue);
//        strings[0] = "执行 M_VECS 下 " + callFunctionKey + " 接口, 参数是 传参因子";
//        StaticRootMap.tinShellV005(strings, output, NE);
//        @SuppressWarnings("unchecked")
//        IMV_SIQ map = (IMV_SIQ) output.get(callFunctionKey);
//        NE._I_U.string= null;
//        NE._I_U.x=0;
//        NE._I_U.y=0;
//        NE._I_U.c=null;
//app.app_S.data= new CfxTextPane(S_Tag.NEI_RONG, 1350, 2980, null);
//65

//1 values all in one
//2 flexiable streams
//3 delete return types
//4 detete gets and sets
//5 yaoguangluo 20240929
//6
//7