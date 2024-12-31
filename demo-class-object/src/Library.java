public class Library {
  //Attributes
  private Book[] books; 


  //Constructor
  public Library(){


    String[] titles = new String[]{};
    String[] authors = new String[]{};
    this.books = new Book[0];

    int idx = 0;
    for (String title : titles){
      
    }


  }
  

  //Method signatures


  //Getter
  



  //Setter
  //instand method, new lib, share array
  public void addBook(Book book){
    Book[] newArr = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++){
      newArr[i] = this.books[i];
    }
    newArr[newArr.length - 1] = book;
    this.books = newArr;
  }

  //Assume remove the 1st book with sametitle
  public Book removeByTitle(String title){
    return null;
  }

  //Search a sub=string of the title
  public Book[] search;

  public void removBook(Book book){
    int idx = 0;
    int countTarget = 0;
    Book[] newArr = new Book[this.books.length - 1];
    for (int i = 0; i < this.books.length; i++){
      if (this.books[i].equals(book) && countTarget == 0){
        countTarget++;
        continue;
      newArr[idx++] = this.books[i];
    }
    this.books = newArr;
  }
  }


  public static void main(String[] args){

    Book b1 = new Book("the lord of the rings", "JRR Tolkien");
    Book b2 = new Book("1984", "George Orwell");
    Book b3 = new Book("Harry Potter", "JK Rowling");


    Library l1 = new Library();
    l1.addBook(b3);
    l1.addBook(b2);
    l1.addBook(b1);

    for (Book book : this.books){
      if (book.getOrderId() == orderId){
        return order.getItems();

    for (int i = 0; i < l1.length(); i++);

    System.out.println(l1.books[0].getTitle());


      }
  }
}
  }