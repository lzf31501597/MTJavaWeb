package com.javaTest.smallChangeSys.homeWork;

public class HomeWork01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person[] persons = new Person[3];
        persons[0] = new Person("jack", 20, "IT");
        persons[1] = new Person("tom", 28, "eg");
        persons[2] = new Person("james", 35, "editor");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
        //name长度冒泡排序
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getName().length() < persons[j + 1].getName().length()) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }

            }
            //System.out.println("persons["+i+"]=" + persons[i]);
        }
        System.out.println("name长度排序----------");
        for (int i = 0; i < persons.length; i++) {
            //System.out.println("persons["+i+"]=" + persons[i]);
            System.out.println("persons[" + i + "].name=" + persons[i].getName());
        }
        //age冒泡排序
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }

            }
            //System.out.println("persons["+i+"]=" + persons[i]);
        }

        System.out.println("age冒泡排序----------");
        for (int i = 0; i < persons.length; i++) {
            //System.out.println("persons["+i+"]=" + persons[i]);
            System.out.println("persons[" + i + "]=" + persons[i].getAge());
        }

    }


}

class Person {

    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        //super();
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
