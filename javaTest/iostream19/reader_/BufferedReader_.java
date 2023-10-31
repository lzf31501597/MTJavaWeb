package com.javaTest.iostream19.reader_;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 17:32
 * @Description  BufferedReader的使用
 */
public class BufferedReader_ {
    public static void main(String[] args) {

        String filePath = "./javaFile/a.java";
        //创建 BufferedReader 对象
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            //读取
            String line; //按行读取，效率高
            //1.bufferedReader.readLine(); 按行读取
            //2.如果已达到流的末尾，则为null
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流，这里只需要关闭 ，BufferedReader
            //因为底层会自动的去关闭 节点流 FileReader
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            /*
            * public void close() throws IOException {
        synchronized (lock) {
            if (in == null)
                return;
            try {
                in.close(); //in就是我们传入的 new FileReader(filePath)
            } finally {
                in = null;
                cb = null;
            }* */
        }
    }
}
