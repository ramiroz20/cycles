package lesson3.massive;

public class hw2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5)
                System.out.print(arr[i] * 2 + " ");
            else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
