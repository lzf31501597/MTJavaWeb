package com.javaTest.iostream19.reader_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 14:45
 * @Description
 */
public class FileReader01 {
    public static void main(String[] args) {
        //fileReader01();
        fileReader02();
    }

    public static void fileReader01(){
        String filePath = "../read.txt";
        FileReader fileReader = null;
        int readlen = 0;
        char[] buf = new char[8];

        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read(buf)，2）返回的是世界读取到的字符数
            //如果返回-1，说明文件读取结束

            while ((readlen = fileReader.read(buf)) != -1 ){
                System.out.print(new String(buf, 0, readlen));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void fileReader02() {
        String filePath = "../read.txt";
        FileReader fileReader = null;
        int data = 0;

        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read，1）单个读取字符数据

            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
