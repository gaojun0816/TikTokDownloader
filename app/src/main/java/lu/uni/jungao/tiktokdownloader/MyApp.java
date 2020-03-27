package lu.uni.jungao.tiktokdownloader;

import android.app.Application;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Invoker.getInstance(this, "com.zhiliaoapp.musically");
    }
}
