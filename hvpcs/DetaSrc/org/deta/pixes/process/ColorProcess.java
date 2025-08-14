package DetaSrc.org.deta.pixes.process;
//1.1 ���ص��ܺ�
//1.2 ���ص���Ҫ��ɫ�ܺ�
//1.3 ���ص�������ɫ�ܺ�
//1.4 ���ص�������ɫ��ͳ��

import java.awt.image.BufferedImage;

//��������api֮ǰ���ҵĵ�������Ԥ����Ѿ��������ص�����洢����
//AMV_MVS_VSQ_2D��2ά���꣬��ӦͼƬ�����ص����ꡣ
//�ǾͿ�ʼ��
//���� ������
/*
 * ����Ȩ�� ������ ������, ���
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com- lygtin@sina.com
 * 15116110525,  ,
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * ����ʡ ����� ����ֵ� ���������� ������·һ��208�� �����԰����С�� ��ʮ��
 * */public interface ColorProcess{
	//1.1 ���ص��ܺ�
	//���ȣ�����Ҫһ��ͼƬ��Ȼ���ͼƬ�ж�ȡ��׼����ԭɫ��������������
	
	//1.2 ���ص���Ҫ��ɫ�ܺ�
	//�������ص���Ҫ��ɫ �Ҷ�λ���߲�ɫ����Ȼ�������ϡ�
	
	//1.3 ���ص�������ɫ�ܺ�
	//�������ص���Ҫ��ɫ �Ҷ�λ��21��ɫ�ף� ǳ��� ǳ��� ǳ��� ǳ��� ǳ��� ǳ��� ǳ����
	
	//1.4 ���ص�������ɫ��ͳ��
	//�������ص�������ɫ �Ҷ�λ������ĳһ��rgb ��ĳһ����ɫ�׶Σ� ĳһ�����䣬����������ɫͳ�ơ�
	
	
	//1.1 ���ص��ܺ�
	//���ȣ�����Ҫһ��ͼƬ��Ȼ���ͼƬ�ж�ȡ��׼����ԭɫ��������������
	public int readPixesAndReturnAmountOfPixes(int[][] pixes);// >0
	public int readBufferedImageAndReturnAmountOfRedPixGroup(BufferedImage bufferedImage);
	public int readBufferedImageAndReturnAmountOfGreenPixGroup(BufferedImage bufferedImage);
	public int readBufferedImageAndReturnAmountOfBluePixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfRGBPixGroup(BufferedImage bufferedImage);
	public int[] readPixesAndReturnAmountsOfRGBPixGroup(int[][][] pixes, String arranges);
	
	//1.2 ���ص���Ҫ��ɫ�ܺ�
	//�������ص���Ҫ��ɫ �Ҷ�λ���߲�ɫ����Ȼ�������ϡ�
	public int[] readBufferedImageAndReturnAmountsOfPCARedPixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCAGreenPixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCABluePixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCAYellowPixGroup(BufferedImage bufferedImage);
	//������pink ����
	public int[] readBufferedImageAndReturnAmountsOfPCAPinkPixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCACyanPixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCAPurplePixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCAOrangePixGroup(BufferedImage bufferedImage);
	public int[] readBufferedImageAndReturnAmountsOfPCAPixGroup(BufferedImage bufferedImage, String arranges);
	
	//1.2 ���ص���Ҫ��ɫ�ܺ�
	//�������ص���Ҫ��ɫ �Ҷ�λ���߲�ɫ����Ȼ�������ϡ�
	public int readPixesAndReturnAmountOfPCARedPixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCAGreenPixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCABluePixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCAYellowPixGroup(int[][][] pixes);
	//������pink ����
	public int readPixesAndReturnAmountOfPCAPinkPixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCACyanPixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCAPurplePixGroup(int[][][] pixes);
	public int readPixesAndReturnAmountOfPCAOrangePixGroup(int[][][] pixes);
	public int[] readPixesAndReturnAmountsOfPCAPixGroup(int[][][] pixes, String arranges);
	
	//1.3 ���ص�������ɫ�ܺ�
	//�������ص���Ҫ��ɫ �Ҷ�λ��21��ɫ�ף� ǳ��� ǳ��� ǳ��� ǳ��� ǳ��� ǳ��� ǳ����

	public int[] readBufferedImageAndReturnAmountsOfICARedPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICAGreenPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICABluePixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICAYellowPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	//������pink ����
	public int[] readBufferedImageAndReturnAmountsOfICAPinkPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICACyanPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICAPurplePixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICAOrangePixGroup(BufferedImage bufferedImage, String arranges, int sections);
	public int[] readBufferedImageAndReturnAmountsOfICAPixGroup(BufferedImage bufferedImage, String arranges, int sections);
	
	public int[] readPixesAndReturnAmountsOfICARedPixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICAGreenPixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICABluePixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICAYellowPixGroup(int[][][] pixes, String arranges, int sections);
	//������pink ����
	public int[] readPixesAndReturnAmountsOfICAPinkPixGroup(int[][][] pixes, String arranges, int sections);
	
	public int[] readPixesAndReturnAmountsOfICACyanPixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICAPurplePixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICAOrangePixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICAPixGroup(int[][][] pixes, String arranges, int sections);
	
	//1.4 ���ص�������ɫ��ͳ��
	//�������ص�������ɫ �Ҷ�λ������ĳһ��rgb ��ĳһ����ɫ�׶Σ� ĳһ�����䣬����������ɫͳ�ơ�
	public int readPixesAndReturnAmountOfPCADeterminatedPixGroup(int[][][] pixes, String arranges, int sections);
	public int[] readPixesAndReturnAmountsOfICADeterminatedPixGroup(int[][][] pixes, String arranges, int sections);
	
	//arranges���ɫ����ɫ������arranges="RB"   ���ɫ����ɫ������arranges="RG"
	//sections�ֲ��� 5�� ��ɫ�����5�㣬8 ��ɫ�����8��. ��ζ�� 255, 255, 255����ԭɫ        (65535/7) /�ֲ�  ������⡣
}	
	