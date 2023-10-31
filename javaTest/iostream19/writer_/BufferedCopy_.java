package com.javaTest.iostream19.writer_;

import java.io.*;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 18:02
 * @Description
 */
public class BufferedCopy_ {
    public static void main(String[] args) {
        String srcFilePath = "./javaFile/a.java";
        String destFilePath = "./javaFile/a2.java";


        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line;

        try {
            bufferedReader = new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter = new BufferedWriter(new FileWriter(destFilePath));

            //readline() 读取一行数据后，但没有换行
            while ((line = bufferedReader.readLine()) != null){
                //每读取一行就写入
                bufferedWriter.write(line);
                //插入读取的一行数据，就换行
                bufferedWriter.newLine();
                //System.out.println(line);
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {


                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
