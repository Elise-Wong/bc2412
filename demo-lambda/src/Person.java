public class Person {
    //attrucbit-Person
    private String name;
    private int age;

      //getter-Builder
      public static Builder builder(){
        return new Builder();
      }

    
      //constructor-Builder
      private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
      }

    //constructor-Person
    public Person(String name, int age){
      this.name = name;
      this.age = age;
    }

    //getter-Person
    public String getName(){
      return this.name;
    }

    public int getAge(){
      return this.age;
    }

    //setter-Person
    public void setName(String name){
      this.name = name;
    }

    public void setAge(int age){
      this.age = age;
    }

    //another class - Builder
    public static class Builder{
      //attrucbit-Builder
      private String name;
      private int age;




      //setter-Builder
      public Builder name(String name){
        this.name = name;
        return this;
      }

      public Builder age(int age){
        this.age = age;
        return this;
      }

      public Person build(){
        return new Person(this);
      }

      
    }


  public static void main(String[] args){
    Person p1 = new Person("vic", 18);
    Person p3 = new Person(null, 18); //not a good idea to pass null
        
    //advantages:
    //1. you no longer need to pass null for those unnecessary attribute
    //2. if there are many attribute (i.e. + String), you have to manually check if the value is passed to the right parameters

    Person p2 = Person.builder()
              .name("vic")
              .age(18)
              .build();

    System.out.println(p2.getAge()); //18
    System.out.println(p2.getName()); //vic

    Person p4 = Person.builder().build();

    System.out.println(p4.getAge()); //0
    System.out.println(p4.getName()); //null

    }
}
