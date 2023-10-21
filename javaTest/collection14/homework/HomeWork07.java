package com.javaTest.collection14.homework;

public class HomeWork07 {
    public static void main(String[] args) {
        /*            底层结构    版本      线程安全（同步）效率  扩容倍数
        ArrayList  可变数组     jdk1.2      不安全，效率高     如果使用有参构造器按照1.5倍扩容，
                                                            如果使用无参构造器：1）第一次扩容到10，2）从第二次开始按照1.5倍
        Vector    可变数组+Object[]     jdk1.0 安全，效率不高     如果使用无参构造器，默认是10，满后，按两倍扩容；
                                                              如果指定大小穿件Vector，每次按两倍扩容。*/

    }
}
