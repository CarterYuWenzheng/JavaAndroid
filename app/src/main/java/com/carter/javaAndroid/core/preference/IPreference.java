package com.carter.javaAndroid.core.preference;

public interface IPreference {

    void setLoginStatus(boolean isLogin);
    boolean getLoginStatus();

    void setLoginAccount(String account);
    String getLoginAccount();

    void setNightMode(boolean isNightMode);
    boolean isNightMode();
}
