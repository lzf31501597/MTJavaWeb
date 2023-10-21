package com.javaTest.generic15.genericExercise02;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericExercise02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Employee employee1 = new Employee("tom", 50000, new MyDate(2020, 3, 22));
        Employee employee2 = new Employee("hsp", 30000, new MyDate(1999, 4, 23));
        Employee employee3 = new Employee("jack", 20000, new MyDate(2010, 5, 24));

        ArrayList<Employee> elist = new ArrayList<>();
        elist.add(employee1);
        elist.add(employee2);
        elist.add(employee3);
        System.out.println(elist);

        elist.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //判断类型
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不正确。。。。。。");
                    return 0;
                }

                //比较name
                String name1 = o1.getName();
                String name2 = o2.getName();
                int i = name1.compareTo(name2);
                if (i != 0){
                    return i;
                }

                //把比较birthday的代码，直接在MyDate里面进行完成
                //封装后，将来维护性和复用性，就大大增强
                //return o1.getBirthday().compareTo(o2.getBirthday());//从小到大
                return o2.getBirthday().compareTo(o1.getBirthday());//从大到小

                /*//如果name相同， 就比较 birthday：year
                int yearMinus = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if (yearMinus != 0) {
                    return yearMinus;
                }

                //
                //如果year相同，就比较month
                int monthMinus = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if (monthMinus != 0) {
                    return monthMinus;
                }

                //如果month相同，就比较day
                return o1.getBirthday().getMonth() - o2.getBirthday().getDay();*/

            }
        });
        System.out.println("elist.sort(new Comparator<Employee>().........");
        System.out.println(elist);
    }
}
