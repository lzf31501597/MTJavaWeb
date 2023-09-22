package com.javaTest.exception_.exercise;

public class TryCatchExercise03 {
    public static void main(String[] args) {
        System.out.println(method());//i=4, 3
    }
    public static int method(){
        int i = 1;
        try {
            i++;//2
            String[] names = new String[3];
            if (names[1].equals("tom")) {//空指针异常
                System.out.println(names[1]);
            }else{
                names[3] = "hspedu";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return ++i;//3  i=3 =>保存临时变量 temp=3；
        } finally {
            ++i;//4
            System.out.println("i=" + i);//4
        }
    }

}
