/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com, lygtin@sina.com
 * 15116110525, 19173129338, 16674208794
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路 208号 阳光家园别墅小区 第十栋
 * */
#include "jniFFT_LYGFFT.h"
#include "stdbool.h"
#include "math.h"
#include <ctype.h>
#include <stdlib.h>
#include <string.h>

	double pi = 2 * 3.1416926;
//	Double **real;
//	Double **image;
	bool uninit = true;
	struct node{
  	double real;
  	double image;
  	double value;
  };
  typedef struct node cp;

  void say(){
    printf("Hello, world c!\n");
  }

	void IV_(int length) {//later..
	  int N = length;
		uninit = false;
//		**real= (**double)malloc(N*sizeof(*double))
//		**image= (**double)malloc(N*sizeof(*double))
//    for (int i = N; i > 1; i = i / 2) {
//    	Double th = pi / i;
//      *real= (*double)malloc(i*sizeof(double))
//      *image= (*double)malloc(i*sizeof(double))
//      for (int j = 0; j < i / 2; j++) {
//         Double jth = j * th;
//         real[i][j] = cos(jth);
//         image[i][j] = sin(jth);
//      }
//    }
	}

	//refer 库里, 图基
	//我在2018~2020著作权申请文档,github和首页均有refer.
	//FFT 这个 国际 快速傅里叶 通用名字我从没有换过.
	cp* fftk(cp* x, int length) {
		int N = length;
		if (N == 1){
		  cp* output = (cp*)malloc(1* sizeof(cp));
		  output[0]= x[0];
		  return output;
		}
		if (N%2 != 0) {
     	return NULL;
		}
		cp* even = (cp*)malloc((N/2) * sizeof(cp));
		for (int k = 0; k < N/2; k++) {
		  double image= x[k * 2].image;
		  if(isfinite(image)){
		    even[k].image = image;
		  }else{
		    x[k * 2].image =  x[(k - 1) * 2].image;
		    even[k].image = x[k * 2].image;
		  }
		}//傅里叶蝶形变换 复数
		cp* q = fftk(even, N/2);
		if (q == NULL){
    	 free(even);
    	 return NULL;
    }
		cp* odd = even;
		for (int k= 0; k < N/2; k++) {
		  double image= x[k * 2 + 1].image;
			if(isfinite(image)){
      	odd[k].image = image;
      }else{
        x[k * 2].image =  x[(k - 1) * 2].image;
      	odd[k].image = x[k * 2].image;
      }
		}
		cp* r = fftk(odd, N/2);
		if (r == NULL){
		  free(even);
      return NULL;
    }
		cp* y = (cp*)malloc(N*sizeof(cp));
		double th = pi/ N;
		for (int k = 0; k < N/2; k++) {
			double kth = k * th;
			double real = cos(kth);
      double image = sin(kth);
			double creal = real * r[k].real- image * r[k].image;
			double cimage = real * r[k].image + image * r[k].real;
			y[k].real = q[k].real + creal;
			y[k].image = q[k].image + cimage;
			y[k + N/2].real = q[k].real - creal;
			y[k + N/2].image = q[k].image - cimage;
		}
		return y;
	}

	double* fft1(double *input, int length) {
  		if(uninit) {
  			IV_(length);
  		}
  		double* output;
  		output= (double*)malloc(length*sizeof(double));
  		cp* x = (cp*)malloc(length * sizeof(cp));
  		for(int i = 0; i < length; i++) {
  			x[i].image = input[i];
  		}
  		cp* y = fftk(x, length);
  		if (y == NULL){
  		  for(int i = 0; i < length; i++) {
        	 output[i] = 0;
        }
        free(x);
        return output;
      }
  		for(int i = 0; i < length; i++) {
  			output[i] = sqrt(y[i].real * y[i].real + y[i].image * y[i].image);
  		}
  		free(x);
  		return output;
  }
