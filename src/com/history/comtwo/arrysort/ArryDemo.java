package com.history.comtwo.arrysort;

public class ArryDemo {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {25,78,3,84,2,11,25};
        System.out.println("排序前："+arrayToSting(arr));

        /*//第一次比较
        for(int i=0;i<arr.length-1-0;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("第一次比较结果："+arrayToSting(arr));

        //第二次比较
        for(int i=0;i<arr.length-1-1;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("第二次比较结果："+arrayToSting(arr));

        //第三次比较
        for(int i=0;i<arr.length-1-2;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("第三次比较结果："+arrayToSting(arr));

        //第四次比较
        for(int i=0;i<arr.length-1-3;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("第四次比较结果："+arrayToSting(arr));

        //第五次比较
        for(int i=0;i<arr.length-1-5;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("第五次比较结果："+arrayToSting(arr));

        //第六次比较
        for(int i=0;i<arr.length-1-6;i++){
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("第六次比较结果："+arrayToSting(arr));*/

        for (int x=0;x<arr.length-1;x++){
            //第一次比较
            for(int i=0;i<arr.length-1-x;i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            //System.out.println("第"+(x+1)+"次比较结果："+arrayToSting(arr));
        }
        System.out.println("排序后："+arrayToSting(arr));
    }

    //把数组中的元素按指定的规则组成一个字符串[元素1,元素2,....]
    public static String arrayToSting(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length;i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            }else {
               sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
