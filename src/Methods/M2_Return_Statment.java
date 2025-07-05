package Methods;

public class M2_Return_Statment {
    public int add(int a,int b){
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        M2_Return_Statment m=new M2_Return_Statment();
        int result=m.add(3,4);
        System.out.println(result);
    }
}
