package com.carter.javaAndroid.core.preference;

import android.content.Context;
import android.content.SharedPreferences;

import com.carter.javaAndroid.Application.MyApplication;
import com.carter.javaAndroid.core.constant.Constants;

import javax.inject.Inject;

public class PreferenceImpl implements IPreference {

    private final SharedPreferences mPreferences;

    @Inject
    PreferenceImpl() {
        mPreferences = MyApplication.getContext().getSharedPreferences(Constants.MY_SHARED_PREFERENCE, Context.MODE_PRIVATE);
    }

    @Override
    public void setLoginStatus(boolean isLogin) {
        mPreferences.edit().putBoolean(Constants.LOGIN_STATUS, isLogin).apply();
    }

    @Override
    public boolean getLoginStatus() {
        return mPreferences.getBoolean(Constants.LOGIN_STATUS, false);
    }

    @Override
    public void setLoginAccount(String account) {
        mPreferences.edit().putString(Constants.ACCOUNT, account).apply();
    }

    @Override
    public String getLoginAccount() {
        return mPreferences.getString(Constants.ACCOUNT, "");
    }

    @Override
    public void setNightMode(boolean isNightMode) {
        mPreferences.edit().putBoolean(Constants.NIGHT_MODE, isNightMode).apply();
    }

    @Override
    public boolean isNightMode() {
        return mPreferences.getBoolean(Constants.NIGHT_MODE, false);
    }
}
