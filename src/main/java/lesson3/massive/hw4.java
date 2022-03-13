package lesson3.massive;

public class hw4 {
    static char[][] star(int n) {

        char[][] t = new char[n][n];
        if (n % 2 == 1) {

            int start = 1;


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    t[i][j] = '2';

                }
                start+=2;

                for (int j = n - i - start; j < n; j++) {
                    for ( i = j; i < n; i++) {
                        t[i][j] = '*';
                    }
                    start+=2;
                }
            }
        }

        return t;

    }

    public static void main(String[] args) {
        char[][] ans = star(5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }

}