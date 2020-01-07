package com.simple.quals;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>{

  @Override
  public int compare(Person o1, Person o2) {
    return o1.fName.compareTo(o2.fName);
  }

}
