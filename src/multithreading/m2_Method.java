package multithreading;

<<<<<<< HEAD
=======
public class m2_Method extends Thread{
>>>>>>> bc1844a (array program)
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Hii");
        }
    }
}
<<<<<<< HEAD
=======
class Demo2 extends Thread{
>>>>>>> bc1844a (array program)
    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        m2_Method m2Method=new m2_Method();
        Demo2 demo2=new Demo2();

        m2Method.start();
        Thread.sleep(5000); //Always access by the thread class .. because it is a static methods
        Thread.yield();
        demo2.start();
    }
}
