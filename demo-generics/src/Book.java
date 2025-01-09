import java.util.Objects;

public class Book {
  private String name;


  public Book(String name){
    this.name = name;
  }


  public String getName(){
    return this.name;
  }

  
    //一定要寫好equals
    @Override
    public boolean equals(Object obj){  //就算object不一樣, 都要當同一本書
      if (this == obj){
        return true;
      } if (!(obj instanceof Book))
        return false;
      Book book = (Book) obj;
      return Objects.equals(this.name, book.getName());
    }
  
    @Override
    public int hashCode(){
      return Objects.hash(this.name);
    }

  @Override
  public String toString(){
    return "Book["
      + "name=" + this.name
      + "]";
  }




}
