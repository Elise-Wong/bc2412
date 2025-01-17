import java.time.LocalDate;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class StockPriceTracker {
  // code here: Design your PQ, so that it always poll the highest price first.
  private final Queue<Double> maxPricePQ = new PriorityQueue<>();

  private final Map<LocalDate, Double> tradeRecords = new HashMap<>();
  private final Deque<LocalDate> tradeDates = new LinkedList<>();

  //another class









  
  public static class Stock{
    //attributes
    private LocalDate date;
    private double price;

    //constructor
    public Stock(LocalDate date, double price){
      this.date = date;
      this.price = price;
    }

    //getter
    public LocalDate getDate(){
      return this.date;
    }

    public double getPrice(){
      return this.price;
    }

    //setter

      //another class
      //public static class SortByDate implements Comparator<StockPriceTracker.Stock>{
      //  @Override
      //  public LocalDate compare(LocalDate d1, LocalDate d2){
      //    return d1.getDate() > d2.getDate() ? -1 : 1;
      //  }
      //}

  public void addRecord(LocalDate date, double price) {
    // code here ...
    // 1. Add the trade record to the hashMap
    tradeRecords.put(date);
    // 2. Add the price to PQ
    maxPricePQ.add(price);
    // 3. Add the trade date to Deque
    tradeDates.add(date);
    System.out.println("Recorded: " + date + " -> $" + price);
  }

  public double getLatestPrice() {
    // code here ...
    // Tips: use tradeDates & tradeRecords
    
    return -1.0;
  }

  public double getHighestPrice() {
    // code here ...
    // Tips: use maxPricePQ
    return -1.0;
  }

  public static void main(String[] args) {
    StockPriceTracker tracker = new StockPriceTracker();
    // Assume we put the records in order of trade date
    tracker.addRecord(LocalDate.of(2024, 1, 1), 100.50);
    tracker.addRecord(LocalDate.of(2024, 1, 2), 200.75);
    tracker.addRecord(LocalDate.of(2024, 1, 3), 150.25);
    tracker.addRecord(LocalDate.of(2024, 1, 4), 199.99);
    System.out.println("Latest price: $" + tracker.getLatestPrice()); // Output: 150.25
    System.out.println("Highest price: $" + tracker.getHighestPrice()); // Output: 200.75



  }
}
}
