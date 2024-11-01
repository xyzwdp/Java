package com.history.comtwo.arrysort1;

/*
包含用于操作数组的各种方法

toString
        返回指定数组的内容的字符串形式
sort
        按照梳子顺序排列指定的数组
*/

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr={24,98,156,98,132};

        System.out.println("排序前："+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("排序后："+Arrays.toString(arr));

        //Math;
        //System;
    }
}
