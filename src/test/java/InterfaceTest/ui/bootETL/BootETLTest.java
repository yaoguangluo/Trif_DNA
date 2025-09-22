package test.java.InterfaceTest.ui.bootETL;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import ME.VPC.M.app.App_X;
import ME.VPC.S.ne.WindowsUI;
import exception.thread.DetaThread;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
// mock api 和test me api 注释：Generated with love by TestMe :)
// Please report issues and submit feature
// requests at: http://weirddev.com/forum#!/testme
class BootETLTest {
	public static void main(String[] argv) throws InterruptedException {
		BootETLTest bootETLTest = new BootETLTest();
		bootETLTest.testUIofETL();
	}

	/*
	 * 这是一个 tinshell 批处理测试 执行复杂条件搜索逻辑， 测试main函数demo的test版本，在导入
	 * 了api之后进行系统集成，然后用下面的对应的函数中源码逻辑进行复制粘贴到工程中，直接运行，即可
	 * 出结果，源码的逻辑按照输入准备计算的参数，然后执行，然后获取输出需要的结果，可以用断点来查看
	 * 数据，也可以用println来显示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，
	 * 本人会把测试的输入输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。 --罗瑶光
	 */
	@SuppressWarnings("deprecation")
	void testUIofETL() throws InterruptedException {
		// test without mock api
		System.out.println("初始化");
		App_X NE = new App_X();
		// 配置 模式为启动ETL
		NE.tempString = "启动ETL";
		// 启动
		System.out.println("启动400编码调试开始-00000001");
		// App NE = (App)(NE_X);//稍后一把app 线程启动
		// vpcs，于是做动态app，有600文件要改动加NE。
		// 20250308 罗瑶光
		// 稍后进行刚染色分支的内存泄露检测。202504071633 罗瑶光
		NE.app_S.frame = new JFrame(
				"华瑞集 " + "花语实验版本" + "V5.01967" + "浏阳德塔软件开发有限公司 " + "湖南省浏阳市集里街道"
						+ "-大塘冲路一段 208号" + "-阳光家园小区第10栋别墅 " + "罗瑶光* 15116110525"
						+ "-430181198505250014");
		NE.app_S.frame.setIconImage(NE.app_S.logo.getImage());
		NE.app_S.frame.setLayout(null);
		NE.app_S.frame.setSize(WindowsUI.commonWidth,
				WindowsUI.basicHeight - 10 + NE.app_S.rangeHigh);
		NE.app_S.frame.resize(WindowsUI.commonWidth,
				WindowsUI.basicHeight - 10 + NE.app_S.rangeHigh);
		NE.app_S.frame.setResizable(false);
		NE.app_S.frame.add(NE);
		NE.setBounds(0, 0, WindowsUI.commonWidth + 5,
				WindowsUI.basicHeight - 5 + NE.app_S.rangeHigh);
		NE.app_S.frame.setVisible(true);
		try {
			System.out.println("启动400编码调试开始-00000002");
			NE.init(NE);
			System.out.println("启动400编码调试开始-00000003");
			DetaThread.sleepDeta(100);
			NE.start();
		} catch (Exception e) {
			NE.validate();
		}
		NE.app_S.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		NE.app_S.frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent) {
				try {
					System.out.println("pre closing...1");
					if (NE.app_S.monitor != null) {
						NE.app_S.monitor.monitor_X_S.stop = 1;
					}
					System.out.println("pre closing...2");
					if (NE.app_S.monitor != null) {
						NE.app_S.monitor.removeAll();
						DetaThread.sleepDeta(500);
						NE.app_S.monitor.disable();
						NE.app_S.monitor.stop();
						NE.app_S.monitor.destroy();
						DetaThread.sleepDeta(500);
						NE.app_S.monitor = null;
						DetaThread.sleepDeta(500);
					}
					System.out.println("pre closing...3");
					NE.stop();
					NE.app_S.frame.removeAll();
					System.out.println("closed");
				} catch (Exception e) {
					System.out.println("启动400编码调试开始-00000004");
					System.out.println("close error");
					NE.disable();
					NE.destroy();
					e.printStackTrace();
				}
				if (null != NE.app_S.frame) {
					NE.app_S.frame.removeAll();
					NE.app_S.frame.disable();
				}
				System.out.println("启动400编码调试开始-00000005");
				System.gc();
				System.exit(0);
			}
		});
	}

}