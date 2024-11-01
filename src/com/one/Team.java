package com.one;

public class Team {
    /**
     * 成员变量与类变量的比较
     */
    /*
    使用场景
        成员变量通常用于描述对象的特征或状态，如一个人的年龄、姓名等。
        类变量通常用于描述类相关的属性，比如在一个团队中所有成员的数量。
    */
    private String memberName;
    private static int memberCount = 0;

    public Team(String name) {
        memberName = name;
        memberCount++;
    }

    public void displayMemberInfo() {
        System.out.println("Member name: " + memberName);
    }

    public static void displayMemberCount() {
        System.out.println("Total members: " + memberCount);
    }

    public static void main(String[] args) {
        Team member1 = new Team("Alice");
        member1.displayMemberInfo(); // 输出 "Member name: Alice"
        Team.displayMemberCount(); // 输出 "Total members: 1"

        Team member2 = new Team("Bob");
        member2.displayMemberInfo(); // 输出 "Member name: Bob"
        Team.displayMemberCount(); // 输出 "Total members: 2"
    }
}
