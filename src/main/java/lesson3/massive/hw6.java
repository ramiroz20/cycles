package lesson3.massive;

public class hw6 {
    public static class hw5 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 5, 5, 6, 23};

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 1) {
                    System.out.println(arr[i] + " - Больше двух");
                    if (arr[i] < 4) {
                        System.out.println(arr[i] + " - число меньше 5ти");
                    }
                }

            }
        }
    }
}
