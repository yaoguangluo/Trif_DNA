package S_A.linePage;
/*
 * 个人著作权人 ，作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com
 * , -
 ** 15116110525-浏阳德塔软件开发有限公司-创始人-法人-总经理-永久非盈利-
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路一段
 *  208号 阳光家园别墅小区 第十栋别墅 第三层
 * */
//罗瑶光2026年1月15日基于世面上的库里图基FFT递归算法进行 熵化蝶形 计算序列重排 去 递归 变换 重新优化。
public class LDFFT{
	float [][]cosNT;
	float [][]sinNT;
	float [][]detaT;
	float [][]detaTs;
	float [][]detaT2;
	float [][]detaTs2;
	//初始一个计算核，用于 fft蝶形生成dct余熵2倍角聚变核 做 时流积 来计算频率。速度-O(n)
	public void initLog2ktfft(int inputLength) {
		//float[] fxets = new float[input.length];
        int size = inputLength;
        int log = 2; 
        float pi = (float) 3.1415926;
        //这个for for循环init可以拿出去new， 提高实时计算效率
    	cosNT = new float[inputLength + 1][inputLength * 2 + 1];
    	sinNT = new float[inputLength + 1][inputLength * 2 + 1];
    	detaT = new float[inputLength + 1][inputLength * 2 + 1];
    	detaTs = new float[inputLength + 1][inputLength * 2 + 1];
    	detaT2 = new float[inputLength + 1][inputLength * 2 + 1];
    	detaTs2 = new float[inputLength + 1][inputLength * 2 + 1];
		for(int i = 0; i < inputLength; i++) {
			for(int j = 2; j < inputLength * 2; j*=2) {
				cosNT[i][j] = (float) Math.cos(i * pi / j);
				sinNT[i][j] = (float) Math.cos(i * pi / j);
			}
		}
		for(int i = 0; i < inputLength; i++) {
			for(int j = 2; j < inputLength * 2; j*=2) {
				if(i <= inputLength/4 && j <= inputLength/2) {
					detaT[i][j] = cosNT[i << 2][j << 1]; 
					detaTs[i][j] = sinNT[i << 2][j << 1]; 
					detaT2[i][j] = cosNT[i << 1][j << 0]; 
					detaTs2[i][j] = sinNT[i << 1][j << 0]; 
				}
			}
		}
	}
	
	float[] dlt;
    float[] dlts;
	float detaET[][];
	float detaETs[][];
	//初始一个计算核，用于 fft蝶形生成dct余熵2倍角聚变核 做 时流积 来计算频率。速度-O(n)
	public void initLine2ktfct(int inputLength) {
        int size = inputLength;
        int log = 2; 
        float pi = (float) 3.1415926;
        //这个for for循环init可以拿出去new， 提高实时计算效率
    	cosNT = new float[inputLength][inputLength * 2];
    	sinNT = new float[inputLength][inputLength * 2];
		for(int i = 0; i < inputLength; i++) {
			for(int j = 2; j < inputLength * 2; j*=2) {
				cosNT[i][j] = (float) Math.cos((i - 1) * pi / j);
				sinNT[i][j] = (float) Math.sin((i - 1) * pi / j);
			}
		}
	    detaT = new float[size][size];
		detaTs = new float[size][size];
		detaET = new float[size][size];
		detaETs = new float[size][size];
        //log - section - loop
        while(log < size) {
            //loop
        	double Ei = 0;
        	int logd = log >> 1;
            int logi = log << 1;
            //double detaT = cosNT[0][log * 2]; // 1/16
            for(int j = 0; j < logd; j++ ) { 
            	//去掉时函数的2倍角代换进行内核化T熵查询即可，
            	//double detaT = cosNT[j << 2][log << 1]; 
            	detaT[j][log]= cosNT[j << 2][log << 1]; 
            	detaTs[j][log]= sinNT[j << 2][log << 1]; 
            	detaET[j][log]= 1 + detaT[j][log]; 
            	detaETs[j][log]= 1 - detaT[j][log]; 
            	//因为我设计内核是从0开始，而这里幂计算是1开始对2的倍数熵，
            	//所以大家用于各类具体实际工程记得去校准一下，
        	    //section - loop
            }
        	log = logi;
        }
        log = 2;
        dlt = new float[inputLength];
        dlts = new float[inputLength];
        for(int i = 0; i < inputLength; i++) {
        	dlt[i] = 1;
        	dlts[i] = 1;
        }
        while(log < size) {
            //loop
        	double Ei = 0;
        	double Eis = 0;
        	int logd = log >> 1;
            int logi = log << 1;
            for(int j = 0; j < logd; j++) { 
                for(int i = 0; i + log < size; i = i + log) {   
                	Ei = dlt[i + j] * detaT[j][log];	
                	Eis = dlts[i + j] * detaTs[j][log];	
                	dlt[i + j] += Ei;	
                	dlt[i + j + logd] -= Eis;
                	//因为减熵是不规则的补码加乘逻辑，于是剔除，
                	//因为剔除了蝶形的倍频减熵，于是用sin来补充迪摩根互补律。
                	dlts[i + j] -= Eis;
                	dlts[i + j + logd] += Ei;
       		    }
            }
        	log = logi;
        }
	}
	
	//fft蝶形做dct余熵核2倍角聚变来计算频率。速度-O(nlogn)
	public float[] doLog2ktfct(float[] input) {
		 float[] output= input.clone();
		 int log = 2; 
		 int size = input.length;
		 while(log < size) {
	        	double Ei = 0;
	        	int logd = log >> 1;
	            int logi = log << 1;
	            for(int j = 0; j < logd; j++) { 
	        	    //section - loop
	                for(int i = j; i + log < size; i = i + log) {                 			  
	                	Ei = output[i] * detaT[j][log];
	                	output[i] += Ei;
	                	output[i + logd] -= Ei;
	       		    }
	            }
	        	log = logi;
	        }
	        for(int i = 0; i < output.length; i++) {
	        	output[i] = Math.abs(output[i]);
	        }
	        return output;
	}
	
	//fft蝶形生成dct余熵2倍角聚变核 做 时流积 来计算频率。速度-O(n)
	public float[] doLine2ktfct(float[] input) {
		float[] output = new float[input.length];
		for(int i = 0; i < input.length - 1; i++) {
	        	//1024 * 5 的乘法计算次数 
//	        	fxet[i] =  (float) Math.abs((fxet[i] * dlt[i] + fxet[i + 1] * dlts[i])*(fxet[i] * dlts[i + 1] + fxet[i + 1] * dlt[i + 1]));
//	        	//1024 * 4 的乘法计算次数  
//	        	fxet[i] =  (float) Math.abs((fxet[i] * dlt[i] + fxet[i + 1] * dlts[i])+(fxet[i] * dlts[i + 1] + fxet[i + 1] * dlt[i + 1]));
//	        	//1024 * 3 的乘法计算次数 
			    output[i] =  (float) Math.abs((input[i] * dlt[i] + input[i + 1] * dlts[i])*(dlts[i + 1] + dlt[i + 1]));
//	        	//1024 * 2 的乘法计算次数 
//			    output[i] =  (float) Math.abs(input[i] * dlt[i] + input[i + 1] * dlts[i]);
//	     	  	//1024 * 1 的乘法计算次数 
//			    output[i] =  (float) Math.abs(input[i] * dlt[i]);
	  	       
	    }
	    return output;
	}
	
	public float[] doLdfft(float []input) {
		 float[] fxet = input.clone();
         int size = input.length;
         int log = 2; 
         float pi = (float) 3.1415926;
//         //log - section - loop
         while(log < size) {
         	double Qk = 2 * pi / log;//log2
         	double currentC = Math.cos(Qk);
         	double currentQic = currentC;
         	double currentS = Math.sin(Qk);
         	double currentQis = currentS;
             //loop
         	double Ei = 0;
            for(int j = 0; j < log/2; j++ ) {
             	double regc = currentC * currentQic - currentS * currentQis;
             	currentS = currentC * currentQis + currentS * currentQic;
             	currentC = regc;
         	    //section - loop
                for(int i = 0; i + log < size; i = i + log) {                 			  
                 	Ei = fxet[i + j] * currentC;
                   	fxet[i + j] += Ei;	
                   	fxet[i + j + log/2] -= Ei;	
        		}
            }
         	log = log * 2;
         }
         return fxet;
	}
	//因为（2cosAcosB + 1) 除以2的频域误差性，
	//于是将时函数 的分数熵阶进行 极速处理 对应特殊对称2倍角（2cosAcosB - 1）的 逆代换优化
	public float[] do2Ldfft(float []input) {		
		float[] fxet = input.clone();
        int size = input.length;
        int log = 2; 
        float pi = (float) 3.1415926;
        //这个for for循环init可以拿出去new， 提高实时计算效率
    	double [][]cosNT = new double[input.length][input.length * 2];
		for(int i = 0; i < input.length; i++) {
			for(int j = 2; j < input.length * 2; j*=2) {
				cosNT[i][j] = Math.cos((i - 1) * pi / j);
			}
		}
        //log - section - loop
        while(log < size) {
        	double currentC;
            //loop
        	double Ei = 0;
            for(int j = 0; j < log/2; j++ ) {    	   
        	    double detaT = cosNT[j * 2 + 2][log * 2]; 
        	    currentC = 2 * detaT * detaT - 1;
        	    //section - loop
                for(int i = 0; i + log < size; i = i + log) {                 			  
                	Ei = fxet[i + j] * currentC;
                  	fxet[i + j] += Ei;	
                  	fxet[i + j + log/2] -= Ei;	
       		    }
            }
        	log = log * 2;
        }
        for(int i = 0; i < fxet.length; i++) {
        	fxet[i] = Math.abs(fxet[i]);
        }
        return fxet;
	}
	
	public float[] doEt2Ldfft(float []input) {		
		float[] fxet = input.clone();
        int size = input.length;
        int log = 2; 
        float pi = (float) 3.1415926;
        //这个for for循环init可以拿出去new， 提高实时计算效率
    	double [][]cosNT = new double[input.length][input.length * 2];
		for(int i = 0; i < input.length; i++) {
			for(int j = 2; j < input.length * 2; j*=2) {
				cosNT[i][j] = Math.cos((i - 1) * pi / j);
			}
		}
        //log - section - loop
        while(log < size) {
            //loop
        	double Ei = 0;
        	int logd = log >> 1;
            int logi = log << 1;
            //double detaT = cosNT[0][log * 2]; // 1/16
            for(int j = 0; j < logd; j++ ) { 
            	//去掉时函数的2倍角代换进行内核化T熵查询即可，
            	double detaT = cosNT[j << 2][log << 1]; 
            	//因为我设计内核是从0开始，而这里幂计算是1开始对2的倍数熵，
            	//所以大家用于各类具体实际工程记得去校准一下，
        	    //section - loop
                for(int i = 0; i + log < size; i = i + log) {                 			  
                	Ei = fxet[i + j] * detaT;
                  	fxet[i + j] += Ei;	
                  	fxet[i + j + logd] -= Ei;	
                	//Ei = fxet[i + j] * detaT;
                  	//fxet[i + j] +=  fxet[i + j] * detaT;	
                  	//fxet[i + j + logd] -= fxet[i + j+ logd] * detaT;	
       		    }
            }
        	log = logi;
        }
        for(int i = 0; i < fxet.length; i++) {
        	fxet[i] = Math.abs(fxet[i]);
        }
        return fxet;
	}
	
	//今天花了3个小时，剔除了2倍角的蝶形熵减，来满足计算加速，最后做1024的乘法，
	//速度提高10倍，但质量降低10%，仅对2的指数倍频敏感，于是增加sin核做迪摩根补码。
	//价值是多频调制解调，能精确控制某组频率的分贝值。
	public float[] doSigmaEt2Ldfft(float []input) {		
		float[] fxet = input.clone();
		float[] fxetb = new float[input.length];
        int size = input.length;
        int log = 2; 
        float pi = (float) 3.1415926;
        //这个for for循环init可以拿出去new， 提高实时计算效率
    	float [][]cosNT = new float[input.length][input.length * 2];
    	float [][]sinNT = new float[input.length][input.length * 2];
		for(int i = 0; i < input.length; i++) {
			for(int j = 2; j < input.length * 2; j*=2) {
				cosNT[i][j] = (float) Math.cos((i - 1) * pi / j);
				sinNT[i][j] = (float) Math.sin((i - 1) * pi / j);
			}
		}
		float detaT[][] = new float[size][size];
		float detaTs[][] = new float[size][size];
		float detaET[][] = new float[size][size];
		float detaETs[][] = new float[size][size];
        //log - section - loop
        while(log < size) {
            //loop
        	double Ei = 0;
        	int logd = log >> 1;
            int logi = log << 1;
            //double detaT = cosNT[0][log * 2]; // 1/16
            for(int j = 0; j < logd; j++ ) { 
            	//去掉时函数的2倍角代换进行内核化T熵查询即可，
            	//double detaT = cosNT[j << 2][log << 1]; 
            	detaT[j][log]= cosNT[j << 2][log << 1]; 
            	detaTs[j][log]= sinNT[j << 2][log << 1]; 
            	detaET[j][log]= 1 + detaT[j][log]; 
            	detaETs[j][log]= 1 - detaT[j][log]; 
            	//因为我设计内核是从0开始，而这里幂计算是1开始对2的倍数熵，
            	//所以大家用于各类具体实际工程记得去校准一下，
        	    //section - loop
            }
        	log = logi;
        }
        log = 2;
        float[] dlt = new float[input.length];
        float[] dlts = new float[input.length];
        for(int i = 0; i < fxet.length; i++) {
        	dlt[i] = 1;
        	dlts[i] = 1;
        }
        while(log < size) {
            //loop
        	double Ei = 0;
        	double Eis = 0;
        	int logd = log >> 1;
            int logi = log << 1;
            for(int j = 0; j < logd; j++) { 
                for(int i = 0; i + log < size; i = i + log) {   
                	Ei = dlt[i + j] * detaT[j][log];	
                	Eis = dlts[i + j] * detaTs[j][log];	
                	dlt[i + j] += Ei;	
                	dlt[i + j + logd] -= Eis;
                	//因为减熵是不规则的补码加乘逻辑，于是剔除，因为剔除了蝶形的倍频减熵，
                	//于是用sin来补充迪摩根互补律。
                	dlts[i + j] -= Eis;
                	dlts[i + j + logd] += Ei;
       		    }
            }
        	log = logi;
        }
        for(int i = 0; i < fxet.length; i++) {
        	 dlt[i] =  (float) Math.abs(2 * dlt[i] * dlt[i] - 1);
        	 dlts[i] =  (float) Math.abs(2 * dlts[i] * dlts[i] - 1);
        }
        //上面的函数可以全部拿出去做定值全局，fft的o（nlogn） 次数在这里成了 o（n），切记只对2的指数峰敏感。
        //老工程用记得修正 0 1 -1的计算偏移量和误区，新工程用记得重写测时函数。
        for(int i = 0; i < fxet.length - 1; i++) {
        	 fxet[i] =  (float) Math.abs(fxet[i] * dlt[i] + fxet[i] * dlts[i]);
        }
        return fxet;
	}
	
	//昨天思考了2个小时，关于log熵内积去时函数特殊关系和2倍角关系进行定值k提取，现在通过迪摩根的比特
	//位计算进行归一化，我得到一个最简单的方式，
	public float[] doSigmaEt2Ldfft1(float []input) {		
		float[] fxet = input.clone();
		float[] fxetb = new float[input.length];
        int size = input.length;
        int log = 2; 
        float pi = (float) 3.1415926;
        //这个for for循环init可以拿出去new， 提高实时计算效率
        float [][]cosNT = new float[input.length][input.length * 2];
		for(int i = 0; i < input.length; i++) {
			for(int j = 2; j < input.length * 2; j *= 2) {
				cosNT[i][j] = (float) Math.cos((i - 1) * pi / j);
			}
		}
	    float Et_cosk_logn_bit_sign[] = new float [size];
	    float Et_cosk_logd_bit_sign[] = new float [size];
	    for(int i = 0; i < fxet.length; i++) {
		    for(int j = 0; j < fxet.length; j++) {
			    Et_cosk_logn_bit_sign[i] = 1;
			    Et_cosk_logd_bit_sign[i] = 1;
	        }
        }
	    float detaT[][] = new float[size][size];
	    float detaDT[][] = new float[size][size];
        //log - section - loop
        while(log < size) {
            //loop
      	    double Ei = 0;
      	    int logd = log >> 1;
            int logi = log << 1;
            //double detaT = cosNT[0][log * 2]; // 1/16
            for(int j = 0; j < logd; j++) { 
        	    //去掉时函数的2倍角代换进行内核化T熵查询即可，  
        	    detaDT[j][log] = cosNT[j << 2][log << 1];
        	    detaT[j][log] = 1 +  detaDT[j][log];
        	    //因为我设计内核是从0开始，而这里幂计算是1开始对2的倍数熵，
        	    //所以大家用于各类具体实际工程记得去校准一下，
        	    //section - loop
        	    for(int i = 0; i + log < size; i = i + log) {                 			  
        		    //Et_cosk_logn_bit_sign[i + j] = (float) (Et_cosk_logn_bit_sign[i + j] * detaT);	
        		    //Et_cosk_logd_bit_sign[i + j] = (float) (Et_cosk_logd_bit_sign[i + j] * (1 + detaT));	
        		    //于是跟进思考，这里的多倍区间熵减是一种交换律形态，不是单倍的detat 伽马集需要稍后计算讨论，
        		    //但这种优化方式直接将熵成为了定值，o（nlogn） fft计算量因为定值提出去，成为了 o（n）也即是1024次。。
        		    // Et_cosk_logn_bit_sign[i + j + logd] -= detaT;	
        	    }
            }
      	    log = logi;
        }
      
        //log - section - loop
        while(log < size) {
            //loop
      	    double Ei = 0;
      	    int logd = log >> 1;
            int logi = log << 1;
            //double detaT = cosNT[0][log * 2]; // 1/16
            for(int j = 0; j < logd; j++) { 
            	//fxet[j] *= detaT[j][log];	
            	double detaTi = cosNT[j << 2][log << 1]; 
        	    //section - loop
        	    for(int i = 0; i + log < size; i = i + log) {  
//        		    fxet[i + j + logd] -= fxet[i + j] * detaDT[j][log];	
//        		    fxet[i + j] *= detaT[j][log];	
        	    	//Ei = fxet[i + j] * detaDT[j][log];
        	    	Ei = fxet[i + j] * detaTi;
                  	fxet[i + j] += Ei;	
                  	fxet[i + j + logd] -= Ei;	
        	    }
            }
      	    log = logi;
        }
      
	    //fx 是当前的fxet子集对应的倍频率域 的带有符号和, 之后统一下类型
        for(int i = 0; i < fxet.length; i++) {
            //还没完，稍后。我要吃饭睡觉玩，今天就到这。
    	    fxet[i] = (float) Math.sqrt(fxet[i] * fxet[i] + fxetb[i] * fxetb[i]);
        }
        return fxet;
	}
	
	    //刚刚又思考了2个小时，关于log熵内积去时函数特殊关系和2倍角关系进行定值k提取，现在通过
	    //迪摩根的比特位计算进行归一化，我得到一个最简单的方式，当时没有考虑运动者的变化状态，只考虑了
	    //观测者的内积变化关系，于是现在观测者一旦分离，便将运动者的变化状态做个5000次简单的加法观测，看看效果，
	    //不做乘积变化，因为上两个版本就是5000次乘加。
		public float[] doSigmaLogEt2Logdfft(float []input) {		
				float[] fxet = input.clone();
				float[] fxetb = new float[input.length];
		        int size = input.length;
		        int log = 2; 
		        float pi = (float) 3.1415926;
		        //这个for for循环init可以拿出去new， 提高实时计算效率
		    	float [][]cosNT = new float[input.length][input.length * 2];
		    	float [][]sinNT = new float[input.length][input.length * 2];
				for(int i = 0; i < input.length; i++) {
					for(int j = 2; j < input.length * 2; j*=2) {
						cosNT[i][j] = (float) Math.cos((i - 1) * pi / j);
						sinNT[i][j] = (float) Math.sin((i - 1) * pi / j);
					}
				}
				float detaT[][] = new float[size][size];
				float detaTs[][] = new float[size][size];
				float detaET[][] = new float[size][size];
				float detaETs[][] = new float[size][size];
		        //log - section - loop
		        while(log < size) {
		            //loop
		        	double Ei = 0;
		        	int logd = log >> 1;
		            int logi = log << 1;
		            //double detaT = cosNT[0][log * 2]; // 1/16
		            for(int j = 0; j < logd; j++ ) { 
		            	//去掉时函数的2倍角代换进行内核化T熵查询即可，
		            	//double detaT = cosNT[j << 2][log << 1]; 
		            	detaT[j][log]= cosNT[j << 2][log << 1]; 
		            	detaTs[j][log]= sinNT[j << 2][log << 1]; 
		            	detaET[j][log]= 1 + detaT[j][log]; 
		            	detaETs[j][log]= 1 - detaT[j][log]; 
		            	//因为我设计内核是从0开始，而这里幂计算是1开始对2的倍数熵，
		            	//所以大家用于各类具体实际工程记得去校准一下，
		        	    //section - loop
		            }
		        	log = logi;
		        }
		        log = 2;
		        float[] dlt = new float[input.length];
		        float[] dlts = new float[input.length];
		        for(int i = 0; i < fxet.length; i++) {
		        	dlt[i] = 1;
		        	dlts[i] = 1;
		        }
		        while(log < size) {
		            //loop
		        	double Ei = 0;
		        	double Eis = 0;
		        	int logd = log >> 1;
		            int logi = log << 1;
		            for(int j = 0; j < logd; j++) { 
		                for(int i = 0; i + log < size; i = i + log) {   
		                	Ei = dlt[i + j] * detaT[j][log];	
		                	Eis = dlts[i + j] * detaTs[j][log];	
		                	dlt[i + j] += Ei;	
		                	dlt[i + j + logd] -= Eis;
		                	//因为减熵是不规则的补码加乘逻辑，于是剔除，
		                	//因为剔除了蝶形的倍频减熵，于是用sin来补充迪摩根互补律。
		                	dlts[i + j] -= Eis;
		                	dlts[i + j + logd] += Ei;
		       		    }
		            }
		        	log = logi;
		        }
	       float En=0;
	       for(int i = 0; i < fxet.length; i++) {
	           //加sigma 加 分数做了几组简单测试，可以跟进，这里略
	    	    En += fxet[i];
	        }
	       
		    //fx 是当前的fxet子集对应的倍频率域 的带有符号和, 之后统一下类型
	        for(int i = 0; i < fxet.length-1; i++) {
	        	//1024 * 5 的乘法计算次数 
//	        	fxet[i] =  (float) Math.abs((fxet[i] * dlt[i] + fxet[i + 1] * dlts[i])*(fxet[i] * dlts[i + 1] + fxet[i + 1] * dlt[i + 1]));
//	        	//1024 * 4 的乘法计算次数  
//	        	fxet[i] =  (float) Math.abs((fxet[i] * dlt[i] + fxet[i + 1] * dlts[i])+(fxet[i] * dlts[i + 1] + fxet[i + 1] * dlt[i + 1]));
//	        	//1024 * 3 的乘法计算次数 
	        	fxet[i] =  (float) Math.abs((fxet[i] * dlt[i] + fxet[i + 1] * dlts[i])*(dlts[i + 1] + dlt[i + 1]));
//	        	//1024 * 2 的乘法计算次数 
//	        	fxet[i] =  (float) Math.abs(fxet[i] * dlt[i] + fxet[i + 1] * dlts[i]);
//	     	  	//1024 * 1 的乘法计算次数 
//	            fxet[i] =  (float) Math.abs(fxet[i] * dlt[i]);
	  	       
	        }
	        return fxet;
		}
	
	    //内核定值优化版本 基于FFT进行去递归，
		public float[] doEt2LdfftOpt(float []input) {		
			float[] fxet = input.clone();
			//float[] fxets = new float[input.length];
	        int size = input.length;
	        int log = 2; 
	        float pi = (float) 3.1415926;
	        //这个for for循环init可以拿出去new， 提高实时计算效率
	    	double [][]cosNT = new double[input.length + 1][input.length * 2 + 1];
	    	double [][]sinNT = new double[input.length + 1][input.length * 2 + 1];
	    	double [][]detaT = new double[input.length + 1][input.length * 2 + 1];
	    	double [][]detaTs = new double[input.length + 1][input.length * 2 + 1];
	    	double [][]detaT2 = new double[input.length + 1][input.length * 2 + 1];
	    	double [][]detaTs2 = new double[input.length + 1][input.length * 2 + 1];
			for(int i = 0; i < input.length; i++) {
				for(int j = 2; j < input.length * 2; j*=2) {
					cosNT[i][j] = Math.cos(i * pi / j);
					sinNT[i][j] = Math.cos(i * pi / j);
				}
			}
			for(int i = 0; i < input.length; i++) {
				for(int j = 2; j < input.length * 2; j*=2) {
					//cosNT[i][j] = Math.cos((i - 1) * pi / j);
					if(i <= input.length/4 && j <= input.length/2) {
						detaT[i][j] = cosNT[i << 2][j << 1]; 
						detaTs[i][j] = sinNT[i << 2][j << 1]; 
						detaT2[i][j] = cosNT[i << 1][j << 0]; 
						detaTs2[i][j] = sinNT[i << 1][j << 0]; 
					}
				}
			}
	        //log - section - loop
	        while(log < size) {
	            //loop
	        	double Ei = 0;
	        	int logd = log >> 1;
	            int logi = log << 1;
	            for(int j = 0; j < logd; j++) { 
	        	    //section - loop
	                for(int i = j; i + log < size; i = i + log) {                 			  
	                	Ei = fxet[i] * detaT[j][log];
	                	//Eis = fxet[i] * detaTs[j][log];
	                  	fxet[i] += Ei;	
	                  	//fxets[i] += Eis;
	                  	fxet[i + logd] -= Ei;
	                	//fxets[i + logd] -= Eis;
	       		    }
	            }
	        	log = logi;
	        }
	        for(int i = 0; i < fxet.length; i++) {
	        	fxet[i] = Math.abs(fxet[i]);
	        	
	        }
	        return fxet;
		}
		
		
		
}
//1/8 -- 2/16 --   2 * detaT[] * detaT[] - 1
//2/8 -- 4/16 --  2 * (2 * detaT[] * detaT[] - 1)
//3/8 -- 6/16 --  3 * (2 * detaT[] * detaT[] - 1)
//4/8 --
//currentC = 2 * detaT * detaT - 1; // cosNT[0][log * 2]
//currentC = 2 * j * detaT;
//currentC = cosNT[2 * j][log * 2];
//还可以用时函数跟进优化，2028年再公开。，
//currentC = regc;
//这种只考虑 +- 2cosAcosB +- 1 中关于的 + 2cosAcosB - 1 时候 A 又= B 的 
//绝对固定的2倍角公式条件来化解分数熵对数用法，
//有效计算小于2万次，但比之前除以2的熵化7000次要多，质量还保真。
//我罗瑶光给大家的提的疑问是为什么不用同理的sin变换来处理fft倍频熵？我定义为大三或者研一的难度。 