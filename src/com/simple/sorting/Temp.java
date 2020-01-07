package com.simple.sorting;

import java.io.Serializable;

public class Temp implements Serializable, Cloneable {
  public void show() {
   
    System.out.println("Its show from temp class");
    int sum = 0;
    for (int i = 1, j = 1; i < 1 & j < 1; ++i, j = i + 1){
      sum += i;
    }
      
    System.out.println(sum);
  }
}
