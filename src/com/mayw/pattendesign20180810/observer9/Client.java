package com.mayw.pattendesign20180810.observer9;

public class Client {
    public static void main(String[] args) {
        // 先创建学校
        Subject subject = new School();
        subject.name = "第三中学";

        // 创建学生
        Persion p1 = new Student(subject);
        p1.setName("张三");
        Persion p2 = new Student(subject);
        p2.setName("李四");
        Persion p3 = new Student(subject);
        p3.setName("王五");
        subject.add(p1);
        subject.add(p2);
        subject.add(p3);

        subject.message = "明天不用上课了";
        subject.notice();








    }
}
