package com.javaTest.iostream19.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }

    //delete ./javaFile/news2.txt
    @Test
    public void m1(){

        String filePath = "./javaFile/news2.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath +"文件已删除");
            }else {
                System.out.println(filePath +"文件删除失败");
            }
        }else {
            System.out.println("该文件不存在。。。。");
        }
    }

    // delete /javaFile/demo02
    @Test
    public void m2(){

        String filePath = "./javaFile/demo02";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath +"目录已删除");
            }else {
                System.out.println(filePath +"目录删除失败");
            }
        }else {
            System.out.println("该目录不存在。。。。");
        }
    }
    //delete ./javaFile/demo/a/b/c create ./javaFile/demo/a/b/c
    @Test
    public void m3(){

        String directoryPath = "./javaFile/demo03/a/b/c";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath +"该目录已存在。。。。");
        }else {
            //创建一级目录 mkdir()  多级目录 mkdirs()
            if (file.mkdirs()) {
                System.out.println(directoryPath +"目录创建成功");
            }else {
                System.out.println(directoryPath +"目录创建失败");
            }
        }
    }
}
