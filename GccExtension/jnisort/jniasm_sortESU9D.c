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
         					int temp= array[j + 1];
         					array[j + 1]= array[j];
         					array[j]= temp;
         					temp= p[j + 1];
                  p[j + 1]= p[j];
                  p[j]= temp;
         				}
         			}
         		}
         	}

  int partition(int *p, int *array, int leftPoint, int rightPoint){
      int x= array[leftPoint]<= array[rightPoint]? array[leftPoint]: array[rightPoint];
      int y= array[leftPoint]<= array[rightPoint]? p[leftPoint]: p[rightPoint];
   		int leftPointReflection= leftPoint;
   		while(leftPointReflection< rightPoint){
   			  while(!(array[leftPointReflection]> x|| leftPointReflection++ >= rightPoint)) {}
   			  while(array[rightPoint--]> x) {}
   			  if(leftPointReflection< ++rightPoint){
   				    int temp= array[rightPoint];
   				    array[rightPoint]= array[leftPointReflection];
   				    array[leftPointReflection]= temp;
   				    temp= p[rightPoint];
              p[rightPoint]= p[leftPointReflection];
              p[leftPointReflection]= temp;
   			  }
   		}
   		array[leftPoint]= array[rightPoint];
   		array[rightPoint]= x;
   	  p[leftPoint]= p[rightPoint];
      p[rightPoint]= y;
   		return rightPoint;
  }

  int swap(int* a, int b3, int p4){
    int* a1; int b1; int p1;
    a1= (int*)malloc(2*sizeof(int));
    int temp= 52;
    int b=1;
    int p=0;
    temp= a1[b];
    a1[b]=a1[p];
    a1[p]=temp;
    return 0;
  }

 int swap0(int *array, int rightPoint, int leftPointReflection){
       	int temp= array[rightPoint];
       	array[rightPoint]= array[leftPointReflection];
       	array[leftPointReflection]= temp;
       	return 3;
  }

  int swap1(int *array, int rightPoint, int leftPointReflection){
                  	int temp= array[rightPoint];
                  	array[rightPoint]= array[leftPointReflection];
                  	array[leftPointReflection]= temp;
                  	//123345
                  		int temp1= rightPoint+leftPointReflection;
                  	return temp1;
             }

 int swap11(){
  int temp= 1;
          int temp1= 2;
        }
    int swap2(){
          Double temp= 1;

        }

        int swap3(){
              int* temp= (int*)malloc(1*sizeof(int));
            }

            int swap4(){
                  int* temp= (int*)malloc(1*sizeof(int));
                  temp[0]=1;
                }

                int swap5(){
                       int* temp= (int*)malloc(2*sizeof(int));
                                        temp[0]=1;
                                         temp[0]=2;
                    }
                     int swap6(int a){
                                          int* temp= (int*)malloc(2*sizeof(int));
                                                           temp[0]=1;
                                                            temp[0]=2;
                                       }
                    int swap7(int*a, int temp1){
                                                            int* temp= (int*)malloc(2*sizeof(int));
                                                                             temp[0]=1;
                                                                              temp[0]=2;
                                                         }
             int swap8(int*a, int *temp){
                                                                        temp= (int*)malloc(2*sizeof(int));
                                                                                         temp[0]=1;
                                                                                          temp[0]=2;
                                                                     }