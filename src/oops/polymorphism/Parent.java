package oops.polymorphism;

// Java Program for Method Overriding
class Parent {
    void Print() {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {
    void Print() { 
      System.out.println("subclass1"); 
    }
}

class subclass2 extends Parent {
    void Print() {
        System.out.println("subclass2");
    }
}


class Geeks {
    public static void main(String[] args) {

        // Creating object of class 1
        Parent a;
        a = new subclass1();
        a.Print();

        a = new subclass2();
        a.Print();
    }
}