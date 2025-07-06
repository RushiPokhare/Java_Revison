package constructor;

public class C2_ZeroParam {
    int id;
    String name;

    C2_ZeroParam(){
        id=20;
        name="Sakshi";
    }

    public static void main(String[] args) {
        C2_ZeroParam c=new C2_ZeroParam();
        System.out.println(c.id+"  "+c.name);

        C2_ZeroParam c1=new C2_ZeroParam();
        System.out.println(c1.id+" "+c1.name);
    }
}
