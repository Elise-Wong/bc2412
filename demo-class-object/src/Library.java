public class Library {
  //Attributes
  private Book[] books; 


  //Constructor
  public Library(){
    this.books = new Book[0];//array list: 定左常用數, eg 頭1000可以就咁計, 唔洗成日開array
  }

  public Book[] getBooks(){
    return this.books;
  }
  

  //Method signatures


  //Getter
  public int size(){  // size = getThisBooksLength
    return this.books.length;
  }
  



  //Setter
  ///instand method, new lib, share array
  public void addBook(Book book){
    Book[] newArr = new Book[this.books.length + 1]; //newArr=books
    for (int i = 0; i < this.books.length; i++){
      newArr[i] = this.books[i];
    }
    newArr[newArr.length - 1] = book;
    this.books = newArr;
  }

  ///Assume remove the 1st book with same title
  ///1. remove the item
  ///2. return removed item
  public Book removeByTitle(String title){
    Book targetRemoveBook = null;
    int targetRemoveIndex = -1;
    int idx = 0;
    for (int i = 0; i < this.books.length; i++){
      if (this.books[i].getTitle().equals(title)){  //equals or contains
      // this goes to book array object, books object 
        targetRemoveIndex = i;
        break;  //有第2本就break
      }
    }
    if (targetRemoveIndex != -1){  //book found
      Book[] newArr = new Book[this.books.length - 1]; //newArr=books
      for (int i = 0; i < this.books.length; i++){
        if (i != targetRemoveIndex){
          newArr[idx++] = this.books[i];
        } else{
          targetRemoveBook = this.books[i];  //write down the address
        }
      }
      this.books = newArr; 
    }
    return targetRemoveBook;  // if not found, return null.
  }

  ///Search a sub=string of the title
  /// what book object you are going to return?
  public Book[] searchByTitle(String title){ //didnt change the dvalue of this.books
    int count = 0;
    for (int i = 0; i  < this.books.length; i++){
      if (this.books[i].getTitle().contains(title)){
        count++;
      }
      Book[] newArr = new Book[count];
      int idx = 0;
      for (int i = 0; i < this.books.length; i++){
        if (this.books[i].getTitle().contains(title)){
        newArr[idx++] = this.books[i];  //integer array is better
        }
      }
      return books;
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
    System.out.println(l1.books[0].getTitle());

 
    //1st: Book
    //2nd: Library
    //3rd: Librarian
    Library l2 = new Library();
    l2.addBook(new add("Alice's Adventures in Wonderland", "Lewis Carroll"));
    Librarian lbn = new Librarian(l2);



    for (Book book : l1.getBooks()){
      System.out.println(book.getTitle() + " " + book.getAuthor());

    }


    for (Book book : l1.searchByTitle("rings"));
    System.out.println();

    
  


    Book removeBook = l1.removeByTitle("1984");
    System.out.println(removeBook.getTitle() + " " + removeBook.getAuthor());
    System.out.println(l1.size());









      }
  }
