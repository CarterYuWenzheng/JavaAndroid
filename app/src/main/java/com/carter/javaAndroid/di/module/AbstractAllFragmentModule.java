package com.carter.javaAndroid.di.module;

import com.carter.javaAndroid.di.component.BaseFragmentComponent;
import com.carter.javaAndroid.modules.login.ui.LoginFragment;
import com.carter.javaAndroid.modules.login.ui.RegisterFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = BaseFragmentComponent.class)
public abstract class AbstractAllFragmentModule {


    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract LoginFragment contributesLoginFragmentInject();

    @ContributesAndroidInjector(modules = RegisterFragmentModule.class)
    abstract RegisterFragment contributesRegisterFragmentInject();
}
