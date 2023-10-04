package com.javaTest.commonclass13.Arrays_;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 90, 234, 456};
        //一、 binarySearch 通过二分搜索法进行查找，要求必须排好
        //1. 使用 binarySearch 二叉查找
        //2. 要求该数组是有序的. 如果该数组是无序的，不能使用 binarySearch
        //3. 如果数组中不存在该元素，就返回 return -(low + 1); // key not found.
        int index = Arrays.binarySearch(arr, 666);
        System.out.println("index=" + index);

        //二、copyOf 数组元素的复制
        //1. 从 arr 数组中，拷贝 arr.length 个元素到 newArr 数组中
        // 2. 如果拷贝的长度 > arr.length 就在新数组的后面 增加 null
        // 3. 如果拷贝长度 < 0 就抛出异常 NegativeArraySizeException
        // 4. 该方法的底层使用的是 System.arraycopy()
        Integer[] newArr = Arrays.copyOf(arr, 7);
        System.out.println("---拷贝执行完毕后---");
        System.out.println(Arrays.toString(newArr));

        //三、ill 数组元素的填充
        Integer[] num = new Integer[]{9,3,2};
        //1. 使用 99 去填充 num 数组，（可以理解成是替换原理的元素）
        Arrays.fill(num, 99);
        System.out.println("---数组元素的填充执行完毕后---");
        System.out.println(Arrays.toString(num));

        //四、equals 比较两个数组元素内容是否完全一致
        Integer[] arr2 = {1, 2, 90, 123};
        //1. 如果 arr 和 arr2 数组的元素一样，则方法 true;
        // 2. 如果不是完全一样，就返回 false
        boolean equals = Arrays.equals(arr, arr2);
        System.out.println("equals=" + equals);

        //五、asList 将一组值，转换成 list
        //1. asList 方法，会将 (2,3,4,5,6,1)数据转成一个 List 集合
        //2. 返回的 asList 编译类型 List(接口)
        //3. asList 运行类型 java.util.Arrays#ArrayList, 是 Arrays 类的
        // 静态内部类 private static class ArrayList<E> extends AbstractList<E>
        // implements RandomAccess, java.io.Serializable
        List asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println("asList=" + asList);
        System.out.println("asList 的运行类型" + asList.getClass());
    }
}
