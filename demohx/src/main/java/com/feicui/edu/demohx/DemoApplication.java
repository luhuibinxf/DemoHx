package com.feicui.edu.demohx;

import com.hyphenate.easeui.controller.EaseUI;

import android.app.Application;

public class DemoApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        EaseUI.getInstance().init(this, null);
    }
    
}
