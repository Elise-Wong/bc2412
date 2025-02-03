package com.bootcamp.junit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Staff {
  private String name;
  private int age;

  //Day 2 requirment
  @Override
  public String toString(){
    return this.name + " " + this.age;
  }

}
