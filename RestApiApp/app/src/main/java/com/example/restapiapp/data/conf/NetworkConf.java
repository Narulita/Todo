package com.example.restapiapp.data.conf;

import com.example.restapiapp.data.service.ApiService;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class NetworkConf {

    public static ApiService getApiService() {
        return createRetrofit().create(ApiService.class);}

    public static Retrofit createRetrofit() {
        return new Retrofit.Builder().baseUrl("https://filbtbbfhrjgboamggef.supabase.co/rest")
                .addConverterFactory(GsonConverterFactory.create())
                .client(createOkHttpClient())
                .build();
    }

    public static OkHttpClient createOkHttpClient() {
        return new OkHttpClient.Builder().readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS).build();
//        return new OkHttpClient.Builder().readTimeout(60, TimeUnit.SECONDS)
//                .connectTimeout(60, TimeUnit.SECONDS).build();
    }
}
