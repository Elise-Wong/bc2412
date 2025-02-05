package com.bootcamp.junit;

// Singleton Pattern (Coding Pattern)
//if u dont want to create enum
public class InventoryService {
  private static InventoryService uniqueInstance = new InventoryService(); // static always in first line
  private int stockCount; //有狀態

  //construtor
  private InventoryService(){ //no more construtor as privatge
  }

  //getter
  public static InventoryService getInstance(){
    return uniqueInstance;
  }

  public static int getInstanceStockCount(){
    return uniqueInstance.getStockCount(); //封裝了
  }

  public static boolean deductInventoryStockCount(){
    return uniqueInstance.deductStock();
  }

  public int getStockCount(){
    return this.stockCount;
  }


  public int checkAvailableStock(){
    return -1; //1
  }


  //void
  public boolean deductStock(){ //check, deduct 有sysconise issue
    this.stockCount--;
    return false; //true
  }

  public static void main(String[] args) {
    System.out.println(InventoryService);
    
  }


}
