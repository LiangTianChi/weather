package com.weather.android.db;

import org.litepal.crud.DataSupport;


//建立县表，用于存放县级的数据信息，对应到实体类中建立County类
public class County extends DataSupport{

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    public String getCountyName() {
        return countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
    public String getWeatherId() {
        return weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
    public int getCityId() {
        return cityId;
    }

}
