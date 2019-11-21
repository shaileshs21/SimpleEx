package com.simple.string;

public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String s1 = "xyz";
    String s2 = new String("xyz");
    String s0 = "xyzabc";
    
/*    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());*/
    
    String s3 = "xyz";
    System.out.println(s3);
    String s4 = s3.concat("abc");
    System.out.println(s3);
   /* System.out.println(s4);
    System.out.println(s0 == s4);
    System.out.println(s0.equals(s4));*/
    
    s3 = s3.concat("zzz");
    System.out.println(s3);
  }

}
