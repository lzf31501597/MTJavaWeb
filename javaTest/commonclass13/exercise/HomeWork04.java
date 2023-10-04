package com.javaTest.commonclass13.exercise;

public class HomeWork04 {
    public static void main(String[] args) {
        judgements("AH1a2d3sf4dA5D6AD7a8ad!#$%&&");
    }
    public static void judgements(String str){
        char[] chars = str.toCharArray();
        int l = 0;
        int j = 0;
        int k = 0;
        int m = 0;
//        char[] az = null;
//        char[] aaz = null;
//        char[] a09 = null;
//        char[] other = null;

        if (str == null) {
            System.out.println("字符串不能为空。。。");
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            try {
                if (chars[i] >= 'a' && chars[i] <= 'z') {
                    j++;
//                    az = new char[++j];
//                    az[j] = chars[i];


                }else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    k++;
//                    aaz = new char[++k];
//                    aaz[k] = chars[i];


                }else if (chars[i] >= '0' && chars[i] <= '9') {
                    l++;
//                    a09 = new char[++l];
//                    a09[l] = chars[i];


                }else {
                    m++;
//                    other = new char[++m];
//                    other[m] = chars[i];
                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
//        System.out.println("a-z的个数：" + j + " ,az[j]=" + az.length);
//        System.out.println("A-Z的个数：" + k + " ,az[j]=" + aaz.length);
//        System.out.println("0-9的个数：" + l + " ,az[j]=" + a09.length);
//        System.out.println("other的个数：" + m + " ,other[j]=" + other.length);
        System.out.println("a-z的个数：" + j);
        System.out.println("A-Z的个数：" + k);
        System.out.println("0-9的个数：" + l);
        System.out.println("other的个数：" + m);

    }
}
