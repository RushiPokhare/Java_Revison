package oops.polymorphism;
//Method Overloading
public class A {
    void show(int a, int b){
        System.out.println(a+b);
    }

    void show(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        A a=new A();
        a.show(1,2);
        a.show(2,5,6);
    }
}
