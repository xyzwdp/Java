package com.history.com.day2;

public class MethonDemo3 {
    public static void main(String[] args) {
        //变量直接调用
        //数值直接调用
        isEvenNumber(99);
        //isEvenNumber(77,55);
        int number = 66;
        isEvenNumber(number);
        System.out.println("===================");

        //多个变量直接调用
        //方法调用时，形参类型与数量必须要对应
        isEvenNumber1(77,55);
        int number1 = 22;
        int number2 = 33;
        isEvenNumber1(number1,number2);
    }

    public static void isEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("number是一个偶数：" + number);
        } else {
            System.out.println("number不是一个偶数：" + number);
        }
    }

    public static void isEvenNumber1(int number1, int number2) {
        if (number1 % 2 == 0) {
            System.out.println("number1是一个偶数：" + number1);
        } else {
            System.out.println("number1不是一个偶数：" + number1);
        }

        if (number2 % 2 == 0) {
            System.out.println("number2是一个偶数：" + number2);
        } else {
            System.out.println("number2不是一个偶数：" + number2);
        }
    }

}
