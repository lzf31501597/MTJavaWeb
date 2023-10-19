package com.javaTest.collection14.map_;

import java.util.Hashtable;

public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("john", 100);//ok
        //hashtable.put(null, 100);//异常 NullPointerExercise
        //hashtable.put("john", null);//异常 NullPointerExercise
        hashtable.put("lucy", 100);//ok
        hashtable.put("lic", 100);//ok
        hashtable.put("lic", 88);//替换
        hashtable.put("hello1", 1);
        hashtable.put("hello2", 1);
        hashtable.put("hello3", 1);
        hashtable.put("hello4", 1);
        hashtable.put("hello5", 1);
        hashtable.put("hello6", 1);
        System.out.println(hashtable);

        //1.底层有数组 Hashtable$Entry[] 初始化大小为11,扩容因子0.75
        //2.临界值 threshold 8 = 11*0.75
        //3。扩容：按照自己的扩容机制来进行即可
        //4。执行 addEntry(hash, key, value, index); 添加K-V封装到entry
        //5.当if if (count >= threshold) 满足时，就进行扩容
        //6.按照 int newCapacity = (oldCapacity << 1) + 1; 的大小扩容

    }
}
