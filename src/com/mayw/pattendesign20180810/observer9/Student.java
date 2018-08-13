package com.mayw.pattendesign20180810.observer9;

public class Student extends Persion{
    private Subject subject;

    public Student(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void notice() {
        System.out.println(this.getName() + "接收到" + subject.name + "的消息" + subject.message);
    }
}
