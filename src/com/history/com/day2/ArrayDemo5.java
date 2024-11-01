package com.history.com.day2;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] arr = {12, 4, 55, 5, 89, 99, 111, 34};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] < min){
//                min = arr[i];
            min = arr[i] < min ? arr[i] : min;
        //}
    }
        System.out.println("最小值为："+min);

}}