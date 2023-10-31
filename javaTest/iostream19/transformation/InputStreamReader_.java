package com.javaTest.iostream19.transformation;

import java.io.*;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 13:53
 * @Description InputStreamReader 转换流解决中文乱码问题
 * 将字节流 FileInputStream 转成字节流
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filePath = "./javaFile/a.txt";
        //1. 把 FileInputStream 转成 InputStreamReader
        //2.指定编码gbk
        //InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath),"GBK");
        //3.把 InputStreamReader传入 BufferedReader
        //BufferedReader br = new BufferedReader(isr);

        //将2 和 3结合
        BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(filePath),"gbk"));

        //4.读取
        String s = br.readLine();
        System.out.println("读取的内容是：" + s);
        //5.关闭外层流
        br.close();
    }
}
