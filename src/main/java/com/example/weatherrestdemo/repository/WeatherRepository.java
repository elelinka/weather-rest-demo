package com.example.weatherrestdemo.repository;

import com.example.weatherrestdemo.model.Weather;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherRepository {

    private RestTemplate restTemplate;

    public WeatherRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Weather getWeather(String q, String units, String appid) {
        return restTemplate.getForObject("/data/2.5/weather?zip=" + q + "&units=" + units + "&APPID=" + appid, Weather.class);
    }
}
