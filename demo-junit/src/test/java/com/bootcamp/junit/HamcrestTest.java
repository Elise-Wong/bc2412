package com.bootcamp.junit;

import static org.hamcrest.MatcherAssert.*;
import static org.mockito.ArgumentMatchers.contains;
import static org.mockito.ArgumentMatchers.isA;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

import org.junit.jupiter.api.Test;

public class HamcrestTest {

  @Test
  void testBasic(){
    MatcherAssert.

    assertThat(Calculator.sum2(1, 2), is(equalTo(3))); //is(3)
    assertThat(10, is(greaterThan(9)));
    assertThat("Hello World", not(containsString("!")));
    assertThat("Hello World", constainsString("world"));

    String s = null;
    assertThat(s, nullValue());
    assertThat("hello", notNullValue());

    String s1 = "hello";
    String s2 = "hello";
    assertThat(s1, is(sameInstance(s2)));
    assertThat(10, is(greaterThanOrEqualTo(10)));
    assertThat("", is(emptyString()));

    //List
    @Test
    void testList(){
      List<String> names = Arrays.asList("John", "Steve", "Vic");
      assertThat(names, hasItem("Steve"));
      //assertThat(names, hasItem("Lucas"));

      //contains() -> with ordering
      assertThat(names, contains("null")); //x
      assertThat(names, contains("John", "Steve", "Vic"));
      assertThat(names, containsInAnyOrder("Steve", "Vic", "John"));

      // hasSize()
      assertThat(names, hasSize(3));


    }

    // test tolerance
    @Test
    void testNumber(){
      double tolerance = 0.01d;
      double actual = 3.14149d; //3.13150 <= x <= 3.15149

      assertThat(actual, closeTo(3.13150, tolerance));
      assertThat(actual, not(closeTo(3.13149, tolerance)));
      assertThat(actual, closeTo(3.15149, tolerance));
      assertThat(actual, not(closeTo(3.15150, tolerance)));
    }

    //check actural polymo
    @Test
    void testInstance(){
      //checking Child object vs Parent object
      Number num = new Double("3.0");
      assertThat(num, instanceOf(Double.class));

      //checking Child Class vs Parent Class
      assertThat(Long.class, typeCompatibleWith(Number.class));
      assertThat(String.class, typeCompatibleWith(CharSequence.class));
      assertThat(StringBuilder.class, typeCompatibleWith(CharSequence.class));

      };

    @Test
    void testCustomeMatcher(){
      assertThat("Hello", UppercaseMatcher().containUppercaseOnly); // , new UppercaseMatcher() ...when no getter

    }

    



  }
}
