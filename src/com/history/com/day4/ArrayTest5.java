package com.history.com.day4;

import java.util.Scanner;

/*需求：在编程竞赛中，有6个评委参赛的选手打分，分数为0-100的整数分
选手的最后得分为：去掉一个最高分何一个最低分的4个评委平均值（不考虑小数部分）*/

/*思路：1、定义一个数组，用动态初始化完成数组元素的初始化，长度为6
    2、键盘录入评委分数
    3、由于是6个评委打分，所以，接收评委分数的操作，用循环改进
    4、定义方法实现获取数组中的最高分（数组最大值），调用方法
    5、定义方法实现获取数组中的最低分（数组最小值），调用方法
    6、定义方法实现获取数组中的所有元素的和（数组元素求和），调用方法
    7、按照计算规则进行计算得到平均分
    8、输出平均分*/

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);
/*        System.out.println("请输入第一个评委打分：");
        arr[0]=sc.nextInt();*/
        for (int x = 0; x < arr.length; x++) {
            System.out.println("请输入第" + (x + 1) + "个评委打分：");
            arr[x] = sc.nextInt();
        }
        printArray(arr);
        int max= getMax(arr);
        System.out.println("最高分值是："+max);

        int min = getMin(arr);
        System.out.println("最低分值是"+min);

        int sum = getSum(arr);
        System.out.println("分数和是："+sum);

        int avg=(sum-max-min)/(arr.length-2);
        System.out.println("选手的平均分值是："+avg);

    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }

    public static int getSum(int[] arr){
        int sum=0;
        for (int x=0;x<arr.length;x++){
            sum+=arr[x];
        }
        return sum;
    }


    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int x = 0; x < arr.length - 1; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        System.out.println("]");
    }

}
