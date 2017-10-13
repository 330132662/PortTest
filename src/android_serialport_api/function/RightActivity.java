package android_serialport_api.function;

import android.os.Bundle;

import java.io.IOException;

import android_serialport_api.sample.R;
import android_serialport_api.sample.SerialPortActivity;

public class RightActivity extends SerialPortActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_right);
        try {
            mOutputStream.write(new String("y").getBytes());
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
