package com.history.com.day14four;

public class AnimalDemo {
    public static void main(String[] args) {
        //向上转型
        Animal a = new Cat();
        a.eat();

        //向下转型
        Cat c = (Cat) a;
        c.eat();
        c.playGame();

        /*//向下转型
        Dog b = (Dog) a;
        b.eat();
        b.lookDoor();*/

        //向上转型
        a = new Dog();
        a.eat();

        Dog  e = new Dog();
        e.eat();

        //向下转型
        //ClassCasExeption 类转换异常

        //Cat d = (Cat) a;
        //d.eat();


    }

}
