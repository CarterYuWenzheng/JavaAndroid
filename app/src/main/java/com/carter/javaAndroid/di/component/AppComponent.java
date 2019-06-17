package com.carter.javaAndroid.di.component;

import com.carter.javaAndroid.Application.MyApplication;
import com.carter.javaAndroid.di.module.AbstractAllActivityModule;
import com.carter.javaAndroid.di.module.AbstractAllFragmentModule;
import com.carter.javaAndroid.di.module.AppModule;
import com.carter.javaAndroid.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AbstractAllActivityModule.class,
        AbstractAllFragmentModule.class,
        AppModule.class,
        HttpModule.class})
public interface AppComponent {
    void inject(MyApplication myApplication);
}
