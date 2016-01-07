package com.even.crashtracker;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.even.crashtracker.activity.CrashActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 异常处理器
 * Created by Even on 2016/1/6.
 */
public class ExceptionHandler implements
        Thread.UncaughtExceptionHandler {
    private final Context context;

    public ExceptionHandler(Context context) {
        this.context = context;
    }

    public void uncaughtException(Thread thread, Throwable exception) {
        StringWriter stackTrace = new StringWriter();
        exception.printStackTrace(new PrintWriter(stackTrace));

        JSONObject jObjectData = new JSONObject();
        try {
            jObjectData.put("ClassName", context.getClass().getSimpleName());
            jObjectData.put("Message", exception.getMessage());
            jObjectData.put("Localized_Message", exception.getLocalizedMessage());
            jObjectData.put("Cause", exception.getCause());
            jObjectData.put("Stack_Trace", stackTrace.toString());
            jObjectData.put("Brand", Build.BRAND);
            jObjectData.put("Device", Build.DEVICE);
            jObjectData.put("Model", Build.MODEL);
            jObjectData.put("Product", Build.PRODUCT);
            jObjectData.put("SDK", Build.VERSION.SDK_INT);
            jObjectData.put("Release", Build.VERSION.RELEASE);
            jObjectData.put("Incremental", Build.VERSION.INCREMENTAL);
            jObjectData.put("Height", context.getResources().getDisplayMetrics().heightPixels);
            jObjectData.put("Width", context.getResources().getDisplayMetrics().widthPixels);
            jObjectData.put("App_Version", getAppVersion(context));
            jObjectData.put("Tablet", isTablet(context));
        } catch (JSONException e) {
            Log.e("" + context.getPackageName(), "JSON Exception");
        }

        Intent intent = new Intent(context, CrashActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("CrashInfo", jObjectData.toString());
        context.startActivity(intent);

        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(10);

    }

    public String getAppVersion(Context con) {
        PackageManager manager = con.getPackageManager();
        PackageInfo info;
        try {
            info = manager.getPackageInfo(con.getPackageName(), 0);
            return info.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("" + context.getPackageName(), "Name not found Exception");
        }
        return null;
    }

    public boolean isTablet(Context con) {
        boolean xlarge = ((con.getResources().getConfiguration().screenLayout & Configuration
                .SCREENLAYOUT_SIZE_MASK) == 4);
        boolean large = ((con.getResources().getConfiguration().screenLayout & Configuration
                .SCREENLAYOUT_SIZE_MASK) == Configuration.SCREENLAYOUT_SIZE_LARGE);
        return xlarge || large;
    }
}