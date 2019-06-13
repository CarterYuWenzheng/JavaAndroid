package com.carter.javaAndroid.Application;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import javax.inject.Inject;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class MyApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> mAndroidInjector;

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    private RefWatcher refWatcher;


    @Override
    public AndroidInjector<Activity> activityInjector() {
        return mAndroidInjector;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        refWatcher = setupLeakCanary();
    }

    private RefWatcher setupLeakCanary(){
        if (LeakCanary.isInAnalyzerProcess(this)){
            return RefWatcher.DISABLED;
        } else {
            return LeakCanary.install(this);
        }
    }

    public static RefWatcher getRefWatcher(Context context){
        MyApplication myApplication = (MyApplication)context.getApplicationContext();
        return myApplication.refWatcher;
    }

    public static Context getContext(){
        return context;
    }

    public boolean isNightMode(){
        return false;
    }
}
