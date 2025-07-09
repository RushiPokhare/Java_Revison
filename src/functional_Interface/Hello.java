package functional_Interface;

//Functional Interface

@FunctionalInterface
public interface Hello {
    void show();
}

class Application{
    public static void main(String[] args) {
        Hello hello=()->System.out.println("We can override or write won logic through an interface through LAMBDA");
        hello.show();
    }
}