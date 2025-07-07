package single;
// Single inheritance
public class One {
    void display(){
        System.out.println("This Method From Class  -> One");
    }
}

class Two extends One{
    void show(){
        System.out.println("This Method From Class -> Two");
    }
}

class Main{
    public static void main(String[] args) {
        Two two=new Two();
        two.display();
        two.show();
    }
}