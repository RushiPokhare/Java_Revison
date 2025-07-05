package Variables;
// This is an instance Variable
public class Student {
    int id;
    String name;

    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=1;
        s1.name="aniket";
        System.out.println(s1.id+" "+s1.name);


        Student s2=new Student();
        s2.id=2;
        s2.name="Rushi";
        System.out.println(s2.id+" "+s2.name);
    }
}
