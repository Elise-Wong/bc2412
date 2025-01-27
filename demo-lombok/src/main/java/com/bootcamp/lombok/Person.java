package com.bootcamp.lombok;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//JDK: Java Development Kit = Dev Library/Tool (e.g. Java C) + JRE (Java Runtime Env, only run class) + JVM
//Dev Lib => e.g. Java C, Class Library BigDecimal(java.math), StringBuilder(java.lang)
//1. Some of the library auto-imported by Java Project (e.g. java.lang)
//2. but some of them have to be manually imported (e.g.BigDecimal)
//3. Maven: download external (outside JDK) library from maven public/over the world (e.g. lombok)

//How Lombok get it work? how lombok work with java?

//Class Level annotaion
@Getter // can be field level
@Setter // can be field level
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode //what if extends? parent would be consider? gem super(will any missing element?)
@Builder
public class Person {
  private String name;

  //field level
  @ToString.Exclude
  private int age;

  

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setAge(20);
    p1.setName("Peter");
    Person p2 = new Person("Timmy", 10);
    System.out.println(p2.getAge()); //10
    System.out.println(p2.getName()); //Timmy
    System.out.println(p1); //Person(name=Peter, age=20) -> Person(name=Peter)

    Person p3 = new Person("Timmy", 10);
    System.out.println(p2.equals(p3)); //true
    System.out.println(p2.hashCode() == p3.hashCode()); //true

    Person p4 = Person.builder().name("Timmy").age(10).build();
    System.out.println(p4); //Person(name=Timmy, age=10) -> Person(name=Timmy)
    

  }

}
