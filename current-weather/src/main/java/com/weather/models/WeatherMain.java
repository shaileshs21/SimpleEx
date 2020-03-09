package com.weather.models;

import java.util.Arrays;

public class WeatherMain {
  private Coordinates coord;
  private WeatherDescription[] weather;
  private String base;
  private Main main;
  private int visibility;
  private Wind wind;
  private Clouds clouds;
  private double dt;
  private Sys sys;
  private int timezone;
  private int id;
  private String name;
  private int cod;
  public Coordinates getCoord() {
    return coord;
  }
  public void setCoord(Coordinates coord) {
    this.coord = coord;
  }
  public WeatherDescription[] getWeather() {
    return weather;
  }
  public void setWeather(WeatherDescription[] weather) {
    this.weather = weather;
  }
  public String getBase() {
    return base;
  }
  public void setBase(String base) {
    this.base = base;
  }
  public Main getMain() {
    return main;
  }
  public void setMain(Main main) {
    this.main = main;
  }
  public int getVisibility() {
    return visibility;
  }
  public void setVisibility(int visibility) {
    this.visibility = visibility;
  }
  public Wind getWind() {
    return wind;
  }
  public void setWind(Wind wind) {
    this.wind = wind;
  }
  public Clouds getClouds() {
    return clouds;
  }
  public void setClouds(Clouds clouds) {
    this.clouds = clouds;
  }
  public double getDt() {
    return dt;
  }
  public void setDt(double dt) {
    this.dt = dt;
  }
  public Sys getSys() {
    return sys;
  }
  public void setSys(Sys sys) {
    this.sys = sys;
  }
  public int getTimezone() {
    return timezone;
  }
  public void setTimezone(int timezone) {
    this.timezone = timezone;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getCod() {
    return cod;
  }
  public void setCod(int cod) {
    this.cod = cod;
  }
  @Override
  public String toString() {
    return "WeatherMain [coord=" + coord + ", weather=" + Arrays.toString(weather) + ", base=" + base + ", main=" + main + ", visibility="
           + visibility + ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys=" + sys + ", timezone=" + timezone + ", id=" + id
           + ", name=" + name + ", cod=" + cod + "]";
  }

  
}
