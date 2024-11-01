package com.history.com.day2;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33,44};
        for (int i = 0; i < 4; i++){
            System.out.println(arr[i]);
        }

        System.out.println("----------------------------");

        //arr1.length:获取数组长度
        int[] arr1 = {11, 22, 33,44,55};
        System.out.println(arr1.length);
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
