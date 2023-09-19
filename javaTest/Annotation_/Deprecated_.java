package com.javaTest.Annotation_;

public class Deprecated_ {
    public static void main(String[] args) {

    }
}
/* @Deprecated源码
* @Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}*/
//1、@Deprecated  修饰某个元素，表示钙元素已经过时。
//2、即不再推荐使用，但是仍然可以使用。
//3、可以修饰类，方法，字段，包，参数。。。。
//4、@Deprecated 可以做版本升级过度和新旧版本兼容
@Deprecated
class A {
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi(){

    }
}