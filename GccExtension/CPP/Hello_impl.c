#include "CTest.h"
#include <stdio.h>
#include "Hello.h"

JNIEXPORT void JNICALL Java_CTest_helloFromC(JNIEnv* env, jobject obj) {
  helloFromC();
}