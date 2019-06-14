package com.carter.javaAndroid.base.presenter;

import com.carter.javaAndroid.base.view.IView;
import com.carter.javaAndroid.core.data.DataManager;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenter<T extends IView> implements IPresenter<T> {

    protected T mView;

    @Inject
    public DataManager mDataManager;

    private CompositeDisposable compositeDisposable;

    @Override
    public void attachView(T view) {
        mView = view;
        registerEventBus();
    }

    @Override
    public void detachView() {
        mView = null;
        if (compositeDisposable != null){
            compositeDisposable.clear();
        }
        unregisterEventBus();
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
        mDataManager.setLoginStatus(loginStatus);
    }

    @Override
    public boolean getLoginStatus() {
        return mDataManager.getLoginStatus();
    }

    @Override
    public String getLoginAccount() {
        return mDataManager.getLoginAccount();
    }

    @Override
    public void setLoginAccount(String account) {
        mDataManager.setLoginAccount(account);
    }
}
