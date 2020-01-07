package com.simple.quals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Qual2 {

  public static void main(String[] args) {
    // count location from list and extract data in map
    empOps();
  }

  public static void empOps() {
    Employee2 e1 = new Employee2(11, "Halle Parks", "North Korea");
    Employee2 e2 = new Employee2(24, "Clara Mann", "Ivory Coast");
    Employee2 e3 = new Employee2(14, "Jovanni Clark", "Niger");
    Employee2 e4 = new Employee2(22, "Sasha Kline", "Finland");
    Employee2 e5 = new Employee2(9, "Nasir Haas", "North Korea");
    Employee2 e6 = new Employee2(7, "Ruben Chung", "Finland");
    Employee2 e7 = new Employee2(18, "Gilbert Nelson", "Canada");
    Employee2 e8 = new Employee2(21, "Tyson Frye", "Ivory Coast");
    Employee2 e9 = new Employee2(46, "Logan Mathis", "Canada");

    List<Employee2> empList = new ArrayList<Employee2>();
    Collections.addAll(empList, e1, e2, e3, e4, e5, e6, e7, e8, e9);

    HashMap<String, Integer> locationCnt = new HashMap<>();
    for (Employee2 employee2 : empList) {
      String location = employee2.getLocation();
      if (locationCnt.containsKey(location)) {
        int cnt = locationCnt.get(location);
        cnt += 1;
        locationCnt.put(location, cnt);
      } else {
        locationCnt.put(location, 1);
      }
    }

    for (Map.Entry<String, Integer> entry : locationCnt.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }

  }
}
