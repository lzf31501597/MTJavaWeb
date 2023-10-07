package com.javaTest.collection14.list_;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //List list = new ArrayList();
        //List list = new LinkedList();
        List list = new Vector();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("while ():" + next);
        }

        for (Object o : list) {
            System.out.println("for ():" + o);
        }

        for (int i = 0; i < list.size(); i++) {
            Object next =  list.get(i);
            System.out.println("for (i):" + next);
        }
    }
}
