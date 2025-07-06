package constructor;

// This is a default constructor thy provide dummy default value and this constructor provided by java compilercompiler
public class C1_Default {
    int id;
    String name;

    public static void main(String[] args) {
        C1_Default c1=new C1_Default(); //Compiler-provided default constructor is called
        System.out.println(c1.id+" "+c1.name);
    }
}

/*You did not define any constructor yourself in C1_Default.
So the Java compiler adds this behind the scenes:

public C1_Default() {
    super();  // calls Object class constructor
}









You created an object:

C1_Default c1 = new C1_Default();
Java uses the default constructor to create the object.

Then you printed:
System.out.println(c1.id + " " + c1.name);
Since id and name are not initialized, they take default values:

int → 0

String → null
 */