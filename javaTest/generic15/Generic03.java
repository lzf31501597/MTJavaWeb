package com.javaTest.generic15;

public class Generic03 {
    public static void main(String[] args) {
        //注意：特别强调：E表示s 的数据类型，该数据类型在定义Person对象时指定，（即在编译期间，就确定E是什么类型）
        Person<String> person = new Person<String>("韩顺平教育");
        person.show();
        /*
        * class Person{
            String s;//E表示s 的数据类型，该数据类型在定义Person对象时指定，（即在编译期间，就确定E是什么类型）

            public Person(String s) {//E是参数类型
                this.s = s;
            }
            public String f(){//返回类型使用E
                return s;
            }
        }*/

        Person<Integer> integerPerson = new Person<Integer>(100);
        integerPerson.show();
        /*
        * class Person{
            Integer s;//E表示s 的数据类型，该数据类型在定义Person对象时指定，（即在编译期间，就确定E是什么类型）

            public Person(Integer s) {//E是参数类型
                this.s = s;
            }
            public Integer f(){//返回类型使用E
                return s;
            }
        }*/
    }
}
//泛型的作用是：可以在类声明时，通过一个标识表示类中的：1）某个属性的类型；
//  2）或者是某个方法的返回值的类型；3）或者是参数类型
class Person<E>{
    E s;//E表示s 的数据类型，该数据类型在定义Person对象时指定，（即在编译期间，就确定E是什么类型）

    public Person(E s) {//E是参数类型
        this.s = s;
    }
    public E f(){//返回类型使用E
        return s;
    }
    public void show(){
        System.out.println(s.getClass());
    }
}