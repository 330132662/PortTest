package android_serialport_api.function;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

import android_serialport_api.sample.SerialPortActivity;

/**
 * 多种不同信号入口
 */
public class CloseLedActivity extends SerialPortActivity {
    String tag = "port";
    String command;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getAppData();
        try {
            mOutputStream.write(new String("y").getBytes());
            mOutputStream.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
        finish();
    }

    private void getAppData() {
        Intent intent = getIntent();
        if (intent.getFlags() == 101) {
            command = intent.getStringExtra("command");
            Log.i(tag, "收到" + command);
            //tag: 调用者传递过来的数据

        }
    }

    @Override
    protected void onDataReceived(byte[] buffer, int size) {

    }
}
