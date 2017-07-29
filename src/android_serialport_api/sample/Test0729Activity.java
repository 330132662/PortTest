package android_serialport_api.sample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android_serialport_api.base.BaseActivity;

public class Test0729Activity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test0729);
        initView();
    }

    private void initView() {
        Button btn1 = fView(R.id.btn1);
        Button btn2 = fView(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn1: // 按钮1 响应
                showToast("我是按钮1");
                break;
            case R.id.btn2:// 按钮2 响应
                showToast("我是按钮2");
                break;
            default:
                break;
        }
    }
}
