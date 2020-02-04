package com.simple.vending.machine;

public class NotFullPaidException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  @Override
  public String getMessage() {
    // TODO Auto-generated method stub
    return "Not Full Paid";
  }
}
