package com.bootcamp.junit;

// stateless -> no attribute
public class PaymentService { //can no any 狀態....冇狀態
  //if have state (private int state;), 是有狀態


  //pay( card no., expiry date, safty no. etc.)...有狀態
  public boolean pay(){  //....冇狀態
    return true;
  }

}
