package Methods;

public class M1_MethodCall {
    int s=0;

    public int add(int a,int b){
        s=a+b;
        System.out.println("sum is ="+s);
        return s;
    }
}
class addition{
    public static void main(String[] args) {
        M1_MethodCall m1=new M1_MethodCall();
        int sum=m1.add(2,3);
        System.out.println("returned result is ="+sum);
    }
}
