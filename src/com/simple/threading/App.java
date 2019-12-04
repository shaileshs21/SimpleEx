package com.simple.threading;

public class App {
  public static void main(String args[]){
    Thread t1 = new A();
    t1.setName("First");
    B b = new B();
    Thread t2 =new Thread(b);
    t2 .setName("Second");
    t1.start();
    t2.start();
    try {
      t1.join();
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    /*try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }*/
    System.out.println(Thread.currentThread().getName());
  }
}
