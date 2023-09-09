package com.javaTest.interface_;

public class Interface01 {
    public static void main(String[] args) {

        Canera canera = new Canera();
        Phone phone = new Phone();

        Computer computer = new Computer();
        computer.working(phone);

        computer.working(canera);

    }
}
