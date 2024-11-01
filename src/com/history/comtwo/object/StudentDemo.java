package com.history.comtwo.object;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("丽菲");
        s.setAge(24);
        System.out.println(s);//comtwo.object.Student@1b6d3586
    }

    /*public void println(Object x) {  x = s
        String s = String.valueOf(x);
        synchronized (this) {
            print(s);
            newLine();
        }
    }*/

    /*public static String valueOf(Object obj) { obj = x
        return (obj == null) ? "null" : obj.toString();
    }*/

    /*public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }*/
}
