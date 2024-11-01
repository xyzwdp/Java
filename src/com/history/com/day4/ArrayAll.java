package com.history.com.day4;

public class ArrayAll {
    public static void main(String[] args) {
//        System.out.println("hello");
//        System.out.println("world");
//
//        System.out.print("hello");
//        System.out.print("world");
//        System.out.println();

        //形参为数组，那实参也必须是数组
        int[] arr = {11,22,33,44,55,66};
        printArray(arr);
    }
    /*两个明确：
        返回值类型：void
        参数：int[] arr*/
/*    public static void printArray(int[] arr){
        for (int x = 0;x < arr.length;x++){
            System.out.println(arr[x]);
        }
    }*/

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
                //System.out.println(arr[x]);
            }
        }
        System.out.print("]");
    }
}
