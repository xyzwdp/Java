package com.history.com.day4;

//需求：设计一个方法，用于比较两个数组的内容是否相同
/*思路：1、定义两个数组，分别使用静态初始化完成数组元素的初始化
2、定义一个方法，用于比较两个数组的内容是否相同
返回值类型：boolean
参数：int arr1[],int arr2[]
3、比较两个数组的内容是否相同，按照下面的步骤就可以实现了
    首先比较数组长度，如果长度不同，数组肯定就不相同了
    其次遍历，比较两个数组中的每一个元素，只要有元素不相同，返回false
    最后循环遍历结束后，返回true
4、调用方法，用变量接收
5、输出结果    */
public class TestArray2 {
    public static void main(String[] args) {
        int[] arr1={11,21,33,44,55};
        int[] arr2={11,21,33,44,55};
        boolean flag = compare(arr1,arr2);
        System.out.println(flag);
    }
    public static boolean compare(int[] arr1,int[] arr2){
        //执行了return，返回该值，直接此方法

        if (arr1.length!=arr2.length){
            return false;
        }
        for (int x=0;x<arr1.length;x++){
            if (arr1[x]!=arr2[x]){
                return false;
            }
        }
        return true;
    }
}
