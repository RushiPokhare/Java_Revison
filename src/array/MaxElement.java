package array;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={10,20,384,21,33,64,32,};
        int maxElement=Integer.MIN_VALUE;

        for (int temp:arr){
            if (temp>maxElement){
                maxElement=temp;
            }
        }
        System.out.println("Maximum Number is "+maxElement);
    }
}
