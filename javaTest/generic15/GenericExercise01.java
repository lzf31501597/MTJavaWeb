package com.javaTest.generic15;

import java.util.*;

public class GenericExercise01 {
    public static void main(String[] args) {
        Student student1 = new Student("tom", 20);
        Student student2 = new Student("lucy", 18);
        Student student3 = new Student("smith", 25);

        //1.HashSet
        System.out.println("1.HashSet--------------");
        HashSet<Student> set = new HashSet<Student>();
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(new Student("john", 12));
        System.out.println(set);

        for (Student student01: set) {
            System.out.println(student01);
        }

       //students.add(100);//使用泛型后，就报错
        Iterator<Student> iterator = set.iterator();

        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println(student);
        }



        //2.HashMap
        System.out.println("2.HashMap--------------");
        HashMap<String, Student> hashMap = new HashMap<String, Student>();
        hashMap.put(student1.name, student1);
        hashMap.put(student2.name, student2);
        hashMap.put(student3.name, student3);
        System.out.println(hashMap);

        //迭代器 EntrySet
        Set<Map.Entry<String, Student>> entrySet = hashMap.entrySet();
        /*public Set<Map.Entry<K,V>> entrySet() {
            Set<Map.Entry<K,V>> es;
            return (es = entrySet) == null ? (entrySet = new HashMap.EntrySet()) : es;
        }*/

        Iterator<Map.Entry<String, Student>> iterator1 = entrySet.iterator();
        /*public final Iterator<Map.Entry<K,V>> iterator() {
            return new HashMap.EntryIterator();
        }*/

        while (iterator1.hasNext()){
            Map.Entry<String, Student> next = iterator1.next();
            System.out.println(next.getKey() +"-"+next.getValue());
        }

    }
}
class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}