package exception;
//Exception don't occur in try block

public class Demo3 {
    public static void main(String[] args) {
        try {
            String str="123";
            int num=Integer.parseInt(str);  // not an exception in try block
            System.out.println("Try block Fully Executed");
        } catch (NumberFormatException e) {
            System.out.println("catch block executed");
        }

        finally {
            System.out.println("Finally Block");
        }
        System.out.println("Rest of the code");
    }
}
