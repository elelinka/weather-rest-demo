package com.example.weatherrestdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    private String q;
    private String units;
    private String appid;


    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "q='" + q + '\'' +
                ", units='" + units + '\'' +
                ", appid='" + appid + '\'' +
                '}';
    }
}
