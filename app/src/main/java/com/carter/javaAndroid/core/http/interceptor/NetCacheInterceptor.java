package com.carter.javaAndroid.core.http.interceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class NetCacheInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response =chain.proceed(request);
        int onlineCacheTime = 0;//在线的时候的缓存过期时间，若在线时不需要缓存，直接设置为0
        return response.newBuilder()
                .header("Cache-Control","public, max-age="+onlineCacheTime)
                .removeHeader("Pragma")
                .build();
    }
}
