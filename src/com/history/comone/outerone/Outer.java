package com.history.comone.outerone;

/*
内部类
        概述
            就是在一个类中定义一个类
        格式
            public class 类名{
                修饰符 class 类名{
                }
            }
            public class Outer{
                修饰符 class Inner{
                }
            }
        访问特点
            内部类可以直接访问外部类的成员，包括私有
            外部类要访问内部类的成员，必须创建对象
*/

public class Outer {
    private int num= 10;

    public class Inner{
        public void show(){
            System.out.println(num);
        }

    }

    public void method(){
        //show();
        Inner i = new Inner();
        i.show();
    }
}
