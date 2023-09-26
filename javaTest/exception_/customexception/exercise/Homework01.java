package com.javaTest.exception_.customexception.exercise;

public class Homework01 {
    public static void main(String[] args) {

    }

    public int cal (int n1, int n2){
        try {
            return n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (Para e) {
            System.out.println(e.getMessage());
        }
    }
}
