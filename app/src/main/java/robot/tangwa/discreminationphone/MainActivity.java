package robot.tangwa.discreminationphone;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.SpeechRecognizer;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.util.Accelerometer;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SpeechUtility speechUtility =SpeechUtility.createUtility(this,"appid=58d0d52b");
        Log.e("debug","speechUtility:"+speechUtility);
        SpeechRecognizer.createRecognizer(this, new InitListener() {
            @Override
            public void onInit(int i) {
                Log.e("debug","返回结果result："+i);
            }
        });

    }
}
