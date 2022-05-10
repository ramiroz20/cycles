package lesson4.game;

import java.util.Random;
import java.util.Scanner;

public class hw1 {

    private static int stepCounter = 0;
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final char DASH = '_';
    private static final Random rnd = new Random();

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер поля");
        int SIZE = in.nextInt();
        char[][] map = new char[SIZE][SIZE];
        initTable(map);
        boolean inStart = true;
        while (true) {
            System.out.println("Введите номер строки и номер столбца для входа");
            print(map);
            int x = in.nextInt(), y = in.nextInt();
            x--;
            y--;
            if (isValidStep(x, y, map)) {
                map[x][y] = DOT_X;
                stepCounter++;

                if (isWin(DOT_X, map)) {
                    print(map);
                    System.out.println("Вы победили!");
                    return;
                }

            }
            stepCounter++;
            if (stepCounter == SIZE * SIZE) {
                print(map);
                System.out.println("Ничья");
                return;
            }

            movePc(map);
            System.out.println("Ход противника");
            for (int i = 0; i < 7; i++) {
                System.out.print(" * ");
                Thread.sleep(500);
            }
            System.out.println();


                if (isWin(DOT_0, map)) {
                    print(map);
                    System.out.println("Противник победил");
                    return;
                }

            }

        }


    private static void movePc(char[][] map) {
        while (true) {
            int x = rnd.nextInt(map.length), y = rnd.nextInt(map.length);
            if (isValidStep(x, y, map)) {
                map[x][y] = DOT_0;
                stepCounter++;
                return;
            }
        }
    }


    private static boolean isValidStep(int x, int y, char[][] map) {
        int SIZE = map.length;
        if (x >= 0 && x < SIZE && y >= 0 && y < SIZE) {

            return map[x][y] == DASH;
        }

        return false;
    }


    private static void print(char[][] map) {
        System.out.print("   ");
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print("|" + map[i][j]);
            }

            System.out.println("|");
        }
    }


    private static void initTable(char[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DASH;

            }
        }
    }


    private static boolean isWin(char ch, char[][] map) {

        for (int i = 0; i < map.length; i++) {
            int sx = 0, sy = 0, d1 = 0, d2 = 0;
            for (int j = 0; j < map.length; j++) {
                sx += map[i][j] == ch ? 1 : 0;
                sy += map[j][i] == ch ? 1 : 0;
                d1 += map[j][j] == ch ? 1 : 0;
                d2 += map[j][map.length - i - 1] == ch ? 1 : 0;
                if (sx == map.length || sy == map.length || d1 == map.length
                        || d2 == map.length) {
                    return true;
                }
            }
        }
        return false;
    }

}



