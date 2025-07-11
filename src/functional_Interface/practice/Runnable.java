package functional_Interface.practice;

@FunctionalInterface
public interface Runnable {
    void run();
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Method are Overridden");
    }
}
