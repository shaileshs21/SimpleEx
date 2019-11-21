package com.simple.main;

import java.util.Arrays;

public class B extends App{

  //hiding static amin method
  public static void main(String[] args) {
    System.out.println(Arrays.toString(args));
  }
}
