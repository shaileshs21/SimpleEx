package com.simple.sie;

public class Car {
  
  private int average;
  
  public Car(){
    average =20;
  }
  
  public Car(int average){
    this.average = average;
  }
  
  public  void run(){
    System.out.println("Original Car is Running");
  }
  
  public void display(){
    System.out.println("Average of car is " + average);
  }
}
