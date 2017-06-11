//
// Created by Administrator on 2017/3/21.
//

#include "robot_tangwa_discreminationphone_JniTest.h"

JNIEXPORT jstring JNICALL Java_robot_tangwa_discreminationphone_JniTest_sayHello
  (JNIEnv * env, jclass jclass){

    return  env->NewStringUTF("gaunzedong");

  }
