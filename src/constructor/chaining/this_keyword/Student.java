package constructor.chaining.this_keyword;
// Constructor chaining in same class (this)
public class Student {
    int id;
    String name;
    String course;

    Student(){
        this(1);
        System.out.println("No Argument Constructor");
    }

    Student(int id){
        this.id=id;
        this.name="Aniket";
        this.course="java";
        System.out.println("\n**oops.multilevel.One Argument Constructor");
    }

    Student(int id,String name){
        this.id=id;
        this.name=name;
        this.course="Python";
        System.out.println("\n**Two Argument Constructor");
    }

    Student(int id,String name,String course){
        this.id=id;
        this.name=name;
        this.course=course;
        System.out.println("\n**Three Argument Constructor");
    }

    public void show(){
        System.out.println("Id is --> "+ id + "\nName is --> "+ name+ "\nCourse is -->"+course);
    }



    public static void main(String[] args) {
        Student s=new Student(4,"Rohan");
        s.show();

        Student s1=new Student(5);
        s1.show();
    }
}
