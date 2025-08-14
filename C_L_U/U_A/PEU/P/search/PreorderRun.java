package U_A.PEU.P.search;
import U_A.PEU.P.sort.*;
//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGImageDecoder;
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅
 * */
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * 授课 rohini 印度基督大学 ，数据结构
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class PreorderRun extends Thread{
	public boolean result;
	Leaf temp1;
	int n;
	public boolean end=false;
	public PreorderRun(Leaf root, int n1) {
    temp1=root;
    n=n1;
	}
	
	@Override
	public void run(){
		result=false;
		Q_(temp1);		end=true;
	}

	private void Q_(Leaf temp) {
		if(temp!=null){
			Q_(temp.O1);	
			if(temp.hasO1==1){
				if(n== temp.value[0]){
					result=true;
					end=true;
				}	
			}
			Q_(temp.O2);
			if(temp.hasO2==1){
				if(n== temp.value[1]){
					result=true;
					end=true;
				}
			}
			Q_(temp.O3);
			if(temp.hasO3==1){
				if(n== temp.value[2]){
					result=true;
					end=true;
				}
			}
			Q_(temp.O4);
			if(temp.hasO4==1){
				if(n== temp.value[3]){
					result=true;
					end=true;
				}
			}
			Q_(temp.O5);
			if(temp.hasO5==1){
				if(n== temp.value[4]){
					result=true;
					end=true;
				}
			}
			Q_(temp.O6);
			if(temp.hasO6==1){
				if(n== temp.value[5]){
					result=true;
					end=true;
				}
			}
			Q_(temp.O7);
			if(temp.hasO7==1){
				if(n== temp.value[6]){
					result=true;
					end=true;
				}
			}
			Q_(temp.O8);
		}	
	}
}
