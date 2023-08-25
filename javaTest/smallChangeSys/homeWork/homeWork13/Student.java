package javaTest.smallChangeSys.homeWork.homeWork13;

public class Student extends Person{
   private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String show() {
        return  "学生信息：\n姓名：" + super.getName() + "\nsex：" + super.getSex() + "\nage：" + super.getAge() +
                "\nstu_id：" + this.stu_id;
    }

    @Override
    public String paly() {
        return   "学生：" + super.getName() + "爱玩足球。";
    }

    public void study(){
        System.out.println("我承诺，我会好好学习！！！");
    }
}
