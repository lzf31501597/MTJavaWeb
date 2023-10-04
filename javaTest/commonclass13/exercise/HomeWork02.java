package com.javaTest.commonclass13.exercise;

public class HomeWork02 {
    public static void main(String[] args) {
        String name = "simith";
        String pwd = "123456";
        String email = "yahoo@yahoo.com";
        try {
            userRegister(name, pwd, email);
            System.out.println("注册成功。。。。。");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String pwd, String email){

        if ( !(name != null && pwd != null && email != null) ) {
            throw new RuntimeException("各参数不能为空！！！");
        }

        if ( !(name.length() >= 2 && name.length() <= 6) ) {
            throw new RuntimeException("用户名长度为2--4！！！");
        }

        if ( !(pwd.length() == 6 && isDigital(pwd)) ) {
            throw new RuntimeException("密码长度为6，要求全是数字！！！");
        }

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if ( !(i > 0 && j > i) ) {
            throw new RuntimeException("邮箱中包含@和.，并且@在.的前面！！！");
        }


    }

    public static boolean isDigital(String pwd){
        char[] str = pwd.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] < '0' || str[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
