package com.javaTest.iostream19.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 13:47
 * @Description FileOutputStream的使用（字节输入流 程序数据-->文件）
 */
public class FileOutputStream01 {
    public static void main(String[] args) {
        String filePath = "./javaFile/a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            //得到了FileOutputStream对象
            //1.FileOutputStream(File file) 创建文件输出流以写入由指定的 File对象表示的文件。
            // (会覆盖原来的内容)
            //2.FileOutputStream(File file, boolean append) 创建文件输出流以写入由指定的 File对象表示的文件。
            // （是追加到文件后面）
            //fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream = new FileOutputStream(filePath, true);
            //1.写入一个字节
            //fileOutputStream.write('H');

            //2.写入一个字符串
            String str = "hello，world";
            /*str.getBytes();//把字符串-》字节数组
            fileOutputStream.write(str.getBytes());*/

            //3.write(byte[] b,int off,int len) 从位于偏移量 off的指定字节数组写入 len字节到该文件输出流。
            fileOutputStream.write(str.getBytes(), 0, 3);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
