package com.javaTest.iostream19.outputstream;

import java.io.*;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 18:02
 * @Description  演示使用 BufferedInputStream 和BufferedOutputStream，可以完成二进制文件拷贝，
 *              字节流可以操作二进制文件，也可以操作文本文件吗？
 */
public class BufferedCopy02 {
    public static void main(String[] args) {
        /*String srcFilePath = "../bg.png";
        String destFilePath = "./javaFile/bg2.png";*/
        String srcFilePath = "../2_扫描文稿.pdf";
        String destFilePath = "./javaFile/2_扫描文稿.pdf";

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;


        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFilePath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //readline() 读取一行数据后，但没有换行
            byte[] buff = new byte[1024];
            int readLen =0;
            while ((readLen = bufferedInputStream.read()) != -1){
                //每读取一行就写入
                bufferedOutputStream.write(buff, 0, readLen);

            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();                }
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
