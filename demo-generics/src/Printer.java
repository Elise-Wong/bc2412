public class Printer {
  private Integer x;


  public Printer(Integer X){
      this.x = x;
  }


  public String print(){
      return "this.x" + this.x;
  }



  public static void main(String[] args) {
    Printer p1 = new Printer(10);
    System.out.println(p1.print()); //this is 10

    //what if DoublePrinter? LongPrinter? BigDecimalPrinter?  --> New class

    //Another solution: Generics
    //10 --> Integer 10 --> Long 10
    //10L --> Long 10
    GeneralPrinter<Long> longPrinter = new GeneralPrinter<>(10L);
    //you definded T as Long.


    GeneralPrinter<Book> bookPrinter = new GeneralPrinter<>(new Book("ABC"));
    System.out.println(bookPrinter.print()); //this is Book[name=ABC]



  }

}
