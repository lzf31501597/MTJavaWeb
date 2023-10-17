package com.javaTest.collection14.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Employee e1 = new Employee("邓超", 20000, 1);
        Employee e2 = new Employee("孙俪", 25000, 2);
        Employee e3 = new Employee("王宝强", 32000, 3);
        Employee e4 = new Employee("马蓉", 8000, 4);
        Employee e5 = new Employee("宋喆", 25000, 5);
        Employee e6 = new Employee("刘令博", 22000, 6);
        Employee e7 = new Employee("刘亦菲", 15000, 7);
        Employee e8 = new Employee("鹿晗", 2000, 8);
        Employee e9 = new Employee("关晓彤", 8000, 9);
        Employee[] employee = {e1, e2, e3, e4, e5, e6, e7, e8, e9};
        HashMap hashMap = new HashMap();
        for (int i = 0; i < employee.length; i++) {
//            if(employee[i].getSalary() > 18000){
//                hashMap.put(employee[i].getNum(),employee[i]);
//            }
            hashMap.put(employee[i].getNum(),employee[i]);
        }
        //第一组：先取出所有的key，通过key取出对应的value
        //1)
        System.out.println("增强 for 1111------------------");
        Set set = hashMap.keySet();

        for ( Object key : set) {
            Employee em = (Employee) hashMap.get(key);
            if (em.getSalary() > 18000) {
                System.out.println(key + " - " + em);
            }

        }
        //2)
        System.out.println("迭代器遍历 1111------------------");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            Employee em = (Employee) hashMap.get(key);
            if (em.getSalary() > 18000) {
                System.out.println(key + " - " + em);
            }
        }

        //第三组：通过 EntrySet 来获取
        //1）
        Set entryset1 = hashMap.entrySet();
        System.out.println("增强for 22222------------------");
        for (Object entry : entryset1) {
            Map.Entry me = (Map.Entry) entry;
            Employee em = (Employee) me.getValue();
            if (em.getSalary() > 18000) {
                System.out.println(me.getKey() + " - " + me.getValue());
            }

        }

        //2)
        System.out.println("迭代器遍历 22222------------------");
        Iterator iterator1 = entryset1.iterator();
        while (iterator1.hasNext()){
            Object entry = iterator1.next();
            Map.Entry me = (Map.Entry) entry;
            Employee em = (Employee) me.getValue();
            if (em.getSalary() > 18000) {
                System.out.println(me.getKey() + " - " + me.getValue());
            }
        }
    }
}
class Employee{
    private String name;
    private double salary;
    private int num;

    public Employee(String name, double salary, int num) {
        this.name = name;
        this.salary = salary;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", num=" + num +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}