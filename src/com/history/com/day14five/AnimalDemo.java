package com.history.com.day14five;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setAge(11);
        a.setName("如来");
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println();

        a = new Cat("观音", 22);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println();


        //创建狗类对象进行测试
        a = new Dog();
        a.setAge(33);
        a.setName("唐伯虎");
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println();

        a = new Dog("如花", 44);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
    }
}
