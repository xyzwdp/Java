package com.now.one;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        //先进行自增或者自减运算，再进行表达式运算
        System.out.println("d++   = " +  (d++) );
        System.out.println(d);
        //先进行表达式运算，再进行自增或者自减运算
        System.out.println("++d   = " +  (++d) );
    }
}