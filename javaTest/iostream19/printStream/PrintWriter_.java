package com.javaTest.iostream19.printStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 14:41
 * @Description PrintWriter 使用方式
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        //PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter("./javaFile/f2.txt"));
        printWriter.println("北京，你好。。。。。。");
        printWriter.close();//flush+关闭流，文件就不会刷新，数据才会写入到文件
    }
}
