package android_serialport_api.sample;

import android.os.Bundle;

import java.io.IOException;

public class LeftActivity extends SerialPortActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left);
      /*  int i;
        CharSequence t = "z";
        char[] text = new char[t.length()];
        for (i = 0; i < t.length(); i++) {
            text[i] = t.charAt(i);
        }*/
        try {
//            Toast.makeText(mApplication, "ssss", Toast.LENGTH_SHORT).show();
            mOutputStream.write(new String("Z").getBytes());
            mOutputStream.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
        finish();
//        System.exit(0);
    }

    @Override
    protected void onDataReceived(byte[] buffer, int size) {

    }
}
