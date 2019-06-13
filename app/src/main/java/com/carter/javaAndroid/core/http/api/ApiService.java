package com.carter.javaAndroid.core.http.api;

import com.carter.javaAndroid.core.http.BaseResponse;
import com.carter.javaAndroid.modules.login.bean.LoginData;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {

    String BASE_URL = "https://www.wanandroid.com/";


    /**
     * 登录
     * https://www.wanandroid.com/user/login
     *
     * @param username user name
     * @param password password
     * @return 登录数据
     */
    @POST("user/login")
    @FormUrlEncoded
    Observable<BaseResponse<LoginData>> login(@Field("username") String username, @Field("password") String password);
}
