package com.javaTest.iostream19.inputstream;


import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 11:52
 * @Description FileInputStream的使用（字节输入流 文件-->程序）
 */
public class FileInputStream01 {

    public static void main(String[] args) {
        readFile02();
    }

    /*
    read() 单字节的读取，效率较低
    * */
    @Test
    public void readFile01(){
        String filePath = "./javaFile/hello.txt";
        int readData = 0;
        //创建 FileInputStream对象，用于读取文件
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
            //数据的下一个字节，如果达到文件的末尾， -1 。
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print((char) readData);//转成字符显示
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();//关闭文件流，释放资源
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
    read(byte[] b)
    * */

    @Test
    public static void readFile02(){
        String filePath = "./javaFile/hello.txt";
        //字符数组
        byte[] bytes = new byte[8];
        int readlen = 0;
        //创建 FileInputStream对象，用于读取文件
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多b.length字节的数据到字节数组。 此方法将阻塞，直到某些输入可用。
            //如果读取完毕，返回-1
            //如果读取正常，返回实际读取的字节数
            while ((readlen = fileInputStream.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, readlen));//转成字符串显示
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
