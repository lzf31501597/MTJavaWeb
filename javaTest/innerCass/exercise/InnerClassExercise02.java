package com.javaTest.innerCass.exercise;


/**
 * 匿名内部类：
 * 1、继承  2.多态  3。动态绑定  4.内部类
* */
public class InnerClassExercise02 {
    public static void main(String[] args) {
//       Bell bell = new Bell(){
//            @Override
//            public void ring() {
//                System.out.println("懒猪起床了。。。。。。");
//            }
//        };
//        Bell bell1 = new Bell(){
//            @Override
//            public void ring() {
//                System.out.println("小伙伴上课了。。。。。。");
//            }
//        };
        CellPhone cp = new CellPhone();
        cp.alarmclock(new Bell(){
            @Override
            public void ring() {
                System.out.println("懒猪起床了。。。。。。");
            }
            });
        cp.alarmclock(new Bell(){
            @Override
            public void ring() {
                System.out.println("小伙伴上课了。。。。。。");
            }
        });
    }
}
//    @Override
//    public void ring() {
//        System.out.println("懒猪起床了。。。。。。");
//    }

interface Bell{
    void ring();
}

class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }

}