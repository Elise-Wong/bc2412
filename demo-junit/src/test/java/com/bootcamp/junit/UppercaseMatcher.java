package com.bootcamp.junit;

import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.Description;

public class UppercaseMatcher extends TypeSafeMatcher<String>{

  public static UppercaseMatcher containUppercaseOnly(){
    return new UppercaseMatcher();
  }

  //String Regular Expression = rule of String
  @Override
  public boolean matchesSafely(String item){
    return item.matches("[A-Z]+"); // check到 1 or more 字母

  }

  @Override
  public void describeTo(Description description){ //pass by reference
    description.appendText("Contain Uppercase Only!!!");
  }

}
