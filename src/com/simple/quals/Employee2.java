package com.simple.quals;

public class Employee2 {
  private int id;
  private String name;
  private String Location;

  public Employee2(int id, String name, String location) {
    super();
    this.id = id;
    this.name = name;
    Location = location;
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

  public String getLocation() {
    return Location;
  }

  public void setLocation(String location) {
    Location = location;
  }

  @Override
  public String toString() {
    return "[id=" + id + ", name=" + name + ", Location=" + Location + "]";
  }

}
