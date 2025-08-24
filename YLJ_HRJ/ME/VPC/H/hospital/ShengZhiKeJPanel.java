package ME.VPC.H.hospital;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;

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
public class ShengZhiKeJPanel extends JPanel {

	public ShengZhiKeJPanel(JTextPane name) {
		this.setLayout(null);
		this.setBounds(0, 0, 1180, 610);
		this.setBackground(Color.BLACK);

		// 1做表 左边名称 右边输入框
		JLabel 诊断结果 = new JLabel("诊断结果 :");
		诊断结果.setForeground(Color.WHITE);
		诊断结果.setBounds(10, 20 + 300 + 90, 100, 50);
		JTextField 诊断结果_box = new JTextField();
		诊断结果_box.setBounds(10, 33 + 325 + 90, 1070, 120);
		诊断结果_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(诊断结果);
		this.add(诊断结果_box);

		// copy tab
		JLabel baiDanBai = new JLabel("白蛋白alb :");
		baiDanBai.setForeground(Color.WHITE);
		baiDanBai.setBounds(10, 20 + 0, 100, 50);
		JTextField baiDanBai_box = new JTextField();
		baiDanBai_box.setBounds(10 + 110, 33 + 0, 80, 20);
		baiDanBai_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(baiDanBai);
		this.add(baiDanBai_box);

		JLabel label2 = new JLabel("乙肝两对半hbcab:");
		label2.setForeground(Color.WHITE);
		label2.setBounds(10, 20 + 25 * 1, 100, 50);
		JTextField label2_box = new JTextField();
		label2_box.setBounds(10 + 110, 33 + 25 * 1, 80, 20);
		label2_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label2);
		this.add(label2_box);

		JLabel label3 = new JLabel("糖耐量实验 :");
		label3.setForeground(Color.WHITE);
		label3.setBounds(10, 20 + 25 * 2, 100, 50);
		JTextField label3_box = new JTextField();
		label3_box.setBounds(10 + 110, 33 + 25 * 2, 80, 20);
		label3_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label3);
		this.add(label3_box);

		JLabel label4 = new JLabel("螨虫镜检 :");
		label4.setForeground(Color.WHITE);
		label4.setBounds(10, 20 + 25 * 3, 100, 50);
		JTextField label4_box = new JTextField();
		label4_box.setBounds(10 + 110, 33 + 25 * 3, 80, 20);
		label4_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label4);
		this.add(label4_box);

		JLabel label5 = new JLabel("性病支原体检测（uu） :");
		label5.setForeground(Color.WHITE);
		label5.setBounds(10, 20 + 25 * 4, 100, 50);
		JTextField label5_box = new JTextField();
		label5_box.setBounds(10 + 110, 33 + 25 * 4, 80, 20);
		label5_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label5);
		this.add(label5_box);

		JLabel label6 = new JLabel("低密度脂蛋白ldl-c :");
		label6.setForeground(Color.WHITE);
		label6.setBounds(10, 20 + 25 * 5, 100, 50);
		JTextField label6_box = new JTextField();
		label6_box.setBounds(10 + 110, 33 + 25 * 5, 80, 20);
		label6_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label6);
		this.add(label6_box);

		// 7
		JLabel label7 = new JLabel("血氨nh3 :");
		label7.setForeground(Color.WHITE);
		label7.setBounds(10, 20 + 25 * 6, 100, 50);
		JTextField label7_box = new JTextField();
		label7_box.setBounds(10 + 110, 33 + 25 * 6, 80, 20);
		label7_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label7);
		this.add(label7_box);
		// 8
		JLabel label68 = new JLabel("胰岛素抗体ins-ab :");
		label68.setForeground(Color.WHITE);
		label68.setBounds(10, 20 + 25 * 7, 100, 50);
		JTextField label68_box = new JTextField();
		label68_box.setBounds(10 + 110, 33 + 25 * 7, 80, 20);
		label68_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label68);
		this.add(label68_box);
		// 9
		JLabel label69 = new JLabel("钾（尿）钾（尿） :");
		label69.setForeground(Color.WHITE);
		label69.setBounds(10, 20 + 25 * 8, 100, 50);
		JTextField label69_box = new JTextField();
		label69_box.setBounds(10 + 110, 33 + 25 * 8, 80, 20);
		label69_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label69);
		this.add(label69_box);
		// 10
		JLabel label610 = new JLabel("磷ip :");
		label610.setForeground(Color.WHITE);
		label610.setBounds(10, 20 + 25 * 9, 100, 50);
		JTextField label610_box = new JTextField();
		label610_box.setBounds(10 + 110, 33 + 25 * 9, 80, 20);
		label610_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label610);
		this.add(label610_box);
		// 11
		JLabel label611 = new JLabel("氯（尿）氯（尿）:");
		label611.setForeground(Color.WHITE);
		label611.setBounds(10, 20 + 25 * 10, 100, 50);
		JTextField label611_box = new JTextField();
		label611_box.setBounds(10 + 110, 33 + 25 * 10, 80, 20);
		label611_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label611);
		this.add(label611_box);
		// 12
		JLabel label612 = new JLabel("肌钙蛋白ttnt :");
		label612.setForeground(Color.WHITE);
		label612.setBounds(10, 20 + 25 * 11, 100, 50);
		JTextField label612_box = new JTextField();
		label612_box.setBounds(10 + 110, 33 + 25 * 11, 80, 20);
		label612_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label612);
		this.add(label612_box);
		// 13
		JLabel label613 = new JLabel("钠（尿）钠（尿） :");
		label613.setForeground(Color.WHITE);
		label613.setBounds(10, 20 + 25 * 12, 100, 50);
		JTextField label613_box = new JTextField();
		label613_box.setBounds(10 + 110, 33 + 25 * 12, 80, 20);
		label613_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label613);
		this.add(label613_box);
		// 14
		JLabel label614 = new JLabel("碱性磷酸酶alp :");
		label614.setForeground(Color.WHITE);
		label614.setBounds(10, 20 + 25 * 13, 100, 50);
		JTextField label614_box = new JTextField();
		label614_box.setBounds(10 + 110, 33 + 25 * 13, 80, 20);
		label614_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label614);
		this.add(label614_box);
		//
		I_SecondColomns();
		I_ThirdColomns();
		I_FourthColomns();
		I_FifthColomns();
	}

	private void I_FifthColomns() {

		// copy tab
		JLabel baiDanBai222223 = new JLabel("血渗透压血osm:");
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10 + 220 * 4, 20 + 0, 100, 50);
		JTextField baiDanBai222223_box = new JTextField();
		baiDanBai222223_box.setBounds(10 + 110 + 220 * 4, 33 + 0, 80, 20);
		baiDanBai222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);

		JLabel label2222223 = new JLabel("肌酐清除率cor:");
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10 + 220 * 4, 20 + 25 * 1, 100, 50);
		JTextField label2222223_box = new JTextField();
		label2222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 1, 80, 20);
		label2222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label2222223);
		this.add(label2222223_box);

		JLabel label3222223 = new JLabel("血（尿）铜 cu:");
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10 + 220 * 4, 20 + 25 * 2, 100, 50);
		JTextField label3222223_box = new JTextField();
		label3222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 2, 80, 20);
		label3222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label3222223);
		this.add(label3222223_box);

		JLabel label4222223 = new JLabel("组分区带 igg:");
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10 + 220 * 4, 20 + 25 * 3, 100, 50);
		JTextField label4222223_box = new JTextField();
		label4222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 3, 80, 20);
		label4222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label4222223);
		this.add(label4222223_box);

		JLabel label5222223 = new JLabel("甲状旁腺激素 pth:");
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10 + 220 * 4, 20 + 25 * 4, 100, 50);
		JTextField label5222223_box = new JTextField();
		label5222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 4, 80, 20);
		label5222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label5222223);
		this.add(label5222223_box);

		JLabel label6222223 = new JLabel("尿3-甲氧基4-羟基苦杏仁酸（vma）:");
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10 + 220 * 4, 20 + 25 * 5, 100, 50);
		JTextField label6222223_box = new JTextField();
		label6222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 5, 80, 20);
		label6222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label6222223);
		this.add(label6222223_box);

		// 7
		JLabel label7222223 = new JLabel("载脂蛋白ap0alap0 al:");
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10 + 220 * 4, 20 + 25 * 6, 100, 50);
		JTextField label7222223_box = new JTextField();
		label7222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 6, 80, 20);
		label7222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label7222223);
		this.add(label7222223_box);
		// 8
		JLabel label68222223 = new JLabel("肌钙蛋白i tni:");
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10 + 220 * 4, 20 + 25 * 7, 100, 50);
		JTextField label68222223_box = new JTextField();
		label68222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 7, 80, 20);
		label68222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label68222223);
		this.add(label68222223_box);
		// 9
		JLabel label69222223 = new JLabel("氯醋酸萘酚as-d酯酶染色:");
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10 + 220 * 4, 20 + 25 * 8, 100, 50);
		JTextField label69222223_box = new JTextField();
		label69222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 8, 80, 20);
		label69222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label69222223);
		this.add(label69222223_box);
		// 10
		JLabel label610222223 = new JLabel("乳酸 lact:");
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10 + 220 * 4, 20 + 25 * 9, 100, 50);
		JTextField label610222223_box = new JTextField();
		label610222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 9, 80, 20);
		label610222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label610222223);
		this.add(label610222223_box);
		// 11
		JLabel label611222223 = new JLabel("肿瘤标记抗原242检测 ca242 :");
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10 + 220 * 4, 20 + 25 * 10, 100, 50);
		JTextField label611222223_box = new JTextField();
		label611222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 10, 80, 20);
		label611222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label611222223);
		this.add(label611222223_box);
		// 12
		JLabel label612222223 = new JLabel("钙 ca:");
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10 + 220 * 4, 20 + 25 * 11, 100, 50);
		JTextField label612222223_box = new JTextField();
		label612222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 11, 80, 20);
		label612222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label612222223);
		this.add(label612222223_box);
		// 13
		JLabel label613222223 = new JLabel("巨噬细胞感染趋化因子-1β mip-1β:");
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10 + 220 * 4, 20 + 25 * 12, 100, 50);
		JTextField label613222223_box = new JTextField();
		label613222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 12, 80, 20);
		label613222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label613222223);
		this.add(label613222223_box);
		// 14
		JLabel label614222223 = new JLabel("尿17-羟固醇 17-oh:");
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10 + 220 * 4, 20 + 25 * 13, 100, 50);
		JTextField label614222223_box = new JTextField();
		label614222223_box.setBounds(10 + 110 + 220 * 4, 33 + 25 * 13, 80, 20);
		label614222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label614222223);
		this.add(label614222223_box);
	}

	public void I_FourthColomns() {

		// copy tab
		JLabel baiDanBai222223 = new JLabel("ldh同工酶is0-ldh :");
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10 + 220 * 3, 20 + 0, 100, 50);
		JTextField baiDanBai222223_box = new JTextField();
		baiDanBai222223_box.setBounds(10 + 110 + 220 * 3, 33 + 0, 80, 20);
		baiDanBai222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);

		JLabel label2222223 = new JLabel("胰岛素ins :");
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10 + 220 * 3, 20 + 25 * 1, 100, 50);
		JTextField label2222223_box = new JTextField();
		label2222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 1, 80, 20);
		label2222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label2222223);
		this.add(label2222223_box);

		JLabel label3222223 = new JLabel("同 t:");
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10 + 220 * 3, 20 + 25 * 2, 100, 50);
		JTextField label3222223_box = new JTextField();
		label3222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 2, 80, 20);
		label3222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label3222223);
		this.add(label3222223_box);

		JLabel label4222223 = new JLabel("淀粉酶 amy:");
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10 + 220 * 3, 20 + 25 * 3, 100, 50);
		JTextField label4222223_box = new JTextField();
		label4222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 3, 80, 20);
		label4222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label4222223);
		this.add(label4222223_box);

		JLabel label5222223 = new JLabel("乳酸脱氢酶 ldh:");
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10 + 220 * 3, 20 + 25 * 4, 100, 50);
		JTextField label5222223_box = new JTextField();
		label5222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 4, 80, 20);
		label5222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label5222223);
		this.add(label5222223_box);

		JLabel label6222223 = new JLabel("铁 tron:");
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10 + 220 * 3, 20 + 25 * 5, 100, 50);
		JTextField label6222223_box = new JTextField();
		label6222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 5, 80, 20);
		label6222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label6222223);
		this.add(label6222223_box);

		// 7
		JLabel label7222223 = new JLabel("酸性磷酸酶和酒石酸l+:");
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10 + 220 * 3, 20 + 25 * 6, 100, 50);
		JTextField label7222223_box = new JTextField();
		label7222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 6, 80, 20);
		label7222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label7222223);
		this.add(label7222223_box);
		// 8
		JLabel label68222223 = new JLabel("粒细胞刺激因子g-csf:");
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10 + 220 * 3, 20 + 25 * 7, 100, 50);
		JTextField label68222223_box = new JTextField();
		label68222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 7, 80, 20);
		label68222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label68222223);
		this.add(label68222223_box);
		// 9
		JLabel label69222223 = new JLabel("雌激素 el:");
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10 + 220 * 3, 20 + 25 * 8, 100, 50);
		JTextField label69222223_box = new JTextField();
		label69222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 8, 80, 20);
		label69222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label69222223);
		this.add(label69222223_box);
		// 10
		JLabel label610222223 = new JLabel("同工酶ck-mb:");
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10 + 220 * 3, 20 + 25 * 9, 100, 50);
		JTextField label610222223_box = new JTextField();
		label610222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 9, 80, 20);
		label610222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label610222223);
		this.add(label610222223_box);
		// 11
		JLabel label611222223 = new JLabel("尿渗透压尿osm:");
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10 + 220 * 3, 20 + 25 * 10, 100, 50);
		JTextField label611222223_box = new JTextField();
		label611222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 10, 80, 20);
		label611222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label611222223);
		this.add(label611222223_box);
		// 12
		JLabel label612222223 = new JLabel("结核印迹试验tb-poc:");
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10 + 220 * 3, 20 + 25 * 11, 100, 50);
		JTextField label612222223_box = new JTextField();
		label612222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 11, 80, 20);
		label612222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label612222223);
		this.add(label612222223_box);
		// 13
		JLabel label613222223 = new JLabel("腺苷脱氨酸 ada :");
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10 + 220 * 3, 20 + 25 * 12, 100, 50);
		JTextField label613222223_box = new JTextField();
		label613222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 12, 80, 20);
		label613222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label613222223);
		this.add(label613222223_box);
		// 14
		JLabel label614222223 = new JLabel("尖锐湿疣醋酸白:");
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10 + 220 * 3, 20 + 25 * 13, 100, 50);
		JTextField label614222223_box = new JTextField();
		label614222223_box.setBounds(10 + 110 + 220 * 3, 33 + 25 * 13, 80, 20);
		label614222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label614222223);
		this.add(label614222223_box);
	}

	private void I_ThirdColomns() {

		// copy tab
		JLabel baiDanBai222223 = new JLabel(
				"疥疮镜检 sarcoptes scabidi examination:");
		baiDanBai222223.setForeground(Color.WHITE);
		baiDanBai222223.setBounds(10 + 220 * 2, 20 + 0, 100, 50);
		JTextField baiDanBai222223_box = new JTextField();
		baiDanBai222223_box.setBounds(10 + 110 + 220 * 2, 33 + 0, 80, 20);
		baiDanBai222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(baiDanBai222223);
		this.add(baiDanBai222223_box);

		JLabel label2222223 = new JLabel("白色念珠菌抗体:");
		label2222223.setForeground(Color.WHITE);
		label2222223.setBounds(10 + 220 * 2, 20 + 25 * 1, 100, 50);
		JTextField label2222223_box = new JTextField();
		label2222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25, 80, 20);
		label2222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label2222223);
		this.add(label2222223_box);

		JLabel label3222223 = new JLabel("总胆红质 tbil :");
		label3222223.setForeground(Color.WHITE);
		label3222223.setBounds(10 + 220 * 2, 20 + 25 * 2, 100, 50);
		JTextField label3222223_box = new JTextField();
		label3222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 2, 80, 20);
		label3222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label3222223);
		this.add(label3222223_box);

		JLabel label4222223 = new JLabel("直接胆红质 dbil:");
		label4222223.setForeground(Color.WHITE);
		label4222223.setBounds(10 + 220 * 2, 20 + 25 * 3, 100, 50);
		JTextField label4222223_box = new JTextField();
		label4222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 3, 80, 20);
		label4222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label4222223);
		this.add(label4222223_box);

		JLabel label5222223 = new JLabel("斑贴试验 patch test:");
		label5222223.setForeground(Color.WHITE);
		label5222223.setBounds(10 + 220 * 2, 20 + 25 * 4, 100, 50);
		JTextField label5222223_box = new JTextField();
		label5222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 4, 80, 20);
		label5222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label5222223);
		this.add(label5222223_box);

		JLabel label6222223 = new JLabel("血镁 mg:");
		label6222223.setForeground(Color.WHITE);
		label6222223.setBounds(10 + 220 * 2, 20 + 25 * 5, 100, 50);
		JTextField label6222223_box = new JTextField();
		label6222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 5, 80, 20);
		label6222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label6222223);
		this.add(label6222223_box);

		// 7
		JLabel label7222223 = new JLabel("甲肝抗体-igmhav-igmigmhav-igm :");
		label7222223.setForeground(Color.WHITE);
		label7222223.setBounds(10 + 220 * 2, 20 + 25 * 6, 100, 50);
		JTextField label7222223_box = new JTextField();
		label7222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 6, 80, 20);
		label7222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label7222223);
		this.add(label7222223_box);
		// 8
		JLabel label68222223 = new JLabel("肌酸激酶 ck:");
		label68222223.setForeground(Color.WHITE);
		label68222223.setBounds(10 + 220 * 2, 20 + 25 * 7, 100, 50);
		JTextField label68222223_box = new JTextField();
		label68222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 7, 80, 20);
		label68222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label68222223);
		this.add(label68222223_box);
		// 9
		JLabel label69222223 = new JLabel("胆固醇 tc:");
		label69222223.setForeground(Color.WHITE);
		label69222223.setBounds(10 + 220 * 2, 20 + 25 * 8, 100, 50);
		JTextField label69222223_box = new JTextField();
		label69222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 8, 80, 20);
		label69222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label69222223);
		this.add(label69222223_box);
		// 10
		JLabel label610222223 = new JLabel("高密度脂蛋白hdl-c:");
		label610222223.setForeground(Color.WHITE);
		label610222223.setBounds(10 + 220 * 2, 20 + 25 * 9, 100, 50);
		JTextField label610222223_box = new JTextField();
		label610222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 9, 80, 20);
		label610222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label610222223);
		this.add(label610222223_box);
		// 11
		JLabel label611222223 = new JLabel("rents :");
		label611222223.setForeground(Color.WHITE);
		label611222223.setBounds(10 + 220 * 2, 20 + 25 * 10, 100, 50);
		JTextField label611222223_box = new JTextField();
		label611222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 10, 80, 20);
		label611222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label611222223);
		this.add(label611222223_box);
		// 12
		JLabel label612222223 = new JLabel("肌酐 cre :");
		label612222223.setForeground(Color.WHITE);
		label612222223.setBounds(10 + 220 * 2, 20 + 25 * 11, 100, 50);
		JTextField label612222223_box = new JTextField();
		label612222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 11, 80, 20);
		label612222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label612222223);
		this.add(label612222223_box);
		// 13
		JLabel label613222223 = new JLabel("巨细胞病毒igm抗体定性 cmc:");
		label613222223.setForeground(Color.WHITE);
		label613222223.setBounds(10 + 220 * 2, 20 + 25 * 12, 100, 50);
		JTextField label613222223_box = new JTextField();
		label613222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 12, 80, 20);
		label613222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label613222223);
		this.add(label613222223_box);
		// 14
		JLabel label614222223 = new JLabel("叶酸/维生素b12folic/vitb12:");
		label614222223.setForeground(Color.WHITE);
		label614222223.setBounds(10 + 220 * 2, 20 + 25 * 13, 100, 50);
		JTextField label614222223_box = new JTextField();
		label614222223_box.setBounds(10 + 110 + 220 * 2, 33 + 25 * 13, 80, 20);
		label614222223_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label614222223);
		this.add(label614222223_box);
	}

	private void I_SecondColomns() {

		// copy tab
		JLabel baiDanBai22 = new JLabel("全血黏度:");
		baiDanBai22.setForeground(Color.WHITE);
		baiDanBai22.setBounds(10 + 220 * 1, 20 + 0, 100, 50);
		JTextField baiDanBai22_box = new JTextField();
		baiDanBai22_box.setBounds(10 + 110 + 220 * 1, 33 + 0, 80, 20);
		baiDanBai22_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(baiDanBai22);
		this.add(baiDanBai22_box);

		JLabel label222 = new JLabel("肿瘤标记抗原242检测ca242:");
		label222.setForeground(Color.WHITE);
		label222.setBounds(10 + 220 * 1, 20 + 25 * 1, 100, 50);
		JTextField label222_box = new JTextField();
		label222_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 1, 80, 20);
		label222_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label222);
		this.add(label222_box);

		JLabel label322 = new JLabel(
				"过敏原检测（1）吸入组ⅰ（2）吸入组ⅱ（3）食物组ⅲ（4）食物组ⅳivtivt-ⅰivt-ⅱivt-ⅲivt-ⅳ :");
		label322.setForeground(Color.WHITE);
		label322.setBounds(10 + 220 * 1, 20 + 25 * 2, 100, 50);
		JTextField label322_box = new JTextField();
		label322_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 2, 80, 20);
		label322_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label322);
		this.add(label322_box);

		JLabel label422 = new JLabel("钙ca:");
		label422.setForeground(Color.WHITE);
		label422.setBounds(10 + 220 * 1, 20 + 25 * 3, 100, 50);
		JTextField label422_box = new JTextField();
		label422_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 3, 80, 20);
		label422_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label422);
		this.add(label422_box);

		JLabel label522 = new JLabel("巨噬细胞感染趋化因子-1βmip-1β:");
		label522.setForeground(Color.WHITE);
		label522.setBounds(10 + 220 * 1, 20 + 25 * 4, 100, 50);
		JTextField label522_box = new JTextField();
		label522_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 4, 80, 20);
		label522_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label522);
		this.add(label522_box);

		JLabel label622 = new JLabel("尿17-羟固醇17-oh :");
		label622.setForeground(Color.WHITE);
		label622.setBounds(10 + 220 * 1, 20 + 25 * 5, 100, 50);
		JTextField label622_box = new JTextField();
		label622_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 5, 80, 20);
		label622_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label622);
		this.add(label622_box);

		// 7
		JLabel label722 = new JLabel("促黄体生成素lh :");
		label722.setForeground(Color.WHITE);
		label722.setBounds(10 + 220 * 1, 20 + 25 * 6, 100, 50);
		JTextField label722_box = new JTextField();
		label722_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 6, 80, 20);
		label722_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label722);
		this.add(label722_box);
		// 8
		JLabel label6822 = new JLabel("乙肝表面抗原hbsag:");
		label6822.setForeground(Color.WHITE);
		label6822.setBounds(10 + 220 * 1, 20 + 25 * 7, 100, 50);
		JTextField label6822_box = new JTextField();
		label6822_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 7, 80, 20);
		label6822_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label6822);
		this.add(label6822_box);
		// 9
		JLabel label6922 = new JLabel("毛囊虫镜检demodexfolliculorumexamination :");
		label6922.setForeground(Color.WHITE);
		label6922.setBounds(10 + 220 * 1, 20 + 25 * 8, 100, 50);
		JTextField label6922_box = new JTextField();
		label6922_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 8, 80, 20);
		label6922_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label6922);
		this.add(label6922_box);
		// 10
		JLabel label61022 = new JLabel("促肾上腺皮质激素acth :");
		label61022.setForeground(Color.WHITE);
		label61022.setBounds(10 + 220 * 1, 20 + 25 * 9, 100, 50);
		JTextField label61022_box = new JTextField();
		label61022_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 9, 80, 20);
		label61022_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label61022);
		this.add(label61022_box);
		// 11
		JLabel label61122 = new JLabel("弓形体igm, 抗体阳性定性toxo:");
		label61122.setForeground(Color.WHITE);
		label61122.setBounds(10 + 220 * 1, 20 + 25 * 10, 100, 50);
		JTextField label61122_box = new JTextField();
		label61122_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 10, 80, 20);
		label61122_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label61122);
		this.add(label61122_box);
		// 12
		JLabel label61222 = new JLabel("载脂蛋白ap0bap0b:");
		label61222.setForeground(Color.WHITE);
		label61222.setBounds(10 + 220 * 1, 20 + 25 * 11, 100, 50);
		JTextField label61222_box = new JTextField();
		label61222_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 11, 80, 20);
		label61222_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label61222);
		this.add(label61222_box);
		// 13
		JLabel label61322 = new JLabel("尿酸uric :");
		label61322.setForeground(Color.WHITE);
		label61322.setBounds(10 + 220 * 1, 20 + 25 * 12, 100, 50);
		JTextField label61322_box = new JTextField();
		label61322_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 12, 80, 20);
		label61322_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label61322);
		this.add(label61322_box);
		// 14
		JLabel label61422 = new JLabel("胰高糖素胰高糖素 :");
		label61422.setForeground(Color.WHITE);
		label61422.setBounds(10 + 220 * 1, 20 + 25 * 13, 100, 50);
		JTextField label61422_box = new JTextField();
		label61422_box.setBounds(10 + 110 + 220 * 1, 33 + 25 * 13, 80, 20);
		label61422_box.addActionListener(arg0 -> {
			// 加状态；

		});
		this.add(label61422);
		this.add(label61422_box);
	}
}
