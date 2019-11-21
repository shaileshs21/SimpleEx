package com.simple.override;

public class App {

  public static void main(String [] args){
    A a = new A();
    //a.display();
    B b = new B();
    b.display();
    
    A c = new B();
    a.print();
    c.print();
    b.print();
   
    
  }
}
