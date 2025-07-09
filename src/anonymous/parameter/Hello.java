package anonymous.parameter;

//Anonymous Class with Method Parameter

public interface Hello {
    void show(int i,int j);
}

class Application{
    public static void main(String[] args) {
        Hello hello=new Hello() {
            @Override
            public void show(int i, int j) {
                System.out.println("Anonymous Class With Parameter ->"+i+j);
            }
        };
        hello.show(3,5);
    }
}