package com.javaTest.abstract_.exercise;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    public void work() {
        System.out.println("普通员工： " + super.getName() + " 工作中...");
    }

    @Override
    public String toString() {
        return "普通员工：" + super.getName() +
                ",\nID:" + super.getId() +
                ",\nsalary:" +super.getSalary() ;
    }
}
