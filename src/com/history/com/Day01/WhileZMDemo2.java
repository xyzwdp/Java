package com.history.com.Day01;

public class WhileZMDemo2 {
    public static void main(String[] args){
        //珠穆朗玛峰为8844430毫米，我有一张足够大的纸，厚度为0.1毫米，最多折叠多少次可以达到珠穆朗玛峰高度
        double i=0.1;
        int count=0;
        while (i<8844430){
            count++;
            i *=2;
        }
        System.out.println("折叠高度为："+i);
        System.out.println("共折叠了"+count+"次达到珠穆朗玛峰高度");
    }
}
