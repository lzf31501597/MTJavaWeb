package com.javaTest.commonclass13.Arrays_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] integers = {1,6,3,9,4,8,5};
        //遍历数组
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]+ "\t");
        }
        //Arrays.toString(integers) 显示数组
        System.out.println("\n" + Arrays.toString(integers));

        Integer arr[] = {1, -1, 7, 0, 89};
        //1. 可以直接使用冒泡排序 , 也可以直接使用 Arrays 提供的 sort 方法排序
        //2. 因为数组是引用类型，所以通过 sort 排序后，会直接影响到 实参 arr
        //3. sort 重载的，也可以通过传入一个接口 Comparator 实现定制排序
        //4. 调用 定制排序 时，传入两个参数 (1) 排序的数组 arr
            // (2) 实现了 Comparator 接口的匿名内部类 , 要求实现 compare 方法
        //5. 先演示效果，再解释
        //6. 这里体现了接口编程的方式 , 看看源码，就明白
        // 源码分析
        //(1) Arrays.sort(arr, new Comparator()
        //(2) 最终到 TimSort 类的 private static <T> void binarySort(T[] a, int lo, int hi, int start,
        // Comparator<? super T> c)()
        //(3) 执行到 binarySort 方法的代码, 会根据动态绑定机制 c.compare()执行我们传入的
        //匿名内部类 compare（）
        //while (left < right) {
        //                int mid = (left + right) >>> 1;
        //                if (c.compare(pivot, a[mid]) < 0)
        //                    right = mid;
        //                else
        //                    left = mid + 1;
        //            }

        //(4) new Comparator() {
        //            @Override
        //            public int compare(Object o1, Object o2) {
        //                Integer i1 = (Integer) o1;
        //                Integer i2 = (Integer) o2;
        //                //return i1 - i2;//从小到大排序
        //                return i2 - i1;//从大到小排序
        //            }
        //        }
        //(5) public int compare(Object o1, Object o2) 返回的值>0 还是 <0
        // 会影响整个排序结果, 这就充分体现了 接口编程+动态绑定+匿名内部类的综合使用
        // 将来的底层框架和源码的使用方式，会非常常见
        Arrays.sort(arr);//默认排序
        System.out.println(Arrays.toString(arr));
        System.out.println("======默认排序后=====");
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        //定制排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                //return i1 - i2;//从小到大排序
                return i2 - i1;//从大到小排序
            }
        });

        System.out.println("======定制排序后=====");
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
}
