package Variables;
// Assigning value to the static variable
public class AssignValueStaticVariable {
    int id;
    String name;
    static String college;

    AssignValueStaticVariable(int id, String name, String college){
        this.id=id;
        this.name=name;
        AssignValueStaticVariable.college=college;
    }

    public static void main(String[] args) {
        AssignValueStaticVariable c =new AssignValueStaticVariable(1,"Rudra","RBNB");
        System.out.println(c.id+" "+ c.name+" "+ AssignValueStaticVariable.college);
    }
}
