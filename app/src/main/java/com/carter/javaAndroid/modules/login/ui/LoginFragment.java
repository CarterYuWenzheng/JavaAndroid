package com.carter.javaAndroid.modules.login.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
