import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListExercise20250109 {
  public static void main(String[] args) {
    //01a
    ArrayList<Integer> nums = new ArrayList<>();

    //01b
    nums.add(0,(10));
    nums.add(1,(20));
    nums.add(2,(30));
    nums.add(3,(40));
    nums.add(4,(50));

    //01c
    System.out.println("01c. " + nums.get(0) + "," + nums.get(1) + "," + nums.get(2) + "," + nums.get(3) + "," + nums.get(4));

    //01d
    nums.remove(2);

    //01e
    System.out.println("01e. " + nums.size());


    //02a
    ArrayList<String> stores = new ArrayList<>();
    stores.add("Apple");
    stores.add("Banana");
    stores.add("Mango");
    stores.add("Orange");
    System.out.println("02a. " + stores);

    //02b
    System.out.println("02b. " + stores.contains(("Grapes")));

    //02c
    boolean founded = false;
    for (String store : stores){
      if (!(store.contains("Grapes"))){
        founded = false;
        break;
      }
    }
    stores.add("Grapes");
    System.out.println("02c. " + stores);

    //02d
    stores.remove("Mango");
    ArrayList<String> newStores = new ArrayList<>();
    newStores.add("Peach");
    stores.addAll(2, newStores);
   
    //02e
    System.out.println("02e. " + stores);


    //03a
    ArrayList<Integer> ns = new ArrayList<>();
    ns.add(0,(10));
    ns.add(1,(20));
    ns.add(2,(10));
    ns.add(3,(30));
    ns.add(4,(40));
    ns.add(5,(20));
    ns.add(6,(50));
    System.out.println("03a. " + ns);

    //03b 
    //method 1
    HashSet<Integer> set = new HashSet<Integer>(ns);
    System.out.println("03b. " + set);

    //method 2
    ArrayList<Integer> newns = new ArrayList<Integer>(set);
    for (Object object : newns){
      System.out.println(object);
    }
    //int targetRemoveIndex = 1;
    //String targetRemoveString = null;
    //int index = 0;
    //for (String s : ns){  //int s : ns
    //  if(targetRemoveIndex == index){
    //    targetRemoveString = s;
    //     break;
    //  }
    //  index++;
    //}
    //ns.remove(targetRemoveString);

    //03c
    System.out.println("03c. " + set);


    //04a
    HashSet<String> countries = new HashSet<>();
    countries.add("USA");
    countries.add("India");
    countries.add("China");
    countries.add("Japan");
    System.out.println(countries);
   
    //04b
    countries.add("Canada");

    //04c
    List<String> newCountries = new ArrayList<>(countries);
    newCountries.add("India");
    System.out.println("04c. " + newCountries);
    //countries.addAll(2, newCountries);
    countries.add("India");

    //04d x
    System.out.println("04d. " + countries);

    //05a
    HashSet<Double> n5Set = new HashSet<>();
    n5Set.add(1.1);
    n5Set.add(2.2);
    n5Set.add(3.3);
    n5Set.add(4.4);
    n5Set.add(5.5);

    //05b
    System.out.println("05b. " + n5Set.contains(3.3));

    //05c
    n5Set.remove(2.2);

    //05d
    System.out.println("05d. " + n5Set.size());


    //06a
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();

    //06b
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);

    //06c
    set2.add(30);
    set2.add(40);
    set2.add(50);
    set2.add(60);

    //06d x
    boolean found = false;
    for (int ss : set1){
      for (int sss : set2)
      if (ss == sss){
        found = true;
        //set1.retainAll(set2);
        break;
      }
    }
    //System.out.println(found);

    //HashSet<Integer> common = new HashSet<>();
    //for (int i : set1){
    //  set1.add(i);
    //}
    //for (int i : set2){
    //  set2.add(i);
    //}
    //set1.retainAll(set2);   //retainAll: rerice itselft
    //System.out.println(set1);
    //for (int i = 0; i < set1.length; i++){
      
    //}
    //  for (int j = 0; j < set2; j++){
    //    if (set1[i] = set2[j]){
    //      common.add(set1[i]);
    //    }
    //  }
    //}
    //System.out.println(common);

    //HashSet<Integer> intersection = SetUtils.intersection(set1, set2);
    //System.out.println(intersection);


    //06e x
    System.out.println("*"+ set2 + set1);


    //07a
    HashSet<String> s7Set = new HashSet<>();
    s7Set.add("Cherry");
    s7Set.add("Steve");
    s7Set.add("Chole");
    s7Set.add("Jenny");
    s7Set.add("Vicky");

    //07b
    ArrayList<String> s7Array = new ArrayList<>(s7Set);

    //07c
    System.out.println("07c. " + s7Array);


    //08a
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));

    //08b
    System.out.println("08b. " + students);

    //08c
    students.remove(1);
    System.out.println("08c. " + students);

    //08d v
    String studentName = "Student not found";
    int sID = 0;
    for (Student student : students){
      if (student.getId() == 2){
        sID = student.getId();
        System.out.println(student.getName());
        break;
      }
      System.out.println("08d. " + studentName);
    }

    //08e
    ArrayList<Student> newstudents = new ArrayList<>();
    
    for (Student student : students){
      if (student.getName().contains("A")){
        studentName = student.getName();
        newstudents.add((student));
        break;
      }
    }
    System.out.println("08e. " + newstudents);


    //09a
    HashSet<Student> studentSet1s = new HashSet<>();
    HashSet<Student> studentSet2s = new HashSet<>();

    studentSet1s.add(new Student(1, "Alice"));
    studentSet1s.add(new Student(2, "Bob"));
    studentSet1s.add(new Student(3, "Charlie"));

    studentSet2s.add(new Student(2, "Bob"));
    studentSet2s.add(new Student(3, "Charlie"));
    studentSet2s.add(new Student(4, "David"));

    System.out.println("09a. Set 1: " + studentSet1s);
    System.out.println("09a. Set 2: " + studentSet2s);

    //09b
    //String sN = "Not Found";
    //for (Student s1 : stundentSet1s){
    //  for (Student s2 : stundentSet2s){
    //    if (s1.getName().equals(studentSet2s)){
    //      sN = s1.getName();
    //      break;
    //    }
   //   }
   // }

    //09c
    studentSet1s.addAll(studentSet2s);
    System.out.println("09c. " + studentSet1s);
















  }

}
