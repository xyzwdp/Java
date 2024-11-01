package com.now.one;

public class DoWhile {
    public static void main(String[] args) {
        int a = 10, b = 12;
        do {
            ++a;
            //a++;
        } while (a <= b);
        System.out.println("a为：" + a);
    }

}
