package com.history.com.day3;

//调用getMax方法，获取最大值
//return
//返回当前方法的最终值，
public class MethoDemo2 {
    public static void main(String[] args) {
        int result = getMax(30,20);
        System.out.println(result);
        System.out.println(getMax(10,20));
    }
    public static int getMax(int a,int b){
        if(a > b) {
            return a;
        }else {
            return b;
        }
    }
}
