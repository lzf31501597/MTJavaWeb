package com.javaTest.collection14.list_;

public class LinkedList01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node simith = new Node("simith");

        //双向链表
        jack.next = tom;
        tom.next = simith;

        simith.pre = tom;
        tom.pre = jack;

//        Node first = jack;
//        Node last = simith;
//
//        //从头到尾进行遍历
//        while (true){
//            if (first == null) {
//                break;
//            }
//            System.out.println(first);
//            first = first.next;
//        }
//        //从尾到头进行遍历
//        while (true){
//            if (last == null) {
//                break;
//            }
//            System.out.println(last);
//            last = last.pre;
//        }

        //扩充节点 "hsp"
        Node hsp = new Node("hsp");
        hsp.next = simith;
        hsp.pre = tom;
        tom.next = hsp;
        simith.pre = hsp;

        Node first = jack;
        Node last = simith;
        //从头到尾进行遍历
        while (true){
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        //从尾到头进行遍历
        while (true){
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }


    }
}
class Node{
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "item=" + item ;
    }
}