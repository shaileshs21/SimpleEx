package com.simple.override;


public class B extends A{
   void display(){
    System.out.println("Private display method from Child");
  }
   
   @Override
   public void print(){
     System.out.println("public print method from Child");
   }
}
