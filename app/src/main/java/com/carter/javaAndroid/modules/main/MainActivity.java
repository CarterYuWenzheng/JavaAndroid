package com.carter.javaAndroid.modules.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.carter.javaAndroid.R;
import com.carter.javaAndroid.core.constant.ARouterPath;
import com.carter.javaAndroid.core.event.LoginEvent;
import com.carter.javaAndroid.utils.ToastUtils;


import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import static com.carter.javaAndroid.Application.MyApplication.getContext;

@Route(path = ARouterPath.Main.MAIN_ACTIVITY)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    public void onEventListener(LoginEvent loginEvent) {
        ToastUtils.showToast(getContext(), loginEvent.getmTag());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
