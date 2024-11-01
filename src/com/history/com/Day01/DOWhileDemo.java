package com.history.com.Day01;

public class DOWhileDemo {
    public static void main(String[] args){
        //do...while语句打印5次HelloWord
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

        System.out.println("------------------");
        //do..while循环语句
        int i=1;
        do {
            System.out.println("HelloWord");
            i++;
        }while (i<=5);
    }
}
