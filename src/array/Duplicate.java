package array;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 60};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                }
            }
        }
    }
}
