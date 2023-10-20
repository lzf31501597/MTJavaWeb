package com.javaTest.collection14.map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {

        /*
        * 1.Properties 继承 Hashtable
        * public class Properties extends Hashtable
        * 2.可以通过 k-v 存放数据，当然key 和value 都不能为空
        * */
        Properties properties = new Properties();
        //添加数据
        properties.put("john", 100);
        properties.put("tom", 100);
        properties.put("lic", 100);
        properties.put("lic", 88);
        //properties.put(null, 100);//异常 NullPointerExercise
        //properties.put("john", null);//异常 NullPointerExercise
        System.out.println(properties);

        //通过key获取对应值
        System.out.println(properties.get("lic"));

        //删除
        System.out.println(properties.remove("lic"));
        System.out.println(properties);

        //改
        properties.put("john", "tokyo");
        System.out.println(properties);

        //查
        System.out.println(properties.get("john"));
        System.out.println(properties.getProperty("john"));
    }
}
