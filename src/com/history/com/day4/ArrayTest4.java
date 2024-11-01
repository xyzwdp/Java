package com.history.com.day4;

/*需求：已知一个数组 arr = {19,28,37,46,50}; 用户程序实现吧数组中的元素值交换
    交换后的数组 arr = {50,46,37 28,19}; 并在控制台输出交换后的数组*/

/*思路：
1、定义一个数组，用静态初始化完成数组的初始化
2、循环遍历数组，这一次舒适化语句定义两个索引变量，判断条件是开始索引小于灯具结束索引
3、变量交换
4、变量数组
*/

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        System.out.println(arr);

        //遍历数组
        reverse(arr);
        //System.out.println(arr);
        //System.out.println(reverse(arr = new int[]{19, 28, 37, 46, 50}));
        printArray(arr);
    }

    public static void reverse(int[] arr){
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            //变量交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    /*两个明确：
        返回值类型：void
        参数：int[] arr*/
    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        System.out.println("]");
    }
}
