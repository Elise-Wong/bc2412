public class DemoUncheckedException {
  //2 types Exception: Unchecked Exception, Checked Exception

  //Define checked exception
  public static class BusinessException extends Exception{

  }

  //Define Unchecked exception
  public static class BusinessRuntimeException extends RuntimeException{

  }

  //who is the caller of main() method?
  //JVM (Java Virtual Machine) call this main mehtod
  public static void main(String[] args) throws BusinessException{

    
    //checked exception
    int sum = 0;
    try{
      sum = sum(1, null); //throw check exception (compile time)
      System.out.println("sum=" + sum);
    } catch (BusinessException e){
      System.out.println("x & y cannot be null");
    }
   

    //unchecked exception
    //for runtime exception, you can catch or not catch (Syntax Perspective)
    //you can avoild ...e.g. if
    sum = sum2(10, null); //Sysntax OK, but the exception still exits
    
    try{
      sum = sum2(10, null); //throw uncheck exception (run time)
      System.out.println("sum=" + sum);
    } catch (BusinessRuntimeException e){
      System.out.println("x & y cannot be null");
    }




    try{
      throw new BusinessException();
    } catch (BusinessException e){
      System.out.println("Handle Checked Exception");
    }


  }
  //out of main

    //checked exception
    public static int sum(Integer x, Integer y) throws BusinessException{
      if (x == null || y == null)
        throw new BusinessException();
      return x.intValue() + y.intValue();
    }
    
    //unchecked exception
    public static int sum2(Integer x, Integer y) throws BusinessRuntimeException{
      if (x == null || y == null)
        throw new BusinessRuntimeException();
      return x.intValue() + y.intValue();
    }


}
