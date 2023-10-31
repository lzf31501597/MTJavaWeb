package com.javaTest.iostream19.writer_;

import java.io.*;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 17:51
 * @Description BufferedWriter的使用
 */
public class BufferedWriter_ {
    public static void main(String[] args) {
        String filePath = "./javaFile/ok.txt";
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        //创建BufferedWriter对象
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath, true));
            bufferedWriter.write("hello, 韩顺平教育！！！！！！！");
            bufferedWriter.newLine();//插入一个和系统相关的换行
            bufferedWriter.write("hello2, 韩顺平教育！！！！！！！");
            bufferedWriter.newLine();
            bufferedWriter.write("hello3, 韩顺平教育！！！！！！！");
            bufferedWriter.newLine();

            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine() ) != null){
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
