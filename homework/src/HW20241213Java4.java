public class HW20241213Java4 {
 public static void main(String[] args){



  for (int i = 0; i < 100; i++){
    if(i <= 0 && i % 2 != 0 && i % 3 != 0
    || i <= 0 && i % 2 == 0 && i % 3 == 0
    || i <= 0 && i % 2 != 0 && i % 3 == 0
    || i <= 0 && i % 2 == 0 && i % 3 != 0
    || i > 0 && i % 2 != 0 && i % 3 == 0
    || i > 0 && i % 2 == 0 && i % 3 != 0
    || i > 0 && i % 2 != 0 && i % 3 != 0){
      continue;
          }
   
    System.out.println(i);
   }



 }
}
