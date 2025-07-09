package anonymous;
// WE can Create the Anonymous class-> of Interface, Concrete Class or an abstract class

//Here we create Concrete class with Anonymous class
public class Greeting {
    void greet(){
        System.out.println("Hello This is Concrete Class");
    }
}
class App{
    public static void main(String[] args) {
        Greeting greeting=new Greeting(){
            @Override
            void greet() {
                System.out.println("Hello From Concrete class");
            }
        };
        greeting.greet();
    }
}