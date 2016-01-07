CrashTracker
========

这是一个实时收集展示App崩溃日志的组件。

![](https://github.com/Even201314/CrashTracker/raw/master/screenshot/crashTracker.png)  


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
