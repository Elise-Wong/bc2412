import java.util.ArrayList;

public class DemoArrayList {
  public static void main(String[] args){
    //Many string = String[]

    //variable length....長度可變7
    ArrayList<String> strings = new ArrayList<>();
    strings.add("abc");
    strings.add("ijk");
    System.out.println(strings.size()); //2
    System.out.println(strings.get(1)); //ijk
    ///System.out.println(strings.get(2)); //java.lang.IndexOutOfBoundsException //becos more than 0 & 1, no 2 here

    //Book[]
    ArrayList<Book> books = new ArrayList<>();
    books.add(new Book("aaa"));
    books.add(new Book("ijk")); //T array

    //remove book
    books.remove(0); //remove book by index...safe when index is not -ve or longer than length
    System.out.println(books.size()); //1
    books.add(new Book("XYZ"));
    books.remove(new Book("IJK")); //…after @Override equals() in Book.class******
    System.out.println(books.size()); 
    //2  (你想要1本, 但因為address不一樣, 所以出2本)
    //book have equals which in parent class
    //1, after @Override equals() in Book.class


    //ArrayList.remove(Object obj)  Book.equals()
    //Generics Design ensure the Type must contains equals()

    // requires @Override equals()
    System.out.println(books.contains(new Book("XYZ"))); //true
    System.out.println(books.indexOf(new Book("XYZ"))); //0
    //System.out.println(books.retainaAll());// 保留D咩

    ///System.out.println(books.clear()); 
    //this.values = new T [] = 0
    //create a new array with size 0

    System.out.println(books.add(new Book("ABCD"))); //true
   
    System.out.println(books.isEmpty()); //false


    //Search sub-title (part of the title for book)"ABCD" book - for loop
    //for-each support ArrayList
    ///boolean found = false;
    String bookName = "Not Found";
    for (Book book : books){
      if (book.getName().contains("BC")){
        ///found = true;
        bookName = book.getName();
        break;
      }
    }
    ///if (found){
      System.out.println("Book " + bookName + "is available.");
    
  }

}
