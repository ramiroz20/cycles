package lesson3.massive;

import java.util.Arrays;

public class hw7 {

    static boolean checkBalance(int array[]) { // работает линейно относительно этого массива
        int fullSum = 0;
        int leftSum = 0;
        for (int i : array) fullSum += i; //итерируемся по массиву и складываем в эту сумму
        for (int i = 0; i < array.length; i++) { //нужны позиции по массиву
            leftSum += array[i];
            if (fullSum == 2 * leftSum) { // подобная сумма если и есть четная величина
                int[] left = new int[i + 1], right = new int[array.length - i - 1];
                for (int j = 0; j <= i; j++) {
                    left[j] = array[j];
                }
                for (int j = i + 1; j < array.length; j++) {
                    right[j - i - 1] = array[j]; // j - большое число
                    System.out.printf("full array = %s\n" + "left = %s\n" + "right = %s\n" + "sum = %d\n", Arrays.toString(array),
                            Arrays.toString(left),
                            Arrays.toString(right), leftSum); //вывели индекс i сумму
                    return true;
                }
            }


        }
        return false;
    }



        public static void main (String[]args) {
            checkBalance(new int[]{1, 3, 4, 1, 1, 5, 1});
        }
    }
