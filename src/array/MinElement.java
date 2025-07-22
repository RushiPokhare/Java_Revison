package array;

public class MinElement {
    public static void main(String[] args) {
        int [] arr={120,231,213,435,45,432};
        int minimum=Integer.MAX_VALUE;

        for (int temp:arr){
            if (temp<minimum){
                minimum=temp;
            }
        }
        System.out.println(minimum);
    }
}
