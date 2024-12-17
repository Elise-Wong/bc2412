public class HW20241213Java4 {
  public static void main(String[] args) {

    int count = 0;

    for (int i = 0; i < 100; i++) {
      if (i > 0 && i % 2 == 0 && i % 3 == 0 && count < 10) {
        System.out.println(i); //print once, then count another &then print again etc.
        count++;
      }
    }

  }
}
