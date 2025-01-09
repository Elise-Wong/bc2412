public class test {
  public static void main(String[] args) {
    
 
  int q = 8;
  int result = q++ + 5;
  System.out.println(result + ", " + q);

  for (int i = 0; i <= 10; i++){
    q += i;
    System.out.println("sum=" + q);
  }


  int sum = 0;
  for (int i = 0; i <= 10; i++){
    sum += i;
    System.out.println("*sum=" + sum);
  }


  for (int i = 0; i <= 3; i++){
    for (int j = 0; j <= 3; j++){
      if (i * j == 6){
        break;
      }
      System.out.println("i=" + i + ", j=" + j);
    }
  }


  for (int i = 0; i <= 3; i++){
    for (int j = 0; j <= 3; j++){
      if (i * j == 6){
        System.out.println("*i=" + i + ", *j=" + j);
        break;
      }
    }
  }


  String searchMe = "peter piper picked a peck of pickled pepers";
  int num = 0;
  
  for (int i = 0; i < searchMe.length(); i++){
    if (searchMe.charAt(i) != 'p'){
      continue;
    }
    num++;
  }
  System.out.println("found p " + num);

}
}