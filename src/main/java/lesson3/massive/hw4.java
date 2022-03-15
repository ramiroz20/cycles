package lesson3.massive;


import java.util.Arrays;

public class hw4 {

    static char[][] star() {

        char[][] t = new char[8][8];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i - 1; j++) {
                t[i][j] = '*';
                System.out.println(Arrays.deepToString(new char[][]{new char[]{t[i][j]}})
                        + " " + i + " " + j);




                for (i = j; i < 8; i++) {
                    for (j = 0; j < 8; j++) {
                        if (j == 8 - i - 1 || i == j) {
                            t[i][j] = '*';
                            System.out.println(Arrays.deepToString(new char[][]{new char[]{t[i][j]}})
                                    + " " + i + " " + j);
                        } else {
                            t[i][j] = ' ';


                            System.out.println(Arrays.deepToString(new char[][]{new char[]{t[i][j]}})
                                    + " " + i + " " + j);

                        }
                    }




                }
            }
        }
        return t;
    }

    public static void main(String[] args) {
        char[][] ans = star();
        for (int j = 0; j < ans.length; j++) {
            for (char[] an : ans) {
                System.out.print(an[j]);
            }
            System.out.println();
        }
    }
}

