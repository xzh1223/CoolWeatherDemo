package com.example.zhenghangxia.coolweatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhenghangxia on 17-4-25.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
