package com.javaTest.iostream19;

/**
 * @author
 * @version 1.0
 * @date 2023/10/28 17:05
 * @Description
 */
public class Test_ {
    public static void main(String[] args) {
        BufferedReader_ bufferedReader_ = new BufferedReader_(new FileReader_());
        //bufferedReader_.readFiles(10);
        //bufferedReader_.readFile();
        bufferedReader_.read();

        BufferedReader_ bufferedReader_2 = new BufferedReader_(new StringReader_());
        //bufferedReader_2.readStrings(10);
        bufferedReader_2.read();
    }
}
