package com.javaTest.commonclass13.stringbuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        //1.增
        s.append(',');// "hello,"
        s.append("张三丰");//"hello,张三丰"
        s.append("赵敏").append(100).append(true).append(10.5);//"hello,张三丰赵敏100true10.5"
        System.out.println(s);//"hello,张三丰赵敏100true10.5"

        //2.删
        /*
        *删除索引为 >= start && <end 处的字符 *解读:
                删除 11 ~14 的字符[11, 14)
        */
        s.delete(11, 14);
        System.out.println(s);//"hello,张三丰赵敏true10.5"

        //3.改
        //老韩解读，使用 周芷若 替换 索引 9-11 的字符 [9,11)
        s.replace(9, 11, "周芷若");
        System.out.println(s);//"hello,张三丰周芷若true10.5"

        // 查找指定的子串在字符串第一次出现的索引，如果找不到返回-1
        int indexOf = s.indexOf("张三丰");
        System.out.println(indexOf);//6

        //4.插
        //老韩解读，在索引为 9 的位置插入 "赵敏",原来索引为 9 的内容自动后移
        s.insert(9, "赵敏");
        System.out.println(s);//"hello,张三丰赵敏周芷若true10.5"

        //5.长度
        System.out.println(s.length());//22
        System.out.println(s);
    }
}
