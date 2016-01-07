package com.even.crashtracker;

import android.content.Context;

/**
 * 异常跟踪器
 * Created by Even on 2016/1/6.
 */
public class CrashTracker {
    public static void init(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(context));
    }
}
