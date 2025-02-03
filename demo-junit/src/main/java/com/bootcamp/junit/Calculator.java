package com.bootcamp.junit;

public class Calculator {
  // method A  to method B
  // method B to sum()
  // sum() to method C

  public static int methodB(int a){
    return a + sum(a, a + 2);
  }

  public static int sum(int x, int y){
    //return x + y; //day 1
    return x + y + 1; //day 2
  }

  public static void main(String[] args) {






  }

}
