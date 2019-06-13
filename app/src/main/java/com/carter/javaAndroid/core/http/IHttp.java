package com.carter.javaAndroid.core.http;

import android.database.Observable;

import com.carter.javaAndroid.modules.login.bean.LoginData;

public interface IHttp {


    Observable<BaseResponse<LoginData>> login(String username, String password);

}
