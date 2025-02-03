package com.bootcamp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// ! Test Java File name should be with "Test" or "Tests" suffix
class StaffTest { // no need public, so that others would not 干擾

  //test for getter, setter
  @Test
  void testStaff_GetterSetter(){ //test case 才用_
    Staff s1 = new Staff();
    Assertions.assertEquals(0, s1.getAge()); //(expected result, coding)
    s1.setAge(18);
    Assertions.assertEquals(18, s1.getAge());
  }

  //test for constructor
  @Test
  void testStaff_Constructor(){
    Staff s2 = new Staff("abc", 18);
    Assertions.assertEquals("abc", s2.getName());
    Assertions.assertEquals(18, s2.getAge());
  }

  //test for EqualsAndHashCode
  @Test
  void testStafEqual(){
    Staff s3 = new Staff("Steven", 30);
    Staff s4 = new Staff("Steven", 30);
    Assertions.assertEquals(s3,s4); //assertSame(s3,s4)
  }

  @Test
  void testStaffToString(){
    Staff s3 = new Staff("Steven", 30);
    //Assertions.assertEquals("Staff(name=Steven, age=30)", s3.toString()); 
    Assertions.assertEquals("Steven 30", s3.toString()); //day 2 requirment
  }


}
