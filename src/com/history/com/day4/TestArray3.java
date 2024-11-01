package com.history.com.day4;

/*需求：已知一个数组 arr = {19,28,37,46,50}; 键盘录入一个数据，
        查找该数据在数组中的索引，并在控制台输出找到的索引值。*/

import java.util.Scanner;

public class TestArray3 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个需要查找的元素：");
        int number = sc.nextInt();

        /*int index = -1;

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == number) {
                index = x;
                break;
            }
        }*/
        int index = getIndex(arr, number);
//        String result;
//        if (index!=-1){
//            result=""+index;
//        }else {
//            result = "未找到";
//        }
        int result;
        result = index == -1 ? index  : -1;
        System.out.println("index为："+result );
    }

    public static int getIndex(int[] arr, int number) {
        int index = -1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == number) {
                index = x;
                break;
            }
        }
        return index;
    }
}
