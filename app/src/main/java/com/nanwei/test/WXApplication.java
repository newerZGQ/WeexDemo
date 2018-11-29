package com.nanwei.test;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;

public class WXApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        WXEnvironment.sApplication = WXApplication.this;
        InitConfig config=new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize(this,config);
    }
}
