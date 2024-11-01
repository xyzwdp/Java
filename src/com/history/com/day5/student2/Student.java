package com.history.com.day5.student2;

public class Student {
        //成员变量
        private String name;
        private int age;

        //get/set方法
        /*public void setName(String n){
            name = n;
        }*/

        public void setName(String name){
            //name = name;
            //this代表本类对象的引用
            this.name = name;
        }

        public String getName(){
            return name;
        }

        /*public void setAge(int a){
            age  = a;
        }*/

        public void setAge(int age){
            this.age=age;
        }
        public int getAge(){
            return age;
        }

        public void show(){
            System.out.println(name + "," + age);
        }

}
