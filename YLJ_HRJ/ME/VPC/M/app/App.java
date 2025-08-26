package ME.VPC.M.app;

import dnn.GetDNNMap;
import dnn.WriteDNNMap;
import ME.VPC.H.literature.literial_X_P_BaGangBianZheng;
import ME.VPC.H.literature.literial_X_initVerbalBase;
import ME.VPC.H.literature.literial_X_literial_P;
import ME.VPC.H.literature.literial_X_literial_liner_P;
import ME.VPC.S.ne.App_S;
import M_V.MPI.xls.commonXLS.MakeContainerXLS;
import M_V.MSU.OCI.ME.SMS.translator.C.Translator;
import M_V.MSU.OEI.ME.SMS.SEU.OSD.OSI.E.Translator_E;
import Q_V.OSI.AOP.MEC.SIQ.search.ZhongYaoSearch;
import S_A.AVQ.OVQ.OSQ.VSQ.obj.Verbal;
import S_A.SVQ.stable.S_Tag;
import S_A.TRNA.RRNA.I_U;

import javax.swing.JApplet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * （lyg.tin@gmail.com2018年后因G网屏蔽不再使用）
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋别墅
 * */
@SuppressWarnings({ "serial" })
public class App extends JApplet implements KeyListener, ActionListener {

	public App_S app_S = new App_S();
	// ribosome init
	public I_U _I_U;// later in format.
	// test field
	public String tempString = "启动";
	public String resourceTail = "DetaResources/";

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	// 搜索
	@Override
	public void keyReleased(KeyEvent arg0) {
		if (null == this.app_S.appConfig) {
			return;
		}
		if (null == this.app_S.appConfig.SectionJPanel) {
			return;
		}
		if (null == this.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2233) {
			return;
		}
		if (this.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2233.isSelected()
				|| this.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2122
						.isSelected()) {
			// 识别回车 DNN 和 专家caoZuo
			if (null == arg0) {
				return;
			}
			if (10 != arg0.getKeyCode()) {// 识别回车 专家caoZuo
				return;
			}
		}
		// System.out.println(lookrot);
		this.app_S.appConfig.SectionJPanel.jTextPane
				.setText("" + app_S.lookrot);
		String zhongyao = S_Tag.STRING_EMPTY;
		app_S.key = app_S.name.getText();
		String forE = app_S.key.toLowerCase().toString();
		if (!app_S.key.replace(S_Tag.STRING_SPACE, S_Tag.STRING_EMPTY)
				.equals(S_Tag.STRING_EMPTY) && app_S.key.length() > 50) {
			app_S.key = app_S.key.substring(0, 30);
		}
		if (!forE.replace(S_Tag.STRING_SPACE, S_Tag.STRING_EMPTY)
				.equals(S_Tag.STRING_EMPTY) && forE.length() > 110) {
			forE = forE.substring(0, 110);
		}
		app_S.key = app_S.key.length() == 0 ? S_Tag.STRING_EMPTY
				: app_S.translator.MixedStringToChineseString(app_S._A,
						app_S.key);
		if (app_S.key.replaceAll("\\s+", S_Tag.STRING_SPACE)
				.equalsIgnoreCase(S_Tag.STRING_SPACE)) {
			app_S.key = S_Tag.STRING_EMPTY;
		}
		zhongyao = app_S.key.toString();
		String keyZhenDuan = app_S.key.toString();
		if (this.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2233
				.isSelected()) {
			// literial测试
			keyZhenDuan = literial_X_P_BaGangBianZheng
					.P_BaGangBianZheng(app_S.key);
		}
		// key= keyZhenDuan.toString();
		String string = zhongyao.toString();
		if (zhongyao.contains("写入dnnmap")) {
			WriteDNNMap.doWriteDNNMap(
					"C:\\Users\\yaogu\\Desktop\\project\\DNN20058.lyg", this);
			// 操作系统截取 yaoguang 只截取了前5个字母。
		}
		if (zhongyao.contains("读取dnnmap")) {
			if (null == this.app_S.DNNmap || this.app_S.DNNmap.isEmpty()) {
				this.app_S.DNNmap = GetDNNMap.doGetDNNMap(this.app_S, this);
			}
		}
		if (string.length() > 0) {
			if (app_S.xynkPage != null) {
				this.app_S.xynkPage.key = zhongyao.toString();
				this.app_S.xynkPage.keyReleased(null);
			}
			if (app_S.zynkxPage != null) {
				this.app_S.zynkxPage.key = keyZhenDuan.toString();
				this.app_S.zynkxPage.keyReleased(null);
			}
			if (app_S.zyzdxPage != null) {
				this.app_S.zyzdxPage.key = keyZhenDuan.toString();
				this.app_S.zyzdxPage.keyReleased(null);
			}
			if (app_S.fyydPage != null) {
				this.app_S.fyydPage.key = keyZhenDuan.toString();
				this.app_S.fyydPage.keyReleased(null);
			}
			if (app_S.fqzPage != null) {
				this.app_S.fqzPage.key = keyZhenDuan.toString();
				this.app_S.fqzPage.keyReleased(null);
			}
			if (app_S.fckxPage != null) {
				this.app_S.fckxPage.key = zhongyao.toString();
				this.app_S.fckxPage.keyReleased(null);
			}
			if (app_S.jzkxPage != null) {
				this.app_S.jzkxPage.key = zhongyao.toString();
				this.app_S.jzkxPage.keyReleased(null);
			}
			if (app_S.wkxPage != null) {
				this.app_S.wkxPage.key = zhongyao.toString();
				this.app_S.wkxPage.keyReleased(null);
			}
			if (app_S.wskxPage != null) {
				this.app_S.wskxPage.key = zhongyao.toString();
				this.app_S.wskxPage.keyReleased(null);
			}
			if (app_S.xyscPage != null) {
				this.app_S.xyscPage.key = zhongyao.toString();
				this.app_S.xyscPage.keyReleased(null);
			}
			if (app_S.editPane != null) {
				this.app_S.editPane.key = zhongyao.toString();
				this.app_S.editPane.keyReleased(null);
			}
			// 图片搜索
			for (int i = 0; i < this.app_S.searchList.size(); i++) {
				app_S.searchList.get(i).AOP_VEC_SQ(null, zhongyao.toString(),
						this);
			}
			//
			for (int i = 0; i < this.app_S.makeContainerXLSList.size(); i++) {
				try {
					MakeContainerXLS makeContainerXLS = app_S.makeContainerXLSList
							.get(i);
					if (null != makeContainerXLS.jpanelSecond) {
						makeContainerXLS.jpanelSecond.key = zhongyao.toString();
						makeContainerXLS.jpanelSecond.doSearch();
					}
				} catch (Exception e) {
					e.printStackTrace();
					this.app_S.appConfig.SectionJPanel.jTextPane
							.setText("error");
				}
			}
			Translator ts = new Translator_E();
			ts.IV_(app_S._A);
			List<Verbal> verbals = ts.index(app_S._A, forE);
			if (app_S.cecil != null) {
				this.app_S.cecil.verbals = verbals;
				this.app_S.cecil.keyReleased(null);
			}
			if (this.app_S.appConfig.SectionJPanel.jlabel_peizhi_di2233
					.isSelected()) {
				// literial测试/专家caoZuo
				literial_X_initVerbalBase.initVerbalBase();// later fix 专家搜索
				// String 文学key = literial_X_words_P.words_P(this,
				// app_S.key);
				String wen_xuekey = literial_X_literial_liner_P
						.literial_liner_P(this.app_S, app_S.key);
				// 稍后七情六淫八纲都入文学库。
				String wen_xue_zhongyao = zhongyao + literial_X_literial_P
						.literial_P(this.app_S, zhongyao);
				ZhongYaoSearch.zhongYaoSearch(this.app_S, wen_xue_zhongyao,
						forE, wen_xuekey, this);
				// 搜索静态化, 方便DNA元基索引编码
			} else {
				ZhongYaoSearch.zhongYaoSearch(this.app_S, zhongyao, forE,
						app_S.key, this);
			}
			this.app_S.jTabbedpane.updateUI();
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// if(arg0.getID())
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (app_S.zonghe_filter_box.isSelected()) {
			for (int i = 0; i < app_S.newTableModel.getRowCount(); i++) {
				for (int j = 0; j < app_S.newTableModel.getRowCount(); j++) {
					if (i != j) {
						if (app_S.newTableModel.getValueAt(i, 5).toString()
								.contains(app_S.newTableModel.getValueAt(j, 2)
										.toString())) {
							app_S.newTableModel.removeRow(j);
							j -= 1;
						}
					}
				}
			}
			app_S.newTableModel.fireTableDataChanged();
		} else {
			this.keyReleased(null);
		}
	}

	public void mouseClicked(Object object) {
	}
}
/*
 * p1 p2 p3 p3p p4 p5 i31 i31p - i1 - 3p i32 i32p - i2 - 3p
 * i33 i33p - i3 - 3p
 */