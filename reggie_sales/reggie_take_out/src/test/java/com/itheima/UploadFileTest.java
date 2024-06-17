package com.itheima;

import org.junit.jupiter.api.Test;

/**
 * @author
 * @version 1.0
 * @date 2024/06/10 15:55
 * @description
 */
public class UploadFileTest {

    @Test
    public void test1(){
        String fileName = "filename.jcp";
        String substring = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(substring);
    }
}
