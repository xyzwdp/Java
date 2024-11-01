package com.history.com.port_five;

public class BasketballCoach extends Coach{

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练叫运动员如何投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉羊奶");
    }
}
