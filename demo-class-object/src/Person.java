public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getEmail(){
        return this.email;
    }

    public void setAge(int age){
        this.age = age;
    }

    public static int sum(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        String person = "vincent";
        int personAge = 18;

        String person2 = "lucas";
        int personAge2 = 17;

        String[] names = new String[] {"vincent", "lucas"}; // if lucas resigned, then u need to cancel everthings about lucas
        int[] ages = new int[]{18, 17};

        Person p1 = new Person("vincent", 18, "vincent@v.com");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getEmail());
        
        Person p2 = new Person("lucas", 17, "lucas@v.com");
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        System.out.println(p2.getEmail());

        Person p3 = p2;
        System.out.println(p3.getName() + "**");


        Person[] persons = new Person[]{p1, p2, new Person("dicky", 19, "dicky@v.com")};
        for (Person p : persons){
        System.out.println(p.getName() + ", " + p.getAge() + ", " + p.getEmail());
        }

        p2.setAge(30);
        System.out.println(p2.getAge());
        System.out.println(p3.getAge());


        String s1 = "hello";
        String[] strings = new String[] {s1, "world"};
        




    }
}
