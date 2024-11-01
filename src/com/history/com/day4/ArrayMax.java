package com.history.com.day4;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {13, 56, 85, 2, 66, 9, 66, 45};
        int result = getMax(arr);
        System.out.println(result);
        System.out.println(getMax(arr));

    }

    /*
        两个明确：
            返回值类型：int
            参数：int[] arr
    */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
}
