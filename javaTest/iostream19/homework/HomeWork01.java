package com.javaTest.iostream19.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 16:09
 * @Description
 */
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        String directoryPath = "./javaFile/mytemp/";

        File file = new File(directoryPath);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("创建" + directoryPath + "成功");
            } else {
                System.out.println(directoryPath + "文件夹创建失败。。。。");
            }
        }

        String filePath = directoryPath + "hello.txt";
        file = new File(filePath);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println(filePath + "文件创建成功。。。");
                //如果文件存在，我们使用
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello world..HSPedu");
                bufferedWriter.close();
            }else {
                System.out.println(filePath + "文件创建失败。。。");
            }
        }else {
            System.out.println(filePath + "文件已存在,不需要创建。。。。");
        }
    }
}
