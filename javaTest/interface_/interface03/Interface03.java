package com.javaTest.interface_.interface03;

public class Interface03 {
    public static void main(String[] args) {
        DB2 db2 = new DB2();
        db2.connect();
        db2.close();

        MySql mySql = new MySql();
        mySql.connect();
        mySql.close();

        Oracle oracle = new Oracle();
        oracle.connect();
        oracle.close();

    }
}
