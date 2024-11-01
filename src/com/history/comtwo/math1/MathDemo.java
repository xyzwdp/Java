package com.history.comtwo.math1;

public class MathDemo {
    public static void main(String[] args) {
        //public static int abs (int a),返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("------------------");

        //public static int ceil (double a),返回大于或等于与参数的最小double值，等于一个整数
        System.out.println(Math.ceil(13.14));
        System.out.println(Math.ceil(13.55));
        System.out.println("-----------");

        //public static int floor (doule a),返回小于或等于与参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.39F));
        System.out.println(Math.floor(12.98F));
        System.out.println("-------------");

        //public static int round (floor a),按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.50F));
        System.out.println(Math.round(12.58F));
        System.out.println(Math.round(12.49F));
        System.out.println("----------------");

        //public static int max (int a,int b),返回两个int值中的较大值
        System.out.println(Math.max(88,55));
        System.out.println("------------");
        //public static int min (int a,int b),返回两个int值中的较小值
        System.out.println(Math.min(99,23));
        System.out.println("------------");
        //public static double pow (double a,double b),返回a的b次幂的值
        System.out.println(Math.pow(2,3));
        System.out.println("------------------");

        //public static double random (),返回值位double的正值[0.0,1.0)
        System.out.println(Math.random());
        //强转int类型数值[0,100]
        System.out.println((int)(Math.random()*100)+1);
    }

}
