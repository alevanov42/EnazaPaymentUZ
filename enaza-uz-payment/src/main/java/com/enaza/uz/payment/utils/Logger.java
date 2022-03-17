package com.enaza.uz.payment.utils;

import android.util.Log;

public class Logger {
    public static void d(String tag, String log) {
       // if (BuildConfig.DEBUG) {
            Log.d(tag, log);
      //  }
    }
}