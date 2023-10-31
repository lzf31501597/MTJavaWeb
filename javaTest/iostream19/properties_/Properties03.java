package com.javaTest.iostream19.properties_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 15:05
 * @Description 使用 Properties类 读取mysql.properties文件
 */
public class Properties03 {
    public static void main(String[] args) throws IOException {
        //使用 Properties类 读取mysql.properties文件

        //1.创建Properties对象
        Properties properties = new Properties();

        //2.创建
        //1),该文件没有该key，则创建
        //2）、该文件有该key，则修改
        /* Properties 父类是 Hashtable, 底层是Hashtable核心方法

        public synchronized V put(K key, V value) {
        // Make sure the value is not null
        if (value == null) {
            throw new NullPointerException();
        }

        // Makes sure the key is not already in the hashtable.
        Entry<?,?> tab[] = table;
        int hash = key.hashCode();
        int index = (hash & 0x7FFFFFFF) % tab.length;
        @SuppressWarnings("unchecked")
        Entry<K,V> entry = (Entry<K,V>)tab[index];
        for(; entry != null ; entry = entry.next) {
            if ((entry.hash == hash) && entry.key.equals(key)) {
                V old = entry.value;
                entry.value = value;//2）、该文件有该key，则修改
                return old;
            }
        }

        addEntry(hash, key, value, index); //1),该文件没有该key，则创建
        return null;
        }*/
        properties.setProperty("charset", "utf-8");
        properties.setProperty("user", "汤姆");//保存汉字的unicode码
        properties.setProperty("pwd", "abc123");

        //3.根据key-value存储到文件
        properties.store(new FileOutputStream("./MTJavaWeb/src/com/javaTest/iostream19/properties_/mysql2.properties"), "hello world");
        System.out.println("保存文件成功。。。。。。" );


    }
}
