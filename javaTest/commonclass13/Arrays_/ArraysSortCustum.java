package com.javaTest.commonclass13.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustum {
    public static void main(String[] args) {
        int[] arr = {1, -1, 8, 0, 89};
        System.out.println("--------bubble01(arr)-----------");
        //bubble01(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println("--------bubble02(arr)-----------");
        bubble02(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }


    //使用冒泡完成排序
    public static void bubble01(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length - 1 - i; i1++) {
                if (arr[i1] > arr[i1 + 1]) {
                    temp = arr[i1];
                    arr[i1] = arr[i1 + 1];
                    arr[i1 + 1] = temp;

                }
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
    }

    //结合冒泡 + 定制 完成排序
    public static void bubble02(int[] arr, Comparator c) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length - 1 - i; i1++) {
                if (c.compare(arr[i1],arr[i1+1])>0) {
                    temp = arr[i1];
                    arr[i1] = arr[i1 + 1];
                    arr[i1 + 1] = temp;

                }
            }
        }


    }
}
