package com.simple.poly;

public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    A x = new A();
    A.run();
    x.run();
    
    A y = new B();
    B.run();
    y.run();
    
    A z = new C();
    z.run();
    
    A a = new B();
    //a.test(); //Not available
    B.test();
  }

}
