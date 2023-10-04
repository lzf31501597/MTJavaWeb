package com.javaTest.commonclass.stringbuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
        /**
         * public final class StringBuffer
            extends AbstractStringBuilder
            implements Serializable, CharSequence*/
        //1. StringBuffer 的直接父类 是 AbstractStringBuilder
        //2. StringBuffer 实现了 Serializable, 即 StringBuffer 的对象可以串行化
        //3. 在父类中 AbstractStringBuilder 有属性 char[] value,不是 final
        // 该 value 数组存放 字符串内容，引出存放在堆中的
        //4. StringBuffer 是一个 final 类，不能被继承
        //5. 因为 StringBuffer 字符内容是存在 char[] value, 所有在变化(增加/删除)
        // 不用每次都更换地址(即不是每次创建新对象)， 所以效率高于 String（String 保存的是字符串常量，
        // 里面的值不能更改，每次String类的更新：实际上就是更改地址，效率较低、private final char value【】；）
        StringBuffer stringBuffer = new StringBuffer("hello");



    }
}
