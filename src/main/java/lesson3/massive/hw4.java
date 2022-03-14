package lesson3.massive;


import java.util.Arrays;

public class hw4 {

    static char[][] star(int n) {

        char[][] t = new char[n][n];

        int j;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i > j)
                    t[i][j] = '*';
                System.out.println(Arrays.deepToString(new char[][]{new char[]{t[i][j]}})
                        + " " + i + " " + j);
                if (i < j) {
                    t[i][j] = '1';
                }else {
                    t[i][j] = '*';

                }
            }
            System.out.println();
        }


            return t;
        }

        public static void main (String[]args){
            char[][] ans = star(6);
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans.length; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
        }
    }
