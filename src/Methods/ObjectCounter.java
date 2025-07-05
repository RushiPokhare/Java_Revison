package Methods;

public class ObjectCounter {
    static int count=0;

    ObjectCounter(){
        count++;
    }

    public static void main(String[] args) {
        ObjectCounter d1=new ObjectCounter();
        ObjectCounter d2=new ObjectCounter();
        System.out.println(count);
    }
}
