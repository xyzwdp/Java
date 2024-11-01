package com.history.comone.outertwo;

public class Outer {
    private int num = 11;

    //成员内部类
    /*public class Inner{
        public void show(){
            System.out.println(num);
        }
    }*/

    private class Inner{
        public void show(){
            System.out.println(num);
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
