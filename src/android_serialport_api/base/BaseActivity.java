package android_serialport_api.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * All Activities' parent Activity
 */
public class BaseActivity extends Activity {
    public Context mContext;
    protected Toolbar titleTB;
    protected AppCompatTextView toolbarTitle;
    protected ContentFrameLayout btnBack;
    protected ImageView titleBackbtn;

    /**
     * 关闭输入法
     */
    protected void hideInputMethod(View fromView) {
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);// 隐藏自动弹出的输入法
        ((InputMethodManager) getSystemService(INPUT_METHOD_SERVICE)).hideSoftInputFromWindow(fromView.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }

    protected Bundle getExtraBundle() {
        return getIntent().getBundleExtra("extradata");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;

    }

    /**
     * 用于debug的标记
     */
    protected String getSimpleClassName() {
        return getClass().getSimpleName();
    }

    public void myBack(View v) {
        onBackPressed();
    }

    /**
     * 字符串是否为空
     *
     * @param str
     * @return
     */
    public boolean isEmpty(String str) {
        if ((str != null) && (!"null".equals(str)) && (!"".equals(str))) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @author YuYuanDa
     * created by 2016-08-27
     * 根据id查找view,这么写省事
     */
    public <T extends View> T fView(int id) {
        return (T) ((BaseActivity) mContext).findViewById(id);
    }

    /**
     * @author YuYuanDa
     * created by 2016-08-27
     * 启动activity
     */
    public void loadActivity(Class c, Bundle bundle) {
        Intent intent = new Intent(this, c);
        intent.putExtra("extradata", bundle);
        startActivity(intent);
    }

    public void setMyTitle(String str) {
//        AppCompatTextView toolbar_title = fView(R.id.toolbar_title);
//        toolbar_title.setText(str);
    }


   /* public Fragment changeFragmentByTag(String fTag, String[] fArray, int resID) {
        return JXFragmentFactory.getInstance().changeFragmentByTag(getSupportFragmentManager(), fTag, fArray, resID);
    }*/

    /**
     * 弹出提示
     *
     * @param toast
     */
    public void showToast(@NonNull String toast) {
        Toast.makeText(getApplicationContext(), toast, Toast.LENGTH_SHORT).show();
//        Toast.makeText(getApplication(), toast, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        if (subscription != null && !subscription.isUnsubscribed()) {
//            subscription.unsubscribe();
//        }
    }

    /**
     * 判断是否登录
     *
     * @return

    public boolean isLogin() {
        PrefUtil spfUtil = new PrefUtil(this);
        String key = spfUtil.getStrData(Constant.ParamToken, "");
        if (!isEmpty(key)) {
            return true;
        }
        return false;
    } */

    /**
     * 获取登录的key
     *
     * @return

    public String getKey() {
        PrefUtil spfUtil = new PrefUtil(this);
        String key = spfUtil.getStrData("key", "");
        return key;
    }

    public void logout() {
        PrefUtil spfUtil = new PrefUtil(this);
        spfUtil.saveStrData("key", "");
    }

    public void startActivityByLogin(Class c, Bundle bundle) {
        if (isLogin()) {
            Intent intent = new Intent(this, c);
            intent.putExtra("extradata", bundle);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }

    }*/
}
