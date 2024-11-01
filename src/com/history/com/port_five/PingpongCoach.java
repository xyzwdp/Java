package com.history.com.port_five;

public class PingpongCoach extends Coach implements SpeakEnglish{

    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃龙肉＆龙血");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
