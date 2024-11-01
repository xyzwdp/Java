package com.history.com.Day01;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args){
         Random r = new Random();
//         for (int i=0;i<100;i++){
//             System.out.println(r.nextInt());
//         }
        for(int i=0;i<100;i++){
            //取值[0,10)
            double number=r.nextDouble();

            System.out.println("number:"+number);

        }
        //获取一个1-100之间的随机数
        //取值[0,100]
        int number=r.nextInt(100)+1;
        System.out.println("number:"+number);


    }
}
