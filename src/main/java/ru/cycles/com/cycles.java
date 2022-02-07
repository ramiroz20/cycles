package ru.cycles.com;

public class cycles {
    static void showDigits(int n) {
        int start = 1;
        while (start <= n)
            System.out.println(start + " ");
        start++;
    }




    public static void main(String[] args) {
        showDigits(7);
    }
}