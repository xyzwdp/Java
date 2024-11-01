package com.history.com.day3;

public class MethoDemo5 {
    public static void main(String[] args) {
        //调用方法
        //强转数据类型
        boolean result1 = compare(10, 20);
        System.out.println(result1);

        boolean result2 = compare1((byte) 20, (byte) 10);
        System.out.println(result2);

        boolean result3 = compare((short) 10, (short) 20);
        System.out.println(result3);

        boolean result4 = compare5((long) 15, (long) 15);
        System.out.println(result4);

        boolean result5 = compare5(10, 20);
        System.out.println(result5);
    }

    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    public static boolean compare1(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    public static boolean compare(short a, short b) {
        System.out.println("shout");
        return a == b;
    }

    public static boolean compare5(long a, long b) {
        System.out.println("long");
        return a == b;
    }
}
