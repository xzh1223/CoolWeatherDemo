package com.example.zhenghangxia.coolweatherdemo.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhenghangxia on 17-4-17.
 *
 *  县区级数据
 */

public class County extends DataSupport {

    private int id;     // 县区的ID
    private String countyName;      // 县区名
    private String weatherId;     // 天气ID
    private int cityId;     // 所属市的ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
