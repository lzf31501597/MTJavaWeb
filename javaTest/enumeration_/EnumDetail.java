package com.javaTest.enumeration_;

/**
*
* */
public class EnumDetail {
    public static void main(String[] args) {
        Music.CLASICMUSIC.playing();
    }
}
class A{}
//1、使用enum关键字后，就不能在继承其他类了，（enum默认隐式继承Enum—，而Java是单继承机制。)
//enum Season extends A {
//
//}
//2、enum实现的枚举类，仍然是一个类，所以还是可以实现接口的。

interface IPlaying{
    public void playing();
}

enum Music implements IPlaying {
    CLASICMUSIC;
    @Override
    public void playing() {
        System.out.println("播放好听的音乐。。。。。。");
    }
}