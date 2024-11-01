package com.history.com.Day01;

/*
输出所有的“水仙花数”。所谓“水仙花数”是指一个3位数，其各位数字立方之和等于该数本身。
        例如，153是一个水仙花数，因为153=1³+5³＋3³
*/

public class SXHSDemo {
    public static void main(String[] args){
        //求水仙花数
        int count = 0;
        for (int i=100;i<1000;i++){
            int a=i%10;//求个位数
            int b=i/10/10%10; //求百位数
            //求十位数
            int j=i/10;
            //System.out.println(j);
            int c=i/10%10;

            if (i == a*a*a+b*b*b+c*c*c){
                count++;
                System.out.println("第"+count+"个水仙花数为："+i);
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("水仙花个数为:"+count+"个");
    }
}
