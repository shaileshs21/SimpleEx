package com.weather.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.models.Coordinates;

public class Weather {

  public void fetchData() {
    ObjectMapper mapper = new ObjectMapper();

    try {
      Coordinates coordinates = mapper.readValue("{\"lon\":73.86,\"lat\":18.52}", Coordinates.class);
      System.out.println(coordinates);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
