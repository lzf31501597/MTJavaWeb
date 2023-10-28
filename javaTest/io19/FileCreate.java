package com.javaTest.io19;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }

    //new File(filePath);
    @Test
    public void create01(){
        //../是当前磁盘父目录， ./是项目路径里面
        String filePath = "./javaFile/news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //new File(File parent, String child);
    //根据父目录文件+子路径构建  javaFile/news2.txt
    @Test
    public void create02(){
        File parentFile = new File("/Users/dreamtank77/IdeaProjects/javaFile");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
