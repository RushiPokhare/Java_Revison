package Variables;

//s1.id = 1;
//s1.name = "Rushi";
//works — but for many objects or bigger programs, it becomes repetitive and harder to maintain.That’s where constructors and methods help.

public class Student3 {
    int id;
    String name;
    static String college="MCERC";

    Student3(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+"  "+name+" "+Student3.college);
    }

    public static void main(String[] args) {
        Student3 s1=new Student3(1,"Rushi");
        s1.display();

        Student3 s2=new Student3(2,"Aniket");
        s2.display();
    }
}
