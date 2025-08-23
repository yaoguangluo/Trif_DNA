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
public class RegionGet {
	int[] pix;
	public int[] new_region;
	public int scale;
	public RegionGet(int[][] g) {
		int n=0;
		pix=new int[256];
		for (int i=0;i<g.length;i++){
			for(int j=0;j<g[0].length;j++) {
				pix[g[i][j]]++;
			}
		}  
		for(int i=0;i<256;i++){
			if(pix[i]>0){
				n++;
			}
		}
		//20230106-System.out.println(n);
		new_region=new int[n];
		n=0;
		for(int i= 0; i < 256; i++){
			if(pix[i]>0) {
				new_region[n++]= i;
			}
		}
		//20230106-System.out.println("value"+n);
		scale=new_region.length-1;
		//return new_region;	  
	}

	public void buildGraph(int[][] g, String output) {
		int[][]temp=new int[g.length][g[0].length];
		for(int q=0;q<g.length;q++) {
			for(int p=0;p<g[0].length;p++) { 
				temp[q][p]=g[q][p];
			}
		}
		for(int q=0;q<g.length;q++) {
			for(int p=0;p<g[0].length;p++){
				for(int i=0;i<scale;i++){
					if (temp[p][q]==new_region[i]){
						temp[p][q]=255/scale*i;	
					}
				}
			}
		}
		new ReadWritePng().writePNG(output, temp);
	}
}
