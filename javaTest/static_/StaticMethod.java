package com.javaTest.static_;

public class StaticMethod {
    public static void main(String[] args) {
        //类方法：也叫静态方法
        Student tom = new Student("tom");
        tom.payFee(200);
        //Student.payFee(100);//学生们的总学费：600

        Student jack = new Student("jack");
        jack.payFee(300);

        Student.showFee(); //学生们的总学费：500

        //如果我们希望不创建实例，也可以调用某个方法（即当工具使用）
        //这种情况，把方法设计成static方法，就非常合适
        System.out.println("8的平方数为" + Math.sqrt(8));

        System.out.println("MyTools.calSum(x,y)=" + MyTools.calSum(5.0,6.0));

    }
}
//开发自己的工具类时，可以将方法设计成静态的，方便调用
class MyTools {

    public static double calSum(double x, double y){
        return x + y;
    }
}
class  Student {
    private String name;//普通成员变量
    //定义一个静态变量，来累计学生们的学费
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }

    //1、当方法使用了static 修饰后，该方法就是静态方法。
    //2、静态方法：可以访问静态属性和变量
    public static void payFee(double fee){
        Student.fee += fee;
    }
    public static void showFee(){
        System.out.println("总费用有：" + Student.fee);
    }
}