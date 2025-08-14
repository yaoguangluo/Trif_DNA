#include "stdio.h"
#include "CSO_Test.h"

#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     CSO_Test
 * Method:    add
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_CSO_Test_add
  (JNIEnv * va, jobject, jint vb){
    printf("Hello World!\n %s\n", vb*vb);
  };

#ifdef __cplusplus
}
#endif