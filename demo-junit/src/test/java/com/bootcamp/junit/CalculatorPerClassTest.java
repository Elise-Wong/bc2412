package com.bootcamp.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestInstance.Lifecycle;

// ! one test object to call all test cases
@TestInstance(Lifecycle.PER_CLASS)

// for ordering
@TestMethodOrder(OrderAnnotation.class)

@DisplayName("Calculator.java Tests") //話番俾人聽做緊咩
public class CalculatorPerClassTest {
  //Test Object
  private int x; //test enviorment variable


  @BeforeAll
  void initAll(){
    System.out.println("Before all test cases");
  }

  @AfterAll
  void afterAll(){
    System.out.println("After all test cases");
  }

  @BeforeEach
  void reset(){
    System.out.println("Before each test case, reset sth...");
  }

  @AfterEach
  void clear(){
    System.out.println("After each test case, clear sth...");
  }


  @Test
  @Order(1)
  void testSum(){
    System.out.println("Test case 1");
    this.x += Calculator.sum2(1,2);
    assertEquals(3, Calculator.sum(1,2));
  }

  @Test
  @Order(2)
  void testSum2(){
    System.out.println("Test case 2");
    this.x += Calculator.sum2(1,2);
    assertEquals(3, this.x);
  }

  // ! "mvn test" perform sth similar process as below:
  public static void main(String[] args) {
    CalculatorPerClassTest testObject = new CalculatorPerClassTest();
    testObject.testSum();





  }

}
