package constructor.chaining.super_keyword;

public class Person {
    String name;

    Person(String name){
        this.name=name;
        System.out.println("Person constructor called. Name: " + name);
    }
}

class Students extends Person{

    int id;
    Students(int id,String name){
        super(name);
        this.id=id;
        System.out.println("Student constructor called. ID: " + id);
    }

    void display(){
        System.out.println("Student Info"+id+"  "+name);
    }
    public static void main(String[] args) {
        Students s=new Students(1,"Rudra");
        s.display();
    }
}
