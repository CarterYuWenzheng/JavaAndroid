package com.carter.javaAndroid.base.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.carter.javaAndroid.R;
import com.gyf.barlibrary.ImmersionBar;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.yokeyword.fragmentation.SupportActivity;

public abstract class AbstractSimpleActivity extends SupportActivity {

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ImmersionBar.with(this)
                .statusBarView(findViewById(R.id.status_bar_view))
                .keyboardEnable(true)
                .init();
        unbinder = ButterKnife.bind(this);
        onViewCreated();
        initToolBar();
        initView();
        initEventAndData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ImmersionBar.with(this).destroy();
        if (unbinder != null && unbinder != Unbinder.EMPTY){
            unbinder.unbind();
            unbinder = null;
        }
    }

    protected abstract void initView();

    /**
     * 在initEventAndData()之前执行
     */
    protected abstract void onViewCreated();

    /**
     * 获取layout布局id
     *
     * @return layoutId
     */
    protected abstract int getLayoutId();

    /**
     * 初始化ToolBar
     */
    protected abstract void initToolBar();

    /**
     * 初始化数据
     */
    protected abstract void initEventAndData();
}
