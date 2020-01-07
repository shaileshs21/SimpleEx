package com.simple.quals;

import java.util.Comparator;

public class EmpIDComparator implements Comparator<Person>{

  @Override
  public int compare(Person p0, Person p1) {
    return p0.empId - p1.empId;
  }

}
