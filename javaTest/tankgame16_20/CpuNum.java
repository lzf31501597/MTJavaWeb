package com.javaTest.tankgame16_18;

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //获取当前电脑的CPU数量/核心数
        int cpuNUms = runtime.availableProcessors();
        System.out.println("电脑有" + cpuNUms +"个cpu。。。");
        Thread thread = new Thread();
    }
}
