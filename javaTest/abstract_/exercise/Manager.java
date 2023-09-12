package com.javaTest.abstract_.exercise;

public class Manager extends Employee{
    private int bonnus;

    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    public int getBonnus() {
        return bonnus;
    }

    public void setBonnus(int bonnus) {
        this.bonnus = bonnus;
    }

    @Override
    public void work() {
        System.out.println("经理： " + super.getName() + " 工作中...");
    }

    @Override
    public String toString() {
        return "经理：" + super.getName() +
                ",\nID:" + super.getId() +
                ",\nsalary:" +(super.getSalary() +this.bonnus) ;

    }
}
