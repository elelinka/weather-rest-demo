package com.example.weatherrestdemo;

import com.example.weatherrestdemo.model.Weather;
import com.example.weatherrestdemo.repository.WeatherRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WeatherRestDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WeatherRestDemoApplication.class, args);
        WeatherRepository weatherRepository = context.getBean(WeatherRepository.class);

        Weather weather = weatherRepository.getWeather("Poznan", "metric", "07a16080e3b67417eb9fae8dee0f883e");

        System.out.println(weather);
    }

}
