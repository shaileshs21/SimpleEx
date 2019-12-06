package com.simple.threading;

public class A extends Thread{

  public void run(){
    System.out.println("P");
    System.out.println("I");
    
/*    try {
      sleep(100);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }*/
    System.out.println("N");
    System.out.println("G");
    
    System.out.println(Thread.currentThread().getName());
    
    
  }
}
