package com.carter.javaAndroid.modules.login.presenter;

import com.carter.javaAndroid.base.presenter.BasePresenter;
import com.carter.javaAndroid.modules.login.contract.LoginContract;
import com.carter.javaAndroid.modules.login.contract.LoginFragmentContract;

import javax.inject.Inject;

public class LoginFragmentPresenter extends BasePresenter<LoginFragmentContract.View> implements LoginFragmentContract.Presenter {

    @Inject
    public LoginFragmentPresenter() {
    }

}
