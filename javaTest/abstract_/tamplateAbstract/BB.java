package com.javaTest.abstract_.tamplateAbstract;

public class BB extends Template{

//    public void calculateTime(){
//        //得到开始的时间
//        long startTime = System.currentTimeMillis();
//        job();
//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("BB job()运行时间=" + (end - startTime));
//    }
    public void job(){
//        //得到开始的时间
//        long startTime = System.currentTimeMillis();
        long num = 0;

        for (int i = 0; i <= 800000 ; i++) {
            num *= i;
        }

//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("BB job()运行时间=" + (end - startTime));

    }
}
