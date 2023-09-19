package com.javaTest.enumeration_.exercise;

public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        System.out.println("-------所有星期的信息如下-------");
        for(Week week : weeks){
            System.out.println(week);
        }
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i].getDesc());
        }
    }
}
enum Week {
    /*MONDAY("MONDAY","星期一"), TUESDAY("TUESDAY","星期二"),
    WEDNESDAY("WEDNESDAY","星期三"), THURSDAY("THURSDAY","星期四"),
    FRIDAY("FRIDAY","星期五"), SATURDAY("SATURDAY","星期六"),
    SUNDAY("SUNDAY","星期日");*/
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");

    //private String name;
    private String desc;
    /*private Week(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }*/
    private Week( String desc) {
        this.desc = desc;
    }
//    public String getName() {
//        return name;
//    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return desc;
    }

    /*@Override
    public String toString() {
        return "Week{" +
                "desc='" + desc + '\'' +
                '}';
    }*/
}