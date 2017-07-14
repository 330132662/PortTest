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
            mOutputStream.write(new String("z").getBytes());
            mOutputStream.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
        finish();
    }

    @Override
    protected void onDataReceived(byte[] buffer, int size) {

    }
}
