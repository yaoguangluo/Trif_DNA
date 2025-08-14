package U_A.PEU.P.image;

import P.image.Reflection;

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
public class HitAndMiss{
	int[][]kernel;
	int[][]GetRegion;
	int[][]tempG;
	private void IV_Temp(int[][]thisG) {
		tempG=new int[thisG.length][thisG[0].length];
		for(int i=0;i<thisG.length;i++){
			for(int j=0;j<thisG[0].length;j++){
				tempG[i][j]=0;
			}
		}		
	}
	public int[][] P(int[][] g, int pix, int[][] kenel) {
		int [][]g1=new int[g.length][g[0].length];
		for(int i=0;i<g.length;i++){
			for(int j=0;j<g[0].length;j++){
				g1[i][j]=g[i][j];
			}
		}
		int thisw=g.length;
		int thish=g[0].length;
		int w=kenel.length;
		int h=kenel[0].length;
		int [][]thisG= null;
		if((kenel.length%2==0)&&(kenel[0].length%2==0))
			thisG= Reflection.PadImage(g1, kenel.length+1, kenel[0].length+1);
		if((kenel.length%2==0)&&(kenel[0].length%2==1))
			thisG= Reflection.PadImage(g1, kenel.length+1, kenel[0].length);
		if((kenel.length%2==1)&&(kenel[0].length%2==0))
			thisG= Reflection.PadImage(g1, kenel.length, kenel[0].length+1);
		if((kenel.length%2==1)&&(kenel[0].length%2==1))
			thisG= Reflection.PadImage(g1, kenel.length, kenel[0].length);

		for(int i=0;i<thisG.length;i++) {
			for(int j=0;j<thisG[0].length;j++){
				if (thisG[i][j]!=pix){
					thisG[i][j]=0; // filter
				}
			}
		}
		IV_Temp(thisG);	
		for(int i=w/2;i<thisw+w/2;i++){
			for(int j=h/2;j<thish+h/2;j++){
				int last=0;
				for(int p=0;p<w;p++){
					for(int q=0;q<h;q++){
						int temp= 0;
						if(kenel[p][q]==1){
							if(thisG[i-w/2+p][j-h/2+q]>0){
								temp=1;
							}
						}
						if(kenel[p][q]==0){
							if(thisG[i-w/2+p][j-h/2+q]==0){
								temp=1;
							}
						}
						if(kenel[p][q]==-1){
							temp=1;		
						}
						last=last+temp;
					}
				}
				if (last==w*h){
					tempG[i][j]=thisG[i][j];
				}
			}	        	
		}
		return tempG;
	}
}
