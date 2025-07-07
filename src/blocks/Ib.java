package blocks;

public class Ib {
    static{
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    Ib(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Ib ib=new Ib();
        Ib ib1=new Ib();
    }

}
