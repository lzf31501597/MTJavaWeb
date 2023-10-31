package com.javaTest.iostream19.properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 14:53
 * @Description
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties文件，并得到IP，user和pwd
        BufferedReader br = new BufferedReader(new FileReader("/Users/dreamtank77/IdeaProjects/MTJavaWeb/src/com/javaTest/iostream19/properties_/mysql.properties"));
        String line = "";
        while ((line = br.readLine()) != null){
            String[] split = line.split("=");
            System.out.println(split[0] + "值是：" + split[1]);
        }

        br.close();
    }
}
