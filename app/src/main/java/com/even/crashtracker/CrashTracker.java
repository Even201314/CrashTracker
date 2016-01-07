package com.even.crashtracker;

import android.content.Context;

/**
 * 异常跟踪器
 * Created by Even on 2016/1/6.
 */
public class CrashTracker {
    private static boolean cause = true;
    private static boolean stackTrace = true;
    private static boolean sdk = true;
    private static boolean appVersion = true;
    private static boolean className = false;
    private static boolean message = false;
    private static boolean localizedMessage = false;
    private static boolean brand = false;
    private static boolean device = false;
    private static boolean model = false;
    private static boolean product = false;
    private static boolean release = false;
    private static boolean incremental = false;
    private static boolean height = false;
    private static boolean width = false;
    private static boolean tablet = false;

    public static void init(Context context) {
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(context));
    }

    public static boolean isCause() {
        return cause;
    }

    public static void setCause(boolean cause) {
        CrashTracker.cause = cause;
    }

    public static boolean isStackTrace() {
        return stackTrace;
    }

    public static void setStackTrace(boolean stackTrace) {
        CrashTracker.stackTrace = stackTrace;
    }

    public static boolean isSdk() {
        return sdk;
    }

    public static void setSdk(boolean sdk) {
        CrashTracker.sdk = sdk;
    }

    public static boolean isAppVersion() {
        return appVersion;
    }

    public static void setAppVersion(boolean appVersion) {
        CrashTracker.appVersion = appVersion;
    }

    public static boolean isClassName() {
        return className;
    }

    public static void setClassName(boolean className) {
        CrashTracker.className = className;
    }

    public static boolean isMessage() {
        return message;
    }

    public static void setMessage(boolean message) {
        CrashTracker.message = message;
    }

    public static boolean isLocalizedMessage() {
        return localizedMessage;
    }

    public static void setLocalizedMessage(boolean localizedMessage) {
        CrashTracker.localizedMessage = localizedMessage;
    }

    public static boolean isBrand() {
        return brand;
    }

    public static void setBrand(boolean brand) {
        CrashTracker.brand = brand;
    }

    public static boolean isDevice() {
        return device;
    }

    public static void setDevice(boolean device) {
        CrashTracker.device = device;
    }

    public static boolean isModel() {
        return model;
    }

    public static void setModel(boolean model) {
        CrashTracker.model = model;
    }

    public static boolean isProduct() {
        return product;
    }

    public static void setProduct(boolean product) {
        CrashTracker.product = product;
    }

    public static boolean isRelease() {
        return release;
    }

    public static void setRelease(boolean release) {
        CrashTracker.release = release;
    }

    public static boolean isIncremental() {
        return incremental;
    }

    public static void setIncremental(boolean incremental) {
        CrashTracker.incremental = incremental;
    }

    public static boolean isHeight() {
        return height;
    }

    public static void setHeight(boolean height) {
        CrashTracker.height = height;
    }

    public static boolean isWidth() {
        return width;
    }

    public static void setWidth(boolean width) {
        CrashTracker.width = width;
    }

    public static boolean isTablet() {
        return tablet;
    }

    public static void setTablet(boolean tablet) {
        CrashTracker.tablet = tablet;
    }
}
