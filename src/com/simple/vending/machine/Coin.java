package com.simple.vending.machine;

public enum Coin {
  ONE(1), FIVE(5), TEN(10), TWENTY(20);
  private int value;

  private Coin(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

}
