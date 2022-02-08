package ru.cycles.com;

public class cycles {


    static void showBrackets(int n) {
        int i;
        for (i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print('(');
            }
        }

        for (int j = 0; j < i + 1; i++) {
            System.out.print(')');
            break;
        }
    }


    public static void main(String[] args) {
        showBrackets(5);
    }
}