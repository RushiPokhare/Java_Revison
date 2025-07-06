package constructor;
// accessing in subclass
class C4_Param2 {
    int id;
    String name;

    // Parameterized constructor
    C4_Param2(int i, String n) {
        this.id = i;
        this.name = n;
    }
}
class Demo{
    public static void main(String[] args) {
        C4_Param2 c=new C4_Param2(2,"Pravin");
        System.out.println(c.id+" "+c.name);
    }
}
