package com.carter.javaAndroid.base.presenter;

import com.carter.javaAndroid.base.view.IView;

public class BasePresenter<T extends IView> implements IPresenter<IView> {

    protected T mView;

    @Override
    public void attachView(IView view) {

    }

    @Override
    public void detachView() {

    }

    @Override
    public void reload() {

    }

    @Override
    public void registerEventBus() {

    }

    @Override
    public void unregisterEventBus() {

    }

    @Override
    public void setLoginStatus(boolean loginStatus) {

    }

    @Override
    public boolean getLoginStatus() {
        return false;
    }

    @Override
    public String getLoginAccount() {
        return null;
    }

    @Override
    public void setLoginAccount(String account) {

    }
}
