package com.even.crashtracker.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.widget.TextView;

import com.even.crashtracker.CrashTracker;
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

        StringBuilder sb = new StringBuilder();
        if (CrashTracker.isSdk()) {
            sb.append(getString(R.string.crash_tracker_sdk)).append(" : ").append
                    (getSpannableString(tracker.getSDK
                            ())).append("\n");
        }
        if (CrashTracker.isAppVersion()) {
            sb.append(getString(R.string.crash_tracker_app_version)).append(" : ").append
                    (getSpannableString(tracker
                            .getApp_Version())).append("\n");
        }
        if (CrashTracker.isClassName()) {
            sb.append(getString(R.string.crash_tracker_class_name)).append(" : ").append
                    (getSpannableString(tracker
                            .getClassName())).append("\n");
        }
        if (CrashTracker.isCause()) {
            sb.append(getString(R.string.crash_tracker_cause)).append(" : ").append
                    (getSpannableString(tracker
                            .getCause())).append("\n");
        }
        if (CrashTracker.isStackTrace()) {
            sb.append(getString(R.string.crash_tracker_stack_trace)).append(" : ").append
                    (getSpannableString(tracker
                            .getStack_Trace())).append("\n");
        }
        if (CrashTracker.isMessage()) {
            sb.append(getString(R.string.crash_tracker_message)).append(" : ").append
                    (getSpannableString(tracker
                            .getMessage())).append("\n");
        }
        if (CrashTracker.isLocalizedMessage()) {
            sb.append(getString(R.string.crash_tracker_localized_message)).append(" : ").append
                    (getSpannableString(tracker
                            .getLocalized_Message())).append("\n");
        }
        if (CrashTracker.isBrand()) {
            sb.append(getString(R.string.crash_tracker_brand)).append(" : ").append
                    (getSpannableString(tracker
                            .getBrand())).append("\n");
        }
        if (CrashTracker.isDevice()) {
            sb.append(getString(R.string.crash_tracker_device)).append(" : ").append
                    (getSpannableString(tracker
                            .getDevice())).append("\n");
        }
        if (CrashTracker.isModel()) {
            sb.append(getString(R.string.crash_tracker_model)).append(" : ").append(tracker
                    .getModel()).append("\n");
        }
        if (CrashTracker.isProduct()) {
            sb.append(getString(R.string.crash_tracker_product)).append(" : ").append
                    (getSpannableString(tracker
                            .getProduct())).append("\n");
        }
        if (CrashTracker.isIncremental()) {
            sb.append(getString(R.string.crash_tracker_incremental)).append(" : ").append
                    (getSpannableString(tracker
                            .getIncremental())).append("\n");
        }
        if (CrashTracker.isHeight()) {
            sb.append(getString(R.string.crash_tracker_height)).append(" : ").append
                    (getSpannableString(tracker
                            .getHeight())).append("\n");
        }
        if (CrashTracker.isWidth()) {
            sb.append(getString(R.string.crash_tracker_width)).append(" : ").append
                    (getSpannableString(tracker
                            .getWidth())).append("\n");
        }
        if (CrashTracker.isTablet()) {
            sb.append(getString(R.string.crash_tracker_tablet)).append(" : ").append
                    (getSpannableString(tracker
                            .getTablet())).append("\n");
        }
        tvCrashInfo.setText(sb);
    }

    private SpannableString getSpannableString(String content) {
        SpannableString spannableString = new SpannableString(content);
        spannableString.setSpan(new BackgroundColorSpan(Color.GRAY), 0, spannableString.length(),
                Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        return spannableString;
    }
}
