package com.javaTest.collection14.Set_;

public class SetStructure {
    public static void main(String[] args) {
        //1.创建一个数组Node【】，存放数据
        //2.直接称Node【】数组称为表
        Node[] nodes = new Node[16];
        System.out.println(nodes);

        //创建节点
        Node john = new Node("john", null);
        System.out.println(nodes);

        nodes[2] = john;
        Node jack = new Node("jack", null);
        john.next = jack;
        System.out.println(nodes);
        Node rose = new Node("Rose", null);
        jack.next = rose;
        System.out.println(nodes);


    }
}
class Node {
    Object item;//存放数据
    Node next;//指向下一个节点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}