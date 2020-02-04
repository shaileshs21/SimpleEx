package com.simple.vending.machine;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {
  Map<T, Integer> inventory = new HashMap<>();

  public void put(T item, int quantity) {
    inventory.put(item, quantity);
  }

  public boolean hasItem(T item) {
    if (inventory.get(item) > 0) {
      return true;
    } else {
      return false;
    }
  }
  
  public void deduct(T item){
    int currentCount = inventory.get(item);
    inventory.put(item, currentCount-1);
  }
  public void add(T item){
    int currentCount = inventory.get(item);
    inventory.put(item, currentCount+1);
  }
}
