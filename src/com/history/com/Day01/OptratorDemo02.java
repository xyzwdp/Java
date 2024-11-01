package com.history.com.Day01;

public class OptratorDemo02 {
    public static void main(String[] args){
        //赋值int类型
        int i=10;
        System.out.println("i:"+i);

        //+= 把左边和右边的数据做加法操作，结果赋值给左边
        i+=20;
        //i=i+20;
        System.out.println("i:"+i);

        //注意：扩展的赋值运算符底层隐含了强制类型转换
        short s=10;
        s+=20;
        //s=(short)(s+20);
        System.out.println("s:"+s);
        //String type=((Object) s).getClass().getName();
        System.out.println("s变量类型为："+((Object) s).getClass().getName());

    }

}
