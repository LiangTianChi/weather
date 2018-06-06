package com.weather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;


//gson包用于存放GSON模型相关的代码
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
