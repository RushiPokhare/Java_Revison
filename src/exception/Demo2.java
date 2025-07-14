package exception;
//Exception occur in try block is not handle in catch block

public class Demo2 {
    public static void main(String[] args) {
        int[] arr=new int[4];
        try {
            System.out.println(arr[4]);
            System.out.println("Inside the try block");
        } catch (NullPointerException e) {  //this is a mismatch exception or this is wrong exception
            System.out.println("Null Pointer Exception"+e);
            System.out.println("Inside a catch block");
        }
        finally {
            System.out.println("finally block executed");
        }

        System.out.println("Rest of the code");
    }
}
