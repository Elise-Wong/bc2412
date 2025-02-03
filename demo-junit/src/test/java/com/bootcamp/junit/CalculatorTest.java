package com.bootcamp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// ! mvn compile: compile main code
// ! mvn testCompile: "mvn compile" +  compile test code
// ! mvn test: "mvn testCompile" + run all test cases
// ! mvn package: "mvn test" + package jar
// ! mvn install: "mvn package" + install jar to m2

// mvn test -> locate "@Test" annotation
// Maven create a test object to invoke testSum()

public class CalculatorTest {
  // Unit test = requires a framework to compare the actual & expected result
  // definition of PASS, which passed test case
  @Test
  void testSum(){  //only the name of tool/method
    // TC: testcase with expected result
    // TC1: 1+2=3
    // TC2: -1+3=2
    // TC3: 0+0=0
    Assertions.assertEquals(3, Calculator.sum(1,2));
    Assertions.assertEquals(2, Calculator.sum(-1,3));
    Assertions.assertEquals(0, Calculator.sum(0,0));
    // ! if actual result != expected result, mavem throw error
    // ! so that you cant pass through the "test" cycle

  }

  @Test
  void testSum2(){
    Assertions.assertEquals(-5, Calculator.sum(-1,-4));
  }

  public static void main(String[] args) {
    CalculatorTest ct = new CalculatorTest();
    ct.testSum();


  }

}
