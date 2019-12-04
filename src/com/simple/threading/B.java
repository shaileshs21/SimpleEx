package com.simple.threading;

public class B implements Runnable{

  @Override
  public void run() {
    // TODO Auto-generated method stub
    System.out.println("D");
    System.out.println("E");
    System.out.println("S");
    System.out.println("K");
    System.out.println(Thread.currentThread().getName());
  }

}
