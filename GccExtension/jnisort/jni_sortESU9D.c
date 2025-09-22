/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com, lygtin@sina.com
 * 15116110525, 19173129338, 16674208794
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路 208号 阳光家园别墅小区 第十栋
 * */
#include "jni_sortESU9D.h"
#include <ctype.h>
#include <stdlib.h>
#include <string.h>
void say(){
  printf("Hello, world c!\n");
}

 void processDouble(int *p, int *array, int leftPoint, int rightPoint, int deep) {
         		int c= rightPoint- leftPoint+ 1;
         		if(!(c< 7|| deep> 70)) {
         			int pos= partition(p, array, leftPoint, rightPoint);
         			if(leftPoint< pos- 1) {
         				processDouble(p, array, leftPoint, pos- 1, deep+ 1);
         			}
         			if(pos+ 1< rightPoint) {
         				processDouble(p, array, pos+ 1, rightPoint, deep+ 1);
         			}
         			return;
         		}
         		int i= leftPoint;
         		for(int j= i+ 1; j< leftPoint+ c; j= i++){
         			while(j> leftPoint){
         				if(array[j]< array[--j]){
                  int temp;
                asm volatile(
                   "MOV %w[t], %w[a]\n"
                   "MOV %w[a], %w[b]\n"
                   "MOV %w[b], %w[t]\n"
                   "MOV %w[t], %w[c]\n"
                   "MOV %w[c], %w[d]\n"
                   "MOV %w[d], %w[t]"
                 : [a] "+r" (array[j + 1])
                 , [b] "+r" (array[j])
                 , [c] "+r" (p[j + 1])
                 , [d] "+r" (p[j])
                 , [t] "+r" (temp)
                 :
                 : "memory"
              );
         				}
         			}
         		}
         	}
//fix later.20240803 80486 量子比特位64位置汇编加速。
//fix later 20240804 1039 比特位置加速和可控加速，单计算加速可控强限制分级。
  int partition(int *p, int *array, int leftPoint, int rightPoint){
      int x= array[leftPoint]<= array[rightPoint]? array[leftPoint]: array[rightPoint];
      int y= array[leftPoint]<= array[rightPoint]? p[leftPoint]: p[rightPoint];
   		int leftPointReflection= leftPoint;
   		while(leftPointReflection< rightPoint){
   			  while(!(array[leftPointReflection]> x|| leftPointReflection++ >= rightPoint)) {}
   			  while(array[rightPoint--]> x) {}
   			  if(leftPointReflection< ++rightPoint){
            int temp;
          asm volatile(
              "MOV %w[t], %w[a]\n"
              "MOV %w[a], %w[b]\n"
              "MOV %w[b], %w[t]\n"
              "MOV %w[t], %w[c]\n"
              "MOV %w[c], %w[d]\n"
              "MOV %w[d], %w[t]"
            : [a] "+r" (array[rightPoint]),
              [b] "+r" (array[leftPointReflection]),
              [c] "+r" (p[rightPoint]),
              [d] "+r" (p[leftPointReflection]),
              [t] "+r" (temp)
            :
            : "memory"
              );
   			  }
   		}
   		array[leftPoint]= array[rightPoint];
   		array[rightPoint]= x;
   	  p[leftPoint]= p[rightPoint];
      p[rightPoint]= y;
   		return rightPoint;
  }