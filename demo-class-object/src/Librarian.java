public class Librarian {
  private String name;
  private Library library;


  //constructor
  // option 1: Librarian 內有 Library...better
  // option 2: Library 內有 Librarian
  public Librarian(Library library){
    this.library = library;
  }


  //Getter
  public void add(Book book){
    Book[] books = new Book[this.library.size() +1];
    for (int i = 0; i < this.library.size(); i++){
      books[i] = this.library.getBooks()[i];
    }
    books[books.length - 1] = book;
    this.library.setBooks(books);
  }


  public Book removeByTitle(String title){
    Book targetRemoveBook = null;
    int targetRemoveIndex = -1;
    int idx = 0;
    for (int i = 0; i < this.library.size; i++){
      if (this.library.getBooks()[i].getTitle().equals(title)){  //equals or contains
      // this goes to book array object, books object 
        targetRemoveIndex = i;
        break;  //有第2本就break
      }
    }
    if (targetRemoveIndex != -1){  //book found
      Book[] newArr = new Book[this.library.size - 1]; //newArr=books
      for (int i = 0; i < this.library.size; i++){
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
  //read 人地的objectbit , use set


  //Setter
}
