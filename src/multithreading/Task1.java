package multithreading;

public class Task1 extends Thread{
    @Override
    public void run() {
            for (int i=0;i<=100;i++){
                System.out.println("Hii");
            }
    }
}

class Task2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        Task2 task2=new Task2();
        task1.start();
        task2.start();
    }
}

