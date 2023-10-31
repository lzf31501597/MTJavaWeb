package com.javaTest.iostream19.homework;

import java.io.*;

/**
 * @author
 * @version 1.0
 * @date 2023/10/31 16:34
 * @Description
 */
public class HomeWork02 {
    public static void main(String[] args) {
        String filePath = "./javaFile/a.java";
        BufferedReader bufferedReader = null;
        try {
            //bufferedReader = new BufferedReader(new FileReader(filePath));
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "utf-8"));

            int num = 0;
            String readlen = "";
            while ((readlen = bufferedReader.readLine()) != null){
                System.out.println((++num)+" " + readlen);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
