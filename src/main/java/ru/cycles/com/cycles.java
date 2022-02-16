package ru.cycles.com;



public class cycles {


    static char[][] star(int n) {
        if (n % 2 == 1) {
            int start = 1;
            char[][] t = new char[n][n];
            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < (n - start) / 2; j++) {
                    t[i][j] = '.';
                }
                for (int j = (n - start) / 2; j < start; j++) {
                    t[i][j] = '*';

                }
                for (int j = (n - start) / 2 + start; j < n;
                     j++) {
                    t[i][j] = '.';
                }
                start++;

            }
        }
        return new char[5][5];
    }

    public static void main(String[] args) {
        char[][] ans = star(5);
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println(ans[i][j]);
            }
            System.out.println();
        }
    }
}


















