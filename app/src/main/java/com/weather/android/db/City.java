package com.weather.android.db;

import org.litepal.crud.DataSupport;

//bd包存放数据库模型相关的代码
//建立市表，用于存放市级的数据信息，对应到实体类中建立County类
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
