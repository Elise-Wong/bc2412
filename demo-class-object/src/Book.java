public class Book {
  //Attributes
  private String title;
  private String author;



  //Constructor
  public Book(String title, String author){
    this.title = title;
    this.author = author;








  }
  


  //Getter
  public String getTitle(){
    return this.title;
  }

  public String getAuthor(){
    return this.author;
  }
  



  //Setter

  public static void main(String[] args) {
    
    Book b1 = new Book("the lord of the rings", "JRR Tolkien");
    Book b2 = new Book("1984", "George Orwell");
    Book b3 = new Book("Harry Potter", "JK Rowling");

    System.out.println(b1.getAuthor());

  }

}
