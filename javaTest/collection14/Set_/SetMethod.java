package com.javaTest.collection14.Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        //1. 以 Set 接口的实现类 HashSet 来讲解 Set 接口的方法
        //2. set 接口的实现类的对象(Set 接口对象), 不能存放重复的元素, 可以添加一个 null
        //3. set 接口对象存放数据是无序
        // HashSet不保证元素是有序的，取决于Hash后，再确定索引的结果。(即，不保证添加的顺序和取出的顺序一致)
        //4.不能有重复元素/对象。
        // 注意:取出的顺序虽然不是添加的顺序，但是它是固定.
        Set set = new HashSet();
        set.add("john");
        set.add("lucy");
        set.add("john");//重复
        set.add("jack");
        set.add("hsp");
        set.add("mary");
        set.add(null);//
        set.add(null);//再次添加 null
        for (int i = 0; i < 10; i++) {
            System.out.println("set=" + set);
        }

        //遍历
        //方式 1: 使用迭代器
        System.out.println("=====使用迭代器====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        set.remove(null);

        //方式 2: 增强 for System.out.println("=====增强 for====");
        for (Object o : set) {
            System.out.println("o=" + o);
        }
        //set 接口对象，不能通过索引来获取
    }
}
