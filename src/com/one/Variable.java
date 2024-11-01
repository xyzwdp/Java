package com.one;

public class Variable {
    public static void main(String[] args) {
        int a = 10, b = 20;
        swap(a, b);
        System.out.println("a=" + a + ",b=" + b);
    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Inside the swap method: a = " + x + ", b = " + y);
    }
}
