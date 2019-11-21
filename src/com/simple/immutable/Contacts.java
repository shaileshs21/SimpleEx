package com.simple.immutable;

public final class Contacts {

  private final int number;
  private final String name;

  public Contacts(int number, String name) {
    this.number = number;
    this.name = name;
  }

  public int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

}
