import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class streamEx {

  public static void main(String[] args) {
        // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.
    
    List<String> keywords = Arrays.asList("stream", "filter", "map", "sorted", "collect");
    Optional<String> MaxKeywords = keywords.stream()
    .max((o1, o2) -> o1.compareTo(o2));
    Optional<String> MinKeywords = keywords.stream()
    .min((o1, o2) -> o1.compareTo(o2));
    long countKeywords = keywords.stream()
      .count();
    
      List<String> counts = keywords.stream()
      .filter(e -> e.length() > 0)
      .peek(e -> System.out.println(e.length()))
      .collect(Collectors.toList());
    
    double avgLength = keywords.stream()
      .mapToInt(String::length)
      .average()
      .orElse(0.0);
    
    int sumLength = keywords.stream()
      .mapToInt(String::length)
      .sum();
    
    System.out.println(MaxKeywords);
    System.out.println(MinKeywords);
    System.out.println(countKeywords);
    System.out.println(avgLength);
    System.out.println("27. " + sumLength);
    //Aggregate Function: max(), min(), average(), sum(), count()
  }
}
