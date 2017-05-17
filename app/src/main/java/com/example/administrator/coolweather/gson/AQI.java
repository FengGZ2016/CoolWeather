package com.example.administrator.coolweather.gson;

/**
 * Created by Administrator on 2017/5/17.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String api;
        public String pm25;
    }
}
