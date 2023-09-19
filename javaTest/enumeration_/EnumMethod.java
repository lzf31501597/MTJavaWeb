package com.javaTest.enumeration_;

public class EnumMethod {
    public static void main(String[] args) {
        Season03  autumn = Season03.AUTUMN;
        System.out.println(autumn.name());//(1).输出枚举对象的名字:AUTUMN
        System.out.println(autumn.ordinal());//(2).输出该枚举对象的次序、编号，从0开始编号: 2

        //(3).从反编译结果中，可以看出values方法，返回Season03[]，含有所有定义的所有枚举对象
        Season03[] values = Season03.values();
        System.out.println("--------增强for循环，遍历取出枚举对象值---------");
        for (Season03 season03 : values) {//增强for循环
            System.out.println(season03);
        }

        //(4).valuesOf:将字符串转换成枚举对象，要求字符串必须VT为已有的常量名，否则报异常
        //执行流程：1、根据你输入的 “AUTUMN” 去到 Season03 的枚举对象去查找
        //  2、如果找到了，就返回；如果没有找到，就报错
        System.out.println("--------Season03.valueOf---------");
        Season03 autumn1 = Season03.valueOf("AUTUMN");
//        //No enum constant com.javaTest.enumeration.Season03.hsp
//        Season03 autumn1 = Season03.valueOf("hsp");
        System.out.println("autumn1=" + autumn1);
        System.out.println(autumn1 == autumn);

        //(5).compareTo:比较两个枚举对象的常量，就是比较编号
        //1、Season03.AUTUMN 枚举对象的编号【3】- Season03.SUMMER枚举对象的编号【2】，进行比较
        //2、看看结果为：1
        System.out.println("--------eason03.AUTUMN.compareTo(Season03.AUTUMN)---------");
        System.out.println(Season03.AUTUMN.compareTo(Season03.SUMMER));
        System.out.println(Season03.SUMMER.compareTo(Season03.AUTUMN));
    /*public final int compareTo(E o) {
        Enum<?> other = (Enum<?>)o;
        Enum<E> self = this;
        if (self.getClass() != other.getClass() && // optimization
            self.getDeclaringClass() != other.getDeclaringClass())
            throw new ClassCastException();
        return self.ordinal - other.ordinal;
    }Season03.AUTUMN 的编号【3】- Season03.SUMMER【2】= 1
    */

/*        //补充了一个增强for循环
        int[] nums = {1, 2, 9};
        //普通for循环
        System.out.println("--------普通for循环---------");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        System.out.println("--------增强for循环---------");
        for (int i : nums) { //执行流程：是依次从nums取值赋给i；如果取出完毕，则退出for循环
            System.out.println("i=" + i);
        }*/
    }
}
