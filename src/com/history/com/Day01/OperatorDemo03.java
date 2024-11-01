package com.history.com.Day01;

//++i与i++的区别
//自增自减运算符
//	++与-- 既可以放在变量后边，也可以放在变量前边
//	单独使用的时候，++与--放在前边与后边，结果都是一样的
//	参与操作的时候，如果放在变量的后边，先拿变量进行赋值，后拿变量运算
//	参与操作的时候，如果放在变量的前边，先拿变量进行运算，后拿变量赋值
//	j=i++
//		先赋值，再计算
//	j=++i
//		先计算，再赋值

public class OperatorDemo03 {
    public static void main(String[] args) {
        //定义变量
        int i = 10;
        System.out.println("i1:" + i);

        //单独使用
        ++i;
        System.out.println("i2:" + i);
        int a = 10;
        int x = a++;
        System.out.println("a:" + a);
        System.out.println("x:" + x);

        //参与操作使用
        //先把b的值赋值给c
        int b = 10;
        int c = b++;
        System.out.println("b:" + b);
        System.out.println("c:" + c);

        int d = 10;
        int e = ++d;
        System.out.println("d:" + d);
        System.out.println("d:" + e);

        //先计算再赋值
        /*int j=++i;
        System.out.println("i:"+i);
        System.out.println("j:"+j);*/
    }
}
