package test.java.InterfaceTest.timeNorms.jniLYGAFDCDFFT;

import S_A.linePage.LDFFT;

/*
 * 个人著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com,
 * (lyg.tin@gmail.com2018年回国后因国内G网屏蔽不再使用）
 * 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲一段路 208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
class DoLine2ktfctTest {
	/*
	 * 这是一个 时微分 时流积 函数 在 主流滤波中 的 观测和优化上用于 快速傅立叶的补码熵 
	 * 进行 提取 时聚变 固定内核 方式 真实应用方式，用于时序域与频率域的计算变换。， 
	 * 测试main函数demo的test版本，在导入了api之后进行系统集成，然后用下面的对应的函数
	 * 中源码逻辑进行复制粘贴到工程中，直接运行，即可出结果，源码的逻辑按照输入准备计算的
	 * 参数，然后执行，然后获取输出需要的结果，可以用断点来查看数据，也可以用println来显
	 * 示输出，方便集成，对程序员友好。系统需要jdk1.8 以上的java环境，本人会把测试的输入
	 * 输出都注释在这个文件里。及其傻瓜化的流程，方便商业化落地。--罗瑶光
	 */
     public static void main(String[] argv) {
		//1 input
    	float[] input=new float[1024]; //仅有效 关于 2 的 指数 如2 ，4，8， 16， 32.。。
    	//init...
    	//自己去初始。。random模拟 或者接口。
    	 for(int i = 0; i < input.length; i++) {
    		 input[i] += (float) (0 * Math.sin(i * 2 * 3.1415926 /32));
          }
         for(int i = 0; i < input.length; i++) {
        	 input[i] += (float) (100 * Math.sin(i * 2 * 3.1415926 /64));
          }
         for(int i = 0; i < input.length; i++) {
        	 input[i] += (float) (0 * Math.sin(i * 2 * 3.1415926 /100));
          }
         for(int i = 0; i < input.length; i++) {
        	 input[i] += (float) (1000 * Math.sin(i * 2 * 3.1415926 /128));
          } 
         for(int i = 0; i < input.length; i++) {
        	 input[i] += (float) (0 * Math.sin(i * 2 * 3.1415926 /200));
          }
         for(int i = 0; i < input.length; i++) {
        	 input[i] += (float) (1000 * Math.sin(i * 2 * 3.1415926 /256));
          }
         
    	//2 cacu type 1
        //fft蝶形生成dct余熵2倍角聚变核 做 时流积 来计算频率。速度-O(n)
    	LDFFT lDFFT = new LDFFT();
     	lDFFT.initLine2ktfct(input.length);
     	float[] output = lDFFT.doLine2ktfct(input);
    	
     	
     	//2 cacu type 2
     	//fft蝶形做dct余熵核2倍角聚变来计算频率。速度-O(nlogn)
//    	LDFFT lDFFT = new LDFFT();
//     	lDFFT.initLog2ktfft(input.length);
//     	float[] ftkD = lDFFT.doLog2ktfct(input);
     	
     	//3output
    	//自己去输出 println。。
     	for(int i = 0; i < output.length; i++) {
     		S_logger.Log.logger.info("--" + output[i]);
        } 
	 }
}