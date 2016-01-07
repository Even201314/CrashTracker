CrashTracker
========

这是一个实时收集展示App崩溃日志的组件。主要是参考改动macroday的AppCrashTracker而来

当App发生崩溃时,自动跳转到CrashActivity页面,展示崩溃日志。

可以在开发阶段使用.尤其是像我这台接口松动，频繁断开连接的手机...

![](https://github.com/Even201314/CrashTracker/blob/master/raw/master/screenshot/crashTracker.png)  

Download
--------

Gradle:
```groovy
compile 'com.github.Even201314:CrashTracker:0.1.0'
```

Usage
--------
首先在AndroidManifest中添加：
```java
<activity android:name="com.even.crashtracker.activity.CrashActivity"/>
```
然后在Application的onCreate方法里面添加
```java
CrashTracker.init(this);
```
这样就可以在App崩溃时，跳转到CrashActivity,展示崩溃日志。

目前默认开启显示的信息有cause,stackTrace,sdk,appVersion.
以下为所有可显示的信息.
```java
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
```
以上属性均在CrashTracker中，通过设置值控制显示
```java
CrashTracker.setClassName(true);
```
