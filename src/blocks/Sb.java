package blocks;

public class Sb {
    static {
        System.out.println("This is Static Block");
    }

    Sb(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Sb s=new Sb();
    }
}
