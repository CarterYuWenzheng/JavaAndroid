package com.carter.javaAndroid.core.data;

import com.carter.javaAndroid.core.http.BaseResponse;
import com.carter.javaAndroid.core.http.HttpImpl;
import com.carter.javaAndroid.core.http.IHttp;
import com.carter.javaAndroid.core.preference.IPreference;
import com.carter.javaAndroid.modules.login.bean.LoginData;

import io.reactivex.Observable;

public class DataManager implements IHttp, IPreference {


    private IHttp mIHttp;
    private IPreference mIPreference;

    public DataManager(IHttp iHttp,IPreference iPreference){
        mIHttp = iHttp;
        mIPreference = iPreference;
    }

    @Override
    public Observable<BaseResponse<LoginData>> login(String username, String password) {
        return mIHttp.login(username,password);
    }

    @Override
    public void setLoginStatus(boolean isLogin) {
        mIPreference.setLoginStatus(isLogin);
    }

    @Override
    public boolean getLoginStatus() {
        return mIPreference.getLoginStatus();
    }

    @Override
    public void setLoginAccount(String account) {
        mIPreference.setLoginAccount(account);
    }

    @Override
    public String getLoginAccount() {
        return mIPreference.getLoginAccount();
    }

    @Override
    public void setNightMode(boolean isNightMode) {
        mIPreference.setNightMode(isNightMode);
    }

    @Override
    public boolean isNightMode() {
        return mIPreference.isNightMode();
    }
}
