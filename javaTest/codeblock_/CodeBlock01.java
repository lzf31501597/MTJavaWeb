package com.javaTest.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
        Movie movie1 = new Movie("你好，李焕英",50);
        Movie movie2 = new Movie("你好，李焕英",50,"505050");
    }
}

class Movie {
    private String name;
    private double price;
    private String director;

    //3三个构造器---重载
    //1、三个构造器都有相同的代码语句
    //2、这样的代码看起来比较冗余
    //3、这种情况，就可以把相同代码语句，放在一个代码块当中，即可
    //4、因此我们不管调用哪个构造器，创建对象，都会先调用代码块的语句内容

    //代码块：1、相当于另外一种形式的构造器（对构造器的补助机制），可以做初始化的操作。
    //2、场景：如果多个构造器中都有重复的语句，可以抽取到初始化块中，提高代码的重用性。
    {
        System.out.println("电影屏幕打开。。。。。");
        System.out.println("广告开始。。。。。");
        System.out.println("电影正式开始.....");
    };
    public Movie(String name) {
        System.out.println("Movie(String name) 被调用。。。。。");
//        System.out.println("电影屏幕打开。。。。。");
//        System.out.println("广告开始。。。。。");
//        System.out.println("电影正式开始.....");
        this.name = name;
    }
    public Movie(String name, double price) {
        System.out.println("Movie(String name, double price) 被调用。。。。。");
//        System.out.println("电影屏幕打开。。。。。");
//        System.out.println("广告开始。。。。。");
//        System.out.println("电影正式开始.....");
        this.name = name;
        this.price = price;
    }
    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director) 被调用。。。。。");
//        System.out.println("电影屏幕打开。。。。。");
//        System.out.println("广告开始。。。。。");
//        System.out.println("电影正式开始.....");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}