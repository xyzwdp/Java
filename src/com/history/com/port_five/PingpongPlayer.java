package com.history.com.port_five;

public class PingpongPlayer extends Player implements SpeakEnglish{

    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习如何接球和发球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃牛肉喝筒骨汤");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
