package com.javaTest.collection14.list_;

import java.util.Vector;

public class Vector01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
    }
}
