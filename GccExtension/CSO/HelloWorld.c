#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <sys/socket.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <signal.h>
#include <pthread.h>
#include <sys/types.h>
#include <sys/un.h>
/*
 * 著作权人, 作者 罗瑶光, 浏阳
 * yaoguangluo@outlook.com, 313699483@qq.com, 2080315360@qq.com, lyg.tin@gmail.com, lygtin@sina.com
 * 15116110525, 19173129338, 16674208794
 * 430181198505250014, G24402609, EB0581342
 * 204925063, 389418686, F2406501, 0626136
 * 湖南省 浏阳市 集里街道 神仙坳社区 大塘冲路 208号 阳光家园别墅小区 第十栋
 * */
//demo调通。准备接口化编码。明年，华瑞集3.0
public int test(int va){
  int result= 30;
  asm("movl       %1,    %%eax\n\t"
      "imull   %%eax,    %%eax\n\t"
      "movl    %%eax,    %0"
      : "=r" (result)
      : "r" (va)
      : "%eax"
  );
  printf("%d\n--end", result);
}
int main(int argc, char *argv[]) {
  printf("--macro\n");
  printf("%d\n--argc\n", argc);
  printf("%s\n--argv0\n", argv[0]);
  printf("%s\n--argv1\n", argv[1]);
  printf("%s\n--argv2\n", argv[2]);
  int result= 30;
  int va= atoi(argv[1]);
  asm("movl      %1,    %%eax\n\t"
      "imull  %%eax,    %%eax\n\t"
      "movl   %%eax,    %0"
      : "=r" (result)
      : "r" (va)
      : "%eax"
  );
  printf("%d\n--end", result);
  return 0;
}