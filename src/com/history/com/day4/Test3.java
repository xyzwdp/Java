package com.history.com.day4;

//输入[1,100]包含7与7倍数所有的数

public class Test3 {
    public static void main(String[] args) {
        //  || 短路或
        System.out.print("(");
        for (int i =1;i<=100;i++){
            if (i%7==0 || i/10%10==7 || i%10==7){
                System.out.print(i + ",");
                /*for (int x = 0; x <= 100; x++) {
                    if (x == arr.length - 1) {
                        System.out.print(arr[x]);
                    } else {
                        System.out.print(i + ",");
                    }
                }*/
                //System.out.println(i);
            }
        }
        System.out.println(")");
    }
}
