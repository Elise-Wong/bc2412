public class DemoInnerClass { //Outer Class
    private int x;

    //directly setter
    public void setX(int x){
        this.x = x;
    }

    public void print(){
        //outer class cant read the inner class object attribute
        //System.out.println("Outer.print(): y=" + y); ....cant do it
        System.out.println("Outer.print(): x=" + this.x);
    }


    //another class -ch27
    public static class Library{ //static nested class

    }


    //another class -ch28
    public static class Builder{ //static nested class

    }

    //another class
    public class Student{ //Inner Class, no static
        private int y;

        public void print(){
            //Student objec is able to read Outer Class object attribute directly
            System.out.println("Student.print(): x=" + x + ", y=" + this.y); //cant this.x as Student has no this.x
            //u can only write this in inner class, cant write this in another (create) new class.
        }

        //directly setter
        public void setY(int y){ 
            this.y = y;
        }   

    }

    //Local Class
    //Method 大才有, 但通常method好少好大
    class Cat{
        private int age;

        public Cat(int age){
            this.age = age;
        }

        public int getAge(){
            return this.age;
        }


    }



    public static void main(String[] args) {

        //同Object 冇關既召喚
        DemoInnerClass.Library library = new DemoInnerClass.Library();

        //重點在右邊
        //new object
        DemoInnerClass.Student student = new DemoInnerClass().new Student();

        //obj 開obj
        DemoInnerClass dic = new DemoInnerClass();
        DemoInnerClass.Student student2 = dic.new Student(); //Not Parent-Child relationship
        //Parent has no address in past learning

        dic.setX(10);
        student.setY(20);
        dic.print(); //Outer.print(): x=10
        student.print(); //Student.print(): x=0, y=20

        ///Cat cat = new Cat(10);
        ///System.out.println(cat.getAge());

        //Anonymous Inner Class (before Java 8)
        //cant write getter
        Swimable person = new Swimable() { //Polymorphism, only call one method
            int count = 0;
            @Override
            public void swim(){
                this.count++;
                System.out.println("Anonymous object");
            }

            //public int getCount(){ //x
            //    return this.count;//x
            //}//x
        };
        //person.getCount();//cant do it due to Static Polymorphism
        //but if you create Person.Class implements Swimable, 
        //then the person object may contain additional methods
        //swimable -> person (downcount)

        //Lambda Expression (after Java 8)
        //no need to create class
        Swimable person2 = () -> System.out.println("Lambda Expression Object");

    }
//out of main

//Anonymous Inner Class
@FunctionalInterface
private static interface Swimable{
    void swim();
}

    
}



