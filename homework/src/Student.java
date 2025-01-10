import java.util.Objects;

public class Student {
  private int id;
  private String name;


  public Student(int id, String name){
    this.id = id;
    this.name = name;
  }


  public int getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  
  @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    } if (!(obj instanceof Student))
      return false;
      Student student = (Student) obj;
    return Objects.equals(this.id, student.getId())
        && Objects.equals(this.name, student.getName());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.id, this.name);
  }

  @Override
  public String toString(){
    return 
       "ID: " + this.id
      + ", Name: " + this.name
      + "";
  }

}
