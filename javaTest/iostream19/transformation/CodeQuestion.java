package com.javaTest.iostream19.transformation;

import java.io.*;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 13:32
 * @Description 中文乱码
 */
public class CodeQuestion {
    public static void main(String[] args) {
        //1.创建字符输入流 BufferedReader [处理流]
        //2.使用BufferedReader 对象读取  a.txt
        //3.默认情况下，读取文件时按照utf-8编码
        String filePath = "./javaFile/a.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            String s = br.readLine();
            System.out.println("读取的内容：" + s);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //InputStreamReader
        //OutputStreamWriter
    }
}
