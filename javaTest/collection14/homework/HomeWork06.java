package com.javaTest.collection14.homework;

import java.util.HashSet;
import java.util.Objects;

public class HomeWork06 {
    public static void main(String[] args) {
        Person06 p1 = new Person06(1001, "AA");
        Person06 p2 = new Person06(1002, "BB");

        HashSet hashSet = new HashSet();
        hashSet.add(p1);
        hashSet.add(p2);

        p1.name = "CC";
        hashSet.remove(p1); //F
        System.out.println(hashSet); //1001-CC,p2

        hashSet.add(new Person06(1001, "CC"));
        System.out.println(hashSet); //1001-CC,p2,1001-CC
        hashSet.add(new Person06(1001,"AA"));
        System.out.println(hashSet);  //1001-CC,p2,1001-CC, 1001-AA
    }
}

class Person06{
    public int id;
    public String name;

    public Person06(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person06 person06 = (Person06) o;
        return id == person06.id &&
                Objects.equals(name, person06.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person06{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}