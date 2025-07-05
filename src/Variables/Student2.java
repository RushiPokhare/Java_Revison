package Variables;

// Static Variable
public class Student2 {
    int id;
    String name;
    static String College="Sanjivani K, B, P";

    public static void main(String[] args) {
        Student s1=new Student();
        s1.id=1;
        s1.name="Rushi";

        System.out.println(s1.id+" "+s1.name+" "+Student2.College);
    }
}
