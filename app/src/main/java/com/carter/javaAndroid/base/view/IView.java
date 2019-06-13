package com.carter.javaAndroid.base.view;

public interface IView {

    void showErrorMsg(String errorMsg);

    void showLoading();

    void hideLoading();

    void showError();

    void showNoNetwork();

    void showEmpty();

    void showContent();

    void handleLoginSuccess();

    void handleLogoutSuccess();
}
