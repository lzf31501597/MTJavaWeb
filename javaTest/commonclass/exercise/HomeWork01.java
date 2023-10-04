package com.javaTest.commonclass.exercise;

public class HomeWork01 {
    public static void main(String[] args) {
        //1.将字符串中指定部分进行反转。比如将“abcdef” 反转为“aedcbf”
        //2.编写方法public static String reverse(String str, int start, int end)
        String str = "abcdef";
        System.out.println("转换前。。。。。：" + str);
        int start = 1;
        int end = str.length()-2;
        System.out.println("转换后。。。。。：" + reverse(str, start, end));

    }
    public static String reverse(String str, int start, int end){
//        String str1 = null;
//        String str2 = str.substring(start,end);
//        System.out.println(str2);

        char[] charArr = str.toCharArray();
        char temp = ' ';
        for (int i = start,j=end; i < j; i++,j--) {
            temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
        }
        return new String(charArr);
    }
}
