package com.even.crashtracker.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.even.crashtracker.R;
import com.even.crashtracker.model.Tracker;
import com.google.gson.Gson;

/**
 * CrashActivity
 * Created by Even on 2016/1/7.
 */
public class CrashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crash);
        String trackerInfo = getIntent().getExtras().getString("CrashInfo");
        Gson gson = new Gson();
        Tracker tracker = gson.fromJson(trackerInfo, Tracker.class);
        TextView tvCrashInfo = (TextView) findViewById(R.id.tv_crash_info);
        tvCrashInfo.setText(trackerInfo);
    }
}
