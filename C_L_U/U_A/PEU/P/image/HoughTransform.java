package U_A.PEU.P.image;
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
 * 著作权人 ，作者 罗瑶光, 浏阳
 * 授课 reinhart 加州路德大学 课后作业。
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, -
 ** 15116110525-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
*  208号 阳光家园别墅小区 第十栋
 * */
public class HoughTransform {
	public int [][]HTMatrix;
	public void HoughTransformLoop(int[][] g, int pix, int scale) {
		
		for(int i=0;i<g.length;i++){
			for(int j=0;j<g[0].length;j++){
				if(g[i][j]==pix){
					for(int p=0;p<360;p++){
						double sita=p*Math.PI/360;
						int psita=(int) (i*Math.cos(sita)+j*Math.sin(sita));
						if (psita<0) psita=0;
						HTMatrix[psita][p]=HTMatrix[psita][p]+scale;
					}
				}
			}
		}
	}

	public void IV_HTMatrix(int[][] g) {
		int max=0;
		for(int i=0;i<g.length;i++){
			for(int j=0;j<g[0].length;j++){
				for(int p=0;p<360;p++){
					double sita=p*Math.PI/360;
					int temp=(int) (i*Math.cos(sita)+j*Math.sin(sita));
					if (temp>=max) {
						max=temp;
					}
				}
			}
		}   
		HTMatrix=new int[max+1][360];	  
		for(int p=0;p<360;p++) {
			for(int psita=0;psita<max+1;psita++ )  {
				HTMatrix[psita][p]=0;
			}
		}
	}
}
