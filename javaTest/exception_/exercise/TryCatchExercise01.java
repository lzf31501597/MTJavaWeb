package com.javaTest.exception_.exercise;

public class TryCatchExercise01 {
    public static void main(String[] args) {
        System.out.println(method()); //4
    }
    public static int method(){
        try {
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
            return 3;
        } finally {
            return 4;
        }
    }
}
