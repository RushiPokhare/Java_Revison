package constructor;

public class C5_ParamZero {
    int id;
    String name;
    static String college="SKBP";

    C5_ParamZero(){
        System.out.println("Default constructor");
    }

    C5_ParamZero(int id,String name){
        this.id=id;
        this.name=name;
    }

    public static void main(String[] args) {
        C5_ParamZero c =new C5_ParamZero();

        C5_ParamZero c1 =new C5_ParamZero(1,"Rudra");
        System.out.println(c1.id+" "+ c1.name+" "+C5_ParamZero.college);
    }
}
