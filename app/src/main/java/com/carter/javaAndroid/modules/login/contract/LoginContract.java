package com.carter.javaAndroid.modules.login.contract;

import com.carter.javaAndroid.base.presenter.IPresenter;
import com.carter.javaAndroid.base.view.IView;

public interface LoginContract {


    interface View extends IView {
        void loginSuccess();
    }

    interface Presenter extends IPresenter<View> {

        void login(String username, String password);
    }
}
