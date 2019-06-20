package com.carter.javaAndroid.modules.login.presenter;

import com.carter.javaAndroid.base.presenter.BasePresenter;
import com.carter.javaAndroid.core.event.LoginEvent;
import com.carter.javaAndroid.core.rx.BaseObserver;
import com.carter.javaAndroid.modules.login.bean.LoginData;
import com.carter.javaAndroid.modules.login.contract.LoginFragmentContract;
import com.carter.javaAndroid.utils.RxUtils;


import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

public class LoginFragmentPresenter extends BasePresenter<LoginFragmentContract.View> implements LoginFragmentContract.Presenter {

    @Inject
    public LoginFragmentPresenter() {
    }

    @Override
    public void login(String username, String password) {
        addSubscribe(mDataManager.login(username, password)
                .compose(RxUtils.SchedulerTransformer())
                .filter(loginDataBaseResponse -> mView != null)
                .subscribeWith(new BaseObserver<LoginData>(mView, "login fail", true) {
                    @Override
                    public void onSuccess(LoginData loginData) {
                        setLoginStatus(true);
                        setLoginAccount(loginData.getUsername());
                        EventBus.getDefault().postSticky(new LoginEvent("我登录了--"));
                        mView.loginSuccess();
                    }
                }));
    }
}
