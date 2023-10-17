package com.javaTest.collection14.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("all")
public class MapSource01 {


    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1", "韩顺平");//k-v
        map.put("no2", "张无忌");//k-v
        map.put(new Car(),new Person());

        /**
         * 1.k-v 最后是 HashMap$Node node = newNode(hash, key, value, null);
         * 2.k-v 为了方便程序员的遍历，还会创建EntrySet集合， 该集合存放的元素类型Entry，
         * 而一个Entry对象就有k，v EntrySet<Entry <K, V>>,即：transient Set<Map.Entry<K,V>> entrySet;
         * 3.entrySet 中，定义的类型是Map.Entry，但是实际上存放的还是HashMap$Node
         *      这是因为 static class Node<K,V> implements Map.Entry<K,V>
         * 4. 当把HashMap$Node 存放到entrySet 就方便我们的遍历，因为Map.Entry 提供了重要的方法
         *      interface Entry<K,V> {
         *       K getKey (); V getValue ();
         * */

        Set set = map.entrySet();
        System.out.println(set.getClass()); //HashMap$EntrySet
        for (Object obj: set) {
            //System.out.println(entry.getClass());//HashMap$Node
            //为了从 ashMap$Node 取出K-v
            //先做一个向下转型
            Map.Entry entry1 = (Map.Entry) obj;
            System.out.println(entry1.getKey() + "-" + entry1.getValue());


        }
        Set set1 = map.keySet();
        System.out.println("set1.getClass()=" + set1.getClass());
        Collection values = map.values();
        System.out.println("values.getClass()=" + values.getClass());
    }
}
class Car{}
class Person{}