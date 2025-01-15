import java.util.Objects;

public class DemoRecursion {

  public static void main(String[] args){

    // 1 + 2 + 3....+10
    int sum = 0;
    for (int i = 0; i <=10; i++){
      sum += i;
    }
    System.out.println(sum); //55

    //Recursion
    System.out.println(sum(10)); //55


    //1*3*5*7*...*n
    int n = 8;
    int result = n % 2 == 1 ? product(n) : product(n - 1);
    System.out.println(result); //105


    //
  



  }
  //out of main

  // 1 + 2 + 3....+10
  public static int sum(int value){
    //base criteria (exit)
    if (value <= 1){
      return value;
    }

    //invoke myself
    return value + sum(value - 1); //10+sum(9) --> 10+9+sum(8)+...
      //if you dont mark this, will infinity  loop
  }

    //1*3*5*7*...*n
    public static int product(int n){
      //base criteria (exit)
      if (n <= 1){
        return 1;
      }
      return n * product(n - 2);
    }

    //ch23 hash collection
    @Override
    public int hashCode(){
      return Objects.hash(this.name); // name is String --> is different int , "john" -->4.2biliion?
    } //不只4.2b , 會重覆 //java已經幫你解決了, sort out了
    

    

}
