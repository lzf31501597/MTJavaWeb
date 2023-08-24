package javaTest.smallChangeSys.homeWork.homeWork13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String show() {
        return "老师=" + super.getName() + " ,sex=" + super.getSex() + " ,age=" + super.getAge() +
                " ,work_age=" + this.work_age;
    }

    @Override
    public String paly() {
        return   "老师：" + super.getName() + "爱玩象棋。";
    }

    public void teach(){
        System.out.println("我承诺，我会好好教学！！！");
    }
}
