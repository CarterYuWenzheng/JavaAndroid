package com.carter.javaAndroid.core.http;


import com.carter.javaAndroid.modules.login.bean.LoginData;

import io.reactivex.Observable;

public interface IHttp {


    Observable<BaseResponse<LoginData>> login(String username, String password);

}
