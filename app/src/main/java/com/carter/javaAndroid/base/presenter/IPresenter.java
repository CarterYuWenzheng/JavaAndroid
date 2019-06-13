package com.carter.javaAndroid.base.presenter;

import com.carter.javaAndroid.base.view.IView;

public interface IPresenter<T extends IView> {
    /**
     * attachView
     *
     * @param view view
     */
    void attachView(T view);

    void detachView();

    void reload();

    void registerEventBus();

    void unregisterEventBus();

    void setLoginStatus(boolean loginStatus);

    boolean getLoginStatus();

    String getLoginAccount();

    void setLoginAccount(String account);
}
