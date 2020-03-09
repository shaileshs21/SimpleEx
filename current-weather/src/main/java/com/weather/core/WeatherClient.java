package com.weather.core;

import org.springframework.web.client.RestTemplate;

import com.weather.models.WeatherMain;

public class WeatherClient {
  private static final String apiKey = "&APPID=85e5d8e962b56824e02b1434c7ddcb29";
  private static final String serverUrl = "http://api.openweathermap.org/data/2.5/weather";

  public void fetchWeather() {
    String city = "?q=" + "Pune";
    final String uri = serverUrl + city + apiKey;
    RestTemplate restTemplate = new RestTemplate();
    //WeatherMain weatherMain = restTemplate.getForObject(uri, WeatherMain.class);
    String weatherMain = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Pune&APPID=85e5d8e962b56824e02b1434c7ddcb29", String.class);
    System.out.println(weatherMain);
  }
}
