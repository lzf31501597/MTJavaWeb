package com.javaTest.iostream19.transformation;

import java.io.*;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 14:07
 * @Description 把FileOutputStream字节流 转换字节流 OutputStreamWriter
 * 指定处理的编码  GBK、UTF-8、UTF8
 */
public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {
        String filePath = "./javaFile/a.txt";
        String charset = "gbk";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), charset);
        osw.write("hi, 韩顺平EDU");
        osw.close();
        System.out.println("按照" + charset + "保存文件成功");

        //PrintStream
        //PrintWriter
    }
}
