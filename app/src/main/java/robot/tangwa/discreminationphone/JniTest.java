package robot.tangwa.discreminationphone;

/**
 * Created by Administrator on 2017/3/21.
 */

public class JniTest{

    static {
        System.loadLibrary("jnitest");
    }

    //native方法
    public static native String sayHello();

}



