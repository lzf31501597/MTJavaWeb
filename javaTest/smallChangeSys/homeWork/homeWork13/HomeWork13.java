package com.javaTest.smallChangeSys.homeWork.homeWork13;

public class HomeWork13 {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Student("tom", '男',35, "1" );
        person[1] = new Student("simith", '女',55, "2" );
        person[2] = new Teacher("james", '女',45,4  );
        person[3] = new Teacher("jake", '男',50, 3 );

//        for (int i = 0; i < 4; i++) {
//            System.out.println(person[i].toString().toString().toString());
//        }
        new HomeWork13().sortAge(person);
        new HomeWork13().isPerson(person);


    }

    public void sortAge(Person[] person){
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    Person tmp =  person[j];
                    person[j] = person[j+1];
                    person[j+1] = tmp;
                }
            }

        }
        System.out.println("根据年龄排序：-------------");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getAge());
        }
    }
    public void isPerson(Person[] person){
        System.out.println("-----------------------");
        for (int i = 0; i < 4; i++) {
            if (person[i] instanceof Student){
                Student student = (Student) person[i];
                System.out.println(student.show());
                System.out.println(student.paly());
                student.study();
                System.out.println("-----------------");
            } else if (person[i] instanceof Teacher) {
                Teacher teacher = (Teacher) person[i];
                System.out.println(teacher.show());
                System.out.println(teacher.paly());
                teacher.teach();
                System.out.println("-----------------");
            }
        }
    }
}
