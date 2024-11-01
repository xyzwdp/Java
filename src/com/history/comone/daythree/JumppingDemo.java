package com.history.comone.daythree;

public class JumppingDemo {
    public static void main(String[] args) {
        //创建操作多项，并调用方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.useJumpping(j);

        Jumpping j2 = jo.getJumpping();//new Cat()

    }
}
