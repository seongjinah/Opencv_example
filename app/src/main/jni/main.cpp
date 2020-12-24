#include <jni.h>
#include "com_example_opencv_example_CameraToGrayActivity.h"
#include "com_example_opencv_example_CameraToEdgeActivity.h"

#include <opencv2/opencv.hpp>

using namespace cv;

extern "C"{
    JNIEXPORT void JNICALL
    Java_com_example_opencv_1example_CameraToGrayActivity_ConvertRGBtoGray(
            JNIEnv *env,
            jobject  instance,
            jlong matAddrInput,
            jlong matAddrResult){

        Mat &matInput = *(Mat *)matAddrInput;
        Mat &matResult = *(Mat *)matAddrResult;

        cvtColor(matInput, matResult, COLOR_RGBA2GRAY);
    }
}

extern "C"{
    JNIEXPORT void JNICALL
    Java_com_example_opencv_1example_CameraToEdgeActivity_detectEdgeJNI(
            JNIEnv *env,
            jobject  instance,
            jlong matAddrInput,
            jlong matAddrResult,
            jint th1,
            jint th2){

        Mat &matInput = *(Mat *)matAddrInput;
        Mat &matResult = *(Mat *)matAddrResult;

        cvtColor(matInput, matResult, COLOR_RGBA2GRAY);
        Canny(matResult, matResult, th1, th2);
    }
}
