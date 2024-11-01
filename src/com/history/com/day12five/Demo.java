package com.history.com.day12five;

public class Demo {
    public static void main(String[] args) {
        //创建老师类对象进行测试
        Teacher t1 = new Teacher();
        t1.setName("如花");
        t1.setAge(999);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("阎王爷",999999);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();


    }
}
