package android_serialport_api.base;

import android.app.Application;

/**
 * Created by jianfei on 2017/6/22.
 */

public class App extends Application {
    private static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
//        initCrash();
//        initBugly();
    }

   /* private void initLog() {
        DebugLogUtil logUtil = DebugLogUtil.getInstance();
        logUtil.setDebug(true);
        logUtil.setFilter("zhong");
    }*/

  /*  private void initBugly() {
        *//**
         * 主席的key
         APPID：9700589bfb
         APPkey：a2d4bf40-8f2e-444f-b39f-7ca2072b3e3e
         *//*
//        重要提示：如果后期采用了 MultiDex  需要参照文档进行处理   https://bugly.qq.com/docs/user-guide/instruction-manual-android/?v=20170607153855#sdkndk
        CrashReport.initCrashReport(getApplicationContext(), "9700589bfb", true);
    }*/

   /* private void initCrash() {
        CrashHandler handler = CrashHandler.getInstance();
        handler.init(app);
    }*/

    public static App getInstance() {
        return app;
    }

    /**
     * 判断是否登录
     *
     * @return
     */
  /*  public boolean isLogin() {
        PrefUtil spfUtil = new PrefUtil(this);
        String key = spfUtil.getStrData("key", "");
        if (!isEmpty(key)) {
            return true;
        }
        return false;
    }*/
}
