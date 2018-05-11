package com.weather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by TianChi on 2018/5/11.
 */

public class City extends DataSupport{

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public int getCityCode() {
        return cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
    public int getProvinceId() {
        return provinceId;
    }

}
