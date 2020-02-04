package com.simple.vending.machine;

import java.util.List;
import java.util.Map;

public class VendingMachineImpl implements VendingMachine {
  private Inventory<Coin> coinInventory = new Inventory<>();
  private Inventory<Item> itemInventory = new Inventory<>();
  private long totalSales;
  private long currentBalance;
  private Item currentItem;

  public VendingMachineImpl() {
    initialize();
  }

  private void initialize() {
    for (Coin c : Coin.values()) {
      coinInventory.put(c, 5);
    }

    for (Item i : Item.values()) {
      itemInventory.put(i, 5);
    }
  }

  @Override
  public void reset() {
    // TODO Auto-generated method stub

  }

  @Override
  public long selectItemAndGetPrice(Item item) {
    if (itemInventory.hasItem(item)) {
      this.currentItem = item;
      return currentItem.getPrice();
    }
    return 0;
  }

  @Override
  public void insertCoin(Coin coin) {
    currentBalance += coin.getValue();
    coinInventory.add(coin);
  }

  @Override
  public List<Coin> refund() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Bucket<Item, Long> collectItemAndChange() {
    try {
      Item item = collectItem();
      totalSales = totalSales + item.getPrice();
      long change =  getChange();
      currentBalance = change;
      return new Bucket<Item, Long>(item, change);
      
    } catch (NotFullPaidException e) {
      e.printStackTrace();
    }
    return null;
  }

  private long getChange(){
    if(currentBalance > currentItem.getPrice()){
      return currentBalance - currentItem.getPrice();
    }else{
      return 0;
    }
  }
  private Item collectItem() throws NotFullPaidException{
    if(isFullPaid()){
      itemInventory.deduct(currentItem);
      return currentItem;
    }
    throw new NotFullPaidException();
  }
  private boolean isFullPaid() {
    if (currentBalance >= currentItem.getPrice()) {
      return true;
    } else {
      return false;
    }
  }

}
