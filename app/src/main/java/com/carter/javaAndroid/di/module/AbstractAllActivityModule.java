package com.carter.javaAndroid.di.module;

import com.carter.javaAndroid.di.component.BaseActivityComponent;
import com.carter.javaAndroid.modules.login.ui.LoginActivity;
import com.carter.javaAndroid.modules.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = {BaseActivityComponent.class})
public abstract class AbstractAllActivityModule {

    @ContributesAndroidInjector(modules = LoginActivityModule.class)
    abstract LoginActivity contributersLoginActivityInject();

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributersMainActivityInject();
}
