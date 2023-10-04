package com.javaTest.commonclass.stringbuffer_.exercise;

import java.util.Scanner;

public class StringBufferExercise02 {
    public static void main(String[] args) {

    /*
    输入商品名称和商品价格，要求打印效果示例, 使用前面学习的方法完成: 商品名 商品价格
    商品名称 商品价格
    手机 123,564.59 //比如 价格 3,456,789.88 要求:价格的小数点前面每三位用逗号隔开, 在输出。
    思路分析
    1. 定义一个 Scanner 对象，接收用户输入的 价格(String)
    2. 希望使用到 StringBuffer 的 insert ，需要将 String 转成 StringBuffer 3. 然后使用相关方法进行字符串的处理
    代码实现
    */
        printCom();


    }

    public static void printCom() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入商品名称：");
            String name = scanner.next();

            System.out.println("请输入商品价格：");
            String price = scanner.next();
            StringBuffer stringBuffer = new StringBuffer(price);
//        int index = stringBuffer.lastIndexOf(".");
//        stringBuffer.insert(index -3, ",");
            for (int i = stringBuffer.lastIndexOf(".") - 3; i > 0; i -= 3) {
                stringBuffer = stringBuffer.insert(i, ",");
            }
            System.out.println("商品名称\t商品价格\n" +
                    name +"\t"+ stringBuffer);
            count++;
        }while(count != 3);

    }

}

class Commodity {
    private String name;
    private double price;

    public Commodity(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "商品名称\t商品价格\n" +
                name +"\t"+ price ;
    }
}