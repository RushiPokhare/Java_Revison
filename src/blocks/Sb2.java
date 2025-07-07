package blocks;

public class Sb2 {
   static int i;

   static{
       i=10;
       System.out.println("This is static block");
   }

   Sb2(){
       System.out.println("This is Constructor");
   }

    public static void main(String[] args) {
        Sb2 sb=new Sb2();
        Sb2 sb1=new Sb2();
        System.out.println(Sb2.i);
    }
}
