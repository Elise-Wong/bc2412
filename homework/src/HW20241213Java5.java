public class HW20241213Java5 {
  public static void main(String[] args){
    
    String str = "coding bootcamp.";
    char target = 'c'; 

    int lastCharacter = -1;
    boolean isCharExist = false;

    for (int i = 0; i < str.length(); i++){

    if(str.charAt(i) == 'c'){
      isCharExist = true;
      System.out.println("Found");
    }else{
      System.out.println("Not Found");
    }




  
}
  }
}