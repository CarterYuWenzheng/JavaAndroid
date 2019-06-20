package com.carter.javaAndroid.core.event;

public class LoginEvent {

    public String getmTag() {
        return mTag;
    }

    private String mTag ;

    public LoginEvent(String tag){
        mTag = tag;
    }



}
