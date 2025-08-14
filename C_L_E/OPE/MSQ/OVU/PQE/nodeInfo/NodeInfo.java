package OPE.MSQ.OVU.PQE.nodeInfo;

import E_A.OEI.SVQ.MPC.fhmm.E.FastReadProjectFile;
import S_A.SVQ.stable.S_Annotation;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.Image;

@SuppressWarnings({S_Annotation.TAG_UNCHECKED, S_Annotation.TAG_RAW_TYPES})
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
//图片是百度上搜国旗下的。
public class NodeInfo extends JScrollPane {
	String[] countryStrings= {"china", "ca", "denmark", "fr", "genmany"
			, "india", "norway", "uk", "us"};
	private ImageIcon[] images= {
			FastReadProjectFile.getDetaImageIconReader("china.gif", "DetaResources/gifFlag/"),
			FastReadProjectFile.getDetaImageIconReader("us.gif", "DetaResources/gifFlag/"),
			FastReadProjectFile.getDetaImageIconReader("denmark.gif", "DetaResources/gifFlag/"),
			FastReadProjectFile.getDetaImageIconReader("fr.gif", "DetaResources/gifFlag/"),
			FastReadProjectFile.getDetaImageIconReader("germany.gif", "DetaResources/gifFlag/"),
			FastReadProjectFile.getDetaImageIconReader("india.gif", "DetaResources/gifFlag/"),
			FastReadProjectFile.getDetaImageIconReader("norway.gif", "DetaResources/gifFlag/"),
			FastReadProjectFile.getDetaImageIconReader("uk.gif", "DetaResources/gifFlag/"),
			FastReadProjectFile.getDetaImageIconReader("ca.gif", "DetaResources/gifFlag/")
	};

	public NodeInfo()  {
		Integer[] intArray= new Integer[countryStrings.length];
		JComboBox countryList= new JComboBox(intArray);
		countryList.setMaximumRowCount(5);
		for (int i= 0; i< countryStrings.length; i++) {
			intArray[i]= new Integer(i);
			if (images[i]!= null) {
				images[i].setImage(images[i].getImage().getScaledInstance
						(50, 50, Image.SCALE_DEFAULT));
				images[i].setDescription(countryStrings[i]);
			}
		}
		countryList.removeAllItems();
		for(int i=0; i<images.length; i++) {
			countryList.addItem(images[i]);
		}
		this.setViewportView(countryList);    
		this.validate();
	}
}
