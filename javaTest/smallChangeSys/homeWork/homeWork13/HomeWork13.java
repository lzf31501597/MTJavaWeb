package javaTest.smallChangeSys.homeWork.homeWork13;

public class HomeWork13 {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Student("tom", '男',35, "1" );
        person[1] = new Student("simith", '女',55, "2" );
        person[2] = new Teacher("james", '女',45,4  );
        person[3] = new Teacher("jake", '男',50, 3 );

        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    Person tmp =  person[j];
                    person[j] = person[j+1];
                    person[j+1] = tmp;
                }
            }

        }

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getAge());
        }

        for (int i = 0; i < 4; i++) {
            if (person[i] instanceof Student){
                Student student = (Student) person[i];
                System.out.println(student.show());
                student.paly();
                student.study();
            } else if (person[i] instanceof Teacher) {
                Teacher teacher = (Teacher) person[i];
                System.out.println(teacher.show());
                teacher.paly();
                teacher.teach();
            }
        }

    }
}
