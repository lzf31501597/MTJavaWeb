package com.javaTest.iostream19.standard_;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 13:23
 * @Description
 */
public class InputAndOutput {
    public static void main(String[] args) {
        //System.in 类 public final static InputStream in = null;
        //System in 编译类型 InputStream
        //System in 运行类型 BufferedInputStream
        //表示标准输入 键盘

        System.out.println(System.in.getClass());

        //System.out 类 public final static PrintStream out = null;
        //System in 编译类型 PrintStream
        //System in 运行类型 PrintStream
        //表示标准输出 显示器
        System.out.println(System.out.getClass());
    }
}
