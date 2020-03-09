package com.weather;

import com.weather.core.Weather;
import com.weather.core.WeatherClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // Weather weather = new Weather();
       // weather.fetchData();
      WeatherClient client = new WeatherClient();
      client.fetchWeather();
    }
}
