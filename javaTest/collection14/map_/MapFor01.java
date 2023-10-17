package com.javaTest.collection14.map_;

import java.util.*;

public class MapFor01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //演示 map 接口常用方法
        Map map = new HashMap();
        map.put("邓超", new Book("", 100));//OK
        map.put("邓超", "孙俪");//替换-> 一会分析源码
        map.put("王宝强", "马蓉");//OK
        map.put("宋喆", "马蓉");//OK
        map.put("刘令博", null);//OK
        map.put(null, "刘亦菲");//OK
        map.put("鹿晗", "关晓彤");//OK
        map.put("hsp", "hsp的老婆");

        System.out.println("map=" + map);

        //第一组：先取出所有的key，通过key取出对应的value
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        //1）.迭代器遍历
        System.out.println("迭代器遍历1111------------------");
        while (iterator.hasNext()){
            Object key = iterator.next();
            Object value = map.get(key);
            System.out.println(key + "-" + map.get(key));
        }
        //2）、增强for
        System.out.println("增强for1111------------------");
        for (Object key: set) {
            System.out.println(key + "-" + map.get(key));
        }

        //第二组：先取出所有values，
        Collection values = map.values();//这里可以使用所有的Collections使用方法
        //1)
        System.out.println("增强for2222------------------");
        for (Object value : values
             ) {
            System.out.println(value);
        }

        //2)
        System.out.println("迭代器遍历2222------------------");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()){
            Object value = iterator1.next();
            System.out.println(value);
        }
        //第三组：通过 EntrySet 来获取
        //1）
        System.out.println("增强for333333------------------");
        Set entrySet = map.entrySet();
        for (Object entry: entrySet) {
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //2）
        System.out.println("迭代器遍历3333333------------------");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()){
            Object entry = iterator2.next();
            //System.out.println(entry.getClass()); //HashMap$Node-->实现-> Map.Entry(getKey(),getValue())
            //向下转型 Map.Entry
            Map.Entry kv = (Map.Entry) entry;
            System.out.println(kv.getKey() + "-" + kv.getValue());
        }
    }
}
