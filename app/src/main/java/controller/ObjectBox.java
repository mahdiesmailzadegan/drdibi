package controller;

import android.content.Context;
import android.util.Log;

import Model.MyObjectBox;
import io.objectbox.BoxStore;
import io.objectbox.android.AndroidObjectBrowser;
import ir.drdibi.BuildConfig;

//import Model.MyObjectBox;


public class ObjectBox {

    private static BoxStore boxStore;

    public static void init(Context context) {

        boxStore = MyObjectBox.builder()
                .androidContext(context.getApplicationContext())
                .build();
        if (BuildConfig.DEBUG) {
            boolean started = new AndroidObjectBrowser(boxStore).start(context.getApplicationContext());
            Log.i("ObjectBrowser", "Started: " + started);
        }

    }

    public static BoxStore get() { return boxStore; }
}
