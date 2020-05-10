package controller;

import android.app.Application;

import static controller.ObjectBox.init;


public class TheApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        init(this);
    }


}
