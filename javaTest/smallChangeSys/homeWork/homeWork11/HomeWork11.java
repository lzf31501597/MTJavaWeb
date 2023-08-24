package javaTest.smallChangeSys.homeWork.homeWork11;

public class HomeWork11 {
    public static void main(String[] args) {
        //向上转型
        Person person = new Student();
        System.out.println("Person================");
        person.eat();
        person.run();

        //向下转型
        Student student = (Student)person;
        System.out.println("Student==================");
        student.eat();
        student.run();
        student.study();

    }
}
