package com.javaTest.collection14.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {

        //TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照传入的K(String)的大小排序
                //按照传入的K(String)的长度排序
                //return ((String) o1).compareTo((String) o2);
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeMap.put("jack","杰克");
        treeMap.put("tom","汤姆");
        treeMap.put("kristina","克瑞斯缇娜");
        treeMap.put("smith","史密斯");
        treeMap.put("hsp","韩顺平");//加入不了
        System.out.println(treeMap);

        /*
        * 1.构造器，把传入的实现了Comparator接口的匿名内部类（对象），传给了TreeMap的compareTo()
        * public TreeMap(Comparator<? super K> comparator) {
            this.comparator = comparator;
        }
        * 2.调用put（）
        * 2.1 第一次添加，把k-v 封装到Entry对象，放入root
        * Entry<K,V> t = root;
        if (t == null) {
            compare(key, key); // type (and possibly null) check

            root = new Entry<>(key, value, null);
            size = 1;
            modCount++;
            return null;
        }
        * 2.2 以后添加，
        * Comparator<? super K> cpr = comparator;
        if (cpr != null) {
            do {//遍历所有的key。给当前key找到适合位置
                parent = t;
                //动态绑定到匿名内部类的compare（）
                cmp = cpr.compare(key, t.key);
                if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else //如果遍历过程中，发现准备添加key 和当前已有的key相等，就不添加
                    return t.setValue(value);
            } while (t != null);
        }
        *
        * */

    }
}
