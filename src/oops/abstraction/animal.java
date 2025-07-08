package oops.abstraction;
//Constructor in Abstraction / inheritance in abstract class
abstract class animal {
    String name;

    animal(String name){
        this.name=name;
        System.out.println("animal Constructor called  "+name);
    }
}

class Dog extends animal{
    String name;
    Dog(String name){
        super(name);
        System.out.println("Dog Constructor Called  "+name);
    }
}

class Main{
    public static void main(String[] args) {
        Dog d= new Dog("Sheru");
    }
}