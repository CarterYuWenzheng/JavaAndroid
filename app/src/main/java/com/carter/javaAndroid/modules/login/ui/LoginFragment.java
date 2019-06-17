package com.carter.javaAndroid.modules.login.ui;

import com.carter.javaAndroid.R;
import com.carter.javaAndroid.base.fragment.BaseFragment;
import com.carter.javaAndroid.modules.login.contract.LoginFragmentContract;
import com.carter.javaAndroid.modules.login.presenter.LoginFragmentPresenter;

public class LoginFragment extends BaseFragment<LoginFragmentPresenter> implements LoginFragmentContract.View {

    public static LoginFragment  getInstance() {
        return new LoginFragment();
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }

    @Override
    protected void initEventAndData() {

    }
}
