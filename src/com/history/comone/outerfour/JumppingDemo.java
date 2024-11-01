package com.history.comone.outerfour;

public class JumppingDemo {
    public static void main(String[] args) {
        //需求，创建接口操作类对象，调用method方法
        JumppingOperator jo = new JumppingOperator();
        //编译看左边，执行看右边
        Jumpping j = new Cat();
        jo.method(j);

        Jumpping j2 = new Dog();
        jo.method(j2);
        System.out.println("----------------");

        //继承了该类或者实现了该接口的匿名对象
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猪可以起飞了");
            }
        });
    }
}
