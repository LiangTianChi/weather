package com.weather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

//util包用于存放工具相关的代码

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {//与服务器进行交互，sendOkHttpRequest()发起一条HTTP请求
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
