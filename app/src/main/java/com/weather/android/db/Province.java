package com.weather.android.db;

import org.litepal.crud.DataSupport;


//建立省表，用于存放省级的数据信息，对应到实体类中建立Province类
public class Province extends DataSupport{

    private int id;
    private String provinceName;
    private int provinceCode;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
    public int getProvinceCode() {
        return provinceCode;
    }

}
