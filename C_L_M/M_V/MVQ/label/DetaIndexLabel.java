package M_V.MVQ.label;

import ME.VPC.H.hospital.DetaLabelS_s;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.List;

/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
public class DetaIndexLabel extends JLabel implements MouseListener{
	
	public String tagName= "";
	public Box box;
	//先碎片函数调试, 之后面板函数集成
	public JFrame frameTag= new JFrame("提示栏");
	public boolean ShowTag= false;
	public boolean inited= false;
	public int openx=0;
	public int openy=0;
	public int closex=0;
	public int closey=0;
	public boolean isIndex= false;
	public List<DetaLabel> jFrameList;
	public String indexString;

	//罗瑶光
	//为了避免花屏, 影响操作, 逻辑设计为点击打开, 鼠标移动触发关闭.
	public DetaIndexLabel(String name, List<DetaLabel> jFrameList ) {
		super(name); 
		this.setForeground(Color.lightGray);
		this.setBackground(Color.black);
		this.addMouseListener(this);
		this.jFrameList= jFrameList;
	}

	public void setTag(String string, boolean True) {
		
	}

	public void setIndex(String string) {
		if(null==DetaLabelS_s.stableImages){
			return;//mock trif
		}
		DetaLabelS_s.stableImages.setIndexString(string);
		this.indexString= string;
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(!DetaLabelS_s.stableImages.isIndexed) {
			return;
		}
		if(this.indexString.equalsIgnoreCase("A")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("A")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("B")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("B")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("C")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("C")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("D")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("D")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("E")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("E")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("F")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("F")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("G")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("G")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("H")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("H")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("I")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("I")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("J")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("J")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("K")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("K")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("L")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("L")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("M")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("M")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("N")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("N")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("O")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("O")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("P")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("P")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("Q")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("Q")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("R")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("R")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("S")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("S")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("T")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("T")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("U")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("U")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("V")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("V")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("W")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("W")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("X")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("X")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("Y")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("Y")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
		if(this.indexString.equalsIgnoreCase("Z")) {
			//do..
			Iterator<DetaLabel> iterator= jFrameList.iterator();
			while(iterator.hasNext()) {
				DetaLabel detaLabel= iterator.next();
				if(null!= detaLabel&& null!= detaLabel.indexString&& detaLabel.indexString.contains("Z")) {
					detaLabel.setForeground(Color.pink);	 
				}else {
					detaLabel.setForeground(Color.white);
				}
				detaLabel.validate();
			}
			return;
		}
	}


	@Override
	public void mousePressed(MouseEvent e) {
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}
