package com.history.com.Day01;

public class WhileDemo1 {
    public static void main(String[] args){
        //在控制台中打出5个“HelloWord”
        //for 循环语句
        for (int i=1; i<=5;i++){
            System.out.println("HelloWord");
        }
        System.out.println("----------------------");

        //while循环语句
        int j=1;
        while (j<=5){
            System.out.println("HelloWord");
            j++;
        }
    }
}
