package com.history.comone.day1one;

public class CatDemo {
    public static void main(String[] args) {
        //创建操作类对象，调用方法
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.useCat(c);

        Cat c2 = co.geCat();//new Cat();
        c2.eat();
    }
}
