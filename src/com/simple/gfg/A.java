package com.simple.gfg;

class A {
  int x = 10;

  public A() {
  }

  public void assign(int x) {
    x = x;
    System.out.println(this.x);
    System.out.println(x);
  }

  public static void main(String[] args) {
    new A().assign(100);
  }
}
