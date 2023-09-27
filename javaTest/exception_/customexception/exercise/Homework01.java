package com.javaTest.exception_.customexception.exercise;

public class Homework01 {
    public static void main(String[] args) {
        try {
            if(args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = cal(n1, n2);
            System.out.println("计算结果是：" + res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确，需要输出整数。。。");
        } catch (ArithmeticException e){
            System.out.println("出现了除0的异常。。。。");
        }


    }

    public static int cal(int n1, int n2){
//        int num = 0;
//        try {
//            num =  n1 / n2;
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println(e.getMessage());
//        }
//        return num;
        return n1 / n2;
    }

    public static void ecmDef(){
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个除数：");
        String str1 = scanner.next();
        int n1 = Integer.parseInt(str1);
        System.out.println("请输入一个被除数：");
        String str2 = scanner.next();
        int n2 = Integer.parseInt(str2);
        System.out.println(cal(n1, n2));*/
    }
}
