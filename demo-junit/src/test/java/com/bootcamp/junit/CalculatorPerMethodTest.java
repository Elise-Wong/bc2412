package com.bootcamp.junit;

import java.nio.file.LinkOption;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD) //by default
public class CalculatorPerMethodTest {



  // ! "mvn test" perform sth similar process as below:
  public static void main(String[] args) {
    CalculatorPerMethodTest testObject = new CalculatorPerMethodTest();
    
  }

}
