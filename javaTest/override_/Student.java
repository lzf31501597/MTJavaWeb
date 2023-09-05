package com.javaTest.override_;

public class Student extends Person01 {

    private int id;
    private int score;

    public Student(String name, int age, int id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return super.say() + " ，编号：" + this.id + " ,成绩：" + this.score;
    }


}
