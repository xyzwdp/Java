package com.one;

public class LogicalOperation {
    //逻辑运算符
    //短路逻辑运算符
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("a&&b=" + (a && b));
        System.out.println("a|b=" + (a | b));
        System.out.println("!(a&&b)=" + (!(a && b)));
        System.out.println("a&b=" + (a & b));
    }


}
