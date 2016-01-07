package com.even.crashtracker.model;

/**
 * CrashTracker信息的实体类
 * Created by Even on 2016/1/7.
 */
@SuppressWarnings("unused")
public class Tracker {
    private String ClassName;
    private String Message;
    private String Localized_Message;
    private String Cause;
    private String Stack_Trace;
    private String Brand;
    private String Device;
    private String Model;
    private String Product;
    private String SDK;
    private String Release;
    private String Incremental;
    private String Height;
    private String Width;
    private String App_Version;
    private String Tablet;

    public String getApp_Version() {
        return App_Version;
    }

    public void setApp_Version(String app_Version) {
        App_Version = app_Version;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getCause() {
        return Cause;
    }

    public void setCause(String cause) {
        Cause = cause;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getDevice() {
        return Device;
    }

    public void setDevice(String device) {
        Device = device;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getIncremental() {
        return Incremental;
    }

    public void setIncremental(String incremental) {
        Incremental = incremental;
    }

    public String getLocalized_Message() {
        return Localized_Message;
    }

    public void setLocalized_Message(String localized_Message) {
        Localized_Message = localized_Message;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public String getRelease() {
        return Release;
    }

    public void setRelease(String release) {
        Release = release;
    }

    public String getSDK() {
        return SDK;
    }

    public void setSDK(String SDK) {
        this.SDK = SDK;
    }

    public String getStack_Trace() {
        return Stack_Trace;
    }

    public void setStack_Trace(String stack_Trace) {
        Stack_Trace = stack_Trace;
    }

    public String getTablet() {
        return Tablet;
    }

    public void setTablet(String tablet) {
        Tablet = tablet;
    }

    public String getWidth() {
        return Width;
    }

    public void setWidth(String width) {
        Width = width;
    }
}
