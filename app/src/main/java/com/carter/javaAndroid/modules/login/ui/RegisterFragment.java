package com.carter.javaAndroid.modules.login.ui;


import android.support.v4.app.Fragment;

import com.carter.javaAndroid.R;
import com.carter.javaAndroid.base.fragment.BaseFragment;
import com.carter.javaAndroid.modules.login.contract.RegisterFragmentContract;
import com.carter.javaAndroid.modules.login.presenter.RegisterFragmentPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class RegisterFragment extends BaseFragment<RegisterFragmentPresenter> implements RegisterFragmentContract.View{


    public static RegisterFragment getInstance() {
        return new RegisterFragment();
    }


    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_register;
    }

    @Override
    protected void initEventAndData() {

    }
}
