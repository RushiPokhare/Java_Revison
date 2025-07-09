package anonymous;

//Anonymous Class With Interface

public interface Hello {
    void show();
}

class Application{
    public static void main(String[] args) {
        Hello hello=new Hello() {
            @Override
            public void show() {
                System.out.println("We can override or write won logic through an interface");
            }
        };
        hello.show();
    }
}