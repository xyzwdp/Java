package com.history.com.day14three;

public class AnimalDemo {

    /*向上转型
         从子到父
        父类引用指向子类对象
    向下转型
        从父到子
        父类引用转为子类对象*/

    public static void main(String[] args) {
        //多态
        Animal a = new Cat();//向上转型
        a.eat();
        //a.sleep();
        //a.playGame();

        /*//创建Cat类对象
        Cat c = new Cat();
        c.eat();
        c.playGame();*/

        //向下转型
        Cat c = (Cat) a;
        c.eat();
        c.playGame();
        //c.sleep();
    }

}
