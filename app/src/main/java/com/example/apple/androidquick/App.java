package com.example.apple.androidquick;

import android.app.Application;
import android.content.SharedPreferences;

import com.example.apple.androidquick.manager.SharedPreferenceManager;

/**
 * Created by Apple on 8/17/16.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferenceManager.getInstance().init(this);
    }
}
