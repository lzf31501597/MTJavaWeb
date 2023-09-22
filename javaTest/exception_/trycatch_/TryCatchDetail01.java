package com.javaTest.exception_.trycatch_;

public class TryCatchDetail01 {
    public static void main(String[] args) {
        //ctrl + atl + t
        //1. 如果异常发生了，则异常发生后面的代码不会执行，直接进入到 catch 块
        //2. 如果异常没有发生，则顺序执行 try 的代码块，不会进入到 catch
        //3. 如果希望不管是否发生异常，都执行某段代码(比如关闭连接，释放资源等)则使用如下代码- finally
        try {
            String str = "123";
            String str1 = "aaaaa";
            int a = Integer.parseInt(str1);//异常信息:For input string: "aaaaa"
            System.out.println("shuzi:" + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息:" + e.getMessage());
        } finally {
            System.out.println("finally代码块。。。。。。。。");
        }

        System.out.println("程序继续。。。。。。。");
    }
}
