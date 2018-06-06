package com.weather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.weather.android.gson.Weather;

import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Timer timer = new Timer();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if (prefs.getString("weather", null) != null) {
            final Intent intent = new Intent(this,WeatherActivity.class);
            TimerTask task = new TimerTask(){
                @Override
                public void run(){
                    startActivity(intent);
                    WelcomeActivity.this.finish();
                }
            };
            timer.schedule(task,2000);
        }
    }
}
