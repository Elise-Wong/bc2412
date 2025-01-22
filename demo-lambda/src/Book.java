public record Book(String name, double price) {
    //All-arg constructor ONLY

    //not support custom attribute
    //private String author; //cant

    //not support custom constructor
    //public Book(){
    //}

    //support static variable/method
    public static final double PI = 3.14;

    //support custom instance method
    public void print(){
        System.out.println(name + price);
    }


    public static void main(String[] args) {
        Book b1 = new Book("ABC", 10.5);

        //renamed getter
        System.out.println(b1.name()); //"ABC"
        System.out.println(b1.price()); //10.5

         //no setter (immutable)

        //support equals() and hashCode()
        System.out.println(new Book("ABC", 10.5).equals(b1)); //true
        System.out.println(new Book("ABC", 10.5).hashCode()); //1078168574
        System.out.println(b1.hashCode()); //1078168574

        //support toString()
        System.out.println(b1); //Book[name=ABC, price=10.5]

        //support static variable/method
        System.out.println(Book.PI);//3.14

        //support custom instance method
        b1.print(); //ABC10.5


       


    }

}
