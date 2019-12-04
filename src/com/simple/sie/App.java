package com.simple.sie;

public class App {

  static Car car2 = new Car(){
    public  void run(){
      System.out.println("New Car is running");
    }
    
  };
  
  private static int xyz;
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Car car2 = new Car();
    Car cars[] = new Car[3];
    //car.run();
    //car.display();
    
    System.out.println(xyz);
    System.out.println(cars.length);
    car2.run();
    car2.display();
  }

}
