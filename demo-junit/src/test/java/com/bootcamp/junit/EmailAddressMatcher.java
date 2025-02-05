package com.bootcamp.junit;

import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.Description;


public class EmailAddressMatcher extends TypeSafeMatcher<String>{

  //String Regular Expression = rule of String
  @Override
  public boolean matchesSafely(String email){
    return email.matches("[a-zA-Z0-9]+@[a-z].com"); // + 號前的 可check到 1 or more 字母
  }

  @Override
  public void describeTo(Description description){ //pass by reference
    description.appendText("Wrong Email Address!!!");
  }


}
