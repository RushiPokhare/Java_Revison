package array;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr={10,45,26,56,75,32};
        int element=32;
        boolean isFound=false;
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(element==arr[i]){
                isFound=true;
                index=i;
                break;
            }
        }
        System.out.println(isFound?"Element Found at index->"+index:"not found");
    }
}
