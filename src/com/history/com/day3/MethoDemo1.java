package com.history.com.day3;

public class MethoDemo1 {
    public static void main(String[] args) {
        //用变量接收值
        boolean flag = isEvenNumber(10);
        System.out.println(flag);
    }
    public static boolean isEvenNumber(int number){
        //方法类型与数据返回类型必须一致
        if (number%2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
