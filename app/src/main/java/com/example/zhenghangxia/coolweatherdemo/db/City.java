package com.example.zhenghangxia.coolweatherdemo.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhenghangxia on 17-4-17.
 *
 *  市级数据
 */

public class City extends DataSupport {

    private int id;     // 市的ID
    private String cityName;    // 市名
    private int cityCode;       // 市代号
    private int provinceId;     // 所属省的ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
