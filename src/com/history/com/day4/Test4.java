package com.history.com.day4;

    /*
    需求：不死神兔
        有一对兔子，从出生后第三个月起每个月生一对兔子，
        小兔子长大到第三个月后每个月又生一对兔子，
        加入兔子不死，问第二十个月的兔子对数是多少
    规律：从第三个数据开始，每个数据都是前两个数据之和
        第一个与第二个数据是已知的
        fn=f(n-1)+f(n-2)
    */
public class Test4 {
        public static void main(String[] args) {
            int[] arr = new int[20];
            arr[0]=1;
            arr[1]=1;
            for (int x=2;x<arr.length;x++){
                arr[x]=arr[x-2]+arr[x-1];
            }
            System.out.println("第20个月兔子数量为："+arr[19]);
        }
}
