package com.history.com.day5.student_1;

public class PhoneDemo {
    /*创建对象
        格式：类名 对象名 = new 类名();

    使用对象：
        1、使用成员变量
            格式： 对象名 变量名();
        2、收纳柜用成员方法
            格式：对象名 方法名();*/

    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();

        //使用对象
        System.out.println(p.brand);
        System.out.println(p.price);

        String brand="苹果";
//        p.brand = "小米";
        p.price = 2999;

        System.out.println(p.brand);
        System.out.println(p.price);

        //使用成员方法
        p.call();
        p.sendMessage();
    }
}
