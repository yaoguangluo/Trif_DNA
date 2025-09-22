package OSI.OPE.OVU.PQE.flash;

import ME.VPC.M.app.App;
import exception.thread.DetaThread;
import VSQ.etl.GUISample_X_S;
import OSI.OPE.gui.Sample_X_I_Map;
import OSI.OPE.gui.Sample_X_Register;

import javax.swing.JTextPane;
import javax.swing.tree.TreePath;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//作者 +著作权人： 罗瑶光, 浏阳
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
public class GUISample extends GUISample_X_S implements MouseMotionListener,
		MouseListener, ItemListener, ActionListener, Runnable {

	@SuppressWarnings("deprecation")
	public GUISample() {
		getContentPane().setBackground(new Color(255, 255, 255));
	}

	public void run() {
		DetaThread.sleepDeta(100);
		nodeProject.setBounds(0, 0, leftSplitPane.getWidth(),
				leftSplitPane.getDividerLocation());
		DetaThread.sleepDeta(1000);
		nodeProject.validate();
		while (true) {
			DetaThread.sleepDeta(5000);
		}
	}

	public void start() {
		if (thread == null) {
			thread = new DetaThread();
			thread.start();
		}
	}

	public void stop() {
	}

	public void IV_(App NE) {
		new Sample_X_I_Map().CreatMap(NE);
		new Sample_X_Register().Register(this, NE); // Registrar();
		this.resize(w, h);
	}

	@SuppressWarnings("deprecation")
	public void IV_(Object[][] tableData_old, JTextPane text, App NE) {
		this.text = text;
		this.tableData_old = tableData_old;
		this.u = NE.app_S;
		this._A = NE.app_S._A;
		this.pos = NE.app_S.fMHMMListOneTime_E_X_S.posCnToCn;
		System.out.println("启动400编码调试开始-00000055-001-02");
		new Sample_X_I_Map().CreatMap(NE);
		System.out.println("启动400编码调试开始-00000055-003");
		new Sample_X_Register().Register(this, NE);
		this.resize(w, h);
	}

	public void actionPerformed(ActionEvent arg0) {
	}

	public void itemStateChanged(ItemEvent arg0) {
	}

	public void mouseClicked(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
		// TreePath path=
		// nodeView.tree.getPathForLocation(arg0.getX(),
		// arg0.getY());
		TreePath path = nodeView.tree.getSelectionPath();
		if (path != null) {
			nodeView.tree.setSelectionPath(path);
			if (3 == arg0.getButton()) {
				popupMenu.show(nodeView.tree, arg0.getX(), arg0.getY());
			} // engineMenu.show(canvas, 0, 0);

		} else {
			engineMenu.show(canvas, 0, 0);
		}
	}

	public void mouseDragged(MouseEvent arg0) {
	}

	public void mouseMoved(MouseEvent arg0) {
	}
}
