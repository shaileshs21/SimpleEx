package com.simple.loading;

public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    //Test test = new Test();
    /*Test test2 = new Test();
    test.display();
    test2.display();
    test.changex(6);
    test2.display();*/
    
    int val[] = {3,5,4,1,2};
    
    for(int i=5;i>0;i--){
      int k = 0;
      for(int j=5;j>0;j--){
        if(i<=val[k]){
          System.out.print("*");
        }else{
          System.out.print("-");
        }
        k=k+1;
      }
      
      System.out.println("");
    }
    
    
    int nums[] = {23, 12, 45, 32, 76, 20};
    System.out.println(nums.length);

    
    
  }
  
  
}
