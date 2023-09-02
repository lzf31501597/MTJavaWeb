package javaTest.houseRentSystem.utils;

public class TestUtility {
    public static void main(String[] args) {

        String str = Utility.readString(3);
        System.out.println("str=" + str);

        String s2 = Utility.readString(10,"hspedu");
        System.out.println("s2=" + s2);

        new Utility().toString();

    }
}
