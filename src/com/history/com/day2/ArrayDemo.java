package com.history.com.day2;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] arr = new int[3];
        int [] arr1 = new int[3];
        /*char i = 'a';
        int t=(int)i;
        System.out.println(t);
        System.out.println(i);*/
        /*
            左边：
                int：说明数组中的元素类型是int类型
                []：说明这是一个数组
                arr：这是数组名称
            右边：
                new：为数组申请内存空间
                int：说明数组中元素为int类型
                []：说明这是一个数组
                3：数组长度，其实就是数组中的元素个数

        */

        //数组默认值为0

        System.out.println(arr);//[I@1b6d3586
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr1);
        System.out.println("---------------");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

        arr [0]=100;
        arr [1]=200;
        arr1 [0]=300;
        arr1 [2]=400;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
