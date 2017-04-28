package com.example.zhenghangxia.coolweatherdemo.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by zhenghangxia on 17-4-17.
 *
 *  网络请求工具类
 *
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }

}
