package android_serialport_api.function;

import android.os.Bundle;

import android_serialport_api.sample.SerialPortActivity;

public class OpenLedActivity extends SerialPortActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDataReceived(byte[] buffer, int size) {

    }
}
