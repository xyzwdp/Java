package com.history.com.day2;

public class MethonDemo1 {
    public static void main(String[] args) {
        //main方法是程序的入口方法
        isEvenNumber();
    }
    //定义一个方法，在定义一个变量，判断该数据是否是偶数
    public static void isEvenNumber(){
        int number = 10;
        //number = 9;
        if (number%2==0){
            System.out.println("是偶数");
        }else {
            System.out.println(false);
        }
    }

}

