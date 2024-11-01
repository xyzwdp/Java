package com.one;

public class Puppy {
    private int age;
    private String name;
    //构造器
    public Puppy(String name){
        this.name=name;
        System.out.println("小狗的名字是："+name);
    }
    //设置age的值

    public void setAge(int age) {
        this.age = age;
    }
    //获取age的值

    public int getAge() {
        return age;
    }
    //获取name的值

    public String getName() {
        return name;
    }
    //主方法
    public static void main(String[] args) {
        //创建一个新对象
        Puppy myPuppy=new Puppy("张三");
        //通过set方法来舍得age的值
        myPuppy.setAge(20);
        //通过get方法来获取age的值
        int age= myPuppy.getAge();
        System.out.println("小狗的年龄为："+age);
        //直接访问成员方法获取age的值
        System.out.println("小狗的年龄为："+myPuppy.getAge());

    }
}
