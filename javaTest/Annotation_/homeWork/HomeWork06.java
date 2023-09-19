package com.javaTest.Annotation_.homeWork;

public class HomeWork06 {
    public static void main(String[] args) {
        Person person = new Person("唐僧", new Horse());
        person.passRiver();
        person.flameMountain();
        person.common();
        person.passRiver();
        person.flameMountain();
        person.common();
        person.passRiver();
        person.flameMountain();
        person.common();
    }
}
/**
 * 1、有个交通工具接口类Vehicles，有work方法
 * 2、有Horse类和Boat类分别实现Vehicles
 * 3、创建交通工具工厂类，有两个方法分别获得交通工具Horse类和Boat类
 * 4、有Person类，有name和Vehicle属性，在构造器中有两个属性
 * 5、实例化Person对象”唐僧“，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
 * 6、增加一个情况，如果遇到火焰山，使用 飞机===》程序扩展性
 *
 * 使用代码实现上述要求：
 *      编程： 需求---》理解---》代码---》优化
 * */
interface Vehicles{
    public void work();
}
class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("一般情况下，骑马。。。。。");
    }
}
class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("遇到大河，乘船。。。。。");
    }
}
class Airplane implements Vehicles{

    @Override
    public void work() {
        System.out.println("遇到火焰山，坐飞机。。。。。");
    }
}
class VehiclesFactory{
    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Airplane getAirplane(){
        return new Airplane();
    }
}

class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;


    }
    public void passRiver(){
        //if (vehicles == null) {
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
       //if (vehicles == null) {
        if (!(vehicles instanceof Horse)) {
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();
    }
    public void flameMountain(){
        //if (vehicles == null) {
        if (!(vehicles instanceof Airplane)) {
            vehicles = VehiclesFactory.getAirplane();
        }
        vehicles.work();
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", vehicles='" + vehicles + '\'' +
//                '}';
//    }
}