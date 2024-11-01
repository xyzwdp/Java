package com.history.com.day12two;

public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        p.call("林青霞");
        System.out.println("-------------");

        NewPhone np = new NewPhone();
        np.call("张三");
    }
}
