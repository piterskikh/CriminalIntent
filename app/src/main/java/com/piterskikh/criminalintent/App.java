package com.piterskikh.criminalintent;

import android.app.Application;
import android.content.Context;

/**
 * Created by Sergei on 17.03.2018.
 */

public class App extends Application {

    static public Context context;

    @Override
    public void onCreate() {
        super.onCreate();
       context = getApplicationContext();
    }
}
