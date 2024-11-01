package com.history.comtwo.equals;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("丽菲");
        s.setAge(24);

        Student s1 = new Student();
        s1.setName("丽菲");
        s1.setAge(24);

        //需求，比较两个对象的内容是否相同
        //System.out.println(s==s1); 这个为地址值比较

        System.out.println(s.equals(s1));

        /*public boolean equals(Object obj) {
            //this-----s
            //obj------s1
            return (this == obj);
        }*/
    }
}
