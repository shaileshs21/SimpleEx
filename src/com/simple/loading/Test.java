package com.simple.loading;

public class Test {

  static int x = 1;
  int y =2;
  
  Test(){
    System.out.println("Constructor is called");
    System.out.println("x:" + x);
    System.out.println("y:" + y);
  }
  
  static{
    System.out.println("Static block is called");
    System.out.println("x:" + x); 
    changex(10);
    System.out.println("x:" + x);
  }
  
  void display(){
    System.out.println("x:" + x);
    System.out.println("y:" + y);
  }
  
  static void changex(int i){
    x = i;
    
  }
}
