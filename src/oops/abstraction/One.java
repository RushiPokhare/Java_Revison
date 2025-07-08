package oops.abstraction;
// How to access Abstract class members
abstract class One {
    int i=10;
    int j=9;
}
class Two extends One{
    void display(){
        System.out.println(i+j);
    }
}
class Main1{
    public static void main(String[] args) {
        Two two=new Two();
        two.display();
    }
}