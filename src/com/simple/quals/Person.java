package com.simple.quals;

/**
 * @author 780993
 */
public class Person {
  String fName;
  String location;
  int empId;

  public Person(String fName, String location, int empId) {
    super();
    this.fName = fName;
    this.location = location;
    this.empId = empId;
  }

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  @Override
  public String toString() {
    return "Person [fName=" + fName + ", location=" + location + ", empId=" + empId + "]";
  }

}
