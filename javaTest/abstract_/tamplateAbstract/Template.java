package com.javaTest.abstract_.tamplateAbstract;

abstract public class Template {

    public abstract void job();
    public void calculateTime(){
        //得到开始的时间
        long startTime = System.currentTimeMillis();
        job();
        //得到结束的时间
        long end = System.currentTimeMillis();
        System.out.println("Template job()运行时间=" + (end - startTime));
    }
}
