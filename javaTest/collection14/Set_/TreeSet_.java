package com.javaTest.collection14.Set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        /*
        * //1. 当我们使用无参构造器，创建 TreeSet 时，仍然是无序的
        //2. 老师希望添加的元素，按照字符串大小来排序
        //3. 使用 TreeSet 提供的一个构造器，可以传入一个比较器(匿名内部类)
        // 并指定排序规则
        //4. 简单看看源码
        *   1）、把构造器传进来的 比较器对象comparator ，赋值给了TreeMap属性this.comparator
            * public TreeMap(Comparator<? super K> comparator) {
            this.comparator = comparator;
            }
            2）、调用treeSet.add("tom");，在底层会执行到TreeMap
            int cmp;
            Entry<K,V> parent;
            // split comparator and comparable paths
            Comparator<? super K> cpr = comparator; //cpr是匿名内部类
            if (cpr != null) {
                do {
                    parent = t;
                    //动态绑定匿名内部类（对象）compare
                    cmp = cpr.compare(key, t.key);
                    if (cmp < 0)
                        t = t.left;
                    else if (cmp > 0)
                        t = t.right;
                    else //如果相等，即返回 0,这个 Key 就没有加入
                        return t.setValue(value);
                } while (t != null);
            }

        * */
        //TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //String的compareTo（）对字符串大小进行比较
                //return ((String) o1).compareTo((String) o2); //从小到大
                //return ((String) o2).compareTo((String) o1); //从大到小
                return ((String) o2).length() - ((String) o1).length();
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");
        treeSet.add("abc");

        System.out.println(treeSet);
    }
}
