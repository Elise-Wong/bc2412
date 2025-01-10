import java.util.Objects;

public class Store {
  private String name;


  public Store(String name){
    this.name = name;
  }

  
  public String getName(){
    return this.name;
  }

  
  @Override
  public boolean equals(Object obj){
    if (this == obj){
      return true;
    } if (!(obj instanceof Store))
      return false;
    Store store = (Store) obj;
    return Objects.equals(this.name, store.getName());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name);
  }

  @Override
  public String toString(){
    return "Store["
      + "name=" + this.name
      + "]";
  }


}
