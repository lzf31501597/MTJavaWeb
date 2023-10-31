package com.javaTest.iostream19.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        //抽象类 ：输入流，输出流
        //字节流（8 bit）二进制文件：InputStream，OutputStream
        //字符流输入，输出（按字符）文本文件：Reader，Writer
    }

    //获取文件信息
    @Test
    public void info(){
        //先创建文件对象
        File file = new File("/Users/dreamtank77/IdeaProjects/javaFile/news1.txt");

        //调用相应的方法，得到对应的信息
        //getName(),getAbsolutePath(),getParent(),length(),exists(),isFile(),sDirectory()
        System.out.println("文件名=" + file.getName());
        System.out.println("文件绝对路径=" + file.getAbsolutePath());
        System.out.println("文件父级目录=" + file.getParent());
        System.out.println("文件大小（字节）=" + file.length());
        System.out.println("文件是否存在=" + file.exists());
        System.out.println("是不是一个文件=" + file.isFile());
        System.out.println("是不是一个目录=" + file.isDirectory());
    }
}
