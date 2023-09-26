package com.javaTest.exception_.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("./aa.txt");
    }

    public static void readFile(String file) throws FileNotFoundException,NullPointerException,NumberFormatException,ArithmeticException,ArrayIndexOutOfBoundsException{
        FileInputStream fileInputStream = new FileInputStream("./aa.txt");
    }
}
