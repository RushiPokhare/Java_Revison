package exception;
//Exception occur in try block handle in catch block
public class Demo1 {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            System.out.println("Inside a Try");
        } catch (ArithmeticException e) {
            System.out.println("Exception Handled"+e);
            System.out.println("Inside a Catch");
        }
        System.out.println("Rest of the code");
    }
}
