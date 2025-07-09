package functional_Interface.parameter;

//Functional Interface with Method Parameter

@FunctionalInterface
public interface Hello {
    void show(int i,int j);
}

class Application{
    public static void main(String[] args) {
        Hello hello=(int i,int j)->System.out.println("We can override or write won logic through an interface through LAMBDA->"+i+j);
        hello.show(3,5);
    }
}