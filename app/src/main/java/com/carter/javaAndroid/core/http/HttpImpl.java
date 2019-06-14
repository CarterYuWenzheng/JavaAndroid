package com.carter.javaAndroid.core.http;



import com.carter.javaAndroid.core.http.api.ApiService;
import com.carter.javaAndroid.modules.login.bean.LoginData;

import javax.inject.Inject;

import io.reactivex.Observable;

public class HttpImpl implements IHttp {

    private ApiService mApiService;

    @Inject
    HttpImpl(ApiService apiService){
        mApiService = apiService;
    }

    @Override
    public Observable<BaseResponse<LoginData>> login(String username, String password) {
        return mApiService.login(username,password);
    }
}
