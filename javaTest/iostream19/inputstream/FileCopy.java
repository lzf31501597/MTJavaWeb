package com.javaTest.iostream19.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 14:14
 * @Description
 */
public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝 ../WechatIMG1.jpeg   ./javaFile/
        //1.创建文件的输入流，将文件读入道程序
        //2.创建文件的输出流，将读取到的文件数据，写入到指定文件
        String srcFilePath = "../bg.png";
        String destFilePath = "./javaFile/bg.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcFilePath);
            fileOutputStream = new FileOutputStream(destFilePath);

            byte[] buf = new byte[1024];
            int readlen = 0;
            while ((readlen = fileInputStream.read(buf)) != -1){
                //读取到文件后，就写入到文件 通过 FileOutputStream ；即，是一边读一边写
                fileOutputStream.write(buf);
            }
            System.out.println("copy is ko");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭文件输入流，释放资源
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                //关闭文件输出流，释放资源
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
