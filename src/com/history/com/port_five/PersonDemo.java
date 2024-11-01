package com.history.com.port_five;

public class PersonDemo {
    public static void main(String[] args) {
        //创建对象
        PingpongPlayer pop = new PingpongPlayer();
        pop.setName("张继科");
        pop.setAge(55);
        System.out.println(pop.getName()+","+ pop.getAge());
        pop.eat();
        pop.study();
        pop.speak();

        BasketballPlayer bp =new BasketballPlayer("姚明",44);
        System.out.println(bp.getName()+","+bp.getAge());
        bp.eat();
        bp.study();

        BasketballCoach bc = new BasketballCoach("李四",22);
        System.out.println(bc.getName()+","+bc.getAge());
        bc.eat();
        bc.teach();
    }
}
