package com.simple.vending.machine;

import java.util.List;

public interface VendingMachine {

  public void reset();
  public long selectItemAndGetPrice(Item item);
  public void insertCoin(Coin coin);
  public List<Coin> refund();
  public Bucket<Item, Long> collectItemAndChange();
}
