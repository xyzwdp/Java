package com.history.com.day7;

/*
*预定义注解
	@Override
		检测该注解标注的方法是否是继承父类（接口）的
	@Deprecate
		该注解标注的内容，标注已过时
	@SuppressWarnings
		压制警告
*
* */

@SuppressWarnings("all")
public class AnnoDemo2 {

    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
    }

    public void show2(){
        //替代show1方法
    }

    public void demo(){
        show1();
    }


}
